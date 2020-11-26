/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.ecore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.ta.extension.TargetApplicationExtensionManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AnnotatableElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Annotation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Detail;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Parameter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.utils.EcoreElementsUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.utils.ReverseUtil;

/**
 * @author Boubekeur Zendagui
 */

public class ReverseFromEcoreEngine {
	// This map must be moved to a singleton object to manage reverse based on more then one ecore model
	private static final EPackage.Registry REGISTRY = new EPackageRegistryImpl(EPackage.Registry.INSTANCE);
	private static final String EMDE_ANNOTATION_1 = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint";
	private static final String EMDE_ANNOTATION_2 ="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping";
	
	private Map<EClass, Class> reverseClassesMapping_ = new HashMap<>();
	private Map<EEnum, Enumeration> reverseEnumerationsMapping_ = new HashMap<>();
	private Map<EModelElement, AnnotatableElement> annotationElementMapping_ = new HashMap<>();

	private boolean flattenEPackages;
	private boolean addSeperator;
	private ConflictingNameResloveStrategy nameConflictResolveStrategy;
	
	// One ecore model dependent reverse engine instance properties 
	private EPackage ePackage ;
	private Viewpoint viewpoint;
	private IProgressMonitor monitor;
	
	private final List<EPackage> targetApplicationEPackages = new ArrayList<>();
	private static final String ECORE_NSURI_PATTERN = "http://www.eclipse.org/emf/\\d{4}/Ecore";
	private static final String EMDE_NSURI_PATTERN = "http://www.polarsys.org/kitalpha/emde/(\\d+(\\.\\d+(\\.\\d+)))";
	
	private List<EClassifier> eClassifiersToReverse;
	
	/**
	 * This method do reverse steps :
	 * 		Step 0: Generate Enumeration
	 * 		Step 1: Generate Classes and their attributes from the EClass
	 * 		Step 2: Handle :
	 * 				a- Inheritances relationships
	 * 				b- Generate Classes Associations from each EClass
	 * 				c- Generate Operations from each EClass
	 * 				d- Generate Attributes
	 * 		Step 3. Reverse All annotation.
	 * 		Step 4: Save the VPSpec resource
	 * 
	 * @param ePackage : The root EPackage of the corresponding ecore 
	 * @param viewpoint : the Root element of the vpdesc model
	 * @return True if the reverse is done with success.
	 * @throws IOException 
	 */
	public boolean reverse(EPackage ePackage, Viewpoint viewpoint, IProgressMonitor monitor) throws IOException{
		this.ePackage = ePackage;
		this.viewpoint = viewpoint;
		this.monitor = monitor;
		loadTargetApplicationEPackages();
		
		initEClassifiersToReverse(this.ePackage);
		
		int stepCount = reversibleElementCount() + 10;
		monitor.beginTask("Reverse from Ecore model", stepCount);
		
		// Register data to reverse Annotation
		registerToReverseAnnotation(ePackage, viewpoint.getVP_Data());
		
		// Step 0. Reverse Enumeration
		reverseEnumeration();
		
		// Step 1: Reverse elements reverses classes an their attributes.
		reverseClasses();
		
		// Step 2: Reverse all classes relationships.
		reverseClassesContent();
		
		// step 3. Reverse All annotation.
		reverseAllAnnotations();
		
		// step 4: Save the resource.
		saveResource();
		
		monitor.done();

		return true;
	}
	
	private void initEClassifiersToReverse(EPackage ePackage){
		if (eClassifiersToReverse == null)
			eClassifiersToReverse = new UniqueEList<>();
		else
			eClassifiersToReverse.clear();
		
		collectEClassifiers(ePackage);
	}
	
