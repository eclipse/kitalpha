package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.activityexplorer;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractFileCreationPage;


/**
 * 
 * @author Faycal Abka
 *
 */
public class ActivityExplorerFileCreationPage extends AbstractFileCreationPage {

	public ActivityExplorerFileCreationPage(IStructuredSelection selection) {
		super(selection);
		setTitle(Messages.ActivityExplorerFileCreatePage_Title);
		setDescription(Messages.ActivityExplorerFileCreationPage_Description);
		setFileExtension(FileExtension.ACTIVITYEXPLORER_EXTENSION);
	}

	@Override
	public void initializeProperties() {
		setFileName(((ActivityExplorerWizard)getWizard()).getVpShortName() + "." + FileExtension.ACTIVITYEXPLORER_EXTENSION);
	}

}
