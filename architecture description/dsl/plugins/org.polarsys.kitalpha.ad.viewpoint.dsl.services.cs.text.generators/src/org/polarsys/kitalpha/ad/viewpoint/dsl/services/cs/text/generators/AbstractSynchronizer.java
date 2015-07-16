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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertySet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.RuleSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Service;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpspec.CoreModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.EditorIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.Services;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.PluginUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.setup.BackwardSynchronizerSetup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util.GeneratorsUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util.ReferenceUtil;

import com.google.inject.Inject;
import com.google.inject.Injector;
/**
 * 
 * @author Amine Lajmi
 *
 */
public abstract class AbstractSynchronizer implements IViewpointBackwardSynchronizer{

	@Inject
	private Injector injector;
	
	protected EcoreUtil.Copier copier;
	
	protected Injector getInjector() {
		if (injector==null) {
			injector = new BackwardSynchronizerSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}

	protected void createCopier(List<EObject> input) {
		copier = new EcoreUtil.Copier(true, true);
		copier.copyAll(input);
		copier.copyReferences();
	}

	public void doBackwardSynchronize(IStructuredSelection selection) {
		doBackwardSynchronize(GeneratorsUtil.computeURI(selection));
	}
	
	public boolean doBackwardSynchronize(URI emfURI) {
		ResourceSet resourceSet = getInjector().getInstance(XtextResourceSet.class);	
		EObject modelRoot = loadInputModel(emfURI, resourceSet);
		if (modelRoot!=null) {
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint sourceVp = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint)modelRoot;
			List<EObject> input = new ArrayList<EObject>();		
			for (EObject aspect : modelRoot.eContents()) {
				EcoreUtil.resolveAll(aspect);
				input.add(aspect);
			}		
			createCopier(input);
			Resource primaryResource = loadPrimaryResource(modelRoot, resourceSet);
			Viewpoint targetVp = null;
			if (!primaryResource.getContents().isEmpty())
				targetVp = (Viewpoint) primaryResource.getContents().get(0);
			else {
				targetVp = VpspecFactory.eINSTANCE.createViewpoint();
				targetVp.setName(sourceVp.getName()!=null?sourceVp.getName():sourceVp.getShortName());
				targetVp.setShortName(sourceVp.getShortName());
				primaryResource.getContents().add(targetVp);
			}
			ReferenceUtil.setTargetReferences(sourceVp, targetVp, resourceSet);
			//dispatch backward synchronization
			targetVp = doBackwardSynchronize(modelRoot, targetVp, resourceSet);
			if (validateObject(targetVp, (XtextResource)primaryResource)) {
				String serializationContent = ((XtextResource)primaryResource).getSerializer().serialize(targetVp);
				String newContent = appendCopyRightHeader(targetVp, targetVp.getShortName()) + serializationContent;
				saveNewResource((XtextResource)primaryResource, newContent);
				return true;
			}
		}
		return false;
	}

