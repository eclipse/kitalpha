/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.operation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.portfolio.genchain.extension.ExtensionHelper;
import org.eclipse.egf.portfolio.genchain.generationChain.EmfGeneration;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChainFactory;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.tools.api.editing.EditingDomainFactoryService;
import org.eclipse.sirius.common.tools.api.resource.ResourceSetFactory;
import org.polarsys.kitalpha.ad.ta.extension.ITargetApplication;
import org.polarsys.kitalpha.ad.ta.extension.TargetApplicationExtensionManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.manager.VpdslDescriptionModelManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.chain.GenerationChainConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.constant.Constant;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.helper.GenerationCreatingCommand;

/**
 * @author Boubekeur Zendagui
 */

public class GenchainGenerationOperation extends AbstractGenerationOperation{

	protected TransactionalEditingDomain _editingDomain;
	protected ResourceSet _resourceSet;
	
	public GenchainGenerationOperation(String projectName, String ecoreModelName, String modelsFolder) {
		super(projectName, ecoreModelName, modelsFolder);
	}
	
	@Override
	protected void execute(IProgressMonitor monitor){
		setMonitor(monitor);
		Resource genchainResource;
		try {
			genchainResource = getGenerationChainResource();
			genchainResource.save(null);
		} catch (CoreException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String setupModelExtension() {
		return "generationchain";
	}
	
	/**
	 * Create a generation chain resource and setup it informations
	 * @return a {@link Resource} containing the generation chain
	 * @throws CoreException
	 */
	private Resource getGenerationChainResource() throws CoreException {
		// Create generation chain element
		GenerationChain chain = createGenerationChain();
		EObject genchainRootElement = EcoreUtil.getRootContainer(chain);
		
		// Create generation chain resource and add generation chain root element to it content
		Resource resource = createGenerationChainResource();
		resource.getContents().add(genchainRootElement);
		
		// Create commands that create generation chain elements  
		List<RecordingCommand> elementsCmds = getElementGenerationCommands(chain);
		if (elementsCmds != null && elementsCmds.size() > 0)
		{
			CompoundCommand genchainCreationCommands = new CompoundCommand();
			
			for (RecordingCommand genCmd : elementsCmds) {
				genchainCreationCommands.append(genCmd);
			}
			
			// Setting the generation properties for generation chain elements
			RecordingCommand setupCommand = getSetupCommand(chain);
			if(setupCommand != null) {
				genchainCreationCommands.append(setupCommand);
			}
			
			// Setting generation chain configuration command
			RecordingCommand configurationCommand = getConfigurationCommand(chain);
			if(configurationCommand != null) {
				genchainCreationCommands.append(configurationCommand);
			}
			
			// Run all created commands allowing to create and setup Generation Chain elements
			getEditingDomain().getCommandStack().execute(genchainCreationCommands);
		}
		return resource;
	}
	
	/**
	 * @return a {@link TransactionalEditingDomain}
	 */
	public TransactionalEditingDomain getEditingDomain(){
		if (_editingDomain == null || _editingDomain.getCommandStack() == null) {
			_editingDomain = EditingDomainFactoryService.INSTANCE.getEditingDomainFactory().createEditingDomain(_resourceSet);
		}

		return _editingDomain;
	}
	
	/**
	 * Create a {@link Resource} wherein generation chain will be created
	 * @return a {@link Resource}
	 */
	protected Resource createGenerationChainResource(){
		URI genchainURI = getModelUri(true);
		_resourceSet = ResourceSetFactory.createFactory().createResourceSet(genchainURI);
		Resource resource = _resourceSet.createResource(genchainURI);
		return resource;
	}
	
	/**
	 * Create a generation chain
	 * @return a generation chain
	 */
	protected GenerationChain createGenerationChain(){
		GenerationChain genchainRootElement = GenerationChainFactory.eINSTANCE.createGenerationChain();
		genchainRootElement.setName(_shortName);
		genchainRootElement.setFactoryComponentName(_projectName);
		GenerationChain chain = GenerationChainFactory.eINSTANCE.createGenerationChain();
		EPackage ePackage = (EPackage) _ecoreResource.getContents().get(0);
		chain.setName(ePackage.getName());
		genchainRootElement.getElements().add(chain);
		return chain;
	}
	
	/**
	 * Set attributes values for generation chain element
	 * @param chain the generation chain
	 * @return a recording command that setup generation chain element
	 */
	protected RecordingCommand getSetupCommand(final GenerationChain chain){
		RecordingCommand command = new RecordingCommand(getEditingDomain()) {
			@Override
			protected void doExecute() {
				for (GenerationElement element : chain.getElements()) 
				{
					String ecoreFQN = "/"+_projectName+"/"+_modelsFolder+"/"+_shortName+"."+Constant.ECORE_FILE_EXTENSION;
					if (element instanceof EmfGeneration) 
					{
						EmfGeneration model = (EmfGeneration) element; 
						model.setGenerateEditor(false);
						model.setBasePackage(_projectName);
						model.setModelPath(ecoreFQN);
						model.setPluginName(_projectName+".model");
					}
				}
			}
		};
		
		return command;
	}
	
	/**
	 * @param chain the generation chain
	 * @return a recording command that setup generation chain element
	 */
	protected RecordingCommand getConfigurationCommand(final GenerationChain chain){
		RecordingCommand command = new RecordingCommand(getEditingDomain()) {
			@Override
			protected void doExecute() {
				GenerationChainConfiguration.configure(chain, true);
			}
		};
		
		return command;
	}

	/**
	 * Ask Target Application for registered element to add in generation chain
	 * @param chain the generation chain element wherein element will be added
	 * @return a {@link List} of {@link RecordingCommand} 
	 * @throws CoreException
	 */
	protected List<RecordingCommand> getElementGenerationCommands(final GenerationChain chain) throws CoreException {
		List<RecordingCommand> result = new ArrayList<RecordingCommand>();
		List<URI> uriList = new ArrayList<URI>();
		uriList.add(_ecoreResource.getURI());
		Viewpoint vp = VpdslDescriptionModelManager.INSTANCE.getVpDescriptionElement();
		String targetApplication = VpDslConfigurationHelper.getTargetApplication(vp);
		ITargetApplication iTargetApplication = TargetApplicationExtensionManager.getTargetApplicationClass(targetApplication);
		
		if (iTargetApplication != null)
		{
			List<ExtensionHelper> extesionList =  iTargetApplication.getGenerationExtensionHelpers();
			for (ExtensionHelper extensionHelper : extesionList) 
			{
				GenerationCreatingCommand subCommand = new GenerationCreatingCommand(getEditingDomain(), chain, uriList, extensionHelper);
				result.add(subCommand);
			}
		}
		
		return result;
	}
}
