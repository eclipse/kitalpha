package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.diagnostic;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;

/**
 * 
 * @author Faycal Abka
 *
 */
public class VptextResourcesDiagnostic {
	
	//singleton
	public static final VptextResourcesDiagnostic INSTANCE = new VptextResourcesDiagnostic();
	
	private Collection<Diagnostic> diagnostics;
	private Collection<Diagnostic> visitedDiagnostics;
	
	private static final String VPTEXT_FILE_PATTERN = ".*\\.(spec|data|conf|ui|diagram|build|services)\\.vptext";
	private static final Pattern pattern = Pattern.compile(VPTEXT_FILE_PATTERN);
	
	
	public VptextResourcesDiagnostic() {
		super();
		
		this.diagnostics = new HashSet<Diagnostic>();
	}
	
	private void dispose(){
		
		if (diagnostics != null) 
			this.diagnostics.clear();
		
	}


	public synchronized Collection<Diagnostic> getDiagnostics(ResourceSet resourceSet, boolean includeWarnings) {
		
		dispose();
		
		EList<Resource> resources = resourceSet.getResources();
		
		for (Resource resource : resources) {
			if (acceptResource(resource)){
				EcoreUtil.resolveAll(resource);
				Diagnostic diagnostic = EcoreUtil.computeDiagnostic(resource, includeWarnings);
				
				if (diagnostic.getChildren() != null && !diagnostic.getChildren().isEmpty()){
					diagnostics.add(diagnostic);
				}
			}		
		}
		
		return this.diagnostics;
	}

	private boolean acceptResource(Resource resource) {
		return pattern.matcher(resource.getURI().toString()).matches();
	}
	
	/**
	 * Must be called after getDiagnostics() method
	 * @return
	 */
	public IStatus getStatus(){
		
		visitedDiagnostics = new HashSet<Diagnostic>();
		
		IStatus status = null;
		if (!this.diagnostics.isEmpty()){
			String messages = assembleMessages();
			status = new Status(IStatus.ERROR, messages, IStatus.INFO, messages, null);
		}
		visitedDiagnostics.clear();
		return status;
	}

	private String assembleMessages() {
		StringBuffer buf = new StringBuffer();
		
		for (Diagnostic diagnostic : diagnostics) {
			addMessageOfDiagnostic(diagnostic, buf);
		}
		return buf.toString();
	}

	private void addMessageOfDiagnostic(Diagnostic diagnostic, StringBuffer buf) {
		if (diagnostic.getMessage() == null || diagnostic.getMessage().isEmpty()){
			List<Diagnostic> children = diagnostic.getChildren();
			
			for (Diagnostic diagnostic2 : children) {
				String msg = diagnostic2.getMessage();
				buf.append(msg).append("\n"); //$NON-NLS-1$
				
				visitedDiagnostics.add(diagnostic2);
				
				addMessageOfDiagnostic(diagnostic2, buf);
			}
		} else {
			if (!visitedDiagnostics.contains(diagnostic)){
				visitedDiagnostics.add(diagnostic);
				
				//Visit it children
				List<Diagnostic> children = diagnostic.getChildren();
				
				for (Diagnostic diagnostic2 : children) {
					String msg2 = diagnostic2.getMessage();
					buf.append(msg2).append("\n"); //$NON-NLS-1$
					
					visitedDiagnostics.add(diagnostic2);
					
					addMessageOfDiagnostic(diagnostic2, buf);
				}
			}
		}
	}

	public boolean performEMFValidation(List<EObject> inputObjects) {
		
		boolean result = true;

		if (!inputObjects.isEmpty()){
			for (EObject current : inputObjects) {

				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(current);

				if (diagnostic.getSeverity() == IStatus.ERROR){
					diagnostics.add(diagnostic);
					result = false;
				}
			}

//			//Perform validation on spec.vptext
//			String projectName = inputObjects.get(0).eResource().getURI().segments()[1];
//			
//			List<EObject> primary = ResourceHelper.loadPrimaryResource(projectName, inputObjects.get(0).eResource().getResourceSet());
//			
//			for (EObject current : primary) {
//
//				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(current);
//
//				if (diagnostic.getSeverity() == IStatus.ERROR){
//					diagnostics.add(diagnostic);
//					result = false;
//				}
//			}
			
		}
		return result;
	}
}
