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
package org.polarsys.kitalpha.massactions.visualize.query;

import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.polarsys.kitalpha.massactions.visualize.helpers.container.UnfoldedRowObject;

public class AQLQuery extends AbstractQuery {

	protected String query;

	public void setQuery(String query) {
		this.query = query;
	}

	@Override
	public Object evaluate() {

		IInterpreter interpreter;

		if (target instanceof UnfoldedRowObject) {
			interpreter = InterpreterUtil.getInterpreter(((UnfoldedRowObject) target).getSource());
		} else {
			interpreter = InterpreterUtil.getInterpreter(target);
		}

		for (QueryParameter parameter : parameters) {
			interpreter.setVariable(parameter.getName(), parameter.getValue());
		}

		Object result;

		try {
			result = interpreter.evaluate(target, query);
		} catch (EvaluationException e) {
			result = e.getLocalizedMessage();
		}

		return result;
	}

}
