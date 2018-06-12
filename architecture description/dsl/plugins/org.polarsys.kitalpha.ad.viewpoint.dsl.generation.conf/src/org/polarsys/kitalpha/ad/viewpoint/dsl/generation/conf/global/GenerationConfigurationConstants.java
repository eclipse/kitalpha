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
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.global;

/**
 * @author Boubekeur Zendagui 
 */
public interface GenerationConfigurationConstants {

	/** Generation configuration extension point id **/
	String GEN_CONF_EXTENSION_ID = 
			"org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.GenerationElementConf"; //$NON-NLS-1$
	
	/** Generation configuration extension point configuration element name **/
	String GEN_CONF_INNER_CONFIGURATION_ELEMENT_NAME = "inner"; //$NON-NLS-1$
	
	/** Generation configuration extension point class attribute **/
	String GEN_CONF_ATTRIBUTE_CLASS = "class"; //$NON-NLS-1$
}
