/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;

/**
 *
 * @author Amine Lajmi
 * 		   Faycal Abka
 *
 */
public class CommonValueConverter extends Ecore2XtextTerminalConverters{

	@ValueConverter(rule = "FQN")
	public IValueConverter<String> getFQNNameConverter() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToValue(final String string, final INode node) throws ValueConverterException {
				final StringBuilder result = new StringBuilder();
				for(final ILeafNode leaf: node.getLeafNodes()) {
					if (!leaf.isHidden()) {
						if (leaf.getGrammarElement() instanceof Keyword) {
							result.append(leaf.getText());
						} else {
							result.append(ID().toValue(leaf.getText(), leaf));
						}
					}
				}
				return result.toString();
			}

			@Override
			protected String internalToString(final String value) {
				final String[] splitted = value.split("\\.");
				final StringBuilder result = new StringBuilder(value.length());
				for(int i = 0; i < splitted.length; i++) {
					if (i != 0) {
						result.append('.');
					}
					result.append(ID().toString(splitted[i].replaceAll(" ", "")));
				}
				return result.toString();
			}
		};
	}


	@ValueConverter(rule = "EBoolean")
	public IValueConverter<Boolean> getEBooleanConverter(){
		return new IValueConverter<Boolean>() {

			@Override
			public Boolean toValue(final String string, final INode node)
					throws ValueConverterException {
				return string != null?string.equals("true"):false;
			}

			@Override
			public String toString(final Boolean value) throws ValueConverterException {
				return value?"true":"false";
			}
		};
	}

	@ValueConverter(rule = "STRING")
	public IValueConverter<String> getSTRINGConverter(){
		return new IValueConverter<String>(){

			@Override
			public String toValue(String string, final INode node)
					throws ValueConverterException {

				if ((string != null) && string.startsWith("\"") && string.endsWith("\"")) {
					string = string.substring(1, string.length() - 1);
				}

				return string;
			}

			@Override
			public String toString(String value) throws ValueConverterException {

				if ((value != null) && !value.startsWith("\"") && !value.endsWith("\"")) {
					value = "\"" + value + "\"";
				}

				return value;
			}

		};
	}

	@ValueConverter(rule = "EString")
	public IValueConverter<String> getEStringConverter(){
		return new IValueConverter<String>(){

			@Override
			public String toValue(String string, final INode node)
					throws ValueConverterException {

				if ((string != null) && string.startsWith("\"") && string.endsWith("\"")) {
					string = string.substring(1, string.length() - 1);
				}

				return string;
			}

			@Override
			public String toString(String value) throws ValueConverterException {

				if ((value != null) && value.contains(" ")) {
					value = "\"" + value + "\"";
				}

				return value;
			}

		};
	}
}
