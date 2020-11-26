/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.DataGrammarAccess;

/**
 * 
 * @author Amine Lajmi
 * 
 */
public class DataFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		DataGrammarAccess f = (DataGrammarAccess) getGrammarAccess();

		// Automatic line wrap
		c.setAutoLinewrap(160);
		// Line wrap before import
		c.setLinewrap(1).before(f.getImportAccess().getImportKeyword_0());
		c.setLinewrap(2).between(f.getImportAccess().getRule(), f.getDataAccess().getRule());

		// Line wrap after Data description
		c.setLinewrap(1).after(
				f.getDataAccess().getDescriptionAssignment_5_0_1());
		// Line wrap after Class description
		c.setLinewrap(1).after(
				f.getClassAccess().getDescriptionAssignment_4_1());
		// Line wrap before superClass
		c.setLinewrap(1).before(f.getClassAccess().getSuperClassKeyword_7_0());

		// //Line wrap after each ',' in extends
		// for(Keyword comma: f.getClassAccess().findKeywords(",")) {
		// c.setNoLinewrap().before(comma);
		// c.setNoSpace().before(comma);
		// c.setLinewrap().after(comma);
		// }
		// Line wrap before abstract
		c.setLinewrap(1).before(f.getClassAccess().getAbstractKeyword_8_0());
		// Annotations
		c.setLinewrap(1).before(
				f.getAnnotationAccess().getAnnotationKeyword_1());
		// c.setIndentationIncrement().before(f.getAnnotationAccess().getAnnotationKeyword_1());
		// c.setIndentationDecrement().after(f.getAnnotationAccess().getRightCurlyBracketKeyword_3_2());
		c.setLinewrap(1).before(f.getDetailAccess().getKeyKeyword_1());
		/**
		 * Attributes
		 */
		Keyword attributesKeyword = f.getClassAccess()
				.getAttributesKeyword_10_0();
		// Line wrap before Attributes:
		c.setLinewrap(1).before(attributesKeyword);
		// Line wrap after Attributes:
		c.setLinewrap(1).after(attributesKeyword);
		// Line wrap after each attribute definition
		c.setLinewrap(1).before(f.getAttributeAccess().getNameAssignment_1());
		c.setNoLinewrap().before(f.getAttributeAccess().getValuesKeyword_6_0());
		c.setLinewrap(1).after(
				f.getAttributeAccess().getRightParenthesisKeyword_6_3());
		/**
		 * Associations
		 */
		Keyword associationsKeyword = f.getClassAccess()
				.getAssociationsKeyword_11_0();
		// Line wrap before Associations:
		c.setLinewrap(1).before(associationsKeyword);
		// Line wrap after Associations:
		c.setLinewrap(1).after(associationsKeyword);
		// Line wrap after icon path
		c.setLinewrap(1).after(f.getClassAccess().getIconAssignment_5_1());
		// Line wrap after each local class association definition
		c.setLinewrap(1).after(f.getLocalClassAssociationAccess().getRule());
		// Line wrap after each external class association definition
		c.setLinewrap(1).after(f.getExternalClassAssociationAccess().getRule());
		/**
		 * Operations
		 */
		Keyword operationsKeyword = f.getClassAccess()
				.getOperationsKeyword_12_0();
		// Line wrap before Operations:
		c.setLinewrap(1).before(operationsKeyword);
		// Line wrap after Operations:
		c.setLinewrap(1).after(operationsKeyword);
		// Line wrap after each operation definition
		c.setLinewrap(1).after(
				f.getOperationAccess().getOperation_typeAssignment_5_1());

		/**
		 * Add special indentations
		 */
		for (Pair<Keyword, Keyword> pair : f.getClassAccess().findKeywordPairs(
				"extends", "superClass")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
		}
		for (Pair<Keyword, Keyword> pair : f.getClassAccess().findKeywordPairs(
				"superClass", "abstract:")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
		}
		for (Pair<Keyword, Keyword> pair : f.getClassAccess().findKeywordPairs(
				"abstract:", "Attributes:")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
		}
		for (Pair<Keyword, Keyword> pair : f.getClassAccess().findKeywordPairs(
				"Attributes:", "Associations:")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
		}
		for (Pair<Keyword, Keyword> pair : f.getClassAccess().findKeywordPairs(
				"Associations:", "Operations:")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
		}
		for (Pair<Keyword, Keyword> pair : f.getClassAccess().findKeywordPairs(
				"Operations:", "}")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
		}

		// Set white line between Attributes, Associations and Operations
		// c.setLinewrap(2).before(f.getClassAccess().getAttributesKeyword_10_0());
		// c.setLinewrap(2).before(f.getClassAccess().getAttributesKeyword_10_0());
		//
		// c.setLinewrap(2).before(f.getClassAccess().getAssociationsKeyword_11_0());
		//
		// c.setLinewrap(2).before(f.getClassAccess().getOperationsKeyword_12_0());

		// Set line after annotations
		c.setLinewrap(2).after(
				f.getClassAccess()
						.getOwned_annotationsAnnotationParserRuleCall_9_0());

		// Set line before each class
		c.setLinewrap(1).before(f.getClassAccess().getClassKeyword_1());

		// Indentation between annotations
		c.setIndentationDecrement().before(
				f.getClassAccess().getOwned_annotationsAssignment_9());
		c.setIndentationIncrement().between(
				f.getClassAccess().getOwned_annotationsAssignment_9(),
				f.getClassAccess().getOwned_annotationsAssignment_9());

		// Class "{" ... "}"
		c.setIndentationIncrement().between(
				f.getClassAccess().getLeftCurlyBracketKeyword_3(),
				f.getClassAccess().getRightCurlyBracketKeyword_13());

		// Class { desciption: "value" ... "}"
		c.setIndentationIncrement().between(
				f.getClassAccess().getDescriptionAssignment_4_1(),
				f.getClassAccess().getRightCurlyBracketKeyword_13());
		c.setIndentationIncrement().between(
				f.getClassAccess().getDescriptionAssignment_4_1(),
				f.getClassAccess().getOwned_annotationsAssignment_9());
		c.setIndentationIncrement().between(
				f.getClassAccess().getLeftCurlyBracketKeyword_3(),
				f.getClassAccess().getOwned_annotationsAssignment_9());

		// Class { icon: "path" ... "}"
		c.setIndentationIncrement().between(
				f.getClassAccess().getIconAssignment_5_1(),
				f.getClassAccess().getRightCurlyBracketKeyword_13());
		c.setIndentationIncrement().between(
				f.getClassAccess().getIconAssignment_5_1(),
				f.getClassAccess().getOwned_annotationsAssignment_9());
		c.setIndentationIncrement().between(
				f.getClassAccess().getIconAssignment_5_1(),
				f.getClassAccess().getSuperClassKeyword_7_0());

		// icon: "path" ... "attributes"
		c.setIndentationIncrement().between(
				f.getClassAccess().getIconAssignment_5_1(),
				f.getClassAccess().getAttributesKeyword_10_0());

		// icon: "path" ... "associations"
		c.setIndentationIncrement().between(
				f.getClassAccess().getIconAssignment_5_1(),
				f.getClassAccess().getAssociationsKeyword_11_0());

		// Class { desciption: "value" ... "superClass"}
		c.setIndentationIncrement().between(
				f.getClassAccess().getDescriptionAssignment_4_1(),
				f.getClassAccess().getSuperClassKeyword_7_0());

		// Class { desciption: "value" ... "Attributes:"}
		c.setIndentationIncrement().between(
				f.getClassAccess().getDescriptionAssignment_4_1(),
				f.getClassAccess().getAttributesKeyword_10_0());

		// Class { desciption: "value" ... "Associations:"}
		c.setIndentationIncrement().between(
				f.getClassAccess().getDescriptionAssignment_4_1(),
				f.getClassAccess().getAssociationsKeyword_11_0());

		// Class { desciption: "value" ... "abstract:"}
		c.setIndentationIncrement().between(
				f.getClassAccess().getDescriptionAssignment_4_1(),
				f.getClassAccess().getAbstractKeyword_8_0());

		// Class "{" ... "Associations:"
		c.setIndentationIncrement().between(
				f.getClassAccess().getLeftCurlyBracketKeyword_3(),
				f.getClassAccess().getAssociationsKeyword_11_0());
		c.setIndentationIncrement().between(
				f.getClassAccess().getOwned_annotationsAssignment_9(),
				f.getClassAccess().getAssociationsKeyword_11_0());

		// Class "{" ... "Attributes:"
		c.setIndentationIncrement().between(
				f.getClassAccess().getLeftCurlyBracketKeyword_3(),
				f.getClassAccess().getAttributesKeyword_10_0());
		c.setIndentationIncrement().between(
				f.getClassAccess().getOwned_annotationsAssignment_9(),
				f.getClassAccess().getAttributesKeyword_10_0());

		// Class "{" ... "Operations:"
		c.setIndentationIncrement().between(
				f.getClassAccess().getLeftCurlyBracketKeyword_3(),
				f.getClassAccess().getOperationsKeyword_12_0());
		c.setIndentationIncrement().between(
				f.getClassAccess().getOwned_annotationsAssignment_9(),
				f.getClassAccess().getOperationsKeyword_12_0());

		// Class "{" ... "superClass"
		c.setIndentationIncrement().between(
				f.getClassAccess().getLeftCurlyBracketKeyword_3(),
				f.getClassAccess().getSuperClassKeyword_7_0());

		// Class "{" ... "abstract:"
		c.setIndentationIncrement().between(
				f.getClassAccess().getLeftCurlyBracketKeyword_3(),
				f.getClassAccess().getAbstractKeyword_8_0());

		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap(1).after(pair.getFirst());
			c.setLinewrap(1).before(pair.getSecond());
			c.setLinewrap(1).after(pair.getSecond());
		}

		
		// formatting for Comments 
	    c.setLinewrap(1).before(f.getSL_COMMENTRule());
	    c.setLinewrap().after(f.getSL_COMMENTRule());
	    c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
	    c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}
}
