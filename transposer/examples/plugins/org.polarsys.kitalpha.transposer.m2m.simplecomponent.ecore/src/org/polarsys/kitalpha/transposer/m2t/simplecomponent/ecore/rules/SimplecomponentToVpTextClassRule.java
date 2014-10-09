package org.polarsys.kitalpha.transposer.m2t.simplecomponent.ecore.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentModel;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SoftwareComponent;
import org.polarsys.kitalpha.transposer.rules.handler.business.premises.PrecedencePremise;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;

public class SimplecomponentToVpTextClassRule implements IRule<ComponentElement> {

	public SimplecomponentToVpTextClassRule() {
	}
	
	
	
	
	@Override
	public void apply(ComponentElement arg0, IContext arg1) throws Exception {
		IGenerateVPText g = new GenerateVPtext();
		
		ArrayList<Class> classes = (ArrayList<Class>)arg1.get("vpdsl");
		classes.add((Class)g.getGeneratedClassOf(arg0));
	}



	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

	

	@Override
	public boolean isApplicableOn(ComponentElement arg0) {
		return arg0 instanceof EObject;
	}

	@Override
	public List getPremises(ComponentElement arg0) {
		List<IPremise> premises = new ArrayList<IPremise>();
		IPremise premise = null;
		
		EObject e = ((EObject) arg0).eClass().eContainer();
		premise = new PrecedencePremise<EObject>(e, "Container");
		premises.add(premise);

		
		return premises;
	}

}
