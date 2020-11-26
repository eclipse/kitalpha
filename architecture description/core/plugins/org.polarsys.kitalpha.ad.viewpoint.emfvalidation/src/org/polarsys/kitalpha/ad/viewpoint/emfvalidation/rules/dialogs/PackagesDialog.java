/**
 * Copyright (c) 2009, 2020 Thales Corporate Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */

package org.polarsys.kitalpha.ad.viewpoint.emfvalidation.rules.dialogs;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Thomas Guiu
 * 
 */
public class PackagesDialog extends ElementDialog {

	public PackagesDialog(Shell shell) {
		super(shell);
	}

	@Override
	protected void init() {
		viewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				// Registry has non epackages such as fr.obeo.dsl.common.tools.internal.ecore.DynamicEPackageService$EPackageDescriptor$Dynamic
				return element instanceof EPackage;
			}
		});
		viewer.setInput(EPackage.Registry.INSTANCE.values());
	}

	public EPackage[] getResults() {
		return (EPackage[]) selection.toList().toArray(new EPackage[selection.size()]);
	}

	@Override
	protected String getDialogTitle() {
		return "Choose the packages to use";
	}

}
