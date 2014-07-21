package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Cron;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Feature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SCM;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SourceFolder;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpbuildGrammarAccess;

@SuppressWarnings("all")
public class VpbuildSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VpbuildGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VpbuildPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VpbuildPackage.BUILD:
				if(context == grammarAccess.getBuildRule()) {
					sequence_Build(context, (Build) semanticObject); 
					return; 
				}
				else break;
			case VpbuildPackage.CRON:
				if(context == grammarAccess.getCronRule() ||
				   context == grammarAccess.getTriggerRule()) {
					sequence_Cron(context, (Cron) semanticObject); 
					return; 
				}
				else break;
			case VpbuildPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case VpbuildPackage.GENERATION_LOCATION:
				if(context == grammarAccess.getGenerationLocationRule()) {
					sequence_GenerationLocation(context, (GenerationLocation) semanticObject); 
					return; 
				}
				else break;
			case VpbuildPackage.HUDSON_DEPLOYMENT:
				if(context == grammarAccess.getHudsonDeploymentRule()) {
					sequence_HudsonDeployment(context, (HudsonDeployment) semanticObject); 
					return; 
				}
				else break;
			case VpbuildPackage.REPOSITORY:
				if(context == grammarAccess.getRepositoryRule()) {
					sequence_Repository(context, (Repository) semanticObject); 
					return; 
				}
				else break;
			case VpbuildPackage.SCM:
				if(context == grammarAccess.getSCMRule() ||
				   context == grammarAccess.getTriggerRule()) {
					sequence_SCM(context, (SCM) semanticObject); 
					return; 
				}
				else break;
			case VpbuildPackage.SOURCE_FOLDER:
				if(context == grammarAccess.getSourceFoulderRule()) {
					sequence_SourceFoulder(context, (SourceFolder) semanticObject); 
					return; 
				}
				else break;
			case VpbuildPackage.USER:
				if(context == grammarAccess.getUserRule()) {
					sequence_User(context, (User) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=FQN target_platform=STRING mapped_repositories+=Repository* hudsonDeployment=HudsonDeployment?)
	 */
	protected void sequence_Build(EObject context, Build semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     planning=STRING
	 */
	protected void sequence_Cron(EObject context, Cron semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpbuildPackage.Literals.TRIGGER__PLANNING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpbuildPackage.Literals.TRIGGER__PLANNING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCronAccess().getPlanningSTRINGTerminalRuleCall_2_0(), semanticObject.getPlanning());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=FQN
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpbuildPackage.Literals.FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpbuildPackage.Literals.FEATURE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeatureAccess().getNameFQNParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (folder=STRING url=STRING?)
	 */
	protected void sequence_GenerationLocation(EObject context, GenerationLocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         antName=STRING? 
	 *         assignedNode=STRING? 
	 *         build_id=STRING? 
	 *         enabled=EBoolean? 
	 *         jdkName=STRING? 
	 *         userDeployJobName=STRING? 
	 *         userDeployServerUrl=STRING? 
	 *         users+=User* 
	 *         triggers+=Trigger* 
	 *         generationLocation=GenerationLocation?
	 *     )
	 */
	protected void sequence_HudsonDeployment(EObject context, HudsonDeployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (protocol=ProtocolType location=STRING folders+=SourceFoulder* features+=Feature*)
	 */
	protected void sequence_Repository(EObject context, Repository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     planning=STRING
	 */
	protected void sequence_SCM(EObject context, SCM semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpbuildPackage.Literals.TRIGGER__PLANNING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpbuildPackage.Literals.TRIGGER__PLANNING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSCMAccess().getPlanningSTRINGTerminalRuleCall_2_0(), semanticObject.getPlanning());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_SourceFoulder(EObject context, SourceFolder semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpbuildPackage.Literals.SOURCE_FOLDER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpbuildPackage.Literals.SOURCE_FOLDER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSourceFoulderAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (login=STRING permission=UserPermission?)
	 */
	protected void sequence_User(EObject context, User semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
