package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.activityexplorer;

import org.eclipse.jface.viewers.ISelection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractSecondPage;


/**
 * 
 * @author Faycal Abka
 *
 */
public class ActivityExplorerSecondPage extends AbstractSecondPage {
	
	public ActivityExplorerSecondPage() {
		super(Messages.ActivityExplorerFileCreatePage_Title);
	}
	
	public ActivityExplorerSecondPage(ISelection selection){
		super(selection, Messages.ActivityExplorerFileCreatePage_Title);
	}

	@Override
	protected void initializeProperties() {
	}

	@Override
	protected boolean dataChanged() {
		updateStatus(null);
		return true;
	}

}
