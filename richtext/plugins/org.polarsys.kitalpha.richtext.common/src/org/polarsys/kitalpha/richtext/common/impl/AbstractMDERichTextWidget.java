/*******************************************************************************
 * Copyright (c) 2017, 2021 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.common.impl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.business.api.image.ImageManagerProvider;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.common.intf.SaveStrategy;
import org.polarsys.kitalpha.richtext.common.messages.Messages;
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;

/**
 * 
 * @author Faycal Abka
 * @author Minh Tu Ton That
 *
 */
public abstract class AbstractMDERichTextWidget implements MDERichTextWidget {

	private final static MDERichTextPropertyChangeListenerSupport listenersSupports = new MDERichTextPropertyChangeListenerSupport();

	private EObject owner;

	private EStructuralFeature feature;

	private SaveStrategy saveStrategy;

	public static final String WIDGET_SAVED_PROP = "widgetSaved";

	// Whether the browser is loading its content
	private boolean isLoading = false;

	private final SaveStrategy DEFAULT_SAVE_STRATEGY = new SaveStrategy() {
		@Override
		public void save(String editorText, EObject objectOwner, EStructuralFeature objectFeature) {
			objectOwner.eSet(objectFeature, editorText);
		}
	};

	public AbstractMDERichTextWidget(Composite parent) {
		setSaveStrategy(DEFAULT_SAVE_STRATEGY);
	}

	public AbstractMDERichTextWidget(Composite parent, int style) {
		this(parent);
	}

	@Override
	public EObject getElement() {
		return this.owner;
	}

	@Override
	public EStructuralFeature getFeature() {
		return this.feature;
	}

	@Override
	public void bind(EObject owner, EStructuralFeature feature) {
		// https://bugs.polarsys.org/show_bug.cgi?id=1952
		// Before changing the owner and the feature of this widget
		// to a new EObject element and a new structure
		// must save the content of the current element and the current feature
		// if they are not NULL
		if (this.owner != null && this.feature != null && this.owner != owner && hasFocus()) {
			saveContent();
		}

		this.owner = owner;
		this.feature = feature;

		setBaseHrefPath(MDERichTextHelper.getProjectPath(owner));

		loadContent();
	}

	@Override
	public void loadContent() {
		areNotNull(getElement(), getFeature());
		Object value = getElement().eGet(getFeature());
		String text = (String) ((value instanceof String) ? value : ""); //$NON-NLS-1$

		text = ImageManagerProvider.getImageManager().computeAndConvertPathsToHtmlFromOriginal(getElement(), text);

		setText(text);
	}

	@Override
	public final void saveContent() {
		areNotNull(getElement(), getFeature());
		String text = getText();

		if (text != null && isEditable()) {
			text = ImageManagerProvider.getImageManager().convertToOriginalPathFromPathUsedForHtml(getElement(), text);
	
			Object currentValue = getElement().eGet(getFeature());
			if (text != null && !text.equals(currentValue)) {
				getSaveStrategy().save(text, getElement(), getFeature());
	
				// A precommit listener will update the base64 string to a path to a new
				// image. So the string may be changed during save.
				Object newValue = getElement().eGet(getFeature());
				if (currentValue != newValue) {
					loadContent();
				}
	
				// Notifies listeners that the save has been done
				firePropertyChangeEvent(new PropertyChangeEvent(this, WIDGET_SAVED_PROP, null, null));
			}
		}
	}

	@Override
	public final void setSaveStrategy(SaveStrategy strategy) {
		Assert.isLegal(strategy != null, Messages.RichTextWidget_Common_NullableStrategy_Error);
		this.saveStrategy = strategy;
	}

	@Override
	public boolean isDirty() {
		EObject owner = getElement();
		EStructuralFeature feature = getFeature();
		String storedText = (String) owner.eGet(feature);
		String text = getText();
		if (storedText == null) {
			return !"".equals(text);
		}
		return !storedText.equals(text);
	}

	@Override
	public SaveStrategy getSaveStrategy() {
		return this.saveStrategy;
	}

	/**
	 * 
	 * Escape special characters in the HTML code displayed by the editor.
	 * 
	 * @param value
	 * @return
	 */
	protected String escapeSpecialCharacters(String value) {
		value = value.replace("'", "&#39;"); //$NON-NLS-1$ //$NON-NLS-2$
		// If there is backslash in the HTML code, we do not want the editor to
		// translate it as an escape character.
		value = value.replace("\\", "&#92;"); //$NON-NLS-1$ //$NON-NLS-2$
		return value;
	}

	protected final void areNotNull(Object... objects) {
		if (objects != null) {
			int index = 0;
			for (Object object : objects) {
				index++;
				Assert.isNotNull(object, Messages.bind(Messages.RichTextWidget_Common_Nullable_Value_Error, index));
			}
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		MDERichTextWidget source = (MDERichTextWidget) evt.getSource();
		if (source != this && source.getElement() != null && source.getFeature() != null
				&& source.getElement().equals(getElement()) && source.getFeature().equals(getFeature())) {
			String newValue = (String) evt.getNewValue();
			String currentText = getText();
			if (currentText != null && !currentText.equals(newValue)) {
				setText(newValue);
			}
		}
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		listenersSupports.addPropertyChangeListener(listener);
	}

	@Override
	public void dispose() {
		// The save should be done here in case of the widget being disposed since the
		// focus lost event is not fired
		saveContent();

		PropertyChangeListener[] propertyChangeListeners = listenersSupports.getPropertyChangeListeners();
		if (propertyChangeListeners != null && propertyChangeListeners.length > 0) {
			for (PropertyChangeListener propertyChangeListener : propertyChangeListeners) {
				listenersSupports.removePropertyChangeListener(propertyChangeListener);
			}
		}
	}

	@Override
	public void firePropertyChangeEvent(PropertyChangeEvent event) {
		if (event.getSource() == this) {
			listenersSupports.fire(event);
		}
	}

	@Override
	public void setIsLoading(boolean isLoading) {
		this.isLoading = isLoading;
	}

	@Override
	public boolean isLoading() {
		return this.isLoading;
	}

}
