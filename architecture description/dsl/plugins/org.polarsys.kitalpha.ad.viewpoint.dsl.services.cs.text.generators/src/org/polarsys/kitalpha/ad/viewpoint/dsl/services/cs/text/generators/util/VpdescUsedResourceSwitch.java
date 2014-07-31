package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.util.VpdescSwitch;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;

public class VpdescUsedResourceSwitch extends VpdescSwitch<AbstractResource> {
	
	private Viewpoint target;
	
	public VpdescUsedResourceSwitch(Viewpoint target){
		this.target = target;
	}
	
	
	public AbstractResource caseEMFResource(EMFResource er){
		target.getUseAnyEMFResource().add("\"" + er.getUri() + "\"");
		return er;
	}
	
	public AbstractResource caseFilesystemResource(FileSystemResource fsr){
		target.getUseAnyEMFResource().add("\"" + fsr.getPath() + "\"");
		return fsr;
	}
}
