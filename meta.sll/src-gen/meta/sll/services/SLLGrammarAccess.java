/*
* generated by Xtext
*/
package meta.sll.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SLLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Program");
		private final Assignment cDefsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDefsDefinitionParserRuleCall_0 = (RuleCall)cDefsAssignment.eContents().get(0);
		
		//Program:
		//	defs+=Definition*;
		public ParserRule getRule() { return rule; }

		//defs+=Definition*
		public Assignment getDefsAssignment() { return cDefsAssignment; }

		//Definition
		public RuleCall getDefsDefinitionParserRuleCall_0() { return cDefsDefinitionParserRuleCall_0; }
	}

	public class DefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Definition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGDefinitionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Definition:
		//	FDefinition | GDefinition;
		public ParserRule getRule() { return rule; }

		//FDefinition | GDefinition
		public Alternatives getAlternatives() { return cAlternatives; }

		//FDefinition
		public RuleCall getFDefinitionParserRuleCall_0() { return cFDefinitionParserRuleCall_0; }

		//GDefinition
		public RuleCall getGDefinitionParserRuleCall_1() { return cGDefinitionParserRuleCall_1; }
	}

	public class FDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameFIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cParamsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cParamsLIDTerminalRuleCall_2_0_0 = (RuleCall)cParamsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cParamsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cParamsLIDTerminalRuleCall_2_1_1_0 = (RuleCall)cParamsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBodyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBodyExpressionParserRuleCall_5_0 = (RuleCall)cBodyAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//FDefinition:
		//	name=FID "(" (params+=LID ("," params+=LID)*)? ")" "=" body=Expression ";";
		public ParserRule getRule() { return rule; }

		//name=FID "(" (params+=LID ("," params+=LID)*)? ")" "=" body=Expression ";"
		public Group getGroup() { return cGroup; }

		//name=FID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//FID
		public RuleCall getNameFIDTerminalRuleCall_0_0() { return cNameFIDTerminalRuleCall_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//(params+=LID ("," params+=LID)*)?
		public Group getGroup_2() { return cGroup_2; }

		//params+=LID
		public Assignment getParamsAssignment_2_0() { return cParamsAssignment_2_0; }

		//LID
		public RuleCall getParamsLIDTerminalRuleCall_2_0_0() { return cParamsLIDTerminalRuleCall_2_0_0; }

		//("," params+=LID)*
		public Group getGroup_2_1() { return cGroup_2_1; }

		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }

		//params+=LID
		public Assignment getParamsAssignment_2_1_1() { return cParamsAssignment_2_1_1; }

		//LID
		public RuleCall getParamsLIDTerminalRuleCall_2_1_1_0() { return cParamsLIDTerminalRuleCall_2_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//"="
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }

		//body=Expression
		public Assignment getBodyAssignment_5() { return cBodyAssignment_5; }

		//Expression
		public RuleCall getBodyExpressionParserRuleCall_5_0() { return cBodyExpressionParserRuleCall_5_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class GDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameGIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cPatternAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cPatternPatternParserRuleCall_2_0_0 = (RuleCall)cPatternAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cParamsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cParamsLIDTerminalRuleCall_2_1_1_0 = (RuleCall)cParamsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBodyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBodyExpressionParserRuleCall_5_0 = (RuleCall)cBodyAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//GDefinition:
		//	name=GID "(" (pattern=Pattern ("," params+=LID)*)? ")" "=" body=Expression ";";
		public ParserRule getRule() { return rule; }

		//name=GID "(" (pattern=Pattern ("," params+=LID)*)? ")" "=" body=Expression ";"
		public Group getGroup() { return cGroup; }

		//name=GID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//GID
		public RuleCall getNameGIDTerminalRuleCall_0_0() { return cNameGIDTerminalRuleCall_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//(pattern=Pattern ("," params+=LID)*)?
		public Group getGroup_2() { return cGroup_2; }

		//pattern=Pattern
		public Assignment getPatternAssignment_2_0() { return cPatternAssignment_2_0; }

		//Pattern
		public RuleCall getPatternPatternParserRuleCall_2_0_0() { return cPatternPatternParserRuleCall_2_0_0; }

		//("," params+=LID)*
		public Group getGroup_2_1() { return cGroup_2_1; }

		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }

		//params+=LID
		public Assignment getParamsAssignment_2_1_1() { return cParamsAssignment_2_1_1; }

		//LID
		public RuleCall getParamsLIDTerminalRuleCall_2_1_1_0() { return cParamsLIDTerminalRuleCall_2_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//"="
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }

		//body=Expression
		public Assignment getBodyAssignment_5() { return cBodyAssignment_5; }

		//Expression
		public RuleCall getBodyExpressionParserRuleCall_5_0() { return cBodyExpressionParserRuleCall_5_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class PatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Pattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameUIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cArgsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cArgsLIDTerminalRuleCall_2_0_0 = (RuleCall)cArgsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cArgsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cArgsLIDTerminalRuleCall_2_1_1_0 = (RuleCall)cArgsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Pattern:
		//	name=UID "(" (args+=LID ("," args+=LID)*)? ")";
		public ParserRule getRule() { return rule; }

		//name=UID "(" (args+=LID ("," args+=LID)*)? ")"
		public Group getGroup() { return cGroup; }

		//name=UID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//UID
		public RuleCall getNameUIDTerminalRuleCall_0_0() { return cNameUIDTerminalRuleCall_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//(args+=LID ("," args+=LID)*)?
		public Group getGroup_2() { return cGroup_2; }

		//args+=LID
		public Assignment getArgsAssignment_2_0() { return cArgsAssignment_2_0; }

		//LID
		public RuleCall getArgsLIDTerminalRuleCall_2_0_0() { return cArgsLIDTerminalRuleCall_2_0_0; }

		//("," args+=LID)*
		public Group getGroup_2_1() { return cGroup_2_1; }

		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }

		//args+=LID
		public Assignment getArgsAssignment_2_1_1() { return cArgsAssignment_2_1_1; }

		//LID
		public RuleCall getArgsLIDTerminalRuleCall_2_1_1_0() { return cArgsLIDTerminalRuleCall_2_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFCallParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGCallParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCtrParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cVarParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Expression:
		//	FCall | GCall | Ctr | Var;
		public ParserRule getRule() { return rule; }

		//FCall | GCall | Ctr | Var
		public Alternatives getAlternatives() { return cAlternatives; }

		//FCall
		public RuleCall getFCallParserRuleCall_0() { return cFCallParserRuleCall_0; }

		//GCall
		public RuleCall getGCallParserRuleCall_1() { return cGCallParserRuleCall_1; }

		//Ctr
		public RuleCall getCtrParserRuleCall_2() { return cCtrParserRuleCall_2; }

		//Var
		public RuleCall getVarParserRuleCall_3() { return cVarParserRuleCall_3; }
	}

	public class FCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameFIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cArgsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cArgsExpressionParserRuleCall_2_0_0 = (RuleCall)cArgsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cArgsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cArgsExpressionParserRuleCall_2_1_1_0 = (RuleCall)cArgsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FCall:
		//	name=FID "(" (args+=Expression ("," args+=Expression)*)? ")";
		public ParserRule getRule() { return rule; }

		//name=FID "(" (args+=Expression ("," args+=Expression)*)? ")"
		public Group getGroup() { return cGroup; }

		//name=FID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//FID
		public RuleCall getNameFIDTerminalRuleCall_0_0() { return cNameFIDTerminalRuleCall_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//(args+=Expression ("," args+=Expression)*)?
		public Group getGroup_2() { return cGroup_2; }

		//args+=Expression
		public Assignment getArgsAssignment_2_0() { return cArgsAssignment_2_0; }

		//Expression
		public RuleCall getArgsExpressionParserRuleCall_2_0_0() { return cArgsExpressionParserRuleCall_2_0_0; }

		//("," args+=Expression)*
		public Group getGroup_2_1() { return cGroup_2_1; }

		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }

		//args+=Expression
		public Assignment getArgsAssignment_2_1_1() { return cArgsAssignment_2_1_1; }

		//Expression
		public RuleCall getArgsExpressionParserRuleCall_2_1_1_0() { return cArgsExpressionParserRuleCall_2_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class GCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameGIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cArgsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cArgsExpressionParserRuleCall_2_0_0 = (RuleCall)cArgsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cArgsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cArgsExpressionParserRuleCall_2_1_1_0 = (RuleCall)cArgsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//GCall:
		//	name=GID "(" (args+=Expression ("," args+=Expression)*)? ")";
		public ParserRule getRule() { return rule; }

		//name=GID "(" (args+=Expression ("," args+=Expression)*)? ")"
		public Group getGroup() { return cGroup; }

		//name=GID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//GID
		public RuleCall getNameGIDTerminalRuleCall_0_0() { return cNameGIDTerminalRuleCall_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//(args+=Expression ("," args+=Expression)*)?
		public Group getGroup_2() { return cGroup_2; }

		//args+=Expression
		public Assignment getArgsAssignment_2_0() { return cArgsAssignment_2_0; }

		//Expression
		public RuleCall getArgsExpressionParserRuleCall_2_0_0() { return cArgsExpressionParserRuleCall_2_0_0; }

		//("," args+=Expression)*
		public Group getGroup_2_1() { return cGroup_2_1; }

		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }

		//args+=Expression
		public Assignment getArgsAssignment_2_1_1() { return cArgsAssignment_2_1_1; }

		//Expression
		public RuleCall getArgsExpressionParserRuleCall_2_1_1_0() { return cArgsExpressionParserRuleCall_2_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class CtrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Ctr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameUIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cArgsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cArgsExpressionParserRuleCall_2_0_0 = (RuleCall)cArgsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cArgsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cArgsExpressionParserRuleCall_2_1_1_0 = (RuleCall)cArgsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Ctr:
		//	name=UID "(" (args+=Expression ("," args+=Expression)*)? ")";
		public ParserRule getRule() { return rule; }

		//name=UID "(" (args+=Expression ("," args+=Expression)*)? ")"
		public Group getGroup() { return cGroup; }

		//name=UID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//UID
		public RuleCall getNameUIDTerminalRuleCall_0_0() { return cNameUIDTerminalRuleCall_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//(args+=Expression ("," args+=Expression)*)?
		public Group getGroup_2() { return cGroup_2; }

		//args+=Expression
		public Assignment getArgsAssignment_2_0() { return cArgsAssignment_2_0; }

		//Expression
		public RuleCall getArgsExpressionParserRuleCall_2_0_0() { return cArgsExpressionParserRuleCall_2_0_0; }

		//("," args+=Expression)*
		public Group getGroup_2_1() { return cGroup_2_1; }

		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }

		//args+=Expression
		public Assignment getArgsAssignment_2_1_1() { return cArgsAssignment_2_1_1; }

		//Expression
		public RuleCall getArgsExpressionParserRuleCall_2_1_1_0() { return cArgsExpressionParserRuleCall_2_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class VarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Var");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameLIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Var:
		//	name=LID;
		public ParserRule getRule() { return rule; }

		//name=LID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//LID
		public RuleCall getNameLIDTerminalRuleCall_0() { return cNameLIDTerminalRuleCall_0; }
	}
	
	
	private ProgramElements pProgram;
	private DefinitionElements pDefinition;
	private FDefinitionElements pFDefinition;
	private GDefinitionElements pGDefinition;
	private PatternElements pPattern;
	private ExpressionElements pExpression;
	private FCallElements pFCall;
	private GCallElements pGCall;
	private CtrElements pCtr;
	private VarElements pVar;
	private TerminalRule tFID;
	private TerminalRule tGID;
	private TerminalRule tLID;
	private TerminalRule tUID;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SLLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("meta.sll.SLL".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program:
	//	defs+=Definition*;
	public ProgramElements getProgramAccess() {
		return (pProgram != null) ? pProgram : (pProgram = new ProgramElements());
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}

	//Definition:
	//	FDefinition | GDefinition;
	public DefinitionElements getDefinitionAccess() {
		return (pDefinition != null) ? pDefinition : (pDefinition = new DefinitionElements());
	}
	
	public ParserRule getDefinitionRule() {
		return getDefinitionAccess().getRule();
	}

	//FDefinition:
	//	name=FID "(" (params+=LID ("," params+=LID)*)? ")" "=" body=Expression ";";
	public FDefinitionElements getFDefinitionAccess() {
		return (pFDefinition != null) ? pFDefinition : (pFDefinition = new FDefinitionElements());
	}
	
	public ParserRule getFDefinitionRule() {
		return getFDefinitionAccess().getRule();
	}

	//GDefinition:
	//	name=GID "(" (pattern=Pattern ("," params+=LID)*)? ")" "=" body=Expression ";";
	public GDefinitionElements getGDefinitionAccess() {
		return (pGDefinition != null) ? pGDefinition : (pGDefinition = new GDefinitionElements());
	}
	
	public ParserRule getGDefinitionRule() {
		return getGDefinitionAccess().getRule();
	}

	//Pattern:
	//	name=UID "(" (args+=LID ("," args+=LID)*)? ")";
	public PatternElements getPatternAccess() {
		return (pPattern != null) ? pPattern : (pPattern = new PatternElements());
	}
	
	public ParserRule getPatternRule() {
		return getPatternAccess().getRule();
	}

	//Expression:
	//	FCall | GCall | Ctr | Var;
	public ExpressionElements getExpressionAccess() {
		return (pExpression != null) ? pExpression : (pExpression = new ExpressionElements());
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//FCall:
	//	name=FID "(" (args+=Expression ("," args+=Expression)*)? ")";
	public FCallElements getFCallAccess() {
		return (pFCall != null) ? pFCall : (pFCall = new FCallElements());
	}
	
	public ParserRule getFCallRule() {
		return getFCallAccess().getRule();
	}

	//GCall:
	//	name=GID "(" (args+=Expression ("," args+=Expression)*)? ")";
	public GCallElements getGCallAccess() {
		return (pGCall != null) ? pGCall : (pGCall = new GCallElements());
	}
	
	public ParserRule getGCallRule() {
		return getGCallAccess().getRule();
	}

	//Ctr:
	//	name=UID "(" (args+=Expression ("," args+=Expression)*)? ")";
	public CtrElements getCtrAccess() {
		return (pCtr != null) ? pCtr : (pCtr = new CtrElements());
	}
	
	public ParserRule getCtrRule() {
		return getCtrAccess().getRule();
	}

	//Var:
	//	name=LID;
	public VarElements getVarAccess() {
		return (pVar != null) ? pVar : (pVar = new VarElements());
	}
	
	public ParserRule getVarRule() {
		return getVarAccess().getRule();
	}

	//// f-function id
	//terminal FID:
	//	"f" ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getFIDRule() {
		return (tFID != null) ? tFID : (tFID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "FID"));
	} 

	//// g-function id
	//terminal GID:
	//	"g" ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getGIDRule() {
		return (tGID != null) ? tGID : (tGID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "GID"));
	} 

	//// lower-case id
	//terminal LID:
	//	"a".."z" ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getLIDRule() {
		return (tLID != null) ? tLID : (tLID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LID"));
	} 

	//// upper-case id
	//terminal UID:
	//	"A".."Z" ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getUIDRule() {
		return (tUID != null) ? tUID : (tUID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "UID"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
