/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.emde.diagram.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.ExtendedLoadResourceDialog;
import org.eclipse.emf.ecore.provider.EClassItemProvider;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.editing.EditingDomainFactoryService;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.polarsys.kitalpha.emde.model.EmdePackage;

public class ExtensibilityService {
	private static final EClass MODEL_ELEMENT_ECLASS = convert(EmdePackage.Literals.EXTENSIBLE_ELEMENT);
	private static final EClassItemProvider ECLASS_ITEM_PROVIDER = new EClassItemProvider(new EcoreItemProviderAdapterFactory());
	private static final String EXTENDING = "Extensible: ";
	private static final String PLATFORM_PLUGIN = "platform:/plugin";
	private static final String PLATFORM_RESOURCE = "platform:/resource";
	private static final String MODEL_TO_BE_EXTENDED = "model to be extended";
	private static final String EXTENSION_MODEL = "extension model";
	private static final String SELECT = "Select ";
	private static final String SELECTION_DIALOG = "Selection dialog";
	
	private static final NullProgressMonitor NPM = new NullProgressMonitor();
	private static TransactionalEditingDomain editingDomain = EditingDomainFactoryService.INSTANCE.getEditingDomainFactory().createEditingDomain();
	
	public static final String EXTENDED_ELEMENT = "ExtendedElement";
	public static final String MAPPING = "Mapping";
	public static final String SOURCE2 = EmdePackage.eNS_URI + "/constraint";
	public static final String SOURCE3 = SOURCE2 + "Mapping";
	private static final String EXTENDS_MODEL_LABEL = "Extends Model";
	private static final String EXTENSIBLE_MODEL_LABEL = "Extensible Model";
	public static final String USE_UUIDS_LABEL = "Use UUIDs";
	public static final String USE_ID_ATTRIBUTES_LABEL = "Use ID Attributes";
	private static final String CHILD_CREATION_EXTENDERS = "childCreationExtenders";
	private static final String EXTENSIBLE_PROVIDER_FACTORY = "extensibleProviderFactory";
	public static final String USE_UUIDS = "useUUIDs";
	public static final String USE_ID_ATTRIBUTES = "useIDAttributes";

	private static final String NEW_SOURCE = "http://www.polarsys.org/kitalpha/emde/1.0.0/extension";
	private static final String TRUE = "true";
	private static final String FALSE = "false";

	private static URI emdeURI = null;

	public boolean isExtensible(EClass eClass) {
		return isInstanceOf(eClass, EmdePackage.Literals.EXTENSIBLE_ELEMENT);
	}

	public boolean isExtensibleModelElement(EClass eClass) {
		return isInstanceOf(eClass, EmdePackage.Literals.ELEMENT_EXTENSION);
	}

	public static boolean isInstanceOf(EClass eClass, EClass superType) {
		EClass newSP = convert(superType);
		for (EClass sp : eClass.getESuperTypes()) {
			if (EcoreUtil.equals(sp, newSP)) {
				return true;
			}
		}
		return false;
	}

	public Collection<Object> getEntry(EPackage ePackage) {
		EAnnotation annotation = ePackage.getEAnnotation(NEW_SOURCE);
		if (annotation != null /*&& ePackage.getEAnnotation(OLD_SOURCE) != null*/) 
		{
			Collection<Object> result = new ArrayList<Object>();

			for (EObject eObject : annotation.eContents()) 
			{
				if (eObject instanceof EStringToStringMapEntryImpl) 
				{
					EStringToStringMapEntryImpl entry = (EStringToStringMapEntryImpl) eObject;
					if (isQualified(entry.getKey())) 
					{
						result.add(entry);
					}
				}
			}

			// ///////////
			if (result.size() == 0) {
				init(annotation);
				return getEntry(ePackage);
			} else {
				return result;
			}

			// ///////////
		} 
		else 
		{
			init(ePackage);
			return getEntry(ePackage);
		}
	}

