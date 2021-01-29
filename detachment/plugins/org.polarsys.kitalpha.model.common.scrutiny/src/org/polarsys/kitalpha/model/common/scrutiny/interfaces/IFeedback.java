/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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

	enum FeedbackLevel {
		DEBUG, INFO, WARNING, ERROR;
	}
	
	interface IFeedbackMessage {
		FeedbackLevel getLevel();
		String getMessage();
	}
	
	Collection<IFeedbackMessage> getFeedbackMessages();

	void addFeedbackMessage(IFeedbackMessage feedbackMessage);

}