	/**
	 * Return all EClassifier available in the package and it sub packages
	 * @param ePackage the package containing EClassifiers
	 * @return a {@link List} of {@link EClassifier}
	 */
	private void collectEClassifiers(EPackage ePackage){
		final EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
		if (! eClassifiers.isEmpty())
		{
			if (eClassifiersToReverse.isEmpty())
				eClassifiersToReverse.addAll(eClassifiers);
			else
			{
				for (EClassifier eClassifier : eClassifiers) 
				{
					// Check if there is a EClassifier having the same name as the current EClassifier
					for (EClassifier eClassifier2 : eClassifiersToReverse) 
					{
						if (eClassifier.getName().equalsIgnoreCase(eClassifier2.getName()))
						{// This means that there is an EClassifier having the same name
							String newEClassifierName = getNewEClassifierName(eClassifier);
							eClassifier.setName(newEClassifierName);
							break;
						}
					}
					eClassifiersToReverse.add(eClassifier);
				}
			}
		}
		
		if (this.flattenEPackages)
		{
			final EList<EPackage> eSubpackages = ePackage.getESubpackages();
			if (! eSubpackages.isEmpty())
			{
				for (EPackage subEPackage : eSubpackages) 
				{
					collectEClassifiers(subEPackage);
				}
			}
		}
	}
	
	private String getNewEClassifierName(EClassifier eClassifier){
		final String ePackageName = eClassifier.getEPackage().getName();
		final String oldEClassfierName = eClassifier.getName();
		
		String newEClassifierName = oldEClassfierName;
		
		switch (nameConflictResolveStrategy) {
		case PrefixByEPackageName:
			newEClassifierName = ePackageName + (this.addSeperator ? "_" : "") + oldEClassfierName;
			break;
			
		case SufixByEPackageName:
			newEClassifierName = oldEClassfierName + (this.addSeperator ? "_" : "") + ePackageName;
			break;

		case PrefixByIncrementalValue:
			// TODO: to implement
			break;
		
		case SufixByIncrementalValue:
			// TODO: to implement
			break;
		case None:
			break;
		}
		return newEClassifierName;
	}
	
	/**
	 * Reverse Step 0.
	 */
	private void reverseEnumeration(){
		for (EClassifier eClassifier : eClassifiersToReverse/*ePackage.getEClassifiers()*/) 
		{
			if (eClassifier instanceof EEnum)
			{
				// Gather informations from EEnum 
				EEnum eEnum = (EEnum) eClassifier;
				String enumName = eEnum.getName();
				monitorProgress(enumName +" (EEnum)");
				// Create VP Enumeration
				Enumeration enumeration = VpdescFactory.eINSTANCE.createEnumeration();
				enumeration.setName(enumName);
				// Add the generated Enumeration to the Viewpoint data
				viewpoint.getVP_Data().getVP_Enumerations().add(enumeration);
				// Reverse enumeration literals
				for (EEnumLiteral eLiteral : eEnum.getELiterals()) 
				{
					Value value = VpdescFactory.eINSTANCE.createValue();
					value.setLiteral(eLiteral.getLiteral());
					value.setName(eLiteral.getName());
					enumeration.getOwnedValues().add(value);
				}
				
				// Register classes in the Map
				addEnumerationMapEntry(eEnum, enumeration);
				
				// Register the enumeration to reverse it annotations
				registerToReverseAnnotation(eEnum, enumeration);
			}
		}
	}
	
	/**
	 * Reverse Step 1.
	 */
	private void reverseClasses(){
		for (EClassifier eClassifier : eClassifiersToReverse/*ePackage.getEClassifiers()*/) 
		{
			if (eClassifier instanceof EClass)
			{
				// Gather informations from EClass 
				EClass eClass = (EClass) eClassifier;
				String className = eClass.getName();
				monitorProgress(className +" (EClass)");
				boolean isAbstract = eClass.isAbstract();
				// Create VP Class
				Class clazz = VpdescFactory.eINSTANCE.createClass();
				clazz.setName(className);
				clazz.setAbstract(isAbstract);
				// Add the generated Class to the Viewpoint data
				viewpoint.getVP_Data().getVP_Classes().add(clazz);
				// Register classes in the Map
				addClassMapEntry(eClass, clazz);
				// Generate eMDE extensions
				reverseeMDEExtension(eClass, clazz);
				// Register the class to reverse it annotations
				registerToReverseAnnotation(eClass, clazz);
			}
		}
	}
	
