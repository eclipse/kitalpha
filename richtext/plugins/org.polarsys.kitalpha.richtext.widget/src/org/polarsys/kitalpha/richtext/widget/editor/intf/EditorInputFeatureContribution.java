/*******************************************************************************
 * Copyright (c) 2018, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.editor.intf;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * 
 * Manage features of input model that can have an impact on Richtext Editor
 *
 */
public interface EditorInputFeatureContribution {

  /**
   * 
   * @return a list of features of input model that editor's titles must be synchronized to
   */
  List<EStructuralFeature> getTitleChangingFeatures();
}
