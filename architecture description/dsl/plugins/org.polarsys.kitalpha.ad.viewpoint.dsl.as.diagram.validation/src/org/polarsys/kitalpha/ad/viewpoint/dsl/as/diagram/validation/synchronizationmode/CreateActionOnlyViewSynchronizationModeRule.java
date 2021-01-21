/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.synchronizationmode;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Create;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class CreateActionOnlyViewSynchronizationModeRule implements IAdditionalConstraint {

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof Create && ((Create)object).isOnlyTheView();
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		return Messages.Validation_Create_OnlyView_Synchronization;
	}

	private SynchronizationMode getSynchronizationMode(Object data) {
		DiagramElement toolFor = ((Create)data).getTool_For();
		return getSynchronizationMode(toolFor);
	}
	
	private SynchronizationMode getSynchronizationMode(DiagramElement diagramElement){
		if (diagramElement instanceof Node){
			return ((Node)diagramElement).getSynchronizationMode();
		}
		
		if (diagramElement instanceof Container){
			return ((Container)diagramElement).getSynchronizationMode();
		}
		
		if (diagramElement instanceof BorderedNode){
			return ((BorderedNode)diagramElement).getSynchronizationMode();
		}
		
		if (diagramElement instanceof EdgeImport){
			return ((EdgeImport)diagramElement).getSynchronizationMode();
		}
		//Should never occur
		return null;
	}
	
	@Override
	public ValidationStatus validationRules(Object data) {
		SynchronizationMode synchronizationMode = getSynchronizationMode(data);
		switch (synchronizationMode) {
		case NOT_SYNCHRONIZED:
		case UNSYNCHRONIZABLE:
			return ValidationStatus.Ok;
		case SYNCHRONIZED:
		default:
			break;
		}
		return ValidationStatus.Error;
	}

}
