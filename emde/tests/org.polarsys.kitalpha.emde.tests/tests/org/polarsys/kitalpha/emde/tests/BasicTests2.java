/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.emde.extension.ExtendedModel;
import org.polarsys.kitalpha.emde.extension.ExtensibleModel;
import org.polarsys.kitalpha.emde.extension.ModelExtensionDescriptor;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.extension.ModelExtensionListener;
import org.polarsys.kitalpha.emde.extension.ModelExtensionManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionOverallListener;

import junit.framework.TestCase;


/**
 * @author Thomas Guiu
 * 
 */
public class BasicTests2 extends TestCase {


	private final class Listener implements ModelExtensionListener {
		public boolean enableFlag, disableFlag; 
		@Override
		public void modelEnabled(String nsURI) {
			enableFlag = true;
		}

		@Override
		public void modelDisabled(String nsURI) {
			disableFlag = true;
		}
	}

	private final class OListener implements ModelExtensionOverallListener {
		public boolean enableFlag, disableFlag; 
		@Override
		public void modelEnabled(Object ctx, String nsURI) {
			enableFlag = true;
		}

		@Override
		public void modelDisabled(Object ctx, String nsURI) {
			disableFlag = true;
		}
	}

	private ResourceSet set;
	private ModelExtensionManager mgr;
	private Resource resource;

	@Override
	protected void setUp() throws Exception {
		set = new ResourceSetImpl();  
		mgr = ModelExtensionHelper.getInstance(set);
		URI uri = URI.createPlatformPluginURI("/org.polarsys.kitalpha.emde.tests/resource/My.componentsample", true);
		resource = set.getResource(uri, true);
	}

	@Override
	protected void tearDown() throws Exception {
		for (Resource r : set.getResources())
			r.unload();
		set.getResources().clear();
	}

	public void testManager1() throws Exception {
		ExtensibleModel extensibleModel = ModelExtensionDescriptor.INSTANCE.getExtensibleModel("http://www.polarsys.org/kitalpha/ComponentSample/1.0.0");
		ExtendedModel extended = extensibleModel.getInheritedExtendedModel("http://www.polarsys.org/kitalpha/ComponentSamplePerformance/1.0.0");

		assertFalse(mgr.canDisableExtensionModel(extended)); //part of a viewpoint, so we can disable it at emde level
		assertTrue(mgr.isExtensionModelDisabled(extended));
	}
	
	public void testManager2() throws Exception {
		EObject root = resource.getContents().get(0);
		assertFalse(mgr.isExtensionModelDisabled(resource));
		assertFalse(mgr.isExtensionModelDisabled((Object)root));
	}
	
	public void testManager3() throws Exception {
		assertTrue(mgr.getDelegates().isEmpty());
	}

	public void testManager4() throws Exception {
		ExtensibleModel extensibleModel = ModelExtensionDescriptor.INSTANCE.getExtensibleModel("http://www.polarsys.org/kitalpha/ComponentSample/1.0.0");
		ExtendedModel extended = extensibleModel.getInheritedExtendedModel("http://www.polarsys.org/kitalpha/ComponentSamplePerformance/1.0.0");
		assertTrue(mgr.isExtensionModelDisabled(extended));
		mgr.setExtensionModelDisabled(extensibleModel, extended, false);
		assertFalse(mgr.isExtensionModelDisabled(extended));
	}

	public void testManager5() throws Exception {
		assertTrue(mgr.isExtensionModelDisabled("http://www.polarsys.org/kitalpha/ComponentSample/1.0.0", "http://www.polarsys.org/kitalpha/ComponentSampleSafety/1.0.0"));
	}

	public void testManager6() throws Exception {
		
		ExtensibleModel extensibleModel = ModelExtensionDescriptor.INSTANCE.getExtensibleModel("http://www.polarsys.org/kitalpha/ComponentSample/1.0.0");
		ExtendedModel extended = extensibleModel.getInheritedExtendedModel("http://www.polarsys.org/kitalpha/ComponentSamplePerformance/1.0.0");
		mgr.setExtensionModelDisabled(extensibleModel, extended, true);
		
		Listener l = new Listener();
		mgr.addListener(l);
		mgr.setExtensionModelDisabled(extensibleModel, extended, false);
		assertTrue(l.enableFlag);
	}

	public void testManager7() throws Exception {
		
		ExtensibleModel extensibleModel = ModelExtensionDescriptor.INSTANCE.getExtensibleModel("http://www.polarsys.org/kitalpha/ComponentSample/1.0.0");
		ExtendedModel extended = extensibleModel.getInheritedExtendedModel("http://www.polarsys.org/kitalpha/ComponentSamplePerformance/1.0.0");
		
		Listener l = new Listener();
		mgr.addListener(l);
		mgr.removeListener(l);
		mgr.setExtensionModelDisabled(extensibleModel, extended, false);
		assertFalse(l.enableFlag);
	}

	public void testManager8() throws Exception {
		
		ExtensibleModel extensibleModel = ModelExtensionDescriptor.INSTANCE.getExtensibleModel("http://www.polarsys.org/kitalpha/ComponentSample/1.0.0");
		ExtendedModel extended = extensibleModel.getInheritedExtendedModel("http://www.polarsys.org/kitalpha/ComponentSamplePerformance/1.0.0");
		mgr.setExtensionModelDisabled(extensibleModel, extended, true);
		
		OListener l = new OListener();
		ModelExtensionHelper.addOverallListener(l);
		mgr.setExtensionModelDisabled(extensibleModel, extended, false);
		assertTrue(l.enableFlag);
	}

	public void testManager9() throws Exception {
		
		ExtensibleModel extensibleModel = ModelExtensionDescriptor.INSTANCE.getExtensibleModel("http://www.polarsys.org/kitalpha/ComponentSample/1.0.0");
		ExtendedModel extended = extensibleModel.getInheritedExtendedModel("http://www.polarsys.org/kitalpha/ComponentSamplePerformance/1.0.0");
		
		OListener l = new OListener();
		ModelExtensionHelper.addOverallListener(l);
		ModelExtensionHelper.removeOverallListener(l);
		mgr.setExtensionModelDisabled(extensibleModel, extended, false);
		assertFalse(l.enableFlag);
	}


}
