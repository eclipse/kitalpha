//Generated with EGF 1.4.0.v20160519-0641
package org.polarsys.kitalpha.doc.gen.business.core.sirius;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.diagram.*;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.*;
import org.eclipse.core.runtime.*;
import org.eclipse.core.resources.*;
import org.eclipse.sirius.business.api.session.*;
import org.eclipse.emf.ecore.xmi.*;
import org.eclipse.draw2d.geometry.*;
import java.util.Map.Entry;
import org.polarsys.kitalpha.doc.gen.business.core.util.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.PlatformUI;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenDiagramPreferencesHelper;

public class DiagramGenerator {
	protected static String nl;

	public static synchronized DiagramGenerator create(String lineSeparator) {
		nl = lineSeparator;
		DiagramGenerator result = new DiagramGenerator();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "\t<div>" + NL + "\t<p class=\"diagram-name\" id=\"";
	protected final String TEXT_2 = "\">";
	protected final String TEXT_3 = "</p>" + NL + "\t<p class=\"diagram\">" + NL + "\t\t<img id=\"";
	protected final String TEXT_4 = "\" src=\"";
	protected final String TEXT_5 = "/";
	protected final String TEXT_6 = "\" alt=\"";
	protected final String TEXT_7 = "\" usemap=\"#";
	protected final String TEXT_8 = "\" />" + NL + "\t\t" + NL + "\t\t<br/>" + NL + "\t\t<br/>" + NL
			+ "\t\t<map name=\"";
	protected final String TEXT_9 = "\">";
	protected final String TEXT_10 = NL + "\t\t\t<area shape=\"rect\" group=\"";
	protected final String TEXT_11 = "\" coords=\"";
	protected final String TEXT_12 = ",";
	protected final String TEXT_13 = ",";
	protected final String TEXT_14 = ",";
	protected final String TEXT_15 = "\" href=\"../";
	protected final String TEXT_16 = "/";
	protected final String TEXT_17 = ".html#";
	protected final String TEXT_18 = "\" alt=\"";
	protected final String TEXT_19 = "\" />";
	protected final String TEXT_20 = "\t\t\t" + NL + "\t\t</map>" + NL + "\t</p>" + NL
			+ "\t<p class=\"diagram-description\">";
	protected final String TEXT_21 = "</p>" + NL + "\t</div>";
	protected final String TEXT_22 = NL + "<p class=\"diagram-name\" id=\"";
	protected final String TEXT_23 = "\">";
	protected final String TEXT_24 = "</p>" + NL + "<p>image is missing</p>" + NL + "<p class=\"diagram-description\">";
	protected final String TEXT_25 = "</p>";
	protected final String TEXT_26 = NL;
	protected final String TEXT_27 = NL;

	public DiagramGenerator() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		List<Object> projectNameList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> outputFolderList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> diagramList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> generatedFolderList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> fileNameServiceList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> helperList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object projectNameParameter : projectNameList) {
			for (Object outputFolderParameter : outputFolderList) {
				for (Object diagramParameter : diagramList) {
					for (Object generatedFolderParameter : generatedFolderList) {
						for (Object fileNameServiceParameter : fileNameServiceList) {
							for (Object helperParameter : helperList) {

								this.projectName = (java.lang.String) projectNameParameter;
								this.outputFolder = (java.lang.String) outputFolderParameter;
								this.diagram = (org.eclipse.sirius.diagram.DDiagram) diagramParameter;
								this.generatedFolder = (java.lang.String) generatedFolderParameter;
								this.fileNameService = (org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService) fileNameServiceParameter;
								this.helper = (org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper) helperParameter;

								if (preCondition(ctx)) {
									ctx.setNode(new Node.Container(currentNode, getClass()));
									orchestration(ctx);
								}

							}
						}
					}
				}
			}
		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_26);
		stringBuffer.append(TEXT_27);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_body(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("projectName", this.projectName);
			parameterValues.put("outputFolder", this.outputFolder);
			parameterValues.put("diagram", this.diagram);
			parameterValues.put("generatedFolder", this.generatedFolder);
			parameterValues.put("fileNameService", this.fileNameService);
			parameterValues.put("helper", this.helper);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected java.lang.String projectName = null;

	public void set_projectName(java.lang.String object) {
		this.projectName = object;
	}

	protected java.lang.String outputFolder = null;

	public void set_outputFolder(java.lang.String object) {
		this.outputFolder = object;
	}

	protected org.eclipse.sirius.diagram.DDiagram diagram = null;

	public void set_diagram(org.eclipse.sirius.diagram.DDiagram object) {
		this.diagram = object;
	}

	protected java.lang.String generatedFolder = null;

	public void set_generatedFolder(java.lang.String object) {
		this.generatedFolder = object;
	}

	protected org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService fileNameService = null;

	public void set_fileNameService(org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService object) {
		this.fileNameService = object;
	}

	protected org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper helper = null;

	public void set_helper(org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper object) {
		this.helper = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("projectName", this.projectName);
		parameters.put("outputFolder", this.outputFolder);
		parameters.put("diagram", this.diagram);
		parameters.put("generatedFolder", this.generatedFolder);
		parameters.put("fileNameService", this.fileNameService);
		parameters.put("helper", this.helper);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		// org.polarsys.kitalpha.doc.gen.business.core.Activator.getDefault().getLog().log(new Status(IStatus.INFO,
		//			org.polarsys.kitalpha.doc.gen.business.core.Activator.PLUGIN_ID, "Starting generate diagram :" + diagram.getName()));
		Session session = DiagramSessionHelper.getCurrentSession();
		IPath outputPath = new Path(projectName).append(outputFolder).append(generatedFolder);
		DiagramExport diagramExport = new DiagramExport(projectName, outputPath, diagram, session);
		IFile imageFile = diagramExport.exportAsImage();
		Resource sessionResource = session.getSessionResource();
		if (imageFile != null && imageFile.exists()) {
			String id = "";
			if (sessionResource instanceof XMLResource) {
				id = ((XMLResource) sessionResource).getID(diagram);
				if (id == null && EcoreUtil.getURI(diagram) != null) {
					id = EcoreUtil.getURI(diagram).fragment();
				}
			}
			String mapName = diagram.getName() + "_" + id + "_PositionMap";
			mapName = DocGenHtmlUtil.getValidFileName(mapName);
			CoordinatesCalculator calculator = new CoordinatesCalculator(imageFile, diagram, helper);
			//Map<EObject, Rectangle> positionMap = new HashMap<EObject, Rectangle>();
			Map<Rectangle, EObject> positionMap = calculator.getPositionMap();

			stringBuffer.append(TEXT_1);
			stringBuffer.append(id);
			stringBuffer.append(TEXT_2);
			stringBuffer.append(EscapeChars.forHTML(diagram.getName()));
			stringBuffer.append(TEXT_3);
			stringBuffer.append(diagram.hashCode());
			stringBuffer.append(TEXT_4);
			stringBuffer.append(generatedFolder);
			stringBuffer.append(TEXT_5);
			stringBuffer.append(imageFile.getName());
			stringBuffer.append(TEXT_6);
			stringBuffer.append(EscapeChars.forHTML(diagram.getName()));
			stringBuffer.append(TEXT_7);
			stringBuffer.append(mapName);
			stringBuffer.append(TEXT_8);
			stringBuffer.append(mapName);
			stringBuffer.append(TEXT_9);

			for (Entry<Rectangle, EObject> entrySet : positionMap.entrySet()) {
				EObject value = entrySet.getValue();
				String fileName = fileNameService.getFileName(value);
				String fragment = helper.getElementId(value);
				Rectangle rectangle = entrySet.getKey();
				Point topLeft = rectangle.getTopLeft();
				Point bottomRight = rectangle.getBottomRight();
				String modelName = DocGenHtmlUtil.getModelName(value);
				stringBuffer.append(TEXT_10);
				stringBuffer.append(fileName);
				stringBuffer.append(TEXT_11);
				stringBuffer.append(topLeft.x);
				stringBuffer.append(TEXT_12);
				stringBuffer.append(topLeft.y);
				stringBuffer.append(TEXT_13);
				stringBuffer.append(bottomRight.x);
				stringBuffer.append(TEXT_14);
				stringBuffer.append(bottomRight.y);
				stringBuffer.append(TEXT_15);
				stringBuffer.append(modelName);
				stringBuffer.append(TEXT_16);
				stringBuffer.append(fileName);
				stringBuffer.append(TEXT_17);
				stringBuffer.append(fragment);
				stringBuffer.append(TEXT_18);
				stringBuffer.append(fileName);
				stringBuffer.append(TEXT_19);
			}

			stringBuffer.append(TEXT_20);
			stringBuffer.append(helper.diagramDocumentationPostTraitement(((DSemanticDiagram) diagram).getTarget(),
					diagram.getDocumentation(), projectName, outputFolder));
			stringBuffer.append(TEXT_21);
		} else {
			String diagramName = diagram.getName();
			if (diagramName != null && diagramName.isEmpty() == false)
				diagramName = EscapeChars.forHTML(diagramName);

			stringBuffer.append(TEXT_22);
			stringBuffer.append(sessionResource.getURIFragment(diagram));
			stringBuffer.append(TEXT_23);
			stringBuffer.append(diagramName);
			stringBuffer.append(TEXT_24);
			stringBuffer.append(diagram.getDocumentation());
			stringBuffer.append(TEXT_25);

			org.polarsys.kitalpha.doc.gen.business.core.Activator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, org.polarsys.kitalpha.doc.gen.business.core.Activator.PLUGIN_ID,
							"Error during diagram export action:" + diagram.getName()));
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return DocgenDiagramPreferencesHelper.getExportDiagram();
	}
}