	/**
	 * Reverse Step 2.
	 * Reverse all class relationships {Inheritance and Association}, Operations
	 */
	private void reverseClassesContent(){
		for (EClassifier eClassifier : eClassifiersToReverse/*ePackage.getEClassifiers()*/) 
		{
			if (eClassifier instanceof EClass)
			{
				EClass eClass = (EClass) eClassifier;
				Class vpClass = reverseClassesMapping_.get(eClass);
				// Reverse Inheritance
				reverseInheritanceRelationships(vpClass, eClass);
				// Reverse Associations 
				reverseAssociationsRelationships(vpClass, eClass);
				// Reverse EOperations
				reverseOperations(vpClass, eClass);
				// Reverse Attributes
				reverseAttributes(vpClass, eClass);
			}
		}
	}
	
	/**
	 * Reverse Step 3: Reverse all annotation
	 */
	
	private void reverseAllAnnotations(){
		for (Map.Entry<EModelElement, AnnotatableElement> iEntry : annotationElementMapping_.entrySet()) 
		{
			EModelElement eElement = iEntry.getKey();
			AnnotatableElement vpElement = iEntry.getValue();
			reverseAnnotation(vpElement, eElement);
		}
	}
	
	/**
	 * Reverse Step 4: Save resource
	 */
	private void saveResource() throws IOException{
		viewpoint.eResource().save(Collections.emptyMap());
	}
	
	/**
	 * This transforms eMDE EAnnotation to vpdsl extends link   
	 * @param eClass
	 * @param vpClass
	 */
	private void reverseeMDEExtension(EClass eClass, Class vpClass){
		EAnnotation annotation = eClass.getEAnnotation(EMDE_ANNOTATION_1);
		if (annotation != null) 
		{
			String value = annotation.getDetails().get("ExtendedElement");
			for (String val : value.trim().split("\\s"))
			{
				URI uri = URI.createURI(val);
				String fragment = uri.fragment();
				if (fragment.startsWith("//"))
				{
					fragment = fragment.substring(2);
				}
				uri = uri.trimFragment();
				EPackage ePackage = REGISTRY.getEPackage(uri.toString());
				if (ePackage != null) 
				{
					EClassifier eClassifier = ePackage.getEClassifier(fragment);
					if (eClassifier != null) 
					{
						EClass taEClass = EcoreElementsUtil.transformEClassToNsUriEClass((EClass)eClassifier);
						
						vpClass.getExtends().add(taEClass);
					}
				}
			}
		}
	}
	
	/**
	 * This method check if a type is local or external.
	 * - Local type is an EEnum/EClass defined in the current ecore model
	 * - External type is any generic EDataType (EInt, EString, ...) or an EEnum/EClass defined in an other ecore model
	 * 
	 * @param eAttribute : The current EAttribute for which a vp attribute will be generated
	 * @param eClassifier : The type of the current EAttribute
	 * @return
	 */
	private boolean isLocalEType(ENamedElement eAttribute, EClassifier eClassifier){
		if (eClassifier instanceof EEnum)
		{
			EObject enumRootContainer = EcoreUtil.getRootContainer(eClassifier, true);
			EObject eAttributeRootContainer = EcoreUtil.getRootContainer(eAttribute, true);
			return eAttributeRootContainer.equals(enumRootContainer);
		}
		
		return false;
	}
	
	/**
	 * This method reverse all EAnnotation of the EModelElement parameter except 
	 * eMDE Annotations.
	 * @param vpElement Viewpoint class (result of the reverse process)
	 * @param eElement EMF class (used class by the reverse process to generate 
	 * a Viewpoint class)
	 */
	private void reverseAnnotation(AnnotatableElement vpElement, EModelElement eElement){
		for (EAnnotation eAnnotation : eElement.getEAnnotations()) 
		{
			// eMDE Annotation are reversed separately. They need a special treatment.
			// see the method reverseeMDEExtension(EClass eClass, Class vpClass)
			if (eAnnotation.getSource() != null  && isEMDEAnnotation(eAnnotation))
			{
				continue;
			}
			Annotation annotation = VpdescFactory.eINSTANCE.createAnnotation();
			String source = eAnnotation.getSource();
			annotation.setSource(source!= null ? source : "");
			for (Map.Entry<String, String> eDetail : eAnnotation.getDetails()) 
			{
				
				String key = eDetail.getKey();
				String value = eDetail.getValue();
				Detail detail = VpdescFactory.eINSTANCE.createDetail();
				detail.setKey(key != null ? key : "");
				detail.setValue(value != null ? value : "");
				annotation.getOwned_details().add(detail);
			}

			vpElement.getOwned_annotations().add(annotation);
		}
	}
	
