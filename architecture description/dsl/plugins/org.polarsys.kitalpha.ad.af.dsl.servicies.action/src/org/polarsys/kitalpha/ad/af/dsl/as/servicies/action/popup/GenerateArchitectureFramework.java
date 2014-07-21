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

package org.polarsys.kitalpha.ad.af.dsl.as.servicies.action.popup;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.egf.ContractHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.egf.InvokeActivityHelper;

/**
 * @author Boubekeur Zendagui
 */

public class GenerateArchitectureFramework implements IObjectActionDelegate {

	private static final String GENERATE_AND_PACKAGE_AF_ACTION = 
				"org.polarsys.kitalpha.ad.af.dsl.servicies.action.generateAndPackageAF"; //$NON-NLS-1$
	
	private static final URI DEFAULT_LAUNCHER_URI = URI
				.createURI("platform:/plugin/org.polarsys.kitalpha.ad.af.dsl.generation.desc/egf/AFGeneratorLauncher.fcore#_fVL0kOoJEeKQgpgMDnmvmA");
	
	private IStructuredSelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateArchitectureFramework() {
		super();
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
//		shell = targetPart.getSite().getShell();
	}

	public void run(IAction action) {
		URI uri = getDomainURI(selection);

		Activity vpGeneratorLauncher = InvokeActivityHelper.getActivity(DEFAULT_LAUNCHER_URI); 
		execute(vpGeneratorLauncher, uri, firePackaging(action.getId()));
	}

	private void execute(Activity dslVPGEneratorLauncher, URI uri, boolean do_packaging){
		if (dslVPGEneratorLauncher instanceof FactoryComponent) 
		{
			final FactoryComponent factoryComponent = (FactoryComponent) dslVPGEneratorLauncher;
			ContractHelper.setDomain(factoryComponent, "model", uri);
			ContractHelper.setBooleanContract(factoryComponent, "package.af", do_packaging); //$NON-NLS-1$
			InvokeActivityHelper.validateAndInvoke(factoryComponent, "Architecture Framework generation");
		}
	}
	
	private boolean firePackaging(String actionID){
		return actionID.equals(GENERATE_AND_PACKAGE_AF_ACTION);
	}

	public static URI getDomainURI(IStructuredSelection selection){
		Object obj = selection.getFirstElement();
		if (obj instanceof IResource) 
		{
			IFile vpSpecFile = null;
			if (obj instanceof IFile)
				vpSpecFile = (IFile) obj;
			
			return URI.createPlatformResourceURI(vpSpecFile.getFullPath().toString(), true);
		}
		return null;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

}
