/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.data;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.egf.portfolio.genchain.generationChain.EmfGeneration;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.manager.VpdslDescriptionModelManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.element.IGenerationElementInnerConfiguration;

/**
 * @author Boubekeur Zendagui
 */
public class EMFGenerationElementConfiguration implements IGenerationElementInnerConfiguration{
	
	private boolean genModel;
	private boolean genEdit;
	private boolean genEditor;
	private boolean genTest;
	private boolean genJavaDoc;

	
	public EMFGenerationElementConfiguration() {
		Viewpoint viewpoint = VpdslDescriptionModelManager.INSTANCE.getVpDescriptionElement();
		genModel = VpDslConfigurationHelper.getGenerateModel(viewpoint);
		genEdit = VpDslConfigurationHelper.getGenerateEdit(viewpoint);
		genEditor = VpDslConfigurationHelper.getGenerateEditor(viewpoint);
		genTest = VpDslConfigurationHelper.getGenerateTest(viewpoint);
		genJavaDoc = VpDslConfigurationHelper.getGenerateJavaDoc(viewpoint);
	}
	
	private void refreshOptions(){
		Viewpoint viewpoint = VpdslDescriptionModelManager.INSTANCE.getVpDescriptionElement();
		genModel = VpDslConfigurationHelper.getGenerateModel(viewpoint);
		genEdit = VpDslConfigurationHelper.getGenerateEdit(viewpoint);
		genEditor = VpDslConfigurationHelper.getGenerateEditor(viewpoint);
		genTest = VpDslConfigurationHelper.getGenerateTest(viewpoint);
		genJavaDoc = VpDslConfigurationHelper.getGenerateJavaDoc(viewpoint);
	}
	
	/**
	 * @see IGenerationElementInnerConfiguration#getElementClass()
	 */
	@Override
	public Class<? extends GenerationElement> getElementClass(){
		return EmfGeneration.class;
	}
	
	/**
	 * @see IGenerationElementInnerConfiguration#configure()
	 */
	@Override
	public void configure(GenerationElement element){
		refreshOptions();
		EmfGeneration emfElement = null;
		if (element instanceof EmfGeneration) {
			emfElement = (EmfGeneration) element;
		} else {
			throw new IllegalArgumentException(element.getName() + " Generation element can't be configured by EMFGenerationElementConfiguration");
		}
		
		emfElement.setGenerateModel(genModel);
		emfElement.setGenerateEdit(genEdit);
		emfElement.setGenerateEditor(genEditor);
		emfElement.setGenerateTest(genTest);
		emfElement.setGenerateJavadoc(genJavaDoc);
	}
	
	/**
	 * @see IGenerationElementInnerConfiguration#removeIfNotRelevant()
	 */
	@Override
	public boolean isRelevant(GenerationChain generationchain, GenerationElement element) {
		refreshOptions();
		/**
		 * TODO: 
		 * If options generate Model and generate Edit are false then check if the model 
		 * and edit plug-ins are available in workspace :
		 * Yes: Generation element is relevant
		 * False : Generation element is not relevant
		 */
		if (! genModel && ! genEdit && ! genEditor && ! genTest && ! genJavaDoc)
		{/** If all option are disabled, then the generation element is not relevant */
			return false;
		}
		else 
		{/** If generate model and generate edit are disabled and if model and edit plug-ins 
		      are not available, in the workspace, then the generation element is not relevant */
			boolean relevant = true;
			
			// Get model and edit plug-ins name 
			EmfGeneration emfGeneration = (EmfGeneration) element;
			String modelPluginName = emfGeneration.getPluginName();
			String editPluginName = modelPluginName != null ? modelPluginName + ".edit" : "";
			if (!genModel )
			{ 
				// Try to get the Model plug-in from workspace
				IProject modelProject = null;
				if (modelPluginName != null && modelPluginName.length() > 0) {
					modelProject = ResourcesPlugin.getWorkspace().getRoot().getProject(modelPluginName);
				}
				
				relevant &= modelProject != null && modelProject.exists();
			}
			
			if (! genEdit)
			{
				// Try to get the Edit plug-in from workspace
				IProject editProject = null;
				if (editPluginName != null && editPluginName.length() > 0) {
					editProject = ResourcesPlugin.getWorkspace().getRoot().getProject(editPluginName);
				}
				
				relevant &= editProject != null && editProject.exists();
			}
			return relevant;
		}
	}
}
