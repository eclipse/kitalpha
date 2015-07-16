package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation.CommonJavaValidator;

public class AbstractActivityexplorerJavaValidator extends CommonJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/viewpointactivityexplorer/1.0.0"));
		return result;
	}

}
