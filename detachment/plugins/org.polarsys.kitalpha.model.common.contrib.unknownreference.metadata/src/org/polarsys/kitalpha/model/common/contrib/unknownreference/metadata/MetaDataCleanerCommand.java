/*******************************************************************************
 * Copyright (c) 2016, 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.contrib.unknownreference.metadata;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.contrib.unknownreference.metadata.internal.Activator;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.ModelScrutinyException;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;

/**
 * 
 * @author Faycal Abka
 *
 */
public class MetaDataCleanerCommand extends ModelCommand {

	
	public MetaDataCleanerCommand() {
	}

	@Override
	public void exec(ModelScrutinyRegistry analysis, Resource resource, IProgressMonitor monitor) 
			throws ModelCommandException {
		
		TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(resource.getResourceSet());
		
		try {
			
			RegistryElement regElt = analysis.getRegistryElement(getModelAnalysisID());
			
			monitor.beginTask("Clean Metadata", 1); //$NON-NLS-1$
			for (IScrutinize finder : regElt.getFinders()) {
				
				if (finder instanceof MetadataUnknownReferencedViewpoint){
					monitor.subTask("Clean Uninstalled Viewpoint from Metadata"); //$NON-NLS-1$

					MetadataUnknownReferencedViewpoint uninstalledViewpoints = (MetadataUnknownReferencedViewpoint)finder;

					for (ViewpointReference vr : uninstalledViewpoints.getAnalysisResult()) {
						if (ed != null){
							Command remove = RemoveCommand.create(ed, vr);
							if (remove.canExecute()){
								ed.getCommandStack().execute(remove);
							}
						} else {
							EcoreUtil.remove(vr);
						}
					}
				}
			}
		} catch (ModelScrutinyException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
	
		monitor.worked(1);
		monitor.done();
	}

}
