/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.parser;

import org.jsoup.nodes.DocumentType;

/**
 * States and transition activations for the Tokeniser.
 */
@java.lang.SuppressWarnings({"fallthrough"}) enum TokeniserState {
    Data {
        // in data state, gather characters until a character reference or tag is found
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7284);
            boolean __CLB4_2_1_bool0=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7285);switch (r.current()) {
                case '&':if (!__CLB4_2_1_bool0) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7286);__CLB4_2_1_bool0=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7287);t.advanceTransition(CharacterReferenceInData);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7288);break;
                case '<':if (!__CLB4_2_1_bool0) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7289);__CLB4_2_1_bool0=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7290);t.advanceTransition(TagOpen);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7291);break;
                case nullChar:if (!__CLB4_2_1_bool0) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7292);__CLB4_2_1_bool0=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7293);t.error(this); // NOT replacement character (oddly?)
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7294);t.emit(r.consume());
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7295);break;
                case eof:if (!__CLB4_2_1_bool0) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7296);__CLB4_2_1_bool0=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7297);t.emit(new Token.EOF());
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7298);break;
                default:if (!__CLB4_2_1_bool0) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7299);__CLB4_2_1_bool0=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7300);String data = r.consumeData();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7301);t.emit(data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7302);break;
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    CharacterReferenceInData {
        // from & in data
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7303);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7304);readCharRef(t, Data);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    Rcdata {
        /// handles data in title, textarea etc
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7305);
            boolean __CLB4_2_1_bool1=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7306);switch (r.current()) {
                case '&':if (!__CLB4_2_1_bool1) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7307);__CLB4_2_1_bool1=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7308);t.advanceTransition(CharacterReferenceInRcdata);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7309);break;
                case '<':if (!__CLB4_2_1_bool1) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7310);__CLB4_2_1_bool1=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7311);t.advanceTransition(RcdataLessthanSign);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7312);break;
                case nullChar:if (!__CLB4_2_1_bool1) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7313);__CLB4_2_1_bool1=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7314);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7315);r.advance();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7316);t.emit(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7317);break;
                case eof:if (!__CLB4_2_1_bool1) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7318);__CLB4_2_1_bool1=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7319);t.emit(new Token.EOF());
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7320);break;
                default:if (!__CLB4_2_1_bool1) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7321);__CLB4_2_1_bool1=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7322);String data = r.consumeToAny('&', '<', nullChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7323);t.emit(data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7324);break;
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    CharacterReferenceInRcdata {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7325);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7326);readCharRef(t, Rcdata);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    Rawtext {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7327);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7328);readData(t, r, this, RawtextLessthanSign);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptData {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7329);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7330);readData(t, r, this, ScriptDataLessthanSign);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    PLAINTEXT {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7331);
            boolean __CLB4_2_1_bool2=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7332);switch (r.current()) {
                case nullChar:if (!__CLB4_2_1_bool2) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7333);__CLB4_2_1_bool2=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7334);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7335);r.advance();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7336);t.emit(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7337);break;
                case eof:if (!__CLB4_2_1_bool2) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7338);__CLB4_2_1_bool2=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7339);t.emit(new Token.EOF());
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7340);break;
                default:if (!__CLB4_2_1_bool2) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7341);__CLB4_2_1_bool2=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7342);String data = r.consumeTo(nullChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7343);t.emit(data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7344);break;
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    TagOpen {
        // from < in data
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7345);
            boolean __CLB4_2_1_bool3=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7346);switch (r.current()) {
                case '!':if (!__CLB4_2_1_bool3) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7347);__CLB4_2_1_bool3=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7348);t.advanceTransition(MarkupDeclarationOpen);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7349);break;
                case '/':if (!__CLB4_2_1_bool3) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7350);__CLB4_2_1_bool3=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7351);t.advanceTransition(EndTagOpen);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7352);break;
                case '?':if (!__CLB4_2_1_bool3) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7353);__CLB4_2_1_bool3=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7354);t.advanceTransition(BogusComment);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7355);break;
                default:if (!__CLB4_2_1_bool3) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7356);__CLB4_2_1_bool3=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7357);if ((((r.matchesLetter())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7358)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7359)==0&false))) {{
                        __CLR4_2_15mc5mcjp2rxa9c.R.inc(7360);t.createTagPending(true);
                        __CLR4_2_15mc5mcjp2rxa9c.R.inc(7361);t.transition(TagName);
                    } }else {{
                        __CLR4_2_15mc5mcjp2rxa9c.R.inc(7362);t.error(this);
                        __CLR4_2_15mc5mcjp2rxa9c.R.inc(7363);t.emit('<'); // char that got us here
                        __CLR4_2_15mc5mcjp2rxa9c.R.inc(7364);t.transition(Data);
                    }
                    }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7365);break;
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    EndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7366);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7367);if ((((r.isEmpty())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7368)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7369)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7370);t.eofError(this);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7371);t.emit("</");
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7372);t.transition(Data);
            } }else {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7373);if ((((r.matchesLetter())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7374)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7375)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7376);t.createTagPending(false);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7377);t.transition(TagName);
            } }else {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7378);if ((((r.matches('>'))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7379)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7380)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7381);t.error(this);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7382);t.advanceTransition(Data);
            } }else {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7383);t.error(this);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7384);t.advanceTransition(BogusComment);
            }
        }}}}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    TagName {
        // from < or </ in data, will have start or end tag pending
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7385);
            // previous TagOpen state did NOT consume, will have a letter char in current
            //String tagName = r.consumeToAnySorted(tagCharsSorted).toLowerCase();
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7386);String tagName = r.consumeTagName();
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7387);t.tagPending.appendTagName(tagName);

            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7388);char c = r.consume();
            boolean __CLB4_2_1_bool4=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7389);switch (c) {
                case '\t':if (!__CLB4_2_1_bool4) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7390);__CLB4_2_1_bool4=true;}
                case '\n':if (!__CLB4_2_1_bool4) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7391);__CLB4_2_1_bool4=true;}
                case '\r':if (!__CLB4_2_1_bool4) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7392);__CLB4_2_1_bool4=true;}
                case '\f':if (!__CLB4_2_1_bool4) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7393);__CLB4_2_1_bool4=true;}
                case ' ':if (!__CLB4_2_1_bool4) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7394);__CLB4_2_1_bool4=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7395);t.transition(BeforeAttributeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7396);break;
                case '/':if (!__CLB4_2_1_bool4) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7397);__CLB4_2_1_bool4=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7398);t.transition(SelfClosingStartTag);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7399);break;
                case '<':if (!__CLB4_2_1_bool4) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7400);__CLB4_2_1_bool4=true;} // NOTE: out of spec, but clear author intent
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7401);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7402);r.unconsume();
                    // intended fall through to next >
                case '>':if (!__CLB4_2_1_bool4) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7403);__CLB4_2_1_bool4=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7404);t.emitTagPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7405);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7406);break;
                case nullChar:if (!__CLB4_2_1_bool4) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7407);__CLB4_2_1_bool4=true;} // replacement
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7408);t.tagPending.appendTagName(replacementStr);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7409);break;
                case eof:if (!__CLB4_2_1_bool4) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7410);__CLB4_2_1_bool4=true;} // should emit pending tag?
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7411);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7412);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7413);break;
                default:if (!__CLB4_2_1_bool4) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7414);__CLB4_2_1_bool4=true;} // buffer underrun
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7415);t.tagPending.appendTagName(c);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    RcdataLessthanSign {
        // from < in rcdata
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7416);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7417);if ((((r.matches('/'))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7418)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7419)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7420);t.createTempBuffer();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7421);t.advanceTransition(RCDATAEndTagOpen);
            } }else {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7422);if ((((r.matchesLetter() && t.appropriateEndTagName() != null && !r.containsIgnoreCase("</" + t.appropriateEndTagName()))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7423)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7424)==0&false))) {{
                // diverge from spec: got a start tag, but there's no appropriate end tag (</title>), so rather than
                // consuming to EOF; break out here
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7425);t.tagPending = t.createTagPending(false).name(t.appropriateEndTagName());
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7426);t.emitTagPending();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7427);r.unconsume(); // undo "<"
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7428);t.transition(Data);
            } }else {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7429);t.emit("<");
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7430);t.transition(Rcdata);
            }
        }}}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    RCDATAEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7431);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7432);if ((((r.matchesLetter())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7433)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7434)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7435);t.createTagPending(false);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7436);t.tagPending.appendTagName(r.current());
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7437);t.dataBuffer.append(r.current());
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7438);t.advanceTransition(RCDATAEndTagName);
            } }else {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7439);t.emit("</");
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7440);t.transition(Rcdata);
            }
        }}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    RCDATAEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7441);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7442);if ((((r.matchesLetter())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7443)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7444)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7445);String name = r.consumeLetterSequence();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7446);t.tagPending.appendTagName(name);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7447);t.dataBuffer.append(name);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7448);return;
            }

            }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7449);char c = r.consume();
            boolean __CLB4_2_1_bool5=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7450);switch (c) {
                case '\t':if (!__CLB4_2_1_bool5) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7451);__CLB4_2_1_bool5=true;}
                case '\n':if (!__CLB4_2_1_bool5) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7452);__CLB4_2_1_bool5=true;}
                case '\r':if (!__CLB4_2_1_bool5) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7453);__CLB4_2_1_bool5=true;}
                case '\f':if (!__CLB4_2_1_bool5) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7454);__CLB4_2_1_bool5=true;}
                case ' ':if (!__CLB4_2_1_bool5) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7455);__CLB4_2_1_bool5=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7456);if ((((t.isAppropriateEndTagToken())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7457)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7458)==0&false)))
                        {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7459);t.transition(BeforeAttributeName);
                    }else
                        {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7460);anythingElse(t, r);
                    }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7461);break;
                case '/':if (!__CLB4_2_1_bool5) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7462);__CLB4_2_1_bool5=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7463);if ((((t.isAppropriateEndTagToken())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7464)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7465)==0&false)))
                        {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7466);t.transition(SelfClosingStartTag);
                    }else
                        {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7467);anythingElse(t, r);
                    }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7468);break;
                case '>':if (!__CLB4_2_1_bool5) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7469);__CLB4_2_1_bool5=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7470);if ((((t.isAppropriateEndTagToken())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7471)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7472)==0&false))) {{
                        __CLR4_2_15mc5mcjp2rxa9c.R.inc(7473);t.emitTagPending();
                        __CLR4_2_15mc5mcjp2rxa9c.R.inc(7474);t.transition(Data);
                    }
                    }else
                        {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7475);anythingElse(t, r);
                    }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7476);break;
                default:if (!__CLB4_2_1_bool5) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7477);__CLB4_2_1_bool5=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7478);anythingElse(t, r);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}

        private void anythingElse(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7479);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7480);t.emit("</" + t.dataBuffer.toString());
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7481);r.unconsume();
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7482);t.transition(Rcdata);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    RawtextLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7483);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7484);if ((((r.matches('/'))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7485)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7486)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7487);t.createTempBuffer();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7488);t.advanceTransition(RawtextEndTagOpen);
            } }else {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7489);t.emit('<');
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7490);t.transition(Rawtext);
            }
        }}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    RawtextEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7491);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7492);readEndTag(t, r, RawtextEndTagName, Rawtext);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    RawtextEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7493);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7494);handleDataEndTag(t, r, Rawtext);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7495);
            boolean __CLB4_2_1_bool6=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7496);switch (r.consume()) {
                case '/':if (!__CLB4_2_1_bool6) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7497);__CLB4_2_1_bool6=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7498);t.createTempBuffer();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7499);t.transition(ScriptDataEndTagOpen);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7500);break;
                case '!':if (!__CLB4_2_1_bool6) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7501);__CLB4_2_1_bool6=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7502);t.emit("<!");
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7503);t.transition(ScriptDataEscapeStart);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7504);break;
                default:if (!__CLB4_2_1_bool6) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7505);__CLB4_2_1_bool6=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7506);t.emit("<");
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7507);r.unconsume();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7508);t.transition(ScriptData);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7509);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7510);readEndTag(t, r, ScriptDataEndTagName, ScriptData);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7511);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7512);handleDataEndTag(t, r, ScriptData);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataEscapeStart {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7513);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7514);if ((((r.matches('-'))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7515)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7516)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7517);t.emit('-');
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7518);t.advanceTransition(ScriptDataEscapeStartDash);
            } }else {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7519);t.transition(ScriptData);
            }
        }}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataEscapeStartDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7520);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7521);if ((((r.matches('-'))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7522)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7523)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7524);t.emit('-');
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7525);t.advanceTransition(ScriptDataEscapedDashDash);
            } }else {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7526);t.transition(ScriptData);
            }
        }}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataEscaped {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7527);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7528);if ((((r.isEmpty())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7529)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7530)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7531);t.eofError(this);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7532);t.transition(Data);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7533);return;
            }

            }boolean __CLB4_2_1_bool7=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7534);switch (r.current()) {
                case '-':if (!__CLB4_2_1_bool7) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7535);__CLB4_2_1_bool7=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7536);t.emit('-');
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7537);t.advanceTransition(ScriptDataEscapedDash);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7538);break;
                case '<':if (!__CLB4_2_1_bool7) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7539);__CLB4_2_1_bool7=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7540);t.advanceTransition(ScriptDataEscapedLessthanSign);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7541);break;
                case nullChar:if (!__CLB4_2_1_bool7) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7542);__CLB4_2_1_bool7=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7543);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7544);r.advance();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7545);t.emit(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7546);break;
                default:if (!__CLB4_2_1_bool7) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7547);__CLB4_2_1_bool7=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7548);String data = r.consumeToAny('-', '<', nullChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7549);t.emit(data);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataEscapedDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7550);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7551);if ((((r.isEmpty())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7552)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7553)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7554);t.eofError(this);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7555);t.transition(Data);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7556);return;
            }

            }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7557);char c = r.consume();
            boolean __CLB4_2_1_bool8=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7558);switch (c) {
                case '-':if (!__CLB4_2_1_bool8) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7559);__CLB4_2_1_bool8=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7560);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7561);t.transition(ScriptDataEscapedDashDash);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7562);break;
                case '<':if (!__CLB4_2_1_bool8) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7563);__CLB4_2_1_bool8=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7564);t.transition(ScriptDataEscapedLessthanSign);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7565);break;
                case nullChar:if (!__CLB4_2_1_bool8) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7566);__CLB4_2_1_bool8=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7567);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7568);t.emit(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7569);t.transition(ScriptDataEscaped);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7570);break;
                default:if (!__CLB4_2_1_bool8) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7571);__CLB4_2_1_bool8=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7572);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7573);t.transition(ScriptDataEscaped);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataEscapedDashDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7574);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7575);if ((((r.isEmpty())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7576)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7577)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7578);t.eofError(this);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7579);t.transition(Data);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7580);return;
            }

            }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7581);char c = r.consume();
            boolean __CLB4_2_1_bool9=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7582);switch (c) {
                case '-':if (!__CLB4_2_1_bool9) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7583);__CLB4_2_1_bool9=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7584);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7585);break;
                case '<':if (!__CLB4_2_1_bool9) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7586);__CLB4_2_1_bool9=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7587);t.transition(ScriptDataEscapedLessthanSign);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7588);break;
                case '>':if (!__CLB4_2_1_bool9) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7589);__CLB4_2_1_bool9=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7590);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7591);t.transition(ScriptData);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7592);break;
                case nullChar:if (!__CLB4_2_1_bool9) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7593);__CLB4_2_1_bool9=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7594);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7595);t.emit(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7596);t.transition(ScriptDataEscaped);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7597);break;
                default:if (!__CLB4_2_1_bool9) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7598);__CLB4_2_1_bool9=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7599);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7600);t.transition(ScriptDataEscaped);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataEscapedLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7601);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7602);if ((((r.matchesLetter())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7603)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7604)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7605);t.createTempBuffer();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7606);t.dataBuffer.append(r.current());
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7607);t.emit("<" + r.current());
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7608);t.advanceTransition(ScriptDataDoubleEscapeStart);
            } }else {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7609);if ((((r.matches('/'))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7610)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7611)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7612);t.createTempBuffer();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7613);t.advanceTransition(ScriptDataEscapedEndTagOpen);
            } }else {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7614);t.emit('<');
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7615);t.transition(ScriptDataEscaped);
            }
        }}}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataEscapedEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7616);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7617);if ((((r.matchesLetter())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7618)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7619)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7620);t.createTagPending(false);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7621);t.tagPending.appendTagName(r.current());
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7622);t.dataBuffer.append(r.current());
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7623);t.advanceTransition(ScriptDataEscapedEndTagName);
            } }else {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7624);t.emit("</");
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7625);t.transition(ScriptDataEscaped);
            }
        }}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataEscapedEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7626);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7627);handleDataEndTag(t, r, ScriptDataEscaped);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapeStart {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7628);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7629);handleDataDoubleEscapeTag(t, r, ScriptDataDoubleEscaped, ScriptDataEscaped);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataDoubleEscaped {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7630);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7631);char c = r.current();
            boolean __CLB4_2_1_bool10=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7632);switch (c) {
                case '-':if (!__CLB4_2_1_bool10) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7633);__CLB4_2_1_bool10=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7634);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7635);t.advanceTransition(ScriptDataDoubleEscapedDash);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7636);break;
                case '<':if (!__CLB4_2_1_bool10) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7637);__CLB4_2_1_bool10=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7638);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7639);t.advanceTransition(ScriptDataDoubleEscapedLessthanSign);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7640);break;
                case nullChar:if (!__CLB4_2_1_bool10) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7641);__CLB4_2_1_bool10=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7642);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7643);r.advance();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7644);t.emit(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7645);break;
                case eof:if (!__CLB4_2_1_bool10) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7646);__CLB4_2_1_bool10=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7647);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7648);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7649);break;
                default:if (!__CLB4_2_1_bool10) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7650);__CLB4_2_1_bool10=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7651);String data = r.consumeToAny('-', '<', nullChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7652);t.emit(data);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapedDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7653);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7654);char c = r.consume();
            boolean __CLB4_2_1_bool11=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7655);switch (c) {
                case '-':if (!__CLB4_2_1_bool11) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7656);__CLB4_2_1_bool11=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7657);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7658);t.transition(ScriptDataDoubleEscapedDashDash);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7659);break;
                case '<':if (!__CLB4_2_1_bool11) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7660);__CLB4_2_1_bool11=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7661);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7662);t.transition(ScriptDataDoubleEscapedLessthanSign);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7663);break;
                case nullChar:if (!__CLB4_2_1_bool11) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7664);__CLB4_2_1_bool11=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7665);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7666);t.emit(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7667);t.transition(ScriptDataDoubleEscaped);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7668);break;
                case eof:if (!__CLB4_2_1_bool11) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7669);__CLB4_2_1_bool11=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7670);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7671);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7672);break;
                default:if (!__CLB4_2_1_bool11) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7673);__CLB4_2_1_bool11=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7674);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7675);t.transition(ScriptDataDoubleEscaped);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapedDashDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7676);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7677);char c = r.consume();
            boolean __CLB4_2_1_bool12=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7678);switch (c) {
                case '-':if (!__CLB4_2_1_bool12) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7679);__CLB4_2_1_bool12=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7680);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7681);break;
                case '<':if (!__CLB4_2_1_bool12) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7682);__CLB4_2_1_bool12=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7683);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7684);t.transition(ScriptDataDoubleEscapedLessthanSign);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7685);break;
                case '>':if (!__CLB4_2_1_bool12) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7686);__CLB4_2_1_bool12=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7687);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7688);t.transition(ScriptData);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7689);break;
                case nullChar:if (!__CLB4_2_1_bool12) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7690);__CLB4_2_1_bool12=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7691);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7692);t.emit(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7693);t.transition(ScriptDataDoubleEscaped);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7694);break;
                case eof:if (!__CLB4_2_1_bool12) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7695);__CLB4_2_1_bool12=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7696);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7697);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7698);break;
                default:if (!__CLB4_2_1_bool12) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7699);__CLB4_2_1_bool12=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7700);t.emit(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7701);t.transition(ScriptDataDoubleEscaped);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapedLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7702);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7703);if ((((r.matches('/'))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7704)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7705)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7706);t.emit('/');
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7707);t.createTempBuffer();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7708);t.advanceTransition(ScriptDataDoubleEscapeEnd);
            } }else {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(7709);t.transition(ScriptDataDoubleEscaped);
            }
        }}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapeEnd {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7710);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7711);handleDataDoubleEscapeTag(t,r, ScriptDataEscaped, ScriptDataDoubleEscaped);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    BeforeAttributeName {
        // from tagname <xxx
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7712);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7713);char c = r.consume();
            boolean __CLB4_2_1_bool13=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7714);switch (c) {
                case '\t':if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7715);__CLB4_2_1_bool13=true;}
                case '\n':if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7716);__CLB4_2_1_bool13=true;}
                case '\r':if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7717);__CLB4_2_1_bool13=true;}
                case '\f':if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7718);__CLB4_2_1_bool13=true;}
                case ' ':if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7719);__CLB4_2_1_bool13=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7720);break; // ignore whitespace
                case '/':if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7721);__CLB4_2_1_bool13=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7722);t.transition(SelfClosingStartTag);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7723);break;
                case '<':if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7724);__CLB4_2_1_bool13=true;} // NOTE: out of spec, but clear (spec has this as a part of the attribute name)
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7725);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7726);r.unconsume();
                    // intended fall through as if >
                case '>':if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7727);__CLB4_2_1_bool13=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7728);t.emitTagPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7729);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7730);break;
                case nullChar:if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7731);__CLB4_2_1_bool13=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7732);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7733);t.tagPending.newAttribute();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7734);r.unconsume();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7735);t.transition(AttributeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7736);break;
                case eof:if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7737);__CLB4_2_1_bool13=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7738);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7739);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7740);break;
                case '"':if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7741);__CLB4_2_1_bool13=true;}
                case '\'':if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7742);__CLB4_2_1_bool13=true;}
                case '=':if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7743);__CLB4_2_1_bool13=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7744);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7745);t.tagPending.newAttribute();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7746);t.tagPending.appendAttributeName(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7747);t.transition(AttributeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7748);break;
                default:if (!__CLB4_2_1_bool13) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7749);__CLB4_2_1_bool13=true;} // A-Z, anything else
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7750);t.tagPending.newAttribute();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7751);r.unconsume();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7752);t.transition(AttributeName);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    AttributeName {
        // from before attribute name
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7753);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7754);String name = r.consumeToAnySorted(attributeNameCharsSorted);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7755);t.tagPending.appendAttributeName(name);

            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7756);char c = r.consume();
            boolean __CLB4_2_1_bool14=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7757);switch (c) {
                case '\t':if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7758);__CLB4_2_1_bool14=true;}
                case '\n':if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7759);__CLB4_2_1_bool14=true;}
                case '\r':if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7760);__CLB4_2_1_bool14=true;}
                case '\f':if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7761);__CLB4_2_1_bool14=true;}
                case ' ':if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7762);__CLB4_2_1_bool14=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7763);t.transition(AfterAttributeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7764);break;
                case '/':if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7765);__CLB4_2_1_bool14=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7766);t.transition(SelfClosingStartTag);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7767);break;
                case '=':if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7768);__CLB4_2_1_bool14=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7769);t.transition(BeforeAttributeValue);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7770);break;
                case '>':if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7771);__CLB4_2_1_bool14=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7772);t.emitTagPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7773);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7774);break;
                case nullChar:if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7775);__CLB4_2_1_bool14=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7776);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7777);t.tagPending.appendAttributeName(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7778);break;
                case eof:if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7779);__CLB4_2_1_bool14=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7780);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7781);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7782);break;
                case '"':if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7783);__CLB4_2_1_bool14=true;}
                case '\'':if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7784);__CLB4_2_1_bool14=true;}
                case '<':if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7785);__CLB4_2_1_bool14=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7786);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7787);t.tagPending.appendAttributeName(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7788);break;
                default:if (!__CLB4_2_1_bool14) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7789);__CLB4_2_1_bool14=true;} // buffer underrun
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7790);t.tagPending.appendAttributeName(c);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    AfterAttributeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7791);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7792);char c = r.consume();
            boolean __CLB4_2_1_bool15=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7793);switch (c) {
                case '\t':if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7794);__CLB4_2_1_bool15=true;}
                case '\n':if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7795);__CLB4_2_1_bool15=true;}
                case '\r':if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7796);__CLB4_2_1_bool15=true;}
                case '\f':if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7797);__CLB4_2_1_bool15=true;}
                case ' ':if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7798);__CLB4_2_1_bool15=true;}
                    // ignore
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7799);break;
                case '/':if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7800);__CLB4_2_1_bool15=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7801);t.transition(SelfClosingStartTag);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7802);break;
                case '=':if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7803);__CLB4_2_1_bool15=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7804);t.transition(BeforeAttributeValue);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7805);break;
                case '>':if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7806);__CLB4_2_1_bool15=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7807);t.emitTagPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7808);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7809);break;
                case nullChar:if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7810);__CLB4_2_1_bool15=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7811);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7812);t.tagPending.appendAttributeName(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7813);t.transition(AttributeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7814);break;
                case eof:if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7815);__CLB4_2_1_bool15=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7816);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7817);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7818);break;
                case '"':if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7819);__CLB4_2_1_bool15=true;}
                case '\'':if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7820);__CLB4_2_1_bool15=true;}
                case '<':if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7821);__CLB4_2_1_bool15=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7822);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7823);t.tagPending.newAttribute();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7824);t.tagPending.appendAttributeName(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7825);t.transition(AttributeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7826);break;
                default:if (!__CLB4_2_1_bool15) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7827);__CLB4_2_1_bool15=true;} // A-Z, anything else
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7828);t.tagPending.newAttribute();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7829);r.unconsume();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7830);t.transition(AttributeName);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    BeforeAttributeValue {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7831);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7832);char c = r.consume();
            boolean __CLB4_2_1_bool16=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7833);switch (c) {
                case '\t':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7834);__CLB4_2_1_bool16=true;}
                case '\n':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7835);__CLB4_2_1_bool16=true;}
                case '\r':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7836);__CLB4_2_1_bool16=true;}
                case '\f':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7837);__CLB4_2_1_bool16=true;}
                case ' ':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7838);__CLB4_2_1_bool16=true;}
                    // ignore
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7839);break;
                case '"':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7840);__CLB4_2_1_bool16=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7841);t.transition(AttributeValue_doubleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7842);break;
                case '&':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7843);__CLB4_2_1_bool16=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7844);r.unconsume();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7845);t.transition(AttributeValue_unquoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7846);break;
                case '\'':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7847);__CLB4_2_1_bool16=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7848);t.transition(AttributeValue_singleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7849);break;
                case nullChar:if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7850);__CLB4_2_1_bool16=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7851);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7852);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7853);t.transition(AttributeValue_unquoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7854);break;
                case eof:if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7855);__CLB4_2_1_bool16=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7856);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7857);t.emitTagPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7858);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7859);break;
                case '>':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7860);__CLB4_2_1_bool16=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7861);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7862);t.emitTagPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7863);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7864);break;
                case '<':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7865);__CLB4_2_1_bool16=true;}
                case '=':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7866);__CLB4_2_1_bool16=true;}
                case '`':if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7867);__CLB4_2_1_bool16=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7868);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7869);t.tagPending.appendAttributeValue(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7870);t.transition(AttributeValue_unquoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7871);break;
                default:if (!__CLB4_2_1_bool16) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7872);__CLB4_2_1_bool16=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7873);r.unconsume();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7874);t.transition(AttributeValue_unquoted);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    AttributeValue_doubleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7875);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7876);String value = r.consumeToAny(attributeDoubleValueCharsSorted);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7877);if ((((value.length() > 0)&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7878)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7879)==0&false)))
                {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7880);t.tagPending.appendAttributeValue(value);
            }else
                {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7881);t.tagPending.setEmptyAttributeValue();

            }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7882);char c = r.consume();
            boolean __CLB4_2_1_bool17=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7883);switch (c) {
                case '"':if (!__CLB4_2_1_bool17) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7884);__CLB4_2_1_bool17=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7885);t.transition(AfterAttributeValue_quoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7886);break;
                case '&':if (!__CLB4_2_1_bool17) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7887);__CLB4_2_1_bool17=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7888);int[] ref = t.consumeCharacterReference('"', true);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7889);if ((((ref != null)&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7890)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7891)==0&false)))
                        {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7892);t.tagPending.appendAttributeValue(ref);
                    }else
                        {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7893);t.tagPending.appendAttributeValue('&');
                    }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7894);break;
                case nullChar:if (!__CLB4_2_1_bool17) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7895);__CLB4_2_1_bool17=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7896);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7897);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7898);break;
                case eof:if (!__CLB4_2_1_bool17) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7899);__CLB4_2_1_bool17=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7900);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7901);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7902);break;
                default:if (!__CLB4_2_1_bool17) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7903);__CLB4_2_1_bool17=true;} // hit end of buffer in first read, still in attribute
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7904);t.tagPending.appendAttributeValue(c);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    AttributeValue_singleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7905);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7906);String value = r.consumeToAny(attributeSingleValueCharsSorted);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7907);if ((((value.length() > 0)&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7908)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7909)==0&false)))
                {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7910);t.tagPending.appendAttributeValue(value);
            }else
                {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7911);t.tagPending.setEmptyAttributeValue();

            }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7912);char c = r.consume();
            boolean __CLB4_2_1_bool18=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7913);switch (c) {
                case '\'':if (!__CLB4_2_1_bool18) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7914);__CLB4_2_1_bool18=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7915);t.transition(AfterAttributeValue_quoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7916);break;
                case '&':if (!__CLB4_2_1_bool18) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7917);__CLB4_2_1_bool18=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7918);int[] ref = t.consumeCharacterReference('\'', true);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7919);if ((((ref != null)&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7920)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7921)==0&false)))
                        {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7922);t.tagPending.appendAttributeValue(ref);
                    }else
                        {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7923);t.tagPending.appendAttributeValue('&');
                    }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7924);break;
                case nullChar:if (!__CLB4_2_1_bool18) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7925);__CLB4_2_1_bool18=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7926);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7927);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7928);break;
                case eof:if (!__CLB4_2_1_bool18) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7929);__CLB4_2_1_bool18=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7930);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7931);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7932);break;
                default:if (!__CLB4_2_1_bool18) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7933);__CLB4_2_1_bool18=true;} // hit end of buffer in first read, still in attribute
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7934);t.tagPending.appendAttributeValue(c);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    AttributeValue_unquoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7935);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7936);String value = r.consumeToAnySorted(attributeValueUnquoted);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7937);if ((((value.length() > 0)&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7938)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7939)==0&false)))
                {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7940);t.tagPending.appendAttributeValue(value);

            }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7941);char c = r.consume();
            boolean __CLB4_2_1_bool19=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7942);switch (c) {
                case '\t':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7943);__CLB4_2_1_bool19=true;}
                case '\n':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7944);__CLB4_2_1_bool19=true;}
                case '\r':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7945);__CLB4_2_1_bool19=true;}
                case '\f':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7946);__CLB4_2_1_bool19=true;}
                case ' ':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7947);__CLB4_2_1_bool19=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7948);t.transition(BeforeAttributeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7949);break;
                case '&':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7950);__CLB4_2_1_bool19=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7951);int[] ref = t.consumeCharacterReference('>', true);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7952);if ((((ref != null)&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7953)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(7954)==0&false)))
                        {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7955);t.tagPending.appendAttributeValue(ref);
                    }else
                        {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7956);t.tagPending.appendAttributeValue('&');
                    }__CLR4_2_15mc5mcjp2rxa9c.R.inc(7957);break;
                case '>':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7958);__CLB4_2_1_bool19=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7959);t.emitTagPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7960);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7961);break;
                case nullChar:if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7962);__CLB4_2_1_bool19=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7963);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7964);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7965);break;
                case eof:if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7966);__CLB4_2_1_bool19=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7967);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7968);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7969);break;
                case '"':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7970);__CLB4_2_1_bool19=true;}
                case '\'':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7971);__CLB4_2_1_bool19=true;}
                case '<':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7972);__CLB4_2_1_bool19=true;}
                case '=':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7973);__CLB4_2_1_bool19=true;}
                case '`':if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7974);__CLB4_2_1_bool19=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7975);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7976);t.tagPending.appendAttributeValue(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7977);break;
                default:if (!__CLB4_2_1_bool19) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7978);__CLB4_2_1_bool19=true;} // hit end of buffer in first read, still in attribute
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7979);t.tagPending.appendAttributeValue(c);
            }

        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    // CharacterReferenceInAttributeValue state handled inline
    AfterAttributeValue_quoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(7980);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(7981);char c = r.consume();
            boolean __CLB4_2_1_bool20=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(7982);switch (c) {
                case '\t':if (!__CLB4_2_1_bool20) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7983);__CLB4_2_1_bool20=true;}
                case '\n':if (!__CLB4_2_1_bool20) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7984);__CLB4_2_1_bool20=true;}
                case '\r':if (!__CLB4_2_1_bool20) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7985);__CLB4_2_1_bool20=true;}
                case '\f':if (!__CLB4_2_1_bool20) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7986);__CLB4_2_1_bool20=true;}
                case ' ':if (!__CLB4_2_1_bool20) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7987);__CLB4_2_1_bool20=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7988);t.transition(BeforeAttributeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7989);break;
                case '/':if (!__CLB4_2_1_bool20) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7990);__CLB4_2_1_bool20=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7991);t.transition(SelfClosingStartTag);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7992);break;
                case '>':if (!__CLB4_2_1_bool20) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7993);__CLB4_2_1_bool20=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7994);t.emitTagPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7995);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7996);break;
                case eof:if (!__CLB4_2_1_bool20) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(7997);__CLB4_2_1_bool20=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7998);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(7999);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8000);break;
                default:if (!__CLB4_2_1_bool20) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8001);__CLB4_2_1_bool20=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8002);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8003);r.unconsume();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8004);t.transition(BeforeAttributeName);
            }

        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    SelfClosingStartTag {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8005);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8006);char c = r.consume();
            boolean __CLB4_2_1_bool21=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8007);switch (c) {
                case '>':if (!__CLB4_2_1_bool21) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8008);__CLB4_2_1_bool21=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8009);t.tagPending.selfClosing = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8010);t.emitTagPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8011);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8012);break;
                case eof:if (!__CLB4_2_1_bool21) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8013);__CLB4_2_1_bool21=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8014);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8015);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8016);break;
                default:if (!__CLB4_2_1_bool21) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8017);__CLB4_2_1_bool21=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8018);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8019);r.unconsume();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8020);t.transition(BeforeAttributeName);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    BogusComment {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8021);
            // todo: handle bogus comment starting from eof. when does that trigger?
            // rewind to capture character that lead us here
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8022);r.unconsume();
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8023);Token.Comment comment = new Token.Comment();
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8024);comment.bogus = true;
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8025);comment.data.append(r.consumeTo('>'));
            // todo: replace nullChar with replaceChar
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8026);t.emit(comment);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8027);t.advanceTransition(Data);
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    MarkupDeclarationOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8028);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8029);if ((((r.matchConsume("--"))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8030)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8031)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8032);t.createCommentPending();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8033);t.transition(CommentStart);
            } }else {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8034);if ((((r.matchConsumeIgnoreCase("DOCTYPE"))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8035)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8036)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8037);t.transition(Doctype);
            } }else {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8038);if ((((r.matchConsume("[CDATA["))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8039)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8040)==0&false))) {{
                // todo: should actually check current namepspace, and only non-html allows cdata. until namespace
                // is implemented properly, keep handling as cdata
                //} else if (!t.currentNodeInHtmlNS() && r.matchConsume("[CDATA[")) {
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8041);t.createTempBuffer();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8042);t.transition(CdataSection);
            } }else {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8043);t.error(this);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8044);t.advanceTransition(BogusComment); // advance so this character gets in bogus comment data's rewind
            }
        }}}}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    CommentStart {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8045);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8046);char c = r.consume();
            boolean __CLB4_2_1_bool22=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8047);switch (c) {
                case '-':if (!__CLB4_2_1_bool22) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8048);__CLB4_2_1_bool22=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8049);t.transition(CommentStartDash);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8050);break;
                case nullChar:if (!__CLB4_2_1_bool22) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8051);__CLB4_2_1_bool22=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8052);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8053);t.commentPending.data.append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8054);t.transition(Comment);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8055);break;
                case '>':if (!__CLB4_2_1_bool22) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8056);__CLB4_2_1_bool22=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8057);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8058);t.emitCommentPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8059);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8060);break;
                case eof:if (!__CLB4_2_1_bool22) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8061);__CLB4_2_1_bool22=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8062);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8063);t.emitCommentPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8064);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8065);break;
                default:if (!__CLB4_2_1_bool22) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8066);__CLB4_2_1_bool22=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8067);t.commentPending.data.append(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8068);t.transition(Comment);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    CommentStartDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8069);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8070);char c = r.consume();
            boolean __CLB4_2_1_bool23=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8071);switch (c) {
                case '-':if (!__CLB4_2_1_bool23) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8072);__CLB4_2_1_bool23=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8073);t.transition(CommentStartDash);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8074);break;
                case nullChar:if (!__CLB4_2_1_bool23) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8075);__CLB4_2_1_bool23=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8076);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8077);t.commentPending.data.append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8078);t.transition(Comment);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8079);break;
                case '>':if (!__CLB4_2_1_bool23) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8080);__CLB4_2_1_bool23=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8081);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8082);t.emitCommentPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8083);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8084);break;
                case eof:if (!__CLB4_2_1_bool23) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8085);__CLB4_2_1_bool23=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8086);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8087);t.emitCommentPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8088);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8089);break;
                default:if (!__CLB4_2_1_bool23) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8090);__CLB4_2_1_bool23=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8091);t.commentPending.data.append(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8092);t.transition(Comment);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    Comment {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8093);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8094);char c = r.current();
            boolean __CLB4_2_1_bool24=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8095);switch (c) {
                case '-':if (!__CLB4_2_1_bool24) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8096);__CLB4_2_1_bool24=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8097);t.advanceTransition(CommentEndDash);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8098);break;
                case nullChar:if (!__CLB4_2_1_bool24) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8099);__CLB4_2_1_bool24=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8100);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8101);r.advance();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8102);t.commentPending.data.append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8103);break;
                case eof:if (!__CLB4_2_1_bool24) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8104);__CLB4_2_1_bool24=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8105);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8106);t.emitCommentPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8107);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8108);break;
                default:if (!__CLB4_2_1_bool24) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8109);__CLB4_2_1_bool24=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8110);t.commentPending.data.append(r.consumeToAny('-', nullChar));
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    CommentEndDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8111);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8112);char c = r.consume();
            boolean __CLB4_2_1_bool25=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8113);switch (c) {
                case '-':if (!__CLB4_2_1_bool25) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8114);__CLB4_2_1_bool25=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8115);t.transition(CommentEnd);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8116);break;
                case nullChar:if (!__CLB4_2_1_bool25) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8117);__CLB4_2_1_bool25=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8118);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8119);t.commentPending.data.append('-').append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8120);t.transition(Comment);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8121);break;
                case eof:if (!__CLB4_2_1_bool25) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8122);__CLB4_2_1_bool25=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8123);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8124);t.emitCommentPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8125);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8126);break;
                default:if (!__CLB4_2_1_bool25) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8127);__CLB4_2_1_bool25=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8128);t.commentPending.data.append('-').append(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8129);t.transition(Comment);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    CommentEnd {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8130);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8131);char c = r.consume();
            boolean __CLB4_2_1_bool26=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8132);switch (c) {
                case '>':if (!__CLB4_2_1_bool26) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8133);__CLB4_2_1_bool26=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8134);t.emitCommentPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8135);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8136);break;
                case nullChar:if (!__CLB4_2_1_bool26) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8137);__CLB4_2_1_bool26=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8138);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8139);t.commentPending.data.append("--").append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8140);t.transition(Comment);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8141);break;
                case '!':if (!__CLB4_2_1_bool26) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8142);__CLB4_2_1_bool26=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8143);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8144);t.transition(CommentEndBang);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8145);break;
                case '-':if (!__CLB4_2_1_bool26) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8146);__CLB4_2_1_bool26=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8147);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8148);t.commentPending.data.append('-');
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8149);break;
                case eof:if (!__CLB4_2_1_bool26) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8150);__CLB4_2_1_bool26=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8151);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8152);t.emitCommentPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8153);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8154);break;
                default:if (!__CLB4_2_1_bool26) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8155);__CLB4_2_1_bool26=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8156);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8157);t.commentPending.data.append("--").append(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8158);t.transition(Comment);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    CommentEndBang {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8159);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8160);char c = r.consume();
            boolean __CLB4_2_1_bool27=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8161);switch (c) {
                case '-':if (!__CLB4_2_1_bool27) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8162);__CLB4_2_1_bool27=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8163);t.commentPending.data.append("--!");
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8164);t.transition(CommentEndDash);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8165);break;
                case '>':if (!__CLB4_2_1_bool27) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8166);__CLB4_2_1_bool27=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8167);t.emitCommentPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8168);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8169);break;
                case nullChar:if (!__CLB4_2_1_bool27) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8170);__CLB4_2_1_bool27=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8171);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8172);t.commentPending.data.append("--!").append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8173);t.transition(Comment);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8174);break;
                case eof:if (!__CLB4_2_1_bool27) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8175);__CLB4_2_1_bool27=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8176);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8177);t.emitCommentPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8178);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8179);break;
                default:if (!__CLB4_2_1_bool27) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8180);__CLB4_2_1_bool27=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8181);t.commentPending.data.append("--!").append(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8182);t.transition(Comment);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    Doctype {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8183);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8184);char c = r.consume();
            boolean __CLB4_2_1_bool28=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8185);switch (c) {
                case '\t':if (!__CLB4_2_1_bool28) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8186);__CLB4_2_1_bool28=true;}
                case '\n':if (!__CLB4_2_1_bool28) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8187);__CLB4_2_1_bool28=true;}
                case '\r':if (!__CLB4_2_1_bool28) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8188);__CLB4_2_1_bool28=true;}
                case '\f':if (!__CLB4_2_1_bool28) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8189);__CLB4_2_1_bool28=true;}
                case ' ':if (!__CLB4_2_1_bool28) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8190);__CLB4_2_1_bool28=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8191);t.transition(BeforeDoctypeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8192);break;
                case eof:if (!__CLB4_2_1_bool28) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8193);__CLB4_2_1_bool28=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8194);t.eofError(this);
                    // note: fall through to > case
                case '>':if (!__CLB4_2_1_bool28) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8195);__CLB4_2_1_bool28=true;} // catch invalid <!DOCTYPE>
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8196);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8197);t.createDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8198);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8199);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8200);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8201);break;
                default:if (!__CLB4_2_1_bool28) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8202);__CLB4_2_1_bool28=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8203);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8204);t.transition(BeforeDoctypeName);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    BeforeDoctypeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8205);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8206);if ((((r.matchesLetter())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8207)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8208)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8209);t.createDoctypePending();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8210);t.transition(DoctypeName);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8211);return;
            }
            }__CLR4_2_15mc5mcjp2rxa9c.R.inc(8212);char c = r.consume();
            boolean __CLB4_2_1_bool29=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8213);switch (c) {
                case '\t':if (!__CLB4_2_1_bool29) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8214);__CLB4_2_1_bool29=true;}
                case '\n':if (!__CLB4_2_1_bool29) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8215);__CLB4_2_1_bool29=true;}
                case '\r':if (!__CLB4_2_1_bool29) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8216);__CLB4_2_1_bool29=true;}
                case '\f':if (!__CLB4_2_1_bool29) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8217);__CLB4_2_1_bool29=true;}
                case ' ':if (!__CLB4_2_1_bool29) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8218);__CLB4_2_1_bool29=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8219);break; // ignore whitespace
                case nullChar:if (!__CLB4_2_1_bool29) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8220);__CLB4_2_1_bool29=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8221);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8222);t.createDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8223);t.doctypePending.name.append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8224);t.transition(DoctypeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8225);break;
                case eof:if (!__CLB4_2_1_bool29) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8226);__CLB4_2_1_bool29=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8227);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8228);t.createDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8229);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8230);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8231);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8232);break;
                default:if (!__CLB4_2_1_bool29) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8233);__CLB4_2_1_bool29=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8234);t.createDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8235);t.doctypePending.name.append(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8236);t.transition(DoctypeName);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    DoctypeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8237);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8238);if ((((r.matchesLetter())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8239)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8240)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8241);String name = r.consumeLetterSequence();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8242);t.doctypePending.name.append(name);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8243);return;
            }
            }__CLR4_2_15mc5mcjp2rxa9c.R.inc(8244);char c = r.consume();
            boolean __CLB4_2_1_bool30=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8245);switch (c) {
                case '>':if (!__CLB4_2_1_bool30) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8246);__CLB4_2_1_bool30=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8247);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8248);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8249);break;
                case '\t':if (!__CLB4_2_1_bool30) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8250);__CLB4_2_1_bool30=true;}
                case '\n':if (!__CLB4_2_1_bool30) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8251);__CLB4_2_1_bool30=true;}
                case '\r':if (!__CLB4_2_1_bool30) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8252);__CLB4_2_1_bool30=true;}
                case '\f':if (!__CLB4_2_1_bool30) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8253);__CLB4_2_1_bool30=true;}
                case ' ':if (!__CLB4_2_1_bool30) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8254);__CLB4_2_1_bool30=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8255);t.transition(AfterDoctypeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8256);break;
                case nullChar:if (!__CLB4_2_1_bool30) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8257);__CLB4_2_1_bool30=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8258);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8259);t.doctypePending.name.append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8260);break;
                case eof:if (!__CLB4_2_1_bool30) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8261);__CLB4_2_1_bool30=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8262);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8263);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8264);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8265);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8266);break;
                default:if (!__CLB4_2_1_bool30) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8267);__CLB4_2_1_bool30=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8268);t.doctypePending.name.append(c);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    AfterDoctypeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8269);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8270);if ((((r.isEmpty())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8271)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8272)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8273);t.eofError(this);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8274);t.doctypePending.forceQuirks = true;
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8275);t.emitDoctypePending();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8276);t.transition(Data);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8277);return;
            }
            }__CLR4_2_15mc5mcjp2rxa9c.R.inc(8278);if ((((r.matchesAny('\t', '\n', '\r', '\f', ' '))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8279)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8280)==0&false)))
                {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8281);r.advance(); // ignore whitespace
            }else {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8282);if ((((r.matches('>'))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8283)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8284)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8285);t.emitDoctypePending();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8286);t.advanceTransition(Data);
            } }else {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8287);if ((((r.matchConsumeIgnoreCase(DocumentType.PUBLIC_KEY))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8288)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8289)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8290);t.doctypePending.pubSysKey = DocumentType.PUBLIC_KEY;
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8291);t.transition(AfterDoctypePublicKeyword);
            } }else {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8292);if ((((r.matchConsumeIgnoreCase(DocumentType.SYSTEM_KEY))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8293)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8294)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8295);t.doctypePending.pubSysKey = DocumentType.SYSTEM_KEY;
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8296);t.transition(AfterDoctypeSystemKeyword);
            } }else {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8297);t.error(this);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8298);t.doctypePending.forceQuirks = true;
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8299);t.advanceTransition(BogusDoctype);
            }

        }}}}}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    AfterDoctypePublicKeyword {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8300);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8301);char c = r.consume();
            boolean __CLB4_2_1_bool31=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8302);switch (c) {
                case '\t':if (!__CLB4_2_1_bool31) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8303);__CLB4_2_1_bool31=true;}
                case '\n':if (!__CLB4_2_1_bool31) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8304);__CLB4_2_1_bool31=true;}
                case '\r':if (!__CLB4_2_1_bool31) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8305);__CLB4_2_1_bool31=true;}
                case '\f':if (!__CLB4_2_1_bool31) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8306);__CLB4_2_1_bool31=true;}
                case ' ':if (!__CLB4_2_1_bool31) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8307);__CLB4_2_1_bool31=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8308);t.transition(BeforeDoctypePublicIdentifier);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8309);break;
                case '"':if (!__CLB4_2_1_bool31) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8310);__CLB4_2_1_bool31=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8311);t.error(this);
                    // set public id to empty string
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8312);t.transition(DoctypePublicIdentifier_doubleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8313);break;
                case '\'':if (!__CLB4_2_1_bool31) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8314);__CLB4_2_1_bool31=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8315);t.error(this);
                    // set public id to empty string
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8316);t.transition(DoctypePublicIdentifier_singleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8317);break;
                case '>':if (!__CLB4_2_1_bool31) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8318);__CLB4_2_1_bool31=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8319);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8320);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8321);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8322);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8323);break;
                case eof:if (!__CLB4_2_1_bool31) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8324);__CLB4_2_1_bool31=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8325);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8326);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8327);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8328);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8329);break;
                default:if (!__CLB4_2_1_bool31) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8330);__CLB4_2_1_bool31=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8331);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8332);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8333);t.transition(BogusDoctype);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    BeforeDoctypePublicIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8334);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8335);char c = r.consume();
            boolean __CLB4_2_1_bool32=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8336);switch (c) {
                case '\t':if (!__CLB4_2_1_bool32) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8337);__CLB4_2_1_bool32=true;}
                case '\n':if (!__CLB4_2_1_bool32) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8338);__CLB4_2_1_bool32=true;}
                case '\r':if (!__CLB4_2_1_bool32) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8339);__CLB4_2_1_bool32=true;}
                case '\f':if (!__CLB4_2_1_bool32) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8340);__CLB4_2_1_bool32=true;}
                case ' ':if (!__CLB4_2_1_bool32) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8341);__CLB4_2_1_bool32=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8342);break;
                case '"':if (!__CLB4_2_1_bool32) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8343);__CLB4_2_1_bool32=true;}
                    // set public id to empty string
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8344);t.transition(DoctypePublicIdentifier_doubleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8345);break;
                case '\'':if (!__CLB4_2_1_bool32) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8346);__CLB4_2_1_bool32=true;}
                    // set public id to empty string
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8347);t.transition(DoctypePublicIdentifier_singleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8348);break;
                case '>':if (!__CLB4_2_1_bool32) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8349);__CLB4_2_1_bool32=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8350);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8351);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8352);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8353);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8354);break;
                case eof:if (!__CLB4_2_1_bool32) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8355);__CLB4_2_1_bool32=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8356);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8357);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8358);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8359);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8360);break;
                default:if (!__CLB4_2_1_bool32) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8361);__CLB4_2_1_bool32=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8362);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8363);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8364);t.transition(BogusDoctype);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    DoctypePublicIdentifier_doubleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8365);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8366);char c = r.consume();
            boolean __CLB4_2_1_bool33=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8367);switch (c) {
                case '"':if (!__CLB4_2_1_bool33) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8368);__CLB4_2_1_bool33=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8369);t.transition(AfterDoctypePublicIdentifier);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8370);break;
                case nullChar:if (!__CLB4_2_1_bool33) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8371);__CLB4_2_1_bool33=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8372);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8373);t.doctypePending.publicIdentifier.append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8374);break;
                case '>':if (!__CLB4_2_1_bool33) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8375);__CLB4_2_1_bool33=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8376);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8377);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8378);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8379);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8380);break;
                case eof:if (!__CLB4_2_1_bool33) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8381);__CLB4_2_1_bool33=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8382);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8383);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8384);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8385);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8386);break;
                default:if (!__CLB4_2_1_bool33) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8387);__CLB4_2_1_bool33=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8388);t.doctypePending.publicIdentifier.append(c);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    DoctypePublicIdentifier_singleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8389);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8390);char c = r.consume();
            boolean __CLB4_2_1_bool34=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8391);switch (c) {
                case '\'':if (!__CLB4_2_1_bool34) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8392);__CLB4_2_1_bool34=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8393);t.transition(AfterDoctypePublicIdentifier);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8394);break;
                case nullChar:if (!__CLB4_2_1_bool34) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8395);__CLB4_2_1_bool34=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8396);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8397);t.doctypePending.publicIdentifier.append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8398);break;
                case '>':if (!__CLB4_2_1_bool34) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8399);__CLB4_2_1_bool34=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8400);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8401);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8402);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8403);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8404);break;
                case eof:if (!__CLB4_2_1_bool34) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8405);__CLB4_2_1_bool34=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8406);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8407);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8408);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8409);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8410);break;
                default:if (!__CLB4_2_1_bool34) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8411);__CLB4_2_1_bool34=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8412);t.doctypePending.publicIdentifier.append(c);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    AfterDoctypePublicIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8413);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8414);char c = r.consume();
            boolean __CLB4_2_1_bool35=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8415);switch (c) {
                case '\t':if (!__CLB4_2_1_bool35) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8416);__CLB4_2_1_bool35=true;}
                case '\n':if (!__CLB4_2_1_bool35) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8417);__CLB4_2_1_bool35=true;}
                case '\r':if (!__CLB4_2_1_bool35) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8418);__CLB4_2_1_bool35=true;}
                case '\f':if (!__CLB4_2_1_bool35) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8419);__CLB4_2_1_bool35=true;}
                case ' ':if (!__CLB4_2_1_bool35) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8420);__CLB4_2_1_bool35=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8421);t.transition(BetweenDoctypePublicAndSystemIdentifiers);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8422);break;
                case '>':if (!__CLB4_2_1_bool35) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8423);__CLB4_2_1_bool35=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8424);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8425);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8426);break;
                case '"':if (!__CLB4_2_1_bool35) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8427);__CLB4_2_1_bool35=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8428);t.error(this);
                    // system id empty
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8429);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8430);break;
                case '\'':if (!__CLB4_2_1_bool35) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8431);__CLB4_2_1_bool35=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8432);t.error(this);
                    // system id empty
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8433);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8434);break;
                case eof:if (!__CLB4_2_1_bool35) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8435);__CLB4_2_1_bool35=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8436);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8437);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8438);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8439);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8440);break;
                default:if (!__CLB4_2_1_bool35) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8441);__CLB4_2_1_bool35=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8442);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8443);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8444);t.transition(BogusDoctype);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8445);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8446);char c = r.consume();
            boolean __CLB4_2_1_bool36=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8447);switch (c) {
                case '\t':if (!__CLB4_2_1_bool36) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8448);__CLB4_2_1_bool36=true;}
                case '\n':if (!__CLB4_2_1_bool36) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8449);__CLB4_2_1_bool36=true;}
                case '\r':if (!__CLB4_2_1_bool36) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8450);__CLB4_2_1_bool36=true;}
                case '\f':if (!__CLB4_2_1_bool36) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8451);__CLB4_2_1_bool36=true;}
                case ' ':if (!__CLB4_2_1_bool36) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8452);__CLB4_2_1_bool36=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8453);break;
                case '>':if (!__CLB4_2_1_bool36) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8454);__CLB4_2_1_bool36=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8455);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8456);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8457);break;
                case '"':if (!__CLB4_2_1_bool36) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8458);__CLB4_2_1_bool36=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8459);t.error(this);
                    // system id empty
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8460);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8461);break;
                case '\'':if (!__CLB4_2_1_bool36) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8462);__CLB4_2_1_bool36=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8463);t.error(this);
                    // system id empty
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8464);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8465);break;
                case eof:if (!__CLB4_2_1_bool36) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8466);__CLB4_2_1_bool36=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8467);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8468);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8469);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8470);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8471);break;
                default:if (!__CLB4_2_1_bool36) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8472);__CLB4_2_1_bool36=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8473);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8474);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8475);t.transition(BogusDoctype);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    AfterDoctypeSystemKeyword {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8476);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8477);char c = r.consume();
            boolean __CLB4_2_1_bool37=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8478);switch (c) {
                case '\t':if (!__CLB4_2_1_bool37) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8479);__CLB4_2_1_bool37=true;}
                case '\n':if (!__CLB4_2_1_bool37) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8480);__CLB4_2_1_bool37=true;}
                case '\r':if (!__CLB4_2_1_bool37) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8481);__CLB4_2_1_bool37=true;}
                case '\f':if (!__CLB4_2_1_bool37) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8482);__CLB4_2_1_bool37=true;}
                case ' ':if (!__CLB4_2_1_bool37) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8483);__CLB4_2_1_bool37=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8484);t.transition(BeforeDoctypeSystemIdentifier);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8485);break;
                case '>':if (!__CLB4_2_1_bool37) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8486);__CLB4_2_1_bool37=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8487);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8488);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8489);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8490);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8491);break;
                case '"':if (!__CLB4_2_1_bool37) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8492);__CLB4_2_1_bool37=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8493);t.error(this);
                    // system id empty
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8494);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8495);break;
                case '\'':if (!__CLB4_2_1_bool37) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8496);__CLB4_2_1_bool37=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8497);t.error(this);
                    // system id empty
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8498);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8499);break;
                case eof:if (!__CLB4_2_1_bool37) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8500);__CLB4_2_1_bool37=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8501);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8502);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8503);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8504);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8505);break;
                default:if (!__CLB4_2_1_bool37) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8506);__CLB4_2_1_bool37=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8507);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8508);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8509);t.emitDoctypePending();
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    BeforeDoctypeSystemIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8510);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8511);char c = r.consume();
            boolean __CLB4_2_1_bool38=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8512);switch (c) {
                case '\t':if (!__CLB4_2_1_bool38) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8513);__CLB4_2_1_bool38=true;}
                case '\n':if (!__CLB4_2_1_bool38) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8514);__CLB4_2_1_bool38=true;}
                case '\r':if (!__CLB4_2_1_bool38) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8515);__CLB4_2_1_bool38=true;}
                case '\f':if (!__CLB4_2_1_bool38) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8516);__CLB4_2_1_bool38=true;}
                case ' ':if (!__CLB4_2_1_bool38) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8517);__CLB4_2_1_bool38=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8518);break;
                case '"':if (!__CLB4_2_1_bool38) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8519);__CLB4_2_1_bool38=true;}
                    // set system id to empty string
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8520);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8521);break;
                case '\'':if (!__CLB4_2_1_bool38) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8522);__CLB4_2_1_bool38=true;}
                    // set public id to empty string
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8523);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8524);break;
                case '>':if (!__CLB4_2_1_bool38) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8525);__CLB4_2_1_bool38=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8526);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8527);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8528);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8529);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8530);break;
                case eof:if (!__CLB4_2_1_bool38) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8531);__CLB4_2_1_bool38=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8532);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8533);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8534);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8535);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8536);break;
                default:if (!__CLB4_2_1_bool38) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8537);__CLB4_2_1_bool38=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8538);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8539);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8540);t.transition(BogusDoctype);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    DoctypeSystemIdentifier_doubleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8541);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8542);char c = r.consume();
            boolean __CLB4_2_1_bool39=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8543);switch (c) {
                case '"':if (!__CLB4_2_1_bool39) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8544);__CLB4_2_1_bool39=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8545);t.transition(AfterDoctypeSystemIdentifier);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8546);break;
                case nullChar:if (!__CLB4_2_1_bool39) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8547);__CLB4_2_1_bool39=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8548);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8549);t.doctypePending.systemIdentifier.append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8550);break;
                case '>':if (!__CLB4_2_1_bool39) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8551);__CLB4_2_1_bool39=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8552);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8553);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8554);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8555);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8556);break;
                case eof:if (!__CLB4_2_1_bool39) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8557);__CLB4_2_1_bool39=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8558);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8559);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8560);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8561);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8562);break;
                default:if (!__CLB4_2_1_bool39) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8563);__CLB4_2_1_bool39=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8564);t.doctypePending.systemIdentifier.append(c);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    DoctypeSystemIdentifier_singleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8565);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8566);char c = r.consume();
            boolean __CLB4_2_1_bool40=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8567);switch (c) {
                case '\'':if (!__CLB4_2_1_bool40) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8568);__CLB4_2_1_bool40=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8569);t.transition(AfterDoctypeSystemIdentifier);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8570);break;
                case nullChar:if (!__CLB4_2_1_bool40) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8571);__CLB4_2_1_bool40=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8572);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8573);t.doctypePending.systemIdentifier.append(replacementChar);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8574);break;
                case '>':if (!__CLB4_2_1_bool40) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8575);__CLB4_2_1_bool40=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8576);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8577);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8578);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8579);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8580);break;
                case eof:if (!__CLB4_2_1_bool40) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8581);__CLB4_2_1_bool40=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8582);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8583);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8584);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8585);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8586);break;
                default:if (!__CLB4_2_1_bool40) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8587);__CLB4_2_1_bool40=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8588);t.doctypePending.systemIdentifier.append(c);
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    AfterDoctypeSystemIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8589);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8590);char c = r.consume();
            boolean __CLB4_2_1_bool41=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8591);switch (c) {
                case '\t':if (!__CLB4_2_1_bool41) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8592);__CLB4_2_1_bool41=true;}
                case '\n':if (!__CLB4_2_1_bool41) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8593);__CLB4_2_1_bool41=true;}
                case '\r':if (!__CLB4_2_1_bool41) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8594);__CLB4_2_1_bool41=true;}
                case '\f':if (!__CLB4_2_1_bool41) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8595);__CLB4_2_1_bool41=true;}
                case ' ':if (!__CLB4_2_1_bool41) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8596);__CLB4_2_1_bool41=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8597);break;
                case '>':if (!__CLB4_2_1_bool41) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8598);__CLB4_2_1_bool41=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8599);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8600);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8601);break;
                case eof:if (!__CLB4_2_1_bool41) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8602);__CLB4_2_1_bool41=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8603);t.eofError(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8604);t.doctypePending.forceQuirks = true;
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8605);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8606);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8607);break;
                default:if (!__CLB4_2_1_bool41) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8608);__CLB4_2_1_bool41=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8609);t.error(this);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8610);t.transition(BogusDoctype);
                    // NOT force quirks
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    BogusDoctype {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8611);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8612);char c = r.consume();
            boolean __CLB4_2_1_bool42=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8613);switch (c) {
                case '>':if (!__CLB4_2_1_bool42) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8614);__CLB4_2_1_bool42=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8615);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8616);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8617);break;
                case eof:if (!__CLB4_2_1_bool42) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8618);__CLB4_2_1_bool42=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8619);t.emitDoctypePending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8620);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8621);break;
                default:if (!__CLB4_2_1_bool42) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8622);__CLB4_2_1_bool42=true;}
                    // ignore char
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8623);break;
            }
        }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    },
    CdataSection {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8624);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8625);String data = r.consumeTo("]]>");
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8626);t.dataBuffer.append(data);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8627);if ((((r.matchConsume("]]>") || r.isEmpty())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8628)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8629)==0&false))) {{
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8630);t.emit(new Token.CData(t.dataBuffer.toString()));
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8631);t.transition(Data);
            }// otherwise, buffer underrun, stay in data section
        }}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
    };


    abstract void read(Tokeniser t, CharacterReader r);

    static final char nullChar = '\u0000';
    // char searches. must be sorted, used in inSorted. MUST update TokenisetStateTest if more arrays are added.
    static final char[] attributeSingleValueCharsSorted = new char[]{nullChar, '&', '\''};
    static final char[] attributeDoubleValueCharsSorted = new char[]{nullChar, '"', '&'};
    static final char[] attributeNameCharsSorted = new char[]{nullChar, '\t', '\n', '\f', '\r', ' ', '"', '\'', '/', '<', '=', '>'};
    static final char[] attributeValueUnquoted = new char[]{nullChar, '\t', '\n', '\f', '\r', ' ', '"', '&', '\'', '<', '=', '>', '`'};

    private static final char replacementChar = Tokeniser.replacementChar;
    private static final String replacementStr = String.valueOf(Tokeniser.replacementChar);
    private static final char eof = CharacterReader.EOF;

    /**
     * Handles RawtextEndTagName, ScriptDataEndTagName, and ScriptDataEscapedEndTagName. Same body impl, just
     * different else exit transitions.
     */
    private static void handleDataEndTag(Tokeniser t, CharacterReader r, TokeniserState elseTransition) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8632);
        __CLR4_2_15mc5mcjp2rxa9c.R.inc(8633);if ((((r.matchesLetter())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8634)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8635)==0&false))) {{
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8636);String name = r.consumeLetterSequence();
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8637);t.tagPending.appendTagName(name);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8638);t.dataBuffer.append(name);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8639);return;
        }

        }__CLR4_2_15mc5mcjp2rxa9c.R.inc(8640);boolean needsExitTransition = false;
        __CLR4_2_15mc5mcjp2rxa9c.R.inc(8641);if ((((t.isAppropriateEndTagToken() && !r.isEmpty())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8642)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8643)==0&false))) {{
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8644);char c = r.consume();
            boolean __CLB4_2_1_bool43=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8645);switch (c) {
                case '\t':if (!__CLB4_2_1_bool43) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8646);__CLB4_2_1_bool43=true;}
                case '\n':if (!__CLB4_2_1_bool43) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8647);__CLB4_2_1_bool43=true;}
                case '\r':if (!__CLB4_2_1_bool43) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8648);__CLB4_2_1_bool43=true;}
                case '\f':if (!__CLB4_2_1_bool43) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8649);__CLB4_2_1_bool43=true;}
                case ' ':if (!__CLB4_2_1_bool43) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8650);__CLB4_2_1_bool43=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8651);t.transition(BeforeAttributeName);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8652);break;
                case '/':if (!__CLB4_2_1_bool43) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8653);__CLB4_2_1_bool43=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8654);t.transition(SelfClosingStartTag);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8655);break;
                case '>':if (!__CLB4_2_1_bool43) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8656);__CLB4_2_1_bool43=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8657);t.emitTagPending();
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8658);t.transition(Data);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8659);break;
                default:if (!__CLB4_2_1_bool43) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8660);__CLB4_2_1_bool43=true;}
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8661);t.dataBuffer.append(c);
                    __CLR4_2_15mc5mcjp2rxa9c.R.inc(8662);needsExitTransition = true;
            }
        } }else {{
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8663);needsExitTransition = true;
        }

        }__CLR4_2_15mc5mcjp2rxa9c.R.inc(8664);if ((((needsExitTransition)&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8665)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8666)==0&false))) {{
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8667);t.emit("</" + t.dataBuffer.toString());
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8668);t.transition(elseTransition);
        }
    }}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}

    private static void readData(Tokeniser t, CharacterReader r, TokeniserState current, TokeniserState advance) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8669);
        boolean __CLB4_2_1_bool44=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8670);switch (r.current()) {
            case '<':if (!__CLB4_2_1_bool44) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8671);__CLB4_2_1_bool44=true;}
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8672);t.advanceTransition(advance);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8673);break;
            case nullChar:if (!__CLB4_2_1_bool44) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8674);__CLB4_2_1_bool44=true;}
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8675);t.error(current);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8676);r.advance();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8677);t.emit(replacementChar);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8678);break;
            case eof:if (!__CLB4_2_1_bool44) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8679);__CLB4_2_1_bool44=true;}
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8680);t.emit(new Token.EOF());
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8681);break;
            default:if (!__CLB4_2_1_bool44) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8682);__CLB4_2_1_bool44=true;}
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8683);String data = r.consumeToAny('<', nullChar); // todo - why hunt for null here? Just consumeTo'<'?
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8684);t.emit(data);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8685);break;
        }
    }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}

    private static void readCharRef(Tokeniser t, TokeniserState advance) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8686);
        __CLR4_2_15mc5mcjp2rxa9c.R.inc(8687);int[] c = t.consumeCharacterReference(null, false);
        __CLR4_2_15mc5mcjp2rxa9c.R.inc(8688);if ((((c == null)&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8689)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8690)==0&false)))
            {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8691);t.emit('&');
        }else
            {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8692);t.emit(c);
        }__CLR4_2_15mc5mcjp2rxa9c.R.inc(8693);t.transition(advance);
    }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}

    private static void readEndTag(Tokeniser t, CharacterReader r, TokeniserState a, TokeniserState b) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8694);
        __CLR4_2_15mc5mcjp2rxa9c.R.inc(8695);if ((((r.matchesLetter())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8696)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8697)==0&false))) {{
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8698);t.createTagPending(false);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8699);t.transition(a);
        } }else {{
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8700);t.emit("</");
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8701);t.transition(b);
        }
    }}finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}

    private static void handleDataDoubleEscapeTag(Tokeniser t, CharacterReader r, TokeniserState primary, TokeniserState fallback) {try{__CLR4_2_15mc5mcjp2rxa9c.R.inc(8702);
        __CLR4_2_15mc5mcjp2rxa9c.R.inc(8703);if ((((r.matchesLetter())&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8704)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8705)==0&false))) {{
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8706);String name = r.consumeLetterSequence();
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8707);t.dataBuffer.append(name);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8708);t.emit(name);
            __CLR4_2_15mc5mcjp2rxa9c.R.inc(8709);return;
        }

        }__CLR4_2_15mc5mcjp2rxa9c.R.inc(8710);char c = r.consume();
        boolean __CLB4_2_1_bool45=false;__CLR4_2_15mc5mcjp2rxa9c.R.inc(8711);switch (c) {
            case '\t':if (!__CLB4_2_1_bool45) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8712);__CLB4_2_1_bool45=true;}
            case '\n':if (!__CLB4_2_1_bool45) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8713);__CLB4_2_1_bool45=true;}
            case '\r':if (!__CLB4_2_1_bool45) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8714);__CLB4_2_1_bool45=true;}
            case '\f':if (!__CLB4_2_1_bool45) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8715);__CLB4_2_1_bool45=true;}
            case ' ':if (!__CLB4_2_1_bool45) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8716);__CLB4_2_1_bool45=true;}
            case '/':if (!__CLB4_2_1_bool45) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8717);__CLB4_2_1_bool45=true;}
            case '>':if (!__CLB4_2_1_bool45) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8718);__CLB4_2_1_bool45=true;}
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8719);if ((((t.dataBuffer.toString().equals("script"))&&(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8720)!=0|true))||(__CLR4_2_15mc5mcjp2rxa9c.R.iget(8721)==0&false)))
                    {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8722);t.transition(primary);
                }else
                    {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8723);t.transition(fallback);
                }__CLR4_2_15mc5mcjp2rxa9c.R.inc(8724);t.emit(c);
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8725);break;
            default:if (!__CLB4_2_1_bool45) {__CLR4_2_15mc5mcjp2rxa9c.R.inc(8726);__CLB4_2_1_bool45=true;}
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8727);r.unconsume();
                __CLR4_2_15mc5mcjp2rxa9c.R.inc(8728);t.transition(fallback);
        }
    }finally{__CLR4_2_15mc5mcjp2rxa9c.R.flushNeeded();}}
;public static class __CLR4_2_15mc5mcjp2rxa9c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543506510356L,8589935092L,8729,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
