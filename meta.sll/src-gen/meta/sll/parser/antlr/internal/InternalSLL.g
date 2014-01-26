/*
* generated by Xtext
*/
grammar InternalSLL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package meta.sll.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package meta.sll.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import meta.sll.services.SLLGrammarAccess;

}

@parser::members {

 	private SLLGrammarAccess grammarAccess;
 	
    public InternalSLLParser(TokenStream input, SLLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Program";	
   	}
   	
   	@Override
   	protected SLLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	 iv_ruleProgram=ruleProgram 
	 { $current=$iv_ruleProgram.current; } 
	 EOF 
;

// Rule Program
ruleProgram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getDefsDefinitionParserRuleCall_0()); 
	    }
		lv_defs_0_0=ruleDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		add(
       			$current, 
       			"defs",
        		lv_defs_0_0, 
        		"Definition");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	 iv_ruleDefinition=ruleDefinition 
	 { $current=$iv_ruleDefinition.current; } 
	 EOF 
;

// Rule Definition
ruleDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getDefinitionAccess().getFDefinitionParserRuleCall_0()); 
    }
    this_FDefinition_0=ruleFDefinition
    { 
        $current = $this_FDefinition_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDefinitionAccess().getGDefinitionParserRuleCall_1()); 
    }
    this_GDefinition_1=ruleGDefinition
    { 
        $current = $this_GDefinition_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleFDefinition
entryRuleFDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFDefinitionRule()); }
	 iv_ruleFDefinition=ruleFDefinition 
	 { $current=$iv_ruleFDefinition.current; } 
	 EOF 
;

// Rule FDefinition
ruleFDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_FID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getFDefinitionAccess().getNameFIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"FID");
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFDefinitionAccess().getLeftParenthesisKeyword_1());
    }
((
(
		lv_params_2_0=RULE_LID
		{
			newLeafNode(lv_params_2_0, grammarAccess.getFDefinitionAccess().getParamsLIDTerminalRuleCall_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFDefinitionRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"params",
        		lv_params_2_0, 
        		"LID");
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFDefinitionAccess().getCommaKeyword_2_1_0());
    }
(
(
		lv_params_4_0=RULE_LID
		{
			newLeafNode(lv_params_4_0, grammarAccess.getFDefinitionAccess().getParamsLIDTerminalRuleCall_2_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFDefinitionRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"params",
        		lv_params_4_0, 
        		"LID");
	    }

)
))*)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFDefinitionAccess().getRightParenthesisKeyword_3());
    }
	otherlv_6='=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getFDefinitionAccess().getEqualsSignKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFDefinitionAccess().getBodyExpressionParserRuleCall_5_0()); 
	    }
		lv_body_7_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFDefinitionRule());
	        }
       		set(
       			$current, 
       			"body",
        		lv_body_7_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getFDefinitionAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleGDefinition
entryRuleGDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGDefinitionRule()); }
	 iv_ruleGDefinition=ruleGDefinition 
	 { $current=$iv_ruleGDefinition.current; } 
	 EOF 
;

// Rule GDefinition
ruleGDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_GID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getGDefinitionAccess().getNameGIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"GID");
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getGDefinitionAccess().getLeftParenthesisKeyword_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getGDefinitionAccess().getPatternPatternParserRuleCall_2_0_0()); 
	    }
		lv_pattern_2_0=rulePattern		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGDefinitionRule());
	        }
       		set(
       			$current, 
       			"pattern",
        		lv_pattern_2_0, 
        		"Pattern");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getGDefinitionAccess().getCommaKeyword_2_1_0());
    }
(
(
		lv_params_4_0=RULE_LID
		{
			newLeafNode(lv_params_4_0, grammarAccess.getGDefinitionAccess().getParamsLIDTerminalRuleCall_2_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGDefinitionRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"params",
        		lv_params_4_0, 
        		"LID");
	    }

)
))*)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getGDefinitionAccess().getRightParenthesisKeyword_3());
    }
	otherlv_6='=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getGDefinitionAccess().getEqualsSignKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGDefinitionAccess().getBodyExpressionParserRuleCall_5_0()); 
	    }
		lv_body_7_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGDefinitionRule());
	        }
       		set(
       			$current, 
       			"body",
        		lv_body_7_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getGDefinitionAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRulePattern
entryRulePattern returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPatternRule()); }
	 iv_rulePattern=rulePattern 
	 { $current=$iv_rulePattern.current; } 
	 EOF 
