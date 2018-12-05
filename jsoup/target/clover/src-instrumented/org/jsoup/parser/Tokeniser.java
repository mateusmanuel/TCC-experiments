/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;

import java.util.Arrays;

/**
 * Readers the input stream into tokens.
 */
final class Tokeniser {public static class __CLR4_2_15ge5gejpaexqnf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,7284,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static final char replacementChar = '\ufffd'; // replaces null character
    private static final char[] notCharRefCharsSorted = new char[]{'\t', '\n', '\r', '\f', ' ', '<', '&'};

    // Some illegal character escapes are parsed by browsers as windows-1252 instead. See issue #1034
    // https://html.spec.whatwg.org/multipage/parsing.html#numeric-character-reference-end-state
    static final int win1252ExtensionsStart = 0x80;
    static final int[] win1252Extensions = new int[] {
            // we could build this manually, but Windows-1252 is not a standard java charset so that could break on
            // some platforms - this table is verified with a test
            0x20AC, 0x0081, 0x201A, 0x0192, 0x201E, 0x2026, 0x2020, 0x2021,
            0x02C6, 0x2030, 0x0160, 0x2039, 0x0152, 0x008D, 0x017D, 0x008F,
            0x0090, 0x2018, 0x2019, 0x201C, 0x201D, 0x2022, 0x2013, 0x2014,
            0x02DC, 0x2122, 0x0161, 0x203A, 0x0153, 0x009D, 0x017E, 0x0178,
    };

