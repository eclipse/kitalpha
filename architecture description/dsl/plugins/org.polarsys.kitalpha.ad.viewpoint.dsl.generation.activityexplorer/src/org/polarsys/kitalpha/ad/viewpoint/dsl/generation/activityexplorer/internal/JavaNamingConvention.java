/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.activityexplorer.internal;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.java.JDTUtility;

/**
 * @author Boubekeur Zendagui
 */
public class JavaNamingConvention {

	/**
	 * This enumeration defines the context wherein the Java class is used. 
	 * For example, two or more Java classes can be generated from one model element
	 * 
	 * @author Boubekeur Zendagui
	 */
	public enum JavaUseContext {
		Page("Page"), Activity("Activity"), Predicate("Predicate");
		
		/**
		 * String property
		 */
		private String context;
		
		/**
		 * Default hidden constructor
		 * @param context
		 */
		private JavaUseContext(String context) {
			this.context = context;
		}
		
		@Override
		/*
		 * (non-Javadoc)
		 * @see java.lang.Enum#toString()
		 */
		public String toString() {
			return this.context;
		}
	}
	
	/**
	 * <p>
	 * This method defines The Java packages naming convention. It generate a Java package name for 
	 * the context of it use. 
	 * </p>
	 * <p>
	 * This method uses 
	 * {@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.java.JDTUtility#getValidPackageName(String)}
	 * to format the name as defined by the Java naming conventions.
	 * </p>
	 * @param basePackage the parent Java package
	 * @param context a {@link JavaUseContext} defining the context of generation of the Java package.
	 * @return
	 */
	public static String getJavaPackageNameFor(String basePackage, JavaUseContext context){
		if (null == context)
			throw new IllegalArgumentException("[VPDSL - Java Class Naming Convention] JavaClassUseContext is mandatory");
		
		final String s_context = context.toString();
		String javaPackageName = (null != basePackage && !basePackage.isEmpty() ? basePackage + "." + s_context : s_context);
		javaPackageName = JDTUtility.getValidPackageName(javaPackageName);
		
		return javaPackageName;
	}
	
	/**
	 * 
	 * @param basePackage
	 * @param element
	 * @param context
	 * @return
	 */
	public static String getJavaClassFQNFor(String basePackage, NamedElement element, JavaUseContext context){
		final String javaPackageNameFor = getJavaPackageNameFor(basePackage, context);
		final String javaClassNameFor = getJavaClassNameFor(element, context);
		return javaPackageNameFor + '.' + javaClassNameFor;
	}
	
	/**
	 * <p>
	 * This method defines The Java classes naming convention. It generate a JavaClass name for 
	 * a given model element to use in a given context. 
	 * </p>
	 * <p>
	 * This method uses {@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.java.JDTUtility#getValidClassName(String) }
	 * to format the name as defined by the Java naming conventions.
	 * </p>
	 * @param element a {@link NamedElement} element from who a Java class need to be generated.
	 * @param context a {@link JavaUseContext} defining the context of generation of the Java class.
	 * @return The name of a Java Class as String. 
	 */
	public static String getJavaClassNameFor(NamedElement element, JavaUseContext context){
		if (null == context)
			throw new IllegalArgumentException("[VPDSL - Java Class Naming Convention] JavaClassUseContext is mandatory");
		
		if (null == element)
			throw new IllegalArgumentException("[VPDSL - Java Class Naming Convention] Null element are not accepted");
		
		final String name = element.getName();
		if (null == name || (null != name && name.isEmpty()))
			throw new IllegalArgumentException("[VPDSL - Java Class Naming Convention] No named element are not accepted");
		
		String javaClassName = name + context.toString();
		
		/* Two model element (not brother) can share the same name. Because Predicates Java classes are generated in the 
		 * same Java package, and to avoid Java class name conflict, the first letter of the meta-class of the model element 
		 * is added in the begin of the Java class name.
		 * */
		if (context.equals(JavaUseContext.Predicate))
		{
			final String modelElementClassName = element.eClass().getName();
			final char firstLetter = modelElementClassName.charAt(0);
			javaClassName = firstLetter + javaClassName;
		}
		
		javaClassName = JDTUtility.getValidClassName(javaClassName);
		
		return javaClassName;
	}
	
}