	private boolean isEMDEAnnotation(EAnnotation eAnnotation){
		return eAnnotation.getSource().equals(EMDE_ANNOTATION_1) ||
					eAnnotation.getSource().equals(EMDE_ANNOTATION_2);
	}
	
	/**
	 * Generate attribute of the vpClass from the EAttribute of eClass 
	 * @param eClass : the current EClass
	 * @param vpClass : the generated vpspec.Class
	 */
	private void reverseAttributes(Class vpClass, EClass eClass){
		for (EAttribute eAttribute : eClass.getEAttributes()) 
		{
			// create attribute and add it to the class
			Attribute genAttribute = VpdescFactory.eINSTANCE.createAttribute();
			
			// Reverse common data.
			reverseAbstractFeatureProperties(genAttribute, eAttribute);
			
			vpClass.getVP_Class_Attributes().add(genAttribute);
			// set the attribute name
			final String attributeName = eAttribute.getName();
			genAttribute.setName(attributeName);
			// set the attribute cardinalities 
			final int lowerCase = eAttribute.getLowerBound();
			final int upperCase = eAttribute.getUpperBound();
			Cardinalities cardinalities = transformCardnalities(lowerCase, upperCase);
			genAttribute.setCardinality(cardinalities);
			// set the attribute type
			EDataType attributeDataType = eAttribute.getEAttributeType();
			if (isLocalEType(eAttribute, attributeDataType))
			{
				/**
				 * In this case, the EAttribute type is an EEnum defined in the same ecore,
				 * so we have to generate the EEnum and set it as the Attribute type
				 */
				if (attributeDataType instanceof EEnum)
				{
					Enumeration enumeration = reverseEnumerationsMapping_.get((EEnum)attributeDataType);
					if (enumeration == null)
						throw new IllegalStateException("Enumeration " + ((EEnum)attributeDataType).getName() + " was not imported correctely");
					
					LocalAttributeType localtype = VpdescFactory.eINSTANCE.createLocalAttributeType();
					localtype.setType(enumeration);
					genAttribute.setOwned_type(localtype);
				}
			}
			else
			{
				/**
				 * In this case, the attribute type is an external element, so we have to 
				 * create an external attribute type
				 */
				if (attributeDataType instanceof EEnum)
					attributeDataType = EcoreElementsUtil.transformEEnumToNsUriEEnum((EEnum)attributeDataType);
				else
					attributeDataType = EcoreElementsUtil.transformEDataTypeToNsUriEDataType((EDataType)attributeDataType);
				
				ExternalAttributeType type = VpdescFactory.eINSTANCE.createExternalAttributeType();
				type.setType(attributeDataType);
				genAttribute.setOwned_type(type);
				reverseAdditionalExternalData(attributeDataType.getEPackage());
			}
			
			monitorProgress(eClass.getName() + " : " + attributeName);
			
			// Register the attribute to reverse it annotations
			registerToReverseAnnotation(eAttribute, genAttribute);
		}
	}
	

