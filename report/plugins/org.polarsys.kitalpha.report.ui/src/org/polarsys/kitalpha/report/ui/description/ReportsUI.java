/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.report.ui.description;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.report.model.ReportList;
import org.polarsys.kitalpha.report.model.Severity;
import org.polarsys.kitalpha.report.registry.ReportRegistry;

/**
 * @author Thomas Guiu
 * 
 */
public class ReportsUI {

	private static final class MyObserver extends Observable {
		public synchronized void setChanged() {
			super.setChanged();
		}
	}

	public static final MyObserver observable = new MyObserver();

	public static void addObserver(Observer o) {
		observable.addObserver(o);
	}

	public static void removeObserver(Observer o) {
		observable.deleteObserver(o);
	}

	public static void unRegisterImage(Severity severity) {
		severityImages.remove(severity.getCode());
	}

	public static void registerImage(Severity severity, Image img) {
		severityImages.put(severity.getCode(), img);
	}

	public static void unRegisterColumnDescription(String id) {
		getDisplayedColumns().remove(id);
		id2column.remove(id);
		observable.setChanged();
		notifyObservers(id);
	}

	public static void registerColumnDescription(ColumnDescription desc) {
		String id = desc.getId();
		id2column.put(id, desc);
		observable.setChanged();
		notifyObservers(id);
	}

	public static ColumnDescription getColumnDescription(String id) {
		return id2column.get(id);
	}

	public static Image getImage(Severity severity) {
		return severityImages.get(severity.getCode());
	}

	public static Collection<ColumnDescription> getAvailableColumns() {
		return id2column.values();
	}

	/*
	 * The list is not clean up when a description is removed to recover columns
	 * who were previously selected
	 */

	public static Set<String> getDisplayedColumns() {
		return displayedColumns;
	}

	public static void showAllLists() {
		displayedLists.addAll(Arrays.asList(ReportRegistry.INSTANCE.getLists()));
		observable.setChanged();
		notifyObservers(null);
	}

	public static void showList(ReportList list) {
		displayedLists.add(list);
		observable.setChanged();
		notifyObservers(list);
	}

	public static void hideAllLists() {
		displayedLists.clear();
		observable.setChanged();
		notifyObservers(null);
	}

	public static void hideList(ReportList list) {
		displayedLists.remove(list);
		observable.setChanged();
		notifyObservers(list);
	}

	public static Set<ReportList> getDisplayedLists() {
		return Collections.unmodifiableSet(displayedLists);
	}

	protected static void notifyObservers(final Object object) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				observable.notifyObservers(object);

			}
		});
	}

	private static final Map<Integer, Image> severityImages = new HashMap<Integer, Image>();
	private static final Set<ReportList> displayedLists = new HashSet<ReportList>();
	private static final LinkedHashMap<String, ColumnDescription> id2column = new LinkedHashMap<String, ColumnDescription>();
	private static final Set<String> displayedColumns = new HashSet<String>();
}
