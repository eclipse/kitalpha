//Generated with EGF 1.6.4.202309111303
package org.polarsys.kitalpha.emde.genchain.extension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.egf.model.pattern.Node;
import org.eclipse.egf.model.domain.Domain;
import org.eclipse.egf.model.domain.DomainFactory;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.domain.DomainViewpoint;
import org.eclipse.egf.model.domain.TypeDomain;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.fcore.OrchestrationParameter;
import org.eclipse.egf.model.fprod.ProductionPlan;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.types.Type;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.IQuery;
import org.eclipse.egf.portfolio.genchain.generationChain.EmfGeneration;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.eclipse.egf.portfolio.genchain.tools.FcoreBuilderConstants;
import org.eclipse.egf.portfolio.genchain.tools.utils.ActivityInvocationHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class EmdeCdoGenerationPattern {

  public EmdeCdoGenerationPattern() {
    //Here is the constructor
    // add initialisation of the pattern variables (declaration has been already done).
    activity = "platform:/plugin/org.polarsys.kitalpha.emde.egf/egf/eMDE_EMF_Extension.fcore#_pL9xED5HEeiGQ4OFxriD0Q";

  }

  public void generate(Object argument) throws Exception {
    InternalPatternContext ctx = (InternalPatternContext) argument;
    IQuery.ParameterDescription paramDesc = null;
    Map<String, String> queryCtx = null;
    Node.Container currentNode = ctx.getNode();
    List<Object> parameterList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)

    for (Object parameterParameter : parameterList) {

      this.parameter = (org.polarsys.kitalpha.emde.genchain.extension.model.EmdeCdoGeneration) parameterParameter;

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
    method_body(new StringBuffer(), ictx);
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

  protected void method_body(final StringBuffer out, final PatternContext ctx) throws Exception {
    Map<GenerationElement, FactoryComponent> fcs = (Map<GenerationElement, FactoryComponent>) ctx
        .getValue(FcoreBuilderConstants.CURRENT_FCORE);
    FactoryComponent fc = fcs.get((GenerationElement) (parameter.eContainer()));

    ProductionPlan pp = (ProductionPlan) fc.getOrchestration();
    DomainViewpoint dvp = (DomainViewpoint) fc.getViewpointContainer().getViewpoint(DomainViewpoint.class);
    ResourceSet resourceSet = fc.eResource().getResourceSet();

    URI uri = ((HashMap<String, URI>) ctx.getValue(FcoreBuilderConstants.GENMODEL_URIS)).get(parameter.getModelPath());
    EMFDomain genModelDomain = ActivityInvocationHelper.getDomain(dvp, uri);

    Map<String, Type> contracts = new HashMap<String, Type>();
    Map<String, OrchestrationParameter> parameters = new HashMap<String, OrchestrationParameter>();

    for (OrchestrationParameter param : pp.getOrchestrationParameters()) {
      if (ActivityInvocationHelper.GENERATION_EXTENSION_PARAMETER_NAME.equals(param.getName())) {
        parameters.put("pattern.substitutions", param);
      }
    }

    TypeDomain typeDomain = DomainFactory.eINSTANCE.createTypeDomain();
    typeDomain.setDomain(genModelDomain);
    contracts.put("genModel", typeDomain);
    ActivityInvocationHelper.addInvocation(pp,
        (Activity) resourceSet.getEObject(URI.createURI(this.activity, false), true), contracts, parameters);

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "body", out.toString());
  }

  public boolean preCondition(PatternContext ctx) throws Exception {
    return true;
  }

  protected org.polarsys.kitalpha.emde.genchain.extension.model.EmdeCdoGeneration parameter;

  public void set_parameter(org.polarsys.kitalpha.emde.genchain.extension.model.EmdeCdoGeneration parameter) {
    this.parameter = parameter;
  }

  protected java.lang.String activity;

  public void set_activity(java.lang.String activity) {
    this.activity = activity;
  }

  public Map<String, Object> getParameters() {
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("parameter", this.parameter);
    return parameters;
  }

}