	/**
	 * Reverse EOperation
	 * @param vpClass
	 * @param eClass
	 */
	private void reverseOperations(Class vpClass, EClass eClass){
		for (EOperation eOperation : eClass.getEOperations()) 
		{
			Operation operation = VpdescFactory.eINSTANCE.createOperation();
			// Operation name
			operation.setName(eOperation.getName());
			// Operation type
			EClassifier eOperationEType = eOperation.getEType();
			if (eOperationEType != null)
			{
				// Create a concrete Type (either a LocalType or an ExternalType)
				AbstractType operationType = getAbstractTypeFrom(eOperationEType);
				if (operationType != null)
				{
					Cardinalities cardinalties = transformCardnalities(eOperation.getLowerBound(), eOperation.getUpperBound());
					if (cardinalties != null)
						operationType.setCardinality(cardinalties);
					
					operation.setOperation_type(operationType);
				}
			}
			
			// Operation parameters
			for (EParameter eParameter : eOperation.getEParameters()) 
			{
				Parameter parameter = VpdescFactory.eINSTANCE.createParameter();
				// Parameter name
				parameter.setName(eParameter.getName());
				//Parameter type
				EClassifier eParameterEType = eParameter.getEType();
				
				if (! isLocalEType(eParameter, eParameterEType))
				{
					// Transform URI of the type to NsUri one 
					if (eParameterEType instanceof EClass)
						eParameterEType = EcoreElementsUtil.transformEClassToNsUriEClass((EClass)eParameterEType);
					// Transform URI of the type to NsUri one 
					if (eParameterEType instanceof EDataType)
						eParameterEType = EcoreElementsUtil.transformEDataTypeToNsUriEDataType((EDataType)eParameterEType);
				}
				
				if (eParameterEType != null)
				{
					// Create a concrete Type (either a LocalType or an ExternalType)
					AbstractType parameterType = getAbstractTypeFrom(eParameterEType);
					if (parameterType != null)
					{
						Cardinalities cardinalties = transformCardnalities(eParameter.getLowerBound(), eParameter.getUpperBound());
						if (cardinalties != null)
							parameterType.setCardinality(cardinalties);
						
						parameter.setParameter_type(parameterType);
					}
				}
				
				operation.getParameters().add(parameter);
			}
			
			vpClass.getVP_Class_Operations().add(operation);
			
			// Register the operation to reverse it annotations
			registerToReverseAnnotation(eOperation, operation);
		}
	}

	/**
	 * This method create an AbstractType form an EClassifier
	 * @param eClassifier
	 * @return
	 */
	private AbstractType getAbstractTypeFrom(EClassifier eClassifier) {
		AbstractType operationType = null;
		
		if (eClassifier instanceof EClass)
		{
			EClass eOperationEClassType = (EClass) eClassifier;
			Class vpClassType = reverseClassesMapping_.get(eOperationEClassType);
			if (vpClassType != null)
			{// Case of local EClass, then use the generated vp Class
				operationType = VpdescFactory.eINSTANCE.createLocalType();
				((LocalType)operationType).setType(vpClassType);

			}
			else
			{// Case of external EClass, then use it
				operationType = VpdescFactory.eINSTANCE.createExternalType();
				EClass externalEClass = EcoreElementsUtil.transformEClassToNsUriEClass(eOperationEClassType);
				((ExternalType)operationType).setType(externalEClass);
				
				// reverse external EPackage as additionalExternalData
				reverseAdditionalExternalData(externalEClass.getEPackage());
			}
		}
		else
		{
			if (eClassifier instanceof EEnum)
			{// Case of local EEnum, then use the generated one
				EEnum eOperationEEnumType = (EEnum)eClassifier;
				Enumeration enumeration = reverseEnumerationsMapping_.get(eOperationEEnumType);
				if (enumeration != null)
				{// Case of local EEnum, then use the generated Enumeration
					operationType = VpdescFactory.eINSTANCE.createLocalType();
					((LocalType)operationType).setType(enumeration);
				}
				else
				{// Case of external EEnum, then use it
					operationType = VpdescFactory.eINSTANCE.createExternalType();
					((ExternalType)operationType).setType(eOperationEEnumType);
					
					// reverse external EPackage as additionalExternalData
					reverseAdditionalExternalData(eOperationEEnumType.getEPackage());
				}
			}
			else
			{// Case of the other EDataType (EInt, EString, etc.).
				operationType = VpdescFactory.eINSTANCE.createExternalType();
				eClassifier = EcoreElementsUtil.transformEDataTypeToNsUriEDataType((EDataType)eClassifier);
				((ExternalType)operationType).setType(eClassifier);
				
				// reverse external EPackage as additionalExternalData
				reverseAdditionalExternalData(eClassifier.getEPackage());
			}
			
		}
		return operationType;
	}
	