	public Viewpoint doBackwardSynchronize(EObject modelRoot, Viewpoint viewpoint, ResourceSet resourceSet) {
		Map<Integer, EObject> output = new HashMap<Integer, EObject>();
		
		//Data
		Data data = ((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint) modelRoot).getVP_Data();
		output.put(0, backwardSynchronize(data, loadDataResource(data, resourceSet)));
		EList<Aspect> aspects = ((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint) modelRoot).getVP_Aspects();		
        
        //Configuration
        Aspect aspect = IterableExtensions.<Aspect>findFirst(aspects, new Function1<Aspect,Boolean>() {
            public Boolean apply(final Aspect c) {
                return Boolean.valueOf((c instanceof Configuration));
              }
            });
          if (aspect!=null)
          	output.put(5, backwardSynchronize((Configuration)aspect, loadConfigurationResource(aspect, resourceSet)));
		
        //UI
        aspect = IterableExtensions.<Aspect>findFirst(aspects,  new Function1<Aspect,Boolean>() {
            public Boolean apply(final Aspect c) {
                return Boolean.valueOf((c instanceof UIDescription));
              }
            });
        if (aspect!=null) {
        	output.put(1, backwardSynchronize((UIDescription) aspect, loadUIResource(aspect, resourceSet)));
        }
        //Diagrams
        aspect = IterableExtensions.<Aspect>findFirst(aspects, new Function1<Aspect,Boolean>() {
            public Boolean apply(final Aspect c) {
                return Boolean.valueOf((c instanceof DiagramSet));
              }
            });
        if (aspect!=null)
        	output.put(2, backwardSynchronize((DiagramSet)aspect, loadDiagramResource(aspect, resourceSet)));
        
        //Activity Explorer
        aspect = IterableExtensions.<Aspect>findFirst(aspects, new Function1<Aspect, Boolean>() {

			@Override
			public Boolean apply(Aspect c) {
				return Boolean.valueOf((c instanceof ViewpointActivityExplorer));
			}
		});
        
        if (aspect != null)
        	output.put(3, backwardSynchronize((ViewpointActivityExplorer)aspect, loadViewpointActivityExplorerResource(aspect, resourceSet)));
       
        //Services
        Iterable<Aspect> filter = IterableExtensions.<Aspect>filter(aspects, new Function1<Aspect,Boolean>() {
            public Boolean apply(final Aspect c) {
                return Boolean.valueOf((c instanceof RuleSet || c instanceof PropertySet || c instanceof ServiceSet));
              }
            });
        if (filter.iterator().hasNext())
        	output.put(4,assembleServices(filter, loadServicesResource(filter.iterator().next(), resourceSet)));
        
        //Build
        aspect = IterableExtensions.<Aspect>findFirst(aspects, new Function1<Aspect,Boolean>() {
            public Boolean apply(final Aspect c) {
                return Boolean.valueOf((c instanceof Build));
              }
            });
        if (aspect!=null)
        	output.put(5, backwardSynchronize((Build) aspect, loadBuildResource(aspect, resourceSet)));
        
        //Primary resource
        return assembleViewpoint(viewpoint, output);
	}
	
	public abstract EObject backwardSynchronize(UIDescription object, Resource target);
	
	public abstract EObject backwardSynchronize(Data object, Resource target);
	
	public abstract EObject backwardSynchronize(Configuration object, Resource target);
	
	public abstract EObject backwardSynchronize(DiagramSet object, Resource target);
	
	public abstract EObject backwardSynchronize(Build object, Resource target);
	
	public abstract EObject backwardSynchronize(ViewpointActivityExplorer object, Resource target);
	
	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {}
	
	protected EObject backwardSynchronize(EObject inputAspect, Resource resource) {
		XtextResource textResource = (XtextResource) resource;
		String newContent = null;
		EObject clone = copier.get(inputAspect);
		if (textResource.getContents().isEmpty()) {
			textResource.getContents().add(clone);
		} else {
			EObject oldRoot = textResource.getContents().get(0);
			EcoreUtil2.replace(oldRoot, clone);
		}
		ReferenceUtil.recoverReferences(inputAspect, copier);
		String serializationContent = textResource.getSerializer().serialize(clone);
		newContent = appendCopyRightHeader(clone, CoreModelHelper.getViewpointShortName(inputAspect)) + serializationContent;
		if (saveNewResource(textResource, newContent))
			return textResource.getContents().get(0);
		return null;
	}

	protected EObject assembleServices(Iterable<Aspect> inputAspects, Resource resource) {
		XtextResource textResource = (XtextResource) resource;
		List<Aspect> aspects = new ArrayList<Aspect>();
		Function1<Aspect, Boolean> function = new Function1<Aspect, Boolean>() {
			public Boolean apply(final Aspect c) {
				return Boolean.valueOf((c instanceof RuleSet));
			}
		};
		aspects.add(IterableExtensions.<Aspect> findFirst(inputAspects, function));
		function = new Function1<Aspect, Boolean>() {
			public Boolean apply(final Aspect c) {
				return Boolean.valueOf((c instanceof PropertySet));
			}
		};
		aspects.add(IterableExtensions.<Aspect> findFirst(inputAspects, function));
		function = new Function1<Aspect, Boolean>() {
			public Boolean apply(final Aspect c) {
				return Boolean.valueOf((c instanceof ServiceSet));
			}
		};
		aspects.add(IterableExtensions.<Aspect> findFirst(inputAspects, function));
		EObject service = backwardSynchronize(aspects, textResource);
		return service;
	}

