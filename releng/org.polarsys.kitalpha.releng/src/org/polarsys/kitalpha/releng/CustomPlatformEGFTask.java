/**
 * 
 */
package org.polarsys.kitalpha.releng;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;

/**
 * @author Matthieu Helleboid
 *
 */
public class CustomPlatformEGFTask extends CustomPlatformAntTask implements ITaskProduction {

    public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
        setPlatformPath(System.getProperty("platformPath"));
        setVersion(System.getProperty("version"));
        setBuildId(System.getProperty("buildId"));
        execute();
    }

    public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
    }
    
    public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
    }

}
