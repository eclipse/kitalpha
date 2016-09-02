package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;

import com.google.inject.Inject;

public class VpConfTemplateProposalProvider extends CommonTemplateProposalProvider {
	
	private static final int CONFIGURATION_TEMPLATE_PRIORITY = 50;
	private static final int REPRESENTATION_TEMPLATE_PRIORITY = 25;
	private static final int RELEASE_TEMPLATE_PRIORITY = 12;
	private static final int GENERATION_OPTIONS_PRIROITY = 6;

	@Inject
	public VpConfTemplateProposalProvider(TemplateStore templateStore, ContextTypeRegistry registry,
			ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
	}
	
	@Override
	public int getRelevance(Template template) {
		String contextTypeId = template.getContextTypeId();
		
		if (contextTypeId.equals(VpConfTemplateIDs.CONFIGURATION_TEMPLATE_ID)){
			return CONFIGURATION_TEMPLATE_PRIORITY;
		}
		if (contextTypeId.equals(VpConfTemplateIDs.REPRESENTATION_TEMPLATE_ID)){
			return REPRESENTATION_TEMPLATE_PRIORITY;
		}
		if (contextTypeId.equals(VpConfTemplateIDs.RELEASE_TEMPLATE_ID)){
			return RELEASE_TEMPLATE_PRIORITY;
		}
		if (contextTypeId.equals(VpConfTemplateIDs.GENERATION_OPTIONS_TEMPLATE_ID)){
			return GENERATION_OPTIONS_PRIROITY;
		}
		
		return super.getRelevance(template);
	}

}
