/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers;

import java.util.regex.Pattern;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class MetamodelIDs {
	
	public static final String ECORE = "http://www.eclipse.org/emf/2002/Ecore";

	public static final String VPSPEC = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdesc/1.0.0";
	
	public static final String VPCONF = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpconf/1.0.0";
	
	public static final String VPBUILD = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpbuild/1.0.0";
	
	public static final String VPUI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpui/1.0.0";
	
	public static final String EMDE = "http://www.polarsys.org/kitalpha/emde/1.0.0";
	
	public static final String VPDIAGRAM = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdiagram/1.0.0";
	
	public static final String COMMONDATA = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/commondata/1.0.0";
	
	public static final String EXPRESSION = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdiagram/expression/1.0.0";
	
	public static final String VPSERVICES = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpservices/1.0.0";
	
	public static final String SERVICES = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/cs/text/vpspec";
	
	public static final String ACTIVITY_EXPLORER = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/viewpointactivityexplorer/1.0.0";
	
	/**
	 * Default metamodel namespace patterns
	 */
	public static final Pattern VPDSL_NAMESPACE_PATTERN = Pattern.compile("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/(vpspec|vpconf|vpservices|vpui|vpbuild|viewpointactivityexplorer)"); //$NON-NLS-1$
	
	public static final String DOCUMENTATION_NAMESPACE = "http://www.polarsys.org/kitalpha/ecore/documentation";

}
