/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resource.IViewpointResourceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.types.ResourceFileInformation;

/**
 * @author Boubekeur Zendagui
 */

public class ViewpointResourceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Resource is Empty
	 */
	public static final int IS_EMPTY= 1;
	
	/**
	 * Resource is Null
	 */
	public static final int IS_NULL= 10;
	
	/**
	 * Resource can't be loaded 
	 */
	public static final int ON_LOADING	= 20;
	
	/**
	 * Resource file is no existent in the Workspace
	 */
	public static final int NO_EXISTENT_ON_LOAD	= 30;
	
	
	/**
	 * Source of the exception
	 */
	private ResourceFileInformation information_;
	
	/**
	 * Exception integer ID
	 */
	private int id_;

	/**
	 * Default constructor
	 * @param source an {@link IViewpointResourceProvider}
	 * @param id the exception ID
	 */
	public ViewpointResourceException(ResourceFileInformation information, int id) {
		super();
		information_ = information;
		id_ = id;
	}
	
	
	@Override
	public String getMessage() {
		String message = "";
		
		switch (id_) {
			case IS_EMPTY:
				message = Messages.bind(Messages.ResourceIsEmpty, information_.getStringPath());
			break;
			
			case ON_LOADING:
				message = Messages.bind(Messages.ResourceLoadProblem, information_.getStringPath());
			break;
			
			case IS_NULL:
				message = Messages.bind(Messages.ResourceIsNull, information_.getStringPath());
			break;
		}
		
		return message;
	}
}
