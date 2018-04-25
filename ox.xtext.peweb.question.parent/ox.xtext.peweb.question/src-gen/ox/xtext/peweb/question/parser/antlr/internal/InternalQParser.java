package ox.xtext.peweb.question.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ox.xtext.peweb.question.services.QGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Section'", "'{'", "'}'", "'Title'", "'Description'", "'MultipleChoiceQuestion'", "'Answer'", "'TextQuestion'", "'goto'", "'End'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalQParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQ.g"; }



     	private QGrammarAccess grammarAccess;

        public InternalQParser(TokenStream input, QGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Questionnaire";
       	}

       	@Override
       	protected QGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQuestionnaire"
    // InternalQ.g:64:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // InternalQ.g:64:54: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // InternalQ.g:65:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
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
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // InternalQ.g:71:1: ruleQuestionnaire returns [EObject current=null] : ( (lv_sections_0_0= ruleSection ) )* ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject lv_sections_0_0 = null;



        	enterRule();

        try {
            // InternalQ.g:77:2: ( ( (lv_sections_0_0= ruleSection ) )* )
            // InternalQ.g:78:2: ( (lv_sections_0_0= ruleSection ) )*
            {
            // InternalQ.g:78:2: ( (lv_sections_0_0= ruleSection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQ.g:79:3: (lv_sections_0_0= ruleSection )
            	    {
            	    // InternalQ.g:79:3: (lv_sections_0_0= ruleSection )
            	    // InternalQ.g:80:4: lv_sections_0_0= ruleSection
            	    {

            	    				newCompositeNode(grammarAccess.getQuestionnaireAccess().getSectionsSectionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_sections_0_0=ruleSection();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	    				}
            	    				add(
            	    					current,
            	    					"sections",
            	    					lv_sections_0_0,
            	    					"ox.xtext.peweb.question.Q.Section");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleSection"
    // InternalQ.g:100:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalQ.g:100:48: (iv_ruleSection= ruleSection EOF )
            // InternalQ.g:101:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalQ.g:107:1: ruleSection returns [EObject current=null] : (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sectionContents_3_0= ruleSectionContents ) )+ otherlv_4= '}' ( (lv_nextSection_5_0= ruleNextSection ) )? ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sectionContents_3_0 = null;

        EObject lv_nextSection_5_0 = null;



        	enterRule();

        try {
            // InternalQ.g:113:2: ( (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sectionContents_3_0= ruleSectionContents ) )+ otherlv_4= '}' ( (lv_nextSection_5_0= ruleNextSection ) )? ) )
            // InternalQ.g:114:2: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sectionContents_3_0= ruleSectionContents ) )+ otherlv_4= '}' ( (lv_nextSection_5_0= ruleNextSection ) )? )
            {
            // InternalQ.g:114:2: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sectionContents_3_0= ruleSectionContents ) )+ otherlv_4= '}' ( (lv_nextSection_5_0= ruleNextSection ) )? )
            // InternalQ.g:115:3: otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sectionContents_3_0= ruleSectionContents ) )+ otherlv_4= '}' ( (lv_nextSection_5_0= ruleNextSection ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalQ.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQ.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQ.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalQ.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQ.g:141:3: ( (lv_sectionContents_3_0= ruleSectionContents ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=16)||LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQ.g:142:4: (lv_sectionContents_3_0= ruleSectionContents )
            	    {
            	    // InternalQ.g:142:4: (lv_sectionContents_3_0= ruleSectionContents )
            	    // InternalQ.g:143:5: lv_sectionContents_3_0= ruleSectionContents
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getSectionContentsSectionContentsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_sectionContents_3_0=ruleSectionContents();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sectionContents",
            	    						lv_sectionContents_3_0,
            	    						"ox.xtext.peweb.question.Q.SectionContents");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalQ.g:164:3: ( (lv_nextSection_5_0= ruleNextSection ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=19 && LA3_0<=20)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQ.g:165:4: (lv_nextSection_5_0= ruleNextSection )
                    {
                    // InternalQ.g:165:4: (lv_nextSection_5_0= ruleNextSection )
                    // InternalQ.g:166:5: lv_nextSection_5_0= ruleNextSection
                    {

                    					newCompositeNode(grammarAccess.getSectionAccess().getNextSectionNextSectionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_nextSection_5_0=ruleNextSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSectionRule());
                    					}
                    					set(
                    						current,
                    						"nextSection",
                    						lv_nextSection_5_0,
                    						"ox.xtext.peweb.question.Q.NextSection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSectionContents"
    // InternalQ.g:187:1: entryRuleSectionContents returns [EObject current=null] : iv_ruleSectionContents= ruleSectionContents EOF ;
    public final EObject entryRuleSectionContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionContents = null;


        try {
            // InternalQ.g:187:56: (iv_ruleSectionContents= ruleSectionContents EOF )
            // InternalQ.g:188:2: iv_ruleSectionContents= ruleSectionContents EOF
            {
             newCompositeNode(grammarAccess.getSectionContentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionContents=ruleSectionContents();

            state._fsp--;

             current =iv_ruleSectionContents; 
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
    // $ANTLR end "entryRuleSectionContents"


    // $ANTLR start "ruleSectionContents"
    // InternalQ.g:194:1: ruleSectionContents returns [EObject current=null] : (this_Question_0= ruleQuestion | this_Title_1= ruleTitle | this_Description_2= ruleDescription ) ;
    public final EObject ruleSectionContents() throws RecognitionException {
        EObject current = null;

        EObject this_Question_0 = null;

        EObject this_Title_1 = null;

        EObject this_Description_2 = null;



        	enterRule();

        try {
            // InternalQ.g:200:2: ( (this_Question_0= ruleQuestion | this_Title_1= ruleTitle | this_Description_2= ruleDescription ) )
            // InternalQ.g:201:2: (this_Question_0= ruleQuestion | this_Title_1= ruleTitle | this_Description_2= ruleDescription )
            {
            // InternalQ.g:201:2: (this_Question_0= ruleQuestion | this_Title_1= ruleTitle | this_Description_2= ruleDescription )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
            case 18:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalQ.g:202:3: this_Question_0= ruleQuestion
                    {

                    			newCompositeNode(grammarAccess.getSectionContentsAccess().getQuestionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Question_0=ruleQuestion();

                    state._fsp--;


                    			current = this_Question_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQ.g:211:3: this_Title_1= ruleTitle
                    {

                    			newCompositeNode(grammarAccess.getSectionContentsAccess().getTitleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Title_1=ruleTitle();

                    state._fsp--;


                    			current = this_Title_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQ.g:220:3: this_Description_2= ruleDescription
                    {

                    			newCompositeNode(grammarAccess.getSectionContentsAccess().getDescriptionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Description_2=ruleDescription();

                    state._fsp--;


                    			current = this_Description_2;
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
    // $ANTLR end "ruleSectionContents"


    // $ANTLR start "entryRuleTitle"
    // InternalQ.g:232:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalQ.g:232:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalQ.g:233:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalQ.g:239:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'Title' ( (lv_title_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;


        	enterRule();

        try {
            // InternalQ.g:245:2: ( (otherlv_0= 'Title' ( (lv_title_1_0= RULE_STRING ) ) ) )
            // InternalQ.g:246:2: (otherlv_0= 'Title' ( (lv_title_1_0= RULE_STRING ) ) )
            {
            // InternalQ.g:246:2: (otherlv_0= 'Title' ( (lv_title_1_0= RULE_STRING ) ) )
            // InternalQ.g:247:3: otherlv_0= 'Title' ( (lv_title_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
            		
            // InternalQ.g:251:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalQ.g:252:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalQ.g:252:4: (lv_title_1_0= RULE_STRING )
            // InternalQ.g:253:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_title_1_0, grammarAccess.getTitleAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleDescription"
    // InternalQ.g:273:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalQ.g:273:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalQ.g:274:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalQ.g:280:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'Description' ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;


        	enterRule();

        try {
            // InternalQ.g:286:2: ( (otherlv_0= 'Description' ( (lv_description_1_0= RULE_STRING ) ) ) )
            // InternalQ.g:287:2: (otherlv_0= 'Description' ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // InternalQ.g:287:2: (otherlv_0= 'Description' ( (lv_description_1_0= RULE_STRING ) ) )
            // InternalQ.g:288:3: otherlv_0= 'Description' ( (lv_description_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalQ.g:292:3: ( (lv_description_1_0= RULE_STRING ) )
            // InternalQ.g:293:4: (lv_description_1_0= RULE_STRING )
            {
            // InternalQ.g:293:4: (lv_description_1_0= RULE_STRING )
            // InternalQ.g:294:5: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_1_0, grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleQuestion"
    // InternalQ.g:314:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalQ.g:314:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalQ.g:315:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalQ.g:321:1: ruleQuestion returns [EObject current=null] : (this_MultipleChoiceQuestion_0= ruleMultipleChoiceQuestion | this_TextQuestion_1= ruleTextQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_MultipleChoiceQuestion_0 = null;

        EObject this_TextQuestion_1 = null;



        	enterRule();

        try {
            // InternalQ.g:327:2: ( (this_MultipleChoiceQuestion_0= ruleMultipleChoiceQuestion | this_TextQuestion_1= ruleTextQuestion ) )
            // InternalQ.g:328:2: (this_MultipleChoiceQuestion_0= ruleMultipleChoiceQuestion | this_TextQuestion_1= ruleTextQuestion )
            {
            // InternalQ.g:328:2: (this_MultipleChoiceQuestion_0= ruleMultipleChoiceQuestion | this_TextQuestion_1= ruleTextQuestion )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQ.g:329:3: this_MultipleChoiceQuestion_0= ruleMultipleChoiceQuestion
                    {

                    			newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoiceQuestionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultipleChoiceQuestion_0=ruleMultipleChoiceQuestion();

                    state._fsp--;


                    			current = this_MultipleChoiceQuestion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQ.g:338:3: this_TextQuestion_1= ruleTextQuestion
                    {

                    			newCompositeNode(grammarAccess.getQuestionAccess().getTextQuestionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextQuestion_1=ruleTextQuestion();

                    state._fsp--;


                    			current = this_TextQuestion_1;
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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleMultipleChoiceQuestion"
    // InternalQ.g:350:1: entryRuleMultipleChoiceQuestion returns [EObject current=null] : iv_ruleMultipleChoiceQuestion= ruleMultipleChoiceQuestion EOF ;
    public final EObject entryRuleMultipleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoiceQuestion = null;


        try {
            // InternalQ.g:350:63: (iv_ruleMultipleChoiceQuestion= ruleMultipleChoiceQuestion EOF )
            // InternalQ.g:351:2: iv_ruleMultipleChoiceQuestion= ruleMultipleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleChoiceQuestion=ruleMultipleChoiceQuestion();

            state._fsp--;

             current =iv_ruleMultipleChoiceQuestion; 
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
    // $ANTLR end "entryRuleMultipleChoiceQuestion"


    // $ANTLR start "ruleMultipleChoiceQuestion"
    // InternalQ.g:357:1: ruleMultipleChoiceQuestion returns [EObject current=null] : (otherlv_0= 'MultipleChoiceQuestion' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_answers_3_0= ruleMultipleChoiceAnswer ) )* otherlv_4= '}' ) ;
    public final EObject ruleMultipleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_question_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_answers_3_0 = null;



        	enterRule();

        try {
            // InternalQ.g:363:2: ( (otherlv_0= 'MultipleChoiceQuestion' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_answers_3_0= ruleMultipleChoiceAnswer ) )* otherlv_4= '}' ) )
            // InternalQ.g:364:2: (otherlv_0= 'MultipleChoiceQuestion' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_answers_3_0= ruleMultipleChoiceAnswer ) )* otherlv_4= '}' )
            {
            // InternalQ.g:364:2: (otherlv_0= 'MultipleChoiceQuestion' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_answers_3_0= ruleMultipleChoiceAnswer ) )* otherlv_4= '}' )
            // InternalQ.g:365:3: otherlv_0= 'MultipleChoiceQuestion' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_answers_3_0= ruleMultipleChoiceAnswer ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleChoiceQuestionAccess().getMultipleChoiceQuestionKeyword_0());
            		
            // InternalQ.g:369:3: ( (lv_question_1_0= RULE_STRING ) )
            // InternalQ.g:370:4: (lv_question_1_0= RULE_STRING )
            {
            // InternalQ.g:370:4: (lv_question_1_0= RULE_STRING )
            // InternalQ.g:371:5: lv_question_1_0= RULE_STRING
            {
            lv_question_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_question_1_0, grammarAccess.getMultipleChoiceQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleChoiceQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"question",
            						lv_question_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleChoiceQuestionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQ.g:391:3: ( (lv_answers_3_0= ruleMultipleChoiceAnswer ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalQ.g:392:4: (lv_answers_3_0= ruleMultipleChoiceAnswer )
            	    {
            	    // InternalQ.g:392:4: (lv_answers_3_0= ruleMultipleChoiceAnswer )
            	    // InternalQ.g:393:5: lv_answers_3_0= ruleMultipleChoiceAnswer
            	    {

            	    					newCompositeNode(grammarAccess.getMultipleChoiceQuestionAccess().getAnswersMultipleChoiceAnswerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_answers_3_0=ruleMultipleChoiceAnswer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMultipleChoiceQuestionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"answers",
            	    						lv_answers_3_0,
            	    						"ox.xtext.peweb.question.Q.MultipleChoiceAnswer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMultipleChoiceQuestionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMultipleChoiceQuestion"


    // $ANTLR start "entryRuleMultipleChoiceAnswer"
    // InternalQ.g:418:1: entryRuleMultipleChoiceAnswer returns [EObject current=null] : iv_ruleMultipleChoiceAnswer= ruleMultipleChoiceAnswer EOF ;
    public final EObject entryRuleMultipleChoiceAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoiceAnswer = null;


        try {
            // InternalQ.g:418:61: (iv_ruleMultipleChoiceAnswer= ruleMultipleChoiceAnswer EOF )
            // InternalQ.g:419:2: iv_ruleMultipleChoiceAnswer= ruleMultipleChoiceAnswer EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleChoiceAnswer=ruleMultipleChoiceAnswer();

            state._fsp--;

             current =iv_ruleMultipleChoiceAnswer; 
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
    // $ANTLR end "entryRuleMultipleChoiceAnswer"


    // $ANTLR start "ruleMultipleChoiceAnswer"
    // InternalQ.g:425:1: ruleMultipleChoiceAnswer returns [EObject current=null] : (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ( (lv_goto_2_0= ruleSectionReference ) )? ) ;
    public final EObject ruleMultipleChoiceAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_answer_1_0=null;
        EObject lv_goto_2_0 = null;



        	enterRule();

        try {
            // InternalQ.g:431:2: ( (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ( (lv_goto_2_0= ruleSectionReference ) )? ) )
            // InternalQ.g:432:2: (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ( (lv_goto_2_0= ruleSectionReference ) )? )
            {
            // InternalQ.g:432:2: (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ( (lv_goto_2_0= ruleSectionReference ) )? )
            // InternalQ.g:433:3: otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ( (lv_goto_2_0= ruleSectionReference ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleChoiceAnswerAccess().getAnswerKeyword_0());
            		
            // InternalQ.g:437:3: ( (lv_answer_1_0= RULE_STRING ) )
            // InternalQ.g:438:4: (lv_answer_1_0= RULE_STRING )
            {
            // InternalQ.g:438:4: (lv_answer_1_0= RULE_STRING )
            // InternalQ.g:439:5: lv_answer_1_0= RULE_STRING
            {
            lv_answer_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_answer_1_0, grammarAccess.getMultipleChoiceAnswerAccess().getAnswerSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleChoiceAnswerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalQ.g:455:3: ( (lv_goto_2_0= ruleSectionReference ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQ.g:456:4: (lv_goto_2_0= ruleSectionReference )
                    {
                    // InternalQ.g:456:4: (lv_goto_2_0= ruleSectionReference )
                    // InternalQ.g:457:5: lv_goto_2_0= ruleSectionReference
                    {

                    					newCompositeNode(grammarAccess.getMultipleChoiceAnswerAccess().getGotoSectionReferenceParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_goto_2_0=ruleSectionReference();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMultipleChoiceAnswerRule());
                    					}
                    					set(
                    						current,
                    						"goto",
                    						lv_goto_2_0,
                    						"ox.xtext.peweb.question.Q.SectionReference");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleMultipleChoiceAnswer"


    // $ANTLR start "entryRuleTextQuestion"
    // InternalQ.g:478:1: entryRuleTextQuestion returns [EObject current=null] : iv_ruleTextQuestion= ruleTextQuestion EOF ;
    public final EObject entryRuleTextQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextQuestion = null;


        try {
            // InternalQ.g:478:53: (iv_ruleTextQuestion= ruleTextQuestion EOF )
            // InternalQ.g:479:2: iv_ruleTextQuestion= ruleTextQuestion EOF
            {
             newCompositeNode(grammarAccess.getTextQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextQuestion=ruleTextQuestion();

            state._fsp--;

             current =iv_ruleTextQuestion; 
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
    // $ANTLR end "entryRuleTextQuestion"


    // $ANTLR start "ruleTextQuestion"
    // InternalQ.g:485:1: ruleTextQuestion returns [EObject current=null] : (otherlv_0= 'TextQuestion' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '{' otherlv_4= '}' )? ) ;
    public final EObject ruleTextQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_question_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQ.g:491:2: ( (otherlv_0= 'TextQuestion' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '{' otherlv_4= '}' )? ) )
            // InternalQ.g:492:2: (otherlv_0= 'TextQuestion' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '{' otherlv_4= '}' )? )
            {
            // InternalQ.g:492:2: (otherlv_0= 'TextQuestion' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '{' otherlv_4= '}' )? )
            // InternalQ.g:493:3: otherlv_0= 'TextQuestion' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '{' otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTextQuestionAccess().getTextQuestionKeyword_0());
            		
            // InternalQ.g:497:3: ( (lv_question_1_0= RULE_STRING ) )
            // InternalQ.g:498:4: (lv_question_1_0= RULE_STRING )
            {
            // InternalQ.g:498:4: (lv_question_1_0= RULE_STRING )
            // InternalQ.g:499:5: lv_question_1_0= RULE_STRING
            {
            lv_question_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_question_1_0, grammarAccess.getTextQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"question",
            						lv_question_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalQ.g:515:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQ.g:516:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalQ.g:516:4: (lv_description_2_0= RULE_STRING )
                    // InternalQ.g:517:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getTextQuestionAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextQuestionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalQ.g:533:3: (otherlv_3= '{' otherlv_4= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQ.g:534:4: otherlv_3= '{' otherlv_4= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getTextQuestionAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextQuestionAccess().getRightCurlyBracketKeyword_3_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleTextQuestion"


    // $ANTLR start "entryRuleNextSection"
    // InternalQ.g:547:1: entryRuleNextSection returns [EObject current=null] : iv_ruleNextSection= ruleNextSection EOF ;
    public final EObject entryRuleNextSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextSection = null;


        try {
            // InternalQ.g:547:52: (iv_ruleNextSection= ruleNextSection EOF )
            // InternalQ.g:548:2: iv_ruleNextSection= ruleNextSection EOF
            {
             newCompositeNode(grammarAccess.getNextSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNextSection=ruleNextSection();

            state._fsp--;

             current =iv_ruleNextSection; 
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
    // $ANTLR end "entryRuleNextSection"


    // $ANTLR start "ruleNextSection"
    // InternalQ.g:554:1: ruleNextSection returns [EObject current=null] : (this_SectionReference_0= ruleSectionReference | ( () ruleEndOfQuestionnaire ) ) ;
    public final EObject ruleNextSection() throws RecognitionException {
        EObject current = null;

        EObject this_SectionReference_0 = null;



        	enterRule();

        try {
            // InternalQ.g:560:2: ( (this_SectionReference_0= ruleSectionReference | ( () ruleEndOfQuestionnaire ) ) )
            // InternalQ.g:561:2: (this_SectionReference_0= ruleSectionReference | ( () ruleEndOfQuestionnaire ) )
            {
            // InternalQ.g:561:2: (this_SectionReference_0= ruleSectionReference | ( () ruleEndOfQuestionnaire ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQ.g:562:3: this_SectionReference_0= ruleSectionReference
                    {

                    			newCompositeNode(grammarAccess.getNextSectionAccess().getSectionReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SectionReference_0=ruleSectionReference();

                    state._fsp--;


                    			current = this_SectionReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQ.g:571:3: ( () ruleEndOfQuestionnaire )
                    {
                    // InternalQ.g:571:3: ( () ruleEndOfQuestionnaire )
                    // InternalQ.g:572:4: () ruleEndOfQuestionnaire
                    {
                    // InternalQ.g:572:4: ()
                    // InternalQ.g:573:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNextSectionAccess().getEndOfQuestionnaireAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getNextSectionAccess().getEndOfQuestionnaireParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleEndOfQuestionnaire();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleNextSection"


    // $ANTLR start "entryRuleSectionReference"
    // InternalQ.g:591:1: entryRuleSectionReference returns [EObject current=null] : iv_ruleSectionReference= ruleSectionReference EOF ;
    public final EObject entryRuleSectionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionReference = null;


        try {
            // InternalQ.g:591:57: (iv_ruleSectionReference= ruleSectionReference EOF )
            // InternalQ.g:592:2: iv_ruleSectionReference= ruleSectionReference EOF
            {
             newCompositeNode(grammarAccess.getSectionReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionReference=ruleSectionReference();

            state._fsp--;

             current =iv_ruleSectionReference; 
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
    // $ANTLR end "entryRuleSectionReference"


    // $ANTLR start "ruleSectionReference"
    // InternalQ.g:598:1: ruleSectionReference returns [EObject current=null] : (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSectionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalQ.g:604:2: ( (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalQ.g:605:2: (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalQ.g:605:2: (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) )
            // InternalQ.g:606:3: otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionReferenceAccess().getGotoKeyword_0());
            		
            // InternalQ.g:610:3: ( (otherlv_1= RULE_ID ) )
            // InternalQ.g:611:4: (otherlv_1= RULE_ID )
            {
            // InternalQ.g:611:4: (otherlv_1= RULE_ID )
            // InternalQ.g:612:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSectionReferenceAccess().getSectionSectionCrossReference_1_0());
            				

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
    // $ANTLR end "ruleSectionReference"


    // $ANTLR start "entryRuleEndOfQuestionnaire"
    // InternalQ.g:627:1: entryRuleEndOfQuestionnaire returns [String current=null] : iv_ruleEndOfQuestionnaire= ruleEndOfQuestionnaire EOF ;
    public final String entryRuleEndOfQuestionnaire() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndOfQuestionnaire = null;


        try {
            // InternalQ.g:627:58: (iv_ruleEndOfQuestionnaire= ruleEndOfQuestionnaire EOF )
            // InternalQ.g:628:2: iv_ruleEndOfQuestionnaire= ruleEndOfQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getEndOfQuestionnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndOfQuestionnaire=ruleEndOfQuestionnaire();

            state._fsp--;

             current =iv_ruleEndOfQuestionnaire.getText(); 
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
    // $ANTLR end "entryRuleEndOfQuestionnaire"


    // $ANTLR start "ruleEndOfQuestionnaire"
    // InternalQ.g:634:1: ruleEndOfQuestionnaire returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'End' ;
    public final AntlrDatatypeRuleToken ruleEndOfQuestionnaire() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQ.g:640:2: (kw= 'End' )
            // InternalQ.g:641:2: kw= 'End'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEndOfQuestionnaireAccess().getEndKeyword());
            	

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
    // $ANTLR end "ruleEndOfQuestionnaire"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000005C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000005E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});

}