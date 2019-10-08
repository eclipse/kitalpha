/**
 * Copyright (c) 2009, 2018 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
