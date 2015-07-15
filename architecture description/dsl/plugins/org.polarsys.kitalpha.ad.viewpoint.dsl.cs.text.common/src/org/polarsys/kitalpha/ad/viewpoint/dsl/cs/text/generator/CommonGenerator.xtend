/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
 
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator

import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpdesc.Aspect
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpdesc.Data
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpdesc.Viewpoint
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpspec.CoreModelHelper
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpbuild.Build
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpdiagram.DiagramSet
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpservices.PropertySet
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpservices.RuleSet
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpservices.ServiceSet
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpui.UIDescription
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpconf.Configuration
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EContentsEList$FeatureIterator
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.EcoreUtil$Copier
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.validation.IConcreteSyntaxValidator
import org.eclipse.xtext.validation.IConcreteSyntaxValidator$DiagnosticListAcceptor
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ExternalDataHelper
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.sirius.viewpoint.description.Group
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer

abstract class CommonGenerator implements IViewpointSynchronizer {
	
	protected var Copier copier;
	
	override EObject synchronize(List<EObject> input, EObject output) {
		if (checkInput(input))
			return text2model(input, output as Viewpoint)
		return null;
	}

	def boolean checkInput(List<EObject> objects)
	
	def boolean validate(EObject object) {
		var List<Diagnostic> diagnostics = new ArrayList<Diagnostic>()
		var IConcreteSyntaxValidator concreteSyntaxValidator = (object.eResource as XtextResource).getConcreteSyntaxValidator()
		concreteSyntaxValidator.validateRecursive(object, new DiagnosticListAcceptor(diagnostics), new HashMap<Object, Object>())
		if (!diagnostics.isEmpty()) {
			return false;
		}
		return true;
	}
	
