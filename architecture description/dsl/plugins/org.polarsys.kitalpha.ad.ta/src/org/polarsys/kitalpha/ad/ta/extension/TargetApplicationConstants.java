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

package org.polarsys.kitalpha.ad.ta.extension;

/**
 * @author Boubekeur Zendagui
 */

public interface TargetApplicationConstants {
	/** Target application extension point id **/
	String TARGET_APP_EXTENSION_ID = "org.polarsys.kitalpha.ad.ta.definition"; //$NON-NLS-1$
	
	/** Target application extension point configuration element name **/
	String TARGET_APP_CONFIGURATION_ELEMENT_NAME = "definition"; //$NON-NLS-1$
	
	/** Target application extension point name attribute **/
	String TARGET_APP_ATTRIBUTE_NAME = "name"; //$NON-NLS-1$
	
	/** Target application extension point class attribute **/
	String TARGET_APP_ATTRIBUTE_CLASS = "class"; //$NON-NLS-1$
	
	/** Target application extension point root project name attribute **/
	String TARGET_APP_ATTRIBUTE_ROOT_PROJECT_NAME = "RootProjectName"; //$NON-NLS-1$
	
	/** Target application extension point root nsuri attribute **/
	String TARGET_APP_ATTRIBUTE_ROOT_NSURI = "RootNsURI"; //$NON-NLS-1$
	
	/** Target application extension point description attribute **/
	String TARGET_APP_ATTRIBUTE_DESCRIPTION = "description"; //$NON-NLS-1$
	
	
	/** Target application meta-model configuration element name **/
	String TARGET_APP_META_MODEL_CONFIGURATION_ELEMENT_NAME = "metaModel"; //$NON-NLS-1$
	
	/** Target application extension point nsuri attribute name **/
	String TARGET_APP_META_MODEL_ATTRIBUTE_NSURI = "nsuri"; //$NON-NLS-1$
	
	/** Target application extension point nsuri attribute name **/
	String TARGET_APP_META_MODEL_ATTRIBUTE_NSURI_TYEP = "type"; //$NON-NLS-1$
}
