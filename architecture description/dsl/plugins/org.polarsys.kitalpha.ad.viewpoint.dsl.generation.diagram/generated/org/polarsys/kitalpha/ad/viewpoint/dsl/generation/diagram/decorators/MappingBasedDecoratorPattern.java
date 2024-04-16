//Generated with EGF 1.6.4.qualifier
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.decorators;

import java.util.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.MappingBasedDecoration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingBasedDecorator;

public class MappingBasedDecoratorPattern
    extends org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.decorators.common.AbstractDecorator {

  public MappingBasedDecoratorPattern() {
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

      this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingBasedDecorator) parameterParameter;

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
    method_setMappings(new StringBuffer(), ictx);
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

  protected void method_createSiriusDecorator(final StringBuffer out, final PatternContext ctx) throws Exception {
    siriusDecorator = DescriptionFactory.eINSTANCE.createMappingBasedDecoration();

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "createSiriusDecorator", out.toString());
  }

  protected void method_initializeVariable(final StringBuffer out, final PatternContext ctx) throws Exception {
    vpdslDecorator = parameter;

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "initializeVariable", out.toString());
  }

  protected void method_setMappings(final StringBuffer out, final PatternContext ctx) throws Exception {
    EList<DiagramElementMapping> externalMappings = ((MappingBasedDecorator) vpdslDecorator).getExternalMappings();
    ((MappingBasedDecoration) siriusDecorator).getMappings().addAll(externalMappings);

    EList<DiagramElement> internalMappings = ((MappingBasedDecorator) vpdslDecorator).getInternalMappings();

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "setMappings", out.toString());
  }

  protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingBasedDecorator parameter;

  public void set_parameter(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingBasedDecorator parameter) {
    this.parameter = parameter;
  }

  public Map<String, Object> getParameters() {
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("parameter", this.parameter);
    return parameters;
  }

}
