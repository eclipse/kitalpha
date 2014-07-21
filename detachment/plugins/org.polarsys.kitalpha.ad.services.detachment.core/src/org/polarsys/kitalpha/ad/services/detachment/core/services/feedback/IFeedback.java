/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.detachment.core.services.feedback;

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
