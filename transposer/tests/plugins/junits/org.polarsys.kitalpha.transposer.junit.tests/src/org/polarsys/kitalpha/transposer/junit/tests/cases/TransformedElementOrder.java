package org.polarsys.kitalpha.transposer.junit.tests.cases;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.api.scopes.IModelScope;
import org.eclipse.emf.diffmerge.diffdata.EComparison;
import org.eclipse.emf.diffmerge.diffdata.impl.EComparisonImpl;
import org.eclipse.emf.diffmerge.generic.api.IComparison;
import org.eclipse.emf.diffmerge.generic.api.diff.IDifference;
import org.eclipse.emf.diffmerge.generic.api.diff.IValuePresence;
import org.eclipse.emf.diffmerge.generic.api.scopes.ITreeDataScope;
import org.eclipse.emf.diffmerge.impl.policies.DefaultDiffPolicy;
import org.eclipse.emf.diffmerge.impl.policies.DefaultMatchPolicy;
import org.eclipse.emf.diffmerge.impl.scopes.FragmentedModelScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.transposer.api.TransposerConfiguration;
import org.polarsys.kitalpha.transposer.api.TransposerLauncher;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;

/**
 * Test case described in <a href="https://polarsys.org/wiki/Kitalpha/technical/RegressionTests">Kitalpha Regression Tests</a> [ID: Transposer_00001]
 * @author Faycal ABKA
 *
 */
public class TransformedElementOrder {
	private final int NB_TRANSFORMATION = 1000;
	
	private final String INPUT_URI = "platform:/plugin/org.polarsys.kitalpha.transposer.junit.tests/models/Input.uml";
	private final String WRONG_INPUT_URI = "platform:/plugin/org.polarsys.kitalpha.transposer.junit.tests/models/WrongInput.uml";
	
	private final String OUTPUT_URI = "platform:/resource/org.polarsys.kitalpha.transposer.junit.tests.output/model/Input.componentsample";
	private final String OUTPUT_PROJECT_NAME = "org.polarsys.kitalpha.transposer.junit.tests.output";
	private final String MODEL_FOLDER = "model";
	private final String TRACE_FOLDER = "traces";
	
	private final String REFERENCE_URI = "platform:/plugin/org.polarsys.kitalpha.transposer.junit.tests/models/reference/Reference.componentsample";
	
	private ResourceSet rSet;
	
	//Input resource for transposer (UML)
	private Resource inputResource;
	private Resource wrongResource;
	
	//Output resource from Transposer (ComponentSample)
	private Resource outputResource;
	
	//Reference resource
	private Resource referenceResource;
	
	private TransposerConfiguration conf;
	
	/*
	 * Set up the input to test
	 * 	- Load the input resources of Transposer
	 *  - Load the reference resource
	 *  - Create the project where the transformed resource will be generated
	 *  - Initialize Transposer configuration
	 */
	@Before
	public void setUp(){
		rSet = new ResourceSetImpl();
		inputResource = rSet.getResource(URI.createURI(INPUT_URI), true);
		wrongResource = rSet.getResource(URI.createURI(WRONG_INPUT_URI), true);
		referenceResource = rSet.getResource(URI.createURI(REFERENCE_URI), true);
		createTargetProject();
		initTransposerConfiguration();
	}
	

	/*
	 * Initialize Transposer configuration
	 */
	private void initTransposerConfiguration() {
		conf = new TransposerConfiguration();
		WorkflowActivityParameter preAnalysis = new WorkflowActivityParameter();
		preAnalysis.addActivity("org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.InitTranformation1");
		preAnalysis.addActivity("org.polarsys.kitalpha.transposer.transformation.emf.trace.load");
		preAnalysis.addParameter("org.polarsys.kitalpha.transposer.transformation.emf.trace.load", new GenericParameter<String>("TraceModelPath", "/org.polarsys.kitalpha.transposer.junit.tests.output/traces/trace.traces", ""));
		conf.setPreAnalysisActivities(preAnalysis);
		
		
		WorkflowActivityParameter postExec = new WorkflowActivityParameter();
		postExec.addActivity("org.polarsys.kitalpha.transposer.transformation.emf.trace.clean");
		postExec.addActivity("org.polarsys.kitalpha.transposer.transformation.emf.trace.save");
		postExec.addActivity("org.polarsys.kitalpha.transposer.junit.tests.FinalizationActivity");
		conf.setPostExecutionActivities(postExec);
	}


	/*
	 * Create project in the workspace of JUnit test
	 */
	private void createTargetProject() {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(OUTPUT_PROJECT_NAME);
		if (!project.exists()){
			try {
				NullProgressMonitor monitor = new NullProgressMonitor();
				project.create(monitor);
				project.open(monitor);
				//create model folder
				IFolder folder = project.getFolder(MODEL_FOLDER);
				folder.create(true, true, monitor);
				
				//Traces folder
				IFolder traces = project.getFolder(TRACE_FOLDER);
				traces.create(true, true, monitor);
				project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				//Ignore because the test will fails if the
				//project doesn't exists
			} 
		}
	}
	