	private void init(EPackage ePackage) {
		EAnnotation annotation = ePackage.getEAnnotation(NEW_SOURCE);
		if (annotation == null) 
		{
			annotation = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation.setSource(NEW_SOURCE);
			init(annotation);
			ePackage.getEAnnotations().add(annotation);
		}
		
		try {
			Session session = SessionManager.INSTANCE.getSession(ePackage);
			session.addSemanticResource(convert(EmdePackage.Literals.ELEMENT_EXTENSION).eResource().getURI(), NPM);
		} 
		catch (Exception e) {
		}

	}

	private void init(EAnnotation annotation) {
		addNewEntry(annotation, EXTENSIBLE_PROVIDER_FACTORY);
		addNewEntry(annotation, CHILD_CREATION_EXTENDERS);
		addNewEntry(annotation, USE_UUIDS);
		addNewEntry(annotation, USE_ID_ATTRIBUTES);
	}

	private void addNewEntry(EAnnotation eAnnotation, String key) {
		EStringToStringMapEntryImpl entry = createNewEntry(key);
		if (key.equals(USE_ID_ATTRIBUTES)) 
			entry.setValue(FALSE);
		else 
			entry.setValue(TRUE);

		eAnnotation.getDetails().add(entry);
	}

	private boolean isQualified(String key) {
		if (key.equals(USE_UUIDS)) 
			return true;
		
		if (key.equals(USE_ID_ATTRIBUTES)) 
			return true;
		
		if (key.equals(EXTENSIBLE_PROVIDER_FACTORY)) 
			return true;
		
		if (key.equals(CHILD_CREATION_EXTENDERS)) 
			return true;
		
		return false;
	}

	public String getEntryLabel(String key) {
		if (key.equals(USE_UUIDS)) 
			return USE_UUIDS_LABEL;
		
		if (key.equals(USE_ID_ATTRIBUTES)) 
			return USE_ID_ATTRIBUTES_LABEL;
		
		if (key.equals(EXTENSIBLE_PROVIDER_FACTORY)) 
			return EXTENSIBLE_MODEL_LABEL;
		
		if (key.equals(CHILD_CREATION_EXTENDERS)) 
			return EXTENDS_MODEL_LABEL;
		
		return "";
	}

	public Collection<EObject> getExtendedModel(EPackage ePackage) {
		if (ePackage.getEAnnotation(NEW_SOURCE) == null) 
			init(ePackage);
		
		Collection<EObject> result = new UniqueEList<EObject>();
		for (EClassifier eClassifier : ePackage.getEClassifiers()) 
		{
			result.addAll(getExtendedModel(eClassifier));
		}
		return result;
	}

	public Collection<EObject> getExtendedModel(EClassifier eClassifier) {
		EAnnotation annotation = eClassifier.getEAnnotation(SOURCE3);
		if (annotation != null) 
		{
			for (Entry<String, String> entry : annotation.getDetails()) 
			{
				if (entry instanceof EStringToStringMapEntryImpl) 
					return getExtendedModel((EStringToStringMapEntryImpl) entry);
				
			}
		}
		return Collections.emptyList();
	}

