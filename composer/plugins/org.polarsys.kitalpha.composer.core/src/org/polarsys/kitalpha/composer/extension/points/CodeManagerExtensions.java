/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.extension.points;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;

/**
 * This class allows to get Strategies, Refineries and generators contributing
 * at the Manager extensions points.
 * 
 * @author Guillaume Gebhart
 
 */
public final class CodeManagerExtensions {

	// all extension points Attribut

	public static final String ATT_ID = "Id";

	public static final String ATT_CLASS = "Class";

	public static final String ATT_NAME = "Name";

	public static final String ATT_URI = "NsUri";

	public static final String ATT_DESCRIPTION = "Description";

	private static final String ALLOCATION_STRATEGIES_ID = "org.polarsys.kitalpha.composer.allocation.strategies";

	private static final String ALLOCATION_REFINERIES_ID = "org.polarsys.kitalpha.composer.allocation.refineries";

	private static final String ALLOCATION_COTS_ID = "org.polarsys.kitalpha.composer.cots.generators";

	private static final String ALLOCATION_BINDINGS_ID = "org.polarsys.kitalpha.composer.allocation.binding";

	/**
	 * Method that allows to get all strategies contributing the
	 * org.polarsys.kitalpha.composer.allocation.strategies extension point.
	 * 
	 * @return all strategies registered
	 */
	public static IConfigurationElement[] getAllStrategiesExtensions() {
		return getExtensionElt(ALLOCATION_STRATEGIES_ID);
	}

	/**
	 * Method that allows to get all refineries contributing the
	 * org.polarsys.kitalpha.composer.allocation.refineries extension point.
	 * 
	 * @return all refineries registered
	 */
	public static IConfigurationElement[] getAllRefineryExtensions() {
		return getExtensionElt(ALLOCATION_REFINERIES_ID);

	}

	/**
	 * Method that allows to get all generators contributing the
	 * org.polarsys.kitalpha.composer.cots.generators.
	 * 
	 * @return all generators registered
	 */
	public static IConfigurationElement[] getAllGeneratorExtensions() {
		return getExtensionElt(ALLOCATION_COTS_ID);
	}

	/**
	 * Method that allows to get all binding contributing the
	 * org.polarsys.kitalpha.composer.allocation.binding extension point.
	 * 
	 * @return all strategies registered
	 */
	public static IConfigurationElement[] getAllBindingExtensions() {
		return getExtensionElt(ALLOCATION_BINDINGS_ID);
	}

	private static IConfigurationElement[] getExtensionElt(String id) {
		IExtensionPoint point = Platform.getExtensionRegistry()
				.getExtensionPoint(id);
		IExtension[] extensions = point.getExtensions();
		ArrayList<IConfigurationElement> configElements = new ArrayList<IConfigurationElement>();

		for (IExtension extension : extensions) {
			configElements.addAll(Arrays.asList(extension
					.getConfigurationElements()));
		}

		return configElements.toArray(new IConfigurationElement[] {});
	}

	/**
	 * Method that allows to get a strategy contributing the
	 * org.polarsys.kitalpha.composer.allocation.strategies extension point from its
	 * name.
	 * 
	 * @param name :
	 *            the strategy's name
	 * 
	 * @return the strategy element
	 */
	public static IConfigurationElement getStrategyConfigElement(String name) {
		IConfigurationElement configuration = null;

		IConfigurationElement[] configElements = getExtensionElt(ALLOCATION_STRATEGIES_ID);
		if (configElements != null) {

			for (IConfigurationElement elt : configElements) {
				if (elt.getAttribute(ATT_NAME).equals(name))
					configuration = elt;
			}
		}
		return configuration;
	}

	/**
	 * Method that allows to get a refinery contributing the
	 * org.polarsys.kitalpha.composer.allocation.refineries extension point from its
	 * name.
	 * 
	 * @param name :
	 *            the refinery's name
	 * 
	 * @return the refinery element
	 */
	public static IConfigurationElement getRefineryConfigElement(String name) {
		IConfigurationElement configuration = null;

		IConfigurationElement[] configElements = getExtensionElt(ALLOCATION_REFINERIES_ID);
		if (configElements != null) {
			for (IConfigurationElement elt : configElements) {
				if (elt.getAttribute(ATT_NAME).equals(name))
					configuration = elt;
			}
		}

		return configuration;
	}

