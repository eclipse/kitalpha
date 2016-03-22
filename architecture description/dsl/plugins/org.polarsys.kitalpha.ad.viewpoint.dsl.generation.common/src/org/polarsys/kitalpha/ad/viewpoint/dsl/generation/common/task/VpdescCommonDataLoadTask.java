/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.constant.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.manager.VpdslDescriptionModelManager;

/**
 * @author Boubekeur Zendagui
 */

public class VpdescCommonDataLoadTask extends TaskProductionAdapter {

	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		EMFDomain vpdesc_domain = productionContext.getInputValue(VPDESC_MODEL, EMFDomain.class);
		EList<Object> vpdesc_c = vpdesc_domain.getContent();
		if (vpdesc_c != null && vpdesc_c.size() > 0)
		{
			Viewpoint viewpoint = (Viewpoint) vpdesc_c.get(0);
			productionContext.setOutputValue(NAME, viewpoint.getName());
			productionContext.setOutputValue(SHORT_NAME, viewpoint.getShortName());
			productionContext.setOutputValue(DISPLAYABLE_SHORT_NAME, getDisplayableShortName(viewpoint.getShortName()));
			productionContext.setOutputValue(NSURI, VpDslConfigurationHelper.getNsURI(viewpoint));
			productionContext.setOutputValue(ROOT_PROJECT_NAME, VpDslConfigurationHelper.getRootProjectName(viewpoint));
			productionContext.setOutputValue(TARGET_APPLICATION, VpDslConfigurationHelper.getTargetApplication(viewpoint));
			
			productionContext.setOutputValue(VIEWPOINT_VERSION, VpDslConfigurationHelper.getViewpointVersion(viewpoint));
			productionContext.setOutputValue(VIEWPOINT_RELEASE_DESCRIPTION, VpDslConfigurationHelper.getViewpointDescription(viewpoint));
			productionContext.setOutputValue(REQUIRED_EE, VpDslConfigurationHelper.getViewpointRequiredExecutionEnvironment(viewpoint));
			
			/**Initialize Viewpoint in generation **/
			if (VpdslDescriptionModelManager.INSTANCE.getVpDescriptionElement() == null)
				VpdslDescriptionModelManager.INSTANCE.initialize(viewpoint);
		}
		else
		{
			throw new InvocationException(Messages.Model_Is_Empty);
		}
	}

	private String getDisplayableShortName(String string){
		StringBuilder result = new StringBuilder();
		result.append(string.charAt(0));
		for (int i = 1; i < string.length(); i++) 
		{
			if (
				(Character.isLowerCase(string.charAt(i-1)) && Character.isUpperCase(string.charAt(i))) ||
				( i+1 < string.length() && Character.isLowerCase(string.charAt(i+1)) &&  Character.isUpperCase(string.charAt(i)))
				)
			{
				result.append(" ");
			}
			result.append(string.charAt(i));
		}
		return result.toString();
	}

}
