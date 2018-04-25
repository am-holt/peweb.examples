/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.graph.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ox.xtext.peweb.graph.graph.And;
import ox.xtext.peweb.graph.graph.AssignStmt;
import ox.xtext.peweb.graph.graph.BoolConstant;
import ox.xtext.peweb.graph.graph.Comparison;
import ox.xtext.peweb.graph.graph.Declaration;
import ox.xtext.peweb.graph.graph.Edge;
import ox.xtext.peweb.graph.graph.GraphConstant;
import ox.xtext.peweb.graph.graph.GraphPackage;
import ox.xtext.peweb.graph.graph.IfStmt;
import ox.xtext.peweb.graph.graph.IntConstant;
import ox.xtext.peweb.graph.graph.MoveStmt;
import ox.xtext.peweb.graph.graph.MulOrDiv;
import ox.xtext.peweb.graph.graph.Not;
import ox.xtext.peweb.graph.graph.Or;
import ox.xtext.peweb.graph.graph.ParticleConstant;
import ox.xtext.peweb.graph.graph.PathExistence;
import ox.xtext.peweb.graph.graph.PlusOrMin;
import ox.xtext.peweb.graph.graph.PrintStmt;
import ox.xtext.peweb.graph.graph.Program;
import ox.xtext.peweb.graph.graph.StringConstant;
import ox.xtext.peweb.graph.graph.VariableRef;
import ox.xtext.peweb.graph.graph.Vertex;
import ox.xtext.peweb.graph.graph.WhileStmt;
import ox.xtext.peweb.graph.services.GraphGrammarAccess;