	private void reverseAbstractFeatureProperties (AbstractFeature abstractFeature, EStructuralFeature eFeature){
		if (abstractFeature != null && eFeature != null)
		{
			abstractFeature.setChangeable(eFeature.isChangeable());
			abstractFeature.setDerived(eFeature.isDerived());
			abstractFeature.setOrdered(eFeature.isOrdered());
			abstractFeature.setTransient(eFeature.isTransient());
			abstractFeature.setUnique(eFeature.isUnique());
			abstractFeature.setUnsettable(eFeature.isUnsettable());
			abstractFeature.setVolatile(eFeature.isVolatile());
			if (abstractFeature instanceof Attribute)
			{
				Attribute attribute = (Attribute) abstractFeature;
				EAttribute eAttribute = (EAttribute) eFeature;
				attribute.setIsId(eAttribute.isID());
			}
		}
	}
	

	/**
	 * Reverse EReference 
	 * @param vpClass
	 * @param eClass
	 */
	private void reverseAssociationsRelationships(Class vpClass, EClass eClass){
		for (EReference iEReference : eClass.getEReferences()) 
		{
			EClassifier refType = iEReference.getEType();
			AbstractAssociation association = null;
			if (refType instanceof EClass)
			{
				EClass eClassRefType = (EClass) refType;
				Class vpClassType = reverseClassesMapping_.get(eClassRefType);
				if (vpClassType != null)
				{
					// Case of local EClass, then use the generated vp Class
					association = VpdescFactory.eINSTANCE.createLocalClassAssociation();
					((LocalClassAssociation)association).setLocalTarget(vpClassType);
				}
				else
				{
					// Case of external EClass, then use it
					association = VpdescFactory.eINSTANCE.createExternalClassAssociation();
					EClass externalEClass = EcoreElementsUtil.transformEClassToNsUriEClass(eClassRefType);
					((ExternalClassAssociation)association).setExternalTarget(externalEClass);
					
					// reverse external EPackage as additionalExternalData
					reverseAdditionalExternalData(externalEClass.getEPackage());
				}
			}

			// Set association data and add it to viewpoint class
			if (association != null)
			{
				association.setName(iEReference.getName());
				association.setCardinality(transformCardnalities(iEReference.getLowerBound(), iEReference.getUpperBound()));
				association.setType(iEReference.isContainment() ? Association_Types.CONTAINMENT : Association_Types.REFERENCE);
				vpClass.getVP_Classes_Associations().add(association);
			}
			
			if (association != null)
				reverseAbstractFeatureProperties(association, iEReference);

			// Do progress the monitor
			monitorProgress(eClass.getName() + " : " + association.getName());
			
			// Register the reference to reverse it annotations
			registerToReverseAnnotation(iEReference, association);
		}
	}
	
	/**
	 * This transforms int cardinalities to VpDsl Cardinalties
	 * @param lowerBound
	 * @param upperBound
	 * @return
	 */
	private Cardinalities transformCardnalities(int lowerBound, int upperBound){
		switch (lowerBound) {
		case 0:
			switch (upperBound) {
			case 1:
				return Cardinalities.NOTHING_OR_ONE;
			case -1:
				return Cardinalities.NOTHING_OR_MANY;
			}
			break;
		
		case 1:
			switch (upperBound) {
			case 1:
				return Cardinalities.ONLY_ONE;
			case -1:
				return Cardinalities.ONE_OR_MANY;
			}
			break;
		}
		return Cardinalities.NOTHING_OR_MANY;
	}
	
	/**
	 * Reverse Inheritance.
	 * @param vpClass
	 * @param eClass
	 */
	private void reverseInheritanceRelationships(Class vpClass, EClass eClass){
		for (EClass iEClass : eClass.getESuperTypes()) 
		{
			// Check if there is a generated Class from the EClass
			if (reverseClassesMapping_.containsKey(iEClass))
			{// Case of local inheritance
				Class clazz = reverseClassesMapping_.get(iEClass);
				LocalSuperClass localSuperClass = VpdescFactory.eINSTANCE.createLocalSuperClass();
				localSuperClass.setSuperClass(clazz);
				vpClass.getInheritences().add(localSuperClass);
			}
			else
			{// Case of external inheritance
				if (! ReverseUtil.isGeneratedInheritance(vpClass, iEClass, ePackage.eResource()))
				{// Case of external no generated inheritance. Generated inheritance are the one which 
				 // target class is an eMde class or Target Application basic semantic elements class
					EClass externalEClass = EcoreElementsUtil.transformEClassToNsUriEClass(iEClass);
					ExternalSuperClass externalSuperClass = VpdescFactory.eINSTANCE.createExternalSuperClass();
					externalSuperClass.setSuperClass(externalEClass);
					vpClass.getInheritences().add(externalSuperClass);
					
					// reverse external EPackage as additionalExternalData
					reverseAdditionalExternalData(externalEClass.getEPackage());
				}
			}
			monitorProgress(vpClass.getName() + " Super type (" +iEClass.getName()+")");
		}
	}
	
