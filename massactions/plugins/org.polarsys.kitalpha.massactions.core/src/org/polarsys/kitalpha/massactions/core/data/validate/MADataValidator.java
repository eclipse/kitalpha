/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.data.validate;

import org.eclipse.nebula.widgets.nattable.data.validate.DataValidator;

/**
 * The default Data Validator implementation customized for Mass Action
 * components.
 * 
 * Developers can extends this class in order to implement their own behavior.
 *  
 * @author Sandu Postaru
 *  
 */
public class MADataValidator extends DataValidator {

	@Override
	public boolean validate(int columnIndex, int rowIndex, Object newValue) {
		return newValue != null;
	}

}