    static {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7070);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7071);Arrays.sort(notCharRefCharsSorted);
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    private final CharacterReader reader; // html input
    private final ParseErrorList errors; // errors found while tokenising

    private TokeniserState state = TokeniserState.Data; // current tokenisation state
    private Token emitPending; // the token we are about to emit on next read
    private boolean isEmitPending = false;
    private String charsString = null; // characters pending an emit. Will fall to charsBuilder if more than one
    private StringBuilder charsBuilder = new StringBuilder(1024); // buffers characters to output as one token, if more than one emit per read
    StringBuilder dataBuffer = new StringBuilder(1024); // buffers data looking for </script>

    Token.Tag tagPending; // tag we are building up
    Token.StartTag startPending = new Token.StartTag();
    Token.EndTag endPending = new Token.EndTag();
    Token.Character charPending = new Token.Character();
    Token.Doctype doctypePending = new Token.Doctype(); // doctype building up
    Token.Comment commentPending = new Token.Comment(); // comment building up
    private String lastStartTag; // the last start tag emitted, to test appropriate end tag

    Tokeniser(CharacterReader reader, ParseErrorList errors) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7072);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7073);this.reader = reader;
        __CLR4_2_15ge5gejpaexqnf.R.inc(7074);this.errors = errors;
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    Token read() {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7075);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7076);while ((((!isEmitPending)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7077)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7078)==0&false)))
            {__CLR4_2_15ge5gejpaexqnf.R.inc(7079);state.read(this, reader);

        // if emit is pending, a non-character token was found: return any chars in buffer, and leave token for next read:
        }__CLR4_2_15ge5gejpaexqnf.R.inc(7080);if ((((charsBuilder.length() > 0)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7081)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7082)==0&false))) {{
            __CLR4_2_15ge5gejpaexqnf.R.inc(7083);String str = charsBuilder.toString();
            __CLR4_2_15ge5gejpaexqnf.R.inc(7084);charsBuilder.delete(0, charsBuilder.length());
            __CLR4_2_15ge5gejpaexqnf.R.inc(7085);charsString = null;
            __CLR4_2_15ge5gejpaexqnf.R.inc(7086);return charPending.data(str);
        } }else {__CLR4_2_15ge5gejpaexqnf.R.inc(7087);if ((((charsString != null)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7088)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7089)==0&false))) {{
            __CLR4_2_15ge5gejpaexqnf.R.inc(7090);Token token = charPending.data(charsString);
            __CLR4_2_15ge5gejpaexqnf.R.inc(7091);charsString = null;
            __CLR4_2_15ge5gejpaexqnf.R.inc(7092);return token;
        } }else {{
            __CLR4_2_15ge5gejpaexqnf.R.inc(7093);isEmitPending = false;
            __CLR4_2_15ge5gejpaexqnf.R.inc(7094);return emitPending;
        }
    }}}finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void emit(Token token) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7095);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7096);Validate.isFalse(isEmitPending, "There is an unread token pending!");

        __CLR4_2_15ge5gejpaexqnf.R.inc(7097);emitPending = token;
        __CLR4_2_15ge5gejpaexqnf.R.inc(7098);isEmitPending = true;

        __CLR4_2_15ge5gejpaexqnf.R.inc(7099);if ((((token.type == Token.TokenType.StartTag)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7100)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7101)==0&false))) {{
            __CLR4_2_15ge5gejpaexqnf.R.inc(7102);Token.StartTag startTag = (Token.StartTag) token;
            __CLR4_2_15ge5gejpaexqnf.R.inc(7103);lastStartTag = startTag.tagName;
        } }else {__CLR4_2_15ge5gejpaexqnf.R.inc(7104);if ((((token.type == Token.TokenType.EndTag)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7105)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7106)==0&false))) {{
            __CLR4_2_15ge5gejpaexqnf.R.inc(7107);Token.EndTag endTag = (Token.EndTag) token;
            __CLR4_2_15ge5gejpaexqnf.R.inc(7108);if ((((endTag.attributes != null)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7109)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7110)==0&false)))
                {__CLR4_2_15ge5gejpaexqnf.R.inc(7111);error("Attributes incorrectly present on end tag");
        }}
    }}}finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void emit(final String str) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7112);
        // buffer strings up until last string token found, to emit only one token for a run of character refs etc.
        // does not set isEmitPending; read checks that
        __CLR4_2_15ge5gejpaexqnf.R.inc(7113);if ((((charsString == null)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7114)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7115)==0&false))) {{
            __CLR4_2_15ge5gejpaexqnf.R.inc(7116);charsString = str;
        }
        }else {{
            __CLR4_2_15ge5gejpaexqnf.R.inc(7117);if ((((charsBuilder.length() == 0)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7118)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7119)==0&false))) {{ // switching to string builder as more than one emit before read
                __CLR4_2_15ge5gejpaexqnf.R.inc(7120);charsBuilder.append(charsString);
            }
            }__CLR4_2_15ge5gejpaexqnf.R.inc(7121);charsBuilder.append(str);
        }
    }}finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void emit(char[] chars) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7122);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7123);emit(String.valueOf(chars));
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void emit(int[] codepoints) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7124);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7125);emit(new String(codepoints, 0, codepoints.length));
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void emit(char c) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7126);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7127);emit(String.valueOf(c));
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    TokeniserState getState() {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7128);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7129);return state;
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void transition(TokeniserState state) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7130);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7131);this.state = state;
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void advanceTransition(TokeniserState state) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7132);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7133);reader.advance();
        __CLR4_2_15ge5gejpaexqnf.R.inc(7134);this.state = state;
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    final private int[] codepointHolder = new int[1]; // holder to not have to keep creating arrays
    final private int[] multipointHolder = new int[2];
    int[] consumeCharacterReference(Character additionalAllowedCharacter, boolean inAttribute) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7135);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7136);if ((((reader.isEmpty())&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7137)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7138)==0&false)))
            {__CLR4_2_15ge5gejpaexqnf.R.inc(7139);return null;
        }__CLR4_2_15ge5gejpaexqnf.R.inc(7140);if ((((additionalAllowedCharacter != null && additionalAllowedCharacter == reader.current())&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7141)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7142)==0&false)))
            {__CLR4_2_15ge5gejpaexqnf.R.inc(7143);return null;
        }__CLR4_2_15ge5gejpaexqnf.R.inc(7144);if ((((reader.matchesAnySorted(notCharRefCharsSorted))&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7145)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7146)==0&false)))
            {__CLR4_2_15ge5gejpaexqnf.R.inc(7147);return null;

        }__CLR4_2_15ge5gejpaexqnf.R.inc(7148);final int[] codeRef = codepointHolder;
        __CLR4_2_15ge5gejpaexqnf.R.inc(7149);reader.mark();
        __CLR4_2_15ge5gejpaexqnf.R.inc(7150);if ((((reader.matchConsume("#"))&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7151)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7152)==0&false))) {{ // numbered
            __CLR4_2_15ge5gejpaexqnf.R.inc(7153);boolean isHexMode = reader.matchConsumeIgnoreCase("X");
            __CLR4_2_15ge5gejpaexqnf.R.inc(7154);String numRef = (((isHexMode )&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7155)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7156)==0&false))? reader.consumeHexSequence() : reader.consumeDigitSequence();
            __CLR4_2_15ge5gejpaexqnf.R.inc(7157);if ((((numRef.length() == 0)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7158)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7159)==0&false))) {{ // didn't match anything
                __CLR4_2_15ge5gejpaexqnf.R.inc(7160);characterReferenceError("numeric reference with no numerals");
                __CLR4_2_15ge5gejpaexqnf.R.inc(7161);reader.rewindToMark();
                __CLR4_2_15ge5gejpaexqnf.R.inc(7162);return null;
            }
            }__CLR4_2_15ge5gejpaexqnf.R.inc(7163);if ((((!reader.matchConsume(";"))&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7164)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7165)==0&false)))
                {__CLR4_2_15ge5gejpaexqnf.R.inc(7166);characterReferenceError("missing semicolon"); // missing semi
            }__CLR4_2_15ge5gejpaexqnf.R.inc(7167);int charval = -1;
            __CLR4_2_15ge5gejpaexqnf.R.inc(7168);try {
                __CLR4_2_15ge5gejpaexqnf.R.inc(7169);int base = (((isHexMode )&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7170)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7171)==0&false))? 16 : 10;
                __CLR4_2_15ge5gejpaexqnf.R.inc(7172);charval = Integer.valueOf(numRef, base);
            } catch (NumberFormatException ignored) {
            } // skip
            __CLR4_2_15ge5gejpaexqnf.R.inc(7173);if ((((charval == -1 || (charval >= 0xD800 && charval <= 0xDFFF) || charval > 0x10FFFF)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7174)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7175)==0&false))) {{
                __CLR4_2_15ge5gejpaexqnf.R.inc(7176);characterReferenceError("character outside of valid range");
                __CLR4_2_15ge5gejpaexqnf.R.inc(7177);codeRef[0] = replacementChar;
                __CLR4_2_15ge5gejpaexqnf.R.inc(7178);return codeRef;
            } }else {{
                // fix illegal unicode characters to match browser behavior
                __CLR4_2_15ge5gejpaexqnf.R.inc(7179);if ((((charval >= win1252ExtensionsStart && charval < win1252ExtensionsStart + win1252Extensions.length)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7180)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7181)==0&false))) {{
                    __CLR4_2_15ge5gejpaexqnf.R.inc(7182);characterReferenceError("character is not a valid unicode code point");
                    __CLR4_2_15ge5gejpaexqnf.R.inc(7183);charval = win1252Extensions[charval - win1252ExtensionsStart];
                }

                // todo: implement number replacement table
                // todo: check for extra illegal unicode points as parse errors
                }__CLR4_2_15ge5gejpaexqnf.R.inc(7184);codeRef[0] = charval;
                __CLR4_2_15ge5gejpaexqnf.R.inc(7185);return codeRef;
            }
        }} }else {{ // named
            // get as many letters as possible, and look for matching entities.
            __CLR4_2_15ge5gejpaexqnf.R.inc(7186);String nameRef = reader.consumeLetterThenDigitSequence();
            __CLR4_2_15ge5gejpaexqnf.R.inc(7187);boolean looksLegit = reader.matches(';');
            // found if a base named entity without a ;, or an extended entity with the ;.
            __CLR4_2_15ge5gejpaexqnf.R.inc(7188);boolean found = (Entities.isBaseNamedEntity(nameRef) || (Entities.isNamedEntity(nameRef) && looksLegit));

            __CLR4_2_15ge5gejpaexqnf.R.inc(7189);if ((((!found)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7190)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7191)==0&false))) {{
                __CLR4_2_15ge5gejpaexqnf.R.inc(7192);reader.rewindToMark();
                __CLR4_2_15ge5gejpaexqnf.R.inc(7193);if ((((looksLegit)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7194)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7195)==0&false))) // named with semicolon
                    {__CLR4_2_15ge5gejpaexqnf.R.inc(7196);characterReferenceError(String.format("invalid named referenece '%s'", nameRef));
                }__CLR4_2_15ge5gejpaexqnf.R.inc(7197);return null;
            }
            }__CLR4_2_15ge5gejpaexqnf.R.inc(7198);if ((((inAttribute && (reader.matchesLetter() || reader.matchesDigit() || reader.matchesAny('=', '-', '_')))&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7199)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7200)==0&false))) {{
                // don't want that to match
                __CLR4_2_15ge5gejpaexqnf.R.inc(7201);reader.rewindToMark();
                __CLR4_2_15ge5gejpaexqnf.R.inc(7202);return null;
            }
            }__CLR4_2_15ge5gejpaexqnf.R.inc(7203);if ((((!reader.matchConsume(";"))&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7204)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7205)==0&false)))
                {__CLR4_2_15ge5gejpaexqnf.R.inc(7206);characterReferenceError("missing semicolon"); // missing semi
            }__CLR4_2_15ge5gejpaexqnf.R.inc(7207);int numChars = Entities.codepointsForName(nameRef, multipointHolder);
            __CLR4_2_15ge5gejpaexqnf.R.inc(7208);if ((((numChars == 1)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7209)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7210)==0&false))) {{
                __CLR4_2_15ge5gejpaexqnf.R.inc(7211);codeRef[0] = multipointHolder[0];
                __CLR4_2_15ge5gejpaexqnf.R.inc(7212);return codeRef;
            } }else {__CLR4_2_15ge5gejpaexqnf.R.inc(7213);if ((((numChars ==2)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7214)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7215)==0&false))) {{
                __CLR4_2_15ge5gejpaexqnf.R.inc(7216);return multipointHolder;
            } }else {{
                __CLR4_2_15ge5gejpaexqnf.R.inc(7217);Validate.fail("Unexpected characters returned for " + nameRef);
                __CLR4_2_15ge5gejpaexqnf.R.inc(7218);return multipointHolder;
            }
        }}}
    }}finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    Token.Tag createTagPending(boolean start) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7219);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7220);tagPending = (((start )&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7221)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7222)==0&false))? startPending.reset() : endPending.reset();
        __CLR4_2_15ge5gejpaexqnf.R.inc(7223);return tagPending;
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void emitTagPending() {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7224);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7225);tagPending.finaliseTag();
        __CLR4_2_15ge5gejpaexqnf.R.inc(7226);emit(tagPending);
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void createCommentPending() {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7227);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7228);commentPending.reset();
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void emitCommentPending() {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7229);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7230);emit(commentPending);
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void createDoctypePending() {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7231);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7232);doctypePending.reset();
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void emitDoctypePending() {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7233);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7234);emit(doctypePending);
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void createTempBuffer() {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7235);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7236);Token.reset(dataBuffer);
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    boolean isAppropriateEndTagToken() {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7237);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7238);return lastStartTag != null && tagPending.name().equalsIgnoreCase(lastStartTag);
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    String appropriateEndTagName() {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7239);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7240);return lastStartTag; // could be null
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void error(TokeniserState state) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7241);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7242);if ((((errors.canAddError())&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7243)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7244)==0&false)))
            {__CLR4_2_15ge5gejpaexqnf.R.inc(7245);errors.add(new ParseError(reader.pos(), "Unexpected character '%s' in input state [%s]", reader.current(), state));
    }}finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void eofError(TokeniserState state) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7246);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7247);if ((((errors.canAddError())&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7248)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7249)==0&false)))
            {__CLR4_2_15ge5gejpaexqnf.R.inc(7250);errors.add(new ParseError(reader.pos(), "Unexpectedly reached end of file (EOF) in input state [%s]", state));
    }}finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    private void characterReferenceError(String message) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7251);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7252);if ((((errors.canAddError())&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7253)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7254)==0&false)))
            {__CLR4_2_15ge5gejpaexqnf.R.inc(7255);errors.add(new ParseError(reader.pos(), "Invalid character reference: %s", message));
    }}finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    void error(String errorMsg) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7256);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7257);if ((((errors.canAddError())&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7258)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7259)==0&false)))
            {__CLR4_2_15ge5gejpaexqnf.R.inc(7260);errors.add(new ParseError(reader.pos(), errorMsg));
    }}finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    boolean currentNodeInHtmlNS() {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7261);
        // todo: implement namespaces correctly
        __CLR4_2_15ge5gejpaexqnf.R.inc(7262);return true;
        // Element currentNode = currentNode();
        // return currentNode != null && currentNode.namespace().equals("HTML");
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}

    /**
     * Utility method to consume reader and unescape entities found within.
     * @param inAttribute if the text to be unescaped is in an attribute
     * @return unescaped string from reader
     */
    String unescapeEntities(boolean inAttribute) {try{__CLR4_2_15ge5gejpaexqnf.R.inc(7263);
        __CLR4_2_15ge5gejpaexqnf.R.inc(7264);StringBuilder builder = StringUtil.borrowBuilder();
        __CLR4_2_15ge5gejpaexqnf.R.inc(7265);while ((((!reader.isEmpty())&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7266)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7267)==0&false))) {{
            __CLR4_2_15ge5gejpaexqnf.R.inc(7268);builder.append(reader.consumeTo('&'));
            __CLR4_2_15ge5gejpaexqnf.R.inc(7269);if ((((reader.matches('&'))&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7270)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7271)==0&false))) {{
                __CLR4_2_15ge5gejpaexqnf.R.inc(7272);reader.consume();
                __CLR4_2_15ge5gejpaexqnf.R.inc(7273);int[] c = consumeCharacterReference(null, inAttribute);
                __CLR4_2_15ge5gejpaexqnf.R.inc(7274);if ((((c == null || c.length==0)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7275)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7276)==0&false)))
                    {__CLR4_2_15ge5gejpaexqnf.R.inc(7277);builder.append('&');
                }else {{
                    __CLR4_2_15ge5gejpaexqnf.R.inc(7278);builder.appendCodePoint(c[0]);
                    __CLR4_2_15ge5gejpaexqnf.R.inc(7279);if ((((c.length == 2)&&(__CLR4_2_15ge5gejpaexqnf.R.iget(7280)!=0|true))||(__CLR4_2_15ge5gejpaexqnf.R.iget(7281)==0&false)))
                        {__CLR4_2_15ge5gejpaexqnf.R.inc(7282);builder.appendCodePoint(c[1]);
                }}

            }}
        }}
        }__CLR4_2_15ge5gejpaexqnf.R.inc(7283);return StringUtil.releaseBuilder(builder);
    }finally{__CLR4_2_15ge5gejpaexqnf.R.flushNeeded();}}
}
