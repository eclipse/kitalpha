/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.transposer.ui.internal.menus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;

import org.polarsys.kitalpha.transposer.ui.TransposerUiPlugin;
import org.polarsys.kitalpha.transposer.ui.actions.LaunchTransposerAction;
import org.polarsys.kitalpha.transposer.ui.internal.configuration.TransposerLaunchConfigurationHelper;

/**
 * 
 * @author Guillaume Gebhart
 *
 */
public class TransposerContributionItem extends CompoundContributionItem {

  public TransposerContributionItem() {
    super();
  }

  public TransposerContributionItem(String id_p) {
    super(id_p);
  }

  @Override
  protected IContributionItem[] getContributionItems() {
    List<IContributionItem> items = getPopupMenu();
    return items.toArray(new IContributionItem[items.size()]);
  }

  public static List<IContributionItem> getPopupMenu() {
    List<IContributionItem> result = new ArrayList<IContributionItem>();

    Set<ILaunchConfiguration> allConfigs = new HashSet<ILaunchConfiguration>();
    ISelection selection = null;

    try {
      selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite().getSelectionProvider().getSelection();

    } catch (NullPointerException e) {
      // no found active part or window
    }
    List<?> adaptedSelection = adaptSelection(selection);

    allConfigs.addAll(getLaunchConfigurations(adaptedSelection));

    for (ILaunchConfiguration launchConfig : allConfigs) {
      if (launchConfig != null && launchConfig.getName() != "" && launchConfig.getName() != null) //$NON-NLS-1$
        result.add(new ActionContributionItem(new LaunchTransposerAction(launchConfig)));
    }

    return result;
  }

  public static Set<ILaunchConfiguration> getLaunchConfigurations(List<?> selection_p) {
    Set<ILaunchConfiguration> result = new HashSet<ILaunchConfiguration>();
    ILaunchConfiguration[] launchConfigurations = new ILaunchConfiguration[0];

    try {
      launchConfigurations = TransposerLaunchConfigurationHelper.getAllTransposerLaunchConfigurations(selection_p);
    } catch (CoreException e) {
      TransposerUiPlugin.getDefault().getLog().log(e.getStatus());
    }

    result.addAll(new HashSet<ILaunchConfiguration>(Arrays.asList(launchConfigurations)));
    return result;
  }

  public static List<?> adaptSelection(ISelection selection) {
    List<Object> result = new ArrayList<Object>();
    if (selection instanceof IStructuredSelection) {
      IStructuredSelection structuredSelection = (IStructuredSelection) selection;
      List<?> list = structuredSelection.toList();
      return new ArrayList<Object>(list); 
    }
    return result;
  }
  
  public static boolean haveLauchConfiguration(){
	  return getPopupMenu().size()>0;
  }
  
}
