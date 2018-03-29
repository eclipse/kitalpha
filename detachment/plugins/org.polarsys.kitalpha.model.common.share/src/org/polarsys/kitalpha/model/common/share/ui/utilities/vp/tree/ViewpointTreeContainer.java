/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree;

import java.util.Collection;
import java.util.HashSet;

/**
 * Container of roots viewpoint hierarchies
 * 
 * @author Faycal Abka
 */
public class ViewpointTreeContainer {

	private Collection<IViewpointTreeDescription> roots;

	public ViewpointTreeContainer() {
		this.roots = new HashSet<IViewpointTreeDescription>();
	}

	public Collection<IViewpointTreeDescription> getRoots() {
		return this.roots;
	}

	/**
	 * Add a new root hierarchy of viewpoint to roots list. A root hierarchy of
	 * viewpoint is hierarchy which has no parents (i.e hasParent() returns
	 * false)
	 * 
	 * @param vp
	 *            is the root viewpoint hierarchy
	 * @return
	 */
	public ViewpointTreeContainer add(IViewpointTreeDescription vp) {
		if (!vp.hasParents()) {
			getRoots().add(vp);
		}
		return this;
	}

	public Collection<String> getSelectedUris() {
		Collection<String> collector = new HashSet<String>();
		collectSelectedUris(roots, collector);
		return collector;
	}

	private void collectSelectedUris(Collection<IViewpointTreeDescription> roots, Collection<String> collector) {
		for (IViewpointTreeDescription vpd : roots) {
			if (vpd.isCandidateToKeep()) {
				collector.addAll(vpd.getViewpointNsUri());
			}
			collectSelectedUris(vpd.getChildren(), collector);
		}
	}

	public Collection<String> getViewpointToRemove() {
		Collection<String> vps = new HashSet<String>();

		for (IViewpointTreeDescription vpd : roots) {
			if (!vpd.isCandidateToKeep()) {
				vps.add(vpd.getViewpointId());
			}
			collectViewpointChildrenToRemove(vpd.getChildren(), vps);
		}

		return vps;
	}

	public Collection<String> getUriToRemove() {
		Collection<String> uris = new HashSet<String>();

		for (IViewpointTreeDescription vpd : roots) {
			if (!vpd.isCandidateToKeep()) {
				uris.addAll(vpd.getViewpointNsUri());
			}
			collectUriChildrenToRemove(vpd.getChildren(), uris);
		}

		return uris;
	}

	public void collectUriChildrenToRemove(Collection<IViewpointTreeDescription> children, Collection<String> uriToRemove) {
		if (children.isEmpty())
			return;

		for (IViewpointTreeDescription child : children) {
			if (!child.isCandidateToKeep()) {
				uriToRemove.addAll(child.getViewpointNsUri());
			}
			collectUriChildrenToRemove(child.getChildren(), uriToRemove);
		}
	}

	protected void collectViewpointChildrenToRemove(Collection<IViewpointTreeDescription> children, Collection<String> viewpointToRemove) {
		if (children.isEmpty())
			return;

		for (IViewpointTreeDescription child : children) {
			if (!child.isCandidateToKeep()) {
				viewpointToRemove.add(child.getViewpointId());
			}
			collectViewpointChildrenToRemove(child.getChildren(), viewpointToRemove);
		}
	}

	public Collection<String> getAllViewpointsNSuri() {
		Collection<String> nsuris = new HashSet<String>();

		for (IViewpointTreeDescription vpd : getRoots()) {
			nsuris.addAll(vpd.getViewpointNsUri());
			getAllNsUrisOfChildren(vpd.getChildren(), nsuris);
		}

		return nsuris;
	}

	private void getAllNsUrisOfChildren(Collection<IViewpointTreeDescription> children, Collection<String> nsuris) {

		if (children.isEmpty())
			return;

		for (IViewpointTreeDescription child : children) {
			nsuris.addAll(child.getViewpointNsUri());
			getAllNsUrisOfChildren(child.getChildren(), nsuris);
		}
	}

	public void dispose() {
		this.roots.clear();
	}

}
