package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activity;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Overview;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.PageExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess;

@SuppressWarnings("all")
public class ActivityexplorerSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ActivityexplorerGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ViewpointActivityExplorerPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ViewpointActivityExplorerPackage.ACTIVITY:
				if(context == grammarAccess.getActivityRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case ViewpointActivityExplorerPackage.OVERVIEW:
				if(context == grammarAccess.getOverviewRule()) {
					sequence_Overview(context, (Overview) semanticObject); 
					return; 
				}
				else break;
			case ViewpointActivityExplorerPackage.PAGE:
				if(context == grammarAccess.getAbstractPageRule() ||
				   context == grammarAccess.getPageRule()) {
					sequence_Page(context, (Page) semanticObject); 
					return; 
				}
				else break;
			case ViewpointActivityExplorerPackage.PAGE_EXTENSION:
				if(context == grammarAccess.getAbstractPageRule() ||
				   context == grammarAccess.getPageExtensionRule()) {
					sequence_PageExtension(context, (PageExtension) semanticObject); 
					return; 
				}
				else break;
			case ViewpointActivityExplorerPackage.SECTION:
				if(context == grammarAccess.getSectionRule()) {
					sequence_Section(context, (Section) semanticObject); 
					return; 
				}
				else break;
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION:
				if(context == grammarAccess.getSectionExtensionRule()) {
					sequence_SectionExtension(context, (SectionExtension) semanticObject); 
					return; 
				}
				else break;
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER:
				if(context == grammarAccess.getViewpointActivityExplorerRule()) {
					sequence_ViewpointActivityExplorer(context, (ViewpointActivityExplorer) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         activityExplorerItemID=FQN? 
	 *         label=STRING? 
	 *         index=EInt 
	 *         hasPredicate=EBoolean? 
	 *         imagePathOff=STRING?
	 *     )
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=STRING? imagePathOn=STRING? imagePathOff=STRING?)
	 */
	protected void sequence_Overview(EObject context, Overview semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (extendedPageID=FQN ownedSections+=Section*)
	 */
	protected void sequence_PageExtension(EObject context, PageExtension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         fileExtensions=STRING? 
	 *         activityExplorerItemID=FQN? 
	 *         label=STRING? 
	 *         index=EInt 
	 *         ownedOverview=Overview? 
	 *         (imagePathOn=STRING? imagePathOff=STRING?)? 
	 *         tabName=STRING? 
	 *         hasPredicate=EBoolean? 
	 *         showViewer=EBoolean? 
	 *         ownedSections+=Section*
	 *     )
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (extendedSectionID=FQN ownedActivities+=Activity*)
	 */
	protected void sequence_SectionExtension(EObject context, SectionExtension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         activityExplorerItemID=FQN? 
	 *         label=STRING? 
	 *         index=EInt 
	 *         filtering=EBoolean? 
	 *         expanded=EBoolean? 
	 *         ownedActivities+=Activity*
	 *     )
	 */
	protected void sequence_Section(EObject context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN ownedPages+=Page* ownedPages+=PageExtension* ownedSectionExtensions+=SectionExtension*)
	 */
	protected void sequence_ViewpointActivityExplorer(EObject context, ViewpointActivityExplorer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
