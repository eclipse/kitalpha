package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation.CommonJavaValidator;

public class AbstractVpdiagramJavaValidator extends CommonJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.DiagramPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdesc/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdiagram/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/commondata/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdiagram/expression/1.0.0"));
		return result;
	}

}
