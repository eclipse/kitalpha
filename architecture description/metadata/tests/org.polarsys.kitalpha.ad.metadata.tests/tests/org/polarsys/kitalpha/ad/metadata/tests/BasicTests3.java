/*******************************************************************************
 * Copyright (c) 2018, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.metadata.tests;


import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.ViewpointMetadata;
import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public class BasicTests3 extends TestCase {

	private URI modelWithoutFileExtension1URI;
	private URI modelWithoutFileExtension2URI;
	private IProject project;

	@Override
	protected void setUp() throws Exception {
		IWorkspaceRoot workspaceRoot = EcorePlugin.getWorkspaceRoot();
		project = workspaceRoot.getProject("test");
		project.create(null);
		project.open(null);
		ResourceSet set = new ResourceSetImpl();  
		modelWithoutFileExtension1URI = copy2local(project, set, "/org.polarsys.kitalpha.ad.metadata.tests/resource/ModelWithoutFileExtension1");
		modelWithoutFileExtension2URI = copy2local(project, set, "/org.polarsys.kitalpha.ad.metadata.tests/resource/ModelWithoutFileExtension2");
		copy2local(project, set, "/org.polarsys.kitalpha.ad.metadata.tests/resource/ModelWithoutFileExtension2.afm");
		System.out.println();

		
	}

	private URI copy2local(IProject project, ResourceSet set, String uri) throws IOException {
		URI uriObj = URI.createPlatformPluginURI(uri, true);
		Resource resource = set.getResource(uriObj, true);
		IFile model = project.getFile(uriObj.lastSegment());
		URI targetUri = URI.createPlatformResourceURI(model.getFullPath().toString(), false);
		resource.setURI(targetUri);
		resource.save(null);
		return targetUri;
	}

	@Override
	protected void tearDown() throws Exception {
		project.delete(true, null);
	}

	public void testHelper1() throws Exception {
		ResourceSet set = new ResourceSetImpl();  
		set.getResource(modelWithoutFileExtension1URI, true);
		ViewpointMetadata m1 = MetadataHelper.getViewpointMetadata(set);
		Resource initMetadataStorage = m1.initMetadataStorage();
		assertNotNull(initMetadataStorage);
		assertNotSame(modelWithoutFileExtension1URI.path(), initMetadataStorage.getURI().path());
	}
	
	public void testHelper2() throws Exception {
		ResourceSet set = new ResourceSetImpl();  
		set.getResource(modelWithoutFileExtension1URI, true);
		ViewpointMetadata m1 = MetadataHelper.getViewpointMetadata(set);
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource("org.polarsys.kitalpha.vp.componentsampleperformance");
		assertNotNull(resource);
		m1.reference(resource, null);
		assertTrue(m1.isReferenced("org.polarsys.kitalpha.vp.componentsampleperformance"));
	}
	
	public void testHelper3() throws Exception {
		ResourceSet set = new ResourceSetImpl();  
		set.getResource(modelWithoutFileExtension2URI, true);
		ViewpointMetadata m1 = MetadataHelper.getViewpointMetadata(set);
		assertTrue(m1.isReferenced("org.polarsys.kitalpha.vp.componentsample"));
	}

}
