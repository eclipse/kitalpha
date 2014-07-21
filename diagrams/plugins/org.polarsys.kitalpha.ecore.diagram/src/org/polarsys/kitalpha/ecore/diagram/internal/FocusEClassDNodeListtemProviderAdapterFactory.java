package org.polarsys.kitalpha.ecore.diagram.internal;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.sirius.diagram.provider.DNodeListItemProvider;
import org.eclipse.sirius.diagram.provider.DiagramItemProviderAdapterFactory;

public class FocusEClassDNodeListtemProviderAdapterFactory extends DiagramItemProviderAdapterFactory {

	@Override
	public Adapter createDNodeListAdapter() {
		// TODO Auto-generated method stub
		return new FocusDNodeListItemProvider(this);
	}
	
	private static class FocusDNodeListItemProvider extends DNodeListItemProvider {

		public FocusDNodeListItemProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
		
		@Override
		public String getText(Object object) {
			return super.getText(object);
		}
	}
}