	/**
	 * Reverse non target application EPackages
	 * @param vpClass {@link Class} under reverse
	 * @param eClass Generated {@link EClass} from vpClass
	 */
	private void reverseAdditionalExternalData(EPackage externalEPackage){
		if (! isEPackageFromTargetApplication(externalEPackage))
		{
			Data data = this.viewpoint.getVP_Data();
			data.getAdditionalExternalData().add(externalEPackage);
			addEMFResource(externalEPackage);
		}
	}
	
	private void addEMFResource(EPackage ePackage){
		// Check if ViewpointResources element is available in the model 
		ViewpointResources viewpointResources = this.viewpoint.getViewpointResources();
		if (viewpointResources == null)
		{// ViewpointResources is not available, so create it.
			viewpointResources = VpdescFactory.eINSTANCE.createViewpointResources();
			this.viewpoint.setViewpointResources(viewpointResources);
		}
		
		final URI uri = ePackage.eResource().getURI();
		if (uri != null)
		{
			// Check if the EMFResource a already added to ViewpointResources
			boolean addResource = true;
			final String uris = uri.toString();
			final EList<AbstractResource> usedResources = viewpointResources.getUseResource();
			if (usedResources != null && ! usedResources.isEmpty())
			{
				for (AbstractResource abstractResource : usedResources) 
				{
					if (abstractResource instanceof EMFResource)
					{
						final String emfResourceUri = ((EMFResource) abstractResource).getUri();
						if (emfResourceUri.equals(uris))
						{
							addResource = false;
							break;
						}
					}
				}
			}
			
			// EMFResource in not available in ViewpointResources. So create it.
			if (addResource)
			{
				EMFResource emfResource = VpdescFactory.eINSTANCE.createEMFResource();
				emfResource.setUri(uris);
				this.viewpoint.getViewpointResources().getUseResource().add(emfResource);
			}
		}
	}
	
