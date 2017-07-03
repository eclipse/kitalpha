/*******************************************************************************
 * Copyright (c) 2007, 2009 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.sirius.util.diagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.sirius.common.tools.api.util.EclipseUtil;
import org.eclipse.sirius.common.tools.api.util.FileUtil;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat.ExportDocumentFormat;
import org.eclipse.sirius.ui.tools.api.actions.export.ExportAction;
import org.eclipse.sirius.ui.tools.api.actions.export.IAfterExport;
import org.eclipse.sirius.ui.tools.api.actions.export.IAroundExport;
import org.eclipse.sirius.ui.tools.api.actions.export.IBeforeExport;
import org.eclipse.sirius.ui.tools.api.actions.export.IExportRepresentationsAsImagesExtension;
import org.eclipse.sirius.ui.tools.api.actions.export.SizeTooLargeException;
import org.eclipse.sirius.common.tools.api.resource.ImageFileFormat ;
import org.eclipse.core.runtime.Status;

/**
 * Reworked code from {@link ExportAction}. 
 * 
 * The method {@link #getFilePath(IPath, String, String)} is modified to force 
 * use of provided image file name without adding file version
 * 
 * @author Boubekeur Zendagui
 */
public class GenDocDiagramExportAction extends ExportAction {

	private static final String EXPORT_DIAGRAMS_AS_IMAGES_ACTION_DEFAULT_DIAGRAM_NAME = "DiagramWithoutName";
	private boolean exportToHtml;
	private Collection<DRepresentation> dRepresentationsToExportAsImage;
	private ImageFileFormat imageFormat;
	private IPath outputPath;
	private Session session;
	
	public GenDocDiagramExportAction(Session session,
			Collection<DRepresentation> dRepresentationsToExportAsImage,
			IPath outputPath, ImageFileFormat imageFormat, boolean exportToHtml) {
		super(session, dRepresentationsToExportAsImage, outputPath, imageFormat, exportToHtml, true);
		this.exportToHtml = exportToHtml;
		this.dRepresentationsToExportAsImage = dRepresentationsToExportAsImage;
		this.imageFormat = imageFormat;
		this.outputPath = outputPath;
		this.session = session;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.sirius.ui.tools.api.actions.export.ExportAction#createImageFiles(org.eclipse.core.runtime.IProgressMonitor)
	 */
    protected void createImageFiles(final IProgressMonitor monitor) {

        final List<IBeforeExport> beforeContributors = EclipseUtil.getExtensionPlugins(IBeforeExport.class, IExportRepresentationsAsImagesExtension.ID,
                IExportRepresentationsAsImagesExtension.CLASS_ATTRIBUTE);
        final List<IAroundExport> aroundContributors = EclipseUtil.getExtensionPlugins(IAroundExport.class, IExportRepresentationsAsImagesExtension.ID,
                IExportRepresentationsAsImagesExtension.CLASS_ATTRIBUTE);
        final List<IAfterExport> afterContributors = EclipseUtil.getExtensionPlugins(IAfterExport.class, IExportRepresentationsAsImagesExtension.ID,
                IExportRepresentationsAsImagesExtension.CLASS_ATTRIBUTE);

        ExportFormat exportFormat = new ExportFormat(exportToHtml ? ExportDocumentFormat.HTML : ExportDocumentFormat.NONE, imageFormat);
        final String imageFileExtension = exportFormat.getImageFormat().getName().toLowerCase();

        /*
         * Before action extensions
         */
        for (IBeforeExport iBeforeExport : beforeContributors) {
            iBeforeExport.beforeExportAction(dRepresentationsToExportAsImage, outputPath, imageFileExtension);
        }

        /*
         * Around extensions
         */
        if (!aroundContributors.isEmpty()) {
            for (IAroundExport iAroundExport : aroundContributors) {
                iAroundExport.aroundExportAction(dRepresentationsToExportAsImage, outputPath, imageFileExtension);
            }
        } else {
            // To know if error from image size to large
            boolean errorDuringExport = false;
            List<Throwable> messageException = new ArrayList<Throwable>();
            final Shell shell = Display.getCurrent().getActiveShell();
            try {
                for (final DRepresentation representation : dRepresentationsToExportAsImage) {
                    final IPath filePath;
                    // Check that the file name is informed
                    // Put extension to lowerCase.
                    if (outputPath.toFile().isDirectory()) {
                        filePath = getFilePath(outputPath, representation.getName(), imageFileExtension);
                    } else {
                        if (outputPath.getFileExtension() != null) {
                            String imageFileExtensionLowerCase = outputPath.getFileExtension().toLowerCase();
                            filePath = outputPath.removeFileExtension().addFileExtension(imageFileExtensionLowerCase);
                        } else {
                            filePath = outputPath;
                        }
                    }

                    /*
                     * Before extensions
                     */
                    for (final IBeforeExport contributor : beforeContributors) {
                        contributor.beforeExportRepresentationAsImage(representation, filePath);
                    }
                    if (DialectUIManager.INSTANCE.canHandle(representation)) {
                        try {
                            DialectUIManager.INSTANCE.export(representation, session, filePath, exportFormat, new SubProgressMonitor(monitor, 7));
                        } catch (CoreException exception) {
                            if (exception instanceof SizeTooLargeException) {
                                errorDuringExport = true;
                                messageException.add(exception);
                            }
                        }
                    }
                    /*
                     * After extensions
                     */
                    for (final IAfterExport contributor : afterContributors) {
                        contributor.afterExportRepresentationAsImage(representation, filePath);
                    }
                }

            } finally {
                if (errorDuringExport) {
                    // Construct message for dialog and error in error log.
                    StringBuffer messageExceptionForDialog = new StringBuffer();
                    messageExceptionForDialog.append("One or more representations could not be exported because they are too large: ");
                    for (Throwable thr : messageException) {
                        messageExceptionForDialog.append("\n");
                        messageExceptionForDialog.append(" - ");
                        messageExceptionForDialog.append(thr.getMessage());
                    }
                    // Create a popup menu to inform user that representations
                    // export failed
                    MessageDialog.openError(shell, "Image export impossible", messageExceptionForDialog.toString());

                    // Add in the 'error log' the representations export
                    // failed
                    SiriusPlugin.getDefault().error("Error while export representation to image",
                            new SizeTooLargeException(new Status(IStatus.ERROR, SiriusPlugin.ID, messageExceptionForDialog.toString())));
                }
            }
        }
        /*
         * After action extensions
         */
        for (IAfterExport iAfterExport : afterContributors) {
            iAfterExport.afterExportAction();
        }
    }

    private IPath getFilePath(final IPath destinationFolder, final String providedFilename, final String extension) {

        String filename = null;

        if (providedFilename.length() == 0) {
            filename = new String(EXPORT_DIAGRAMS_AS_IMAGES_ACTION_DEFAULT_DIAGRAM_NAME);
        } else {
            filename = providedFilename;
        }

        IPath filePath;
        final StringBuffer file = new StringBuffer(filename).append(".").append(extension);

        final String filenameWithExtension = validFilename(file.toString());
        
        filePath = destinationFolder.append(filenameWithExtension);
        return filePath;
    }

    private String validFilename(String filename) {
        final FileUtil util = new FileUtil(filename);
        if (util.isValid()) {
            return filename;
        } else {
            return util.getValidFilename();
        }
    }


}
