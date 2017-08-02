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
package org.polarsys.kitalpha.richtext.nebula.widget;

import java.net.URL;
import java.util.Map;

import org.eclipse.jface.layout.GridDataFactory;
import org.polarsys.kitalpha.richtext.common.impl.BrowserBasedMDERichTextWidgetImpl;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.eclipse.nebula.widgets.richtext.RichTextEditor;
import org.eclipse.nebula.widgets.richtext.RichTextEditorConfiguration;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.richtext.nebula.widget.toolbar.MDERichTextToolbarItemHandler;
import org.polarsys.kitalpha.richtext.nebula.widget.toolbar.MDEToolbarItem;

/**
 * 
 * @author Faycal Abka
 *
 */
public class MDENebulaBasedRichTextWidgetImpl extends BrowserBasedMDERichTextWidgetImpl implements MDENebulaBasedRichTextWidget {
	
	private static final String SLASH_CHARACTER = "/"; 		//$NON-NLS-1$
	private static final String FILE_PROTOCOL = "file://"; 	//$NON-NLS-1$
	
	private final RichTextEditor editor;
	private final RichTextEditorConfiguration configuration;
	
	private boolean editorReady = false;
	
	private String baseHrefPath = null;

	public MDENebulaBasedRichTextWidgetImpl(Composite parent) {
		super(parent);
		this.editor = new RichTextEditor(parent); //default configuration
		this.configuration = editor.getEditorConfiguration();
		GridDataFactory.fillDefaults().grab(true, true).applyTo(this.editor);
		
		installListeners();
	}
	
	public MDENebulaBasedRichTextWidgetImpl(Composite parent, MDENebulaRichTextConfiguration configuration) {
		super(parent);
		this.configuration = configuration;
		((MDENebulaRichTextConfiguration)this.configuration).createToolbar();
		this.editor = new RichTextEditor(parent, configuration); //default configuration
		GridDataFactory.fillDefaults().grab(true, true).applyTo(this.editor);
		
		installListeners();
	}
	
	public MDENebulaBasedRichTextWidgetImpl(Composite parent, int style) {
		super(parent);
		this.editor = new RichTextEditor(parent, style); //default configuration
		this.configuration = editor.getEditorConfiguration();
		GridDataFactory.fillDefaults().grab(true, true).applyTo(this.editor);
		
		installListeners();
	}
	
	public MDENebulaBasedRichTextWidgetImpl(Composite parent, MDENebulaRichTextConfiguration configuration, int style) {
		super(parent);
		this.configuration = configuration;
		((MDENebulaRichTextConfiguration)this.configuration).createToolbar();
		this.editor = new RichTextEditor(parent, style); //default configuration
		GridDataFactory.fillDefaults().grab(true, true).applyTo(this.editor);
		
		installListeners();
	}
	
	protected void installListeners() {
		if (getBrowser() != null){
			getBrowser().addProgressListener(new ProgressListener() {
				
				@Override
				public void completed(ProgressEvent event) {
					editorReady = true;
					installListenersOnReadyInstance();
				}
				
				@Override
				public void changed(ProgressEvent event) {
				}
			});
		}
	}
	
	/**
	 * Install listener on ready instance event fired by
	 * ckEditor
	 */
	protected void installListenersOnReadyInstance(){
		//Do nothing
	}

	@Override
	public Browser getBrowser() {
		return editor.getEditorConfiguration().getBrowser();
	}

	@Override
	public void setBaseHrefPath(String baseHref) {
		boolean forceEditorUpdate = false;
		baseHref = getBaseHref(baseHref);
		if (this.baseHrefPath == null 
				|| this.baseHrefPath.isEmpty()){
			this.baseHrefPath = baseHref;
		}
		
		if (baseHref != null){
			forceEditorUpdate = setBaseHref(baseHref);
		}

		if (forceEditorUpdate){
			updateEditor();
		}
	}
	
	
	@Override
	public boolean isDirty() {
		if (isReady()){
			return super.isDirty();
		}
		return false;
	}
	
	@Override
	public boolean isReady() {
		return editorReady;
	}
	
	private String getBaseHref(String baseHref) {
		if (baseHref != null){
			if (!baseHref.endsWith(SLASH_CHARACTER)){
				baseHref = baseHref + SLASH_CHARACTER;
			}
			baseHref = FILE_PROTOCOL + baseHref;
		}
		return baseHref;
	}
	
