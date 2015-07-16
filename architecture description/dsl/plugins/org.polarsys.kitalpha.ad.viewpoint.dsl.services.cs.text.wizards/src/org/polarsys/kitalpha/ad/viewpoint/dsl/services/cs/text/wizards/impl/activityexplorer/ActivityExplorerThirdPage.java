package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.activityexplorer;

import org.eclipse.jface.viewers.ISelection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractThirdPage;


/**
 * 
 * @author Faycal Abka
 *
 */
public class ActivityExplorerThirdPage extends AbstractThirdPage {
	
	public ActivityExplorerThirdPage() {
		super(Messages.ActivityExplorerFileCreatePage_Title);
	}
	
	public ActivityExplorerThirdPage(ISelection selection){
		super(Messages.ActivityExplorerFileCreatePage_Title);
	}

	@Override
	protected void initializeProperties() {
	}

	@Override
	protected boolean dataChanged() {
		return true;
	}

}
