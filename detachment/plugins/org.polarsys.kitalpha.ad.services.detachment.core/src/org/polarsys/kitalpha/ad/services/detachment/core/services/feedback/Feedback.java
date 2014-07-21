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
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.sirius.viewpoint.DRepresentation;



/**
 * Retrieve messages of unknown reference from finders to display
 * 
 * @author Matthieu Helleboid
 */
public class Feedback implements IFeedback {

	private Set<IFeedbackMessage> messages = new HashSet<IFeedback.IFeedbackMessage>();

	public void addFeedbackMessage(IFeedbackMessage feedbackMessage) {
		messages.add(feedbackMessage);
	}
	
	
	public Collection<IFeedbackMessage> getFeedbackMessages() {
		return messages ;
	}

	public static String getProxyURI(EObject eObject) {
		if (eObject instanceof InternalEObject) {
			InternalEObject proxy = (InternalEObject) eObject;
			return " (" + proxy.eProxyURI().toString() + ")";
		}
		return "";
	}
	
	public static String getRepresentationName(EObject eObject) {
		EObject eContainer = eObject;
		while (eContainer != null) {
			if (eContainer instanceof DRepresentation) {
				return " in representation '" + ((DRepresentation) eContainer).getName() + "'";
			}
			eContainer = eContainer.eContainer();
		}
		return "";
	}
	
	public static class FeedbackMessage implements IFeedbackMessage {

		protected FeedbackLevel level;
		protected String message;
		
		public FeedbackMessage(FeedbackLevel level, String message) {
			super();
			this.level = level;
			this.message = message;
		}

		public FeedbackLevel getLevel() {
			return level;
		}

		public String getMessage() {
			return message;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((level == null) ? 0 : level.hashCode());
			result = prime * result
					+ ((message == null) ? 0 : message.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			FeedbackMessage other = (FeedbackMessage) obj;
			if (level != other.level)
				return false;
			if (message == null) {
				if (other.message != null)
					return false;
			} else if (!message.equals(other.message))
				return false;
			return true;
		}
	}

	
}