	/*
	 * Get fail message
	 * 	- if isDifferent is true => mean that difference are found in the models where they are not
	 * 								supposed exist
	 *  - Otherwise => mean that No difference are found where they are supposed to exist between
	 *  			   models
	 */
	private String getFailMessage(boolean isDifferent, String model1, String model2){
		StringBuffer m = new StringBuffer(isDifferent?"":"No");
		m.append(" ")
		 .append("Diffrence Detected between ")
		 .append(model1).append(" and ")
		 .append(model2).append(" models");
		
		return m.toString();
	}


	/*
	 * JUnit test method
	 * 
	 * 1st loop:
	 * 	- Launch Transposer NB_TRANSFORMATION time to find differences between
	 *    transformed model and reference model. This must not found differences
	 * 
	 * 2nd loop:
	 *  - Launch Transposer NB_TRANSFORMATION time to find differences between
	 *    transformed model and reference model. This must found differences
	 */
	@Test
	public void test() {
		boolean result = true;
		
		//Test there no differences
		for(int i = 0; i < NB_TRANSFORMATION; i++){
			
			TransposerLauncher.launch(inputResource.getContents(), "org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.purpose", "org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.mapping", conf, new NullProgressMonitor());
			//Read new output model
			outputResource = rSet.getResource(URI.createURI(OUTPUT_URI), true);
			result = diffAnalysis(outputResource);
			assertFalse(getFailMessage(result, REFERENCE_URI, OUTPUT_URI), result);
			outputResource.unload();
		}
		
		//Test if there differences
		result = false;
		for(int i = 0; i < NB_TRANSFORMATION; i++){

			TransposerLauncher.launch(wrongResource.getContents(), "org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.purpose", "org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.mapping", conf, new NullProgressMonitor());
			//Read new output model
			outputResource = rSet.getResource(URI.createURI(OUTPUT_URI), true);
			result = diffAnalysis(outputResource);
			assertFalse(getFailMessage(result, REFERENCE_URI, OUTPUT_URI), !result);
			outputResource.unload();
			rSet.getResources().remove(outputResource);
		}
	}
	
	/**
	 * return false if diff/merge detect diffrences
	 * @param outputResource2
	 * @return
	 */
	private boolean diffAnalysis(Resource outputResource2) {
		IEditableModelScope targetScope = new FragmentedModelScope(outputResource2, true);
		IEditableModelScope referenceScope = new FragmentedModelScope(referenceResource, true);
		EComparison comparaison = new EComparisonImpl(targetScope, referenceScope);
		
		comparaison.compute(new DefaultMatchPolicy(){
			
			@Override
			public Object getMatchID(EObject element_p, ITreeDataScope<EObject> scope_p) {
				return getFQN(element_p);
			}
			
			/*
			 * Compute the Fully Qualified Name of an eObject following it container
			 */
			private String getFQN(EObject e){
				List<String> l = new ArrayList<String>();
				EObject _tmp = e;
				while (_tmp != null && !(_tmp instanceof Resource)){
					ComponentElement c = (ComponentElement)_tmp;
					l.add(c.getName());
					_tmp = _tmp.eContainer();
				}
				if (!l.isEmpty()){
					Collections.reverse(l);
					StringBuffer b = new StringBuffer();
					String last = l.get((l.size() - 1));
					for (String n : l) {
						if (!n.equals(last)){
							b.append(n);
							b.append(".");
						} else {
							b.append(last);
						}
					}
					return b.toString();
				}
				return ((ComponentElement)e).getName();
			}
			
		}, new DefaultDiffPolicy(), null, new NullProgressMonitor());
		
		return isDiff(comparaison);
	}


	/**
	 * Check if there are elements typed as IValuePresence and their isOrder() returns true (i.e, there are differences)
	 * @param comparaison
	 * @return true if there are differences, otherwise, false
	 */
	private boolean isDiff(IComparison comparaison) {
		
		boolean result = false;
		Collection<IDifference> remainingDifferences = comparaison.getRemainingDifferences();
		
		for (IDifference iDifference : remainingDifferences) {
			if (iDifference instanceof IValuePresence){
				IValuePresence v = (IValuePresence)iDifference;
				result = v.isOrder();
				if (result){
					//contains diff
					break;
				}
			}
		}
		return result;
	}


	/*
	 * Clear test context 
	 */
	@After
	public void tearDown(){
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(OUTPUT_PROJECT_NAME);
		if (project.exists()){
			try {
				project.delete(true, new NullProgressMonitor());
			} catch (CoreException e) {
				//Ignore
			}
		}
		
		if (inputResource != null && inputResource.isLoaded()) {
			inputResource.unload(); 
			inputResource = null;
		}
		if (wrongResource != null && wrongResource.isLoaded()) {
			wrongResource.unload();
			wrongResource = null;
		}
		if (referenceResource != null && referenceResource.isLoaded()) {
			referenceResource.unload();
			referenceResource = null;
		}
		if (outputResource != null && outputResource.isLoaded()) {
			outputResource.unload();
			outputResource = null;
		}
		
		rSet.eSetDeliver(false);
		rSet.getResources().clear();
		rSet = null;
		
	}

}
