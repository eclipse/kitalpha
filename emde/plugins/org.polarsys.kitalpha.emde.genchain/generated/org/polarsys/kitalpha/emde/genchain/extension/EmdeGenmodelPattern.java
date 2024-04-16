//Generated with EGF 1.6.4.202309111303
package org.polarsys.kitalpha.emde.genchain.extension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.egf.model.pattern.Node;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.egf.common.helper.ObjectHolder;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.IQuery;
import org.eclipse.egf.portfolio.genchain.generationChain.EmfGeneration;
import org.eclipse.egf.portfolio.genchain.tools.FcoreBuilderConstants;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenResourceKind;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimeVersion;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.search.core.text.TextSearchEngine;
import org.eclipse.search.core.text.TextSearchRequestor;
import org.eclipse.search.core.text.TextSearchScope;
import org.eclipse.search.ui.text.FileTextSearchScope;
import org.osgi.framework.Bundle;
import org.osgi.framework.Version;

import org.polarsys.kitalpha.emde.genchain.utils.EmdeEcoreImporterHelper;
import org.polarsys.kitalpha.emde.genchain.utils.GenRuntimeVersionHelper;
import org.polarsys.kitalpha.emde.genchain.utils.GenmodelLocator;

public class EmdeGenmodelPattern {

  public EmdeGenmodelPattern() {
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

      this.parameter = (org.polarsys.kitalpha.emde.genchain.extension.model.EmdeGeneration) parameterParameter;

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
    method_create(new StringBuffer(), ictx);
    method_updateContent(new StringBuffer(), ictx);
    method_save(new StringBuffer(), ictx);
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

  protected void method_create(final StringBuffer out, final PatternContext ctx) throws Exception {
    IPath ecorePath = new Path(parameter.getModelPath());

    IFile file = GenmodelLocator.lookup(ecorePath);

    if (file == null) {
      ResourceSet resourceSet = new TargetPlatformResourceSet();
      Resource resource = null;
      IPath genmodelPath = ecorePath.removeFileExtension().addFileExtension("genmodel");
      genmodelPath = new Path(parameter.getPluginName()).append(genmodelPath.removeFirstSegments(1));
      URI genmodelURI = URI.createPlatformPluginURI(genmodelPath.toString(), false);

      try {
        // see if a created genmodel exists
        resource = resourceSet.getResource(genmodelURI, true);
      } catch (Exception e1) {
        // create it
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(parameter.getPluginName());
        if (!project.exists())
          project.create(null);
        if (!project.isOpen())
          project.open(null);
        URI ecoreURI = URI.createPlatformResourceURI(ecorePath.toString(), false);
        importer = EmdeEcoreImporterHelper.createEcoreImporter(genmodelPath.removeLastSegments(1), ecoreURI, parameter);
      }
      genmodelURI = URI.createPlatformResourceURI(genmodelPath.toString(), false);
      ((HashMap<String, URI>) ctx.getValue(FcoreBuilderConstants.GENMODEL_URIS)).put(parameter.getModelPath(),
          genmodelURI);
    } else {
      URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), false);
      ((HashMap<String, URI>) ctx.getValue(FcoreBuilderConstants.GENMODEL_URIS)).put(parameter.getModelPath(), uri);
    }

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "create", out.toString());
  }

  protected void method_save(final StringBuffer out, final PatternContext ctx) throws Exception {
    if (importer != null)
      importer.saveGenModelAndEPackages(new BasicMonitor());

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "save", out.toString());
  }

  protected void method_updateContent(final StringBuffer out, final PatternContext ctx) throws Exception {
    if (importer == null)
      return;
    GenModel genModel = importer.getGenModel();
    String emfModelPath = parameter.getModelPath();
    for (GenPackage genPackage : genModel.getGenPackages()) {
      String ecoreFileName = genPackage.getEcorePackage().eResource().getURI().lastSegment();
      if (emfModelPath.contains(ecoreFileName)) {
        genPackage.setBasePackage(parameter.getBasePackage());
      }

      // EMDE Extension Genmodel
      genPackage.setResource(GenResourceKind.XMI_LITERAL);
      genPackage.setDisposableProviderFactory(true);
      genPackage.setGenerateExampleClass(false);
      genPackage.setMultipleEditorPages(false);
      genPackage.setExtensibleProviderFactory(true);
      genPackage.setChildCreationExtenders(true);
      // EMDE Extension Genmodel

    }

    String emfPluginName = parameter.getPluginName();
    genModel.setModelPluginID(emfPluginName);
    genModel.setModelDirectory("/" + emfPluginName + "/src");

    // EMDE Extension Genmodel
    genModel.setNonNLSMarkers(true);
    Bundle bundle = Platform.getBundle("org.eclipse.emf.codegen");
    genModel.setRuntimeVersion(GenRuntimeVersionHelper.getVersion(bundle.getVersion()));
    genModel.setRootExtendsClass("org.eclipse.emf.ecore.impl.EObjectImpl");
    genModel.setCodeFormatting(true);
    genModel.setOptimizedHasChildren(true);
    genModel.setTableProviders(false);
    genModel.setColorProviders(false);
    // EMDE Extension Genmodel

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "updateContent", out.toString());
  }

  public boolean preCondition(PatternContext ctx) throws Exception {
    return true;
  }

  protected org.polarsys.kitalpha.emde.genchain.extension.model.EmdeGeneration parameter;

  public void set_parameter(org.polarsys.kitalpha.emde.genchain.extension.model.EmdeGeneration parameter) {
    this.parameter = parameter;
  }

  protected org.eclipse.emf.importer.ecore.EcoreImporter importer;

  public void set_importer(org.eclipse.emf.importer.ecore.EcoreImporter importer) {
    this.importer = importer;
  }

  public Map<String, Object> getParameters() {
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("parameter", this.parameter);
    return parameters;
  }

}
