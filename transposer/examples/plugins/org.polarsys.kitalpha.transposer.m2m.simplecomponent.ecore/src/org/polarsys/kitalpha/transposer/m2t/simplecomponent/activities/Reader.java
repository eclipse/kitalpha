package org.polarsys.kitalpha.transposer.m2t.simplecomponent.activities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class Reader implements IActivity {
	
	public static final String ID = "org.polarsys.kitalpha.transposer.m2t.simplecomponent.activities.reader"; //$NON-NLS-1$
	public static final String NSURI = "nsUri"; //$NON-NLS-1$
	public static final String NSURI_DESCRIPTION = "nsUri of the input metamodel"; //$NON-NLS-1$
	public static final String ROOT_ELEMENT = "EClass name"; //$NON-NLS-1$
	public static final String DANGLING_ELEMENT_DESCRIPTION = "the name of the EClass";
	public static final String TRANSPOSER_CONTEXT = "TransposerContext";
	
	
	public Reader() {
	}

	@Override
	public Collection<DeclaredParameter> getParameters() {
		return null;
	}

	@Override
	public IStatus run(ActivityParameters p) {
	
		IContext context = (IContext)p.getParameter(TRANSPOSER_CONTEXT).getValue();
		
		//arraylist to store vp classes stored in the Transposer context
		context.put("vpdsl", new ArrayList<Class>());

		return Status.OK_STATUS;
	}

	@Override
	public Map<String, ParameterError<?>> validateParameters(
			ActivityParameters p) {
	    return null;
	  }

}