	public static Collection<EObject> getExtendedModel(EStringToStringMapEntryImpl entry) {
		if (entry.getKey().equals(MAPPING)) 
		{
			Collection<EObject> result = new UniqueEList<EObject>();
			StringTokenizer stringTokenizer = new StringTokenizer(entry.getValue());
			// Resource resource = entry.eResource();
			// URI uriResource = resource.getURI();
			if (editingDomain == null)
				editingDomain = EditingDomainFactoryService.INSTANCE.getEditingDomainFactory().createEditingDomain();
			ResourceSet resourceSet = editingDomain.getResourceSet();

			while (stringTokenizer.hasMoreTokens()) 
			{
				String uriString = stringTokenizer.nextToken();
				URI uri = URI.createURI(uriString);

				EObject object = null;
				try {
					object = resourceSet.getEObject(uri, true);
				} catch (Exception e) {
				}
				// ////////////////////
				if (object == null && uri.isPlatformResource()) 
				{
					String s = uri.toString().replace(PLATFORM_RESOURCE, PLATFORM_PLUGIN);
					object = resourceSet.getEObject(URI.createURI(s), true);
				}
				// ////////////////////
				if (object != null) 
				{
					result.add(object);
					Session session = SessionManager.INSTANCE.getSession(entry);
					final Collection<Resource> semanticResources = session.getSemanticResources();
					
					boolean addResource = true;
					for (Resource resource : semanticResources) 
					{
						if (resource.getURI().toString().toLowerCase().equals(object.eResource().getURI().toString().toLowerCase()))
						{
							addResource = false;
							break;
						}
					}
					
					if (addResource)
					{
						session.addSemanticResource(object.eResource().getURI(), NPM);
					}
				
					try {
						if (PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null &&
								PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage() != null &&
								PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor() instanceof DiagramEditor) 
						{
							DiagramEditPart diagramEditPart = ((DiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor()).getDiagramEditPart();
							ReadOnlyResourceManager.handler(diagramEditPart, entry.eResource(), object.eResource());
						}
					} catch (Exception e) {
						//FIXME mhelleboid : fail on G4 version, maybe also on G2/G3 ones
						e.printStackTrace();
					}
				} else {
					// String componentName = uri.fragment().replace("//", "");
					// EClass eClass = EcoreFactory.eINSTANCE.createEClass();
					// eClass.setName(componentName);
					// result.add(eClass);
				}
			}
			return result;
		} else {
			return Collections.emptyList();
		}
	}

	private Collection<EObject> openDialog(EObject receiver) {
		ExtendedLoadResourceDialog loadResourceDialog = new ExtendedLoadResourceDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), editingDomain);

		loadResourceDialog.open();
		List<URI> uriList = null;
		try {
			List<URI> selectionList = loadResourceDialog.getURIs();
			uriList = new ArrayList<URI>(selectionList);
		} catch (RuntimeException e) {
		}
		loadResourceDialog = null;

