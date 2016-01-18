//Generated with EGF 1.3.0.v20150924-1035
package org.polarsys.kitalpha.releng.sonar;

import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.eclipse.core.runtime.*;
import org.eclipse.egf.common.helper.*;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.polarsys.kitalpha.releng.sonar.*;

public class ProjectPattern {

	public ProjectPattern() {
		//Here is the constructor
		// add initialisation of the pattern variables (declaration has been already done).
	}

	public void generate(Object argument) throws Exception {
		InternalPatternContext ctx = (InternalPatternContext) argument;
		IQuery.ParameterDescription paramDesc = null;
		Map<String, String> queryCtx = null;
		Node.Container currentNode = ctx.getNode();
		List<Object> projectList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object projectParameter : projectList) {

			this.project = (org.eclipse.core.resources.IProject) projectParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration((PatternContext) argument);

			}
		}
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		Node.Container currentNode = ictx.getNode();
		method_body(new StringBuffer(), ictx);
		ictx.setNode(currentNode);
		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("project", this.project);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected void method_body(final StringBuffer out, final PatternContext ctx) throws Exception {
		IJavaProject proj = JavaCore.create(project);
		StringBuilder prop = (StringBuilder) ctx.getValue("properties");
		List<String> modules = (List<String>) ctx.getValue("modules");

		IPath readOutputLocation = proj.readOutputLocation().removeFirstSegments(1);
		String name = project.getName();
		IPath location = project.getLocation();

		while (!location.segment(0).equals("git")) {
			location = location.removeFirstSegments(1);
			if (location.segmentCount() == 0)
				return;
		}
		Object workspaceFromJenkins = ctx.getValue("workspace.from.jenkins");
		// remove segment after 'git'
		location = new Path("git").append(location.removeFirstSegments(Boolean.TRUE.equals(workspaceFromJenkins)? 1: 2));

		String sources = "";
		for (IPackageFragmentRoot root : proj.getAllPackageFragmentRoots()) {
			if (root.getKind() == IPackageFragmentRoot.K_SOURCE && root.getParent().equals(proj)) {
				if (!sources.isEmpty())
					sources += ",";
				sources += root.getElementName();
			}
		}

		if (!sources.isEmpty()) {
			prop.append(name + ".sonar.projectName=" + name).append("\n");
			prop.append(name + ".sonar.projectBaseDir=" + location).append("\n");
			prop.append(name + ".sonar.binaries=" + readOutputLocation).append("\n");
			prop.append(name + ".sonar.sources=" + sources).append("\n");

			modules.add(name);
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", out.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return project.isOpen() && project.hasNature(JavaCore.NATURE_ID);
	}

	protected org.eclipse.core.resources.IProject project;

	public void set_project(org.eclipse.core.resources.IProject project) {
		this.project = project;
	}

	public Map<String, Object> getParameters() {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("project", this.project);
		return parameters;
	}

}
