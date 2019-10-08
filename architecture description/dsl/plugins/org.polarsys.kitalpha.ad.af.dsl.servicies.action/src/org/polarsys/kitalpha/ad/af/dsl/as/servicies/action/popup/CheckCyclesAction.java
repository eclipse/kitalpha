/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
import org.eclipse.core.runtime.Status;
import org.eclipse.egf.domain.Activator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.generation.desc.graph.GenerationGraph;
import org.polarsys.kitalpha.ad.af.dsl.generation.desc.graph.GenerationGraphCycle;

/**
 * @author Boubekeur Zendagui
 */

public class CheckCyclesAction extends BaseSelectionListenerAction implements IObjectActionDelegate{

	private IStructuredSelection selection;
	
	public CheckCyclesAction() {
		super("Check cycle");
	}

	@Override
	public void run(IAction action) {
		URI uri = getDomainURI(this.selection);
		ArchitectureFramework afdescription = getAFSpecification(uri);
		
		GenerationGraph generationGraph = new GenerationGraph(afdescription);
		if (!generationGraph.isEmpty())
		{
			// Check if there is cycles
			GenerationGraphCycle cycleDetect = new GenerationGraphCycle(generationGraph);
			cycleDetect.analyse();
			String message = "No cycles are detected";
			int status = Status.OK;
			if (cycleDetect.exist())
			{
				message = cycleDetect.count() + " cycle(s) \n" + cycleDetect.cyclesToString();
				status = Status.ERROR;
			}
			
			Activator.getDefault().log(new Status(status, Activator.getDefault().getPluginID(), message));
		}
	}
	
	public ArchitectureFramework getAFSpecification(URI uri){
		ArchitectureFramework result = null;
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(uri, true);
		EList<EObject> content = resource.getContents();
		
		if (content != null && content.size() > 0)
		{
			result = (ArchitectureFramework) content.get(0);
		}
		
		return result;
	}
	
	public static URI getDomainURI(IStructuredSelection selection){
		Object obj = selection.getFirstElement();
		if (obj instanceof IResource) 
		{
			IFile vpSpecFile = null;
			if (obj instanceof IFile) {
				vpSpecFile = (IFile) obj;
			}
			
			return URI.createPlatformResourceURI(vpSpecFile.getFullPath().toString(), true);
		}
		return null;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

}
