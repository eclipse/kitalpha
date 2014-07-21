package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.extension;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.extension.AbstractAspectExtensionFilter;

public class BuildExtensionFilter extends AbstractAspectExtensionFilter {

	@Override
	public boolean acceptAspect(Aspect aspect) {
		return aspect instanceof Build;
	}

}
