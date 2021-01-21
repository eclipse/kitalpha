/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
		ValidationStatus error = Error;
		error.setRuleFlag(flag);
		return error;
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
