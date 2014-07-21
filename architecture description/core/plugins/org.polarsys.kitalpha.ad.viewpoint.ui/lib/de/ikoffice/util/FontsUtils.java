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
/**
 *        (c) 2007-2010 IKOffice GmbH
 *
 *        http://www.ikoffice.de
 *        
 *        EPL from http://code.google.com/p/swtsplitbutton/
 */
package de.ikoffice.util;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;

/**
 * FontsUtils
 * 
 * @author junhuang huangjun78@gmail.com
 * @version 1.0
 */
public class FontsUtils {

	private static final int MIN_HEIGHT = 12;

	/**
	 * Returns the Height of Default Fonts.
	 */
	public static int getFontHeight() {
		int height = MIN_HEIGHT;
		GC gc = new GC(Display.getDefault());
		height = gc.getFontMetrics().getHeight();
		gc.dispose();
		return height;
	}

	/**
	 * Returns the string of the spaces.
	 */
	public static String getSpaceByWidth(int width) {
		GC gc = new GC(Display.getDefault());
		int spaceWidth = gc.getAdvanceWidth(' ');
		gc.dispose();
		int spacecount = width / spaceWidth;
		return spaces(spacecount);
	}

	/**
	 * Returns the given number of spaces.
	 */
	public static String spaces(int count) {
		StringBuilder b = new StringBuilder();
		while (count-- > 0) {
			b.append(" ");
		}
		return b.toString();
	}

}
