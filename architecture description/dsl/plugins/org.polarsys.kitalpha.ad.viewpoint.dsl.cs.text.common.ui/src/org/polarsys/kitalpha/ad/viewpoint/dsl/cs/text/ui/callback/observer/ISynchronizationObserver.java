package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback.observer;

import org.eclipse.core.resources.IResource;

public interface ISynchronizationObserver {
	public void update(IResource resource, boolean synchronizing);
}
