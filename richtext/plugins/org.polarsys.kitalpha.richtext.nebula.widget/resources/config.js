/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
 
 /**
  * For more information about the option configuration, please visit: http://docs.ckeditor.com/#!/api/CKEDITOR.config
  * 
  * @author Faycal Abka
  */
 CKEDITOR.editorConfig = function(config) {
	config.allowedContent = true; //Allow all content
	config.disableNativeSpellChecker = false; //Enable native spell checking (browser)
	config.autoEmbed_widget = '';
	config.entities = true;
	config.basicEntities = true;
	config.fontSize_defaultLabel = '12';
	config.font_defaultLabel = 'Arial';
	config.linkShowAdvancedTab = false;
	config.linkShowTargetTab = false;
}