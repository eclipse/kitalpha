package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.activityexplorer;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.ide.IDE;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.EditorIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractWizard;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.util.WizardsUtil;


/**
 * 
 * @author Faycal Abka
 *
 */

public class ActivityExplorerWizard extends AbstractWizard implements INewWizard {
	
	public ActivityExplorerWizard() {
		setWindowTitle(Messages.ActivityExplorerFileCreatePage_Title);
	}

	@Override
	protected boolean createFirstPage(IStructuredSelection selection) {
		
		try {
			firstPage = new ActivityExplorerFileCreationPage(selection);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	protected boolean createSecondPage(IStructuredSelection selection) {
		return false;
	}

	@Override
	protected boolean createThirdPage(IStructuredSelection selection) {
		return false;
	}

	@Override
	protected void bindEditor(IFile file) {
		IDE.setDefaultEditor(file, EditorIDs.ACTIVITY_EXPLORER_ID);
	}

	@Override
	protected String getInitialContent() {
		return WizardsUtil.getInitialActivityExplorerContent(vpShortName);
	}

	@Override
	protected String getInitialContent(String fileName) {
		return WizardsUtil.getInitialActivityExplorerContent(vpShortName, fileName.replaceFirst("." + FileExtension.PRIMARY_EXTENSION, ""));
	}

}
