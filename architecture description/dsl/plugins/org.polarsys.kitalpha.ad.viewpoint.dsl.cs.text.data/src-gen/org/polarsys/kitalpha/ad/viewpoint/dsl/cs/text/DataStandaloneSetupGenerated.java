
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
@SuppressWarnings("all")
public class DataStandaloneSetupGenerated implements ISetup {

	public Injector createInjectorAndDoEMFRegistration() {
		org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.CommonStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.DataRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/cs/text/data/1.0.0")) {
		EPackage.Registry.INSTANCE.put("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/cs/text/data/1.0.0", org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("data.vptext", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("data.vptext", serviceProvider);
		



	}
}
