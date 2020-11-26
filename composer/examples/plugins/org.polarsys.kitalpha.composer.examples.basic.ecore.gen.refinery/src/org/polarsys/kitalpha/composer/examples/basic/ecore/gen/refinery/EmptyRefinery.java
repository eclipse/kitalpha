/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.examples.basic.ecore.gen.refinery;

import java.util.Map;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.ParameterError;
import org.polarsys.kitalpha.composer.extension.points.IRefinery;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;

import ecorebasicalloc.EcoreRoot;

/**
 * This refinery is very lazy !!!
 * 
 * @author Yann Mortier
 */
public class EmptyRefinery implements IRefinery {

    /**
     * {@inheritDoc}
     * 
     * @see org.polarsys.kitalpha.composer.extension.points.IRefinery#getParameters()
     */
    public Map<String, Parameter> getParameters() {
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.polarsys.kitalpha.composer.extension.points.IRefinery#refineModelElements(org.polarsys.kitalpha.composer.metamodel.allocation.base.Root,
     *      java.util.Map)
     */
    public EcoreRoot refineModelElements(Root allocRoot_p, Map<String, Parameter> refineryParams_p) {
        return (EcoreRoot)allocRoot_p;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.polarsys.kitalpha.composer.extension.points.IRefinery#validateParameters(java.util.Map)
     */
    public Map<String, ParameterError> validateParameters(Map<String, Parameter> valuedParameters_p) {
        return null;
    }

}