	/**
	 * Method that allows to get a generator contributing the
	 * org.polarsys.kitalpha.composer.cots.generators extension point from its name.
	 * 
	 * @param name :
	 *            the generator's name
	 * 
	 * @return the generator element
	 */
	public static IConfigurationElement getGeneratorConfigElement(String name) {
		IConfigurationElement configuration = null;

		IConfigurationElement[] configElements = getExtensionElt(ALLOCATION_COTS_ID);
		if (configElements != null) {
			for (IConfigurationElement elt : configElements) {
				if (elt.getAttribute(ATT_NAME).equals(name))
					configuration = elt;
			}
		}

		return configuration;
	}

	/**
	 * Method that allows to get a binding contributing the
	 * org.polarsys.kitalpha.composer.allocation.binding extension point from its name.
	 * 
	 * @param name :
	 *            the binding's name
	 * 
	 * @return the binding element
	 */
	public static IConfigurationElement getBindingConfigElement(String name) {
		IConfigurationElement configuration = null;

		IConfigurationElement[] configElements = getExtensionElt(ALLOCATION_BINDINGS_ID);
		if (configElements != null) {
			for (IConfigurationElement elt : configElements) {
				if (elt.getAttribute(ATT_NAME).equals(name))
					configuration = elt;
			}
		}

		return configuration;
	}

	/**
	 * Method that allows to get a strategy contributing the
	 * org.polarsys.kitalpha.composer.allocation.strategies extension point from its
	 * id.
	 * 
	 * @param id :
	 *            the strategy's id
	 * 
	 * @return the strategy element
	 */
	public static IConfigurationElement getStrategyConfigElementFromId(String id) {
		IConfigurationElement configuration = null;

		IConfigurationElement[] configElements = getExtensionElt(ALLOCATION_STRATEGIES_ID);
		if (configElements != null) {

			for (IConfigurationElement elt : configElements) {
				if (elt.getAttribute(ATT_ID).equals(id))
					configuration = elt;
			}
		}
		return configuration;
	}

	/**
	 * Method that allows to get a refinery contributing the
	 * org.polarsys.kitalpha.composer.allocation.refineries extension point from its
	 * id.
	 * 
	 * @param name :
	 *            the refinery's id
	 * 
	 * @return the refinery element
	 */
	public static IConfigurationElement getRefineryConfigElementFromId(String id) {
		IConfigurationElement configuration = null;

		IConfigurationElement[] configElements = getExtensionElt(ALLOCATION_REFINERIES_ID);
		if (configElements != null) {
			for (IConfigurationElement elt : configElements) {
				if (elt.getAttribute(ATT_ID).equals(id))
					configuration = elt;
			}
		}

		return configuration;
	}

	/**
	 * Method that allows to get a generator contributing the
	 * org.polarsys.kitalpha.composer.cots.generators extension point from its id.
	 * 
	 * @param name :
	 *            the generator's id
	 * 
	 * @return the generator element
	 */
	public static IConfigurationElement getGeneratorConfigElementFromId(
			String id) {
		IConfigurationElement configuration = null;

		IConfigurationElement[] configElements = getExtensionElt(ALLOCATION_COTS_ID);
		if (configElements != null) {
			for (IConfigurationElement elt : configElements) {
				if (elt.getAttribute(ATT_ID).equals(id))
					configuration = elt;
			}
		}

		return configuration;
	}

	/**
	 * Method that allows to get a generator contributing the
	 * org.polarsys.kitalpha.composer.allocation.binding extension point from its id.
	 * 
	 * @param name :
	 *            the bindind's id
	 * 
	 * @return the binding element
	 */
	public static IConfigurationElement getBindingConfigElementFromId(String id) {
		IConfigurationElement configuration = null;

		IConfigurationElement[] configElements = getExtensionElt(ALLOCATION_BINDINGS_ID);
		if (configElements != null) {
			for (IConfigurationElement elt : configElements) {
				if (elt.getAttribute(ATT_ID).equals(id))
					configuration = elt;
			}
		}

		return configuration;
	}

}