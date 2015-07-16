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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Overview;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Pages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Sections;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess;

@SuppressWarnings("all")
public class ActivityexplorerSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ActivityexplorerGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ViewpointActivityExplorerPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ViewpointActivityExplorerPackage.ACTIVITIES:
				if(context == grammarAccess.getActivitiesRule()) {
					sequence_Activities(context, (Activities) semanticObject); 
					return; 
				}
				else break;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION:
				if(context == grammarAccess.getActivityExtensionRule()) {
					sequence_ActivityExtension(context, (ActivityExtension) semanticObject); 
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
				if(context == grammarAccess.getPageRule()) {
					sequence_Page(context, (Page) semanticObject); 
					return; 
				}
				else break;
			case ViewpointActivityExplorerPackage.PAGES:
				if(context == grammarAccess.getPagesRule()) {
					sequence_Pages(context, (Pages) semanticObject); 
					return; 
				}
				else break;
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION:
				if(context == grammarAccess.getSectionExtensionRule()) {
					sequence_SectionExtension(context, (SectionExtension) semanticObject); 
					return; 
				}
				else break;
			case ViewpointActivityExplorerPackage.SECTIONS:
				if(context == grammarAccess.getSectionsRule()) {
					sequence_Sections(context, (Sections) semanticObject); 
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
	 *     (ownedActivitiesExtensions+=ActivityExtension ownedActivitiesExtensions+=ActivityExtension*)
	 */
	protected void sequence_Activities(EObject context, Activities semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         activityExplorerItemID=FQN? 
	 *         extendedSectionID=FQN 
	 *         index=EInt 
	 *         hasPredicate=EBoolean? 
	 *         imagePathOff=STRING?
	 *     )
	 */
	protected void sequence_ActivityExtension(EObject context, ActivityExtension semanticObject) {
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
	 *     (
	 *         name=STRING 
	 *         modelType=STRING? 
	 *         activityExplorerItemID=FQN? 
	 *         index=EInt 
	 *         ownedOverview=Overview? 
	 *         (imagePathOn=STRING? imagePathOff=STRING?)? 
	 *         tabName=STRING? 
	 *         hasPredicate=EBoolean? 
	 *         showViewer=EBoolean?
	 *     )
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedActivityExplorerPages+=Page ownedActivityExplorerPages+=Page*)
	 */
	protected void sequence_Pages(EObject context, Pages semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         activityExplorerItemID=FQN? 
	 *         extendedPageID=FQN 
	 *         index=EInt 
	 *         filtering=EBoolean? 
	 *         expanded=EBoolean?
	 *     )
	 */
	protected void sequence_SectionExtension(EObject context, SectionExtension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedSectionsExtensions+=SectionExtension ownedSectionsExtensions+=SectionExtension*)
	 */
	protected void sequence_Sections(EObject context, Sections semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN ownedNewPages=Pages? ownedSectionsExtension=Sections? ownedActivitiesExtension=Activities?)
	 */
	protected void sequence_ViewpointActivityExplorer(EObject context, ViewpointActivityExplorer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
