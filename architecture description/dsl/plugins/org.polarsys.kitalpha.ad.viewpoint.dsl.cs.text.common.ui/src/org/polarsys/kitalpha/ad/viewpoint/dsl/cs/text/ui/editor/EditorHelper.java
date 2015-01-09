package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.editor;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.WorkspaceResourceHelper;

public class EditorHelper {
	
	public static void getAllResourcesOfOpenedEditors(String project, final Collection<XtextResource> resources){
		
		IEditorReference[] openedEditorReference = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences();
		
		for (IEditorReference iEditorReference : openedEditorReference) {
			IEditorPart editor = iEditorReference.getEditor(false);
			if (editor instanceof VpdslEditor){
				VpdslEditor vpdslEditor = (VpdslEditor)editor;

				vpdslEditor.getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {
					@Override
					public void process(XtextResource resource){
						resources.add(resource);
					}
				});
			}
		}
	}
	
	
	public static Collection<String> getLoadedResourcesURI(ResourceSet resourceSet){
		EList<Resource> resources = resourceSet.getResources();
		
		Collection<String> uris = new HashSet<String>();
		for (Resource resource : resources) {
			uris.add(resource.getURI().toString());
		}
		
		return uris;
	}
	
	public static void getResourcesOfClosedEditors(String project, ResourceSet resourceSet){
		
		//FIXME: use resourcereuse
		List<IFile> vptextFiles = WorkspaceResourceHelper.collectProjectResources(project, ".vptext"); //$NON-NLS-1$
		
		Collection<String> uris = getLoadedResourcesURI(resourceSet);
		
		for (IFile iFile : vptextFiles) {
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), false);
			
			if (!uris.contains(uri.toString()))
				ResourceHelper.loadResource(iFile, resourceSet);
		}
	}
	
	
	public static void copyResourceContentsInResourceSet(Collection<XtextResource> resources, ResourceSet resourceSet){
		for (XtextResource xtextResource : resources) {
			URI uri = xtextResource.getURI();
			
			Resource resource = ResourceHelper.loadResource(uri, resourceSet);
			
			try {
				//FIXME: Hack - find another way to do it (this is done to avoid node attachment when resolve references)
				
				String content = xtextResource.getSerializer().serialize(xtextResource.getContents().get(0));
				if (content != null){
					resource.getContents().clear();
					((XtextResource)resource).reparse(content);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
}
