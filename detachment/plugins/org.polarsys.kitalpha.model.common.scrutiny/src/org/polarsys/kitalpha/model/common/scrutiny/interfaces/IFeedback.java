/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.model.common.scrutiny.interfaces;

import java.util.Collection;

/**
 * @author Matthieu Helleboid
 */
public interface IFeedback {

	public enum FeedbackLevel {
		DEBUG, INFO, WARNING, ERROR;
	}
	
	public interface IFeedbackMessage {
		public FeedbackLevel getLevel();
		public String getMessage();
	}
	
	public Collection<IFeedbackMessage> getFeedbackMessages();

	public void addFeedbackMessage(IFeedbackMessage feedbackMessage);

}
