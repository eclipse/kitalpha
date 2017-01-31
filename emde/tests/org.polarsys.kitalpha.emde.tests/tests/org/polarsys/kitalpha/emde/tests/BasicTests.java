/*******************************************************************************
 * Copyright (c) 2016-2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.emde.extension.ExtensibleModel;
import org.polarsys.kitalpha.emde.extension.ModelExtensionDescriptor;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.extension.ModelExtensionManager;

import junit.framework.TestCase;

/**
 * @author Thomas Guiu
 * 
 */
public class BasicTests extends TestCase {

	public void testManager1() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();
		ModelExtensionManager m1 = ModelExtensionHelper.getInstance(set1);
		assertNotNull(m1);
	}

	public void testManager2() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();
		ResourceSet set2 = new ResourceSetImpl();
		ModelExtensionManager m1 = ModelExtensionHelper.getInstance(set1);
		ModelExtensionManager m2 = ModelExtensionHelper.getInstance(set2);
		assertNotSame(m1, m2);
	}

	public void testManager3() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();
		ModelExtensionManager m1 = ModelExtensionHelper.getInstance(set1);
		ModelExtensionManager m2 = ModelExtensionHelper.getInstance(set1);
		assertEquals(m1, m2);
	}

	public void testManager4() throws Exception {
		ResourceSet set1 = new ResourceSetImpl();
		ModelExtensionManager m1 = ModelExtensionHelper.getInstance(set1);
		URI uri = URI.createPlatformPluginURI("/org.polarsys.kitalpha.emde.tests/resource/My.componentsample", true);
		Resource resource = set1.getResource(uri, true);

		ModelExtensionManager m2 = ModelExtensionHelper.getInstance(resource);
		assertEquals(m1, m2);

		assertFalse(resource.getContents().isEmpty());
		ModelExtensionManager m3 = ModelExtensionHelper.getInstance(resource.getContents().get(0));
		assertEquals(m1, m3);
	}

	public void testManager5() throws Exception {
		ExtensibleModel extensibleModel = ModelExtensionDescriptor.INSTANCE.getExtensibleModel("http://www.eclipse.org/egf/1.0.2/buildstep");
		assertNotNull(extensibleModel);
		assertNotNull(extensibleModel.getName());
		assertNotNull(extensibleModel.getPath());
		assertNotNull(extensibleModel.getAllExtendedModels());
		assertNotNull(extensibleModel.getEPackage());
		assertNotNull(extensibleModel.getURIFactory());
		assertNotNull(extensibleModel.getQualifiedName());
		assertNotNull(extensibleModel.getAdapterFactory());
		assertNotNull(extensibleModel.getExtendedModels());
		assertNotNull(extensibleModel.getInheritedExtendedModels());
		assertNotNull(extensibleModel.getInheritedExtensibleModels());
	}

	public void testManager6() throws Exception {
		ExtensibleModel extensibleModel = ModelExtensionDescriptor.INSTANCE.getExtensibleModel("http://www.polarsys.org/kitalpha/ComponentSample/1.0.0");
		assertNotNull(extensibleModel.getInheritedExtendedModel("http://www.polarsys.org/kitalpha/ComponentSamplePerformance/1.0.0"));
		assertNotNull(extensibleModel.getInheritedExtendedModel("http://www.polarsys.org/kitalpha/ComponentSampleSafety/1.0.0"));
		assertNotNull(extensibleModel.getInheritedExtendedModel("http://www.polarsys.org/kitalpha/ComponentSamplePerformance/1.0.0"));
		assertNotNull(extensibleModel.getInheritedExtendedModel("http://www.polarsys.org/kitalpha/ComponentSampleQualityAssessment/1.0.0"));
	}
	
	public void testManager7() throws Exception {
		try {
			ModelExtensionManager m1 = ModelExtensionHelper.getInstance(EcoreFactory.eINSTANCE.createEObject());
			fail("expecting an exception");
		} catch (IllegalArgumentException e ) {
		}
	}
	public void testManager8() throws Exception {
		try {
			ModelExtensionManager m1 = ModelExtensionHelper.getInstance((EObject)null);
			fail("expecting an exception");
		} catch (IllegalArgumentException e ) {
		}
	}
	public void testManager9() throws Exception {
		try {
			EObject obj = EcoreFactory.eINSTANCE.createEObject();
			Resource r = new ResourceImpl();
			r.getContents().add(obj);
			ModelExtensionManager m1 = ModelExtensionHelper.getInstance(r);
			fail("expecting an exception");
		} catch (IllegalArgumentException e ) {
		}
	}
	public void testManager10() throws Exception {
		try {
			ModelExtensionManager m1 = ModelExtensionHelper.getInstance((ResourceSet)null);
			fail("expecting an exception");
		} catch (IllegalArgumentException e ) {
		}
	}
}
