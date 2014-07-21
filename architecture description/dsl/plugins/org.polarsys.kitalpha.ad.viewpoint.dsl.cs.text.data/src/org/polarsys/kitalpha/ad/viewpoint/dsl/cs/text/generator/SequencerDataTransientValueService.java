package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.serializer.sequencer.TransientValueService;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

@SuppressWarnings("restriction")
public class SequencerDataTransientValueService extends TransientValueService {

	

	@Override
	public ValueTransient isValueTransient(EObject semanticObject, EStructuralFeature feature) {
		if (semanticObject instanceof AbstractFeature &&
				((check_id(VpdescPackage.ATTRIBUTE__CHANGEABLE, feature)) ||
				(check_id(VpdescPackage.ATTRIBUTE__ORDERED, feature)) ||
				(check_id(VpdescPackage.ATTRIBUTE__UNIQUE, feature)))){
			return ValueTransient.NO;
		
		}
		
		if (semanticObject instanceof Enumeration &&
				check_id(VpdescPackage.ENUMERATION__ID, feature))
			return ValueTransient.YES;
		
		return super.isValueTransient(semanticObject, feature);
	}
	
	@Override
	public ListTransient isListTransient(EObject semanticObject, EStructuralFeature feature) {
		if (semanticObject instanceof Data &&
				check_id(VpdescPackage.DATA__ADDITIONAL_EXTERNAL_DATA, feature))
			return ListTransient.YES;
		return super.isListTransient(semanticObject, feature);
	}



	private boolean check_id(int id, EStructuralFeature feature){
		return id == feature.getFeatureID();// && feature.getDefaultValue() != null;
	}
}
