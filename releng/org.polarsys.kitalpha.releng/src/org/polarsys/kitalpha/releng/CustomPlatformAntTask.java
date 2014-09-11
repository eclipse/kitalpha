/**
 * 
 */
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

	private String version;

	private String buildId;

	public void setVersion(String version) {
		this.version = version;
	}

	public void setBuildId(String buildId) {
		this.buildId = buildId;
	}

	public CustomPlatformAntTask() {
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
			modifyAboutMappings();
		} catch (IOException e) {
			throw new BuildException(e);
		}
	}

	private void modifyAboutMappings() throws IOException {
		File pluginsFolder = new File(platformPath, "plugins");
		for (File pluginFolder : pluginsFolder.listFiles()) {
			if (pluginFolder.isDirectory() && pluginFolder.getName().startsWith("org.polarsys.kitalpha.product_")) {
				File file = new File(pluginFolder, "about.mappings");
				System.out.println("Will modify " + file.getName());
				List<String> list = new ArrayList<String>();
				readFile(file, list);
				list.add("0=" + version);
				list.add("1=" + buildId);
				writeFile(file, list);
			}
		}
	}

	private void modifyConfigIni() throws IOException {
		File file = new File(platformPath, "configuration/config.ini");
		System.out.println("Will modify " + file.getName());
		List<String> list = new ArrayList<String>();
		readFile(file, list);
		for (String line : new ArrayList<String>(list)) {
			if (line.startsWith("eclipse.product"))
				list.set(list.indexOf(line), "eclipse.product=org.polarsys.kitalpha.product");
			if (line.startsWith("osgi.splashPath"))
				list.set(list.indexOf(line), "osgi.splashPath=platform\\:/base/plugins/org.polarsys.kitalpha.product");
			if (line.startsWith("eclipse.application"))
				list.set(list.indexOf(line), "eclipse.application=org.polarsys.kitalpha.application");
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
						list.set(list.indexOf(line), "org.polarsys.kitalpha.product");
				}

				list.add("-Dosgi.requiredJavaVersion=1.5");
				list.add("-Xms128m");
				list.add("-Xmx512m");
				list.add("-XX:PermSize=64M");
				list.add("-XX:MaxPermSize=512M");

				writeFile(file, list);
			}
		}
	}
}
