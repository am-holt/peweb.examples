package ox.xtext.peweb.graph.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ox.xtext.peweb.graph.services.GraphGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BEGIN'", "'END'", "'VAR'", "':'", "'String'", "'Integer'", "'Boolean'", "'Graph'", "'Particle'", "';'", "':='", "'PRINT'", "'IF'", "'THEN'", "'ELSE'", "'WHILE'", "'DO'", "'MOVE'", "'OR'", "'AND'", "'->-'", "'>='", "'<='", "'>'", "'<'", "'='", "'!='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'!'", "'true'", "'false'", "'GRAPH'", "'{'", "'}'", "','", "'PARTICLE'", "'ON'", "'AT'", "'->'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGraphParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGraph.g"; }



     	private GraphGrammarAccess grammarAccess;

        public InternalGraphParser(TokenStream input, GraphGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected GraphGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalGraph.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalGraph.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalGraph.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalGraph.g:71:1: ruleProgram returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleDeclaration ) )* otherlv_2= 'BEGIN' ( (lv_stmts_3_0= ruleStatement ) )* otherlv_4= 'END' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_declarations_1_0 = null;

        EObject lv_stmts_3_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:77:2: ( ( () ( (lv_declarations_1_0= ruleDeclaration ) )* otherlv_2= 'BEGIN' ( (lv_stmts_3_0= ruleStatement ) )* otherlv_4= 'END' ) )
            // InternalGraph.g:78:2: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* otherlv_2= 'BEGIN' ( (lv_stmts_3_0= ruleStatement ) )* otherlv_4= 'END' )
            {
            // InternalGraph.g:78:2: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* otherlv_2= 'BEGIN' ( (lv_stmts_3_0= ruleStatement ) )* otherlv_4= 'END' )
            // InternalGraph.g:79:3: () ( (lv_declarations_1_0= ruleDeclaration ) )* otherlv_2= 'BEGIN' ( (lv_stmts_3_0= ruleStatement ) )* otherlv_4= 'END'
            {
            // InternalGraph.g:79:3: ()
            // InternalGraph.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            // InternalGraph.g:86:3: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGraph.g:87:4: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // InternalGraph.g:87:4: (lv_declarations_1_0= ruleDeclaration )
            	    // InternalGraph.g:88:5: lv_declarations_1_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_declarations_1_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_1_0,
            	    						"ox.xtext.peweb.graph.Graph.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getBEGINKeyword_2());
            		
            // InternalGraph.g:109:3: ( (lv_stmts_3_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=22 && LA2_0<=23)||LA2_0==26||LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGraph.g:110:4: (lv_stmts_3_0= ruleStatement )
            	    {
            	    // InternalGraph.g:110:4: (lv_stmts_3_0= ruleStatement )
            	    // InternalGraph.g:111:5: lv_stmts_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getStmtsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_stmts_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stmts",
            	    						lv_stmts_3_0,
            	    						"ox.xtext.peweb.graph.Graph.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getENDKeyword_4());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDeclaration"
    // InternalGraph.g:136:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalGraph.g:136:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalGraph.g:137:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalGraph.g:143:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'VAR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'String' | lv_type_3_2= 'Integer' | lv_type_3_3= 'Boolean' | lv_type_3_4= 'Graph' | lv_type_3_5= 'Particle' ) ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token lv_type_3_4=null;
        Token lv_type_3_5=null;


        	enterRule();

        try {
            // InternalGraph.g:149:2: ( (otherlv_0= 'VAR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'String' | lv_type_3_2= 'Integer' | lv_type_3_3= 'Boolean' | lv_type_3_4= 'Graph' | lv_type_3_5= 'Particle' ) ) ) ) )
            // InternalGraph.g:150:2: (otherlv_0= 'VAR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'String' | lv_type_3_2= 'Integer' | lv_type_3_3= 'Boolean' | lv_type_3_4= 'Graph' | lv_type_3_5= 'Particle' ) ) ) )
            {
            // InternalGraph.g:150:2: (otherlv_0= 'VAR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'String' | lv_type_3_2= 'Integer' | lv_type_3_3= 'Boolean' | lv_type_3_4= 'Graph' | lv_type_3_5= 'Particle' ) ) ) )
            // InternalGraph.g:151:3: otherlv_0= 'VAR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'String' | lv_type_3_2= 'Integer' | lv_type_3_3= 'Boolean' | lv_type_3_4= 'Graph' | lv_type_3_5= 'Particle' ) ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getVARKeyword_0());
            		
            // InternalGraph.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGraph.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGraph.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalGraph.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getColonKeyword_2());
            		
            // InternalGraph.g:177:3: ( ( (lv_type_3_1= 'String' | lv_type_3_2= 'Integer' | lv_type_3_3= 'Boolean' | lv_type_3_4= 'Graph' | lv_type_3_5= 'Particle' ) ) )
            // InternalGraph.g:178:4: ( (lv_type_3_1= 'String' | lv_type_3_2= 'Integer' | lv_type_3_3= 'Boolean' | lv_type_3_4= 'Graph' | lv_type_3_5= 'Particle' ) )
            {
            // InternalGraph.g:178:4: ( (lv_type_3_1= 'String' | lv_type_3_2= 'Integer' | lv_type_3_3= 'Boolean' | lv_type_3_4= 'Graph' | lv_type_3_5= 'Particle' ) )
            // InternalGraph.g:179:5: (lv_type_3_1= 'String' | lv_type_3_2= 'Integer' | lv_type_3_3= 'Boolean' | lv_type_3_4= 'Graph' | lv_type_3_5= 'Particle' )
            {
            // InternalGraph.g:179:5: (lv_type_3_1= 'String' | lv_type_3_2= 'Integer' | lv_type_3_3= 'Boolean' | lv_type_3_4= 'Graph' | lv_type_3_5= 'Particle' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGraph.g:180:6: lv_type_3_1= 'String'
                    {
                    lv_type_3_1=(Token)match(input,15,FOLLOW_2); 

                    						newLeafNode(lv_type_3_1, grammarAccess.getDeclarationAccess().getTypeStringKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGraph.g:191:6: lv_type_3_2= 'Integer'
                    {
                    lv_type_3_2=(Token)match(input,16,FOLLOW_2); 

                    						newLeafNode(lv_type_3_2, grammarAccess.getDeclarationAccess().getTypeIntegerKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalGraph.g:202:6: lv_type_3_3= 'Boolean'
                    {
                    lv_type_3_3=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_type_3_3, grammarAccess.getDeclarationAccess().getTypeBooleanKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalGraph.g:213:6: lv_type_3_4= 'Graph'
                    {
                    lv_type_3_4=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_type_3_4, grammarAccess.getDeclarationAccess().getTypeGraphKeyword_3_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalGraph.g:224:6: lv_type_3_5= 'Particle'
                    {
                    lv_type_3_5=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_type_3_5, grammarAccess.getDeclarationAccess().getTypeParticleKeyword_3_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_5, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleStatement"
    // InternalGraph.g:241:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalGraph.g:241:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalGraph.g:242:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalGraph.g:248:1: ruleStatement returns [EObject current=null] : ( (this_AssignStmt_0= ruleAssignStmt | this_PrintStmt_1= rulePrintStmt | this_IfStmt_2= ruleIfStmt | this_WhileStmt_3= ruleWhileStmt | this_MoveStmt_4= ruleMoveStmt ) otherlv_5= ';' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_AssignStmt_0 = null;

        EObject this_PrintStmt_1 = null;

        EObject this_IfStmt_2 = null;

        EObject this_WhileStmt_3 = null;

        EObject this_MoveStmt_4 = null;



        	enterRule();

        try {
            // InternalGraph.g:254:2: ( ( (this_AssignStmt_0= ruleAssignStmt | this_PrintStmt_1= rulePrintStmt | this_IfStmt_2= ruleIfStmt | this_WhileStmt_3= ruleWhileStmt | this_MoveStmt_4= ruleMoveStmt ) otherlv_5= ';' ) )
            // InternalGraph.g:255:2: ( (this_AssignStmt_0= ruleAssignStmt | this_PrintStmt_1= rulePrintStmt | this_IfStmt_2= ruleIfStmt | this_WhileStmt_3= ruleWhileStmt | this_MoveStmt_4= ruleMoveStmt ) otherlv_5= ';' )
            {
            // InternalGraph.g:255:2: ( (this_AssignStmt_0= ruleAssignStmt | this_PrintStmt_1= rulePrintStmt | this_IfStmt_2= ruleIfStmt | this_WhileStmt_3= ruleWhileStmt | this_MoveStmt_4= ruleMoveStmt ) otherlv_5= ';' )
            // InternalGraph.g:256:3: (this_AssignStmt_0= ruleAssignStmt | this_PrintStmt_1= rulePrintStmt | this_IfStmt_2= ruleIfStmt | this_WhileStmt_3= ruleWhileStmt | this_MoveStmt_4= ruleMoveStmt ) otherlv_5= ';'
            {
            // InternalGraph.g:256:3: (this_AssignStmt_0= ruleAssignStmt | this_PrintStmt_1= rulePrintStmt | this_IfStmt_2= ruleIfStmt | this_WhileStmt_3= ruleWhileStmt | this_MoveStmt_4= ruleMoveStmt )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            case 28:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGraph.g:257:4: this_AssignStmt_0= ruleAssignStmt
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getAssignStmtParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_8);
                    this_AssignStmt_0=ruleAssignStmt();

                    state._fsp--;


                    				current = this_AssignStmt_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalGraph.g:266:4: this_PrintStmt_1= rulePrintStmt
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getPrintStmtParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_PrintStmt_1=rulePrintStmt();

                    state._fsp--;


                    				current = this_PrintStmt_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalGraph.g:275:4: this_IfStmt_2= ruleIfStmt
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_IfStmt_2=ruleIfStmt();

                    state._fsp--;


                    				current = this_IfStmt_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalGraph.g:284:4: this_WhileStmt_3= ruleWhileStmt
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getWhileStmtParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_8);
                    this_WhileStmt_3=ruleWhileStmt();

                    state._fsp--;


                    				current = this_WhileStmt_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalGraph.g:293:4: this_MoveStmt_4= ruleMoveStmt
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getMoveStmtParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_8);
                    this_MoveStmt_4=ruleMoveStmt();

                    state._fsp--;


                    				current = this_MoveStmt_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getSemicolonKeyword_1());
            		

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


    // $ANTLR start "entryRuleAssignStmt"
    // InternalGraph.g:310:1: entryRuleAssignStmt returns [EObject current=null] : iv_ruleAssignStmt= ruleAssignStmt EOF ;
    public final EObject entryRuleAssignStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignStmt = null;


        try {
            // InternalGraph.g:310:51: (iv_ruleAssignStmt= ruleAssignStmt EOF )
            // InternalGraph.g:311:2: iv_ruleAssignStmt= ruleAssignStmt EOF
            {
             newCompositeNode(grammarAccess.getAssignStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignStmt=ruleAssignStmt();

            state._fsp--;

             current =iv_ruleAssignStmt; 
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
    // $ANTLR end "entryRuleAssignStmt"


    // $ANTLR start "ruleAssignStmt"
    // InternalGraph.g:317:1: ruleAssignStmt returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAssignStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:323:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // InternalGraph.g:324:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // InternalGraph.g:324:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpr ) ) )
            // InternalGraph.g:325:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpr ) )
            {
            // InternalGraph.g:325:3: ( (otherlv_0= RULE_ID ) )
            // InternalGraph.g:326:4: (otherlv_0= RULE_ID )
            {
            // InternalGraph.g:326:4: (otherlv_0= RULE_ID )
            // InternalGraph.g:327:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignStmtRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignStmtAccess().getVarDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignStmtAccess().getColonEqualsSignKeyword_1());
            		
            // InternalGraph.g:342:3: ( (lv_expr_2_0= ruleExpr ) )
            // InternalGraph.g:343:4: (lv_expr_2_0= ruleExpr )
            {
            // InternalGraph.g:343:4: (lv_expr_2_0= ruleExpr )
            // InternalGraph.g:344:5: lv_expr_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getAssignStmtAccess().getExprExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignStmtRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"ox.xtext.peweb.graph.Graph.Expr");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAssignStmt"


    // $ANTLR start "entryRulePrintStmt"
    // InternalGraph.g:365:1: entryRulePrintStmt returns [EObject current=null] : iv_rulePrintStmt= rulePrintStmt EOF ;
    public final EObject entryRulePrintStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStmt = null;


        try {
            // InternalGraph.g:365:50: (iv_rulePrintStmt= rulePrintStmt EOF )
            // InternalGraph.g:366:2: iv_rulePrintStmt= rulePrintStmt EOF
            {
             newCompositeNode(grammarAccess.getPrintStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintStmt=rulePrintStmt();

            state._fsp--;

             current =iv_rulePrintStmt; 
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
    // $ANTLR end "entryRulePrintStmt"


    // $ANTLR start "rulePrintStmt"
    // InternalGraph.g:372:1: rulePrintStmt returns [EObject current=null] : (otherlv_0= 'PRINT' ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject rulePrintStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:378:2: ( (otherlv_0= 'PRINT' ( (lv_expr_1_0= ruleExpr ) ) ) )
            // InternalGraph.g:379:2: (otherlv_0= 'PRINT' ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // InternalGraph.g:379:2: (otherlv_0= 'PRINT' ( (lv_expr_1_0= ruleExpr ) ) )
            // InternalGraph.g:380:3: otherlv_0= 'PRINT' ( (lv_expr_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintStmtAccess().getPRINTKeyword_0());
            		
            // InternalGraph.g:384:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGraph.g:385:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGraph.g:385:4: (lv_expr_1_0= ruleExpr )
            // InternalGraph.g:386:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getPrintStmtAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintStmtRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"ox.xtext.peweb.graph.Graph.Expr");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "rulePrintStmt"


    // $ANTLR start "entryRuleIfStmt"
    // InternalGraph.g:407:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // InternalGraph.g:407:47: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalGraph.g:408:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
             newCompositeNode(grammarAccess.getIfStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;

             current =iv_ruleIfStmt; 
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
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalGraph.g:414:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'IF' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'THEN' ( (lv_stmts_3_0= ruleStatement ) )* (otherlv_4= 'ELSE' ( (lv_elseStmts_5_0= ruleStatement ) )* )? otherlv_6= 'END' ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr_1_0 = null;

        EObject lv_stmts_3_0 = null;

        EObject lv_elseStmts_5_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:420:2: ( (otherlv_0= 'IF' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'THEN' ( (lv_stmts_3_0= ruleStatement ) )* (otherlv_4= 'ELSE' ( (lv_elseStmts_5_0= ruleStatement ) )* )? otherlv_6= 'END' ) )
            // InternalGraph.g:421:2: (otherlv_0= 'IF' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'THEN' ( (lv_stmts_3_0= ruleStatement ) )* (otherlv_4= 'ELSE' ( (lv_elseStmts_5_0= ruleStatement ) )* )? otherlv_6= 'END' )
            {
            // InternalGraph.g:421:2: (otherlv_0= 'IF' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'THEN' ( (lv_stmts_3_0= ruleStatement ) )* (otherlv_4= 'ELSE' ( (lv_elseStmts_5_0= ruleStatement ) )* )? otherlv_6= 'END' )
            // InternalGraph.g:422:3: otherlv_0= 'IF' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'THEN' ( (lv_stmts_3_0= ruleStatement ) )* (otherlv_4= 'ELSE' ( (lv_elseStmts_5_0= ruleStatement ) )* )? otherlv_6= 'END'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIFKeyword_0());
            		
            // InternalGraph.g:426:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGraph.g:427:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGraph.g:427:4: (lv_expr_1_0= ruleExpr )
            // InternalGraph.g:428:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getIfStmtAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"ox.xtext.peweb.graph.Graph.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStmtAccess().getTHENKeyword_2());
            		
            // InternalGraph.g:449:3: ( (lv_stmts_3_0= ruleStatement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=22 && LA5_0<=23)||LA5_0==26||LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGraph.g:450:4: (lv_stmts_3_0= ruleStatement )
            	    {
            	    // InternalGraph.g:450:4: (lv_stmts_3_0= ruleStatement )
            	    // InternalGraph.g:451:5: lv_stmts_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfStmtAccess().getStmtsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_stmts_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stmts",
            	    						lv_stmts_3_0,
            	    						"ox.xtext.peweb.graph.Graph.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalGraph.g:468:3: (otherlv_4= 'ELSE' ( (lv_elseStmts_5_0= ruleStatement ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraph.g:469:4: otherlv_4= 'ELSE' ( (lv_elseStmts_5_0= ruleStatement ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfStmtAccess().getELSEKeyword_4_0());
                    			
                    // InternalGraph.g:473:4: ( (lv_elseStmts_5_0= ruleStatement ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||(LA6_0>=22 && LA6_0<=23)||LA6_0==26||LA6_0==28) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGraph.g:474:5: (lv_elseStmts_5_0= ruleStatement )
                    	    {
                    	    // InternalGraph.g:474:5: (lv_elseStmts_5_0= ruleStatement )
                    	    // InternalGraph.g:475:6: lv_elseStmts_5_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfStmtAccess().getElseStmtsStatementParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_elseStmts_5_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfStmtRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elseStmts",
                    	    							lv_elseStmts_5_0,
                    	    							"ox.xtext.peweb.graph.Graph.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIfStmtAccess().getENDKeyword_5());
            		

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
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleWhileStmt"
    // InternalGraph.g:501:1: entryRuleWhileStmt returns [EObject current=null] : iv_ruleWhileStmt= ruleWhileStmt EOF ;
    public final EObject entryRuleWhileStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStmt = null;


        try {
            // InternalGraph.g:501:50: (iv_ruleWhileStmt= ruleWhileStmt EOF )
            // InternalGraph.g:502:2: iv_ruleWhileStmt= ruleWhileStmt EOF
            {
             newCompositeNode(grammarAccess.getWhileStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStmt=ruleWhileStmt();

            state._fsp--;

             current =iv_ruleWhileStmt; 
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
    // $ANTLR end "entryRuleWhileStmt"


    // $ANTLR start "ruleWhileStmt"
    // InternalGraph.g:508:1: ruleWhileStmt returns [EObject current=null] : (otherlv_0= 'WHILE' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'DO' ( (lv_stmts_3_0= ruleStatement ) )* otherlv_4= 'END' ) ;
    public final EObject ruleWhileStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_stmts_3_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:514:2: ( (otherlv_0= 'WHILE' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'DO' ( (lv_stmts_3_0= ruleStatement ) )* otherlv_4= 'END' ) )
            // InternalGraph.g:515:2: (otherlv_0= 'WHILE' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'DO' ( (lv_stmts_3_0= ruleStatement ) )* otherlv_4= 'END' )
            {
            // InternalGraph.g:515:2: (otherlv_0= 'WHILE' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'DO' ( (lv_stmts_3_0= ruleStatement ) )* otherlv_4= 'END' )
            // InternalGraph.g:516:3: otherlv_0= 'WHILE' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'DO' ( (lv_stmts_3_0= ruleStatement ) )* otherlv_4= 'END'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStmtAccess().getWHILEKeyword_0());
            		
            // InternalGraph.g:520:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGraph.g:521:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGraph.g:521:4: (lv_expr_1_0= ruleExpr )
            // InternalGraph.g:522:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getWhileStmtAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStmtRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"ox.xtext.peweb.graph.Graph.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStmtAccess().getDOKeyword_2());
            		
            // InternalGraph.g:543:3: ( (lv_stmts_3_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=22 && LA8_0<=23)||LA8_0==26||LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGraph.g:544:4: (lv_stmts_3_0= ruleStatement )
            	    {
            	    // InternalGraph.g:544:4: (lv_stmts_3_0= ruleStatement )
            	    // InternalGraph.g:545:5: lv_stmts_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileStmtAccess().getStmtsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_stmts_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileStmtRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stmts",
            	    						lv_stmts_3_0,
            	    						"ox.xtext.peweb.graph.Graph.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileStmtAccess().getENDKeyword_4());
            		

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
    // $ANTLR end "ruleWhileStmt"


    // $ANTLR start "entryRuleMoveStmt"
    // InternalGraph.g:570:1: entryRuleMoveStmt returns [EObject current=null] : iv_ruleMoveStmt= ruleMoveStmt EOF ;
    public final EObject entryRuleMoveStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStmt = null;


        try {
            // InternalGraph.g:570:49: (iv_ruleMoveStmt= ruleMoveStmt EOF )
            // InternalGraph.g:571:2: iv_ruleMoveStmt= ruleMoveStmt EOF
            {
             newCompositeNode(grammarAccess.getMoveStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveStmt=ruleMoveStmt();

            state._fsp--;

             current =iv_ruleMoveStmt; 
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
    // $ANTLR end "entryRuleMoveStmt"


    // $ANTLR start "ruleMoveStmt"
    // InternalGraph.g:577:1: ruleMoveStmt returns [EObject current=null] : (otherlv_0= 'MOVE' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMoveStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGraph.g:583:2: ( (otherlv_0= 'MOVE' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalGraph.g:584:2: (otherlv_0= 'MOVE' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalGraph.g:584:2: (otherlv_0= 'MOVE' ( (otherlv_1= RULE_ID ) ) )
            // InternalGraph.g:585:3: otherlv_0= 'MOVE' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveStmtAccess().getMOVEKeyword_0());
            		
            // InternalGraph.g:589:3: ( (otherlv_1= RULE_ID ) )
            // InternalGraph.g:590:4: (otherlv_1= RULE_ID )
            {
            // InternalGraph.g:590:4: (otherlv_1= RULE_ID )
            // InternalGraph.g:591:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveStmtRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getMoveStmtAccess().getVarDeclarationCrossReference_1_0());
            				

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
    // $ANTLR end "ruleMoveStmt"


    // $ANTLR start "entryRuleExpr"
    // InternalGraph.g:606:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalGraph.g:606:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalGraph.g:607:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalGraph.g:613:1: ruleExpr returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:619:2: (this_Or_0= ruleOr )
            // InternalGraph.g:620:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExprAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOr"
    // InternalGraph.g:631:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalGraph.g:631:43: (iv_ruleOr= ruleOr EOF )
            // InternalGraph.g:632:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalGraph.g:638:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:644:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalGraph.g:645:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalGraph.g:645:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalGraph.g:646:3: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGraph.g:654:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGraph.g:655:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalGraph.g:655:4: ()
            	    // InternalGraph.g:656:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	    			
            	    // InternalGraph.g:666:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalGraph.g:667:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalGraph.g:667:5: (lv_right_3_0= ruleAnd )
            	    // InternalGraph.g:668:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ox.xtext.peweb.graph.Graph.And");
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalGraph.g:690:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalGraph.g:690:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalGraph.g:691:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalGraph.g:697:1: ruleAnd returns [EObject current=null] : (this_PathExistence_0= rulePathExistence ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePathExistence ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PathExistence_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:703:2: ( (this_PathExistence_0= rulePathExistence ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePathExistence ) ) )* ) )
            // InternalGraph.g:704:2: (this_PathExistence_0= rulePathExistence ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePathExistence ) ) )* )
            {
            // InternalGraph.g:704:2: (this_PathExistence_0= rulePathExistence ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePathExistence ) ) )* )
            // InternalGraph.g:705:3: this_PathExistence_0= rulePathExistence ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePathExistence ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getPathExistenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_PathExistence_0=rulePathExistence();

            state._fsp--;


            			current = this_PathExistence_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGraph.g:713:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePathExistence ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGraph.g:714:4: () otherlv_2= 'AND' ( (lv_right_3_0= rulePathExistence ) )
            	    {
            	    // InternalGraph.g:714:4: ()
            	    // InternalGraph.g:715:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	    			
            	    // InternalGraph.g:725:4: ( (lv_right_3_0= rulePathExistence ) )
            	    // InternalGraph.g:726:5: (lv_right_3_0= rulePathExistence )
            	    {
            	    // InternalGraph.g:726:5: (lv_right_3_0= rulePathExistence )
            	    // InternalGraph.g:727:6: lv_right_3_0= rulePathExistence
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightPathExistenceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_right_3_0=rulePathExistence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ox.xtext.peweb.graph.Graph.PathExistence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePathExistence"
    // InternalGraph.g:749:1: entryRulePathExistence returns [EObject current=null] : iv_rulePathExistence= rulePathExistence EOF ;
    public final EObject entryRulePathExistence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExistence = null;


        try {
            // InternalGraph.g:749:54: (iv_rulePathExistence= rulePathExistence EOF )
            // InternalGraph.g:750:2: iv_rulePathExistence= rulePathExistence EOF
            {
             newCompositeNode(grammarAccess.getPathExistenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathExistence=rulePathExistence();

            state._fsp--;

             current =iv_rulePathExistence; 
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
    // $ANTLR end "entryRulePathExistence"


    // $ANTLR start "rulePathExistence"
    // InternalGraph.g:756:1: rulePathExistence returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () otherlv_2= '->-' ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject rulePathExistence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:762:2: ( (this_Comparison_0= ruleComparison ( () otherlv_2= '->-' ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalGraph.g:763:2: (this_Comparison_0= ruleComparison ( () otherlv_2= '->-' ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalGraph.g:763:2: (this_Comparison_0= ruleComparison ( () otherlv_2= '->-' ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalGraph.g:764:3: this_Comparison_0= ruleComparison ( () otherlv_2= '->-' ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getPathExistenceAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGraph.g:772:3: ( () otherlv_2= '->-' ( (lv_right_3_0= ruleComparison ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGraph.g:773:4: () otherlv_2= '->-' ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalGraph.g:773:4: ()
            	    // InternalGraph.g:774:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPathExistenceAccess().getPathExistenceLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPathExistenceAccess().getHyphenMinusGreaterThanSignHyphenMinusKeyword_1_1());
            	    			
            	    // InternalGraph.g:784:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalGraph.g:785:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalGraph.g:785:5: (lv_right_3_0= ruleComparison )
            	    // InternalGraph.g:786:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getPathExistenceAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPathExistenceRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ox.xtext.peweb.graph.Graph.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "rulePathExistence"


    // $ANTLR start "entryRuleComparison"
    // InternalGraph.g:808:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalGraph.g:808:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalGraph.g:809:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalGraph.g:815:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:821:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalGraph.g:822:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalGraph.g:822:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalGraph.g:823:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGraph.g:831:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=32 && LA13_0<=37)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGraph.g:832:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalGraph.g:832:4: ()
            	    // InternalGraph.g:833:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGraph.g:839:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' ) ) )
            	    // InternalGraph.g:840:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' ) )
            	    {
            	    // InternalGraph.g:840:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' ) )
            	    // InternalGraph.g:841:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' )
            	    {
            	    // InternalGraph.g:841:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= '=' | lv_op_2_6= '!=' )
            	    int alt12=6;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt12=5;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt12=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // InternalGraph.g:842:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGraph.g:853:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,33,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalGraph.g:864:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,34,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalGraph.g:875:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,35,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalGraph.g:886:7: lv_op_2_5= '='
            	            {
            	            lv_op_2_5=(Token)match(input,36,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_5, grammarAccess.getComparisonAccess().getOpEqualsSignKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalGraph.g:897:7: lv_op_2_6= '!='
            	            {
            	            lv_op_2_6=(Token)match(input,37,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_6, grammarAccess.getComparisonAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_6, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalGraph.g:910:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalGraph.g:911:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalGraph.g:911:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalGraph.g:912:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ox.xtext.peweb.graph.Graph.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalGraph.g:934:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalGraph.g:934:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalGraph.g:935:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalGraph.g:941:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:947:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) )
            // InternalGraph.g:948:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            {
            // InternalGraph.g:948:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            // InternalGraph.g:949:3: this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGraph.g:957:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=38 && LA15_0<=39)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGraph.g:958:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) )
            	    {
            	    // InternalGraph.g:958:4: ()
            	    // InternalGraph.g:959:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusOrMinusAccess().getPlusOrMinLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGraph.g:965:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalGraph.g:966:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalGraph.g:966:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalGraph.g:967:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalGraph.g:967:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==38) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==39) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalGraph.g:968:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,38,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGraph.g:979:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,39,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalGraph.g:992:4: ( (lv_right_3_0= ruleMulOrDiv ) )
            	    // InternalGraph.g:993:5: (lv_right_3_0= ruleMulOrDiv )
            	    {
            	    // InternalGraph.g:993:5: (lv_right_3_0= ruleMulOrDiv )
            	    // InternalGraph.g:994:6: lv_right_3_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ox.xtext.peweb.graph.Graph.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalGraph.g:1016:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalGraph.g:1016:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalGraph.g:1017:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalGraph.g:1023:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:1029:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalGraph.g:1030:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalGraph.g:1030:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalGraph.g:1031:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGraph.g:1039:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=40 && LA17_0<=41)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGraph.g:1040:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalGraph.g:1040:4: ()
            	    // InternalGraph.g:1041:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGraph.g:1047:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalGraph.g:1048:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalGraph.g:1048:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalGraph.g:1049:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalGraph.g:1049:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==40) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==41) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalGraph.g:1050:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,40,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGraph.g:1061:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,41,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalGraph.g:1074:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalGraph.g:1075:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalGraph.g:1075:5: (lv_right_3_0= rulePrimary )
            	    // InternalGraph.g:1076:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ox.xtext.peweb.graph.Graph.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalGraph.g:1098:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalGraph.g:1098:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalGraph.g:1099:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalGraph.g:1105:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_Expr_5_0= rulePrimary ) ) ) | this_Particle_6= ruleParticle | this_Atomic_7= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expr_1 = null;

        EObject lv_Expr_5_0 = null;

        EObject this_Particle_6 = null;

        EObject this_Atomic_7 = null;



        	enterRule();

        try {
            // InternalGraph.g:1111:2: ( ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_Expr_5_0= rulePrimary ) ) ) | this_Particle_6= ruleParticle | this_Atomic_7= ruleAtomic ) )
            // InternalGraph.g:1112:2: ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_Expr_5_0= rulePrimary ) ) ) | this_Particle_6= ruleParticle | this_Atomic_7= ruleAtomic )
            {
            // InternalGraph.g:1112:2: ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_Expr_5_0= rulePrimary ) ) ) | this_Particle_6= ruleParticle | this_Atomic_7= ruleAtomic )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt18=1;
                }
                break;
            case 44:
                {
                alt18=2;
                }
                break;
            case 51:
                {
                alt18=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 45:
            case 46:
            case 47:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalGraph.g:1113:3: (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' )
                    {
                    // InternalGraph.g:1113:3: (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' )
                    // InternalGraph.g:1114:4: otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExprParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_20);
                    this_Expr_1=ruleExpr();

                    state._fsp--;


                    				current = this_Expr_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraph.g:1132:3: ( () otherlv_4= '!' ( (lv_Expr_5_0= rulePrimary ) ) )
                    {
                    // InternalGraph.g:1132:3: ( () otherlv_4= '!' ( (lv_Expr_5_0= rulePrimary ) ) )
                    // InternalGraph.g:1133:4: () otherlv_4= '!' ( (lv_Expr_5_0= rulePrimary ) )
                    {
                    // InternalGraph.g:1133:4: ()
                    // InternalGraph.g:1134:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,44,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalGraph.g:1144:4: ( (lv_Expr_5_0= rulePrimary ) )
                    // InternalGraph.g:1145:5: (lv_Expr_5_0= rulePrimary )
                    {
                    // InternalGraph.g:1145:5: (lv_Expr_5_0= rulePrimary )
                    // InternalGraph.g:1146:6: lv_Expr_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExprPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Expr_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"Expr",
                    							lv_Expr_5_0,
                    							"ox.xtext.peweb.graph.Graph.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGraph.g:1165:3: this_Particle_6= ruleParticle
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParticleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Particle_6=ruleParticle();

                    state._fsp--;


                    			current = this_Particle_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGraph.g:1174:3: this_Atomic_7= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_7=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_7;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalGraph.g:1186:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalGraph.g:1186:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalGraph.g:1187:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalGraph.g:1193:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_Graph_8= ruleGraph ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        EObject this_Graph_8 = null;



        	enterRule();

        try {
            // InternalGraph.g:1199:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_Graph_8= ruleGraph ) )
            // InternalGraph.g:1200:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_Graph_8= ruleGraph )
            {
            // InternalGraph.g:1200:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_Graph_8= ruleGraph )
            int alt20=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt20=1;
                }
                break;
            case RULE_STRING:
                {
                alt20=2;
                }
                break;
            case 45:
            case 46:
                {
                alt20=3;
                }
                break;
            case RULE_ID:
                {
                alt20=4;
                }
                break;
            case 47:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalGraph.g:1201:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalGraph.g:1201:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalGraph.g:1202:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalGraph.g:1202:4: ()
                    // InternalGraph.g:1203:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGraph.g:1209:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalGraph.g:1210:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalGraph.g:1210:5: (lv_value_1_0= RULE_INT )
                    // InternalGraph.g:1211:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraph.g:1229:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalGraph.g:1229:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalGraph.g:1230:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalGraph.g:1230:4: ()
                    // InternalGraph.g:1231:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGraph.g:1237:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalGraph.g:1238:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalGraph.g:1238:5: (lv_value_3_0= RULE_STRING )
                    // InternalGraph.g:1239:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGraph.g:1257:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalGraph.g:1257:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalGraph.g:1258:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalGraph.g:1258:4: ()
                    // InternalGraph.g:1259:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGraph.g:1265:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalGraph.g:1266:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalGraph.g:1266:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalGraph.g:1267:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalGraph.g:1267:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==45) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==46) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalGraph.g:1268:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,45,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalGraph.g:1279:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,46,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGraph.g:1294:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalGraph.g:1294:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalGraph.g:1295:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalGraph.g:1295:4: ()
                    // InternalGraph.g:1296:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalGraph.g:1302:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGraph.g:1303:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGraph.g:1303:5: (otherlv_7= RULE_ID )
                    // InternalGraph.g:1304:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableDeclarationCrossReference_3_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGraph.g:1317:3: this_Graph_8= ruleGraph
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getGraphParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Graph_8=ruleGraph();

                    state._fsp--;


                    			current = this_Graph_8;
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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleGraph"
    // InternalGraph.g:1329:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalGraph.g:1329:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalGraph.g:1330:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
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
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalGraph.g:1336:1: ruleGraph returns [EObject current=null] : ( () otherlv_1= 'GRAPH' otherlv_2= '{' otherlv_3= '{' ( (lv_vertices_4_0= ruleVertex ) )* otherlv_5= '}' otherlv_6= ',' otherlv_7= '{' ( (lv_edges_8_0= ruleEdge ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_vertices_4_0 = null;

        EObject lv_edges_8_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:1342:2: ( ( () otherlv_1= 'GRAPH' otherlv_2= '{' otherlv_3= '{' ( (lv_vertices_4_0= ruleVertex ) )* otherlv_5= '}' otherlv_6= ',' otherlv_7= '{' ( (lv_edges_8_0= ruleEdge ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalGraph.g:1343:2: ( () otherlv_1= 'GRAPH' otherlv_2= '{' otherlv_3= '{' ( (lv_vertices_4_0= ruleVertex ) )* otherlv_5= '}' otherlv_6= ',' otherlv_7= '{' ( (lv_edges_8_0= ruleEdge ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalGraph.g:1343:2: ( () otherlv_1= 'GRAPH' otherlv_2= '{' otherlv_3= '{' ( (lv_vertices_4_0= ruleVertex ) )* otherlv_5= '}' otherlv_6= ',' otherlv_7= '{' ( (lv_edges_8_0= ruleEdge ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalGraph.g:1344:3: () otherlv_1= 'GRAPH' otherlv_2= '{' otherlv_3= '{' ( (lv_vertices_4_0= ruleVertex ) )* otherlv_5= '}' otherlv_6= ',' otherlv_7= '{' ( (lv_edges_8_0= ruleEdge ) )* otherlv_9= '}' otherlv_10= '}'
            {
            // InternalGraph.g:1344:3: ()
            // InternalGraph.g:1345:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphAccess().getGraphConstantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphAccess().getGRAPHKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGraph.g:1363:3: ( (lv_vertices_4_0= ruleVertex ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGraph.g:1364:4: (lv_vertices_4_0= ruleVertex )
            	    {
            	    // InternalGraph.g:1364:4: (lv_vertices_4_0= ruleVertex )
            	    // InternalGraph.g:1365:5: lv_vertices_4_0= ruleVertex
            	    {

            	    					newCompositeNode(grammarAccess.getGraphAccess().getVerticesVertexParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_vertices_4_0=ruleVertex();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vertices",
            	    						lv_vertices_4_0,
            	    						"ox.xtext.peweb.graph.Graph.Vertex");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,49,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,50,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,48,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalGraph.g:1394:3: ( (lv_edges_8_0= ruleEdge ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGraph.g:1395:4: (lv_edges_8_0= ruleEdge )
            	    {
            	    // InternalGraph.g:1395:4: (lv_edges_8_0= ruleEdge )
            	    // InternalGraph.g:1396:5: lv_edges_8_0= ruleEdge
            	    {

            	    					newCompositeNode(grammarAccess.getGraphAccess().getEdgesEdgeParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_edges_8_0=ruleEdge();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"edges",
            	    						lv_edges_8_0,
            	    						"ox.xtext.peweb.graph.Graph.Edge");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_9=(Token)match(input,49,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleParticle"
    // InternalGraph.g:1425:1: entryRuleParticle returns [EObject current=null] : iv_ruleParticle= ruleParticle EOF ;
    public final EObject entryRuleParticle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticle = null;


        try {
            // InternalGraph.g:1425:49: (iv_ruleParticle= ruleParticle EOF )
            // InternalGraph.g:1426:2: iv_ruleParticle= ruleParticle EOF
            {
             newCompositeNode(grammarAccess.getParticleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticle=ruleParticle();

            state._fsp--;

             current =iv_ruleParticle; 
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
    // $ANTLR end "entryRuleParticle"


    // $ANTLR start "ruleParticle"
    // InternalGraph.g:1432:1: ruleParticle returns [EObject current=null] : ( () otherlv_1= 'PARTICLE' otherlv_2= 'ON' ( (lv_graph_3_0= ruleExpr ) ) otherlv_4= 'AT' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleParticle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_graph_3_0 = null;



        	enterRule();

        try {
            // InternalGraph.g:1438:2: ( ( () otherlv_1= 'PARTICLE' otherlv_2= 'ON' ( (lv_graph_3_0= ruleExpr ) ) otherlv_4= 'AT' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalGraph.g:1439:2: ( () otherlv_1= 'PARTICLE' otherlv_2= 'ON' ( (lv_graph_3_0= ruleExpr ) ) otherlv_4= 'AT' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalGraph.g:1439:2: ( () otherlv_1= 'PARTICLE' otherlv_2= 'ON' ( (lv_graph_3_0= ruleExpr ) ) otherlv_4= 'AT' ( (otherlv_5= RULE_ID ) ) )
            // InternalGraph.g:1440:3: () otherlv_1= 'PARTICLE' otherlv_2= 'ON' ( (lv_graph_3_0= ruleExpr ) ) otherlv_4= 'AT' ( (otherlv_5= RULE_ID ) )
            {
            // InternalGraph.g:1440:3: ()
            // InternalGraph.g:1441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParticleAccess().getParticleConstantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getParticleAccess().getPARTICLEKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getParticleAccess().getONKeyword_2());
            		
            // InternalGraph.g:1455:3: ( (lv_graph_3_0= ruleExpr ) )
            // InternalGraph.g:1456:4: (lv_graph_3_0= ruleExpr )
            {
            // InternalGraph.g:1456:4: (lv_graph_3_0= ruleExpr )
            // InternalGraph.g:1457:5: lv_graph_3_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getParticleAccess().getGraphExprParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_graph_3_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParticleRule());
            					}
            					set(
            						current,
            						"graph",
            						lv_graph_3_0,
            						"ox.xtext.peweb.graph.Graph.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getParticleAccess().getATKeyword_4());
            		
            // InternalGraph.g:1478:3: ( (otherlv_5= RULE_ID ) )
            // InternalGraph.g:1479:4: (otherlv_5= RULE_ID )
            {
            // InternalGraph.g:1479:4: (otherlv_5= RULE_ID )
            // InternalGraph.g:1480:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParticleRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getParticleAccess().getVertexVertexCrossReference_5_0());
            				

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
    // $ANTLR end "ruleParticle"


    // $ANTLR start "entryRuleVertex"
    // InternalGraph.g:1495:1: entryRuleVertex returns [EObject current=null] : iv_ruleVertex= ruleVertex EOF ;
    public final EObject entryRuleVertex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertex = null;


        try {
            // InternalGraph.g:1495:47: (iv_ruleVertex= ruleVertex EOF )
            // InternalGraph.g:1496:2: iv_ruleVertex= ruleVertex EOF
            {
             newCompositeNode(grammarAccess.getVertexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVertex=ruleVertex();

            state._fsp--;

             current =iv_ruleVertex; 
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
    // $ANTLR end "entryRuleVertex"


    // $ANTLR start "ruleVertex"
    // InternalGraph.g:1502:1: ruleVertex returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVertex() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGraph.g:1508:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGraph.g:1509:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGraph.g:1509:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGraph.g:1510:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGraph.g:1510:3: (lv_name_0_0= RULE_ID )
            // InternalGraph.g:1511:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVertexAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVertexRule());
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
    // $ANTLR end "ruleVertex"


    // $ANTLR start "entryRuleEdge"
    // InternalGraph.g:1530:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalGraph.g:1530:45: (iv_ruleEdge= ruleEdge EOF )
            // InternalGraph.g:1531:2: iv_ruleEdge= ruleEdge EOF
            {
             newCompositeNode(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdge=ruleEdge();

            state._fsp--;

             current =iv_ruleEdge; 
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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalGraph.g:1537:1: ruleEdge returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGraph.g:1543:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalGraph.g:1544:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalGraph.g:1544:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalGraph.g:1545:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // InternalGraph.g:1545:3: ( (otherlv_0= RULE_ID ) )
            // InternalGraph.g:1546:4: (otherlv_0= RULE_ID )
            {
            // InternalGraph.g:1546:4: (otherlv_0= RULE_ID )
            // InternalGraph.g:1547:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEdgeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_0, grammarAccess.getEdgeAccess().getSourceVertexCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalGraph.g:1562:3: ( (otherlv_2= RULE_ID ) )
            // InternalGraph.g:1563:4: (otherlv_2= RULE_ID )
            {
            // InternalGraph.g:1563:4: (otherlv_2= RULE_ID )
            // InternalGraph.g:1564:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEdgeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getEdgeAccess().getDestVertexCrossReference_2_0());
            				

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
    // $ANTLR end "ruleEdge"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000014C01010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008F40000000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000016C01010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003F00000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0040000000000000L});

}