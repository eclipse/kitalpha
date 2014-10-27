package org.polarsys.kitalpha.model.attachment.ui.merge;

import java.util.Collection;

import org.eclipse.compare.CompareUI;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.api.scopes.IPersistentModelScope;
import org.eclipse.emf.diffmerge.diffdata.EComparison;
import org.eclipse.emf.diffmerge.diffdata.EMergeableDifference;
import org.eclipse.emf.diffmerge.diffdata.impl.EComparisonImpl;
import org.eclipse.emf.diffmerge.ui.setup.EMFDiffMergeEditorInput;
import org.eclipse.emf.diffmerge.ui.specification.IComparisonMethod;
import org.eclipse.emf.diffmerge.ui.viewers.EMFDiffNode;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

public class MergeCommand extends RecordingCommand {
	private final EditingDomain domain;
	private final IComparisonMethod method;
	private IProgressMonitor monitor;
	private Collection<String> selectedUris;

	public MergeCommand(TransactionalEditingDomain domain, IComparisonMethod method, Collection<String> selectedUris, IProgressMonitor monitor) {
		super(domain);
		this.domain = domain;
		this.method = method;
		this.selectedUris = selectedUris;
		this.monitor = monitor;
	}

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
			comparison.compute(method.getMatchPolicy(), method.getDiffPolicy(), method.getMergePolicy(), monitor);

			boolean consistent = comparison.isConsistent();
			Collection<IDifference> remainingDifferences = comparison.getRemainingDifferences();
			// TODO poser la question pour continuer
			comparison.merge(new AttachmentMergeSelector(selectedUris), true, monitor);

			if (targetScope instanceof IPersistentModelScope.Editable)
				((IPersistentModelScope.Editable) targetScope).save();

			Collection<IDifference> remainingDifferences2 = comparison.getRemainingDifferences();

			// Open UI for merge remaining elements
			// TODO all remaining changes will be shown, need a filter to
			// show only the differences related to the viewpoint. These
			// differences are surely in conflict.
			if (comparison.hasRemainingDifferences()) {

				EMFDiffMergeEditorInput input = new EMFDiffMergeEditorInput(method);
				CompareUI.openCompareEditor(input);
				EMFDiffNode compareResult = input.getCompareResult();
				for (IDifference diff : comparison.getRemainingDifferences())
					compareResult.getUIComparison().getDifferencesToIgnore().add((EMergeableDifference) diff);
			}

		} catch (Exception e) {
			throw new WrappedException(e);
		}
	}
}