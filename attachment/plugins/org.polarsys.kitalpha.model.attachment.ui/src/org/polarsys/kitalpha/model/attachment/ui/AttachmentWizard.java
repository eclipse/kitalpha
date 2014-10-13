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

package org.polarsys.kitalpha.model.attachment.ui;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.diffmerge.api.IMergeSelector;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.api.scopes.IPersistentModelScope;
import org.eclipse.emf.diffmerge.diffdata.EComparison;
import org.eclipse.emf.diffmerge.diffdata.EElementPresence;
import org.eclipse.emf.diffmerge.diffdata.EReferenceValuePresence;
import org.eclipse.emf.diffmerge.diffdata.impl.EComparisonImpl;
import org.eclipse.emf.diffmerge.ui.EMFDiffMergeUIPlugin;
import org.eclipse.emf.diffmerge.ui.setup.ComparisonSetup;
import org.eclipse.emf.diffmerge.ui.setup.ComparisonSetupManager;
import org.eclipse.emf.diffmerge.ui.specification.IComparisonMethod;
import org.eclipse.emf.diffmerge.ui.specification.IComparisonMethodFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.wizard.Wizard;

/**
 * @author Thomas Guiu
 * 
 */
public class AttachmentWizard extends Wizard {

	private final class MyTreeIterator implements TreeIterator<EObject> {
		private final List<EObject> filtered;
		private Iterator<EObject> it;

		private MyTreeIterator(List<EObject> filtered) {
			this.filtered = filtered;
			it = filtered.iterator();
		}

		@Override
		public boolean hasNext() {
			return it.hasNext();
		}

		@Override
		public EObject next() {
			return it.next();
		}

		@Override
		public void remove() {

		}

		@Override
		public void prune() {
			throw new UnsupportedOperationException();
		}
	}

	private List<IFile> files;

	private ModelPage modelPage;
	private ViewpointPage viewpointPage;

	public AttachmentWizard(List<IFile> files) {
		this.files = files;
		setNeedsProgressMonitor(true);
		setWindowTitle("Model Attachment");

	}

	@Override
	public void addPages() {
		addPage(modelPage = new ModelPage(files));
		addPage(viewpointPage = new ViewpointPage());
	}

	@Override
	public boolean performFinish() {

		ComparisonSetupManager manager = EMFDiffMergeUIPlugin.getDefault().getSetupManager();
		ComparisonSetup setup = manager.createComparisonSetup(modelPage.getTargetFile(), modelPage.getSourceFile(), modelPage.getAncestorFile());
		IComparisonMethodFactory comparisonMethodFactory = setup.getApplicableComparisonMethodFactories().get(0);
		final IComparisonMethod method = comparisonMethodFactory.createComparisonMethod(setup.getScopeDefinition(Role.TARGET), setup.getScopeDefinition(Role.REFERENCE), setup.getScopeDefinition(Role.ANCESTOR));
		final EditingDomain domain = method.getEditingDomain();

		domain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain) domain) {

			@Override
			protected void doExecute() {
				try {
					Role leftRole = Role.REFERENCE;
					IEditableModelScope sourceScope = method.getModelScopeDefinition(leftRole).createScope(domain);
					if (sourceScope instanceof IPersistentModelScope)
						((IPersistentModelScope) sourceScope).load();

					Role rightRole = Role.TARGET;
					IEditableModelScope targetScope = method.getModelScopeDefinition(rightRole).createScope(domain);
					if (targetScope instanceof IPersistentModelScope)
						((IPersistentModelScope) targetScope).load();

					IEditableModelScope ancestorScope = null;// method.getModelScopeDefinition(Role.ANCESTOR).createScope(domain);
					if (ancestorScope instanceof IPersistentModelScope)
						((IPersistentModelScope) ancestorScope).load();

					EComparison comparison = new EComparisonImpl(targetScope, sourceScope, ancestorScope);
					comparison.compute(method.getMatchPolicy(), method.getDiffPolicy(), method.getMergePolicy(), null);

					boolean consistent = comparison.isConsistent();
					boolean hasRemainingDifferences = comparison.hasRemainingDifferences();
					Collection<IDifference> remainingDifferences = comparison.getRemainingDifferences();
					System.out.println();
					comparison.merge(new IMergeSelector() {

						@Override
						public Role getMergeDirection(IDifference difference_p) {
							System.out.println(difference_p);
							if (difference_p.isConflicting())
								return null;
							if (difference_p instanceof EReferenceValuePresence) {
								EReferenceValuePresence diff = (EReferenceValuePresence) difference_p;
								return toMerge(diff.getValue().getReference()) ? Role.TARGET : null;
							}
							if (difference_p instanceof EElementPresence) {
								// les nouveaux elts
								EElementPresence diff = (EElementPresence) difference_p;
								return toMerge(diff.getElement(), true) ? Role.TARGET : null;
							}

							return Role.TARGET;
						}
					}, true, null);
					// comparison.merge(rightRole, true, null);
					Collection<IDifference> remainingDifferences2 = comparison.getRemainingDifferences();
					if (targetScope instanceof IPersistentModelScope.Editable)
						((IPersistentModelScope.Editable) targetScope).save();

				} catch (Exception e) {
					throw new WrappedException(e);
				}
			}

		});

		return true;
	}

	private boolean toMerge(EObject obj) {
		return viewpointPage.analysisResult.getUriToRemove().contains(obj.eClass().getEPackage().getNsURI());
	}

	private boolean toMerge(EObject obj, boolean checkContainers) {
		boolean merge = toMerge(obj);
		if (merge || !checkContainers)
			return merge;
		EObject eContainer = obj.eContainer();
		if (eContainer == null)
			return false;
		return toMerge(eContainer, true);
	}
}
