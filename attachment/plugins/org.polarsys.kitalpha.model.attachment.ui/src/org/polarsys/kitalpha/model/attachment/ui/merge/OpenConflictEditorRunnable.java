/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.model.attachment.ui.merge;

import java.util.Collection;

import org.eclipse.compare.CompareUI;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.diffdata.EMergeableDifference;
import org.eclipse.emf.diffmerge.ui.setup.EMFDiffMergeEditorInput;
import org.eclipse.emf.diffmerge.ui.specification.IComparisonMethod;
import org.eclipse.emf.diffmerge.ui.viewers.EMFDiffNode;

/**
 * @author Thomas Guiu
 * 
 */
public class OpenConflictEditorRunnable implements Runnable {
	private final IComparisonMethod method;
	private final Collection<IDifference> conflicts;

	public OpenConflictEditorRunnable(IComparisonMethod method, Collection<IDifference> conflicts) {
		this.method = method;
		this.conflicts = conflicts;
	}

	@Override
	public void run() {
		EMFDiffMergeEditorInput input = new EMFDiffMergeEditorInput(method) {

			@Override
			public boolean canRunAsJob() {
				return false;
			}
		};
		CompareUI.openCompareEditor(input);
		EMFDiffNode compareResult = input.getCompareResult();
		for (IDifference diff : conflicts) {
			((IDifference.Editable)diff).setIgnored(true);
		}
	}
}
