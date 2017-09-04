/*******************************************************************************
 * Copyright (c) 2007, 2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.internal;

import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.DiagramGenerator;
import org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService;
import org.eclipse.sirius.diagram.ui.tools.internal.render.SiriusDiagramImageGenerator;
import org.eclipse.swt.graphics.Rectangle;
/**
 * 
 * @author Faycal Abka
 *
 */
public class GenDocDiagramEditPartService extends DiagramEditPartService {
	
	public boolean isTooBig(DiagramEditPart diagramEP, org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat format){
		DiagramGenerator gen = getDiagramGenerator(diagramEP, format);
		Rectangle rect = gen.calculateImageRectangle(diagramEP.getPrimaryEditParts());
		double factor = getExportResolutionFactor(diagramEP, (SiriusDiagramImageGenerator)gen);
		return (rect.height * factor) * (rect.width * factor) > getMaximumTotalSize() && 
				format != org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat.SVG;
	}
	
	public List getDiagramPartInfo(DiagramEditPart diagramEditPart) {
		DiagramGenerator gen = getDiagramGenerator(diagramEditPart, org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat.JPG);
		return gen.getDiagramPartInfo();
	}
	
	public double getExportResolutionFactor(DiagramEditPart diagramEP) {
		DiagramGenerator gen = getDiagramGenerator(diagramEP, org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat.JPG);
		return super.getExportResolutionFactor(diagramEP, (SiriusDiagramImageGenerator)gen);
	}
	
	public Rectangle getImageDimension(DiagramEditPart diagramEP){
		return getDiagramGenerator(diagramEP, org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat.JPG).calculateImageRectangle(diagramEP.getPrimaryEditParts());
	}
}
