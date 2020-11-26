/*******************************************************************************
 * Copyright (c) 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.table.metamodel.table.DTable;
import org.eclipse.sirius.table.metamodel.table.description.TableDescription;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.Messages;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.feedback.Feedback;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.FeedbackLevel;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IFeedback.IFeedbackMessage;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;

/**
 * 
 * @author Faycal Abka
 *
 */
public class InvalidDTable implements IScrutinize<Set<DTable>, Collection<IFeedbackMessage>> {
	
	private Set<DTable> tables = new HashSet<DTable>();

	public InvalidDTable() {
		//Do nothing
	}

	@Override
	public void findIn(EObject object) {
		if (object instanceof DTable) {
			DTable table = (DTable)object;
			TableDescription description = table.getDescription();
			if (description != null && description.eIsProxy()) {
				tables.add(table);
			}
		}
	}

	@Override
	public void findIn(Resource arg0) {
	}

	@Override
	public Set<DTable> getAnalysisResult() {
		return tables;
	}

	@Override
	public Collection<IFeedbackMessage> getFeedbackAnalysisMessages() {
		Feedback feedback = new Feedback();

		for (DTable table : getAnalysisResult()) {
			String message = Messages.INVALID_DTABLE_DESC;
			message = message + " (" + EcoreUtil.getURI(table.getDescription()) + ")";
			IFeedbackMessage feedbackMessage = new Feedback.FeedbackMessage(FeedbackLevel.ERROR, message);
			feedback.addFeedbackMessage(feedbackMessage);
		}
		return feedback.getFeedbackMessages();
	}
}
