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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ConfValueConverter extends Ecore2XtextTerminalConverters{
	
	private final static String SPACE = " ";
	private final static String QUOTES = "\"";
	
	@ValueConverter(rule = "EString")
	public IValueConverter<String> getSTRINGConverter(){
		return new IValueConverter<String>(){

			@Override
			public String toValue(String string, INode node)
					throws ValueConverterException {
				
				if (string != null && string.startsWith("\"") && string.endsWith("\""))
					return (String) string.subSequence(1, string.length() - 1);
				return string;
			}

			@Override
			public String toString(String value) throws ValueConverterException {
				
				if (value != null && value.contains(SPACE))
					return QUOTES + value + QUOTES;
				
				return value;
			}
			
		};
	}
}
