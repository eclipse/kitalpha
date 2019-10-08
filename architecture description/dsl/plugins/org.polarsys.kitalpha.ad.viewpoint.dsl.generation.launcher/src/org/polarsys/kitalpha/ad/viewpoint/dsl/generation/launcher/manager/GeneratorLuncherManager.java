/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.manager;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;

/**
 * @author Boubekeur Zendagui
 */

public class GeneratorLuncherManager {
	
	private Map<String, URI> launchers = new HashMap<String, URI>();
	
	public static final URI DEFAULT_LAUNCHER_URI = URI
					.createURI("platform:/plugin/org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher/egf/ViewpointGenerationLauncher.fcore#_HQHKEI7vEeGaBt8RXbnVpQ");

	public static GeneratorLuncherManager INSTANCE = new GeneratorLuncherManager(); 	
	
	private GeneratorLuncherManager() {
		launchers.put("Default", DEFAULT_LAUNCHER_URI);
	}
	
	public Map<String, URI> getLunchers(){
		return launchers;
	}
	
	public URI getLuncherURI(String name){
		if (launchers.containsKey(name)){
			return launchers.get(name);
		}
		return null;
	}
	
	public void addLauncher(String name, URI uri){
		launchers.put(name, uri);
	}

}
