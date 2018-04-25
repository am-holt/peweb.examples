/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.arithmetic.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ArithmeticGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.Module");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cImportsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportsImportParserRuleCall_2_0 = (RuleCall)cImportsAssignment_2.eContents().get(0);
		private final Assignment cStatementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStatementsStatementParserRuleCall_3_0 = (RuleCall)cStatementsAssignment_3.eContents().get(0);
		
		//Module:
		//	'module' name=ID
		//	imports+=Import*
		//	statements+=Statement*;
		@Override public ParserRule getRule() { return rule; }
		
		//'module' name=ID imports+=Import* statements+=Statement*
		public Group getGroup() { return cGroup; }
		
		//'module'
		public Keyword getModuleKeyword_0() { return cModuleKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//imports+=Import*
		public Assignment getImportsAssignment_2() { return cImportsAssignment_2; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_2_0() { return cImportsImportParserRuleCall_2_0; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_3() { return cStatementsAssignment_3; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_3_0() { return cStatementsStatementParserRuleCall_3_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cModuleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cModuleModuleCrossReference_1_0 = (CrossReference)cModuleAssignment_1.eContents().get(0);
		private final RuleCall cModuleModuleIDTerminalRuleCall_1_0_1 = (RuleCall)cModuleModuleCrossReference_1_0.eContents().get(1);
		
		//Import:
		//	'import' module=[Module];
		@Override public ParserRule getRule() { return rule; }
		
		//'import' module=[Module]
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//module=[Module]
		public Assignment getModuleAssignment_1() { return cModuleAssignment_1; }
		
		//[Module]
		public CrossReference getModuleModuleCrossReference_1_0() { return cModuleModuleCrossReference_1_0; }
		
		//ID
		public RuleCall getModuleModuleIDTerminalRuleCall_1_0_1() { return cModuleModuleIDTerminalRuleCall_1_0_1; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEvaluationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Statement:
		//	Definition | Evaluation;
		@Override public ParserRule getRule() { return rule; }
		
		//Definition | Evaluation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Definition
		public RuleCall getDefinitionParserRuleCall_0() { return cDefinitionParserRuleCall_0; }
		
		//Evaluation
		public RuleCall getEvaluationParserRuleCall_1() { return cEvaluationParserRuleCall_1; }
	}
	public class DefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.Definition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cArgsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cArgsDeclaredParameterParserRuleCall_2_1_0 = (RuleCall)cArgsAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cArgsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cArgsDeclaredParameterParserRuleCall_2_2_1_0 = (RuleCall)cArgsAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cExprAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cExprExpressionParserRuleCall_4_0 = (RuleCall)cExprAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Definition:
		//	'def' name=ID ('(' args+=DeclaredParameter (',' args+=DeclaredParameter)* ')')?
		//	':' expr=Expression ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'def' name=ID ('(' args+=DeclaredParameter (',' args+=DeclaredParameter)* ')')? ':' expr=Expression ';'
		public Group getGroup() { return cGroup; }
		
		//'def'
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('(' args+=DeclaredParameter (',' args+=DeclaredParameter)* ')')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//args+=DeclaredParameter
		public Assignment getArgsAssignment_2_1() { return cArgsAssignment_2_1; }
		
		//DeclaredParameter
		public RuleCall getArgsDeclaredParameterParserRuleCall_2_1_0() { return cArgsDeclaredParameterParserRuleCall_2_1_0; }
		
		//(',' args+=DeclaredParameter)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//args+=DeclaredParameter
		public Assignment getArgsAssignment_2_2_1() { return cArgsAssignment_2_2_1; }
		
		//DeclaredParameter
		public RuleCall getArgsDeclaredParameterParserRuleCall_2_2_1_0() { return cArgsDeclaredParameterParserRuleCall_2_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//expr=Expression
		public Assignment getExprAssignment_4() { return cExprAssignment_4; }
		
		//Expression
		public RuleCall getExprExpressionParserRuleCall_4_0() { return cExprExpressionParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class DeclaredParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.DeclaredParameter");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//DeclaredParameter:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class AbstractDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.AbstractDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDeclaredParameterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractDefinition:
		//	Definition | DeclaredParameter;
		@Override public ParserRule getRule() { return rule; }
		
		//Definition | DeclaredParameter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Definition
		public RuleCall getDefinitionParserRuleCall_0() { return cDefinitionParserRuleCall_0; }
		
		//DeclaredParameter
		public RuleCall getDeclaredParameterParserRuleCall_1() { return cDeclaredParameterParserRuleCall_1; }
	}
	public class EvaluationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.Evaluation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpressionExpressionParserRuleCall_0_0 = (RuleCall)cExpressionAssignment_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Evaluation:
		//	expression=Expression ';';
		@Override public ParserRule getRule() { return rule; }
		
		//expression=Expression ';'
		public Group getGroup() { return cGroup; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_0() { return cExpressionAssignment_0; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_0_0() { return cExpressionExpressionParserRuleCall_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.Expression");
		private final RuleCall cAdditionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expression:
		//	Addition;
		@Override public ParserRule getRule() { return rule; }
		
		//Addition
		public RuleCall getAdditionParserRuleCall() { return cAdditionParserRuleCall; }
	}
	public class AdditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.Addition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cMinusLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightMultiplicationParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Addition Expression:
		//	Multiplication (({Plus.left=current} '+' | {Minus.left=current} '-') right=Multiplication)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Multiplication (({Plus.left=current} '+' | {Minus.left=current} '-') right=Multiplication)*
		public Group getGroup() { return cGroup; }
		
		//Multiplication
		public RuleCall getMultiplicationParserRuleCall_0() { return cMultiplicationParserRuleCall_0; }
		
		//(({Plus.left=current} '+' | {Minus.left=current} '-') right=Multiplication)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Plus.left=current} '+' | {Minus.left=current} '-'
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Plus.left=current} '+'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0_0() { return cPlusLeftAction_1_0_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0_1() { return cPlusSignKeyword_1_0_0_1; }
		
		//{Minus.left=current} '-'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_0_1_0() { return cMinusLeftAction_1_0_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1_1() { return cHyphenMinusKeyword_1_0_1_1; }
		
		//right=Multiplication
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Multiplication
		public RuleCall getRightMultiplicationParserRuleCall_1_1_0() { return cRightMultiplicationParserRuleCall_1_1_0; }
	}
	public class MultiplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.Multiplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cMultiLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cDivLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPrimaryExpressionParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Multiplication Expression:
		//	PrimaryExpression (({Multi.left=current} '*' | {Div.left=current} '/') right=PrimaryExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//PrimaryExpression (({Multi.left=current} '*' | {Div.left=current} '/') right=PrimaryExpression)*
		public Group getGroup() { return cGroup; }
		
		//PrimaryExpression
		public RuleCall getPrimaryExpressionParserRuleCall_0() { return cPrimaryExpressionParserRuleCall_0; }
		
		//(({Multi.left=current} '*' | {Div.left=current} '/') right=PrimaryExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Multi.left=current} '*' | {Div.left=current} '/'
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Multi.left=current} '*'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Multi.left=current}
		public Action getMultiLeftAction_1_0_0_0() { return cMultiLeftAction_1_0_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_0_1() { return cAsteriskKeyword_1_0_0_1; }
		
		//{Div.left=current} '/'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Div.left=current}
		public Action getDivLeftAction_1_0_1_0() { return cDivLeftAction_1_0_1_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_0_1_1() { return cSolidusKeyword_1_0_1_1; }
		
		//right=PrimaryExpression
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//PrimaryExpression
		public RuleCall getRightPrimaryExpressionParserRuleCall_1_1_0() { return cRightPrimaryExpressionParserRuleCall_1_1_0; }
	}
	public class SumExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.SumExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIndexVariableAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIndexVariableDeclaredParameterParserRuleCall_1_0 = (RuleCall)cIndexVariableAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLowerAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLowerINTTerminalRuleCall_3_0 = (RuleCall)cLowerAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cUpperAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cUpperINTTerminalRuleCall_5_0 = (RuleCall)cUpperAssignment_5.eContents().get(0);
		private final Keyword cCommaKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cExprAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cExprExpressionParserRuleCall_7_0 = (RuleCall)cExprAssignment_7.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//SumExpression:
		//	'sum(' indexVariable=DeclaredParameter ',' lower=INT ',' upper=INT ',' expr=Expression ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'sum(' indexVariable=DeclaredParameter ',' lower=INT ',' upper=INT ',' expr=Expression ')'
		public Group getGroup() { return cGroup; }
		
		//'sum('
		public Keyword getSumKeyword_0() { return cSumKeyword_0; }
		
		//indexVariable=DeclaredParameter
		public Assignment getIndexVariableAssignment_1() { return cIndexVariableAssignment_1; }
		
		//DeclaredParameter
		public RuleCall getIndexVariableDeclaredParameterParserRuleCall_1_0() { return cIndexVariableDeclaredParameterParserRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//lower=INT
		public Assignment getLowerAssignment_3() { return cLowerAssignment_3; }
		
		//INT
		public RuleCall getLowerINTTerminalRuleCall_3_0() { return cLowerINTTerminalRuleCall_3_0; }
		
		//','
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
		
		//upper=INT
		public Assignment getUpperAssignment_5() { return cUpperAssignment_5; }
		
		//INT
		public RuleCall getUpperINTTerminalRuleCall_5_0() { return cUpperINTTerminalRuleCall_5_0; }
		
		//','
		public Keyword getCommaKeyword_6() { return cCommaKeyword_6; }
		
		//expr=Expression
		public Assignment getExprAssignment_7() { return cExprAssignment_7; }
		
		//Expression
		public RuleCall getExprExpressionParserRuleCall_7_0() { return cExprExpressionParserRuleCall_7_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_8() { return cRightParenthesisKeyword_8; }
	}
	public class PrimaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ox.xtext.peweb.arithmetic.Arithmetic.PrimaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSumExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cNumberLiteralAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cFunctionCallAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Assignment cFuncAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cFuncAbstractDefinitionCrossReference_3_1_0 = (CrossReference)cFuncAssignment_3_1.eContents().get(0);
		private final RuleCall cFuncAbstractDefinitionIDTerminalRuleCall_3_1_0_1 = (RuleCall)cFuncAbstractDefinitionCrossReference_3_1_0.eContents().get(1);
		
		//PrimaryExpression Expression:
		//	SumExpression |
		//	'(' Expression ')' | {NumberLiteral} value=INT | {FunctionCall} func=[AbstractDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//SumExpression | '(' Expression ')' | {NumberLiteral} value=INT | {FunctionCall} func=[AbstractDefinition]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SumExpression
		public RuleCall getSumExpressionParserRuleCall_0() { return cSumExpressionParserRuleCall_0; }
		
		//'(' Expression ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_1_1() { return cExpressionParserRuleCall_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
		
		//{NumberLiteral} value=INT
		public Group getGroup_2() { return cGroup_2; }
		
		//{NumberLiteral}
		public Action getNumberLiteralAction_2_0() { return cNumberLiteralAction_2_0; }
		
		//value=INT
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_2_1_0() { return cValueINTTerminalRuleCall_2_1_0; }
		
		//{FunctionCall} func=[AbstractDefinition]
		public Group getGroup_3() { return cGroup_3; }
		
		//{FunctionCall}
		public Action getFunctionCallAction_3_0() { return cFunctionCallAction_3_0; }
		
		//func=[AbstractDefinition]
		public Assignment getFuncAssignment_3_1() { return cFuncAssignment_3_1; }
		
		//[AbstractDefinition]
		public CrossReference getFuncAbstractDefinitionCrossReference_3_1_0() { return cFuncAbstractDefinitionCrossReference_3_1_0; }
		
		//ID
		public RuleCall getFuncAbstractDefinitionIDTerminalRuleCall_3_1_0_1() { return cFuncAbstractDefinitionIDTerminalRuleCall_3_1_0_1; }
	}
	
	
	private final ModuleElements pModule;
	private final ImportElements pImport;
	private final StatementElements pStatement;
	private final DefinitionElements pDefinition;
	private final DeclaredParameterElements pDeclaredParameter;
	private final AbstractDefinitionElements pAbstractDefinition;
	private final EvaluationElements pEvaluation;
	private final ExpressionElements pExpression;
	private final AdditionElements pAddition;
	private final MultiplicationElements pMultiplication;
	private final SumExpressionElements pSumExpression;
	private final PrimaryExpressionElements pPrimaryExpression;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ArithmeticGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModule = new ModuleElements();
		this.pImport = new ImportElements();
		this.pStatement = new StatementElements();
		this.pDefinition = new DefinitionElements();
		this.pDeclaredParameter = new DeclaredParameterElements();
		this.pAbstractDefinition = new AbstractDefinitionElements();
		this.pEvaluation = new EvaluationElements();
		this.pExpression = new ExpressionElements();
		this.pAddition = new AdditionElements();
		this.pMultiplication = new MultiplicationElements();
		this.pSumExpression = new SumExpressionElements();
		this.pPrimaryExpression = new PrimaryExpressionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("ox.xtext.peweb.arithmetic.Arithmetic".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Module:
	//	'module' name=ID
	//	imports+=Import*
	//	statements+=Statement*;
	public ModuleElements getModuleAccess() {
		return pModule;
	}
	
	public ParserRule getModuleRule() {
		return getModuleAccess().getRule();
	}
	
	//Import:
	//	'import' module=[Module];
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//Statement:
	//	Definition | Evaluation;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Definition:
	//	'def' name=ID ('(' args+=DeclaredParameter (',' args+=DeclaredParameter)* ')')?
	//	':' expr=Expression ';';
	public DefinitionElements getDefinitionAccess() {
		return pDefinition;
	}
	
	public ParserRule getDefinitionRule() {
		return getDefinitionAccess().getRule();
	}
	
	//DeclaredParameter:
	//	name=ID;
	public DeclaredParameterElements getDeclaredParameterAccess() {
		return pDeclaredParameter;
	}
	
	public ParserRule getDeclaredParameterRule() {
		return getDeclaredParameterAccess().getRule();
	}
	
	//AbstractDefinition:
	//	Definition | DeclaredParameter;
	public AbstractDefinitionElements getAbstractDefinitionAccess() {
		return pAbstractDefinition;
	}
	
	public ParserRule getAbstractDefinitionRule() {
		return getAbstractDefinitionAccess().getRule();
	}
	
	//Evaluation:
	//	expression=Expression ';';
	public EvaluationElements getEvaluationAccess() {
		return pEvaluation;
	}
	
	public ParserRule getEvaluationRule() {
		return getEvaluationAccess().getRule();
	}
	
	//Expression:
	//	Addition;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Addition Expression:
	//	Multiplication (({Plus.left=current} '+' | {Minus.left=current} '-') right=Multiplication)*;
	public AdditionElements getAdditionAccess() {
		return pAddition;
	}
	
	public ParserRule getAdditionRule() {
		return getAdditionAccess().getRule();
	}
	
	//Multiplication Expression:
	//	PrimaryExpression (({Multi.left=current} '*' | {Div.left=current} '/') right=PrimaryExpression)*;
	public MultiplicationElements getMultiplicationAccess() {
		return pMultiplication;
	}
	
	public ParserRule getMultiplicationRule() {
		return getMultiplicationAccess().getRule();
	}
	
	//SumExpression:
	//	'sum(' indexVariable=DeclaredParameter ',' lower=INT ',' upper=INT ',' expr=Expression ')';
	public SumExpressionElements getSumExpressionAccess() {
		return pSumExpression;
	}
	
	public ParserRule getSumExpressionRule() {
		return getSumExpressionAccess().getRule();
	}
	
	//PrimaryExpression Expression:
	//	SumExpression |
	//	'(' Expression ')' | {NumberLiteral} value=INT | {FunctionCall} func=[AbstractDefinition];
	public PrimaryExpressionElements getPrimaryExpressionAccess() {
		return pPrimaryExpression;
	}
	
	public ParserRule getPrimaryExpressionRule() {
		return getPrimaryExpressionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
