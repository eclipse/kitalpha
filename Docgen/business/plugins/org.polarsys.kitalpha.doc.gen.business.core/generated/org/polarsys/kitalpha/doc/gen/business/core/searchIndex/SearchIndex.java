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
//Generated on Tue Aug 12 15:01:03 CEST 2014 with EGF 1.2.0.v20140721-0706
package org.polarsys.kitalpha.doc.gen.business.core.searchIndex;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;

public class SearchIndex
		extends
		org.polarsys.kitalpha.doc.gen.business.core.doccontent.ElementDocContent {
	protected static String nl;

	public static synchronized SearchIndex create(String lineSeparator) {
		nl = lineSeparator;
		SearchIndex result = new SearchIndex();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = NL
			+ "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">"
			+ NL
			+ "<html>"
			+ NL
			+ "<head>"
			+ NL
			+ "\t<script src=\"../../scripts/search.js\"></script> "
			+ NL
			+ "\t<script src=\"../../scripts/jquery-treeview/lib/jquery.js\"></script>\t"
			+ NL
			+ "</head>"
			+ NL
			+ "<body style=\"padding:0px; margin:0px; background-color:#F6F6F6\">"
			+ NL
			+ ""
			+ NL
			+ "\t\t<div style=\"height:30px;\">"
			+ NL
			+ "\t\t\t<div style=\"padding:3px;position:fixed;background-color:#DDE0E3; width:100%;\">"
			+ NL
			+ "\t\t\t\t<div style=\"float:right; margin-right:5px; font-size:12px; font-family:Arial\">"
			+ NL
			+ "\t\t\t\t\t<a href=\"sidebar.html\">Back to Model</a>"
			+ NL
			+ "\t\t\t\t</div>"
			+ NL
			+ "\t\t\t</div>"
			+ NL
			+ "\t\t</div>"
			+ NL
			+ "<div style=\"font-family:Arial; font-size:12px;padding-left:5px;\">"
			+ NL + "  \t<input id=\"input1\" type=\"text\" value=\"\"/> " + NL
			+ "  \t<p id=\"p1\"></p>" + NL + "    <p id=\"p2\"></p>\t" + NL
			+ "\t<script type=\"text/javascript\">" + NL + "\t\t" + NL
			+ "\t\tvar tabCount = ";
	protected final String TEXT_2 = ";" + NL
			+ "\t\tvar conceptsList = new Array(tabCount);" + NL
			+ "\t\tvar currentSize = 0;" + NL
			+ "\t\tvar addedConceptCount = 0;" + NL
			+ "\t\tfor(x = 0; x < tabCount; x++) {" + NL + "\t\t\tif ((";
	protected final String TEXT_3 = " - addedConceptCount) > 255){" + NL
			+ "\t\t\t\tcurrentSize = 255;" + NL + "\t\t\t}else{" + NL
			+ "\t\t\t\tcurrentSize = ";
	protected final String TEXT_4 = " - addedConceptCount;" + NL + "\t\t\t}"
			+ NL + "\t\t\tvar jConcepts = new Array(currentSize);" + NL
			+ "\t\t\tfor(i = 0; i < currentSize;i++) {" + NL
			+ "\t\t\t\tjConcepts[i] = new Array();" + NL + "\t\t\t}" + NL
			+ "\t\t\tconceptsList[x] = jConcepts;" + NL
			+ "\t\t\taddedConceptCount = addedConceptCount + 255;" + NL
			+ "\t\t}" + NL + "\t\t" + NL + "\t\t<!-- Original code" + NL
			+ "\t\t//var concepts = new Array();" + NL
			+ "\t\t//for(i = 0; i < ";
	protected final String TEXT_5 = ";i++) {" + NL
			+ "\t\t//\tconcepts[i] = new Array();" + NL + "\t\t//}" + NL
			+ "\t\t-->" + NL;
	protected final String TEXT_6 = "conceptsList[";
	protected final String TEXT_7 = "][";
	protected final String TEXT_8 = "][0] = \"";
	protected final String TEXT_9 = "\";" + NL + "\t\tconceptsList[";
	protected final String TEXT_10 = "][";
	protected final String TEXT_11 = "][1] = \"";
	protected final String TEXT_12 = "\";" + NL + "\t\t";
	protected final String TEXT_13 = "\t\t\t"
			+ NL
			+ "\t    $(\"#input1\").keyup(function () {"
			+ NL
			+ "\t      var value = $(this).val();"
			+ NL
			+ "\t      // $(\"#p1\").text(value);"
			+ NL
			+ "\t      var element = document.getElementById('possible_keywords');"
			+ NL
			+ "\t      var t = \"\";"
			+ NL
			+ "\t      for (x=0; x < tabCount; x++){"
			+ NL
			+ "\t\t  \tvar concepts = conceptsList[x];"
			+ NL
			+ "\t      \tfor(i=0;i<concepts.length;i++) {"
			+ NL
			+ "\t      \t\tvar index = concepts[i][0].toLowerCase().indexOf(value.toLowerCase());"
			+ NL
			+ "\t      \t\tif(index != -1) {"
			+ NL
			+ "\t\t      \t\tvar value2 = concepts[i][0];"
			+ NL
			+ "\t      \t\t\tvar value3 = concepts[i][1];"
			+ NL
			+ "\t      \t\t\tt = t.concat(\"<a href='concepts/\" + value3 + \".html' target='content'>\" + value2 + \"</a><br/>\");\t      \t\t"
			+ NL + "\t      \t\t}" + NL + "\t      \t}" + NL + "\t      }" + NL
			+ "\t      " + NL + "\t      $(\"#p2\").html(t);" + NL + "\t      "
			+ NL + "\t      element.value = value;" + NL + "\t    }).keyup();"
			+ NL + "\t    " + NL + "\t</script>" + NL + "\t</div>" + NL
			+ "</body>" + NL + "</html>";
	protected final String TEXT_14 = NL;
	protected final String TEXT_15 = NL;

	public SearchIndex() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

		// add initialisation of the pattern variables (declaration has been already done).

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		if (preCondition(ctx)) {
			ctx.setNode(new Node.Container(currentNode, getClass()));
			orchestration(ctx);
		}

		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(
					OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_14);
		stringBuffer.append(TEXT_15);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		return parameters;
	}

	protected void method_content(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		List<String> concepts = (List<String>) ctx.getValue("concepts");

		stringBuffer.append(TEXT_1);
		stringBuffer.append((concepts.size() / 255) + 1);
		stringBuffer.append(TEXT_2);
		stringBuffer.append(concepts.size());
		stringBuffer.append(TEXT_3);
		stringBuffer.append(concepts.size());
		stringBuffer.append(TEXT_4);
		stringBuffer.append(concepts.size());
		stringBuffer.append(TEXT_5);

		int count = 0;
		int listCount = 0;
		int i = 0;
		for (String currentConcept : concepts) {
			i++;

			stringBuffer.append(TEXT_6);
			stringBuffer.append(listCount);
			stringBuffer.append(TEXT_7);
			stringBuffer.append(count);
			stringBuffer.append(TEXT_8);
			stringBuffer.append(currentConcept.replace("\"", "\\\""));
			stringBuffer.append(TEXT_9);
			stringBuffer.append(listCount);
			stringBuffer.append(TEXT_10);
			stringBuffer.append(count);
			stringBuffer.append(TEXT_11);
			stringBuffer.append(i + "_"
					+ DocGenHtmlUtil.getValidFileName(currentConcept));
			stringBuffer.append(TEXT_12);

			if (count == 254) {
				count = 0;
				listCount++;
			} else {
				count++;
			}
		}

		stringBuffer.append(TEXT_13);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content",
				stringBuffer.toString());
	}

	protected void method_docFooter(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "docFooter",
				stringBuffer.toString());
	}

	protected void method_docHeader(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "docHeader",
				stringBuffer.toString());
	}

	protected void method_endContent(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "endContent",
				stringBuffer.toString());
	}

	protected void method_startContent(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "startContent",
				stringBuffer.toString());
	}

	protected void method_setContext(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		fileName = "searchIndex";

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setContext",
				stringBuffer.toString());
	}
}
