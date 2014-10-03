//Generated with EGF 1.2.0.v20140805-0858
package org.polarsys.kitalpha.doc.gen.business.ecore.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreFileNameService;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.kitalpha.doc.gen.business.core.util.SiriusHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.DefaultSiriusDiagramHelper;

public class ecoreElementContent
		extends
		org.polarsys.kitalpha.doc.gen.business.core.doccontent.ElementDocContent {
	protected static String nl;

	public static synchronized ecoreElementContent create(String lineSeparator) {
		nl = lineSeparator;
		ecoreElementContent result = new ecoreElementContent();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<div style=\"position: fixed; top: 0; left: 1%; width: 98%; z-index: 2; background-color: white; \";>"
			+ NL + "<p><strong>Package :</strong> ";
	protected final String TEXT_2 = "</p>" + NL + "<h1>";
	protected final String TEXT_3 = "</h1>" + NL + "<img src=\"";
	protected final String TEXT_4 = "\" alt=\"\" />"
			+ NL
			+ "<hr style=\"width:98%; align : center; \" /> "
			+ NL
			+ "</div>"
			+ NL
			+ ""
			+ NL
			+ "<div style=\"position: absolute; top: 160px; left: 1%; z-index: 1; width: 98%;\">"
			+ NL + "<p><strong>Description :</strong><br />";
	protected final String TEXT_5 = "</p>" + NL
			+ "<p><strong>Abstract: </strong><br />";
	protected final String TEXT_6 = "</p>";
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL;
	protected final String TEXT_9 = NL;
	protected final String TEXT_10 = NL;
	protected final String TEXT_11 = NL;
	protected final String TEXT_12 = NL + "<p><strong>Focus: </strong></p>";
	protected final String TEXT_13 = NL;
	protected final String TEXT_14 = NL;
	protected final String TEXT_15 = NL
			+ "<p><strong>Inherits from: </strong><br />";
	protected final String TEXT_16 = "&nbsp;";
	protected final String TEXT_17 = "</p>";
	protected final String TEXT_18 = NL
			+ "<p><strong>Inheritance: </strong></p>";
	protected final String TEXT_19 = NL;
	protected final String TEXT_20 = NL + "<h2>Attributes</h2>";
	protected final String TEXT_21 = NL;
	protected final String TEXT_22 = NL + "<h2>Operations</h2>";
	protected final String TEXT_23 = NL;
	protected final String TEXT_24 = NL + "<h2>References</h2>";
	protected final String TEXT_25 = NL;
	protected final String TEXT_26 = NL + "<h2>Representations</h2>" + NL;
	protected final String TEXT_27 = NL + "<p><strong>";
	protected final String TEXT_28 = "</strong></p>";
	protected final String TEXT_29 = NL;
	protected final String TEXT_30 = NL + "</div>";
	protected final String TEXT_31 = NL;
	protected final String TEXT_32 = NL;

	public ecoreElementContent() {
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

		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {

			this.parameter = (org.eclipse.emf.ecore.EClass) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(
					OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_31);
		stringBuffer.append(TEXT_32);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx,
					parameterValues);
		}
		return null;
	}

	protected org.eclipse.emf.ecore.EObject element = null;

	public void set_element(org.eclipse.emf.ecore.EObject object) {
		this.element = object;
	}

	protected org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper helper = null;

	public void set_helper(
			org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper object) {
		this.helper = object;
	}

	protected java.lang.String iconPath = null;

	public void set_iconPath(java.lang.String object) {
		this.iconPath = object;
	}

	protected org.eclipse.emf.ecore.EClass parameter = null;

	public void set_parameter(org.eclipse.emf.ecore.EClass object) {
		this.parameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_content(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		String outputFolder = ctx.getValue("outputFolder").toString();
		String projectName = ctx.getValue("projectName").toString();
		String text = ((EClass) element).getName();
		text = EscapeChars.forHTML(text);

		stringBuffer.append(TEXT_1);
		stringBuffer
				.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreModelHelper
						.getTypeHyperLink(((EClass) element).getEPackage()));
		stringBuffer.append(TEXT_2);
		stringBuffer.append(text);
		stringBuffer.append(TEXT_3);
		stringBuffer.append(iconPath);
		stringBuffer.append(TEXT_4);
		stringBuffer
				.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreModelHelper
						.getDescription((EClass) element));
		stringBuffer.append(TEXT_5);
		stringBuffer.append(((EClass) element).isAbstract());
		stringBuffer.append(TEXT_6);
		Collection<DRepresentation> diagramList = SiriusHelper
				.getDiagramForObject(element);
		stringBuffer.append(TEXT_7);
		stringBuffer.append(TEXT_8);
		stringBuffer
				.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreModelHelper
						.getUsageGuideline((EClass) element));
		stringBuffer.append(TEXT_9);
		stringBuffer
				.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreModelHelper
						.getUsedInLevels((EClass) element));
		stringBuffer.append(TEXT_10);
		stringBuffer
				.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreModelHelper
						.getUsageExamples((EClass) element));
		stringBuffer.append(TEXT_11);
		stringBuffer
				.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreModelHelper
						.getConstraints((EClass) element));
		for (DRepresentation diagram : diagramList) {
			if ((diagram instanceof DSemanticDiagram)
					&& (((DSemanticDiagram) diagram).getDescription().getName()
							.equals("Class Focus"))) {
				String generatedFolder = fileNameService
						.getFileName(((DSemanticDiagram) diagram).getTarget());
				stringBuffer.append(TEXT_12);
				stringBuffer.append(TEXT_13);
				{
					//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.sirius.DiagramGenerator" args="diagram:diagram, outputFolder:outputFolder, projectName:projectName, generatedFolder:generatedFolder, fileNameService:fileNameService, helper:helper"%>

					InternalPatternContext ictx = (InternalPatternContext) ctx;
					new Node.DataLeaf(ictx.getNode(), getClass(), null,
							stringBuffer.toString());
					stringBuffer.setLength(0);

					final Map<String, Object> callParameters = new HashMap<String, Object>();
					callParameters.put("diagram", diagram);
					callParameters.put("outputFolder", outputFolder);
					callParameters.put("projectName", projectName);
					callParameters.put("generatedFolder", generatedFolder);
					callParameters.put("fileNameService", fileNameService);
					callParameters.put("helper", helper);
					CallHelper
							.executeWithParameterInjection(
									"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_yyU7IvYiEd-jis7N5RhttA",
									new ExecutionContext(
											(InternalPatternContext) ctx),
									callParameters);
					stringBuffer.setLength(0);
				}

			}
		}
		stringBuffer.append(TEXT_14);
		if (((EClass) element).getESuperTypes().size() > 0) {
			stringBuffer.append(TEXT_15);

			for (EClass eClass : ((EClass) element).getESuperTypes()) {

				stringBuffer
						.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreModelHelper
								.getTypeHyperLink(eClass));
				stringBuffer.append(TEXT_16);

			}

			stringBuffer.append(TEXT_17);

		}
		for (DRepresentation diagram : diagramList) {
			if ((diagram instanceof DSemanticDiagram)
					&& (((DSemanticDiagram) diagram).getDescription().getName()
							.equals("Inheritance"))) {
				String generatedFolder = fileNameService
						.getFileName(((DSemanticDiagram) diagram).getTarget());
				stringBuffer.append(TEXT_18);
				stringBuffer.append(TEXT_19);
				{
					//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.sirius.DiagramGenerator" args="diagram:diagram, outputFolder:outputFolder, projectName:projectName, generatedFolder:generatedFolder, fileNameService:fileNameService, helper:helper"%>

					InternalPatternContext ictx = (InternalPatternContext) ctx;
					new Node.DataLeaf(ictx.getNode(), getClass(), null,
							stringBuffer.toString());
					stringBuffer.setLength(0);

					final Map<String, Object> callParameters = new HashMap<String, Object>();
					callParameters.put("diagram", diagram);
					callParameters.put("outputFolder", outputFolder);
					callParameters.put("projectName", projectName);
					callParameters.put("generatedFolder", generatedFolder);
					callParameters.put("fileNameService", fileNameService);
					callParameters.put("helper", helper);
					CallHelper
							.executeWithParameterInjection(
									"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_yyU7IvYiEd-jis7N5RhttA",
									new ExecutionContext(
											(InternalPatternContext) ctx),
									callParameters);
					stringBuffer.setLength(0);
				}

			}
		}
		if (((EClass) element).getEAllAttributes().size() > 0) {

			stringBuffer.append(TEXT_20);
			stringBuffer.append(TEXT_21);
			stringBuffer
					.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EClassContentHelper
							.getAttributesTable((EClass) element));

		}

		if (((EClass) element).getEAllOperations().size() > 0) {

			stringBuffer.append(TEXT_22);
			stringBuffer.append(TEXT_23);
			stringBuffer
					.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EClassContentHelper
							.getOperationsTable((EClass) element));

		}

		if (((EClass) element).getEAllReferences().size() > 0) {

			stringBuffer.append(TEXT_24);
			stringBuffer.append(TEXT_25);
			stringBuffer
					.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EClassContentHelper
							.getReferencesTable((EClass) element));

		}

		if (diagramList.size() >= 1) {
			stringBuffer.append(TEXT_26);
			for (DRepresentation diagram : diagramList) {
				if ((diagram instanceof DSemanticDiagram)
						&& (!((DSemanticDiagram) diagram).getDescription()
								.getName().equals("Inheritance") && !((DSemanticDiagram) diagram)
								.getDescription().getName()
								.equals("Class Focus"))) {
					String generatedFolder = fileNameService
							.getFileName(((DSemanticDiagram) diagram)
									.getTarget());
					stringBuffer.append(TEXT_27);
					stringBuffer.append(((DSemanticDiagram) diagram)
							.getDescription().getName());
					stringBuffer.append(TEXT_28);
					stringBuffer.append(TEXT_29);
					{
						//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.sirius.DiagramGenerator" args="diagram:diagram, outputFolder:outputFolder, projectName:projectName, generatedFolder:generatedFolder, fileNameService:fileNameService, helper:helper"%>

						InternalPatternContext ictx = (InternalPatternContext) ctx;
						new Node.DataLeaf(ictx.getNode(), getClass(), null,
								stringBuffer.toString());
						stringBuffer.setLength(0);

						final Map<String, Object> callParameters = new HashMap<String, Object>();
						callParameters.put("diagram", diagram);
						callParameters.put("outputFolder", outputFolder);
						callParameters.put("projectName", projectName);
						callParameters.put("generatedFolder", generatedFolder);
						callParameters.put("fileNameService", fileNameService);
						callParameters.put("helper", helper);
						CallHelper
								.executeWithParameterInjection(
										"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_yyU7IvYiEd-jis7N5RhttA",
										new ExecutionContext(
												(InternalPatternContext) ctx),
										callParameters);
						stringBuffer.setLength(0);
					}

				}
			}
		}
		stringBuffer.append(TEXT_30);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content",
				stringBuffer.toString());
	}

	protected void method_setContext(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		element = parameter;
		fileName = fileNameService.getFileName(element);
		helper = new DefaultSiriusDiagramHelper();
		title = ((EClass) element).getName();

		if (((EClass) element).isAbstract())
			iconPath = "../../img/AbstractClass.png";
		else
			iconPath = "../../img/ConcreteClass.png";

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setContext",
				stringBuffer.toString());
	}

	protected void method_setFileNameService(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		fileNameService = EcoreFileNameService.INSTANCE;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setFileNameService",
				stringBuffer.toString());
	}
}