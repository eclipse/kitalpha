/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.wizards;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jface.wizard.Wizard;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.cadence.ui.api.launch.ICadenceLaunchConfigurationConstants;
import org.polarsys.kitalpha.composer.api.CodeManagerCadenceLaunchConfiguration;
import org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration;
import org.polarsys.kitalpha.composer.api.profiles.ComposerProfile;
import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;
import org.polarsys.kitalpha.composer.ui.Activator;
import org.polarsys.kitalpha.composer.ui.launch.ICodeManagerLaunchConfigurationConstants;
import org.polarsys.kitalpha.composer.ui.launch.tabs.ComposerHelper;

/**
 * Wizard to get parameter values and destination folder for
 * {@link CodeManagerConfiguration}.
 * 
 * @author Yann Mortier
 */
public class GenericLaunchConfigurationWizard extends Wizard {

	private static final String ID_COMPOSER_LAUNCH_CONFIG = "org.polarsys.kitalpha.code.generation.manager.ui.launch.CodeManagerConfigurationType"; //$NON-NLS-1$
	public static final String PARAMETER_SEPARATOR = ":"; //$NON-NLS-1$
	private CodeManagerConfiguration configuration;
	private ComposerProfile profile;
	private GenericConfigurationWizardPage wizardPage;

	public GenericLaunchConfigurationWizard(
			CodeManagerConfiguration configuration) {
		this.configuration = configuration;
	}

