/**
 * Copyright (c) 2015, 2018 Thales Global Services.
 * All rights reserved.
 */
package org.polarsys.kitalpha.composer.api.path.decoders;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.variables.IStringVariableManager;
import org.eclipse.core.variables.VariablesPlugin;
import org.polarsys.kitalpha.composer.Activator;

/**
 * @author Guillaume Gebhart
 * 
 */
public class EclipseVariablePathDecoder implements IVariableDecoder{

	/**
	 * Compute Path including Eclipse Variable.
	 * @param path : path to evaluate
	 * @return {@link String}
	 */
	@Override
	public String decodePath(String path, Object object) {

		String result = ""; //$NON-NLS-1$

		final IStringVariableManager manager = getManager();

		if (manager != null) {

			try {
				result = manager.performStringSubstitution(path);

			} catch (CoreException e) {
				Activator.getDefault().error(
						"unable to resolve the value of one or more variables", 
						e); //$NON-NLS-1$
			}
		}
		return result;
	}

	/**
	 * Get Eclipse Variable Manager
	 * 
	 * @return {@link IStringVariableManager}
	 */
	private IStringVariableManager getManager() {

		IStringVariableManager manager = null;

		VariablesPlugin plugin = VariablesPlugin.getDefault();
		
		if (plugin != null) {
			manager = plugin.getStringVariableManager();
		}
		return manager;
	}

	
}
