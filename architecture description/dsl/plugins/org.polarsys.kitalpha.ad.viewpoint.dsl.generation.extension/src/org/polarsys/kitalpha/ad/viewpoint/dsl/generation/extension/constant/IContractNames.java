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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant;

/**
 * @author Boubekeur Zendagui
 */

public interface IContractNames {
	// Input contracts
	public static final String extensionPointID = "extension.point.id";
	public static final String configurationElementName = "extension.configuration.element.name";
	public static final String extensionFCoreAttributeName = "extension.fcore.attribute.name";
	public static final String factoryComponentConstracts = "factory.component.constracts"; //$NON-NLS-1$
	public static final String collectedExtensionPointContributions = "collected.extension.point.contributions";
	public static final String extensionCategoryAttributeName = "extension.category.attribute.name";
	public static final String extensionNameAttributeName = "extension.name.attribute.name";
	public static final String extensionDescriptionAttributeName = "extension.description.attribute.name";
	public static final String userSelection = "user.selection";
	
	// Output contracts
	public static final String extensionPointContributions = "extension.point.contributions";
	public static final String factoryComponentsList = "factory.components.list";
	public static final String selectedExtensionPointContributions = "selected.extension.point.contributions";
}
