/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.core.api.parameter;

/**
 * This class allows to define an activity's org.polarsys.kitalpha.cadence.core.api.parameter
 * or a generator org.polarsys.kitalpha.cadence.core.api.parameter.
 * 
 * @author Guillaume Gebhart
 *  
 */	
public class GenericParameter<T> {

  private String name;
	private T value;
	private String description;
	private Class<T> parameterType;
	
	/**
	 * @param value : value of the org.polarsys.kitalpha.cadence.core.api.parameter
	 * @param description of the org.polarsys.kitalpha.cadence.core.api.parameter
	 */
	
	@SuppressWarnings("unchecked")
	public GenericParameter (String name, T value, String description){
	  this.name = name;
	  this.value =  value;
	  this.description = description;
	  
	  if(value != null) {
		this.parameterType = (Class<T>)value.getClass();
	} else {
		this.parameterType = (Class<T>)Void.class;
	}
		
	}
	
	/**
	 * 
	 * @return value
	 */
	public T getValue() {
		return value;
	}
	
	/**
	 * 
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}
	
	/**
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Class<T> getParameterType() {
		return parameterType;
	}

	public void setParameterType(Class<T> parameterType) {
		this.parameterType = parameterType;
	}

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

}
