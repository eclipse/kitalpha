/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.synchronizationmode;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.Activator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode;

/**
 * 
 * @author Faycal ABKA
 *
 */
public abstract class AbstractImportSynchronizationModeRule implements IAdditionalConstraint{
	
	
	/**
	 * Return Viewpoint DSL Synchronization based on Sirius one
	 * @param isCreatedElement
	 * @param isSynchronizationLock
	 * @return {@link SynchronizationMode}
	 * @throws IllegalStateException
	 */
	private SynchronizationMode translateToViewpointSynchronizationMode(
			boolean isCreatedElement, 
			boolean isSynchronizationLock)
		throws IllegalStateException {
		//False & False => NOT SYNCHRONIZED
		if (!isCreatedElement && !isSynchronizationLock){
			return SynchronizationMode.NOT_SYNCHRONIZED;
		}
		//True & False => UNSYNCHRONIZED
		if (isCreatedElement && !isSynchronizationLock){
			return SynchronizationMode.UNSYNCHRONIZABLE;
		}
		//True & True => SYNCHRONIZED
		if (isCreatedElement && isSynchronizationLock){
			return SynchronizationMode.SYNCHRONIZED;
		}
		throw new IllegalStateException("Synchronization Mode values are not allowed"); //$NON-NLS-1$
	}
	
	
	protected String getMessage(String label, Object object){
		SynchronizationMode importedSyncMode = translateToViewpointSynchronizationMode(isCreateElement(object), isSynchronizedLock(object));
		SynchronizationMode currentSyncMode = getSynchronizationMode(object);
		List<SynchronizationMode> compatibleMode = getCompatibleModesWith(importedSyncMode);
		return Messages.bind(Messages.Validation_Diagram_Synchrinization, new Object[]{label, importedSyncMode, currentSyncMode, compatibleMode});
	}
	
	/**
	 * Should returns Viewpoint Synchronization Mode for viewpoint Element
	 * @param viewpointElement
	 * @return {@link SynchronizationMode} for {@link ViewpointElement} of diagram aspect
	 */
	protected abstract SynchronizationMode getSynchronizationMode(Object data);
	
	/**
	 * @param data
	 * @return createdElement value of mapping imported by data or false otherwise
	 */
	protected abstract boolean isCreateElement(Object data);
	
	/**
	 * @param data
	 * @return isSynchronized_lock value of mapping imported by data or false otherwise 
	 */
	protected abstract boolean isSynchronizedLock(Object data);
	
	
	@Override
	public final ValidationStatus validationRules(Object data) {
		
		try {
			boolean createElement = isCreateElement(data);
			boolean synchronizedLock = isSynchronizedLock(data);
			SynchronizationMode syncMode = translateToViewpointSynchronizationMode(createElement, synchronizedLock);
			SynchronizationMode syncModeDiagramSpec = getSynchronizationMode(data);
			
			switch (syncModeDiagramSpec){
			case SYNCHRONIZED:
			case UNSYNCHRONIZABLE:
				//Catch synchronized and unsynchronizable
				return isCompatibleSyncMode(syncMode);
			case NOT_SYNCHRONIZED:
				return isCompatibleNotSyncMode(syncMode);
			case DEFAULT:
				//When the default mode is specified, we delegate the management
				//of diagram synchronization to Sirius framework
				return ValidationStatus.Ok;
			default:
				break;
			}
		} catch (IllegalStateException e){
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			return ValidationStatus.Error;
		}
		return ValidationStatus.Warning;
	}
	
	private ValidationStatus isCompatibleNotSyncMode(SynchronizationMode syncMode) {
		if (syncMode.equals(SynchronizationMode.NOT_SYNCHRONIZED)){
			return ValidationStatus.Ok;
		}
		return ValidationStatus.Error;
	}

	private ValidationStatus isCompatibleSyncMode(SynchronizationMode syncMode) {
		switch (syncMode) {
		case SYNCHRONIZED:
		case UNSYNCHRONIZABLE:
			//Catch synchronized and unsynchronizable
			return ValidationStatus.Ok;
		case NOT_SYNCHRONIZED:
			return ValidationStatus.Error;
		default:
			break;
		}
		throw new IllegalStateException("Cannot infer the right synchronization mode");
	}
	
	private List<SynchronizationMode> getCompatibleModesWith(SynchronizationMode mode){
		List<SynchronizationMode> result = new ArrayList<SynchronizationMode>();
		switch (mode){
		case NOT_SYNCHRONIZED:
			result.clear();
			result.add(SynchronizationMode.NOT_SYNCHRONIZED);
			return result;
		default:
			result.clear();
			result.add(SynchronizationMode.SYNCHRONIZED);
			result.add(SynchronizationMode.UNSYNCHRONIZABLE);
			return result;
		}
	}
}
