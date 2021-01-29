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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.CommonGenerator;

@SuppressWarnings("all")
public class DataGenerator extends CommonGenerator {
  @Override
  public boolean checkInput(final List<EObject> objects) {
    final Function1<EObject, Boolean> _function = (EObject c) -> {
      return Boolean.valueOf((c instanceof Data));
    };
    EObject data = IterableExtensions.<EObject>findFirst(objects, _function);
    boolean _equals = Objects.equal(data, null);
    if (_equals) {
      return false;
    }
    return true;
  }
}