;

// Rule Pattern
rulePattern returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_UID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getPatternAccess().getNameUIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPatternRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"UID");
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1());
    }
((
(
		lv_args_2_0=RULE_LID
		{
			newLeafNode(lv_args_2_0, grammarAccess.getPatternAccess().getArgsLIDTerminalRuleCall_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPatternRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"args",
        		lv_args_2_0, 
        		"LID");
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getCommaKeyword_2_1_0());
    }
(
(
		lv_args_4_0=RULE_LID
		{
			newLeafNode(lv_args_4_0, grammarAccess.getPatternAccess().getArgsLIDTerminalRuleCall_2_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPatternRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"args",
        		lv_args_4_0, 
        		"LID");
	    }

)
))*)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getFCallParserRuleCall_0()); 
    }
    this_FCall_0=ruleFCall
    { 
        $current = $this_FCall_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getGCallParserRuleCall_1()); 
    }
    this_GCall_1=ruleGCall
    { 
        $current = $this_GCall_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getCtrParserRuleCall_2()); 
    }
    this_Ctr_2=ruleCtr
    { 
        $current = $this_Ctr_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getVarParserRuleCall_3()); 
    }
    this_Var_3=ruleVar
    { 
        $current = $this_Var_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleFCall
entryRuleFCall returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFCallRule()); }
	 iv_ruleFCall=ruleFCall 
	 { $current=$iv_ruleFCall.current; } 
	 EOF 
;

// Rule FCall
ruleFCall returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_FID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getFCallAccess().getNameFIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFCallRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"FID");
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFCallAccess().getLeftParenthesisKeyword_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getFCallAccess().getArgsExpressionParserRuleCall_2_0_0()); 
	    }
		lv_args_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFCallRule());
	        }
       		add(
       			$current, 
       			"args",
        		lv_args_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFCallAccess().getCommaKeyword_2_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFCallAccess().getArgsExpressionParserRuleCall_2_1_1_0()); 
	    }
		lv_args_4_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFCallRule());
	        }
       		add(
       			$current, 
       			"args",
        		lv_args_4_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFCallAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleGCall
entryRuleGCall returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGCallRule()); }
	 iv_ruleGCall=ruleGCall 
	 { $current=$iv_ruleGCall.current; } 
	 EOF 
;

// Rule GCall
ruleGCall returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_GID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getGCallAccess().getNameGIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGCallRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"GID");
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getGCallAccess().getLeftParenthesisKeyword_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getGCallAccess().getArgsExpressionParserRuleCall_2_0_0()); 
	    }
		lv_args_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGCallRule());
	        }
       		add(
       			$current, 
       			"args",
        		lv_args_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getGCallAccess().getCommaKeyword_2_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGCallAccess().getArgsExpressionParserRuleCall_2_1_1_0()); 
	    }
		lv_args_4_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGCallRule());
	        }
       		add(
       			$current, 
       			"args",
        		lv_args_4_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getGCallAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleCtr
entryRuleCtr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCtrRule()); }
	 iv_ruleCtr=ruleCtr 
	 { $current=$iv_ruleCtr.current; } 
	 EOF 
;

// Rule Ctr
ruleCtr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_UID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getCtrAccess().getNameUIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCtrRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"UID");
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCtrAccess().getLeftParenthesisKeyword_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getCtrAccess().getArgsExpressionParserRuleCall_2_0_0()); 
	    }
		lv_args_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCtrRule());
	        }
       		add(
       			$current, 
       			"args",
        		lv_args_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCtrAccess().getCommaKeyword_2_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCtrAccess().getArgsExpressionParserRuleCall_2_1_1_0()); 
	    }
		lv_args_4_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCtrRule());
	        }
       		add(
       			$current, 
       			"args",
        		lv_args_4_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getCtrAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleVar
entryRuleVar returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVarRule()); }
	 iv_ruleVar=ruleVar 
	 { $current=$iv_ruleVar.current; } 
	 EOF 
;

// Rule Var
ruleVar returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_LID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getVarAccess().getNameLIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"LID");
	    }

)
)
;





RULE_FID : 'f' ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_GID : 'g' ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_LID : 'a'..'z' ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_UID : 'A'..'Z' ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

