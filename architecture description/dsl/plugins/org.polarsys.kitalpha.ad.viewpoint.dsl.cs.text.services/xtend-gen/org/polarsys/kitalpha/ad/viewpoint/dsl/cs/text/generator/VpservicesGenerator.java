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

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertySet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.RuleSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public class VpservicesGenerator extends CommonGenerator {
  @Override
  public boolean checkInput(final List<EObject> objects) {
    final Function1<EObject, Boolean> _function = new Function1<EObject, Boolean>() {
      @Override
      public Boolean apply(final EObject c) {
        return Boolean.valueOf((c instanceof ServiceSet));
      }
    };
    EObject services = IterableExtensions.<EObject>findFirst(objects, _function);
    boolean _notEquals = (!Objects.equal(services, null));
    if (_notEquals) {
      return true;
    }
    final Function1<EObject, Boolean> _function_1 = new Function1<EObject, Boolean>() {
      @Override
      public Boolean apply(final EObject c) {
        return Boolean.valueOf((c instanceof RuleSet));
      }
    };
    EObject rules = IterableExtensions.<EObject>findFirst(objects, _function_1);
    boolean _notEquals_1 = (!Objects.equal(rules, null));
    if (_notEquals_1) {
      return true;
    }
    final Function1<EObject, Boolean> _function_2 = new Function1<EObject, Boolean>() {
      @Override
      public Boolean apply(final EObject c) {
        return Boolean.valueOf((c instanceof PropertySet));
      }
    };
    EObject properties = IterableExtensions.<EObject>findFirst(objects, _function_2);
    boolean _notEquals_2 = (!Objects.equal(properties, null));
    if (_notEquals_2) {
      return true;
    }
    return false;
  }
}
