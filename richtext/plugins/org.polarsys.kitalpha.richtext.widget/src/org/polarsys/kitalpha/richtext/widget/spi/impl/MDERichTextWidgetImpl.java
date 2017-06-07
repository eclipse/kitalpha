/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.spi.impl;


import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.nebula.widgets.richtext.RichTextEditor;
import org.eclipse.nebula.widgets.richtext.toolbar.JavaCallbackListener;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.richtext.widget.messages.Messages;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextConfiguration;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextWidget;

/**
 * Implementation of the MDE Rich Text Widget
 * 
 * @author Faycal Abka
 *
 */
public class MDERichTextWidgetImpl implements MDERichTextWidget {
	
	private final MDERichTextConfiguration configuration;
	private final RichTextEditor richText;
	
	private EObject owner;
	private EStructuralFeature feature;

	public MDERichTextWidgetImpl(Composite parent, MDERichTextConfiguration configuration, 
			EObject owner, EStructuralFeature feature) {
		this(parent, configuration);
		bind(owner, feature);
	}
	
	public MDERichTextWidgetImpl(Composite parent, MDERichTextConfiguration configuration) {
		
		Assert.isTrue(parent != null, Messages.RichTextWidget_Error_CompositeNull);
		Assert.isTrue(configuration != null, Messages.RichTextWidget_Error_ConfigurationNull);
		
		this.configuration = configuration;
		configuration.createToolbarForWidget();
		this.richText = new RichTextEditor(parent, configuration.getConfiguration());
		GridDataFactory.fillDefaults().grab(true, true).applyTo(this.richText);
		configuration.bind2Widget(this);
	}
	
	public MDERichTextWidgetImpl(Composite parent, MDERichTextConfiguration configuration, int style){
		
		Assert.isTrue(parent != null, Messages.RichTextWidget_Error_CompositeNull);
		Assert.isTrue(configuration != null, Messages.RichTextWidget_Error_ConfigurationNull);
		
		this.configuration = configuration;
		configuration.createToolbarForWidget();
		this.richText = new RichTextEditor(parent, configuration.getConfiguration(), style);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(this.richText);
		configuration.bind2Widget(this);
	}
	
	public MDERichTextWidgetImpl(Composite parent, MDERichTextConfiguration configuration, int style, 
			EObject owner, EStructuralFeature feature){
		this(parent, configuration, style);
		bind(owner, feature);
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
		
		this.owner = owner;
		this.feature = feature;
		
		loadContent();
	}

	@Override
	public void setVisible(boolean visible) {
		this.setVisible(visible);
	}

	@Override
	public String getText() {
		return richText.getText();
	}

	@Override
	public void setText(String text) {
		richText.setText(text);
	}

	@Override
	public void insertText(String text) {
		richText.insertText(text);
	}

	@Override
	public void insertHTML(String html) {
		richText.insertHTML(html);
	}

	@Override
	public String getSelectedText() {
		return richText.getSelectedText();
	}

	@Override
	public String getSelectedHTML() {
		return this.getSelectedHTML();
	}

	@Override
	public boolean executeJavascript(String javascript) {
		return richText.executeJavascript(javascript);
	}

	@Override
	public Object evaluateJavascript(String javascript) {
		return richText.evaluateJavascript(javascript);
	}

	@Override
	public boolean isEditable() {
		return richText.isEditable();
	}

	@Override
	public void setEditable(boolean editable) {
		richText.setEditable(editable);
	}

	@Override
	public void updateToolbar() {
		richText.updateToolbar();
	}
	
	@Override
	public boolean setItemState(String command, String state) {
		StringBuffer updateStateScript = getCommand(command).append(".setState(").append(state).append(");");
		return executeJavascript(updateStateScript.toString());
	}
	
	protected final StringBuffer getCommand(String command){
		return (new StringBuffer("CKEDITOR.instances.editor.getCommand('")).append(command).append("')");
	}

	@Override
	public void updateEditor() {
		richText.updateEditor();
	}
	
	/**
	 * Default algorithm:
	 * If the owner is associated to an editing domain, the save is performed within this editing domain
	 * Otherwise, the the save is done by setting the text without and editing domain
	 */
	@Override
	public void saveContent() { 

		areNotNull(getElement(), getFeature());

		String text = getText();
		if (text != null){
			save(text);
		}
	}

	protected void save(String text) {
		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain != null){
			Command set = SetCommand.create(editingDomain, getElement(), getFeature(), text);
			editingDomain.getCommandStack().execute(set);
		} else {
			getElement().eSet(getFeature(), text);
		}
	}
	
	private EditingDomain getEditingDomain(){
		return AdapterFactoryEditingDomain.getEditingDomainFor(getElement());
	}

	@Override
	public void loadContent() {
		
		areNotNull(getElement(), getFeature());
		
		String text = (String) getElement().eGet(getFeature());
		setText(text);
	}
	
	

	@Override
	public boolean setFocus() {
		return richText.setFocus();
	}

	@Override
	public boolean forceFocus() {
		return richText.forceFocus();
	}

	@Override
	public boolean hasFocus() {
		return richText.isFocusControl();
	}

	@Override
	public void addFocusListener(FocusListener listener) {
		richText.addFocusListener(listener);
	}

	@Override
	public void removeFocusListener(FocusListener listener) {
		richText.removeFocusListener(listener);
	}


	@Override
	public void addModifyListener(ModifyListener listener) {
		richText.addModifyListener(listener);
	}

	@Override
	public void removeModifyListener(ModifyListener listener) {
		richText.removeModifyListener(listener);
	}
	
	@Override
	public void addLocationListener(LocationListener listener) {
		richText.getEditorConfiguration().getBrowser().addLocationListener(listener);
	}

	@Override
	public void removeLocationListener(LocationListener listener) {
		richText.getEditorConfiguration().getBrowser().addLocationListener(listener);
	}
	
	@Override
	public void addJavaCallbackListener(JavaCallbackListener listener) {
		richText.addJavaCallbackListener(listener);
	}

	@Override
	public void removeJavaCallbackListener(JavaCallbackListener listener) {
		richText.removeJavaCallbackListener(listener);
	}

	@Override
	public void dispose() {
		richText.dispose();
		configuration.bind2Widget(null);
	}
	
	private void areNotNull(EObject owner, EStructuralFeature feature) {
		Assert.isTrue(owner != null, Messages.RichTextWidget_Error_OwnerObjectNull);
		Assert.isTrue(feature != null, Messages.RichTextWidget_Error_FeatureObjectNull);
	}
}
