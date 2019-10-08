/**
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertySet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.RuleSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.IViewpointSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpspec.CoreModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ExternalDataHelper;

@SuppressWarnings("all")
public abstract class CommonGenerator implements IViewpointSynchronizer {
  protected EcoreUtil.Copier copier;
  
  @Override
  public EObject synchronize(final List<EObject> input, final EObject output) {
    boolean _checkInput = this.checkInput(input);
    if (_checkInput) {
      return this.text2model(input, ((Viewpoint) output));
    }
    return null;
  }
  
  public abstract boolean checkInput(final List<EObject> objects);
  
  public boolean validate(final EObject object) {
    List<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
    Resource _eResource = object.eResource();
    IConcreteSyntaxValidator concreteSyntaxValidator = ((XtextResource) _eResource).getConcreteSyntaxValidator();
    IConcreteSyntaxValidator.DiagnosticListAcceptor _diagnosticListAcceptor = new IConcreteSyntaxValidator.DiagnosticListAcceptor(diagnostics);
    HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
    concreteSyntaxValidator.validateRecursive(object, _diagnosticListAcceptor, _hashMap);
    boolean _isEmpty = diagnostics.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      return false;
    }
    return true;
  }
  
  public EObject text2model(final List<EObject> input, final Viewpoint target) {
    this.setTargetName(target);
    this.createCopier(input);
    this.setTargetRefrerences(input, target);
    for (final EObject key : input) {
      {
        if ((key instanceof Data)) {
          Data oldData = target.getVP_Data();
          boolean _notEquals = (!Objects.equal(oldData, null));
          if (_notEquals) {
            EObject _get = this.copier.get(key);
            target.setVP_Data(((Data) _get));
          } else {
            EObject _get_1 = this.copier.get(key);
            target.setVP_Data(((Data) _get_1));
          }
          for (final EObject imp : input) {
            boolean _equals = imp.eClass().getName().equals("ImportURI");
            if (_equals) {
              EStructuralFeature nsuriAttr = imp.eClass().getEStructuralFeature("importURI");
              String importValue = imp.eGet(nsuriAttr).toString();
              EPackage ep = ExternalDataHelper.loadEPackage(importValue, target.eResource().getResourceSet());
              target.getVP_Data().getAdditionalExternalData().add(ep);
            }
          }
        }
        if ((key instanceof UIDescription)) {
          final Function1<Aspect, Boolean> _function = (Aspect c) -> {
            return Boolean.valueOf((c instanceof UIDescription));
          };
          Aspect oldUi = IterableExtensions.<Aspect>findFirst(target.getVP_Aspects(), _function);
          boolean _notEquals_1 = (!Objects.equal(oldUi, null));
          if (_notEquals_1) {
            EcoreUtil2.replace(oldUi, this.copier.get(key));
          } else {
            EObject _get_2 = this.copier.get(key);
            target.getVP_Aspects().add(((Aspect) _get_2));
          }
        }
        if ((key instanceof DiagramSet)) {
          final Function1<Aspect, Boolean> _function_1 = (Aspect c) -> {
            return Boolean.valueOf((c instanceof DiagramSet));
          };
          Aspect oldDiagramSet = IterableExtensions.<Aspect>findFirst(target.getVP_Aspects(), _function_1);
          boolean _notEquals_2 = (!Objects.equal(oldDiagramSet, null));
          if (_notEquals_2) {
            EcoreUtil2.replace(oldDiagramSet, this.copier.get(key));
          } else {
            EObject _get_3 = this.copier.get(key);
            target.getVP_Aspects().add(((Aspect) _get_3));
          }
          for (final EObject imp_1 : input) {
            boolean _equals_1 = imp_1.eClass().getName().equals("ImportGroup");
            if (_equals_1) {
              EStructuralFeature importGroupAttr = imp_1.eClass().getEStructuralFeature("importedGroup");
              String importValue_1 = imp_1.eGet(importGroupAttr).toString();
              ResourceSetImpl resourceSet = new ResourceSetImpl();
              final Function1<Aspect, Boolean> _function_2 = (Aspect d) -> {
                return Boolean.valueOf((d instanceof DiagramSet));
              };
              Aspect targetDiagram = IterableExtensions.<Aspect>findFirst(target.getVP_Aspects(), _function_2);
              boolean _isEcoreURI = this.isEcoreURI(importValue_1);
              if (_isEcoreURI) {
                final EPackage ePackage = ExternalDataHelper.loadEPackage(importValue_1, target.eResource().getResourceSet());
                boolean _notEquals_3 = (!Objects.equal(ePackage, null));
                if (_notEquals_3) {
                  ((DiagramSet) targetDiagram).getAdditionalExternalData().add(ePackage);
                }
              } else {
                final Resource resource = resourceSet.getResource(URI.createURI(importValue_1), true);
                boolean _notEquals_4 = (!Objects.equal(resource, null));
                if (_notEquals_4) {
                  final EObject rootGroup = resource.getContents().get(0);
                  boolean _notEquals_5 = (!Objects.equal(rootGroup, null));
                  if (_notEquals_5) {
                    ((DiagramSet) targetDiagram).getAdditionalExternalGroup().add(((Group) rootGroup));
                  }
                }
              }
            }
          }
        }
        if ((key instanceof Build)) {
          final Function1<Aspect, Boolean> _function_3 = (Aspect c) -> {
            return Boolean.valueOf((c instanceof Build));
          };
          Aspect oldBuild = IterableExtensions.<Aspect>findFirst(target.getVP_Aspects(), _function_3);
          boolean _notEquals_6 = (!Objects.equal(oldBuild, null));
          if (_notEquals_6) {
            EcoreUtil2.replace(oldBuild, this.copier.get(key));
          } else {
            EObject _get_4 = this.copier.get(key);
            target.getVP_Aspects().add(((Aspect) _get_4));
          }
        }
        if ((key instanceof Configuration)) {
          final Function1<Aspect, Boolean> _function_4 = (Aspect c) -> {
            return Boolean.valueOf((c instanceof Configuration));
          };
          Aspect oldConf = IterableExtensions.<Aspect>findFirst(target.getVP_Aspects(), _function_4);
          boolean _notEquals_7 = (!Objects.equal(oldConf, null));
          if (_notEquals_7) {
            EcoreUtil2.replace(oldConf, this.copier.get(key));
          } else {
            EObject _get_5 = this.copier.get(key);
            target.getVP_Aspects().add(((Aspect) _get_5));
          }
        }
        if ((key instanceof RuleSet)) {
          final Function1<Aspect, Boolean> _function_5 = (Aspect c) -> {
            return Boolean.valueOf((c instanceof RuleSet));
          };
          Aspect oldRules = IterableExtensions.<Aspect>findFirst(target.getVP_Aspects(), _function_5);
          boolean _notEquals_8 = (!Objects.equal(oldRules, null));
          if (_notEquals_8) {
            EcoreUtil2.replace(oldRules, this.copier.get(key));
          } else {
            EObject _get_6 = this.copier.get(key);
            target.getVP_Aspects().add(((Aspect) _get_6));
          }
        }
        if ((key instanceof ServiceSet)) {
          final Function1<Aspect, Boolean> _function_6 = (Aspect c) -> {
            return Boolean.valueOf((c instanceof ServiceSet));
          };
          Aspect oldServices = IterableExtensions.<Aspect>findFirst(target.getVP_Aspects(), _function_6);
          boolean _notEquals_9 = (!Objects.equal(oldServices, null));
          if (_notEquals_9) {
            EcoreUtil2.replace(oldServices, this.copier.get(key));
          } else {
            EObject _get_7 = this.copier.get(key);
            target.getVP_Aspects().add(((Aspect) _get_7));
          }
        }
        if ((key instanceof PropertySet)) {
          final Function1<Aspect, Boolean> _function_7 = (Aspect c) -> {
            return Boolean.valueOf((c instanceof PropertySet));
          };
          Aspect oldProperties = IterableExtensions.<Aspect>findFirst(target.getVP_Aspects(), _function_7);
          boolean _notEquals_10 = (!Objects.equal(oldProperties, null));
          if (_notEquals_10) {
            EcoreUtil2.replace(oldProperties, this.copier.get(key));
          } else {
            EObject _get_8 = this.copier.get(key);
            target.getVP_Aspects().add(((Aspect) _get_8));
          }
        }
        if ((key instanceof ViewpointActivityExplorer)) {
          final Function1<Aspect, Boolean> _function_8 = (Aspect c) -> {
            return Boolean.valueOf((c instanceof ViewpointActivityExplorer));
          };
          Aspect oldViewpointActivityExplorer = IterableExtensions.<Aspect>findFirst(target.getVP_Aspects(), _function_8);
          boolean _notEquals_11 = (!Objects.equal(oldViewpointActivityExplorer, null));
          if (_notEquals_11) {
            EcoreUtil2.replace(oldViewpointActivityExplorer, this.copier.get(key));
          } else {
            EObject _get_9 = this.copier.get(key);
            target.getVP_Aspects().add(((Aspect) _get_9));
          }
        }
      }
    }
    return target;
  }
  
  public boolean isEcoreURI(final String uri) {
    return (uri.startsWith("http://") || uri.endsWith(".ecore"));
  }
  
  public void setTargetName(final Viewpoint viewpoint) {
    if ((Objects.equal(viewpoint.getName(), null) || Objects.equal(viewpoint.getName(), ""))) {
      viewpoint.setName(CoreModelHelper.getViewpointName(viewpoint));
    }
  }
  
  public void createCopier(final List<EObject> input) {
    EcoreUtil.Copier _copier = new EcoreUtil.Copier(true, true);
    this.copier = _copier;
    this.copier.<EObject>copyAll(ListExtensions.<EObject>reverse(input));
    this.copier.copyReferences();
  }
  
  public void setTargetRefrerences(final List<EObject> input, final Viewpoint target) {
    for (final EObject key : input) {
      this.rewriteURI(key, target);
    }
  }
  
  public void rewriteURI(final EObject originalRoot, final EObject target) {
    TreeIterator<EObject> eAllContents = originalRoot.eAllContents();
    while (eAllContents.hasNext()) {
      {
        EObject candidate = eAllContents.next();
        Iterator<EObject> _iterator = candidate.eCrossReferences().iterator();
        EContentsEList.FeatureIterator featureIterator = ((EContentsEList.FeatureIterator) _iterator);
        while (featureIterator.hasNext()) {
          {
            Object referenced = featureIterator.next();
            EStructuralFeature _feature = featureIterator.feature();
            EReference referenceName = ((EReference) _feature);
            EObject eObject = ((EObject) referenced);
            String uriOriginal = EcoreUtil.getURI(eObject).fragment();
            boolean done = false;
            Set<EObject> _keySet = this.copier.keySet();
            for (final EObject key : _keySet) {
              {
                String uriToFind = EcoreUtil.getURI(this.copier.get(key)).fragment().replaceFirst("/", "");
                if ((uriOriginal.equals(uriToFind) && (!done))) {
                  this.copier.get(candidate).eSet(referenceName, this.copier.get(key));
                  done = true;
                }
              }
            }
          }
        }
      }
    }
  }
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
  }
}
