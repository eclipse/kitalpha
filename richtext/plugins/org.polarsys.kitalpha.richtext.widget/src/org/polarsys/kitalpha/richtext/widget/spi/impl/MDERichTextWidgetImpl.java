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


import java.util.Map;

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
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.richtext.widget.messages.Messages;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextConfiguration;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.links.LinksManagerImpl;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.MDERichTextHelper;

/**
 * Implementation of the MDE Rich Text Widget
 * 
 * @author Faycal Abka
 *
 */
public class MDERichTextWidgetImpl implements MDERichTextWidget {
	
	private static final String SLASH_CHARACTER = "/"; //$NON-NLS-1$
	private static final String FILE_PROTOCOL = "file://"; //$NON-NLS-1$
	
	private final MDERichTextConfiguration configuration;
	private final RichTextEditor richText;
	
	private EObject owner;
	private EStructuralFeature feature;
	
	private boolean editorLoaded = false;
	
	private String baseHrefPath = null;
	
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
		installBrowserListeners(configuration.getConfiguration().getBrowser());
		GridDataFactory.fillDefaults().grab(true, true).applyTo(this.richText);
		configuration.bind2Widget(this);
	}
	
	public MDERichTextWidgetImpl(Composite parent, MDERichTextConfiguration configuration, int style){
		
		Assert.isTrue(parent != null, Messages.RichTextWidget_Error_CompositeNull);
		Assert.isTrue(configuration != null, Messages.RichTextWidget_Error_ConfigurationNull);
		
		this.configuration = configuration;
		configuration.createToolbarForWidget();
		this.richText = new RichTextEditor(parent, configuration.getConfiguration(), style);
		installBrowserListeners(configuration.getConfiguration().getBrowser());
		GridDataFactory.fillDefaults().grab(true, true).applyTo(this.richText);
		configuration.bind2Widget(this);
	}
	
	public MDERichTextWidgetImpl(Composite parent, MDERichTextConfiguration configuration, int style, 
			EObject owner, EStructuralFeature feature){
		this(parent, configuration, style);
		bind(owner, feature);
	}
	
	@Override
	public void setBaseHrefPath(String baseHref){
		boolean forceEditorUpdate = false;
		baseHref = getBaseHref(baseHref);
		if (this.baseHrefPath == null 
				|| this.baseHrefPath.isEmpty()){
			this.baseHrefPath = baseHref;
		}
		forceEditorUpdate = setBaseHref(baseHref);

		if (forceEditorUpdate){
			updateEditor();
		}
	}


	private boolean setBaseHref(String baseHref) {
		boolean result = false;
		Map<String, Object> conf = configuration.getConfiguration().getAllOptions();
		if (conf.containsKey(MDERichTextConstants.BASE_HREF)){
			Object oldValue = conf.get(MDERichTextConstants.BASE_HREF);
			result = oldValue == null 
					|| !oldValue.equals(this.baseHrefPath) 
					|| !this.baseHrefPath.equals(baseHref);
		}
		configuration.setValue(MDERichTextConstants.BASE_HREF, baseHref);
		this.baseHrefPath = baseHref; //update with latest path
		return result;
	}
	
	
	
	private String getBaseHref(String baseHref) {
		Assert.isNotNull(baseHref);
		if (!baseHref.endsWith(SLASH_CHARACTER)){
			baseHref = baseHref + SLASH_CHARACTER;
		}
		baseHref = FILE_PROTOCOL + baseHref;
		return baseHref;
	}
	
	private void installBrowserListeners(Browser browser){
		
		browser.addProgressListener(new ProgressListener() {
			
			@Override
			public void completed(ProgressEvent event) {
				editorLoaded = true;
				installKeytrokesHandlers();
			}
			
			@Override
			public void changed(ProgressEvent event) {
			}
		});
	}
	
	private void installKeytrokesHandlers(){
		installOpenLinkHandler();
		installSaveHandler();
	}

	/**
	 * Navigate with CTRL-Click on links
	 */
	private void installOpenLinkHandler() {
		StringBuffer script = new StringBuffer();
		
		/*
		 * Add ctrl-click listener when the editor is ready
		 * 
		 * CKEDITOR.on('instanceReady', function(event) {
    	 * 		$('iframe').contents().click(function(e) {
         *			if (typeof e.target.href != 'undefined' && e.ctrlKey == true) {
         *   			openLink(e.target.href); //Callback to java
         *			}
    	 *		});
		 *	});
		 */
		
		script.append("CKEDITOR.on('instanceReady', function(event) {	")
		.append("$('iframe').contents().click(function(e) {")
		.append("if(typeof e.target.href != 'undefined' && e.ctrlKey == true) {	")
		.append("openLink(e.target.href);")
		.append("}});});");
		
		executeJavascript(script.toString());
		
		//TODO maybe install dispose or location listener to release this function?
		new BrowserFunction(configuration.getConfiguration().getBrowser(), "openLink"){ //$NON-NLS-1$
			public Object function(Object[] arguments) {
				if (arguments != null && arguments.length > 0){
					for (Object object : arguments) {
						(new LinksManagerImpl()).openLink((String)object);
					}
				}
				return null;
			};
		};
	}
	
	//TODO implements
	private void installSaveHandler(){
		
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

		setBaseHrefPath(MDERichTextHelper.getProjectPath(owner));
		loadContent();
	}

	@Override
	public void setVisible(boolean visible) {
		if (editorLoaded){
			this.setVisible(visible);
		}
	}

	@Override
	public String getText() {
		if (editorLoaded){
			return richText.getText();
		}
		return ""; //$NON-NLS-1$
	}

	@Override
	public void setText(String text) {
		if (text != null){
			richText.setText(text);
		}
	}

	@Override
	public void insertText(String text) {
		if (text != null && editorLoaded){
			richText.insertText(text);
		}
	}

	@Override
	public void insertHTML(String html) {
		if (html != null && editorLoaded){
			richText.insertHTML(html);
		}
	}

	@Override
	public String getSelectedText() {
		if (editorLoaded){
			return richText.getSelectedText();
		}
		return ""; //$NON-NLS-1$
	}

	@Override
	public String getSelectedHTML() {
		if (editorLoaded){
			return this.getSelectedHTML();
		}
		return "";
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
		if (editorLoaded){
			return richText.isEditable();
		} 
		return false;
	}

	@Override
	public void setEditable(boolean editable) {
		if (editorLoaded){
			richText.setEditable(editable);
		}
	}

	@Override
	public void updateToolbar() {
		if (editorLoaded){
			richText.updateToolbar();
		}
	}
	
	@Override
	public boolean setItemState(String command, String state) {
		if (editorLoaded){
			StringBuffer updateStateScript = getCommand(command).append(".setState(").append(state).append(");");
			return executeJavascript(updateStateScript.toString());
		}
		return false;
	}
	
	protected final StringBuffer getCommand(String command){
		return (new StringBuffer("CKEDITOR.instances.editor.getCommand('")).append(command).append("')");
	}

	@Override
	public void updateEditor() {
		if (editorLoaded){
			richText.updateEditor();
		}
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
		
		Object text = getElement().eGet(getFeature());
		String oldValue = getText();
		
		String value = (String)((text instanceof String)? text: ""); //$NON-NLS-1$
		if (value != null && !value.equals(oldValue)){ 
			setText(value);
		}
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
