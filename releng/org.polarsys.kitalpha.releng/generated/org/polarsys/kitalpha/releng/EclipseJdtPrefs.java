//Generated with EGF 1.4.1.v20161010-1704
package org.polarsys.kitalpha.releng;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class EclipseJdtPrefs extends org.eclipse.egf.portfolio.eclipse.build.JobFilePattern {
	protected static String nl;

	public static synchronized EclipseJdtPrefs create(String lineSeparator) {
		nl = lineSeparator;
		EclipseJdtPrefs result = new EclipseJdtPrefs();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled" + NL
			+ "org.eclipse.jdt.core.compiler.codegen.targetPlatform=1.8" + NL
			+ "org.eclipse.jdt.core.compiler.compliance=1.8" + NL
			+ "org.eclipse.jdt.core.compiler.problem.assertIdentifier=error" + NL
			+ "org.eclipse.jdt.core.compiler.problem.enumIdentifier=error" + NL
			+ "org.eclipse.jdt.core.compiler.source=1.8";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL;

	public EclipseJdtPrefs() {
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

		List<Object> jobList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object jobParameter : jobList) {

			this.job = (org.eclipse.egf.portfolio.eclipse.build.buildcore.Job) jobParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_3);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		method_content(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("job", this.job);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("job", this.job);
		return parameters;
	}

	protected void method_setFileName(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		fileName = "org.eclipse.jdt.core.prefs";
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setFileName", stringBuffer.toString());
	}

	protected void method_alterFilePath(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		filePath = filePath + "/releng/templates/";
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "alterFilePath", stringBuffer.toString());
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_1);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}
}