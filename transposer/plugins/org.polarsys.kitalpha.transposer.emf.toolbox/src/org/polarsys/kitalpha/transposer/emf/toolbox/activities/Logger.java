/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.emf.toolbox.activities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;

/**
 * A Basic logger 
 * @author Guillaume Gebhart
 */
public class Logger implements IActivity{

  public static final String ID = "org.polarsys.kitalpha.transposer.emf.toolbox.activities.logger"; //$NON-NLS-1$
  public static final String POST = "post"; //$NON-NLS-1$
  private static final String POST_DESCRIPTION = "user message displayed in the console"; //$NON-NLS-1$
  
  private static final GregorianCalendar calendar = new java.util.GregorianCalendar(); 
  private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss"); //$NON-NLS-1$
  private final List<DeclaredParameter> parameters = new ArrayList<>();
  
  static{
    if(calendar.getTime()==null)
      calendar.setTime(new Date());
  }
  
  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#run(java.util.Map)
   */
  public IStatus run(ActivityParameters activityParams) {
    
   
    //get user message
    final String post = (String)activityParams.getParameter(POST).getValue();
    //display user post
    System.out.println("Logger => "+ format.format(calendar.getTime()) +" "+ post); //$NON-NLS-1$ //$NON-NLS-2$
    
    return Status.OK_STATUS;
  }

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#validateParameters(org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters)
   */
  public Map<String, ParameterError<?>> validateParameters(ActivityParameters valuedParameters) {
    return null;
  }

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#getParameters()
   */
  public Collection<DeclaredParameter> getParameters() {
   parameters.add(new DeclaredParameter(POST,"",POST_DESCRIPTION)); //$NON-NLS-1$
   return parameters;
  }
  
}
