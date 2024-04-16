//Generated with EGF 1.6.4.qualifier
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.jservice.diagrams;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.GenerationUtil;

public class GenJavaServiceForNodePattern
    extends org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.jservice.common.GenJavaServiceCommonPattern {
  protected static String nl;

  public static synchronized GenJavaServiceForNodePattern create(String lineSeparator) {
    nl = lineSeparator;
    GenJavaServiceForNodePattern result = new GenJavaServiceForNodePattern();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;

  public GenJavaServiceForNodePattern() {
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

    List<Object> nodeList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)

    for (Object nodeParameter : nodeList) {

      this.node = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node) nodeParameter;

      if (preCondition(ctx)) {
        ctx.setNode(new Node.Container(currentNode, getClass()));
        orchestration(ctx);
      }

    }
    ctx.setNode(currentNode);
    if (ctx.useReporter()) {
      ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
    }

    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }

  public String orchestration(PatternContext ctx) throws Exception {
    InternalPatternContext ictx = (InternalPatternContext) ctx;

    super.orchestration(new SuperOrchestrationContext(ictx));

    if (ictx.useReporter()) {
      Map<String, Object> parameterValues = new HashMap<String, Object>();
      parameterValues.put("node", this.node);
      String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
      String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
      ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
    }
    return null;
  }

  protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node node = null;

  public void set_node(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node object) {
    this.node = object;
  }

  public Map<String, Object> getParameters() {
    final Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("node", this.node);
    return parameters;
  }

  protected void method_setParameters(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    super.parameter = node;
    super.method_setParameters(stringBuffer, ctx);
    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "setParameters", stringBuffer.toString());
  }

  public boolean preCondition(PatternContext ctx) throws Exception {
    return super.preCondition(ctx) && GenerationUtil.getJavaServiceDataFor(node) != null;
  }
}