	public GenericLaunchConfigurationWizard(
			CodeManagerConfiguration configuration, ComposerProfile profile) {
		this.configuration = configuration;
		this.profile = profile;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		this.wizardPage = new GenericConfigurationWizardPage(
				"Generation configuration", "Generation configuration", null);
		this.wizardPage.setConfiguration(configuration);
		this.addPage(this.wizardPage);
		
		if(configuration.getCodeManagerCadenceLaunchConfiguration().containsActivities()){
		
			this.wizardPage = new CadenceConfigurationWizardPage(
				"Cadence configuration", "Cadence configuration", null);
			this.wizardPage.setConfiguration(configuration);
			this.addPage(this.wizardPage);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		try {
			
			ILaunchConfiguration workingCopy = createLaunchConfiguration(GenericConfigurationWizardPage.getConfigNameName());
			convertCodeManagerLaunchConfiguration((ILaunchConfigurationWorkingCopy)workingCopy,configuration);
		} catch (Exception e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Error while creating launch configuration", e.fillInStackTrace());
			Activator.getDefault().getLog().log(status);
		}
		
		return true;
	}

	
	private void convertCodeManagerLaunchConfiguration(
			ILaunchConfigurationWorkingCopy workingCopy,
			CodeManagerConfiguration configuration_p) throws CoreException {
		//binding
		String id = profile.getAllocationBindingId();
		String nsUri = profile.getAllocationBinding();
		workingCopy
		.setAttribute(
				ICodeManagerLaunchConfigurationConstants.GENERATION_ALLOCATION_URI,nsUri);
		IConfigurationElement element = CodeManagerExtensions.getBindingConfigElementFromId(id);
		String name = element.getAttribute(CodeManagerExtensions.ATT_NAME);
	
		workingCopy.setAttribute(
				ICodeManagerLaunchConfigurationConstants.GENERATION_NAME,name);
		
		
		
		//strategy
		
		id = profile.getStrategy().getId();
		element = CodeManagerExtensions.getStrategyConfigElementFromId(id);
		name = element.getAttribute(CodeManagerExtensions.ATT_NAME);
		workingCopy
		.setAttribute(
				ICodeManagerLaunchConfigurationConstants.STRATEGY_ID,id);
		
		workingCopy.setAttribute(
				ICodeManagerLaunchConfigurationConstants.STRATEGY_NAME,name);
		
		
		Map<String, String> map = ComposerHelper.getMapFromTable(configuration_p.getStrategyParameters().values());
			workingCopy
		.setAttribute(
				ICodeManagerLaunchConfigurationConstants.STRATEGY_PARAMETERS,
				map);
		
		
		//refinery
		
		id = profile.getRefinery().getId();
		element = CodeManagerExtensions.getRefineryConfigElementFromId(id);
		name = element.getAttribute(CodeManagerExtensions.ATT_NAME);
		workingCopy
		.setAttribute(
				ICodeManagerLaunchConfigurationConstants.REFINERY_ID,id);
		
		workingCopy.setAttribute(
				ICodeManagerLaunchConfigurationConstants.REFINERY_NAME,name);
		
		 map = ComposerHelper.getMapFromTable(configuration_p.getRefineryParameters().values());
		workingCopy
	.setAttribute(
			ICodeManagerLaunchConfigurationConstants.REFINERY_PARAMETERS,
			map);
		
		//generator
		
		id = profile.getGenerator().getId();
		element = CodeManagerExtensions.getGeneratorConfigElementFromId(id);
		name = element.getAttribute(CodeManagerExtensions.ATT_NAME);
		
		workingCopy
		.setAttribute(
				ICodeManagerLaunchConfigurationConstants.CODEGEN_ID,id);
		
		workingCopy.setAttribute(
				ICodeManagerLaunchConfigurationConstants.CODEGEN_NAME,name);
		
		workingCopy.setAttribute(
				ICodeManagerLaunchConfigurationConstants.CODEGEN_FOLDER,configuration_p.getDestinationFolder().toString());
		
		 map = ComposerHelper.getMapFromTable(configuration_p.getGeneratorParameters().values());
			workingCopy
		.setAttribute(
				ICodeManagerLaunchConfigurationConstants.CODEGEN_PARAMETERS,
				map);
		
		//CADENCE
		HashMap<String, String> cadence = new HashMap<String, String>();
		
		CodeManagerCadenceLaunchConfiguration cadenceConfig = configuration.getCodeManagerCadenceLaunchConfiguration();
		WorkflowActivityParameter wParams  = cadenceConfig.getBeforeStrategyActivities();
		String key = "org.polarsys.kitalpha.composer.core.workflow.beforestrategy";
		createCadenceItem(wParams,key,cadence);
		
		wParams  = cadenceConfig.getBeforeRefineryActivities();
		key = "org.polarsys.kitalpha.composer.core.workflow.beforerefinery";
		createCadenceItem(wParams,key,cadence);
		
		wParams  = cadenceConfig.getBeforeGenerationActivities();
		key = "org.polarsys.kitalpha.composer.core.workflow.beforegeneration";
		createCadenceItem(wParams,key,cadence);
		
		wParams  = cadenceConfig.getAfterGenerationActivities();
		key = "org.polarsys.kitalpha.composer.core.workflow.aftergeneration";
		createCadenceItem(wParams,key,cadence);
		
		workingCopy.setAttribute(
				ICadenceLaunchConfigurationConstants.PARAMETERS_ACTIVITIES,
				cadence);
		
		//libraries
		workingCopy.setAttribute(ICodeManagerLaunchConfigurationConstants.SELECTED_LIBRARIES, profile.getLibraries());
		
		workingCopy.doSave();
	}

	

	private void createCadenceItem(WorkflowActivityParameter wParams,
			String key, HashMap<String, String> cadence) {
		Set<String> activities = wParams.getActivitiesID();
		
			String value = getParameters(wParams, activities);
			cadence.put(key, value);
		
	}

	ILaunchConfiguration createLaunchConfiguration(String name) throws Exception{
		
		
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		   ILaunchConfigurationType type =
		      manager.getLaunchConfigurationType(ID_COMPOSER_LAUNCH_CONFIG);
		ILaunchConfiguration[] configurations =
		      manager.getLaunchConfigurations(type);
		   for (int i = 0; i < configurations.length; i++) {
		      ILaunchConfiguration configuration = configurations[i];
		      if (configuration.getName().equals(name)) {
		         configuration.delete();
		         break;
		      }
		   }
		ILaunchConfigurationWorkingCopy workingCopy =
		      type.newInstance(null, name);
		workingCopy.doSave();
		return workingCopy;
	}

	
	public String getParameters(WorkflowActivityParameter _params,Set<String> activities) {
	    String value = ""; //$NON-NLS-1$
	    String result = ""; //$NON-NLS-1$
	    
	    
	    for(String actId : activities){
	      ActivityParameters actParam = _params.getActivityParameters(actId);
	      value = actId + PARAMETER_SEPARATOR; //$NON-NLS-1$
	      if (actParam != null) {
	        for (GenericParameter<?> p : actParam.getParameters()) {
	          value += p.getName() + "=" + p.getValue() + ","; //$NON-NLS-1$ //$NON-NLS-2$
	        }

	        value = value.substring(0, value.length() - PARAMETER_SEPARATOR.length()) + ";"; //$NON-NLS-1$
	        result += value;
	      }
	    }
	    
	    return result;
	  }
	
}