		if (uriList != null && uriList.size() > 0) 
		{
			Collection<EObject> selectionList = new UniqueEList<EObject>();
			for (URI uri : uriList) 
			{
				if (editingDomain == null)
					editingDomain = EditingDomainFactoryService.INSTANCE.getEditingDomainFactory().createEditingDomain();
				
				Resource r = editingDomain.getResourceSet().getResource(uri, true);
				try {
					EPackage ePackage = (EPackage) r.getContents().get(0);
					if (ePackage != null) 
					{
						for (EObject eObject : ePackage.eContents()) 
						{
							if (eObject instanceof EClass) 
								selectionList.add(eObject);
						}
					}
				} catch (Exception e) {
					// Do nothing
				}
			}

			return selectionList;
		}
		return null;
	}

	public Object getAllExtendedModel(EObject receiver) {
		if (receiver instanceof EClass) 
		{
			return receiver;
		} 
		else 
		{
			if (receiver instanceof EPackage) 
			{
				Collection<EObject> input = new UniqueEList<EObject>();
				EPackage ePackage = (EPackage) receiver;
				for (EClassifier eClassifier : ePackage.getEClassifiers()) 
				{
					if (eClassifier instanceof EClass) 
					{
						EClass eClass = (EClass) eClassifier;
						if (isExtensibleModelElement(eClass))
							input.add(eClass);
					}
				}

				if (input.size() > 0)
				{
					ElementListSelectionDialog dialog = new ElementListSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), new AdapterFactoryLabelProvider(new EcoreItemProviderAdapterFactory()));
					dialog.setElements(input.toArray());
					dialog.setMultipleSelection(true);
					dialog.setTitle(SELECTION_DIALOG);
					dialog.setMessage(SELECT + EXTENSION_MODEL);
					if (dialog.open() == Window.OK) 
						return dialog.getResult();
				}
			}
		}
		return null;
	}

	public Collection<EClass> openDialog3(EClass receiver) {
		final Object[] selectedElement = openDialog2((EObject) receiver);
		final Collection<EClass> selectedEClasses = new HashSet<EClass>(); 
		for (Object object : selectedElement) 
		{
			selectedEClasses.add((EClass) object);
		}
		
		return selectedEClasses;
	}
	
	public Object[] openDialog2(EObject receiver) {
		Collection<EObject> list = openDialog(receiver);
		if (list != null && list.size() > 0) 
		{
			ElementListSelectionDialog dialog = new ElementListSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), new AdapterFactoryLabelProvider(new EcoreItemProviderAdapterFactory()));
			dialog.setElements(list.toArray());
			dialog.setMultipleSelection(true);
			dialog.setTitle(SELECTION_DIALOG);
			dialog.setMessage(SELECT + MODEL_TO_BE_EXTENDED);
			if (dialog.open() == Window.OK) 
				return dialog.getResult();
		}
		return Collections.emptyList().toArray();
	}

	public Object[] getExtensionElement(EPackage ePackage) {
		List<EClass> result = new UniqueEList<EClass>();
		for (EClassifier eClassifier : ePackage.getEClassifiers()) 
		{
			if (eClassifier instanceof EClass) 
			{
				EClass eClass = (EClass) eClassifier;
				if (isExtensibleModelElement(eClass)) 
					result.add(eClass);
			}
		}
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), new AdapterFactoryLabelProvider(new EcoreItemProviderAdapterFactory()));
		dialog.setElements(result.toArray());
		dialog.setMultipleSelection(true);
		if (dialog.open() == Window.OK) 
		{
			return dialog.getResult();
		}
		return Collections.emptyList().toArray();
	}
	
	public Collection<EObject> getSelectionCandidate(EObject eObject, DSemanticDiagram diagram) {
		final List<EClass> eClasses = new ArrayList<EClass>();
		EPackage ePackage = null;
		if (eObject instanceof EPackage)
			ePackage = (EPackage) eObject;
		else
		{
			ePackage = (EPackage) diagram.getTarget();
		}
		
		final EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
		for (EClassifier eClassifier : eClassifiers) 
		{
			if (eClassifier instanceof EClassifier )
				eClasses.add((EClass) eClassifier);
		}
		
		Collection<DDiagramElement> dElement = new HashSet<DDiagramElement>();
		for (DDiagramElement dDiagramElement : diagram.getOwnedDiagramElements()) 
		{
			if (dDiagramElement instanceof DNodeList)
				dElement.add(dDiagramElement);
		}
		
		return getSelectionCandidate(eClasses, dElement);
	}

	/**
	 * 
	 * @param candidateList
	 * @param displayedList
	 * @return
	 */
	public Collection<EObject> getSelectionCandidate(Collection<EClass> candidateList, Collection<DDiagramElement> displayedList) {
		Collection<EObject> result = new UniqueEList<EObject>(candidateList);
		if (displayedList != null && displayedList.size() > 0) 
		{
			for (DDiagramElement element : displayedList) 
			{
				result.remove(element.getTarget());
			}
		}
		return result;
	}

	public static EStringToStringMapEntryImpl createNewEntry(String key) {
		EStringToStringMapEntryImpl entry = (EStringToStringMapEntryImpl) ((EcoreFactoryImpl) EcoreFactory.eINSTANCE).createEStringToStringMapEntry();
		entry.setKey(key);
		return entry;
	}

	public static EClass convert(EClass superType) {
		Resource resource = superType.eResource();
		URI uri = resource.getURI();

		if (emdeURI == null)
			emdeURI = convert(uri, EmdePackage.eNS_URI);

		URI objectURI = EcoreUtil.getURI(superType);

		String newURI = objectURI.toString().replace(uri.toString(), emdeURI.toString());
		if (editingDomain == null)
			editingDomain = EditingDomainFactoryService.INSTANCE.getEditingDomainFactory().createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();

		EObject object = resourceSet.getEObject(URI.createURI(newURI), true);
		if (object instanceof EClass)
		{
			return (EClass) object;
		} 
		else 
		{
			return null;
		}

	}

	public static URI convert(URI uri, String ns) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());

		Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap();

		URI location = ePackageNsURItoGenModelLocationMap.get(uri.toString());
		Resource resource = resourceSet.getResource(location, true);
		EcoreUtil.resolveAll(resource);

		for (Resource r : resourceSet.getResources()) 
		{
			for (TreeIterator<?> j = new EcoreUtil.ContentTreeIterator<Object>(r.getContents()){
				private static final long serialVersionUID = 1L;

				@Override
				protected Iterator<? extends EObject> getEObjectChildren(EObject eObject) {
					return eObject instanceof EPackage ? ((EPackage) eObject).getESubpackages().iterator() : Collections.<EObject> emptyList().iterator();
				}
			}; j.hasNext();) {
				Object content = j.next();
				if (content instanceof EPackage) {

					EPackage ePackage = (EPackage) content;
					if (ns.equals(ePackage.getNsURI())) {
						return r.getURI();
					}
				}
			}
		}
		return null;
	}

	public static EAnnotation getAnnotation(EClass owner, String source) {
		EAnnotation eAnnotation = owner.getEAnnotation(source);
		if (eAnnotation == null) 
		{
			eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			eAnnotation.setSource(source);
			owner.getEAnnotations().add(eAnnotation);
		}
		return eAnnotation;

	}

	public static void clean(EObject view, Collection<EObject> objectList) {
		if (objectList.size() > 0) 
		{
			DView container = getContainer(view);
			if (container != null) 
			{
				List<Resource> resourceList = new UniqueEList<Resource>();
				
				final EList<DRepresentation> ownedRepresentations = container.getOwnedRepresentations();
				for (DRepresentation dRepresentation : ownedRepresentations) 
				{
					if (dRepresentation instanceof DDiagram)
					{
						DDiagram diagram = (DDiagram) dRepresentation;
						for (DDiagramElement element : diagram.getOwnedDiagramElements()) 
						{
							EObject target = element.getTarget();
							if (target instanceof EClass && objectList.contains(target) == false) 
								resourceList.add(target.eResource());
						}
					}
				}

				List<Resource> potentialToBeDeletedList = new UniqueEList<Resource>();
				for (EObject eObject : objectList) 
				{
					potentialToBeDeletedList.add(eObject.eResource());
				}
				
				potentialToBeDeletedList.removeAll(resourceList);
				if (potentialToBeDeletedList.size() > 0) 
				{
					Session session = SessionManager.INSTANCE.getSession(potentialToBeDeletedList.get(0));
					for (Resource resource : potentialToBeDeletedList) 
					{
						try
						{
							session.removeSemanticResource(resource, NPM, false);
						}catch (Exception e){
							
						}
					}
				}
			}
		}

	}

	private static DView getContainer(EObject view) {
		EObject container = view.eContainer();
		if (container != null) 
		{
			if (container instanceof DView) 
				return (DView) container;
			else 
				return getContainer(container);
		}
		return null;
	}

	public static EStringToStringMapEntryImpl getEntry(EAnnotation annotation, String key) {
		for (Entry<String, String> entry : annotation.getDetails()) 
		{
			if (key.equals(entry.getKey())) 
				return (EStringToStringMapEntryImpl) entry;
		}
		
		EStringToStringMapEntryImpl newEntry = ExtensibilityService.createNewEntry(key);
		annotation.getDetails().add(newEntry);
		return newEntry;
	}

	public String getValue(EObject receiver) {
		if (receiver instanceof EStringToStringMapEntryImpl) 
			return ((EStringToStringMapEntryImpl) receiver).getValue();

		if (receiver instanceof EClass) 
		{
			for (EClass eClass : ((EClass) receiver).getEAllSuperTypes()) 
			{
				if (EcoreUtil.equals(eClass, MODEL_ELEMENT_ECLASS)) 
					return "true";
			}
			return "false";
		}
		return null;
	}

	public String getLineLabel(EClass eClass) {
		StringBuilder builder = new StringBuilder();
		builder.append(EXTENDING);
		String text = ECLASS_ITEM_PROVIDER.getText(eClass);
		builder.append(text);
		return builder.toString();
	}

}
