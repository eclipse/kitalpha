package org.polarsys.kitalpha.composer.m2t.componentsample.to.html.setup.configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.ui.IStartup;

public class SetupLaunchConfiguration implements IStartup {

	@Override
	public void earlyStartup() {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType transposerLaunchType = manager.getLaunchConfigurationType("org.polarsys.kitalpha.code.generation.manager.ui.launch.CodeManagerConfigurationType");
		try {
			ILaunchConfigurationWorkingCopy workingCopy = transposerLaunchType.newInstance(null, "Component Sample to HTML Documentation - Multi files strategy");
			workingCopy.setAttribute("mapping_id", "org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.mapping");
			workingCopy.setAttribute("allocation_uri", "http://www.polarsys.org/kitalpha/componentsampleallocation/1.0.0");
			workingCopy.setAttribute("generation_folder", "/example/html-gen");
			workingCopy.setAttribute("generation_name", "Component Sample to HTML Documentation");
			workingCopy.setAttribute("generator_id", "org.polarsys.kitalpha.m2t.componentsample.to.html.cots");
			workingCopy.setAttribute("generator_name", "Component Sample Generator");
			workingCopy.setAttribute("generator_parameters", new HashMap<String, String>());
			workingCopy.setAttribute("libraries_list", new ArrayList<String>());
			workingCopy.setAttribute("missing_lib_path" , "");
			Map<String, String> activities = new HashMap<String, String>();
			activities.put("org.polarsys.kitalpha.composer.core.workflow.aftergeneration", "");
			activities.put("org.polarsys.kitalpha.composer.core.workflow.beforegeneration", "org.polarsys.kitalpha.m2t.componentsample.to.html.cleanActivity:Path=/example/html-gen;");
			activities.put("org.polarsys.kitalpha.composer.core.workflow.beforerefinery", "");
			activities.put("org.polarsys.kitalpha.composer.core.workflow.beforestrategy", "");
			workingCopy.setAttribute("paramActivities", activities);
			workingCopy.setAttribute("refinery_id", "org.polarsys.kitalpha.m2t.componentsample.to.html.refinery");
			workingCopy.setAttribute("refinery_name", "Component Sample Refinery");
			workingCopy.setAttribute("strategie_id", "org.polarsys.kitalpha.m2t.componentsample.to.html.multi.files.strategy");
			workingCopy.setAttribute("strategie_name", "HTML Component Sample Generation Multi Files");
			workingCopy.doSave();
			
			//One file strategy
			ILaunchConfigurationWorkingCopy workingCopy2 = transposerLaunchType.newInstance(null, "Component Sample to HTML Documentation - One files strategy");
			workingCopy2.setAttribute("mapping_id", "org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.mapping");
			workingCopy2.setAttribute("allocation_uri", "http://www.polarsys.org/kitalpha/componentsampleallocation/1.0.0");
			workingCopy2.setAttribute("generation_folder", "/example/html-gen");
			workingCopy2.setAttribute("generation_name", "Component Sample to HTML Documentation");
			workingCopy2.setAttribute("generator_id", "org.polarsys.kitalpha.m2t.componentsample.to.html.cots");
			workingCopy2.setAttribute("generator_name", "Component Sample Generator");
			workingCopy2.setAttribute("generator_parameters", new HashMap<String, String>());
			workingCopy2.setAttribute("libraries_list", new ArrayList<String>());
			workingCopy2.setAttribute("missing_lib_path" , "");
			workingCopy2.setAttribute("paramActivities", activities);
			workingCopy2.setAttribute("refinery_id", "org.polarsys.kitalpha.m2t.componentsample.to.html.refinery");
			workingCopy2.setAttribute("refinery_name", "Component Sample Refinery");
			workingCopy2.setAttribute("strategie_id", "org.polarsys.kitalpha.m2t.componentsample.to.html.one.file.strategy");
			workingCopy2.setAttribute("strategie_name", "HTML Component Sample Generation Multi Files");
			workingCopy2.doSave();
		} catch (CoreException e){
			e.printStackTrace();
		}
	}

}
