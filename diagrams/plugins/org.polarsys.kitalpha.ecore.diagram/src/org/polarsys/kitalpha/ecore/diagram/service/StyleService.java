package org.polarsys.kitalpha.ecore.diagram.service;

import java.net.URL;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EReferenceItemProvider;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;

public class StyleService {
	
	public Object getReferenceImage(EObject context){
		EcoreItemProviderAdapterFactory adapterFactory = new EcoreItemProviderAdapterFactory();
		FocusEReferenceItemProvider eReferenceItemProvider = new FocusEReferenceItemProvider(adapterFactory);
		final Object image = eReferenceItemProvider.getImage(context);
		return image;
	}
}

class FocusEReferenceItemProvider extends EReferenceItemProvider{
	public FocusEReferenceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public Object getImage(Object object) {
		URL url = getClass().getResource("/icons/styles/ESupperReference.gif");
		return overlayImage(object, getComposedImage(object, url));
	}
}