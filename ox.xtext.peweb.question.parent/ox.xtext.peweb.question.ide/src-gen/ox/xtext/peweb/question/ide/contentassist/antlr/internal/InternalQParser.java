package ox.xtext.peweb.question.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ox.xtext.peweb.question.services.QGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'End'", "'Section'", "'{'", "'}'", "'Title'", "'Description'", "'MultipleChoiceQuestion'", "'Answer'", "'TextQuestion'", "'goto'"
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

    	public void setGrammarAccess(QGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleQuestionnaire"
    // InternalQ.g:53:1: entryRuleQuestionnaire : ruleQuestionnaire EOF ;
    public final void entryRuleQuestionnaire() throws RecognitionException {
        try {
            // InternalQ.g:54:1: ( ruleQuestionnaire EOF )
            // InternalQ.g:55:1: ruleQuestionnaire EOF
            {
             before(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionnaire();

            state._fsp--;

             after(grammarAccess.getQuestionnaireRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // InternalQ.g:62:1: ruleQuestionnaire : ( ( rule__Questionnaire__SectionsAssignment )* ) ;
    public final void ruleQuestionnaire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:66:2: ( ( ( rule__Questionnaire__SectionsAssignment )* ) )
            // InternalQ.g:67:2: ( ( rule__Questionnaire__SectionsAssignment )* )
            {
            // InternalQ.g:67:2: ( ( rule__Questionnaire__SectionsAssignment )* )
            // InternalQ.g:68:3: ( rule__Questionnaire__SectionsAssignment )*
            {
             before(grammarAccess.getQuestionnaireAccess().getSectionsAssignment()); 
            // InternalQ.g:69:3: ( rule__Questionnaire__SectionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQ.g:69:4: rule__Questionnaire__SectionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Questionnaire__SectionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getQuestionnaireAccess().getSectionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleSection"
    // InternalQ.g:78:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalQ.g:79:1: ( ruleSection EOF )
            // InternalQ.g:80:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalQ.g:87:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:91:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalQ.g:92:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalQ.g:92:2: ( ( rule__Section__Group__0 ) )
            // InternalQ.g:93:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalQ.g:94:3: ( rule__Section__Group__0 )
            // InternalQ.g:94:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSectionContents"
    // InternalQ.g:103:1: entryRuleSectionContents : ruleSectionContents EOF ;
    public final void entryRuleSectionContents() throws RecognitionException {
        try {
            // InternalQ.g:104:1: ( ruleSectionContents EOF )
            // InternalQ.g:105:1: ruleSectionContents EOF
            {
             before(grammarAccess.getSectionContentsRule()); 
            pushFollow(FOLLOW_1);
            ruleSectionContents();

            state._fsp--;

             after(grammarAccess.getSectionContentsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSectionContents"


    // $ANTLR start "ruleSectionContents"
    // InternalQ.g:112:1: ruleSectionContents : ( ( rule__SectionContents__Alternatives ) ) ;
    public final void ruleSectionContents() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:116:2: ( ( ( rule__SectionContents__Alternatives ) ) )
            // InternalQ.g:117:2: ( ( rule__SectionContents__Alternatives ) )
            {
            // InternalQ.g:117:2: ( ( rule__SectionContents__Alternatives ) )
            // InternalQ.g:118:3: ( rule__SectionContents__Alternatives )
            {
             before(grammarAccess.getSectionContentsAccess().getAlternatives()); 
            // InternalQ.g:119:3: ( rule__SectionContents__Alternatives )
            // InternalQ.g:119:4: rule__SectionContents__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SectionContents__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionContentsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSectionContents"


    // $ANTLR start "entryRuleTitle"
    // InternalQ.g:128:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalQ.g:129:1: ( ruleTitle EOF )
            // InternalQ.g:130:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalQ.g:137:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:141:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalQ.g:142:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalQ.g:142:2: ( ( rule__Title__Group__0 ) )
            // InternalQ.g:143:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalQ.g:144:3: ( rule__Title__Group__0 )
            // InternalQ.g:144:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleDescription"
    // InternalQ.g:153:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalQ.g:154:1: ( ruleDescription EOF )
            // InternalQ.g:155:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalQ.g:162:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:166:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalQ.g:167:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalQ.g:167:2: ( ( rule__Description__Group__0 ) )
            // InternalQ.g:168:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalQ.g:169:3: ( rule__Description__Group__0 )
            // InternalQ.g:169:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleQuestion"
    // InternalQ.g:178:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalQ.g:179:1: ( ruleQuestion EOF )
            // InternalQ.g:180:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalQ.g:187:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:191:2: ( ( ( rule__Question__Alternatives ) ) )
            // InternalQ.g:192:2: ( ( rule__Question__Alternatives ) )
            {
            // InternalQ.g:192:2: ( ( rule__Question__Alternatives ) )
            // InternalQ.g:193:3: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // InternalQ.g:194:3: ( rule__Question__Alternatives )
            // InternalQ.g:194:4: rule__Question__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleMultipleChoiceQuestion"
    // InternalQ.g:203:1: entryRuleMultipleChoiceQuestion : ruleMultipleChoiceQuestion EOF ;
    public final void entryRuleMultipleChoiceQuestion() throws RecognitionException {
        try {
            // InternalQ.g:204:1: ( ruleMultipleChoiceQuestion EOF )
            // InternalQ.g:205:1: ruleMultipleChoiceQuestion EOF
            {
             before(grammarAccess.getMultipleChoiceQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultipleChoiceQuestion();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultipleChoiceQuestion"


    // $ANTLR start "ruleMultipleChoiceQuestion"
    // InternalQ.g:212:1: ruleMultipleChoiceQuestion : ( ( rule__MultipleChoiceQuestion__Group__0 ) ) ;
    public final void ruleMultipleChoiceQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:216:2: ( ( ( rule__MultipleChoiceQuestion__Group__0 ) ) )
            // InternalQ.g:217:2: ( ( rule__MultipleChoiceQuestion__Group__0 ) )
            {
            // InternalQ.g:217:2: ( ( rule__MultipleChoiceQuestion__Group__0 ) )
            // InternalQ.g:218:3: ( rule__MultipleChoiceQuestion__Group__0 )
            {
             before(grammarAccess.getMultipleChoiceQuestionAccess().getGroup()); 
            // InternalQ.g:219:3: ( rule__MultipleChoiceQuestion__Group__0 )
            // InternalQ.g:219:4: rule__MultipleChoiceQuestion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultipleChoiceQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultipleChoiceQuestion"


    // $ANTLR start "entryRuleMultipleChoiceAnswer"
    // InternalQ.g:228:1: entryRuleMultipleChoiceAnswer : ruleMultipleChoiceAnswer EOF ;
    public final void entryRuleMultipleChoiceAnswer() throws RecognitionException {
        try {
            // InternalQ.g:229:1: ( ruleMultipleChoiceAnswer EOF )
            // InternalQ.g:230:1: ruleMultipleChoiceAnswer EOF
            {
             before(grammarAccess.getMultipleChoiceAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleMultipleChoiceAnswer();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultipleChoiceAnswer"


    // $ANTLR start "ruleMultipleChoiceAnswer"
    // InternalQ.g:237:1: ruleMultipleChoiceAnswer : ( ( rule__MultipleChoiceAnswer__Group__0 ) ) ;
    public final void ruleMultipleChoiceAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:241:2: ( ( ( rule__MultipleChoiceAnswer__Group__0 ) ) )
            // InternalQ.g:242:2: ( ( rule__MultipleChoiceAnswer__Group__0 ) )
            {
            // InternalQ.g:242:2: ( ( rule__MultipleChoiceAnswer__Group__0 ) )
            // InternalQ.g:243:3: ( rule__MultipleChoiceAnswer__Group__0 )
            {
             before(grammarAccess.getMultipleChoiceAnswerAccess().getGroup()); 
            // InternalQ.g:244:3: ( rule__MultipleChoiceAnswer__Group__0 )
            // InternalQ.g:244:4: rule__MultipleChoiceAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultipleChoiceAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultipleChoiceAnswer"


    // $ANTLR start "entryRuleTextQuestion"
    // InternalQ.g:253:1: entryRuleTextQuestion : ruleTextQuestion EOF ;
    public final void entryRuleTextQuestion() throws RecognitionException {
        try {
            // InternalQ.g:254:1: ( ruleTextQuestion EOF )
            // InternalQ.g:255:1: ruleTextQuestion EOF
            {
             before(grammarAccess.getTextQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleTextQuestion();

            state._fsp--;

             after(grammarAccess.getTextQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextQuestion"


    // $ANTLR start "ruleTextQuestion"
    // InternalQ.g:262:1: ruleTextQuestion : ( ( rule__TextQuestion__Group__0 ) ) ;
    public final void ruleTextQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:266:2: ( ( ( rule__TextQuestion__Group__0 ) ) )
            // InternalQ.g:267:2: ( ( rule__TextQuestion__Group__0 ) )
            {
            // InternalQ.g:267:2: ( ( rule__TextQuestion__Group__0 ) )
            // InternalQ.g:268:3: ( rule__TextQuestion__Group__0 )
            {
             before(grammarAccess.getTextQuestionAccess().getGroup()); 
            // InternalQ.g:269:3: ( rule__TextQuestion__Group__0 )
            // InternalQ.g:269:4: rule__TextQuestion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextQuestion"


    // $ANTLR start "entryRuleNextSection"
    // InternalQ.g:278:1: entryRuleNextSection : ruleNextSection EOF ;
    public final void entryRuleNextSection() throws RecognitionException {
        try {
            // InternalQ.g:279:1: ( ruleNextSection EOF )
            // InternalQ.g:280:1: ruleNextSection EOF
            {
             before(grammarAccess.getNextSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleNextSection();

            state._fsp--;

             after(grammarAccess.getNextSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNextSection"


    // $ANTLR start "ruleNextSection"
    // InternalQ.g:287:1: ruleNextSection : ( ( rule__NextSection__Alternatives ) ) ;
    public final void ruleNextSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:291:2: ( ( ( rule__NextSection__Alternatives ) ) )
            // InternalQ.g:292:2: ( ( rule__NextSection__Alternatives ) )
            {
            // InternalQ.g:292:2: ( ( rule__NextSection__Alternatives ) )
            // InternalQ.g:293:3: ( rule__NextSection__Alternatives )
            {
             before(grammarAccess.getNextSectionAccess().getAlternatives()); 
            // InternalQ.g:294:3: ( rule__NextSection__Alternatives )
            // InternalQ.g:294:4: rule__NextSection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NextSection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNextSectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNextSection"


    // $ANTLR start "entryRuleSectionReference"
    // InternalQ.g:303:1: entryRuleSectionReference : ruleSectionReference EOF ;
    public final void entryRuleSectionReference() throws RecognitionException {
        try {
            // InternalQ.g:304:1: ( ruleSectionReference EOF )
            // InternalQ.g:305:1: ruleSectionReference EOF
            {
             before(grammarAccess.getSectionReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSectionReference();

            state._fsp--;

             after(grammarAccess.getSectionReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSectionReference"


    // $ANTLR start "ruleSectionReference"
    // InternalQ.g:312:1: ruleSectionReference : ( ( rule__SectionReference__Group__0 ) ) ;
    public final void ruleSectionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:316:2: ( ( ( rule__SectionReference__Group__0 ) ) )
            // InternalQ.g:317:2: ( ( rule__SectionReference__Group__0 ) )
            {
            // InternalQ.g:317:2: ( ( rule__SectionReference__Group__0 ) )
            // InternalQ.g:318:3: ( rule__SectionReference__Group__0 )
            {
             before(grammarAccess.getSectionReferenceAccess().getGroup()); 
            // InternalQ.g:319:3: ( rule__SectionReference__Group__0 )
            // InternalQ.g:319:4: rule__SectionReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SectionReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSectionReference"


    // $ANTLR start "entryRuleEndOfQuestionnaire"
    // InternalQ.g:328:1: entryRuleEndOfQuestionnaire : ruleEndOfQuestionnaire EOF ;
    public final void entryRuleEndOfQuestionnaire() throws RecognitionException {
        try {
            // InternalQ.g:329:1: ( ruleEndOfQuestionnaire EOF )
            // InternalQ.g:330:1: ruleEndOfQuestionnaire EOF
            {
             before(grammarAccess.getEndOfQuestionnaireRule()); 
            pushFollow(FOLLOW_1);
            ruleEndOfQuestionnaire();

            state._fsp--;

             after(grammarAccess.getEndOfQuestionnaireRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndOfQuestionnaire"


    // $ANTLR start "ruleEndOfQuestionnaire"
    // InternalQ.g:337:1: ruleEndOfQuestionnaire : ( 'End' ) ;
    public final void ruleEndOfQuestionnaire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:341:2: ( ( 'End' ) )
            // InternalQ.g:342:2: ( 'End' )
            {
            // InternalQ.g:342:2: ( 'End' )
            // InternalQ.g:343:3: 'End'
            {
             before(grammarAccess.getEndOfQuestionnaireAccess().getEndKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEndOfQuestionnaireAccess().getEndKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndOfQuestionnaire"


    // $ANTLR start "rule__SectionContents__Alternatives"
    // InternalQ.g:352:1: rule__SectionContents__Alternatives : ( ( ruleQuestion ) | ( ruleTitle ) | ( ruleDescription ) );
    public final void rule__SectionContents__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:356:1: ( ( ruleQuestion ) | ( ruleTitle ) | ( ruleDescription ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
            case 19:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQ.g:357:2: ( ruleQuestion )
                    {
                    // InternalQ.g:357:2: ( ruleQuestion )
                    // InternalQ.g:358:3: ruleQuestion
                    {
                     before(grammarAccess.getSectionContentsAccess().getQuestionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestion();

                    state._fsp--;

                     after(grammarAccess.getSectionContentsAccess().getQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQ.g:363:2: ( ruleTitle )
                    {
                    // InternalQ.g:363:2: ( ruleTitle )
                    // InternalQ.g:364:3: ruleTitle
                    {
                     before(grammarAccess.getSectionContentsAccess().getTitleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTitle();

                    state._fsp--;

                     after(grammarAccess.getSectionContentsAccess().getTitleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQ.g:369:2: ( ruleDescription )
                    {
                    // InternalQ.g:369:2: ( ruleDescription )
                    // InternalQ.g:370:3: ruleDescription
                    {
                     before(grammarAccess.getSectionContentsAccess().getDescriptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDescription();

                    state._fsp--;

                     after(grammarAccess.getSectionContentsAccess().getDescriptionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionContents__Alternatives"


    // $ANTLR start "rule__Question__Alternatives"
    // InternalQ.g:379:1: rule__Question__Alternatives : ( ( ruleMultipleChoiceQuestion ) | ( ruleTextQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:383:1: ( ( ruleMultipleChoiceQuestion ) | ( ruleTextQuestion ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQ.g:384:2: ( ruleMultipleChoiceQuestion )
                    {
                    // InternalQ.g:384:2: ( ruleMultipleChoiceQuestion )
                    // InternalQ.g:385:3: ruleMultipleChoiceQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getMultipleChoiceQuestionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMultipleChoiceQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getMultipleChoiceQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQ.g:390:2: ( ruleTextQuestion )
                    {
                    // InternalQ.g:390:2: ( ruleTextQuestion )
                    // InternalQ.g:391:3: ruleTextQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getTextQuestionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTextQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getTextQuestionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__NextSection__Alternatives"
    // InternalQ.g:400:1: rule__NextSection__Alternatives : ( ( ruleSectionReference ) | ( ( rule__NextSection__Group_1__0 ) ) );
    public final void rule__NextSection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:404:1: ( ( ruleSectionReference ) | ( ( rule__NextSection__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQ.g:405:2: ( ruleSectionReference )
                    {
                    // InternalQ.g:405:2: ( ruleSectionReference )
                    // InternalQ.g:406:3: ruleSectionReference
                    {
                     before(grammarAccess.getNextSectionAccess().getSectionReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSectionReference();

                    state._fsp--;

                     after(grammarAccess.getNextSectionAccess().getSectionReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQ.g:411:2: ( ( rule__NextSection__Group_1__0 ) )
                    {
                    // InternalQ.g:411:2: ( ( rule__NextSection__Group_1__0 ) )
                    // InternalQ.g:412:3: ( rule__NextSection__Group_1__0 )
                    {
                     before(grammarAccess.getNextSectionAccess().getGroup_1()); 
                    // InternalQ.g:413:3: ( rule__NextSection__Group_1__0 )
                    // InternalQ.g:413:4: rule__NextSection__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NextSection__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNextSectionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NextSection__Alternatives"


    // $ANTLR start "rule__Section__Group__0"
    // InternalQ.g:421:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:425:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalQ.g:426:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalQ.g:433:1: rule__Section__Group__0__Impl : ( 'Section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:437:1: ( ( 'Section' ) )
            // InternalQ.g:438:1: ( 'Section' )
            {
            // InternalQ.g:438:1: ( 'Section' )
            // InternalQ.g:439:2: 'Section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalQ.g:448:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:452:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalQ.g:453:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalQ.g:460:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:464:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalQ.g:465:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalQ.g:465:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalQ.g:466:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalQ.g:467:2: ( rule__Section__NameAssignment_1 )
            // InternalQ.g:467:3: rule__Section__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalQ.g:475:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:479:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalQ.g:480:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalQ.g:487:1: rule__Section__Group__2__Impl : ( '{' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:491:1: ( ( '{' ) )
            // InternalQ.g:492:1: ( '{' )
            {
            // InternalQ.g:492:1: ( '{' )
            // InternalQ.g:493:2: '{'
            {
             before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalQ.g:502:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:506:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalQ.g:507:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalQ.g:514:1: rule__Section__Group__3__Impl : ( ( ( rule__Section__SectionContentsAssignment_3 ) ) ( ( rule__Section__SectionContentsAssignment_3 )* ) ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:518:1: ( ( ( ( rule__Section__SectionContentsAssignment_3 ) ) ( ( rule__Section__SectionContentsAssignment_3 )* ) ) )
            // InternalQ.g:519:1: ( ( ( rule__Section__SectionContentsAssignment_3 ) ) ( ( rule__Section__SectionContentsAssignment_3 )* ) )
            {
            // InternalQ.g:519:1: ( ( ( rule__Section__SectionContentsAssignment_3 ) ) ( ( rule__Section__SectionContentsAssignment_3 )* ) )
            // InternalQ.g:520:2: ( ( rule__Section__SectionContentsAssignment_3 ) ) ( ( rule__Section__SectionContentsAssignment_3 )* )
            {
            // InternalQ.g:520:2: ( ( rule__Section__SectionContentsAssignment_3 ) )
            // InternalQ.g:521:3: ( rule__Section__SectionContentsAssignment_3 )
            {
             before(grammarAccess.getSectionAccess().getSectionContentsAssignment_3()); 
            // InternalQ.g:522:3: ( rule__Section__SectionContentsAssignment_3 )
            // InternalQ.g:522:4: rule__Section__SectionContentsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Section__SectionContentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getSectionContentsAssignment_3()); 

            }

            // InternalQ.g:525:2: ( ( rule__Section__SectionContentsAssignment_3 )* )
            // InternalQ.g:526:3: ( rule__Section__SectionContentsAssignment_3 )*
            {
             before(grammarAccess.getSectionAccess().getSectionContentsAssignment_3()); 
            // InternalQ.g:527:3: ( rule__Section__SectionContentsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=17)||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQ.g:527:4: rule__Section__SectionContentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Section__SectionContentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getSectionContentsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalQ.g:536:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:540:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalQ.g:541:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Section__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalQ.g:548:1: rule__Section__Group__4__Impl : ( '}' ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:552:1: ( ( '}' ) )
            // InternalQ.g:553:1: ( '}' )
            {
            // InternalQ.g:553:1: ( '}' )
            // InternalQ.g:554:2: '}'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group__5"
    // InternalQ.g:563:1: rule__Section__Group__5 : rule__Section__Group__5__Impl ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:567:1: ( rule__Section__Group__5__Impl )
            // InternalQ.g:568:2: rule__Section__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5"


    // $ANTLR start "rule__Section__Group__5__Impl"
    // InternalQ.g:574:1: rule__Section__Group__5__Impl : ( ( rule__Section__NextSectionAssignment_5 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:578:1: ( ( ( rule__Section__NextSectionAssignment_5 )? ) )
            // InternalQ.g:579:1: ( ( rule__Section__NextSectionAssignment_5 )? )
            {
            // InternalQ.g:579:1: ( ( rule__Section__NextSectionAssignment_5 )? )
            // InternalQ.g:580:2: ( rule__Section__NextSectionAssignment_5 )?
            {
             before(grammarAccess.getSectionAccess().getNextSectionAssignment_5()); 
            // InternalQ.g:581:2: ( rule__Section__NextSectionAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11||LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQ.g:581:3: rule__Section__NextSectionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__NextSectionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getNextSectionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalQ.g:590:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:594:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalQ.g:595:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalQ.g:602:1: rule__Title__Group__0__Impl : ( 'Title' ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:606:1: ( ( 'Title' ) )
            // InternalQ.g:607:1: ( 'Title' )
            {
            // InternalQ.g:607:1: ( 'Title' )
            // InternalQ.g:608:2: 'Title'
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalQ.g:617:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:621:1: ( rule__Title__Group__1__Impl )
            // InternalQ.g:622:2: rule__Title__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalQ.g:628:1: rule__Title__Group__1__Impl : ( ( rule__Title__TitleAssignment_1 ) ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:632:1: ( ( ( rule__Title__TitleAssignment_1 ) ) )
            // InternalQ.g:633:1: ( ( rule__Title__TitleAssignment_1 ) )
            {
            // InternalQ.g:633:1: ( ( rule__Title__TitleAssignment_1 ) )
            // InternalQ.g:634:2: ( rule__Title__TitleAssignment_1 )
            {
             before(grammarAccess.getTitleAccess().getTitleAssignment_1()); 
            // InternalQ.g:635:2: ( rule__Title__TitleAssignment_1 )
            // InternalQ.g:635:3: rule__Title__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Title__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalQ.g:644:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:648:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalQ.g:649:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalQ.g:656:1: rule__Description__Group__0__Impl : ( 'Description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:660:1: ( ( 'Description' ) )
            // InternalQ.g:661:1: ( 'Description' )
            {
            // InternalQ.g:661:1: ( 'Description' )
            // InternalQ.g:662:2: 'Description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalQ.g:671:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:675:1: ( rule__Description__Group__1__Impl )
            // InternalQ.g:676:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalQ.g:682:1: rule__Description__Group__1__Impl : ( ( rule__Description__DescriptionAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:686:1: ( ( ( rule__Description__DescriptionAssignment_1 ) ) )
            // InternalQ.g:687:1: ( ( rule__Description__DescriptionAssignment_1 ) )
            {
            // InternalQ.g:687:1: ( ( rule__Description__DescriptionAssignment_1 ) )
            // InternalQ.g:688:2: ( rule__Description__DescriptionAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment_1()); 
            // InternalQ.g:689:2: ( rule__Description__DescriptionAssignment_1 )
            // InternalQ.g:689:3: rule__Description__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Description__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__MultipleChoiceQuestion__Group__0"
    // InternalQ.g:698:1: rule__MultipleChoiceQuestion__Group__0 : rule__MultipleChoiceQuestion__Group__0__Impl rule__MultipleChoiceQuestion__Group__1 ;
    public final void rule__MultipleChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:702:1: ( rule__MultipleChoiceQuestion__Group__0__Impl rule__MultipleChoiceQuestion__Group__1 )
            // InternalQ.g:703:2: rule__MultipleChoiceQuestion__Group__0__Impl rule__MultipleChoiceQuestion__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MultipleChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleChoiceQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__Group__0"


    // $ANTLR start "rule__MultipleChoiceQuestion__Group__0__Impl"
    // InternalQ.g:710:1: rule__MultipleChoiceQuestion__Group__0__Impl : ( 'MultipleChoiceQuestion' ) ;
    public final void rule__MultipleChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:714:1: ( ( 'MultipleChoiceQuestion' ) )
            // InternalQ.g:715:1: ( 'MultipleChoiceQuestion' )
            {
            // InternalQ.g:715:1: ( 'MultipleChoiceQuestion' )
            // InternalQ.g:716:2: 'MultipleChoiceQuestion'
            {
             before(grammarAccess.getMultipleChoiceQuestionAccess().getMultipleChoiceQuestionKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMultipleChoiceQuestionAccess().getMultipleChoiceQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__Group__0__Impl"


    // $ANTLR start "rule__MultipleChoiceQuestion__Group__1"
    // InternalQ.g:725:1: rule__MultipleChoiceQuestion__Group__1 : rule__MultipleChoiceQuestion__Group__1__Impl rule__MultipleChoiceQuestion__Group__2 ;
    public final void rule__MultipleChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:729:1: ( rule__MultipleChoiceQuestion__Group__1__Impl rule__MultipleChoiceQuestion__Group__2 )
            // InternalQ.g:730:2: rule__MultipleChoiceQuestion__Group__1__Impl rule__MultipleChoiceQuestion__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MultipleChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleChoiceQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__Group__1"


    // $ANTLR start "rule__MultipleChoiceQuestion__Group__1__Impl"
    // InternalQ.g:737:1: rule__MultipleChoiceQuestion__Group__1__Impl : ( ( rule__MultipleChoiceQuestion__QuestionAssignment_1 ) ) ;
    public final void rule__MultipleChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:741:1: ( ( ( rule__MultipleChoiceQuestion__QuestionAssignment_1 ) ) )
            // InternalQ.g:742:1: ( ( rule__MultipleChoiceQuestion__QuestionAssignment_1 ) )
            {
            // InternalQ.g:742:1: ( ( rule__MultipleChoiceQuestion__QuestionAssignment_1 ) )
            // InternalQ.g:743:2: ( rule__MultipleChoiceQuestion__QuestionAssignment_1 )
            {
             before(grammarAccess.getMultipleChoiceQuestionAccess().getQuestionAssignment_1()); 
            // InternalQ.g:744:2: ( rule__MultipleChoiceQuestion__QuestionAssignment_1 )
            // InternalQ.g:744:3: rule__MultipleChoiceQuestion__QuestionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleChoiceQuestion__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceQuestionAccess().getQuestionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__Group__1__Impl"


    // $ANTLR start "rule__MultipleChoiceQuestion__Group__2"
    // InternalQ.g:752:1: rule__MultipleChoiceQuestion__Group__2 : rule__MultipleChoiceQuestion__Group__2__Impl rule__MultipleChoiceQuestion__Group__3 ;
    public final void rule__MultipleChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:756:1: ( rule__MultipleChoiceQuestion__Group__2__Impl rule__MultipleChoiceQuestion__Group__3 )
            // InternalQ.g:757:2: rule__MultipleChoiceQuestion__Group__2__Impl rule__MultipleChoiceQuestion__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__MultipleChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleChoiceQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__Group__2"


    // $ANTLR start "rule__MultipleChoiceQuestion__Group__2__Impl"
    // InternalQ.g:764:1: rule__MultipleChoiceQuestion__Group__2__Impl : ( '{' ) ;
    public final void rule__MultipleChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:768:1: ( ( '{' ) )
            // InternalQ.g:769:1: ( '{' )
            {
            // InternalQ.g:769:1: ( '{' )
            // InternalQ.g:770:2: '{'
            {
             before(grammarAccess.getMultipleChoiceQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMultipleChoiceQuestionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__Group__2__Impl"


    // $ANTLR start "rule__MultipleChoiceQuestion__Group__3"
    // InternalQ.g:779:1: rule__MultipleChoiceQuestion__Group__3 : rule__MultipleChoiceQuestion__Group__3__Impl rule__MultipleChoiceQuestion__Group__4 ;
    public final void rule__MultipleChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:783:1: ( rule__MultipleChoiceQuestion__Group__3__Impl rule__MultipleChoiceQuestion__Group__4 )
            // InternalQ.g:784:2: rule__MultipleChoiceQuestion__Group__3__Impl rule__MultipleChoiceQuestion__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__MultipleChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleChoiceQuestion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__Group__3"


    // $ANTLR start "rule__MultipleChoiceQuestion__Group__3__Impl"
    // InternalQ.g:791:1: rule__MultipleChoiceQuestion__Group__3__Impl : ( ( rule__MultipleChoiceQuestion__AnswersAssignment_3 )* ) ;
    public final void rule__MultipleChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:795:1: ( ( ( rule__MultipleChoiceQuestion__AnswersAssignment_3 )* ) )
            // InternalQ.g:796:1: ( ( rule__MultipleChoiceQuestion__AnswersAssignment_3 )* )
            {
            // InternalQ.g:796:1: ( ( rule__MultipleChoiceQuestion__AnswersAssignment_3 )* )
            // InternalQ.g:797:2: ( rule__MultipleChoiceQuestion__AnswersAssignment_3 )*
            {
             before(grammarAccess.getMultipleChoiceQuestionAccess().getAnswersAssignment_3()); 
            // InternalQ.g:798:2: ( rule__MultipleChoiceQuestion__AnswersAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQ.g:798:3: rule__MultipleChoiceQuestion__AnswersAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MultipleChoiceQuestion__AnswersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMultipleChoiceQuestionAccess().getAnswersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__Group__3__Impl"


    // $ANTLR start "rule__MultipleChoiceQuestion__Group__4"
    // InternalQ.g:806:1: rule__MultipleChoiceQuestion__Group__4 : rule__MultipleChoiceQuestion__Group__4__Impl ;
    public final void rule__MultipleChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:810:1: ( rule__MultipleChoiceQuestion__Group__4__Impl )
            // InternalQ.g:811:2: rule__MultipleChoiceQuestion__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleChoiceQuestion__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__Group__4"


    // $ANTLR start "rule__MultipleChoiceQuestion__Group__4__Impl"
    // InternalQ.g:817:1: rule__MultipleChoiceQuestion__Group__4__Impl : ( '}' ) ;
    public final void rule__MultipleChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:821:1: ( ( '}' ) )
            // InternalQ.g:822:1: ( '}' )
            {
            // InternalQ.g:822:1: ( '}' )
            // InternalQ.g:823:2: '}'
            {
             before(grammarAccess.getMultipleChoiceQuestionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMultipleChoiceQuestionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__Group__4__Impl"


    // $ANTLR start "rule__MultipleChoiceAnswer__Group__0"
    // InternalQ.g:833:1: rule__MultipleChoiceAnswer__Group__0 : rule__MultipleChoiceAnswer__Group__0__Impl rule__MultipleChoiceAnswer__Group__1 ;
    public final void rule__MultipleChoiceAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:837:1: ( rule__MultipleChoiceAnswer__Group__0__Impl rule__MultipleChoiceAnswer__Group__1 )
            // InternalQ.g:838:2: rule__MultipleChoiceAnswer__Group__0__Impl rule__MultipleChoiceAnswer__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MultipleChoiceAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleChoiceAnswer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceAnswer__Group__0"


    // $ANTLR start "rule__MultipleChoiceAnswer__Group__0__Impl"
    // InternalQ.g:845:1: rule__MultipleChoiceAnswer__Group__0__Impl : ( 'Answer' ) ;
    public final void rule__MultipleChoiceAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:849:1: ( ( 'Answer' ) )
            // InternalQ.g:850:1: ( 'Answer' )
            {
            // InternalQ.g:850:1: ( 'Answer' )
            // InternalQ.g:851:2: 'Answer'
            {
             before(grammarAccess.getMultipleChoiceAnswerAccess().getAnswerKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMultipleChoiceAnswerAccess().getAnswerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceAnswer__Group__0__Impl"


    // $ANTLR start "rule__MultipleChoiceAnswer__Group__1"
    // InternalQ.g:860:1: rule__MultipleChoiceAnswer__Group__1 : rule__MultipleChoiceAnswer__Group__1__Impl rule__MultipleChoiceAnswer__Group__2 ;
    public final void rule__MultipleChoiceAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:864:1: ( rule__MultipleChoiceAnswer__Group__1__Impl rule__MultipleChoiceAnswer__Group__2 )
            // InternalQ.g:865:2: rule__MultipleChoiceAnswer__Group__1__Impl rule__MultipleChoiceAnswer__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__MultipleChoiceAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleChoiceAnswer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceAnswer__Group__1"


    // $ANTLR start "rule__MultipleChoiceAnswer__Group__1__Impl"
    // InternalQ.g:872:1: rule__MultipleChoiceAnswer__Group__1__Impl : ( ( rule__MultipleChoiceAnswer__AnswerAssignment_1 ) ) ;
    public final void rule__MultipleChoiceAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:876:1: ( ( ( rule__MultipleChoiceAnswer__AnswerAssignment_1 ) ) )
            // InternalQ.g:877:1: ( ( rule__MultipleChoiceAnswer__AnswerAssignment_1 ) )
            {
            // InternalQ.g:877:1: ( ( rule__MultipleChoiceAnswer__AnswerAssignment_1 ) )
            // InternalQ.g:878:2: ( rule__MultipleChoiceAnswer__AnswerAssignment_1 )
            {
             before(grammarAccess.getMultipleChoiceAnswerAccess().getAnswerAssignment_1()); 
            // InternalQ.g:879:2: ( rule__MultipleChoiceAnswer__AnswerAssignment_1 )
            // InternalQ.g:879:3: rule__MultipleChoiceAnswer__AnswerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleChoiceAnswer__AnswerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAnswerAccess().getAnswerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceAnswer__Group__1__Impl"


    // $ANTLR start "rule__MultipleChoiceAnswer__Group__2"
    // InternalQ.g:887:1: rule__MultipleChoiceAnswer__Group__2 : rule__MultipleChoiceAnswer__Group__2__Impl ;
    public final void rule__MultipleChoiceAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:891:1: ( rule__MultipleChoiceAnswer__Group__2__Impl )
            // InternalQ.g:892:2: rule__MultipleChoiceAnswer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleChoiceAnswer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceAnswer__Group__2"


    // $ANTLR start "rule__MultipleChoiceAnswer__Group__2__Impl"
    // InternalQ.g:898:1: rule__MultipleChoiceAnswer__Group__2__Impl : ( ( rule__MultipleChoiceAnswer__GotoAssignment_2 )? ) ;
    public final void rule__MultipleChoiceAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:902:1: ( ( ( rule__MultipleChoiceAnswer__GotoAssignment_2 )? ) )
            // InternalQ.g:903:1: ( ( rule__MultipleChoiceAnswer__GotoAssignment_2 )? )
            {
            // InternalQ.g:903:1: ( ( rule__MultipleChoiceAnswer__GotoAssignment_2 )? )
            // InternalQ.g:904:2: ( rule__MultipleChoiceAnswer__GotoAssignment_2 )?
            {
             before(grammarAccess.getMultipleChoiceAnswerAccess().getGotoAssignment_2()); 
            // InternalQ.g:905:2: ( rule__MultipleChoiceAnswer__GotoAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQ.g:905:3: rule__MultipleChoiceAnswer__GotoAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleChoiceAnswer__GotoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAnswerAccess().getGotoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceAnswer__Group__2__Impl"


    // $ANTLR start "rule__TextQuestion__Group__0"
    // InternalQ.g:914:1: rule__TextQuestion__Group__0 : rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1 ;
    public final void rule__TextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:918:1: ( rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1 )
            // InternalQ.g:919:2: rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__TextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__0"


    // $ANTLR start "rule__TextQuestion__Group__0__Impl"
    // InternalQ.g:926:1: rule__TextQuestion__Group__0__Impl : ( 'TextQuestion' ) ;
    public final void rule__TextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:930:1: ( ( 'TextQuestion' ) )
            // InternalQ.g:931:1: ( 'TextQuestion' )
            {
            // InternalQ.g:931:1: ( 'TextQuestion' )
            // InternalQ.g:932:2: 'TextQuestion'
            {
             before(grammarAccess.getTextQuestionAccess().getTextQuestionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTextQuestionAccess().getTextQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__0__Impl"


    // $ANTLR start "rule__TextQuestion__Group__1"
    // InternalQ.g:941:1: rule__TextQuestion__Group__1 : rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2 ;
    public final void rule__TextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:945:1: ( rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2 )
            // InternalQ.g:946:2: rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__1"


    // $ANTLR start "rule__TextQuestion__Group__1__Impl"
    // InternalQ.g:953:1: rule__TextQuestion__Group__1__Impl : ( ( rule__TextQuestion__QuestionAssignment_1 ) ) ;
    public final void rule__TextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:957:1: ( ( ( rule__TextQuestion__QuestionAssignment_1 ) ) )
            // InternalQ.g:958:1: ( ( rule__TextQuestion__QuestionAssignment_1 ) )
            {
            // InternalQ.g:958:1: ( ( rule__TextQuestion__QuestionAssignment_1 ) )
            // InternalQ.g:959:2: ( rule__TextQuestion__QuestionAssignment_1 )
            {
             before(grammarAccess.getTextQuestionAccess().getQuestionAssignment_1()); 
            // InternalQ.g:960:2: ( rule__TextQuestion__QuestionAssignment_1 )
            // InternalQ.g:960:3: rule__TextQuestion__QuestionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TextQuestion__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getQuestionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__1__Impl"


    // $ANTLR start "rule__TextQuestion__Group__2"
    // InternalQ.g:968:1: rule__TextQuestion__Group__2 : rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3 ;
    public final void rule__TextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:972:1: ( rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3 )
            // InternalQ.g:973:2: rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TextQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__2"


    // $ANTLR start "rule__TextQuestion__Group__2__Impl"
    // InternalQ.g:980:1: rule__TextQuestion__Group__2__Impl : ( ( rule__TextQuestion__DescriptionAssignment_2 )? ) ;
    public final void rule__TextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:984:1: ( ( ( rule__TextQuestion__DescriptionAssignment_2 )? ) )
            // InternalQ.g:985:1: ( ( rule__TextQuestion__DescriptionAssignment_2 )? )
            {
            // InternalQ.g:985:1: ( ( rule__TextQuestion__DescriptionAssignment_2 )? )
            // InternalQ.g:986:2: ( rule__TextQuestion__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getTextQuestionAccess().getDescriptionAssignment_2()); 
            // InternalQ.g:987:2: ( rule__TextQuestion__DescriptionAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQ.g:987:3: rule__TextQuestion__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextQuestion__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextQuestionAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__2__Impl"


    // $ANTLR start "rule__TextQuestion__Group__3"
    // InternalQ.g:995:1: rule__TextQuestion__Group__3 : rule__TextQuestion__Group__3__Impl ;
    public final void rule__TextQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:999:1: ( rule__TextQuestion__Group__3__Impl )
            // InternalQ.g:1000:2: rule__TextQuestion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextQuestion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__3"


    // $ANTLR start "rule__TextQuestion__Group__3__Impl"
    // InternalQ.g:1006:1: rule__TextQuestion__Group__3__Impl : ( ( rule__TextQuestion__Group_3__0 )? ) ;
    public final void rule__TextQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1010:1: ( ( ( rule__TextQuestion__Group_3__0 )? ) )
            // InternalQ.g:1011:1: ( ( rule__TextQuestion__Group_3__0 )? )
            {
            // InternalQ.g:1011:1: ( ( rule__TextQuestion__Group_3__0 )? )
            // InternalQ.g:1012:2: ( rule__TextQuestion__Group_3__0 )?
            {
             before(grammarAccess.getTextQuestionAccess().getGroup_3()); 
            // InternalQ.g:1013:2: ( rule__TextQuestion__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQ.g:1013:3: rule__TextQuestion__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextQuestion__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextQuestionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__3__Impl"


    // $ANTLR start "rule__TextQuestion__Group_3__0"
    // InternalQ.g:1022:1: rule__TextQuestion__Group_3__0 : rule__TextQuestion__Group_3__0__Impl rule__TextQuestion__Group_3__1 ;
    public final void rule__TextQuestion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1026:1: ( rule__TextQuestion__Group_3__0__Impl rule__TextQuestion__Group_3__1 )
            // InternalQ.g:1027:2: rule__TextQuestion__Group_3__0__Impl rule__TextQuestion__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__TextQuestion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextQuestion__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group_3__0"


    // $ANTLR start "rule__TextQuestion__Group_3__0__Impl"
    // InternalQ.g:1034:1: rule__TextQuestion__Group_3__0__Impl : ( '{' ) ;
    public final void rule__TextQuestion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1038:1: ( ( '{' ) )
            // InternalQ.g:1039:1: ( '{' )
            {
            // InternalQ.g:1039:1: ( '{' )
            // InternalQ.g:1040:2: '{'
            {
             before(grammarAccess.getTextQuestionAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTextQuestionAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group_3__0__Impl"


    // $ANTLR start "rule__TextQuestion__Group_3__1"
    // InternalQ.g:1049:1: rule__TextQuestion__Group_3__1 : rule__TextQuestion__Group_3__1__Impl ;
    public final void rule__TextQuestion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1053:1: ( rule__TextQuestion__Group_3__1__Impl )
            // InternalQ.g:1054:2: rule__TextQuestion__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextQuestion__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group_3__1"


    // $ANTLR start "rule__TextQuestion__Group_3__1__Impl"
    // InternalQ.g:1060:1: rule__TextQuestion__Group_3__1__Impl : ( '}' ) ;
    public final void rule__TextQuestion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1064:1: ( ( '}' ) )
            // InternalQ.g:1065:1: ( '}' )
            {
            // InternalQ.g:1065:1: ( '}' )
            // InternalQ.g:1066:2: '}'
            {
             before(grammarAccess.getTextQuestionAccess().getRightCurlyBracketKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTextQuestionAccess().getRightCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group_3__1__Impl"


    // $ANTLR start "rule__NextSection__Group_1__0"
    // InternalQ.g:1076:1: rule__NextSection__Group_1__0 : rule__NextSection__Group_1__0__Impl rule__NextSection__Group_1__1 ;
    public final void rule__NextSection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1080:1: ( rule__NextSection__Group_1__0__Impl rule__NextSection__Group_1__1 )
            // InternalQ.g:1081:2: rule__NextSection__Group_1__0__Impl rule__NextSection__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__NextSection__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NextSection__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NextSection__Group_1__0"


    // $ANTLR start "rule__NextSection__Group_1__0__Impl"
    // InternalQ.g:1088:1: rule__NextSection__Group_1__0__Impl : ( () ) ;
    public final void rule__NextSection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1092:1: ( ( () ) )
            // InternalQ.g:1093:1: ( () )
            {
            // InternalQ.g:1093:1: ( () )
            // InternalQ.g:1094:2: ()
            {
             before(grammarAccess.getNextSectionAccess().getEndOfQuestionnaireAction_1_0()); 
            // InternalQ.g:1095:2: ()
            // InternalQ.g:1095:3: 
            {
            }

             after(grammarAccess.getNextSectionAccess().getEndOfQuestionnaireAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NextSection__Group_1__0__Impl"


    // $ANTLR start "rule__NextSection__Group_1__1"
    // InternalQ.g:1103:1: rule__NextSection__Group_1__1 : rule__NextSection__Group_1__1__Impl ;
    public final void rule__NextSection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1107:1: ( rule__NextSection__Group_1__1__Impl )
            // InternalQ.g:1108:2: rule__NextSection__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NextSection__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NextSection__Group_1__1"


    // $ANTLR start "rule__NextSection__Group_1__1__Impl"
    // InternalQ.g:1114:1: rule__NextSection__Group_1__1__Impl : ( ruleEndOfQuestionnaire ) ;
    public final void rule__NextSection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1118:1: ( ( ruleEndOfQuestionnaire ) )
            // InternalQ.g:1119:1: ( ruleEndOfQuestionnaire )
            {
            // InternalQ.g:1119:1: ( ruleEndOfQuestionnaire )
            // InternalQ.g:1120:2: ruleEndOfQuestionnaire
            {
             before(grammarAccess.getNextSectionAccess().getEndOfQuestionnaireParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleEndOfQuestionnaire();

            state._fsp--;

             after(grammarAccess.getNextSectionAccess().getEndOfQuestionnaireParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NextSection__Group_1__1__Impl"


    // $ANTLR start "rule__SectionReference__Group__0"
    // InternalQ.g:1130:1: rule__SectionReference__Group__0 : rule__SectionReference__Group__0__Impl rule__SectionReference__Group__1 ;
    public final void rule__SectionReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1134:1: ( rule__SectionReference__Group__0__Impl rule__SectionReference__Group__1 )
            // InternalQ.g:1135:2: rule__SectionReference__Group__0__Impl rule__SectionReference__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SectionReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionReference__Group__0"


    // $ANTLR start "rule__SectionReference__Group__0__Impl"
    // InternalQ.g:1142:1: rule__SectionReference__Group__0__Impl : ( 'goto' ) ;
    public final void rule__SectionReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1146:1: ( ( 'goto' ) )
            // InternalQ.g:1147:1: ( 'goto' )
            {
            // InternalQ.g:1147:1: ( 'goto' )
            // InternalQ.g:1148:2: 'goto'
            {
             before(grammarAccess.getSectionReferenceAccess().getGotoKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSectionReferenceAccess().getGotoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionReference__Group__0__Impl"


    // $ANTLR start "rule__SectionReference__Group__1"
    // InternalQ.g:1157:1: rule__SectionReference__Group__1 : rule__SectionReference__Group__1__Impl ;
    public final void rule__SectionReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1161:1: ( rule__SectionReference__Group__1__Impl )
            // InternalQ.g:1162:2: rule__SectionReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SectionReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionReference__Group__1"


    // $ANTLR start "rule__SectionReference__Group__1__Impl"
    // InternalQ.g:1168:1: rule__SectionReference__Group__1__Impl : ( ( rule__SectionReference__SectionAssignment_1 ) ) ;
    public final void rule__SectionReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1172:1: ( ( ( rule__SectionReference__SectionAssignment_1 ) ) )
            // InternalQ.g:1173:1: ( ( rule__SectionReference__SectionAssignment_1 ) )
            {
            // InternalQ.g:1173:1: ( ( rule__SectionReference__SectionAssignment_1 ) )
            // InternalQ.g:1174:2: ( rule__SectionReference__SectionAssignment_1 )
            {
             before(grammarAccess.getSectionReferenceAccess().getSectionAssignment_1()); 
            // InternalQ.g:1175:2: ( rule__SectionReference__SectionAssignment_1 )
            // InternalQ.g:1175:3: rule__SectionReference__SectionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SectionReference__SectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionReferenceAccess().getSectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionReference__Group__1__Impl"


    // $ANTLR start "rule__Questionnaire__SectionsAssignment"
    // InternalQ.g:1184:1: rule__Questionnaire__SectionsAssignment : ( ruleSection ) ;
    public final void rule__Questionnaire__SectionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1188:1: ( ( ruleSection ) )
            // InternalQ.g:1189:2: ( ruleSection )
            {
            // InternalQ.g:1189:2: ( ruleSection )
            // InternalQ.g:1190:3: ruleSection
            {
             before(grammarAccess.getQuestionnaireAccess().getSectionsSectionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getSectionsSectionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__SectionsAssignment"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalQ.g:1199:1: rule__Section__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1203:1: ( ( RULE_ID ) )
            // InternalQ.g:1204:2: ( RULE_ID )
            {
            // InternalQ.g:1204:2: ( RULE_ID )
            // InternalQ.g:1205:3: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NameAssignment_1"


    // $ANTLR start "rule__Section__SectionContentsAssignment_3"
    // InternalQ.g:1214:1: rule__Section__SectionContentsAssignment_3 : ( ruleSectionContents ) ;
    public final void rule__Section__SectionContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1218:1: ( ( ruleSectionContents ) )
            // InternalQ.g:1219:2: ( ruleSectionContents )
            {
            // InternalQ.g:1219:2: ( ruleSectionContents )
            // InternalQ.g:1220:3: ruleSectionContents
            {
             before(grammarAccess.getSectionAccess().getSectionContentsSectionContentsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSectionContents();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getSectionContentsSectionContentsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__SectionContentsAssignment_3"


    // $ANTLR start "rule__Section__NextSectionAssignment_5"
    // InternalQ.g:1229:1: rule__Section__NextSectionAssignment_5 : ( ruleNextSection ) ;
    public final void rule__Section__NextSectionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1233:1: ( ( ruleNextSection ) )
            // InternalQ.g:1234:2: ( ruleNextSection )
            {
            // InternalQ.g:1234:2: ( ruleNextSection )
            // InternalQ.g:1235:3: ruleNextSection
            {
             before(grammarAccess.getSectionAccess().getNextSectionNextSectionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNextSection();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getNextSectionNextSectionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NextSectionAssignment_5"


    // $ANTLR start "rule__Title__TitleAssignment_1"
    // InternalQ.g:1244:1: rule__Title__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Title__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1248:1: ( ( RULE_STRING ) )
            // InternalQ.g:1249:2: ( RULE_STRING )
            {
            // InternalQ.g:1249:2: ( RULE_STRING )
            // InternalQ.g:1250:3: RULE_STRING
            {
             before(grammarAccess.getTitleAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__TitleAssignment_1"


    // $ANTLR start "rule__Description__DescriptionAssignment_1"
    // InternalQ.g:1259:1: rule__Description__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1263:1: ( ( RULE_STRING ) )
            // InternalQ.g:1264:2: ( RULE_STRING )
            {
            // InternalQ.g:1264:2: ( RULE_STRING )
            // InternalQ.g:1265:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__DescriptionAssignment_1"


    // $ANTLR start "rule__MultipleChoiceQuestion__QuestionAssignment_1"
    // InternalQ.g:1274:1: rule__MultipleChoiceQuestion__QuestionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MultipleChoiceQuestion__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1278:1: ( ( RULE_STRING ) )
            // InternalQ.g:1279:2: ( RULE_STRING )
            {
            // InternalQ.g:1279:2: ( RULE_STRING )
            // InternalQ.g:1280:3: RULE_STRING
            {
             before(grammarAccess.getMultipleChoiceQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMultipleChoiceQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__QuestionAssignment_1"


    // $ANTLR start "rule__MultipleChoiceQuestion__AnswersAssignment_3"
    // InternalQ.g:1289:1: rule__MultipleChoiceQuestion__AnswersAssignment_3 : ( ruleMultipleChoiceAnswer ) ;
    public final void rule__MultipleChoiceQuestion__AnswersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1293:1: ( ( ruleMultipleChoiceAnswer ) )
            // InternalQ.g:1294:2: ( ruleMultipleChoiceAnswer )
            {
            // InternalQ.g:1294:2: ( ruleMultipleChoiceAnswer )
            // InternalQ.g:1295:3: ruleMultipleChoiceAnswer
            {
             before(grammarAccess.getMultipleChoiceQuestionAccess().getAnswersMultipleChoiceAnswerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMultipleChoiceAnswer();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceQuestionAccess().getAnswersMultipleChoiceAnswerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceQuestion__AnswersAssignment_3"


    // $ANTLR start "rule__MultipleChoiceAnswer__AnswerAssignment_1"
    // InternalQ.g:1304:1: rule__MultipleChoiceAnswer__AnswerAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MultipleChoiceAnswer__AnswerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1308:1: ( ( RULE_STRING ) )
            // InternalQ.g:1309:2: ( RULE_STRING )
            {
            // InternalQ.g:1309:2: ( RULE_STRING )
            // InternalQ.g:1310:3: RULE_STRING
            {
             before(grammarAccess.getMultipleChoiceAnswerAccess().getAnswerSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMultipleChoiceAnswerAccess().getAnswerSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceAnswer__AnswerAssignment_1"


    // $ANTLR start "rule__MultipleChoiceAnswer__GotoAssignment_2"
    // InternalQ.g:1319:1: rule__MultipleChoiceAnswer__GotoAssignment_2 : ( ruleSectionReference ) ;
    public final void rule__MultipleChoiceAnswer__GotoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1323:1: ( ( ruleSectionReference ) )
            // InternalQ.g:1324:2: ( ruleSectionReference )
            {
            // InternalQ.g:1324:2: ( ruleSectionReference )
            // InternalQ.g:1325:3: ruleSectionReference
            {
             before(grammarAccess.getMultipleChoiceAnswerAccess().getGotoSectionReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSectionReference();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAnswerAccess().getGotoSectionReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceAnswer__GotoAssignment_2"


    // $ANTLR start "rule__TextQuestion__QuestionAssignment_1"
    // InternalQ.g:1334:1: rule__TextQuestion__QuestionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TextQuestion__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1338:1: ( ( RULE_STRING ) )
            // InternalQ.g:1339:2: ( RULE_STRING )
            {
            // InternalQ.g:1339:2: ( RULE_STRING )
            // InternalQ.g:1340:3: RULE_STRING
            {
             before(grammarAccess.getTextQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__QuestionAssignment_1"


    // $ANTLR start "rule__TextQuestion__DescriptionAssignment_2"
    // InternalQ.g:1349:1: rule__TextQuestion__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextQuestion__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1353:1: ( ( RULE_STRING ) )
            // InternalQ.g:1354:2: ( RULE_STRING )
            {
            // InternalQ.g:1354:2: ( RULE_STRING )
            // InternalQ.g:1355:3: RULE_STRING
            {
             before(grammarAccess.getTextQuestionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextQuestionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__DescriptionAssignment_2"


    // $ANTLR start "rule__SectionReference__SectionAssignment_1"
    // InternalQ.g:1364:1: rule__SectionReference__SectionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SectionReference__SectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQ.g:1368:1: ( ( ( RULE_ID ) ) )
            // InternalQ.g:1369:2: ( ( RULE_ID ) )
            {
            // InternalQ.g:1369:2: ( ( RULE_ID ) )
            // InternalQ.g:1370:3: ( RULE_ID )
            {
             before(grammarAccess.getSectionReferenceAccess().getSectionSectionCrossReference_1_0()); 
            // InternalQ.g:1371:3: ( RULE_ID )
            // InternalQ.g:1372:4: RULE_ID
            {
             before(grammarAccess.getSectionReferenceAccess().getSectionSectionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSectionReferenceAccess().getSectionSectionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSectionReferenceAccess().getSectionSectionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionReference__SectionAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000B8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000B8002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002020L});

}