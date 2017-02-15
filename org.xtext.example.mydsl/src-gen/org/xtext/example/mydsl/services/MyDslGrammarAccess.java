/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVariablesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVariablesVariableParserRuleCall_0_0 = (RuleCall)cVariablesAssignment_0.eContents().get(0);
		private final Assignment cStatementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_1_0 = (RuleCall)cStatementsAssignment_1.eContents().get(0);
		private final Assignment cCallsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCallsStatementCallParserRuleCall_2_0 = (RuleCall)cCallsAssignment_2.eContents().get(0);
		
		//Model:
		//	variables+=Variable* statements+=Statement* calls+=StatementCall*;
		@Override public ParserRule getRule() { return rule; }
		
		//variables+=Variable* statements+=Statement* calls+=StatementCall*
		public Group getGroup() { return cGroup; }
		
		//variables+=Variable*
		public Assignment getVariablesAssignment_0() { return cVariablesAssignment_0; }
		
		//Variable
		public RuleCall getVariablesVariableParserRuleCall_0_0() { return cVariablesVariableParserRuleCall_0_0; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_1() { return cStatementsAssignment_1; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_1_0() { return cStatementsStatementParserRuleCall_1_0; }
		
		//calls+=StatementCall*
		public Assignment getCallsAssignment_2() { return cCallsAssignment_2; }
		
		//StatementCall
		public RuleCall getCallsStatementCallParserRuleCall_2_0() { return cCallsStatementCallParserRuleCall_2_0; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Variable:
		//	'let' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'let' name=ID
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class StatementCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.StatementCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStatementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cStatementStatementCrossReference_0_0 = (CrossReference)cStatementAssignment_0.eContents().get(0);
		private final RuleCall cStatementStatementIDTerminalRuleCall_0_0_1 = (RuleCall)cStatementStatementCrossReference_0_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cParameterAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cParameterVariableCrossReference_2_0 = (CrossReference)cParameterAssignment_2.eContents().get(0);
		private final RuleCall cParameterVariableIDTerminalRuleCall_2_0_1 = (RuleCall)cParameterVariableCrossReference_2_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//StatementCall:
		//	statement=[Statement] '(' parameter+=[Variable]* ')';
		@Override public ParserRule getRule() { return rule; }
		
		//statement=[Statement] '(' parameter+=[Variable]* ')'
		public Group getGroup() { return cGroup; }
		
		//statement=[Statement]
		public Assignment getStatementAssignment_0() { return cStatementAssignment_0; }
		
		//[Statement]
		public CrossReference getStatementStatementCrossReference_0_0() { return cStatementStatementCrossReference_0_0; }
		
		//ID
		public RuleCall getStatementStatementIDTerminalRuleCall_0_0_1() { return cStatementStatementIDTerminalRuleCall_0_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//parameter+=[Variable]*
		public Assignment getParameterAssignment_2() { return cParameterAssignment_2; }
		
		//[Variable]
		public CrossReference getParameterVariableCrossReference_2_0() { return cParameterVariableCrossReference_2_0; }
		
		//ID
		public RuleCall getParameterVariableIDTerminalRuleCall_2_0_1() { return cParameterVariableIDTerminalRuleCall_2_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Statement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStatementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterVariableParserRuleCall_3_0 = (RuleCall)cParameterAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Statement:
		//	'Statement' name=ID '(' parameter+=Variable* ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'Statement' name=ID '(' parameter+=Variable* ')'
		public Group getGroup() { return cGroup; }
		
		//'Statement'
		public Keyword getStatementKeyword_0() { return cStatementKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//parameter+=Variable*
		public Assignment getParameterAssignment_3() { return cParameterAssignment_3; }
		
		//Variable
		public RuleCall getParameterVariableParserRuleCall_3_0() { return cParameterVariableParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	
	
	private final ModelElements pModel;
	private final VariableElements pVariable;
	private final StatementCallElements pStatementCall;
	private final StatementElements pStatement;
	private final TerminalRule tID;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pVariable = new VariableElements();
		this.pStatementCall = new StatementCallElements();
		this.pStatement = new StatementElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ID");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
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

	
	//Model:
	//	variables+=Variable* statements+=Statement* calls+=StatementCall*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Variable:
	//	'let' name=ID;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//StatementCall:
	//	statement=[Statement] '(' parameter+=[Variable]* ')';
	public StatementCallElements getStatementCallAccess() {
		return pStatementCall;
	}
	
	public ParserRule getStatementCallRule() {
		return getStatementCallAccess().getRule();
	}
	
	//Statement:
	//	'Statement' name=ID '(' parameter+=Variable* ')';
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '-' | '$') ('a'..'z' | 'A'..'Z' | '-' | '0'..'9')+;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
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
