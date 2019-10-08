package org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.setup.configuration;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.ui.IStartup;

public class SetupConfiguration implements IStartup {

	@Override
	public void earlyStartup() {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType transposerLaunchType = manager.getLaunchConfigurationType("org.polarsys.kitalpha.transposer.ui.launch.TransposerConfigurationType");
		try {
			ILaunchConfigurationWorkingCopy workingCopy = transposerLaunchType.newInstance(null, "uml to componentsample transformation");
			workingCopy.setAttribute("mapping_id", "org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.mapping");
			Map<String, String> activities = new HashMap<String, String>();
			activities.put("org.polarsys.kitalpha.transposer.after.rule.execution", "org.polarsys.kitalpha.transposer.transformation.emf.trace.clean;org.polarsys.kitalpha.transposer.transformation.emf.trace.save;org.polarsys.kitalpha.transposer.m2m.uml.to.componentsimple.PostTransformation;");
			activities.put("org.polarsys.kitalpha.transposer.before.analysis", "org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.InitTranformation1;org.polarsys.kitalpha.transposer.transformation.emf.trace.load:TraceModelPath=/example/traces/trace.traces;");
			activities.put("org.polarsys.kitalpha.transposer.before.rule.execution", "");
			activities.put("org.polarsys.kitalpha.transposer.before.scheduling", "");
			workingCopy.setAttribute("paramActivities", activities);
			workingCopy.setAttribute("purpose_name", "org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.purpose");
			workingCopy.doSave();
		} catch (CoreException e){
			e.printStackTrace();
		}
	}

}
