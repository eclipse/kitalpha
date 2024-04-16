//Generated with EGF 1.6.4.qualifier
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.customizations.style;

import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.eclipse.egf.common.helper.*;

import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.viewpoint.description.Customization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.GenerationUtil;
import org.eclipse.sirius.viewpoint.description.DescriptionFactory;

public class CustomizationsPattern
    extends org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.common.DiagramElementPattern {

  public CustomizationsPattern() {
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

      this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations) parameterParameter;

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
    doremiElement = sStyleCustomization;

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "setParentMapping", out.toString());
  }

  protected void method_createDoremiElement(final StringBuffer out, final PatternContext ctx) throws Exception {
    // Create the Style Customizations element

    sStyleCustomization = DescriptionFactory.eINSTANCE.createCustomization();

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "createDoremiElement", out.toString());
  }

  protected void method_addElementToODesign(final StringBuffer out, final PatternContext ctx) throws Exception {
    EObject vpParent = parameter.eContainer();
    EObject currentParent = GenerationUtil.getDoremiElement(vpParent);

    Customization customization = (Customization) sStyleCustomization;

    if (currentParent instanceof Layer) {
      Layer owner = (Layer) currentParent;
      owner.setCustomization(customization);
    }

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "addElementToODesign", out.toString());
  }

  protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations parameter;

  public void set_parameter(
      org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations parameter) {
    this.parameter = parameter;
  }

  protected org.eclipse.emf.ecore.EObject sStyleCustomization;

  public void set_sStyleCustomization(org.eclipse.emf.ecore.EObject sStyleCustomization) {
    this.sStyleCustomization = sStyleCustomization;
  }

  public Map<String, Object> getParameters() {
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("parameter", this.parameter);
    return parameters;
  }

}
