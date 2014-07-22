//Generated on Tue Jul 22 09:19:51 CEST 2014 with EGF 1.1.0.v20140528-0645
package org.polarsys.kitalpha.releng;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class invokepatternbuilder
		extends
		org.eclipse.egf.portfolio.eclipse.build.buckminster.additions.buildxmlbuildStep {
	protected static String nl;

	public static synchronized invokepatternbuilder create(String lineSeparator) {
		nl = lineSeparator;
		invokepatternbuilder result = new invokepatternbuilder();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "        <echo message=\"No builders invocation specified\" />";
	protected final String TEXT_2 = NL
			+ "        <available file=\"${tools}/egf/eclipse.ini\" property=\"egf.exists_";
	protected final String TEXT_3 = "\" />" + NL
			+ "\t\t<antcall target=\"recompile_egf_patterns_";
	protected final String TEXT_4 = "\" />"
			+ NL
			+ "\t\t"
			+ NL
			+ "        <echo message=\"Invoking all eclipse builders on workspace ${workspace}\" />"
			+ NL + "        <buckminster command=\"build\" >" + NL
			+ "            <cmdargs>" + NL
			+ "                <arg value=\"--clean\" />" + NL
			+ "                <arg value=\"--thorough\" />" + NL
			+ "            </cmdargs>" + NL + "\t\t</buckminster>";
	protected final String TEXT_5 = NL;
	protected final String TEXT_6 = "\t<target name=\"recompile_egf_patterns_";
	protected final String TEXT_7 = "\" if=\"egf.exists_";
	protected final String TEXT_8 = "\" >" + NL
			+ "\t\t<anteclipse target=\"do_recompile_egf_patterns_";
	protected final String TEXT_9 = "\" />" + NL + "\t</target>" + NL + "" + NL
			+ "\t<target name=\"do_recompile_egf_patterns_";
	protected final String TEXT_10 = "\" >"
			+ NL
			+ "        <echo message=\"Invoking EGF Pattern Builder on workspace ${workspace}\" />"
			+ NL
			+ "\t\t<eclipse.incrementalBuild kind=\"incremental\" builder=\"org.eclipse.jdt.core.javabuilder\" />"
			+ NL
			+ "\t\t<eclipse.incrementalBuild kind=\"incremental\" builder=\"org.eclipse.pde.ManifestBuilder\" />"
			+ NL
			+ "\t\t<eclipse.incrementalBuild kind=\"incremental\" builder=\"org.eclipse.pde.SchemaBuilder\" />"
			+ NL
			+ "\t\t<eclipse.incrementalBuild kind=\"incremental\" builder=\"org.eclipse.egf.pattern.ui.PatternBuilder\" />"
			+ NL + "\t</target>" + NL + NL + NL;
	protected final String TEXT_11 = NL;
	protected final String TEXT_12 = NL;

	public invokepatternbuilder() {
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

		paramDesc = new IQuery.ParameterDescription("buildStep",
				"http://www.eclipse.org/egf/1.0.2/buildstep#//BuildStep");
		queryCtx = new HashMap<String, String>();
		List<Object> buildStepList = QueryHelper.load(ctx,
				"org.eclipse.egf.pattern.query.EObjectInjectedContextQuery")
				.execute(paramDesc, queryCtx, ctx);

		for (Object buildStepParameter : buildStepList) {

			this.buildStep = (org.eclipse.egf.portfolio.eclipse.build.buildstep.BuildStep) buildStepParameter;

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

		stringBuffer.append(TEXT_11);
		stringBuffer.append(TEXT_12);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		method_newTarget(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("buildStep", this.buildStep);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx,
					parameterValues);
		}
		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("buildStep", this.buildStep);
		return parameters;
	}

	protected void method_build(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		if (buildStep.isNoBuildersInvocation()) {
			stringBuffer.append(TEXT_1);
		} else {
			stringBuffer.append(TEXT_2);
			stringBuffer.append(stepName);
			stringBuffer.append(TEXT_3);
			stringBuffer.append(stepName);
			stringBuffer.append(TEXT_4);
		}
		stringBuffer.append(TEXT_5);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "build",
				stringBuffer.toString());
	}

	protected void method_newTarget(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_6);
		stringBuffer.append(stepName);
		stringBuffer.append(TEXT_7);
		stringBuffer.append(stepName);
		stringBuffer.append(TEXT_8);
		stringBuffer.append(stepName);
		stringBuffer.append(TEXT_9);
		stringBuffer.append(stepName);
		stringBuffer.append(TEXT_10);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "newTarget",
				stringBuffer.toString());
	}
}