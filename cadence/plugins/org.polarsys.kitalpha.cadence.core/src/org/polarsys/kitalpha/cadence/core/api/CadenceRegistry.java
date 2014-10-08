/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.core.api;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

import org.polarsys.kitalpha.cadence.core.internal.CadenceExtensions;





/**
 * 
 * This class allows to get activities, workflows, etc... contributing
 * at the Cadence extensions points. 
 * @author Guillaume Gebhart
 *
 */

public class CadenceRegistry {



	
	 public static IConfigurationElement[] getAllWorkflowElement(String workflow_id) {
		 return CadenceExtensions.getAllWorkflowElement(workflow_id);
		
	 }
	 
	 public static IConfigurationElement[] getWorkflowElementParameters(String workflow_id,String workflow_element_id) {
		IConfigurationElement config = CadenceExtensions.getWorkflowElement(workflow_id, workflow_element_id);
		 return CadenceExtensions.getWorkflowElementParameters(config);
	 }
	 
	 public static IConfigurationElement[] getActivitiesConfigList(String workflow_id, String workflow_element_id) {
		 return CadenceExtensions.getActivitiesForWorkflowElement(workflow_id, workflow_element_id);
		
	 }
	 
	 public static IConfigurationElement getActivity(String id) {
		 return CadenceExtensions.getActivityConfigElement(id);
		
	 }
	 
	 public static boolean isMultiple(IConfigurationElement element){
			
			 return Boolean.parseBoolean(element.getAttribute(CadenceExtensions.ATT_MULTIPLE_ACTIVTY));
		 }
	 
	 public static String getDescription(IConfigurationElement element){
		IConfigurationElement[] children =  element.getChildren(CadenceExtensions.ATT_DESCRIPTION);
		String res = ""; //$NON-NLS-1$
		if(children != null)
			res = children[0].getValue();
		return res;
	 }
	 
	 public static String getIdentifier(IConfigurationElement element){
		 return element.getAttribute(CadenceExtensions.ATT_IDENTIFIER);
	 }
	 
	 public static String getName(IConfigurationElement element){
		 return element.getAttribute(CadenceExtensions.ATT_NAME);
	 } 
	 
	 public static String getOrderNumber(IConfigurationElement element){
		 return element.getAttribute(CadenceExtensions.ATT_ORDER_NUMBER);
	 } 
	 
	 public static IActivity getIActivityClass(IConfigurationElement element){
			
		 IActivity activity = null;
		 if(element!= null){
		 try {
				activity = (IActivity)element.createExecutableExtension(CadenceExtensions.ATT_ACTIVITY_CLASS);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 return activity;
	 }
	 
	 
	 
	 public static IActivity getIActivityClassFromId(String id){
		 IConfigurationElement config = CadenceExtensions.getActivityConfigElement(id);
		 return getIActivityClass(config);
		
	 }
	 
}
