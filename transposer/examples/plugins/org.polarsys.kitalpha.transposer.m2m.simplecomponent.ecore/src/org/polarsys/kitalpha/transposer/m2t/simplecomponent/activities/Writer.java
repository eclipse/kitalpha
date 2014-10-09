package org.polarsys.kitalpha.transposer.m2t.simplecomponent.activities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescFactory;
import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SimplecomponentPackage;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class Writer implements IActivity {

	public static final String ID = "org.polarsys.kitalpha.transposer.m2t.simplecomponent.ecore.writer";
	private static final String EXAMPLE_PLUGIN = "org.polarsys.kitalpha.transposer.simplecomponent.computer.example";
	private static final String MODEL_FOLDER = "model";
	private static final String VPDESC_FILE = "computer.vpdesc";
	
	
	public Writer() {
	}

	@Override
	public Collection<DeclaredParameter> getParameters() {
		return null;
	}

	@Override
	public IStatus run(ActivityParameters p) {
		IContext context = (IContext) p.getParameter(
				ITransposerWorkflow.TRANSPOSER_CONTEXT).getValue();

		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(EXAMPLE_PLUGIN);
		IFolder folder = project.getFolder(MODEL_FOLDER);
		IFile vpdslfile = folder.getFile(VPDESC_FILE);

		@SuppressWarnings("unchecked")
		ArrayList<Class> contentVpdesc = (ArrayList<Class>) context
				.get("vpdsl");

		Viewpoint vp = VpdescFactory.eINSTANCE.createViewpoint();
		Data data = VpdescFactory.eINSTANCE.createData();

		vp.setDescription("Simple component transformation to VP DSL model");
		vp.setName("SimpleComponentComputerModel");
		vp.setShortName("SCComputerModel");

		data.setDescription("Computer data");
		data.setName("SCComputer");
		data.getAdditionalExternalData().add(SimplecomponentPackage.eINSTANCE);

		for (Class c : contentVpdesc) {
			data.getVP_Classes().add(c);
		}

		vp.setVP_Data(data);

		ResourceSet rs = new ResourceSetImpl();
		@SuppressWarnings("deprecation")
		Resource vpdesc = rs
				.createResource(URI.createPlatformResourceURI(vpdslfile
						.getFullPath().toOSString()));

		vpdesc.getContents().add(vp);

		try {
			vpdesc.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return Status.OK_STATUS;
	}

	@Override
	public Map<String, ParameterError<?>> validateParameters(
			ActivityParameters arg0) {
		return null;
	}

}
