/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.scope;

import org.eclipse.emf.ecore.EObject;

/**
 * <p> This enumeration is used locally to know if a scope was computed or not. </p>
 * <p> The meaning of the literals are: </p>
 * <ul>
 * 	<li> 
 * 		{@link ScopeStatus#LIMITED} means that the scope was initialized. So the {@link #inScope(EObject, boolean)} 
 * 		while check the existence of the element in the computed scope.
 * 	</li>
 * 	<li> 
 * 		{@link ScopeStatus#NOT_LIMITED} means that the scope was not initialized. So there is not check of scope. All element are accepted by
 * 		{@link #inScope(EObject, boolean)}
 * 	</li>
 * </ul>
 * 
 * @author Boubekeur Zendagui
 */
public enum ScopeStatus{
	LIMITED, NOT_LIMITED;
}