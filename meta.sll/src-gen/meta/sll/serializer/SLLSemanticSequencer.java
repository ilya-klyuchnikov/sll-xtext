package meta.sll.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import meta.sll.services.SLLGrammarAccess;
import meta.sll.sll.Ctr;
import meta.sll.sll.FCall;
import meta.sll.sll.FDefinition;
import meta.sll.sll.GCall;
import meta.sll.sll.GDefinition;
import meta.sll.sll.Pattern;
import meta.sll.sll.Program;
import meta.sll.sll.SllPackage;
import meta.sll.sll.Var;
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

@SuppressWarnings("all")
public class SLLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SLLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SllPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SllPackage.CTR:
				if(context == grammarAccess.getCtrRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_Ctr(context, (Ctr) semanticObject); 
					return; 
				}
				else break;
			case SllPackage.FCALL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFCallRule()) {
					sequence_FCall(context, (FCall) semanticObject); 
					return; 
				}
				else break;
			case SllPackage.FDEFINITION:
				if(context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getFDefinitionRule()) {
					sequence_FDefinition(context, (FDefinition) semanticObject); 
					return; 
				}
				else break;
			case SllPackage.GCALL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getGCallRule()) {
					sequence_GCall(context, (GCall) semanticObject); 
					return; 
				}
				else break;
			case SllPackage.GDEFINITION:
				if(context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getGDefinitionRule()) {
					sequence_GDefinition(context, (GDefinition) semanticObject); 
					return; 
				}
				else break;
			case SllPackage.PATTERN:
				if(context == grammarAccess.getPatternRule()) {
					sequence_Pattern(context, (Pattern) semanticObject); 
					return; 
				}
				else break;
			case SllPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case SllPackage.VAR:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getVarRule()) {
					sequence_Var(context, (Var) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=UID (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_Ctr(EObject context, Ctr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FID (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_FCall(EObject context, FCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FID (params+=LID params+=LID*)? body=Expression)
	 */
	protected void sequence_FDefinition(EObject context, FDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=GID (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_GCall(EObject context, GCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=GID (pattern=Pattern params+=LID*)? body=Expression)
	 */
	protected void sequence_GDefinition(EObject context, GDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UID (args+=LID args+=LID*)?)
	 */
	protected void sequence_Pattern(EObject context, Pattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     defs+=Definition*
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=LID
	 */
	protected void sequence_Var(EObject context, Var semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SllPackage.Literals.EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SllPackage.Literals.EXPRESSION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarAccess().getNameLIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
}
