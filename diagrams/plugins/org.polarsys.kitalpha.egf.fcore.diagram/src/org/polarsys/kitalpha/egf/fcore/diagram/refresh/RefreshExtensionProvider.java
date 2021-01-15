package org.polarsys.kitalpha.egf.fcore.diagram.refresh;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtension;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtensionProvider;
import org.polarsys.kitalpha.egf.fcore.diagram.Activator;
import org.polarsys.kitalpha.egf.fcore.diagram.service.FCoreServices;

public class RefreshExtensionProvider implements IRefreshExtensionProvider, IRefreshExtension {

	public RefreshExtensionProvider() {
	}

	@Override
	public boolean provides(DDiagram viewPoint) {
		URI viewpointURI = viewPoint.getDescription().eResource().getURI();
		URI expectedURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/description/fcore.odesign", true);
		return viewpointURI.equals(expectedURI);
	}

	@Override
	public IRefreshExtension getRefreshExtension(DDiagram viewPoint) {
		return this;
	}

	@Override
	public void beforeRefresh(DDiagram dDiagram) {
		FCoreServices.clearVisitOnceFlags();
	}

	@Override
	public void postRefresh(DDiagram dDiagram) {
	}

}
