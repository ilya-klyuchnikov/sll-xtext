package meta.sll.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSLLLexer extends Lexer {
    public static final int RULE_UID=7;
    public static final int T__19=19;
    public static final int RULE_ID=8;
    public static final int RULE_GID=6;
    public static final int RULE_STRING=10;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=9;
    public static final int RULE_WS=13;
    public static final int RULE_FID=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_LID=5;
    public static final int RULE_ML_COMMENT=11;

    // delegates
    // delegators

    public InternalSLLLexer() {;} 
    public InternalSLLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSLLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:11:7: ( '(' )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:12:7: ( ')' )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:13:7: ( '=' )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:14:7: ( ';' )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:15:7: ( ',' )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_FID"
    public final void mRULE_FID() throws RecognitionException {
        try {
            int _type = RULE_FID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2430:10: ( 'f' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2430:12: 'f' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            match('f'); 
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2430:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FID"

    // $ANTLR start "RULE_GID"
    public final void mRULE_GID() throws RecognitionException {
        try {
            int _type = RULE_GID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2432:10: ( 'g' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2432:12: 'g' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            match('g'); 
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2432:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GID"

    // $ANTLR start "RULE_LID"
    public final void mRULE_LID() throws RecognitionException {
        try {
            int _type = RULE_LID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2434:10: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2434:12: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2434:21: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LID"

    // $ANTLR start "RULE_UID"
    public final void mRULE_UID() throws RecognitionException {
        try {
            int _type = RULE_UID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2436:10: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2436:12: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2436:21: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2438:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2438:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2438:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2438:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2438:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2440:10: ( ( '0' .. '9' )+ )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2440:12: ( '0' .. '9' )+
            {
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2440:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2440:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2442:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2442:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2442:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2442:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2442:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2442:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2442:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2442:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2442:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2442:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2442:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2444:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2444:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2444:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2444:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2446:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2446:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2446:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2446:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2446:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2446:41: ( '\\r' )? '\\n'
                    {
                    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2446:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2446:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2448:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2448:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2448:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2450:16: ( . )
            // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:2450:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | RULE_FID | RULE_GID | RULE_LID | RULE_UID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=16;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:40: RULE_FID
                {
                mRULE_FID(); 

                }
                break;
            case 7 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:49: RULE_GID
                {
                mRULE_GID(); 

                }
                break;
            case 8 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:58: RULE_LID
                {
                mRULE_LID(); 

                }
                break;
            case 9 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:67: RULE_UID
                {
                mRULE_UID(); 

                }
                break;
            case 10 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:76: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:84: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:93: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:105: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:121: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:137: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // ../meta.sll.ui/src-gen/meta/sll/ui/contentassist/antlr/internal/InternalSLL.g:1:145: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\6\uffff\1\30\1\32\1\33\1\36\1\21\2\uffff\3\21\7\uffff\1\30\1\uffff"+
        "\1\32\2\uffff\1\33\1\36\7\uffff";
    static final String DFA16_eofS =
        "\45\uffff";
    static final String DFA16_minS =
        "\1\0\5\uffff\4\60\1\101\2\uffff\2\0\1\52\7\uffff\1\60\1\uffff\1"+
        "\60\2\uffff\2\60\7\uffff";
    static final String DFA16_maxS =
        "\1\uffff\5\uffff\5\172\2\uffff\2\uffff\1\57\7\uffff\1\172\1\uffff"+
        "\1\172\2\uffff\2\172\7\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\12\1\13\3\uffff\1\17\1\20"+
        "\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\1\uffff\1\7\1\10\2\uffff\1\11\1"+
        "\12\1\13\1\14\1\15\1\16\1\17";
    static final String DFA16_specialS =
        "\1\1\14\uffff\1\2\1\0\26\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\4\21\1\16\1\1\1\2"+
            "\2\21\1\5\2\21\1\17\12\14\1\21\1\4\1\21\1\3\3\21\32\11\3\21"+
            "\1\12\1\13\1\21\5\10\1\6\1\7\23\10\uff85\21",
            "",
            "",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\41",
            "\0\41",
            "\1\42\4\uffff\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | RULE_FID | RULE_GID | RULE_LID | RULE_UID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_14 = input.LA(1);

                        s = -1;
                        if ( ((LA16_14>='\u0000' && LA16_14<='\uFFFF')) ) {s = 33;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='(') ) {s = 1;}

                        else if ( (LA16_0==')') ) {s = 2;}

                        else if ( (LA16_0=='=') ) {s = 3;}

                        else if ( (LA16_0==';') ) {s = 4;}

                        else if ( (LA16_0==',') ) {s = 5;}

                        else if ( (LA16_0=='f') ) {s = 6;}

                        else if ( (LA16_0=='g') ) {s = 7;}

                        else if ( ((LA16_0>='a' && LA16_0<='e')||(LA16_0>='h' && LA16_0<='z')) ) {s = 8;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')) ) {s = 9;}

                        else if ( (LA16_0=='^') ) {s = 10;}

                        else if ( (LA16_0=='_') ) {s = 11;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 12;}

                        else if ( (LA16_0=='\"') ) {s = 13;}

                        else if ( (LA16_0=='\'') ) {s = 14;}

                        else if ( (LA16_0=='/') ) {s = 15;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 16;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='*' && LA16_0<='+')||(LA16_0>='-' && LA16_0<='.')||LA16_0==':'||LA16_0=='<'||(LA16_0>='>' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='{' && LA16_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_13 = input.LA(1);

                        s = -1;
                        if ( ((LA16_13>='\u0000' && LA16_13<='\uFFFF')) ) {s = 33;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}