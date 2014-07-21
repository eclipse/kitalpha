/**
 * 
 */
package org.polarsys.kitalpha.egf.genchain.diagram.message;

import org.eclipse.osgi.util.NLS;

/**
 * @author Thomas Guiu
 * 
 */
public class Messages extends NLS {
	public static String CreateGenerationChainAction_input_title;
	public static String CreateGenerationChainAction_input_message;
	public static String newElement_wizard_title;
	public static String newElement_wizard_content_description;
	public static String Element_wizard_title;
	public static String Element_wizard_content_description;
	public static String BuildApplication_Job_Label;

	public static String ReorderDialog_title;
	public static String ReorderDialog_description;

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.egf.genchain.diagram.message.messages"; //$NON-NLS-1$	

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
