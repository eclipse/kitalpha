package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.egf.portfolio.eclipse.build.buildcore.Chain;
import org.eclipse.egf.portfolio.eclipse.build.buildcore.Job;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates.EGFBuildHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util.BuildDataConfigContainer;

@SuppressWarnings("all")
public class GenBuildModel {
  public Chain doGenerate(final String targetLocation, final String repositoryLocation, final String protocol, final String rootProjectName, final String lvpsShortName, final BuildDataConfigContainer<String> buildConfig) {
    final Job mainJob = EGFBuildHelper.createMainJob("viewpoint", protocol, rootProjectName, lvpsShortName, repositoryLocation, buildConfig);
    final Job buildJob = EGFBuildHelper.createViewpointBuildJob(targetLocation, repositoryLocation, protocol, rootProjectName, lvpsShortName, buildConfig);
    ArrayList<Job> _arrayList = new ArrayList<Job>();
    final Collection<Job> jobs = _arrayList;
    jobs.add(mainJob);
    jobs.add(buildJob);
    return EGFBuildHelper.createChainOfJobs(jobs, lvpsShortName);
  }
}
