package org.polarsys.kitalpha.ad.viewpoint.predicate.tests.junit.testcases.contrib;

import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Context;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Predicate;

public class ContribPredicate implements Predicate {

	public ContribPredicate() {
	}

	@Override
	public boolean apply(Context e) {
		return e != null;
	}

}