	protected Viewpoint assembleViewpoint(Viewpoint viewpoint, Map<Integer, EObject> output) {
		IResourceServiceProvider resourceServiceProvider = ((XtextResource)viewpoint.eResource()).getResourceServiceProvider();
		VpspecGrammarAccess grammar = (VpspecGrammarAccess) resourceServiceProvider.get(IGrammarAccess.class);
		viewpoint.getVP_Aspects().clear();
		viewpoint.getType().clear();
		for (Integer key: output.keySet()) {			
			if (output.get(key) instanceof DataSpec) {
				viewpoint.setVP_Data(((DataSpec) output.get(key)).getData());
			}
			if (output.get(key) instanceof UserInterface) {
				viewpoint.getVP_Aspects().add(((UserInterface) output.get(key)).getUiDescription());
				viewpoint.getType().add(grammar.getViewpointAccess().getTypeUIKeyword_14_0_0().getValue());
			}
			if (output.get(key) instanceof Diagrams) {
				viewpoint.getVP_Aspects().add(((Diagrams) output.get(key)).getDiagrams());
				viewpoint.getType().add(grammar.getViewpointAccess().getTypeDiagramsKeyword_15_0_0().getValue());
			}
			if (output.get(key) instanceof Services) {
				viewpoint.getVP_Aspects().add(((Services) output.get(key)).getServices().get(0));
				viewpoint.getType().add(grammar.getViewpointAccess().getTypeServicesKeyword_17_0_0().getValue());
			}
			if (output.get(key) instanceof Configuration) {
				viewpoint.getVP_Aspects().add((Configuration) output.get(key));
				viewpoint.getType().add(grammar.getViewpointAccess().getTypeConfigurationKeyword_19_0_0().getValue());
			}
			if (output.get(key) instanceof Build) {
				viewpoint.getVP_Aspects().add((Build) output.get(key));
				viewpoint.getType().add(grammar.getViewpointAccess().getTypeBuildKeyword_18_0_0().getValue());
			}
			if (output.get(key) instanceof ViewpointActivityExplorer) {
				viewpoint.getVP_Aspects().add((ViewpointActivityExplorer)output.get(key));
				viewpoint.getType().add(grammar.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0().getValue());
			}
		}
		return viewpoint;
	}

	protected Resource loadPrimaryResource(EObject inputObject, ResourceSet resourceSet) {
		String projectName = EcoreUtil.getURI(inputObject).segment(1);
		URI uri = ResourceHelper.getPrimaryResourceURI(projectName);
		if (uri==null) {
			Resource resource = ResourceHelper.createResource(GeneratorsUtil.computeURI(inputObject, FileExtension.SPECIFICATION_EXTENSION, null), resourceSet);
			PluginUtil.addModelReuseExtension(projectName, inputObject, resource.getURI());
			return resource;
		}
		List<EObject> primaryObjects = ResourceHelper.loadPrimaryResource(uri, resourceSet);
		if (primaryObjects != null && !primaryObjects.isEmpty()){
			if (primaryObjects.get(0) != null)
				return primaryObjects.get(0).eResource();
		}
		return resourceSet.getResource(uri, false);
	}
	
	protected Resource loadDataResource(EObject inputObject, ResourceSet resourceSet) {
		String projectName = EcoreUtil.getURI(inputObject).segment(1);
		List<URI> uris = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.DATA_EXTENSION, projectName);
		if (uris.isEmpty()) {
			Resource resource = ResourceHelper.createResource(GeneratorsUtil.computeURI(inputObject, FileExtension.DATA_EXTENSION, null), resourceSet);
			ResourceHelper.loadExternalLibrary(resourceSet);
			PluginUtil.addModelReuseExtension(projectName, inputObject, resource.getURI());
			return resource;
		}
		List<EObject> dataResource = ResourceHelper.loadDataResource(uris.get(0), resourceSet);
		for (EObject object: dataResource) {
			if (object.eResource()!=null)
				return object.eResource();
		}
		
