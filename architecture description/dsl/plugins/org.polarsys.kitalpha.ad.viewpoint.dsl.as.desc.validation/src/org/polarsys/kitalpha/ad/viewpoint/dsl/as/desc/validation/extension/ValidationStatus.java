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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension;

/**
 * @author Boubekeur Zendagui
 */

public enum ValidationStatus{
	Ignored(-1) , None(0) , Ok(1) , Warning(2) , Error(3);
	
	private int Flag = -1;
	private Object ruleFlag = null;
	
	private ValidationStatus(int flag) {
		Flag = flag;
	}

	public Object getRuleFlag() {
		return ruleFlag;
	}

	public ValidationStatus setRuleFlag(Object ruleFlag) {
		this.ruleFlag = ruleFlag;
		return this;
	}
	
	public static ValidationStatus getErrorStatusWithRuleFlag(Object flag){
		ValidationStatus f_error = Error;
		f_error.setRuleFlag(flag);
		return f_error;
	}
	
	@Override
	public String toString() {
		switch (Flag) {
		case -1:
			return "Ignored";
		case 0:
			return "None";
		case 1:
			return "Ok";
		case 2:
			return "Warning";
		case 3:
			return "Error";
		}

		return super.toString();
	}
}