@SuppressWarnings("all")
public class GraphSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GraphGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GraphPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GraphPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case GraphPackage.ASSIGN_STMT:
				sequence_AssignStmt(context, (AssignStmt) semanticObject); 
				return; 
			case GraphPackage.BOOL_CONSTANT:
				sequence_Atomic(context, (BoolConstant) semanticObject); 
				return; 
			case GraphPackage.COMPARISON:
				sequence_Comparison(context, (Comparison) semanticObject); 
				return; 
			case GraphPackage.DECLARATION:
				sequence_Declaration(context, (Declaration) semanticObject); 
				return; 
			case GraphPackage.EDGE:
				sequence_Edge(context, (Edge) semanticObject); 
				return; 
			case GraphPackage.GRAPH_CONSTANT:
				sequence_Graph(context, (GraphConstant) semanticObject); 
				return; 
			case GraphPackage.IF_STMT:
				sequence_IfStmt(context, (IfStmt) semanticObject); 
				return; 
			case GraphPackage.INT_CONSTANT:
				sequence_Atomic(context, (IntConstant) semanticObject); 
				return; 
			case GraphPackage.MOVE_STMT:
				sequence_MoveStmt(context, (MoveStmt) semanticObject); 
				return; 
			case GraphPackage.MUL_OR_DIV:
				sequence_MulOrDiv(context, (MulOrDiv) semanticObject); 
				return; 
			case GraphPackage.NOT:
				sequence_Primary(context, (Not) semanticObject); 
				return; 
			case GraphPackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case GraphPackage.PARTICLE_CONSTANT:
				sequence_Particle(context, (ParticleConstant) semanticObject); 
				return; 
			case GraphPackage.PATH_EXISTENCE:
				sequence_PathExistence(context, (PathExistence) semanticObject); 
				return; 
			case GraphPackage.PLUS_OR_MIN:
				sequence_PlusOrMinus(context, (PlusOrMin) semanticObject); 
				return; 
			case GraphPackage.PRINT_STMT:
				sequence_PrintStmt(context, (PrintStmt) semanticObject); 
				return; 
			case GraphPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case GraphPackage.STRING_CONSTANT:
				sequence_Atomic(context, (StringConstant) semanticObject); 
				return; 
			case GraphPackage.VARIABLE_REF:
				sequence_Atomic(context, (VariableRef) semanticObject); 
				return; 
			case GraphPackage.VERTEX:
				sequence_Vertex(context, (Vertex) semanticObject); 
				return; 
			case GraphPackage.WHILE_STMT:
				sequence_WhileStmt(context, (WhileStmt) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expr returns And
	 *     Or returns And
	 *     Or.Or_1_0 returns And
	 *     And returns And
	 *     And.And_1_0 returns And
	 *     PathExistence returns And
	 *     PathExistence.PathExistence_1_0 returns And
	 *     Comparison returns And
	 *     Comparison.Comparison_1_0 returns And
	 *     PlusOrMinus returns And
	 *     PlusOrMinus.PlusOrMin_1_0 returns And
	 *     MulOrDiv returns And
	 *     MulOrDiv.MulOrDiv_1_0 returns And
	 *     Primary returns And
	 *
	 * Constraint:
	 *     (left=And_And_1_0 right=PathExistence)
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightPathExistenceParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns AssignStmt
	 *     AssignStmt returns AssignStmt
	 *
	 * Constraint:
	 *     (var=[Declaration|ID] expr=Expr)
	 */
	protected void sequence_AssignStmt(ISerializationContext context, AssignStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.ASSIGN_STMT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.ASSIGN_STMT__VAR));
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.ASSIGN_STMT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.ASSIGN_STMT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignStmtAccess().getVarDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.eGet(GraphPackage.Literals.ASSIGN_STMT__VAR, false));
		feeder.accept(grammarAccess.getAssignStmtAccess().getExprExprParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns BoolConstant
	 *     Or returns BoolConstant
	 *     Or.Or_1_0 returns BoolConstant
	 *     And returns BoolConstant
	 *     And.And_1_0 returns BoolConstant
	 *     PathExistence returns BoolConstant
	 *     PathExistence.PathExistence_1_0 returns BoolConstant
	 *     Comparison returns BoolConstant
	 *     Comparison.Comparison_1_0 returns BoolConstant
	 *     PlusOrMinus returns BoolConstant
	 *     PlusOrMinus.PlusOrMin_1_0 returns BoolConstant
	 *     MulOrDiv returns BoolConstant
	 *     MulOrDiv.MulOrDiv_1_0 returns BoolConstant
	 *     Primary returns BoolConstant
	 *     Atomic returns BoolConstant
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Atomic(ISerializationContext context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns IntConstant
	 *     Or returns IntConstant
	 *     Or.Or_1_0 returns IntConstant
	 *     And returns IntConstant
	 *     And.And_1_0 returns IntConstant
	 *     PathExistence returns IntConstant
	 *     PathExistence.PathExistence_1_0 returns IntConstant
	 *     Comparison returns IntConstant
	 *     Comparison.Comparison_1_0 returns IntConstant
	 *     PlusOrMinus returns IntConstant
	 *     PlusOrMinus.PlusOrMin_1_0 returns IntConstant
	 *     MulOrDiv returns IntConstant
	 *     MulOrDiv.MulOrDiv_1_0 returns IntConstant
	 *     Primary returns IntConstant
	 *     Atomic returns IntConstant
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atomic(ISerializationContext context, IntConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.INT_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns StringConstant
	 *     Or returns StringConstant
	 *     Or.Or_1_0 returns StringConstant
	 *     And returns StringConstant
	 *     And.And_1_0 returns StringConstant
	 *     PathExistence returns StringConstant
	 *     PathExistence.PathExistence_1_0 returns StringConstant
	 *     Comparison returns StringConstant
	 *     Comparison.Comparison_1_0 returns StringConstant
	 *     PlusOrMinus returns StringConstant
	 *     PlusOrMinus.PlusOrMin_1_0 returns StringConstant
	 *     MulOrDiv returns StringConstant
	 *     MulOrDiv.MulOrDiv_1_0 returns StringConstant
	 *     Primary returns StringConstant
	 *     Atomic returns StringConstant
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Atomic(ISerializationContext context, StringConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.STRING_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns VariableRef
	 *     Or returns VariableRef
	 *     Or.Or_1_0 returns VariableRef
	 *     And returns VariableRef
	 *     And.And_1_0 returns VariableRef
	 *     PathExistence returns VariableRef
	 *     PathExistence.PathExistence_1_0 returns VariableRef
	 *     Comparison returns VariableRef
	 *     Comparison.Comparison_1_0 returns VariableRef
	 *     PlusOrMinus returns VariableRef
	 *     PlusOrMinus.PlusOrMin_1_0 returns VariableRef
	 *     MulOrDiv returns VariableRef
	 *     MulOrDiv.MulOrDiv_1_0 returns VariableRef
	 *     Primary returns VariableRef
	 *     Atomic returns VariableRef
	 *
	 * Constraint:
	 *     variable=[Declaration|ID]
	 */
	protected void sequence_Atomic(ISerializationContext context, VariableRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.VARIABLE_REF__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.VARIABLE_REF__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getVariableDeclarationIDTerminalRuleCall_3_1_0_1(), semanticObject.eGet(GraphPackage.Literals.VARIABLE_REF__VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns Comparison
	 *     Or returns Comparison
	 *     Or.Or_1_0 returns Comparison
	 *     And returns Comparison
	 *     And.And_1_0 returns Comparison
	 *     PathExistence returns Comparison
	 *     PathExistence.PathExistence_1_0 returns Comparison
	 *     Comparison returns Comparison
	 *     Comparison.Comparison_1_0 returns Comparison
	 *     PlusOrMinus returns Comparison
	 *     PlusOrMinus.PlusOrMin_1_0 returns Comparison
	 *     MulOrDiv returns Comparison
	 *     MulOrDiv.MulOrDiv_1_0 returns Comparison
	 *     Primary returns Comparison
	 *
	 * Constraint:
	 *     (
	 *         left=Comparison_Comparison_1_0 
	 *         (
	 *             op='>=' | 
	 *             op='<=' | 
	 *             op='>' | 
	 *             op='<' | 
	 *             op='=' | 
	 *             op='!='
	 *         ) 
	 *         right=PlusOrMinus
	 *     )
	 */
	protected void sequence_Comparison(ISerializationContext context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Declaration
	 *
	 * Constraint:
	 *     (name=ID (type='String' | type='Integer' | type='Boolean' | type='Graph' | type='Particle'))
	 */
	protected void sequence_Declaration(ISerializationContext context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Edge returns Edge
	 *
	 * Constraint:
	 *     (source=[Vertex|ID] dest=[Vertex|ID])
	 */
	protected void sequence_Edge(ISerializationContext context, Edge semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.EDGE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.EDGE__SOURCE));
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.EDGE__DEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.EDGE__DEST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEdgeAccess().getSourceVertexIDTerminalRuleCall_0_0_1(), semanticObject.eGet(GraphPackage.Literals.EDGE__SOURCE, false));
		feeder.accept(grammarAccess.getEdgeAccess().getDestVertexIDTerminalRuleCall_2_0_1(), semanticObject.eGet(GraphPackage.Literals.EDGE__DEST, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns GraphConstant
	 *     Or returns GraphConstant
	 *     Or.Or_1_0 returns GraphConstant
	 *     And returns GraphConstant
	 *     And.And_1_0 returns GraphConstant
	 *     PathExistence returns GraphConstant
	 *     PathExistence.PathExistence_1_0 returns GraphConstant
	 *     Comparison returns GraphConstant
	 *     Comparison.Comparison_1_0 returns GraphConstant
	 *     PlusOrMinus returns GraphConstant
	 *     PlusOrMinus.PlusOrMin_1_0 returns GraphConstant
	 *     MulOrDiv returns GraphConstant
	 *     MulOrDiv.MulOrDiv_1_0 returns GraphConstant
	 *     Primary returns GraphConstant
	 *     Atomic returns GraphConstant
	 *     Graph returns GraphConstant
	 *
	 * Constraint:
	 *     (vertices+=Vertex* edges+=Edge*)
	 */
	protected void sequence_Graph(ISerializationContext context, GraphConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns IfStmt
	 *     IfStmt returns IfStmt
	 *
	 * Constraint:
	 *     (expr=Expr stmts+=Statement* elseStmts+=Statement*)
	 */
	protected void sequence_IfStmt(ISerializationContext context, IfStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns MoveStmt
	 *     MoveStmt returns MoveStmt
	 *
	 * Constraint:
	 *     var=[Declaration|ID]
	 */
	protected void sequence_MoveStmt(ISerializationContext context, MoveStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.MOVE_STMT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.MOVE_STMT__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveStmtAccess().getVarDeclarationIDTerminalRuleCall_1_0_1(), semanticObject.eGet(GraphPackage.Literals.MOVE_STMT__VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns MulOrDiv
	 *     Or returns MulOrDiv
	 *     Or.Or_1_0 returns MulOrDiv
	 *     And returns MulOrDiv
	 *     And.And_1_0 returns MulOrDiv
	 *     PathExistence returns MulOrDiv
	 *     PathExistence.PathExistence_1_0 returns MulOrDiv
	 *     Comparison returns MulOrDiv
	 *     Comparison.Comparison_1_0 returns MulOrDiv
	 *     PlusOrMinus returns MulOrDiv
	 *     PlusOrMinus.PlusOrMin_1_0 returns MulOrDiv
	 *     MulOrDiv returns MulOrDiv
	 *     MulOrDiv.MulOrDiv_1_0 returns MulOrDiv
	 *     Primary returns MulOrDiv
	 *
	 * Constraint:
	 *     (left=MulOrDiv_MulOrDiv_1_0 (op='*' | op='/') right=Primary)
	 */
	protected void sequence_MulOrDiv(ISerializationContext context, MulOrDiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns Or
	 *     Or returns Or
	 *     Or.Or_1_0 returns Or
	 *     And returns Or
	 *     And.And_1_0 returns Or
	 *     PathExistence returns Or
	 *     PathExistence.PathExistence_1_0 returns Or
	 *     Comparison returns Or
	 *     Comparison.Comparison_1_0 returns Or
	 *     PlusOrMinus returns Or
	 *     PlusOrMinus.PlusOrMin_1_0 returns Or
	 *     MulOrDiv returns Or
	 *     MulOrDiv.MulOrDiv_1_0 returns Or
	 *     Primary returns Or
	 *
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns ParticleConstant
	 *     Or returns ParticleConstant
	 *     Or.Or_1_0 returns ParticleConstant
	 *     And returns ParticleConstant
	 *     And.And_1_0 returns ParticleConstant
	 *     PathExistence returns ParticleConstant
	 *     PathExistence.PathExistence_1_0 returns ParticleConstant
	 *     Comparison returns ParticleConstant
	 *     Comparison.Comparison_1_0 returns ParticleConstant
	 *     PlusOrMinus returns ParticleConstant
	 *     PlusOrMinus.PlusOrMin_1_0 returns ParticleConstant
	 *     MulOrDiv returns ParticleConstant
	 *     MulOrDiv.MulOrDiv_1_0 returns ParticleConstant
	 *     Primary returns ParticleConstant
	 *     Particle returns ParticleConstant
	 *
	 * Constraint:
	 *     (graph=Expr vertex=[Vertex|ID])
	 */
	protected void sequence_Particle(ISerializationContext context, ParticleConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.PARTICLE_CONSTANT__GRAPH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.PARTICLE_CONSTANT__GRAPH));
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.PARTICLE_CONSTANT__VERTEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.PARTICLE_CONSTANT__VERTEX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParticleAccess().getGraphExprParserRuleCall_3_0(), semanticObject.getGraph());
		feeder.accept(grammarAccess.getParticleAccess().getVertexVertexIDTerminalRuleCall_5_0_1(), semanticObject.eGet(GraphPackage.Literals.PARTICLE_CONSTANT__VERTEX, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns PathExistence
	 *     Or returns PathExistence
	 *     Or.Or_1_0 returns PathExistence
	 *     And returns PathExistence
	 *     And.And_1_0 returns PathExistence
	 *     PathExistence returns PathExistence
	 *     PathExistence.PathExistence_1_0 returns PathExistence
	 *     Comparison returns PathExistence
	 *     Comparison.Comparison_1_0 returns PathExistence
	 *     PlusOrMinus returns PathExistence
	 *     PlusOrMinus.PlusOrMin_1_0 returns PathExistence
	 *     MulOrDiv returns PathExistence
	 *     MulOrDiv.MulOrDiv_1_0 returns PathExistence
	 *     Primary returns PathExistence
	 *
	 * Constraint:
	 *     (left=PathExistence_PathExistence_1_0 right=Comparison)
	 */
	protected void sequence_PathExistence(ISerializationContext context, PathExistence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.PATH_EXISTENCE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.PATH_EXISTENCE__LEFT));
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.PATH_EXISTENCE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.PATH_EXISTENCE__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPathExistenceAccess().getPathExistenceLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPathExistenceAccess().getRightComparisonParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns PlusOrMin
	 *     Or returns PlusOrMin
	 *     Or.Or_1_0 returns PlusOrMin
	 *     And returns PlusOrMin
	 *     And.And_1_0 returns PlusOrMin
	 *     PathExistence returns PlusOrMin
	 *     PathExistence.PathExistence_1_0 returns PlusOrMin
	 *     Comparison returns PlusOrMin
	 *     Comparison.Comparison_1_0 returns PlusOrMin
	 *     PlusOrMinus returns PlusOrMin
	 *     PlusOrMinus.PlusOrMin_1_0 returns PlusOrMin
	 *     MulOrDiv returns PlusOrMin
	 *     MulOrDiv.MulOrDiv_1_0 returns PlusOrMin
	 *     Primary returns PlusOrMin
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_PlusOrMin_1_0 (op='+' | op='-') right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(ISerializationContext context, PlusOrMin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns Not
	 *     Or returns Not
	 *     Or.Or_1_0 returns Not
	 *     And returns Not
	 *     And.And_1_0 returns Not
	 *     PathExistence returns Not
	 *     PathExistence.PathExistence_1_0 returns Not
	 *     Comparison returns Not
	 *     Comparison.Comparison_1_0 returns Not
	 *     PlusOrMinus returns Not
	 *     PlusOrMinus.PlusOrMin_1_0 returns Not
	 *     MulOrDiv returns Not
	 *     MulOrDiv.MulOrDiv_1_0 returns Not
	 *     Primary returns Not
	 *
	 * Constraint:
	 *     Expr=Primary
	 */
	protected void sequence_Primary(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.NOT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.NOT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getExprPrimaryParserRuleCall_1_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns PrintStmt
	 *     PrintStmt returns PrintStmt
	 *
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_PrintStmt(ISerializationContext context, PrintStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.PRINT_STMT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.PRINT_STMT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrintStmtAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (declarations+=Declaration* stmts+=Statement*)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Vertex returns Vertex
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Vertex(ISerializationContext context, Vertex semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphPackage.Literals.VERTEX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.VERTEX__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVertexAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns WhileStmt
	 *     WhileStmt returns WhileStmt
	 *
	 * Constraint:
	 *     (expr=Expr stmts+=Statement*)
	 */
	protected void sequence_WhileStmt(ISerializationContext context, WhileStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}