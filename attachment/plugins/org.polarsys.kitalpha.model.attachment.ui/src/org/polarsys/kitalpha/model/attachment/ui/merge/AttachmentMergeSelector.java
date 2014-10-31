package org.polarsys.kitalpha.model.attachment.ui.merge;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.api.IMergeSelector;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.diffdata.EElementPresence;
import org.eclipse.emf.diffmerge.diffdata.EReferenceValuePresence;
import org.eclipse.emf.ecore.EObject;

public final class AttachmentMergeSelector implements IMergeSelector {

	private Collection<String> selectedUris;
	private Collection<IDifference> conflicts;

	public AttachmentMergeSelector(Collection<String> selectedUris, Collection<IDifference> conflicts) {
		super();
		this.selectedUris = selectedUris;
		this.conflicts = conflicts;
	}

	@Override
	public Role getMergeDirection(IDifference difference_p) {
		Role computeMergeDirection = computeMergeDirection(difference_p);
		if (computeMergeDirection != null && difference_p.isConflicting()) {
			conflicts.add(difference_p);
			return null;
		}
		return computeMergeDirection;
	}

	private Role computeMergeDirection(IDifference difference_p) {
		if (difference_p instanceof EReferenceValuePresence) {
			EReferenceValuePresence diff = (EReferenceValuePresence) difference_p;
			if (diff.getValue().getReference() == null)
				return null;
			if (toMerge(diff.getValue().getReference()))
				return Role.TARGET;
			// does the element have a reference to one of our objects ?
			EList<EObject> eCrossReferences = diff.getValue().getReference().eCrossReferences();
			return toMerge((EObject[]) eCrossReferences.toArray(new EObject[eCrossReferences.size()])) ? Role.TARGET : null;
		}
		if (difference_p instanceof EElementPresence) {
			// les nouveaux elts
			EElementPresence diff = (EElementPresence) difference_p;
			return toMerge(diff.getElement(), true) ? Role.TARGET : null;
		}

		return null;
	}

	private boolean toMerge(EObject... objs) {
		for (EObject obj : objs) {
			if (obj == null)
				return false;
			if (selectedUris.contains(obj.eClass().getEPackage().getNsURI()))
				return true;
		}
		return false;
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