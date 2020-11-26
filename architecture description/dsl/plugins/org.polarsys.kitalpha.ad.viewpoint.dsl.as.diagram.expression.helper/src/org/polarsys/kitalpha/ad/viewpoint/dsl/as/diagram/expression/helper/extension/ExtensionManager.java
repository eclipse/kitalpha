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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.extension;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.sirius.ExpressionKind;

/**
 * @author Boubekeur Zendagui
 */

public class ExtensionManager {
	
	private final static String diagram_expression_language_extension_point = 
					"org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.expression.helper.diagramExpressionLanguage"; //$NON-NLS-N$
	
	private static Map<String, ExpressionKind> targetApplicationLanguageRegistry = new HashMap<String, ExpressionKind>();
	
	/**
	 * Initialize registry of target application language 
	 */
	public static void initRegistry() {
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(diagram_expression_language_extension_point);

		if (config.length != 0) 
		{
			for (IConfigurationElement iConfigurationElement : config) 
			{
				if (iConfigurationElement.getName().equals("expression")) 
				{
					String targetApplication = iConfigurationElement.getAttribute("TargetApplication");
					String language = iConfigurationElement.getAttribute("language");
					targetApplicationLanguageRegistry.put(targetApplication, ExpressionKind.getExpressionKind(language));
				}
			}
		}
	}
	
	/**
	 * Clear every entry in the registry
	 */
	public static void clearRegistry() {
		targetApplicationLanguageRegistry.clear();
	}

	/**
	 * @param anyModelElement Element element of viewpoint description model
	 * @return No null list containing all declared target application extensions
	 */
	public static ExpressionKind getDiagramExpressionLanguageFilters(EObject anyModelElement){
		if (targetApplicationLanguageRegistry.isEmpty()) {
			initRegistry();
		}
		
		String modelTargetApplication = VpDslConfigurationHelper.getTargetApplication(anyModelElement);
		if (targetApplicationLanguageRegistry.containsKey(modelTargetApplication)) {
			return targetApplicationLanguageRegistry.get(modelTargetApplication);
		}
		return ExpressionKind.AQL;
	}
}
