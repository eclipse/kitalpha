/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.releng;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.BuildException;

/**
 * @author Matthieu Helleboid
 * 
 */
public class CustomPlatformAntTask extends AbstractTask {

	private String platformPath;

	private String buildId;
	private String application;
	private String product;

	public void setBuildId(String buildId) {
		this.buildId = buildId;
	}

	public CustomPlatformAntTask() {
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void setPlatformPath(String platformPath) {
		this.platformPath = platformPath;
	}

	@Override
	public void execute() throws BuildException {
		System.out.println("Starting custom of " + platformPath);

		try {
			modifyEclipseInis();
			modifyConfigIni();
		} catch (IOException e) {
			throw new BuildException(e);
		}
	}

	private void modifyConfigIni() throws IOException {
		File file = new File(platformPath, "configuration/config.ini");
		System.out.println("Will modify " + file.getName());
		List<String> list = new ArrayList<String>();
		readFile(file, list);
		for (String line : new ArrayList<String>(list)) {
			if (line.startsWith("eclipse.product"))
				list.set(list.indexOf(line), "eclipse.product=" + product);
			if (line.startsWith("osgi.splashPath"))
				list.set(list.indexOf(line), "osgi.splashPath=platform\\:/base/plugins/" + getProductPluginID());
			if (line.startsWith("eclipse.application"))
				list.set(list.indexOf(line), "eclipse.application=" + application);
		}
		writeFile(file, list);
	}


	private void modifyEclipseInis() throws IOException {
		File folder = new File(platformPath);
		for (File file : folder.listFiles()) {
			if (file.getName().startsWith("eclipse") && file.getName().endsWith(".ini")) {
				System.out.println("Will modify " + file.getName());
				List<String> list = new ArrayList<String>();
				readFile(file, list);

				list.add(0, "-showLocation");

				for (String line : new ArrayList<String>(list)) {
					if (line.startsWith("-Xms") || line.startsWith("-Xmx"))
						list.remove(line);
					if (line.equals("org.eclipse.platform"))
						list.set(list.indexOf(line), getProductPluginID());
				}

//				list.add("-Dosgi.requiredJavaVersion=1.5");
				list.add("-Xms512m");
				list.add("-Xmx1024m");
				list.add("-XX:PermSize=256M");
//				list.add("-XX:MaxPermSize=512M");

				writeFile(file, list);
			}
		}
	}
	
	private String getProductPluginID() {
		return product.substring(0, product.lastIndexOf("."));
	}
}