	private boolean setBaseHref(String baseHref) {
		boolean result = false;
		Map<String, Object> conf = configuration.getAllOptions();
		if (conf.containsKey(MDERichTextConstants.BASE_HREF)){
			Object oldValue = conf.get(MDERichTextConstants.BASE_HREF);
			result = oldValue == null 
					|| !oldValue.equals(this.baseHrefPath) 
					|| !this.baseHrefPath.equals(baseHref);
		}
		configuration.setOption(MDERichTextConstants.BASE_HREF, baseHref);
		this.baseHrefPath = baseHref; //update with latest path
		return result;
	}

	@Override
	public void setVisible(boolean visible) {
		if (isReady()){
			this.setVisible(visible);
		}
	}

	@Override
	public String getText() {
		if (isReady()){
			return editor.getText();
		}
		return ""; //$NON-NLS-1$
	}

	@Override
	public void setText(String text) {
		if (text != null){
			text = escapeSingleQuote(text);
			editor.setText(text);
		}
	}

	@Override
	public void insertText(String text) {
		if (text != null && isReady()){
			text = escapeSingleQuote(text);
			editor.insertText(text);
		}
	}

	@Override
	public void insertRawText(String html) {
		if (html != null && isReady()){
			html = escapeSingleQuote(html);
			editor.insertHTML(html);
		}
	}

	@Override
	public String getSelectedText() {
		if (isReady()){
			return editor.getSelectedText();
		}
		return ""; //$NON-NLS-1$
	}

	@Override
	public String getSelectedRawText() {
		if (isReady()){
			return editor.getSelectedHTML();
		}
		return "";
	}

	@Override
	public boolean isEditable() {
		if (isReady()){
			return editor.isEditable();
		} 
		return false;
	}

	@Override
	public void setEditable(boolean editable) {
		if (isReady()){
			editor.setEditable(editable);
		}
	}

	@Override
	public void updateToolbar() {
		if (isReady()){
			editor.updateToolbar();
		}
	}

	@Override
	public boolean setToolbarItemState(String command, String state) {
		if (isReady()){
			StringBuffer updateStateScript = getCommand(command).append(".setState(").append(state).append(");"); //$NON-NLS-1$ //$NON-NLS-2$
			return executeScript(updateStateScript.toString());
		}
		return false;
	}
	
	protected final StringBuffer getCommand(String command){
		return (new StringBuffer("CKEDITOR.instances.editor.getCommand('")).append(command).append("')"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Override
	public void updateEditor() {
		if (isReady()){
			editor.updateEditor();
		}
	}


	@Override
	public boolean setFocus() {
		return editor.setFocus();
	}

	@Override
	public boolean forceFocus() {
		return editor.forceFocus();
	}

	@Override
	public boolean hasFocus() {
		return editor.isFocusControl();
	}

	@Override
	public void addFocusListener(FocusListener listener) {
		editor.addFocusListener(listener);
	}

	@Override
	public void removeFocusListener(FocusListener listener) {
		editor.removeFocusListener(listener);
	}

	@Override
	public void addModifyListener(ModifyListener listener) {
		editor.addModifyListener(listener);
	}

	@Override
	public void removeModifyListener(ModifyListener listener) {
		editor.removeModifyListener(listener);
	}

	@Override
	public void dispose() {
		editor.dispose();
	}

	@Override
	public void addToolbarItem(String name, String command, String label, String toolbar, URL iconPath,
			MDERichTextToolbarItemHandler handler) {
		MDEToolbarItem item = new MDEToolbarItem(this, name, command, label, toolbar, iconPath, handler);
		configuration.addToolbarButton(item);
	}

	@Override
	public void addToolbarItem(MDERichTextWidget richtext, String name, String command, String label, String toolbar,
			URL iconPath, MDERichTextToolbarItemHandler handler) {
		addToolbarItem(name, name, label, toolbar, iconPath, handler);
	}

	@Override
	public void addToolbarItem(MDERichTextWidget richtext, String name, String command, String label, String toolbar,
			URL iconPath) {
		addToolbarItem(name, command, label, toolbar, iconPath, null);
	}

}