		return ResourceHelper.loadResource(uris.get(0), resourceSet);
	}
	
	protected Resource loadConfigurationResource(EObject inputObject, ResourceSet resourceSet) {
		String projectName = EcoreUtil.getURI(inputObject).segment(1);
		List<URI> uris = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.CONFIGURATION_EXTENSION, projectName);
		if (uris.isEmpty()) {
			Resource resource = ResourceHelper.createResource(GeneratorsUtil.computeURI(inputObject, FileExtension.CONFIGURATION_EXTENSION, null), resourceSet);
			PluginUtil.addModelReuseExtension(projectName, inputObject, resource.getURI());
			return resource;
		}
		
		List<EObject> configObjects = ResourceHelper.loadConfigurationResource(uris.get(0), resourceSet);
	
		if (configObjects != null && !configObjects.isEmpty()){
			if (configObjects.get(0) != null)
				return configObjects.get(0).eResource();
		}
		
		return ResourceHelper.loadResource(uris.get(0), resourceSet);
		
	}
	
	protected Resource loadBuildResource(EObject inputObject, ResourceSet resourceSet) {
		String projectName = EcoreUtil.getURI(inputObject).segment(1);
		List<URI> uris = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.BUILD_EXTENSION, projectName);
		if (uris.isEmpty()) {
			Resource resource = ResourceHelper.createResource(GeneratorsUtil.computeURI(inputObject, FileExtension.BUILD_EXTENSION, null), resourceSet);
			PluginUtil.addModelReuseExtension(projectName, inputObject, resource.getURI());
			return resource;
		} 
		
		List<EObject> buildObjects = ResourceHelper.loadBuildResource(uris.get(0), resourceSet);
		
		if (buildObjects != null && !buildObjects.isEmpty()){
			if (buildObjects.get(0) != null)
				return buildObjects.get(0).eResource();
		}
		
		return ResourceHelper.loadResource(uris.get(0), resourceSet);
	}
	
	protected Resource loadDiagramResource(EObject inputObject, ResourceSet resourceSet) {
		String projectName = EcoreUtil.getURI(inputObject).segment(1);
		List<URI> uris = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.DIAGRAM_EXTENSION, projectName);
		if (uris.isEmpty()) {
			Resource resource = ResourceHelper.createResource(GeneratorsUtil.computeURI(inputObject, FileExtension.DIAGRAM_EXTENSION, null), resourceSet);
			PluginUtil.addModelReuseExtension(projectName, inputObject, resource.getURI());
			return resource;
		} 
		List<EObject> diagramResource = ResourceHelper.loadDiagramResource(uris.get(0), resourceSet);
		for (EObject object: diagramResource) {
			if (object.eResource()!=null)
				return object.eResource();
		}
		return ResourceHelper.loadResource(uris.get(0), resourceSet);
	}

	protected Resource loadUIResource(EObject inputObject, ResourceSet resourceSet) {
		String projectName = EcoreUtil.getURI(inputObject).segment(1);
		List<URI> uris = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.UI_EXTENSION, projectName);
		if (uris.isEmpty()) {
			Resource resource = ResourceHelper.createResource(GeneratorsUtil.computeURI(inputObject, FileExtension.UI_EXTENSION, null), resourceSet);
			PluginUtil.addModelReuseExtension(projectName, inputObject, resource.getURI());
			return resource;
		} 
		List<EObject> uiResource = ResourceHelper.loadUIResource(uris.get(0), resourceSet);
		for (EObject object: uiResource) {
			if (object.eResource()!=null)
				return object.eResource();
		}
		return ResourceHelper.loadResource(uris.get(0), resourceSet);
	}
	
	protected Resource loadServicesResource(EObject inputObject, ResourceSet resourceSet) {
		String projectName = EcoreUtil.getURI(inputObject).segment(1);
		List<URI> uris = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.SERVICES_EXTENSION, projectName);
		if (uris.isEmpty()) {
			Resource resource = ResourceHelper.createResource(GeneratorsUtil.computeURI(inputObject, FileExtension.SERVICES_EXTENSION, null), resourceSet);
			PluginUtil.addModelReuseExtension(projectName, inputObject, resource.getURI());
			return resource;
		} 
		
		List<EObject> serviceResource = ResourceHelper.loadServicesResource(uris.get(0), resourceSet);
		for (EObject object: serviceResource) {
			if (object.eResource()!=null)
				return object.eResource();
		}
		return ResourceHelper.loadResource(uris.get(0), resourceSet);
	}
	
	protected Resource loadViewpointActivityExplorerResource(EObject inputObject, ResourceSet resourceSet){
		
		String projectName = EcoreUtil.getURI(inputObject).segment(1);
		List<URI> uris = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.ACTIVITYEXPLORER_EXTENSION, projectName);
		
		if (uris.isEmpty())
		{
			Resource resource = ResourceHelper.createResource(GeneratorsUtil.computeURI(inputObject, FileExtension.ACTIVITYEXPLORER_EXTENSION,  null), resourceSet);
			PluginUtil.addModelReuseExtension(projectName, inputObject, resource.getURI());
			return resource;
		}
		
		List<EObject> activityExplorerContent = ResourceHelper.loadActivityexplorerResource(uris.get(0), resourceSet);
		for (EObject eObject : activityExplorerContent) {
			if (eObject.eResource() != null)
				return eObject.eResource();
		}
		
		return ResourceHelper.loadResource(uris.get(0), resourceSet);
	}

	protected EObject loadInputModel(IFile file , ResourceSet resourceSet) {
		IPath emfResourcePath = file.getFullPath();
		URI emfUri = URI.createPlatformResourceURI(emfResourcePath.toString(), true);
		return loadInputModel(emfUri, resourceSet);
	}

	protected EObject loadInputModel(URI emfUri , ResourceSet resourceSet) {
		Resource emfResource = resourceSet.getResource(emfUri, true);
		EObject modelRoot =  emfResource.getContents().get(0);
		if (modelRoot !=null) 
			EcoreUtil.resolveAll(modelRoot);
		return modelRoot;
	}
	
	
	protected boolean saveNewResource(XtextResource textResource, String content) {
		try {
			textResource.reparse(content);					
			final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
			textResource.save(saveOptions);			
			//update the IDE bindings
			IFile file = getWorkspaceRoot().getFile(new Path(textResource.getURI().toPlatformString(true)));
			if (file !=null) {
				IDE.setDefaultEditor(file,EditorIDs.getEditorID(ResourceHelper.getFileExtension(file)));
			}			
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}	
	}

	protected String appendCopyRightHeader(EObject modelRoot, String shortName) {
		ICompositeNode node = NodeModelUtils.getNode(modelRoot);
		if (node!=null) {
			ICompositeNode rootNode = node.getRootNode();
			Iterable<ILeafNode> leafNodes = rootNode.getLeafNodes();
			Iterator<ILeafNode> iterator = leafNodes.iterator();
			while(iterator.hasNext()) {
				ILeafNode l = iterator.next();
				if (isCommentNode(l))
					return "";
			}
		}
		return getHeaderComment(shortName);
	}
	
	protected boolean isCommentNode(INode node) {
		if (node instanceof ILeafNode && ((ILeafNode) node).isHidden()
				&& node.getGrammarElement() instanceof AbstractRule)
			return isComment((AbstractRule) node.getGrammarElement());
		return false;
	}
	
	protected boolean isComment(AbstractRule rule) {
		return rule != null && ("ML_COMMENT".equals(rule.getName()) || "SL_COMMENT".equals(rule.getName()));
	}
		
	protected void removeUnmanagedTransientValues(EObject modelRoot) {
		if (modelRoot instanceof ViewpointElement) {
			((ViewpointElement) modelRoot).setId(null);
			TreeIterator<Object> allContents = EcoreUtil2.getAllContents(modelRoot, true);
			while(allContents.hasNext()) {
				EObject objectToChange = (EObject) allContents.next();
				if (objectToChange instanceof ViewpointElement) {
					((ViewpointElement)objectToChange).setId(null);
				}
				if (objectToChange instanceof Rule) {
					((Rule)objectToChange).eUnset(objectToChange.eClass().getEStructuralFeature(VpservicesPackage.RULE__VPID));
				}
				if (objectToChange instanceof Service) {
					((Service)objectToChange).eUnset(objectToChange.eClass().getEStructuralFeature(VpservicesPackage.SERVICE__VPID));
				}
			}		
		}
	}
	
	protected boolean validateObject(EObject object, XtextResource hostingResource) {
		removeUnmanagedTransientValues(object);
		List<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
		IConcreteSyntaxValidator concreteSyntaxValidator = hostingResource.getConcreteSyntaxValidator();
		concreteSyntaxValidator.validateRecursive(object, new IConcreteSyntaxValidator.DiagnosticListAcceptor(diagnostics), new HashMap<Object, Object>());
		if (!diagnostics.isEmpty()) {
			return false;
		}
		return true;
	}
	
	protected String getHeaderComment(String shortName) {
		String fileHeader = 
				"/**\n" + 
				" * Copyright (c) " + GeneratorsUtil.COPYRIGHT_KITALPHA + ", " + GeneratorsUtil.getCurrentYear() + ". All rights reserved. \n" +
				" *\n" +
				" *	Viewpoint " + shortName + "\n" +
				" *	@author: " + GeneratorsUtil.getCurrentUserName() + "\n" +
				" *	@date: " + GeneratorsUtil.getCurrentDate()+"\n" +
				" *\n" +
				" */\n";
		return fileHeader;
	}
	
	protected IWorkspaceRoot getWorkspaceRoot() {
		return  ResourcesPlugin.getWorkspace().getRoot();
	}
}
