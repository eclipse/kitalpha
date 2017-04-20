/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.startup;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.ui.IStartup;

/**
 * 
 * @author Faycal Abka
 *
 */
public class SetupLanchConfiguration implements IStartup {

	@Override
	public void earlyStartup() {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType transposerLaunchType = manager.getLaunchConfigurationType("org.polarsys.kitalpha.transposer.ui.launch.TransposerConfigurationType");
		try {
			ILaunchConfigurationWorkingCopy workingCopy = transposerLaunchType.newInstance(null, "componentsample to uml transformation");
			workingCopy.setAttribute("mapping_id", "org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.mapping");
			Map<String, String> activities = new HashMap<String, String>();
			activities.put("org.polarsys.kitalpha.transposer.after.rule.execution", "org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.PostTransformation;");
			activities.put("org.polarsys.kitalpha.transposer.before.analysis", "org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.initTransformation;");
			activities.put("org.polarsys.kitalpha.transposer.before.rule.execution", "");
			activities.put("org.polarsys.kitalpha.transposer.before.scheduling", "");
			workingCopy.setAttribute("paramActivities", activities);
			workingCopy.setAttribute("purpose_name", "org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.purpose");
			workingCopy.doSave();
		} catch (CoreException e){
			e.printStackTrace();
		}
		
	}

}
