/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.graph.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import ox.xtext.peweb.graph.ide.contentassist.antlr.internal.InternalGraphParser;
import ox.xtext.peweb.graph.services.GraphGrammarAccess;

public class GraphParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GraphGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GraphGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDeclarationAccess().getTypeAlternatives_3_0(), "rule__Declaration__TypeAlternatives_3_0");
			builder.put(grammarAccess.getStatementAccess().getAlternatives_0(), "rule__Statement__Alternatives_0");
			builder.put(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0(), "rule__Comparison__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getOpAlternatives_1_1_0(), "rule__PlusOrMinus__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0(), "rule__MulOrDiv__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0(), "rule__Atomic__ValueAlternatives_2_1_0");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
			builder.put(grammarAccess.getAssignStmtAccess().getGroup(), "rule__AssignStmt__Group__0");
			builder.put(grammarAccess.getPrintStmtAccess().getGroup(), "rule__PrintStmt__Group__0");
			builder.put(grammarAccess.getIfStmtAccess().getGroup(), "rule__IfStmt__Group__0");
			builder.put(grammarAccess.getIfStmtAccess().getGroup_4(), "rule__IfStmt__Group_4__0");
			builder.put(grammarAccess.getWhileStmtAccess().getGroup(), "rule__WhileStmt__Group__0");
			builder.put(grammarAccess.getMoveStmtAccess().getGroup(), "rule__MoveStmt__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
			builder.put(grammarAccess.getPathExistenceAccess().getGroup(), "rule__PathExistence__Group__0");
			builder.put(grammarAccess.getPathExistenceAccess().getGroup_1(), "rule__PathExistence__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup(), "rule__PlusOrMinus__Group__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1(), "rule__PlusOrMinus__Group_1__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup(), "rule__MulOrDiv__Group__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1(), "rule__MulOrDiv__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
			builder.put(grammarAccess.getGraphAccess().getGroup(), "rule__Graph__Group__0");
			builder.put(grammarAccess.getParticleAccess().getGroup(), "rule__Particle__Group__0");
			builder.put(grammarAccess.getEdgeAccess().getGroup(), "rule__Edge__Group__0");
			builder.put(grammarAccess.getProgramAccess().getDeclarationsAssignment_1(), "rule__Program__DeclarationsAssignment_1");
			builder.put(grammarAccess.getProgramAccess().getStmtsAssignment_3(), "rule__Program__StmtsAssignment_3");
			builder.put(grammarAccess.getDeclarationAccess().getNameAssignment_1(), "rule__Declaration__NameAssignment_1");
			builder.put(grammarAccess.getDeclarationAccess().getTypeAssignment_3(), "rule__Declaration__TypeAssignment_3");
			builder.put(grammarAccess.getAssignStmtAccess().getVarAssignment_0(), "rule__AssignStmt__VarAssignment_0");
			builder.put(grammarAccess.getAssignStmtAccess().getExprAssignment_2(), "rule__AssignStmt__ExprAssignment_2");
			builder.put(grammarAccess.getPrintStmtAccess().getExprAssignment_1(), "rule__PrintStmt__ExprAssignment_1");
			builder.put(grammarAccess.getIfStmtAccess().getExprAssignment_1(), "rule__IfStmt__ExprAssignment_1");
			builder.put(grammarAccess.getIfStmtAccess().getStmtsAssignment_3(), "rule__IfStmt__StmtsAssignment_3");
			builder.put(grammarAccess.getIfStmtAccess().getElseStmtsAssignment_4_1(), "rule__IfStmt__ElseStmtsAssignment_4_1");
			builder.put(grammarAccess.getWhileStmtAccess().getExprAssignment_1(), "rule__WhileStmt__ExprAssignment_1");
			builder.put(grammarAccess.getWhileStmtAccess().getStmtsAssignment_3(), "rule__WhileStmt__StmtsAssignment_3");
			builder.put(grammarAccess.getMoveStmtAccess().getVarAssignment_1(), "rule__MoveStmt__VarAssignment_1");
			builder.put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
			builder.put(grammarAccess.getPathExistenceAccess().getRightAssignment_1_2(), "rule__PathExistence__RightAssignment_1_2");
			builder.put(grammarAccess.getComparisonAccess().getOpAssignment_1_1(), "rule__Comparison__OpAssignment_1_1");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
			builder.put(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_1(), "rule__PlusOrMinus__OpAssignment_1_1");
			builder.put(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_2(), "rule__PlusOrMinus__RightAssignment_1_2");
			builder.put(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1(), "rule__MulOrDiv__OpAssignment_1_1");
			builder.put(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2(), "rule__MulOrDiv__RightAssignment_1_2");
			builder.put(grammarAccess.getPrimaryAccess().getExprAssignment_1_2(), "rule__Primary__ExprAssignment_1_2");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
			builder.put(grammarAccess.getAtomicAccess().getVariableAssignment_3_1(), "rule__Atomic__VariableAssignment_3_1");
			builder.put(grammarAccess.getGraphAccess().getVerticesAssignment_4(), "rule__Graph__VerticesAssignment_4");
			builder.put(grammarAccess.getGraphAccess().getEdgesAssignment_8(), "rule__Graph__EdgesAssignment_8");
			builder.put(grammarAccess.getParticleAccess().getGraphAssignment_3(), "rule__Particle__GraphAssignment_3");
			builder.put(grammarAccess.getParticleAccess().getVertexAssignment_5(), "rule__Particle__VertexAssignment_5");
			builder.put(grammarAccess.getVertexAccess().getNameAssignment(), "rule__Vertex__NameAssignment");
			builder.put(grammarAccess.getEdgeAccess().getSourceAssignment_0(), "rule__Edge__SourceAssignment_0");
			builder.put(grammarAccess.getEdgeAccess().getDestAssignment_2(), "rule__Edge__DestAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GraphGrammarAccess grammarAccess;

	@Override
	protected InternalGraphParser createParser() {
		InternalGraphParser result = new InternalGraphParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GraphGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GraphGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