	/**
	 * Allows to check if an EPackage and its sub packages is/are declared by Target Application
	 * @param ePackage the {@link EPackage} to check
	 * @return True if the {@link EPackage} is declared by Target Application, 
	 * false if it is an external one 
	 */
	private boolean isEPackageFromTargetApplication(EPackage ePackage){
		if (targetApplicationEPackages.contains(ePackage))
			return true;
		else
		{
			for (EPackage iEPackage : targetApplicationEPackages) 
			{
				EObject rootContainer = EcoreUtil.getRootContainer(iEPackage);
				if (rootContainer instanceof EPackage)
				{
					EPackage rootEPackage = (EPackage) rootContainer;
					boolean found = findEPackageInTargetApplicationMetaModels(rootEPackage, ePackage);
					if (found)
						return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Do a double check : EPackage comparison and NsUri comparison
	 * @param rootEPackage
	 * @param wantedEPackage
	 * @return
	 */
	private boolean findEPackageInTargetApplicationMetaModels(EPackage rootEPackage, EPackage wantedEPackage){
		if (rootEPackage.getNsURI().equals(wantedEPackage.getNsURI()))
			return true;
		else
		{
			EList<EPackage> eSubpackages = rootEPackage.getESubpackages();
			if (eSubpackages != null && !eSubpackages.isEmpty() )
			{
				if (eSubpackages.contains(wantedEPackage))
					return true;
				else
				{
					for (EPackage iEPackage : eSubpackages) 
					{
						if (iEPackage.getNsURI().equals(wantedEPackage.getNsURI()))
							return true;
						
						return findEPackageInTargetApplicationMetaModels(iEPackage, wantedEPackage);
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * Load Target application EPackages
	 */
	private void loadTargetApplicationEPackages(){
		// Get the name of viewpoint target application
		String targetApplication = VpDslConfigurationHelper.getTargetApplication(this.viewpoint);
		// Get declared NsUris in this target application
		Map<String, List<String>> nsUris = TargetApplicationExtensionManager.getTargetApplicationMetaModels(targetApplication);
		// First load String NsUris
		List<EPackage> ePackages;
		List<String> stringNsUris = nsUris.get("String");
		if (stringNsUris != null)
		{
			ePackages = ReverseUtil.getEPackagesByNsUri(stringNsUris);
			if (ePackages != null && !ePackages.isEmpty())
				targetApplicationEPackages.addAll(ePackages);
		}
		// Second, load regex NsUris
		List<String> regexNsUris = nsUris.get("Regex");
		// If the list is null, then create on because we need it to load Ecore and EMDE EPackages
		if (regexNsUris == null )
			regexNsUris = new ArrayList<String>();
		// Add Ecore and EMDE NsUris patterns. We use pattern to handle different versions of this EPackages
		regexNsUris.add(ECORE_NSURI_PATTERN);
		regexNsUris.add(EMDE_NSURI_PATTERN);
		ePackages = ReverseUtil.getEPackagesByNsUriRegex(regexNsUris);
		if (ePackages != null && !ePackages.isEmpty())
			targetApplicationEPackages.addAll(ePackages);
	}
	
	/**
	 * Allow to register an ecore model element and it vp element equivalent to 
	 * reverse annotations 
	 * @param eElement
	 * @param vpElement
	 */
	private void registerToReverseAnnotation(EModelElement eElement, AnnotatableElement vpElement){
		annotationElementMapping_.put(eElement, vpElement);
	}
	
	/**
	 * progress monitor
	 * @param current
	 */
	private void monitorProgress(String current){
		monitor.subTask(current);
		monitor.worked(1);
	}
	
	/**
	 * Count the progress bar steps number 
	 * @param ePackage
	 * @return
	 */
	private int reversibleElementCount(){
		int result = 0;
		for (EClassifier iEClassifier : eClassifiersToReverse/*ePackage.getEClassifiers()*/) 
		{
			if (iEClassifier instanceof EClass)
			{
				EClass eClass = ((EClass) iEClassifier);
				result ++;
				result += eClass.getEReferences().size();
				result += eClass.getEAttributes().size();
				result += eClass.getESuperTypes().size();
				result += eClass.getEOperations().size();
				result += eClass.getEAnnotations().size();
				if (eClass.getEAnnotation(EMDE_ANNOTATION_1) != null)
					result --;
				if (eClass.getEAnnotation(EMDE_ANNOTATION_2) != null)
					result --;
			}
		}
		return result;
	}
	
	
	private void addEnumerationMapEntry(EEnum source, Enumeration generated){
		if (reverseEnumerationsMapping_.containsKey(source))
		{
			if (! reverseEnumerationsMapping_.get(source).equals(generated))
				throw new RuntimeException();
		}
		else
			reverseEnumerationsMapping_.put(source, generated);
	}
	/**
	 * Register an EClass and the generated vpspec.Class
	 * @param source : The EClass
	 * @param generated : the vpspec.Class
	 */
	private void addClassMapEntry(EClass source, Class generated){
		if (reverseClassesMapping_.containsKey(source))
		{
			if (! reverseClassesMapping_.get(source).equals(generated))
				throw new RuntimeException();
		}
		else
			reverseClassesMapping_.put(source, generated);
	}
	
	public boolean isFlattenEPackages() {
		return flattenEPackages;
	}

	public void setFlattenEPackages(boolean flattenEPackages) {
		this.flattenEPackages = flattenEPackages;
	}

	public boolean isAddSeperator() {
		return addSeperator;
	}

	public void setAddSeperator(boolean addSeperator) {
		this.addSeperator = addSeperator;
	}

	public ConflictingNameResloveStrategy getNameConflictResolveStrategy() {
		return nameConflictResolveStrategy;
	}

	public void setNameConflictResolveStrategy(
			ConflictingNameResloveStrategy nameConflictResolveStrategy) {
		this.nameConflictResolveStrategy = nameConflictResolveStrategy;
	}
}
