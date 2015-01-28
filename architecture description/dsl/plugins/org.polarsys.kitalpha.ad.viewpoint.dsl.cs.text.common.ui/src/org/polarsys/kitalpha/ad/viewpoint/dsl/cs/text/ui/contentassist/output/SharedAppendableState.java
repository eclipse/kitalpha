/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.output;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.IAcceptor;

/**
 * 
 * @author Amine Lajmi
 *
 */

public class SharedAppendableState {
	
	private int indentationLevel = 0;
	private String indentation;
	private String lineSeparator;
	
	public SharedAppendableState(String indentation, String lineSeparator) {
		this.indentation = indentation;
		this.lineSeparator = lineSeparator;
	}

	public void appendNewLineAndIndentation(IAcceptor<String> content) {
		content.accept(lineSeparator);
		for (int i = 0; i<indentationLevel; i++) {
			content.accept(indentation);
		}
	}
	
	public void increaseIndentation() {
		indentationLevel++;
	}
	
	public void decreaseIndentation() {
		if (indentationLevel ==0)
			throw new IllegalStateException("Cant reduce indentation level, it's already zero.");
		indentationLevel--;
	}
	
	public void appendType(EObject type, IAcceptor<String> content){
		StringBuilder builder = new StringBuilder();
		content.accept(builder.toString());
	}
	
}
