package org.polarsys.kitalpha.transposer.m2t.simplecomponent.ecore.rules;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescFactory;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement;

public class GenerateVPtext implements IGenerateVPText {


	@Override
	public Class getGeneratedClassOf(ComponentElement cm) {
		
		Class klass = VpdescFactory.eINSTANCE.createClass();
		klass.setAbstract(cm.eClass().isAbstract());
		klass.setDescription(cm.getDescription());
		klass.setName(cm.getName());
		
		return klass;
	}
	
}
