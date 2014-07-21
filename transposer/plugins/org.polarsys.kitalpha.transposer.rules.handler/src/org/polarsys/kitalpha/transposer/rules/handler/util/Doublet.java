/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.util;

/**
 * @author Franco Bergomi
 * 
 */
public interface Doublet<A, B> {

  public A getFirstElement() ;

  public void setFirstElement(A firstElement_p) ;

  public B getSecondElement();

  public void setSecondElement(B secondElement_p) ;

}
