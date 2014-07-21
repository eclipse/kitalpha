package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation.CommonJavaValidator;

public class AbstractVpspecJavaValidator extends CommonJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage.eINSTANCE);
		return result;
	}

}
