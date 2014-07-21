package org.polarsys.kitalpha.transposer.m2t.simplecomponent.ecore.rules;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement;

public interface IGenerateVPText {
	public Class getGeneratedClassOf(ComponentElement cm);
}
