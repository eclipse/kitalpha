/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.report.registry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.polarsys.kitalpha.report.model.ReportElementFactory;
import org.polarsys.kitalpha.report.model.ReportList;
import org.polarsys.kitalpha.report.model.ReportElementPackage;
import org.polarsys.kitalpha.report.model.Severity;

/**
 * @author Thomas Guiu
 * 
 */
public class ReportRegistry {

	protected static final Map<String, ReportList> id2list = new HashMap<String, ReportList>();
	public static final ReportRegistry INSTANCE = new ReportRegistry();

	private final List<Listener> listeners = new ArrayList<Listener>();
	private final SortedSet<Severity> severities = new TreeSet<Severity>(new SeverityComparator());
	private final ListListener listListener = new ListListener();

	protected ReportRegistry() {
		super();
	}

	public void disposeList(String id) {
		ReportList removed = id2list.remove(id);
		if (removed != null) {
			removed.eAdapters().remove(listListener);
			removed.getReports().clear();
		}
		fireRemoved(removed);
	}

	public SortedSet<Severity> getSeverities() {
		return severities;
	}

	public ReportList[] getLists() {
		return id2list.values().toArray(new ReportList[id2list.size()]);
	}

	public ReportList getList(String id) {
		ReportList result = id2list.get(id);
		if (result == null) {
			result = ReportElementFactory.eINSTANCE.createReportList();
			result.setId(id);
			id2list.put(id, result);
			result.eAdapters().add(listListener);
			fireAdded(result);
		}
		return result;
	}

	public void addListener(Listener listener) {
		if (listener != null && !listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}


	private void fireAdded(ReportList list) {
		for (Listener l : listeners) {
			l.reportListAdded(list);
		}
	}

	private void fireUpdated(ReportList list) {
		for (Listener l : listeners) {
			l.reportListUpdated(list);
		}
	}

	private void fireRemoved(ReportList list) {
		for (Listener l : listeners) {
			l.reportListRemoved(list);
		}
	}


	private final class ListListener extends AdapterImpl {

		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getFeature() != null && msg.getFeature().equals(ReportElementPackage.eINSTANCE.getReportList_Reports())) {
				fireUpdated((ReportList) msg.getNotifier());
			}
		}
	}

	private static class SeverityComparator implements Comparator<Severity> {
		@Override
		public int compare(Severity o1, Severity o2) {

			return o2.getCode() - o1.getCode();
		}

	}
	
	public static abstract class Listener {
		public void reportListAdded(ReportList list) {
		}

		public void reportListRemoved(ReportList list) {
		}

		public void reportListUpdated(ReportList list) {
		}
	}

	
}
