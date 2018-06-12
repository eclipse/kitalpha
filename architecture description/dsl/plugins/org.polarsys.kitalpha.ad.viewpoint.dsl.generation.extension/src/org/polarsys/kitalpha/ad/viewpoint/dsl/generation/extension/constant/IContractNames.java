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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant;

/**
 * @author Boubekeur Zendagui
 */

public interface IContractNames {
	// Input contracts
	String extensionPointID = "extension.point.id";
	String configurationElementName = "extension.configuration.element.name";
	String extensionFCoreAttributeName = "extension.fcore.attribute.name";
	String factoryComponentConstracts = "factory.component.constracts"; //$NON-NLS-1$
	String collectedExtensionPointContributions = "collected.extension.point.contributions";
	String extensionCategoryAttributeName = "extension.category.attribute.name";
	String extensionNameAttributeName = "extension.name.attribute.name";
	String extensionDescriptionAttributeName = "extension.description.attribute.name";
	String userSelection = "user.selection";
	
	// Output contracts
	String extensionPointContributions = "extension.point.contributions";
	String factoryComponentsList = "factory.components.list";
	String selectedExtensionPointContributions = "selected.extension.point.contributions";
}
