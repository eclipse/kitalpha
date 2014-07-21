package org.polarsys.kitalpha.ad.example.simplecomponent.safety.design;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SafetyPackage;

public class SafetyService {

	// [self.eContents()->select(oclIsKindOf(SimpleVPSafety))/]
	public Collection<Object> getSafetyChilds(EObject obj) {
		return EcoreUtil.getObjectsByType(obj.eContents(), SafetyPackage.eINSTANCE.getSimpleVPSafety());
	}

	// [self.eContents()->select(oclIsKindOf(SimpleVPSafety))->size() <> 0 /]
	public boolean hasSafetyChilds(EObject obj) {
		return getSafetyChilds(obj).size() != 0;
	}
}