	def EObject text2model(List<EObject> input, Viewpoint target) { 
		setTargetName(target)
		createCopier(input)	
		setTargetRefrerences(input, target)	
		for (EObject key : input) {
			if (key instanceof Data) {
				var oldData = target.VP_Data
				if (oldData !=null) {					
					target.setVP_Data(copier.get(key) as Data)
				} else {
					target.setVP_Data(copier.get(key) as Data)
				}
				
				//FIXME without EMF refelexion or use Xtext import
				for (EObject imp : input) {
					if (imp.eClass.name.equals("ImportURI"))
					{
						var EStructuralFeature nsuriAttr = imp.eClass.getEStructuralFeature("importURI");
						var String importValue = imp.eGet(nsuriAttr).toString;
						var EPackage ep = ExternalDataHelper::loadEPackage(importValue, target.eResource.resourceSet);
						target.VP_Data.additionalExternalData.add(ep)
					}
				}
			}
			
			if (key instanceof UIDescription) {				
				var oldUi =  target.VP_Aspects.findFirst(c | c instanceof UIDescription)
				if (oldUi!=null) {
					EcoreUtil2::replace(oldUi, copier.get(key))
				} else {
					target.VP_Aspects.add(copier.get(key) as Aspect)
				}
				
			}			
			if (key instanceof DiagramSet) {
				var oldDiagramSet =  target.VP_Aspects.findFirst(c | c instanceof DiagramSet)
				if (oldDiagramSet!=null) {
					EcoreUtil2::replace(oldDiagramSet, copier.get(key))
				} else {
					target.VP_Aspects.add(copier.get(key) as Aspect)
				}
				
				//FIXME without EMF refelexion
				for (EObject imp : input) {
					if (imp.eClass.name.equals("ImportGroup"))
					{
						var EStructuralFeature importGroupAttr = imp.eClass.getEStructuralFeature("importedGroup");
						var String importValue = imp.eGet(importGroupAttr).toString;				
						importValue = importValue.substring(1, importValue.length-1);
						
						var resourceSet = new ResourceSetImpl();
						var targetDiagram = target.VP_Aspects.findFirst(d | d instanceof DiagramSet);
						if (isEcoreURI(importValue)){
							val EPackage ePackage = ExternalDataHelper::loadEPackage(importValue, target.eResource.resourceSet);
			                if (ePackage != null){
			                	(targetDiagram as DiagramSet).additionalExternalData.add(ePackage);
			                }
			            } else {
			                //Representation 
			                val resource = resourceSet.getResource(URI::createURI(importValue), true);
						
							if (resource != null){
								val rootGroup = resource.contents.get(0);
								if (rootGroup != null)
									(targetDiagram as DiagramSet).additionalExternalGroup.add(rootGroup as Group);
							}
						}
					}
				}
			}
					
			if (key instanceof Build) {
				var oldBuild =  target.VP_Aspects.findFirst(c | c instanceof Build)
				if (oldBuild!=null) {
					EcoreUtil2::replace(oldBuild, copier.get(key))
				} else {
					target.VP_Aspects.add(copier.get(key) as Aspect)
				}
			}			
			if (key instanceof Configuration) {
				var oldConf =  target.VP_Aspects.findFirst(c | c instanceof Configuration)
				if (oldConf!=null) {
					EcoreUtil2::replace(oldConf, copier.get(key))
				} else {
					target.VP_Aspects.add(copier.get(key) as Aspect)
				}
			}		
			if (key instanceof RuleSet) {
				var oldRules =  target.VP_Aspects.findFirst(c | c instanceof RuleSet)
				if (oldRules != null) {
					EcoreUtil2::replace(oldRules, copier.get(key))
				} else {
					target.VP_Aspects.add(copier.get(key) as Aspect)
				}
			}		
			if (key instanceof ServiceSet) {
				var oldServices =  target.VP_Aspects.findFirst(c | c instanceof ServiceSet)
				if (oldServices != null) {
					EcoreUtil2::replace(oldServices, copier.get(key))
				} else {
					target.VP_Aspects.add(copier.get(key) as Aspect)
				}
			}		
			if (key instanceof PropertySet) {
				var oldProperties =  target.VP_Aspects.findFirst(c | c instanceof PropertySet)
				if (oldProperties != null) {
					EcoreUtil2::replace(oldProperties, copier.get(key))
				} else {
					target.VP_Aspects.add(copier.get(key) as Aspect)
				}
			}
			
			if (key instanceof ViewpointActivityExplorer) {
				var oldViewpointActivityExplorer = target.VP_Aspects.findFirst(c | c instanceof ViewpointActivityExplorer)
				
				if (oldViewpointActivityExplorer != null){
					EcoreUtil2::replace(oldViewpointActivityExplorer, copier.get(key))
				} else {
					target.VP_Aspects.add(copier.get(key) as Aspect)
				}
			}
		}
		return target;
	}
	
	def boolean isEcoreURI(String uri) {
		return uri.startsWith("http://") || uri.endsWith(".ecore");
	}

	
	def setTargetName(Viewpoint viewpoint) { 
		if (viewpoint.name==null || viewpoint.name =="")
			viewpoint.name = CoreModelHelper::getViewpointName(viewpoint)
	}

	def createCopier(List<EObject> input) { 
		copier = new Copier(true, true);
		copier.copyAll(input.reverse);
		copier.copyReferences();
	}
	
	def setTargetRefrerences(List<EObject> input, Viewpoint target) { 
		for (EObject key : input) {
			rewriteURI(key, target)
		}
	}
	
	def rewriteURI(EObject originalRoot, EObject target) { 
		var eAllContents = originalRoot.eAllContents();
		while (eAllContents.hasNext()) {
			var candidate = eAllContents.next();
			var FeatureIterator featureIterator = candidate.eCrossReferences().iterator() as FeatureIterator
			while (featureIterator.hasNext) {
				var referenced = featureIterator.next
				var referenceName = featureIterator.feature as EReference
				var eObject = referenced as EObject
				var uriOriginal = EcoreUtil::getURI(eObject).fragment
				var done = false
				for (EObject key : copier.keySet) {
					var uriToFind = EcoreUtil::getURI(copier.get(key)).fragment.replaceFirst("/", "")
					if (uriOriginal.equals(uriToFind) && !done) {
						copier.get(candidate).eSet(referenceName, copier.get(key))
						done = true
					}
				}	
			}
		}
	}
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
	}
}