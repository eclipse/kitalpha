/**
 * Copyright (c) 2014 Thales Global Services S.A.S.
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
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
            EClass _eClass = imp.eClass();
            String _name = _eClass.getName();
            boolean _equals = _name.equals("ImportURI");
            if (_equals) {
              EClass _eClass_1 = imp.eClass();
              EStructuralFeature nsuriAttr = _eClass_1.getEStructuralFeature("importURI");
              Object _eGet = imp.eGet(nsuriAttr);
              String importValue = _eGet.toString();
              Resource _eResource = target.eResource();
              ResourceSet _resourceSet = _eResource.getResourceSet();
              EPackage ep = ExternalDataHelper.loadEPackage(importValue, _resourceSet);
              Data _vP_Data = target.getVP_Data();
              EList<EPackage> _additionalExternalData = _vP_Data.getAdditionalExternalData();
              _additionalExternalData.add(ep);
            }
          }
        }
        if ((key instanceof UIDescription)) {
          EList<Aspect> _vP_Aspects = target.getVP_Aspects();
          final Function1<Aspect, Boolean> _function = new Function1<Aspect, Boolean>() {
            @Override
            public Boolean apply(final Aspect c) {
              return Boolean.valueOf((c instanceof UIDescription));
            }
          };
          Aspect oldUi = IterableExtensions.<Aspect>findFirst(_vP_Aspects, _function);
          boolean _notEquals_1 = (!Objects.equal(oldUi, null));
          if (_notEquals_1) {
            EObject _get_2 = this.copier.get(key);
            EcoreUtil2.replace(oldUi, _get_2);
          } else {
            EList<Aspect> _vP_Aspects_1 = target.getVP_Aspects();
            EObject _get_3 = this.copier.get(key);
            _vP_Aspects_1.add(((Aspect) _get_3));
          }
        }
        if ((key instanceof DiagramSet)) {
          EList<Aspect> _vP_Aspects_2 = target.getVP_Aspects();
          final Function1<Aspect, Boolean> _function_1 = new Function1<Aspect, Boolean>() {
            @Override
            public Boolean apply(final Aspect c) {
              return Boolean.valueOf((c instanceof DiagramSet));
            }
          };
          Aspect oldDiagramSet = IterableExtensions.<Aspect>findFirst(_vP_Aspects_2, _function_1);
          boolean _notEquals_2 = (!Objects.equal(oldDiagramSet, null));
          if (_notEquals_2) {
            EObject _get_4 = this.copier.get(key);
            EcoreUtil2.replace(oldDiagramSet, _get_4);
          } else {
            EList<Aspect> _vP_Aspects_3 = target.getVP_Aspects();
            EObject _get_5 = this.copier.get(key);
            _vP_Aspects_3.add(((Aspect) _get_5));
          }
          for (final EObject imp_1 : input) {
            EClass _eClass_2 = imp_1.eClass();
            String _name_1 = _eClass_2.getName();
            boolean _equals_1 = _name_1.equals("ImportGroup");
            if (_equals_1) {
              EClass _eClass_3 = imp_1.eClass();
              EStructuralFeature importGroupAttr = _eClass_3.getEStructuralFeature("importedGroup");
              Object _eGet_1 = imp_1.eGet(importGroupAttr);
              String importValue_1 = _eGet_1.toString();
              int _length = importValue_1.length();
              int _minus = (_length - 1);
              String _substring = importValue_1.substring(1, _minus);
              importValue_1 = _substring;
              ResourceSetImpl resourceSet = new ResourceSetImpl();
              EList<Aspect> _vP_Aspects_4 = target.getVP_Aspects();
              final Function1<Aspect, Boolean> _function_2 = new Function1<Aspect, Boolean>() {
                @Override
                public Boolean apply(final Aspect d) {
                  return Boolean.valueOf((d instanceof DiagramSet));
                }
              };
              Aspect targetDiagram = IterableExtensions.<Aspect>findFirst(_vP_Aspects_4, _function_2);
              boolean _isEcoreURI = this.isEcoreURI(importValue_1);
              if (_isEcoreURI) {
                Resource _eResource_1 = target.eResource();
                ResourceSet _resourceSet_1 = _eResource_1.getResourceSet();
                final EPackage ePackage = ExternalDataHelper.loadEPackage(importValue_1, _resourceSet_1);
                boolean _notEquals_3 = (!Objects.equal(ePackage, null));
                if (_notEquals_3) {
                  EList<EPackage> _additionalExternalData_1 = ((DiagramSet) targetDiagram).getAdditionalExternalData();
                  _additionalExternalData_1.add(ePackage);
                }
              } else {
                URI _createURI = URI.createURI(importValue_1);
                final Resource resource = resourceSet.getResource(_createURI, true);
                boolean _notEquals_4 = (!Objects.equal(resource, null));
                if (_notEquals_4) {
                  EList<EObject> _contents = resource.getContents();
                  final EObject rootGroup = _contents.get(0);
                  boolean _notEquals_5 = (!Objects.equal(rootGroup, null));
                  if (_notEquals_5) {
                    EList<Group> _additionalExternalGroup = ((DiagramSet) targetDiagram).getAdditionalExternalGroup();
                    _additionalExternalGroup.add(((Group) rootGroup));
                  }
                }
              }
            }
          }
        }
        if ((key instanceof Build)) {
          EList<Aspect> _vP_Aspects_5 = target.getVP_Aspects();
          final Function1<Aspect, Boolean> _function_3 = new Function1<Aspect, Boolean>() {
            @Override
            public Boolean apply(final Aspect c) {
              return Boolean.valueOf((c instanceof Build));
            }
          };
          Aspect oldBuild = IterableExtensions.<Aspect>findFirst(_vP_Aspects_5, _function_3);
          boolean _notEquals_6 = (!Objects.equal(oldBuild, null));
          if (_notEquals_6) {
            EObject _get_6 = this.copier.get(key);
            EcoreUtil2.replace(oldBuild, _get_6);
          } else {
            EList<Aspect> _vP_Aspects_6 = target.getVP_Aspects();
            EObject _get_7 = this.copier.get(key);
            _vP_Aspects_6.add(((Aspect) _get_7));
          }
        }
        if ((key instanceof Configuration)) {
          EList<Aspect> _vP_Aspects_7 = target.getVP_Aspects();
          final Function1<Aspect, Boolean> _function_4 = new Function1<Aspect, Boolean>() {
            @Override
            public Boolean apply(final Aspect c) {
              return Boolean.valueOf((c instanceof Configuration));
            }
          };
          Aspect oldConf = IterableExtensions.<Aspect>findFirst(_vP_Aspects_7, _function_4);
          boolean _notEquals_7 = (!Objects.equal(oldConf, null));
          if (_notEquals_7) {
            EObject _get_8 = this.copier.get(key);
            EcoreUtil2.replace(oldConf, _get_8);
          } else {
            EList<Aspect> _vP_Aspects_8 = target.getVP_Aspects();
            EObject _get_9 = this.copier.get(key);
            _vP_Aspects_8.add(((Aspect) _get_9));
          }
        }
        if ((key instanceof RuleSet)) {
          EList<Aspect> _vP_Aspects_9 = target.getVP_Aspects();
          final Function1<Aspect, Boolean> _function_5 = new Function1<Aspect, Boolean>() {
            @Override
            public Boolean apply(final Aspect c) {
              return Boolean.valueOf((c instanceof RuleSet));
            }
          };
          Aspect oldRules = IterableExtensions.<Aspect>findFirst(_vP_Aspects_9, _function_5);
          boolean _notEquals_8 = (!Objects.equal(oldRules, null));
          if (_notEquals_8) {
            EObject _get_10 = this.copier.get(key);
            EcoreUtil2.replace(oldRules, _get_10);
          } else {
            EList<Aspect> _vP_Aspects_10 = target.getVP_Aspects();
            EObject _get_11 = this.copier.get(key);
            _vP_Aspects_10.add(((Aspect) _get_11));
          }
        }
        if ((key instanceof ServiceSet)) {
          EList<Aspect> _vP_Aspects_11 = target.getVP_Aspects();
          final Function1<Aspect, Boolean> _function_6 = new Function1<Aspect, Boolean>() {
            @Override
            public Boolean apply(final Aspect c) {
              return Boolean.valueOf((c instanceof ServiceSet));
            }
          };
          Aspect oldServices = IterableExtensions.<Aspect>findFirst(_vP_Aspects_11, _function_6);
          boolean _notEquals_9 = (!Objects.equal(oldServices, null));
          if (_notEquals_9) {
            EObject _get_12 = this.copier.get(key);
            EcoreUtil2.replace(oldServices, _get_12);
          } else {
            EList<Aspect> _vP_Aspects_12 = target.getVP_Aspects();
            EObject _get_13 = this.copier.get(key);
            _vP_Aspects_12.add(((Aspect) _get_13));
          }
        }
        if ((key instanceof PropertySet)) {
          EList<Aspect> _vP_Aspects_13 = target.getVP_Aspects();
          final Function1<Aspect, Boolean> _function_7 = new Function1<Aspect, Boolean>() {
            @Override
            public Boolean apply(final Aspect c) {
              return Boolean.valueOf((c instanceof PropertySet));
            }
          };
          Aspect oldProperties = IterableExtensions.<Aspect>findFirst(_vP_Aspects_13, _function_7);
          boolean _notEquals_10 = (!Objects.equal(oldProperties, null));
          if (_notEquals_10) {
            EObject _get_14 = this.copier.get(key);
            EcoreUtil2.replace(oldProperties, _get_14);
          } else {
            EList<Aspect> _vP_Aspects_14 = target.getVP_Aspects();
            EObject _get_15 = this.copier.get(key);
            _vP_Aspects_14.add(((Aspect) _get_15));
          }
        }
        if ((key instanceof ViewpointActivityExplorer)) {
          EList<Aspect> _vP_Aspects_15 = target.getVP_Aspects();
          final Function1<Aspect, Boolean> _function_8 = new Function1<Aspect, Boolean>() {
            @Override
            public Boolean apply(final Aspect c) {
              return Boolean.valueOf((c instanceof ViewpointActivityExplorer));
            }
          };
          Aspect oldViewpointActivityExplorer = IterableExtensions.<Aspect>findFirst(_vP_Aspects_15, _function_8);
          boolean _notEquals_11 = (!Objects.equal(oldViewpointActivityExplorer, null));
          if (_notEquals_11) {
            EObject _get_16 = this.copier.get(key);
            EcoreUtil2.replace(oldViewpointActivityExplorer, _get_16);
          } else {
            EList<Aspect> _vP_Aspects_16 = target.getVP_Aspects();
            EObject _get_17 = this.copier.get(key);
            _vP_Aspects_16.add(((Aspect) _get_17));
          }
        }
      }
    }
    return target;
  }
  
  public boolean isEcoreURI(final String uri) {
    boolean _or = false;
    boolean _startsWith = uri.startsWith("http://");
    if (_startsWith) {
      _or = true;
    } else {
      boolean _endsWith = uri.endsWith(".ecore");
      _or = _endsWith;
    }
    return _or;
  }
  
  public void setTargetName(final Viewpoint viewpoint) {
    boolean _or = false;
    String _name = viewpoint.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      _or = true;
    } else {
      String _name_1 = viewpoint.getName();
      boolean _equals_1 = Objects.equal(_name_1, "");
      _or = _equals_1;
    }
    if (_or) {
      String _viewpointName = CoreModelHelper.getViewpointName(viewpoint);
      viewpoint.setName(_viewpointName);
    }
  }
  
  public void createCopier(final List<EObject> input) {
    EcoreUtil.Copier _copier = new EcoreUtil.Copier(true, true);
    this.copier = _copier;
    List<EObject> _reverse = ListExtensions.<EObject>reverse(input);
    this.copier.<EObject>copyAll(_reverse);
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
        EList<EObject> _eCrossReferences = candidate.eCrossReferences();
        Iterator<EObject> _iterator = _eCrossReferences.iterator();
        EContentsEList.FeatureIterator featureIterator = ((EContentsEList.FeatureIterator) _iterator);
        while (featureIterator.hasNext()) {
          {
            Object referenced = featureIterator.next();
            EStructuralFeature _feature = featureIterator.feature();
            EReference referenceName = ((EReference) _feature);
            EObject eObject = ((EObject) referenced);
            URI _uRI = EcoreUtil.getURI(eObject);
            String uriOriginal = _uRI.fragment();
            boolean done = false;
            Set<EObject> _keySet = this.copier.keySet();
            for (final EObject key : _keySet) {
              {
                EObject _get = this.copier.get(key);
                URI _uRI_1 = EcoreUtil.getURI(_get);
                String _fragment = _uRI_1.fragment();
                String uriToFind = _fragment.replaceFirst("/", "");
                boolean _and = false;
                boolean _equals = uriOriginal.equals(uriToFind);
                if (!_equals) {
                  _and = false;
                } else {
                  _and = (!done);
                }
                if (_and) {
                  EObject _get_1 = this.copier.get(candidate);
                  EObject _get_2 = this.copier.get(key);
                  _get_1.eSet(referenceName, _get_2);
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
