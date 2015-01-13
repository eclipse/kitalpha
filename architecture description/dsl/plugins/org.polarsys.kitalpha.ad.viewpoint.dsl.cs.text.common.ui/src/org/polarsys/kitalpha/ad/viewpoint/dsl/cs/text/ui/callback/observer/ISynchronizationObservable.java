package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback.observer;

import org.eclipse.core.resources.IResource;

public interface ISynchronizationObservable {
	
	public void addSynchronizationObserver(ISynchronizationObserver observer);
	public void removeSynchronizationObserver(ISynchronizationObserver observer);
	public void notifyObservers(IResource resource, boolean synchronizing);
}
