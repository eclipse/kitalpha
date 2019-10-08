package org.polarsys.kitalpha.transposer.junit.tests.acitivity;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.transposer.TransposerCorePlugin;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;

public class FinalizeTransformationTest implements IActivity, ITransposerWorkflow {
	
	private static String COMPONENTSIMPLE_RESOURCE = "componentsampleResource";
	private static URI OUTPUT_URI = URI.createURI("platform:/resource/org.polarsys.kitalpha.transposer.junit.tests.output/model/Input.componentsample");

	public FinalizeTransformationTest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus run(ActivityParameters activityParams_p) {
		IStatus status = Status.CANCEL_STATUS;

		IContext context = (IContext) activityParams_p.getParameter(TRANSPOSER_CONTEXT).getValue();
		Resource resource = (Resource) context.get(COMPONENTSIMPLE_RESOURCE);

		if(resource != null){
			resource.setURI(OUTPUT_URI);
			ResourceUtil.saveResource(resource);
			dispose(context);

			status = Status.OK_STATUS;
		}else{
			status = new Status(IStatus.ERROR,TransposerCorePlugin.PLUGIN_ID,"no ResourceSet specified");  
		}
		return status;
	}

	@Override
	public Collection<DeclaredParameter> getParameters() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void dispose(IContext context_p) {
		context_p.reset();

	}

	@Override
	public Map<String, ParameterError<?>> validateParameters(ActivityParameters valuedParameters_p) {
		// TODO Auto-generated method stub
		return null;
	}

}
