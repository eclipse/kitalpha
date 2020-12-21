/*******************************************************************************
 * Copyright (c) 2007, 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.sirius.util.diagram;

import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.query.DRepresentationQuery;
import org.eclipse.sirius.business.api.session.CustomDataConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.resource.ImageFileFormat ;
import org.eclipse.sirius.common.tools.api.util.EclipseUtil;
import org.eclipse.sirius.common.tools.api.util.FileUtil;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizer;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizerFactory;
import org.eclipse.sirius.diagram.ui.provider.Messages;
import org.eclipse.sirius.diagram.ui.tools.internal.decoration.SiriusDecoratorProvider;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat.ExportDocumentFormat;
import org.eclipse.sirius.ui.tools.api.actions.export.ExportAction;
import org.eclipse.sirius.ui.tools.api.actions.export.IAfterExport;
import org.eclipse.sirius.ui.tools.api.actions.export.IAroundExport;
import org.eclipse.sirius.ui.tools.api.actions.export.IBeforeExport;
import org.eclipse.sirius.ui.tools.api.actions.export.IExportRepresentationsAsImagesExtension;
import org.eclipse.sirius.ui.tools.api.actions.export.SizeTooLargeException;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.kitalpha.doc.gen.business.core.internal.GenDocDiagramEditPartService;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.SiriusHelper;

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
                    	String representationName = DocGenHtmlUtil.getValidFileName(DiagramSessionHelper.getID(representation));
                        filePath = getFilePath(outputPath, representationName, imageFileExtension);
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
                        	export(representation, session, filePath, exportFormat, SubMonitor.convert(monitor, 7));
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
                    StringBuilder messageExceptionForDialog = new StringBuilder();
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
    
    /*
     * Reworked from DiagramDialectUIServices
     */
    private void export(DRepresentation representation, Session session, IPath path, ExportFormat format, IProgressMonitor monitor) throws SizeTooLargeException {
    	final boolean exportToHtml = format.getDocumentFormat().equals(ExportDocumentFormat.HTML);
        final String imageFileExtension = format.getImageFormat().getName();
        final IPath correctPath = getRealPath(path, exportToHtml);

        final Shell shell = new Shell();
        try {

            final Collection<EObject> data = session.getServices().getCustomData(CustomDataConstants.GMF_DIAGRAMS, representation);
            for (final EObject dataElement : data) {
                if (dataElement instanceof Diagram) {
                    final Diagram diagram = (Diagram) dataElement;
                    CanonicalSynchronizer canonicalSynchronizer = CanonicalSynchronizerFactory.INSTANCE.createCanonicalSynchronizer(diagram);
                    canonicalSynchronizer.storeViewsToArrange(false);
                    canonicalSynchronizer.synchronize();

                    final GenDocDiagramEditPartService tool = new GenDocDiagramEditPartService();
                    
                    if (exportToHtml) {
                        tool.exportToHtml();
                    }

                    
                    
                    boolean isActivateSiriusDecorationPrevious = SiriusDecoratorProvider.isActivateSiriusDecoration();
                    SiriusDecoratorProvider.setActivateSiriusDecoration(true);
                    
                    final DiagramEditPart diagramEditPart = tool.createDiagramEditPart(diagram, shell, PreferencesHint.USE_DEFAULTS);
                    org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat resolveImageFormat = org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat.resolveImageFormat(imageFileExtension);
                    
                    SiriusHelper.initAutoScaling(tool, diagramEditPart);

                    try {
                    	

                        /* refresh to avoid blank images */
                        diagramEditPart.getRoot().refresh();

                        /* validate to have all nodes in the right position */
                        diagramEditPart.getFigure().validate();
                        /*
                         * In the case of connection on EditParts created during first Refresh they will not appear
                         * until we refresh a second time Example of such cases are exchanges on DFI (mch)
                         */
                        diagramEditPart.getRoot().refresh();
                        /*
                         * flush the viewer to have all connections and ports
                         */
                        diagramEditPart.getRoot().getViewer().flush();
                        

                        /* do the effective export */
						tool.copyToImage(diagramEditPart, correctPath, resolveImageFormat, monitor);

                        // We finally ensure that the image has been created
                        if (!new File(correctPath.toOSString()).exists()) {
                            throw new CoreException(new Status(IStatus.ERROR, SiriusPlugin.ID, MessageFormat.format(Messages.DiagramDialectUIServices_exportedDiagramImageCreationError, correctPath)));
                        }
                    } catch (final CoreException exception) {
                        if (exception instanceof SizeTooLargeException) {
                            throw (SizeTooLargeException) exception;
                        } else if (exception.getStatus() != null && exception.getStatus().getException() instanceof SWTException) {
                            /* Case that can occurs on Windows. */
                            throw new SizeTooLargeException(new Status(IStatus.ERROR, SiriusPlugin.ID, representation.getUid()));
                        }
                        SiriusPlugin.getDefault().error(MessageFormat.format(Messages.DiagramDialectUIServices_exportedDiagramImageCreationError, correctPath), exception);
                    } catch (final ArrayIndexOutOfBoundsException e) {
                        throw new SizeTooLargeException(new Status(IStatus.ERROR, SiriusPlugin.ID, representation.getUid()));
                    } finally {
                        SiriusDecoratorProvider.setActivateSiriusDecoration(isActivateSiriusDecorationPrevious);

                        diagramEditPart.deactivate();
                        // Memory leak : also disposing the
                        // DiagramGraphicalViewer associated to this
                        // DiagramEditPart
                        diagramEditPart.getViewer().flush();
                        diagramEditPart.getViewer().getEditDomain().getCommandStack().flush();
                        diagramEditPart.getViewer().getControl().dispose();
                        ((DiagramEditDomain) diagramEditPart.getViewer().getEditDomain()).removeViewer(diagramEditPart.getViewer());
                    }
                }
            }

        } finally {
        	Display.getCurrent().asyncExec(new Runnable() {
                @Override
                public void run() {
                    shell.dispose();
                }
            });
        }
	}

    private IPath getRealPath(final IPath path, final boolean exportToHtml) {
        if (exportToHtml) {
            return path.removeFileExtension().addFileExtension("html"); //$NON-NLS-1$
        } else {
            return path;
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
