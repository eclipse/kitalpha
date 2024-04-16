//Generated with EGF 1.6.4.qualifier
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.customizations.style.specific;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaMethodData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaMethodData.JavaMethodReturnType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple;

public class Node_BundleImageCustomization extends
    org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.customizations.common.AbstractSpecificNodeCustomizationPattern {

  public Node_BundleImageCustomization() {
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

      this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.BundledImageCustomization) parameterParameter;

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
    method_initShapeData(new StringBuffer(), ictx);
    {
      final Map<String, Object> parameters = new HashMap<String, Object>();
      parameters.put("parent", this.parent);
      parameters.put("applyOnAll", this.applyOnAll);
      parameters.put("appliedOn", this.appliedOn);
      parameters.put("stylePropertyData", this.shape);
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

  protected void method_initShapeData(final StringBuffer out, final PatternContext ctx) throws Exception {
    if (parameter.eIsSet(VpstylecustomizationPackage.eINSTANCE.getBundledImageCustomization_Shape())) {
      String enumLiteralName = parameter.getShape().toString();
      String methodCode = "return DiagramPackage.eINSTANCE.getBundledImageShape().getEEnumLiteral(\"" + enumLiteralName
          + "\");";
      char first = Character.toUpperCase(enumLiteralName.charAt(0));
      enumLiteralName = first + enumLiteralName.substring(1).toLowerCase();
      String methodName = "getBundledImageShape" + enumLiteralName;

      JavaMethodData javaMethodData = new JavaMethodData(methodName, JavaMethodReturnType.EEnumLiteral, methodCode);

      // Set method parameters data
      javaMethodData.addMethodParameter("any", "EObject", "any model element");

      // Set method Required classes FQN
      javaMethodData.getRequiredClassesFQN().add("org.eclipse.emf.ecore.EEnumLiteral");
      javaMethodData.getRequiredClassesFQN().add("org.eclipse.sirius.diagram.DiagramPackage");

      // Add the method to the Java Service.
      if (javaMethodData != null)
        enumHelperJavaServiceData.addMethod(javaMethodData);

      set_shape(new StylePropertyNameValueCouple("shape", "service:" + methodName));
    }

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "initShapeData", out.toString());
  }

  protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.BundledImageCustomization parameter;

  public void set_parameter(
      org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.BundledImageCustomization parameter) {
    this.parameter = parameter;
  }

  protected org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple shape;

  public void set_shape(
      org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple shape) {
    this.shape = shape;
  }

  public Map<String, Object> getParameters() {
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("parameter", this.parameter);
    return parameters;
  }

}
