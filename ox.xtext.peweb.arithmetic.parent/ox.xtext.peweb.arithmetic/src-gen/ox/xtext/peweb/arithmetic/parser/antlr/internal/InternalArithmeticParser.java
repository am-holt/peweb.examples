package ox.xtext.peweb.arithmetic.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ox.xtext.peweb.arithmetic.services.ArithmeticGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArithmeticParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'import'", "'def'", "'('", "','", "')'", "':'", "';'", "'+'", "'-'", "'*'", "'/'", "'sum('"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalArithmeticParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArithmeticParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArithmeticParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArithmetic.g"; }



     	private ArithmeticGrammarAccess grammarAccess;

        public InternalArithmeticParser(TokenStream input, ArithmeticGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Module";
       	}

       	@Override
       	protected ArithmeticGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModule"
    // InternalArithmetic.g:64:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalArithmetic.g:64:47: (iv_ruleModule= ruleModule EOF )
            // InternalArithmetic.g:65:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalArithmetic.g:71:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_statements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_imports_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:77:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_statements_3_0= ruleStatement ) )* ) )
            // InternalArithmetic.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_statements_3_0= ruleStatement ) )* )
            {
            // InternalArithmetic.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_statements_3_0= ruleStatement ) )* )
            // InternalArithmetic.g:79:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_statements_3_0= ruleStatement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalArithmetic.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalArithmetic.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalArithmetic.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalArithmetic.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalArithmetic.g:101:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArithmetic.g:102:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalArithmetic.g:102:4: (lv_imports_2_0= ruleImport )
            	    // InternalArithmetic.g:103:5: lv_imports_2_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"ox.xtext.peweb.arithmetic.Arithmetic.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalArithmetic.g:120:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||(LA2_0>=13 && LA2_0<=14)||LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArithmetic.g:121:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalArithmetic.g:121:4: (lv_statements_3_0= ruleStatement )
            	    // InternalArithmetic.g:122:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"ox.xtext.peweb.arithmetic.Arithmetic.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleImport"
    // InternalArithmetic.g:143:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalArithmetic.g:143:47: (iv_ruleImport= ruleImport EOF )
            // InternalArithmetic.g:144:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalArithmetic.g:150:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArithmetic.g:156:2: ( (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalArithmetic.g:157:2: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalArithmetic.g:157:2: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) )
            // InternalArithmetic.g:158:3: otherlv_0= 'import' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalArithmetic.g:162:3: ( (otherlv_1= RULE_ID ) )
            // InternalArithmetic.g:163:4: (otherlv_1= RULE_ID )
            {
            // InternalArithmetic.g:163:4: (otherlv_1= RULE_ID )
            // InternalArithmetic.g:164:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getImportAccess().getModuleModuleCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleStatement"
    // InternalArithmetic.g:179:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalArithmetic.g:179:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalArithmetic.g:180:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalArithmetic.g:186:1: ruleStatement returns [EObject current=null] : (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Definition_0 = null;

        EObject this_Evaluation_1 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:192:2: ( (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation ) )
            // InternalArithmetic.g:193:2: (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation )
            {
            // InternalArithmetic.g:193:2: (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==14||LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArithmetic.g:194:3: this_Definition_0= ruleDefinition
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Definition_0=ruleDefinition();

                    state._fsp--;


                    			current = this_Definition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArithmetic.g:203:3: this_Evaluation_1= ruleEvaluation
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Evaluation_1=ruleEvaluation();

                    state._fsp--;


                    			current = this_Evaluation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDefinition"
    // InternalArithmetic.g:215:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalArithmetic.g:215:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalArithmetic.g:216:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalArithmetic.g:222:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_args_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleDeclaredParameter ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleExpression ) ) otherlv_9= ';' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_expr_8_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:228:2: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_args_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleDeclaredParameter ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleExpression ) ) otherlv_9= ';' ) )
            // InternalArithmetic.g:229:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_args_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleDeclaredParameter ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleExpression ) ) otherlv_9= ';' )
            {
            // InternalArithmetic.g:229:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_args_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleDeclaredParameter ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleExpression ) ) otherlv_9= ';' )
            // InternalArithmetic.g:230:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_args_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleDeclaredParameter ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleExpression ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefKeyword_0());
            		
            // InternalArithmetic.g:234:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalArithmetic.g:235:4: (lv_name_1_0= RULE_ID )
            {
            // InternalArithmetic.g:235:4: (lv_name_1_0= RULE_ID )
            // InternalArithmetic.g:236:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalArithmetic.g:252:3: (otherlv_2= '(' ( (lv_args_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleDeclaredParameter ) ) )* otherlv_6= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArithmetic.g:253:4: otherlv_2= '(' ( (lv_args_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleDeclaredParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalArithmetic.g:257:4: ( (lv_args_3_0= ruleDeclaredParameter ) )
                    // InternalArithmetic.g:258:5: (lv_args_3_0= ruleDeclaredParameter )
                    {
                    // InternalArithmetic.g:258:5: (lv_args_3_0= ruleDeclaredParameter )
                    // InternalArithmetic.g:259:6: lv_args_3_0= ruleDeclaredParameter
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_args_3_0=ruleDeclaredParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"ox.xtext.peweb.arithmetic.Arithmetic.DeclaredParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArithmetic.g:276:4: (otherlv_4= ',' ( (lv_args_5_0= ruleDeclaredParameter ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalArithmetic.g:277:5: otherlv_4= ',' ( (lv_args_5_0= ruleDeclaredParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalArithmetic.g:281:5: ( (lv_args_5_0= ruleDeclaredParameter ) )
                    	    // InternalArithmetic.g:282:6: (lv_args_5_0= ruleDeclaredParameter )
                    	    {
                    	    // InternalArithmetic.g:282:6: (lv_args_5_0= ruleDeclaredParameter )
                    	    // InternalArithmetic.g:283:7: lv_args_5_0= ruleDeclaredParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_args_5_0=ruleDeclaredParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_5_0,
                    	    								"ox.xtext.peweb.arithmetic.Arithmetic.DeclaredParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getDefinitionAccess().getColonKeyword_3());
            		
            // InternalArithmetic.g:310:3: ( (lv_expr_8_0= ruleExpression ) )
            // InternalArithmetic.g:311:4: (lv_expr_8_0= ruleExpression )
            {
            // InternalArithmetic.g:311:4: (lv_expr_8_0= ruleExpression )
            // InternalArithmetic.g:312:5: lv_expr_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getExprExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_expr_8_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_8_0,
            						"ox.xtext.peweb.arithmetic.Arithmetic.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDefinitionAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleDeclaredParameter"
    // InternalArithmetic.g:337:1: entryRuleDeclaredParameter returns [EObject current=null] : iv_ruleDeclaredParameter= ruleDeclaredParameter EOF ;
    public final EObject entryRuleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredParameter = null;


        try {
            // InternalArithmetic.g:337:58: (iv_ruleDeclaredParameter= ruleDeclaredParameter EOF )
            // InternalArithmetic.g:338:2: iv_ruleDeclaredParameter= ruleDeclaredParameter EOF
            {
             newCompositeNode(grammarAccess.getDeclaredParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredParameter=ruleDeclaredParameter();

            state._fsp--;

             current =iv_ruleDeclaredParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredParameter"


    // $ANTLR start "ruleDeclaredParameter"
    // InternalArithmetic.g:344:1: ruleDeclaredParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalArithmetic.g:350:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalArithmetic.g:351:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalArithmetic.g:351:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalArithmetic.g:352:3: (lv_name_0_0= RULE_ID )
            {
            // InternalArithmetic.g:352:3: (lv_name_0_0= RULE_ID )
            // InternalArithmetic.g:353:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDeclaredParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredParameter"


    // $ANTLR start "entryRuleEvaluation"
    // InternalArithmetic.g:372:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // InternalArithmetic.g:372:51: (iv_ruleEvaluation= ruleEvaluation EOF )
            // InternalArithmetic.g:373:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // InternalArithmetic.g:379:1: ruleEvaluation returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:385:2: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) )
            // InternalArithmetic.g:386:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            {
            // InternalArithmetic.g:386:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            // InternalArithmetic.g:387:3: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
            {
            // InternalArithmetic.g:387:3: ( (lv_expression_0_0= ruleExpression ) )
            // InternalArithmetic.g:388:4: (lv_expression_0_0= ruleExpression )
            {
            // InternalArithmetic.g:388:4: (lv_expression_0_0= ruleExpression )
            // InternalArithmetic.g:389:5: lv_expression_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvaluationRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_0_0,
            						"ox.xtext.peweb.arithmetic.Arithmetic.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleExpression"
    // InternalArithmetic.g:414:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalArithmetic.g:414:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalArithmetic.g:415:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalArithmetic.g:421:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:427:2: (this_Addition_0= ruleAddition )
            // InternalArithmetic.g:428:2: this_Addition_0= ruleAddition
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;


            		current = this_Addition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalArithmetic.g:439:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalArithmetic.g:439:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalArithmetic.g:440:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalArithmetic.g:446:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:452:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalArithmetic.g:453:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalArithmetic.g:453:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalArithmetic.g:454:3: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalArithmetic.g:462:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=19 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalArithmetic.g:463:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalArithmetic.g:463:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==19) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==20) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalArithmetic.g:464:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalArithmetic.g:464:5: ( () otherlv_2= '+' )
            	            // InternalArithmetic.g:465:6: () otherlv_2= '+'
            	            {
            	            // InternalArithmetic.g:465:6: ()
            	            // InternalArithmetic.g:466:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,19,FOLLOW_9); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalArithmetic.g:478:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalArithmetic.g:478:5: ( () otherlv_4= '-' )
            	            // InternalArithmetic.g:479:6: () otherlv_4= '-'
            	            {
            	            // InternalArithmetic.g:479:6: ()
            	            // InternalArithmetic.g:480:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,20,FOLLOW_9); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalArithmetic.g:492:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalArithmetic.g:493:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalArithmetic.g:493:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalArithmetic.g:494:6: lv_right_5_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"ox.xtext.peweb.arithmetic.Arithmetic.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalArithmetic.g:516:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalArithmetic.g:516:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalArithmetic.g:517:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalArithmetic.g:523:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:529:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // InternalArithmetic.g:530:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // InternalArithmetic.g:530:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // InternalArithmetic.g:531:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalArithmetic.g:539:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArithmetic.g:540:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // InternalArithmetic.g:540:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==21) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==22) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalArithmetic.g:541:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalArithmetic.g:541:5: ( () otherlv_2= '*' )
            	            // InternalArithmetic.g:542:6: () otherlv_2= '*'
            	            {
            	            // InternalArithmetic.g:542:6: ()
            	            // InternalArithmetic.g:543:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,21,FOLLOW_9); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalArithmetic.g:555:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalArithmetic.g:555:5: ( () otherlv_4= '/' )
            	            // InternalArithmetic.g:556:6: () otherlv_4= '/'
            	            {
            	            // InternalArithmetic.g:556:6: ()
            	            // InternalArithmetic.g:557:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,22,FOLLOW_9); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalArithmetic.g:569:4: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // InternalArithmetic.g:570:5: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // InternalArithmetic.g:570:5: (lv_right_5_0= rulePrimaryExpression )
            	    // InternalArithmetic.g:571:6: lv_right_5_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_5_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"ox.xtext.peweb.arithmetic.Arithmetic.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleSumExpression"
    // InternalArithmetic.g:593:1: entryRuleSumExpression returns [EObject current=null] : iv_ruleSumExpression= ruleSumExpression EOF ;
    public final EObject entryRuleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpression = null;


        try {
            // InternalArithmetic.g:593:54: (iv_ruleSumExpression= ruleSumExpression EOF )
            // InternalArithmetic.g:594:2: iv_ruleSumExpression= ruleSumExpression EOF
            {
             newCompositeNode(grammarAccess.getSumExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumExpression=ruleSumExpression();

            state._fsp--;

             current =iv_ruleSumExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumExpression"


    // $ANTLR start "ruleSumExpression"
    // InternalArithmetic.g:600:1: ruleSumExpression returns [EObject current=null] : (otherlv_0= 'sum(' ( (lv_indexVariable_1_0= ruleDeclaredParameter ) ) otherlv_2= ',' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upper_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_expr_7_0= ruleExpression ) ) otherlv_8= ')' ) ;
    public final EObject ruleSumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_lower_3_0=null;
        Token otherlv_4=null;
        Token lv_upper_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_indexVariable_1_0 = null;

        EObject lv_expr_7_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:606:2: ( (otherlv_0= 'sum(' ( (lv_indexVariable_1_0= ruleDeclaredParameter ) ) otherlv_2= ',' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upper_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_expr_7_0= ruleExpression ) ) otherlv_8= ')' ) )
            // InternalArithmetic.g:607:2: (otherlv_0= 'sum(' ( (lv_indexVariable_1_0= ruleDeclaredParameter ) ) otherlv_2= ',' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upper_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_expr_7_0= ruleExpression ) ) otherlv_8= ')' )
            {
            // InternalArithmetic.g:607:2: (otherlv_0= 'sum(' ( (lv_indexVariable_1_0= ruleDeclaredParameter ) ) otherlv_2= ',' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upper_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_expr_7_0= ruleExpression ) ) otherlv_8= ')' )
            // InternalArithmetic.g:608:3: otherlv_0= 'sum(' ( (lv_indexVariable_1_0= ruleDeclaredParameter ) ) otherlv_2= ',' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upper_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_expr_7_0= ruleExpression ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSumExpressionAccess().getSumKeyword_0());
            		
            // InternalArithmetic.g:612:3: ( (lv_indexVariable_1_0= ruleDeclaredParameter ) )
            // InternalArithmetic.g:613:4: (lv_indexVariable_1_0= ruleDeclaredParameter )
            {
            // InternalArithmetic.g:613:4: (lv_indexVariable_1_0= ruleDeclaredParameter )
            // InternalArithmetic.g:614:5: lv_indexVariable_1_0= ruleDeclaredParameter
            {

            					newCompositeNode(grammarAccess.getSumExpressionAccess().getIndexVariableDeclaredParameterParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_indexVariable_1_0=ruleDeclaredParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumExpressionRule());
            					}
            					set(
            						current,
            						"indexVariable",
            						lv_indexVariable_1_0,
            						"ox.xtext.peweb.arithmetic.Arithmetic.DeclaredParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSumExpressionAccess().getCommaKeyword_2());
            		
            // InternalArithmetic.g:635:3: ( (lv_lower_3_0= RULE_INT ) )
            // InternalArithmetic.g:636:4: (lv_lower_3_0= RULE_INT )
            {
            // InternalArithmetic.g:636:4: (lv_lower_3_0= RULE_INT )
            // InternalArithmetic.g:637:5: lv_lower_3_0= RULE_INT
            {
            lv_lower_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_lower_3_0, grammarAccess.getSumExpressionAccess().getLowerINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lower",
            						lv_lower_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getSumExpressionAccess().getCommaKeyword_4());
            		
            // InternalArithmetic.g:657:3: ( (lv_upper_5_0= RULE_INT ) )
            // InternalArithmetic.g:658:4: (lv_upper_5_0= RULE_INT )
            {
            // InternalArithmetic.g:658:4: (lv_upper_5_0= RULE_INT )
            // InternalArithmetic.g:659:5: lv_upper_5_0= RULE_INT
            {
            lv_upper_5_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_upper_5_0, grammarAccess.getSumExpressionAccess().getUpperINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"upper",
            						lv_upper_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getSumExpressionAccess().getCommaKeyword_6());
            		
            // InternalArithmetic.g:679:3: ( (lv_expr_7_0= ruleExpression ) )
            // InternalArithmetic.g:680:4: (lv_expr_7_0= ruleExpression )
            {
            // InternalArithmetic.g:680:4: (lv_expr_7_0= ruleExpression )
            // InternalArithmetic.g:681:5: lv_expr_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSumExpressionAccess().getExprExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_15);
            lv_expr_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumExpressionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_7_0,
            						"ox.xtext.peweb.arithmetic.Arithmetic.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSumExpressionAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalArithmetic.g:706:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalArithmetic.g:706:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalArithmetic.g:707:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalArithmetic.g:713:1: rulePrimaryExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_value_5_0=null;
        Token otherlv_7=null;
        EObject this_SumExpression_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:719:2: ( (this_SumExpression_0= ruleSumExpression | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalArithmetic.g:720:2: (this_SumExpression_0= ruleSumExpression | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalArithmetic.g:720:2: (this_SumExpression_0= ruleSumExpression | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 14:
                {
                alt10=2;
                }
                break;
            case RULE_INT:
                {
                alt10=3;
                }
                break;
            case RULE_ID:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalArithmetic.g:721:3: this_SumExpression_0= ruleSumExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSumExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SumExpression_0=ruleSumExpression();

                    state._fsp--;


                    			current = this_SumExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArithmetic.g:730:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalArithmetic.g:730:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalArithmetic.g:731:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArithmetic.g:749:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalArithmetic.g:749:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalArithmetic.g:750:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalArithmetic.g:750:4: ()
                    // InternalArithmetic.g:751:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalArithmetic.g:757:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalArithmetic.g:758:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalArithmetic.g:758:5: (lv_value_5_0= RULE_INT )
                    // InternalArithmetic.g:759:6: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getPrimaryExpressionAccess().getValueINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalArithmetic.g:777:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalArithmetic.g:777:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalArithmetic.g:778:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalArithmetic.g:778:4: ()
                    // InternalArithmetic.g:779:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_3_0(),
                    						current);
                    				

                    }

                    // InternalArithmetic.g:785:4: ( (otherlv_7= RULE_ID ) )
                    // InternalArithmetic.g:786:5: (otherlv_7= RULE_ID )
                    {
                    // InternalArithmetic.g:786:5: (otherlv_7= RULE_ID )
                    // InternalArithmetic.g:787:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionCrossReference_3_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000807032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000806032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000806030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});

}