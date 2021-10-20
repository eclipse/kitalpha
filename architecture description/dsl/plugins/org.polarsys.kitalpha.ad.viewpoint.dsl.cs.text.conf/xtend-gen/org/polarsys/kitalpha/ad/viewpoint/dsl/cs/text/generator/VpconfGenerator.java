/**
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;

@SuppressWarnings("all")
public class VpconfGenerator extends CommonGenerator {
  public boolean checkInput(final List<EObject> objects) {
    final Function1<EObject, Boolean> _function = new Function1<EObject, Boolean>() {
      public Boolean apply(final EObject c) {
        return Boolean.valueOf((c instanceof Configuration));
      }
    };
    EObject configuration = IterableExtensions.<EObject>findFirst(objects, _function);
    boolean _equals = Objects.equal(configuration, null);
    if (_equals) {
      return false;
    }
    return true;
  }
}
