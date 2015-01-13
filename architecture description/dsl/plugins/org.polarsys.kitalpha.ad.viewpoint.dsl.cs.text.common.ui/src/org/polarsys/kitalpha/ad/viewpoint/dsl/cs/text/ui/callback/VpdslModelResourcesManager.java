package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;

/**
 * Manage viewpoints models workspace resources and its properties
 * @author Faycal Abka
 *
 */
public class VpdslModelResourcesManager {
	
	private final static Collection<IResource> modelResources = new HashSet<IResource>();
	private final static QualifiedName syncQualifiedName = new QualifiedName("syncState", "Prefix");
	
	public final static VpdslModelResourcesManager INSTANCE = new VpdslModelResourcesManager();
	
	private VpdslModelResourcesManager() {
	}
	
	public static void addResource(IResource resource){
		if (!modelResources.contains(resource))
			modelResources.add(resource);
	}
	
	public static void removeResource(IResource resource){
		if (modelResources.contains(resource))
			modelResources.remove(resource);
	}

	public static Collection<IResource> getModelResources() {
		return modelResources;
	}

	public static QualifiedName getSyncQualifiedName() {
		return syncQualifiedName;
	}
	
	public static void addPersistentProperty(IResource resource, String value){
		if (!getModelResources().contains(resource))
			getModelResources().add(resource);
		
		try {
			resource.setPersistentProperty(getSyncQualifiedName(), value);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	
	public static String getPersistentPropertyValue(IResource resource){
		try {
			if (getModelResources().contains(resource))
				return resource.getPersistentProperty(getSyncQualifiedName());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return ""; //Never return null
	}

	public static void reInitPersistentPropertyValue(IResource resource, String value) {
		addPersistentProperty(resource, value);
	}
	
}
