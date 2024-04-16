//Generated with EGF 1.6.4.202309111303
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.clazz.content;

import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.eclipse.egf.common.helper.*;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util.ECoreResourceManager;

public class LocalClassAssociation
    extends org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.abstracts.AbstractAssociationPattern {

  public LocalClassAssociation() {
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

      this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation) parameterParameter;

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

  protected void method_setTargetEClass(final StringBuffer out, final PatternContext ctx) throws Exception {
    /* Get the specified Target Class */
    org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class vpsClazz = parameter.getLocalTarget();

    targetEClass = null;

    /* Get the corresponding generated Target ECLass from the generated EPackage */
    EPackage vpsPackage = ECoreResourceManager.INSTANCE.getEPackage();
    for (EClassifier iEClassifier : vpsPackage.getEClassifiers()) {
      if (iEClassifier.getName().equals(vpsClazz.getName())) {
        targetEClass = (EClass) iEClassifier;
      }
    }

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "setTargetEClass", out.toString());
  }

  protected void method_setAbstractAssociationParameter(final StringBuffer out, final PatternContext ctx)
      throws Exception {
    abstractAssociation = parameter;

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "setAbstractAssociationParameter", out.toString());
  }

  protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation parameter;

  public void set_parameter(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation parameter) {
    this.parameter = parameter;
  }

  public Map<String, Object> getParameters() {
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("parameter", this.parameter);
    return parameters;
  }

}
