//Generated with EGF 1.6.4.qualifier
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.customizations.style.specific;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.AbstractComputableElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.DiagramExpressionUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.VSMVariable;

public class Node_EllipseCustomizationPattern extends
    org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.customizations.common.AbstractSpecificNodeCustomizationPattern {

  public Node_EllipseCustomizationPattern() {
    //Here is the constructor
    // add initialisation of the pattern variables (declaration has been already done).

  }

  public void generate(Object argument) throws Exception {
    InternalPatternContext ctx = (InternalPatternContext) argument;
    IQuery.ParameterDescription paramDesc = null;
    Map<String, String> queryCtx = null;
    Node.Container currentNode = ctx.getNode();
    List<Object> parameterList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)

    for (Object parameterParameter : parameterList) {

      this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization) parameterParameter;

      if (preCondition(ctx)) {
        ctx.setNode(new Node.Container(currentNode, getClass()));
        orchestration((PatternContext) argument);

      }
    }
    if (ctx.useReporter()) {
      ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
    }
  }

  public String orchestration(PatternContext ctx) throws Exception {
    InternalPatternContext ictx = (InternalPatternContext) ctx;
    Node.Container currentNode = ictx.getNode();
    super.orchestration(new SuperOrchestrationContext(ictx));
    method_initHorizontalDiameterComputationExpressionData(new StringBuffer(), ictx);
    method_initVerticalDiameterComputationExpressionData(new StringBuffer(), ictx);
    {
      final Map<String, Object> parameters = new HashMap<String, Object>();
      parameters.put("parent", this.parent);
      parameters.put("applyOnAll", this.applyOnAll);
      parameters.put("appliedOn", this.appliedOn);
      parameters.put("stylePropertyData", this.horizontalDiameterComputationExpression);
      ExecutionContext ctx_local = new ExecutionContext(ictx);
      CallHelper.executeWithParameterInjection(
          "platform:/plugin/org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram/egf/VpdslSiriusDiagramGenerator.fcore#_IXiPcGdyEeWYaMtt1GGGww",
          ctx_local, parameters);
    }
    {
      final Map<String, Object> parameters = new HashMap<String, Object>();
      parameters.put("parent", this.parent);
      parameters.put("applyOnAll", this.applyOnAll);
      parameters.put("appliedOn", this.appliedOn);
      parameters.put("stylePropertyData", this.verticalDiameterComputationExpression);
      ExecutionContext ctx_local = new ExecutionContext(ictx);
      CallHelper.executeWithParameterInjection(
          "platform:/plugin/org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram/egf/VpdslSiriusDiagramGenerator.fcore#_IXiPcGdyEeWYaMtt1GGGww",
          ctx_local, parameters);
    }
    ictx.setNode(currentNode);
    if (ictx.useReporter()) {
      Map<String, Object> parameterValues = new HashMap<String, Object>();
      parameterValues.put("parameter", this.parameter);
      String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
      String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
      ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
    }
    return null;
  }

  protected void method_setParentMapping(final StringBuffer out, final PatternContext ctx) throws Exception {
    dslvpElement = parameter;

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "setParentMapping", out.toString());
  }

  protected void method_initHorizontalDiameterComputationExpressionData(final StringBuffer out,
      final PatternContext ctx) throws Exception {
    if (parameter.eIsSet(
        VpstylecustomizationPackage.eINSTANCE.getEllipseCustomization_HorizontalDiameterComputationExpression())) {
      final CustomizationExpression expression = parameter.getHorizontalDiameterComputationExpression();
      final AbstractComputableElement expressionElement = expression.getOwnedExpressionElement();
      if (expressionElement != null) {
        final String newLabelExpression = DiagramExpressionUtil
            .getAbstractComputableElementExpression(expressionElement, VSMVariable.view, VSMVariable.container);
        set_horizontalDiameterComputationExpression(
            new StylePropertyNameValueCouple("horizontalDiameterComputationExpression", newLabelExpression));
      }
    }

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "initHorizontalDiameterComputationExpressionData", out.toString());
  }

  protected void method_initVerticalDiameterComputationExpressionData(final StringBuffer out, final PatternContext ctx)
      throws Exception {
    if (parameter.eIsSet(
        VpstylecustomizationPackage.eINSTANCE.getEllipseCustomization_VerticalDiameterComputationExpression())) {
      final CustomizationExpression expression = parameter.getVerticalDiameterComputationExpression();
      final AbstractComputableElement expressionElement = expression.getOwnedExpressionElement();
      if (expressionElement != null) {
        final String newLabelExpression = DiagramExpressionUtil
            .getAbstractComputableElementExpression(expressionElement, VSMVariable.view, VSMVariable.container);
        set_verticalDiameterComputationExpression(
            new StylePropertyNameValueCouple("verticalDiameterComputationExpression", newLabelExpression));
      }
    }

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "initVerticalDiameterComputationExpressionData", out.toString());
  }

  protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization parameter;

  public void set_parameter(
      org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization parameter) {
    this.parameter = parameter;
  }

  protected org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple horizontalDiameterComputationExpression;

  public void set_horizontalDiameterComputationExpression(
      org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple horizontalDiameterComputationExpression) {
    this.horizontalDiameterComputationExpression = horizontalDiameterComputationExpression;
  }

  protected org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple verticalDiameterComputationExpression;

  public void set_verticalDiameterComputationExpression(
      org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple verticalDiameterComputationExpression) {
    this.verticalDiameterComputationExpression = verticalDiameterComputationExpression;
  }

  public Map<String, Object> getParameters() {
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("parameter", this.parameter);
    return parameters;
  }

}
