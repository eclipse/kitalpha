/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.java;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;


/**
 * @author Boubekeur Zendagui
 */

public class JDTUtility {
	
	/**
	 *  
	 * @param project the project containing the Java package 
	 * @param packageName the Java package name
	 * @return return the IFolder of the Java package
	 */
	public static IFolder packageToFolder(IProject project, String packageName){
		String folder = getValidPackageName(packageName);
		folder = folder.replaceAll("\\.", "/");
		folder = "src/"+ folder;
		return project.getFolder(new Path(folder));
	}
	
	
	/**
	 * This use the EMF merge engine to merge available Java code with generated 
	 * one. 
	 * @param javaFile
	 * @param generatedCode
	 * @return the merged Java code that hold user modification
	 */
	public static String mergeJavaCode(IFile javaFile, String generatedCode){
		String mergerCode = "";
		try 
		{
			mergerCode = JavaMerger.doMerge(javaFile, generatedCode);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return mergerCode;
	}
	
	/**
	 * This method formats the Java code given in parameter.
	 * @param javaCode original Java code 
	 * @return Formated java code
	 */
	public static String formatJavaCode(String javaCode){
		CodeFormatter codeFormatter = ToolFactory.createCodeFormatter(null);
		
		TextEdit textEdit = codeFormatter.format(CodeFormatter.K_UNKNOWN, javaCode, 0,javaCode.length(),0,null);
		IDocument document = new Document(javaCode);
		try 
		{
			textEdit.apply(document);
			javaCode = document.get();
		} 
		catch (MalformedTreeException e) 
		{
			e.printStackTrace();
		} 
		catch (org.eclipse.jface.text.BadLocationException e) 
		{
			e.printStackTrace();
		}

		return javaCode;
	}
	
	/**
	 * This methods allows to write a Java code (javaCode parameter content) in 
	 * a file (javaFile parameter)
	 * @param javaFile the Java file wherein the code is serialized
	 * @param javaCode the Java code 
	 */
	public static void writeJavaContent(IFile javaFile, String javaCode){
		String formatedOutput = formatJavaCode(javaCode);
		ByteArrayInputStream outputContent = new ByteArrayInputStream(formatedOutput.getBytes());
		try 
		{
			if (javaFile.exists()) {
				javaFile.setContents(outputContent, true, false, null);
			} else {
				javaFile.create(outputContent, true, null);
			}

			javaFile.refreshLocal(IFile.DEPTH_ONE, new NullProgressMonitor());
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This keeps only alphanumeric, '.' and '_' characters 
	 * @param name the Java package name 
	 * @return Correct Java package name
	 */
	public static String getValidPackageName(String name){
		return name.replaceAll("[^a-zA-Z0-9_.]","").toLowerCase();
	}
	
	/**
	 * This keeps only alphanumeric and '_' characters 
	 * @param name the Java class name 
	 * @return Correct Java class name
	 */
	public static String getValidClassName(String name){
		String cName = name.replaceAll("[^a-zA-Z0-9_]","");
		return cName.substring(0,1).toUpperCase() + cName.substring(1);
	}
	
	
	/**
	 * This method create all package folders
	 * @param project The project wherein the package folders will be created
	 * @param packageName the name of the 
	 * @return 
	 */
	public static IFolder createOrGetPackageFolders(IProject project, String packageName){
		IFolder src = project.getFolder("src");
		if (! src.exists()){
			try 
			{
				src.create(true, true, null);
			} 
			catch (CoreException e) 
			{
				e.printStackTrace();
			}
		}
		
		Path packageFolderPath = new Path(packageName.replace('.', '/'));
		if (src.getFolder(packageFolderPath).exists()) {
			return src.getFolder(packageFolderPath);
		}
		
		IFolder parent = src;
		for (int i = 0; i < packageFolderPath.segmentCount(); i++) 
		{
			IFolder curFolder = parent.getFolder(packageFolderPath.segment(i));
			if (! curFolder.exists())
			{
				try 
				{
					curFolder.create(true, true, null);
				} 
				catch (CoreException e) 
				{
					e.printStackTrace();
				}
			}
			
			parent = curFolder;
		}
		
		return parent;
	}
	
	/**
	 * In this version, this methods remove only unused imports.
	 * FIXME: To improve. This is just a POC.
	 * @param javaFile
	 * @param javaCode
	 * @return
	 */
	public static String organizeImport(IFile javaFile, String javaCode){
		return javaCode;
	}
	
	public static void organizeImport(final IFile javaCode){
	}
	
}
