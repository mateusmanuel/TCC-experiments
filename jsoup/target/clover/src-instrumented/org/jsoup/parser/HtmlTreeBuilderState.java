/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.util.ArrayList;

/**
 * The Tree Builder's current state. Each state embodies the processing for the state, and transitions to other states.
 */
@java.lang.SuppressWarnings({"fallthrough"}) enum HtmlTreeBuilderState {
    Initial {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(4660);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4661);if ((((isWhitespace(t))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4662)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4663)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4664);return true; // ignore whitespace
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4665);if ((((t.isComment())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4666)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4667)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4668);tb.insert(t.asComment());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4669);if ((((t.isDoctype())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4670)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4671)==0&false))) {{
                // todo: parse error check on expected doctypes
                // todo: quirk state check on doctype ids
                __CLR4_2_13lg3lgjpaexql1.R.inc(4672);Token.Doctype d = t.asDoctype();
                __CLR4_2_13lg3lgjpaexql1.R.inc(4673);DocumentType doctype = new DocumentType(
                    tb.settings.normalizeTag(d.getName()), d.getPublicIdentifier(), d.getSystemIdentifier());
                __CLR4_2_13lg3lgjpaexql1.R.inc(4674);doctype.setPubSysKey(d.getPubSysKey());
                __CLR4_2_13lg3lgjpaexql1.R.inc(4675);tb.getDocument().appendChild(doctype);
                __CLR4_2_13lg3lgjpaexql1.R.inc(4676);if ((((d.isForceQuirks())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4677)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4678)==0&false)))
                    {__CLR4_2_13lg3lgjpaexql1.R.inc(4679);tb.getDocument().quirksMode(Document.QuirksMode.quirks);
                }__CLR4_2_13lg3lgjpaexql1.R.inc(4680);tb.transition(BeforeHtml);
            } }else {{
                // todo: check not iframe srcdoc
                __CLR4_2_13lg3lgjpaexql1.R.inc(4681);tb.transition(BeforeHtml);
                __CLR4_2_13lg3lgjpaexql1.R.inc(4682);return tb.process(t); // re-process token
            }
            }}}__CLR4_2_13lg3lgjpaexql1.R.inc(4683);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    BeforeHtml {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(4684);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4685);if ((((t.isDoctype())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4686)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4687)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4688);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(4689);return false;
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4690);if ((((t.isComment())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4691)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4692)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4693);tb.insert(t.asComment());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4694);if ((((isWhitespace(t))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4695)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4696)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4697);return true; // ignore whitespace
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4698);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4699)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4700)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4701);tb.insert(t.asStartTag());
                __CLR4_2_13lg3lgjpaexql1.R.inc(4702);tb.transition(BeforeHead);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4703);if ((((t.isEndTag() && (StringUtil.in(t.asEndTag().normalName(), "head", "body", "html", "br")))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4704)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4705)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4706);return anythingElse(t, tb);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4707);if ((((t.isEndTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4708)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4709)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4710);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(4711);return false;
            } }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4712);return anythingElse(t, tb);
            }
            }}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(4713);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(4714);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4715);tb.insertStartTag("html");
            __CLR4_2_13lg3lgjpaexql1.R.inc(4716);tb.transition(BeforeHead);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4717);return tb.process(t);
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    BeforeHead {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(4718);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4719);if ((((isWhitespace(t))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4720)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4721)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4722);return true;
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4723);if ((((t.isComment())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4724)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4725)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4726);tb.insert(t.asComment());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4727);if ((((t.isDoctype())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4728)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4729)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4730);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(4731);return false;
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4732);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4733)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4734)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4735);return InBody.process(t, tb); // does not transition
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4736);if ((((t.isStartTag() && t.asStartTag().normalName().equals("head"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4737)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4738)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4739);Element head = tb.insert(t.asStartTag());
                __CLR4_2_13lg3lgjpaexql1.R.inc(4740);tb.setHeadElement(head);
                __CLR4_2_13lg3lgjpaexql1.R.inc(4741);tb.transition(InHead);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4742);if ((((t.isEndTag() && (StringUtil.in(t.asEndTag().normalName(), "head", "body", "html", "br")))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4743)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4744)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4745);tb.processStartTag("head");
                __CLR4_2_13lg3lgjpaexql1.R.inc(4746);return tb.process(t);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4747);if ((((t.isEndTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4748)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4749)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4750);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(4751);return false;
            } }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4752);tb.processStartTag("head");
                __CLR4_2_13lg3lgjpaexql1.R.inc(4753);return tb.process(t);
            }
            }}}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(4754);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InHead {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(4755);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4756);if ((((isWhitespace(t))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4757)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4758)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4759);tb.insert(t.asCharacter());
                __CLR4_2_13lg3lgjpaexql1.R.inc(4760);return true;
            }
            }boolean __CLB4_2_1_bool0=false;__CLR4_2_13lg3lgjpaexql1.R.inc(4761);switch (t.type) {
                case Comment:if (!__CLB4_2_1_bool0) {__CLR4_2_13lg3lgjpaexql1.R.inc(4762);__CLB4_2_1_bool0=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4763);tb.insert(t.asComment());
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4764);break;
                case Doctype:if (!__CLB4_2_1_bool0) {__CLR4_2_13lg3lgjpaexql1.R.inc(4765);__CLB4_2_1_bool0=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4766);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4767);return false;
                case StartTag:if (!__CLB4_2_1_bool0) {__CLR4_2_13lg3lgjpaexql1.R.inc(4768);__CLB4_2_1_bool0=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4769);Token.StartTag start = t.asStartTag();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4770);String name = start.normalName();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4771);if ((((name.equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4772)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4773)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4774);return InBody.process(t, tb);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4775);if ((((StringUtil.in(name, "base", "basefont", "bgsound", "command", "link"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4776)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4777)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4778);Element el = tb.insertEmpty(start);
                        // jsoup special: update base the frist time it is seen
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4779);if ((((name.equals("base") && el.hasAttr("href"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4780)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4781)==0&false)))
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(4782);tb.maybeSetBaseUri(el);
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4783);if ((((name.equals("meta"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4784)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4785)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4786);Element meta = tb.insertEmpty(start);
                        // todo: charset switches
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4787);if ((((name.equals("title"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4788)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4789)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4790);handleRcData(start, tb);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4791);if ((((StringUtil.in(name, "noframes", "style"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4792)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4793)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4794);handleRawtext(start, tb);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4795);if ((((name.equals("noscript"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4796)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4797)==0&false))) {{
                        // else if noscript && scripting flag = true: rawtext (jsoup doesn't run script, to handle as noscript)
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4798);tb.insert(start);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4799);tb.transition(InHeadNoscript);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4800);if ((((name.equals("script"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4801)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4802)==0&false))) {{
                        // skips some script rules as won't execute them

                        __CLR4_2_13lg3lgjpaexql1.R.inc(4803);tb.tokeniser.transition(TokeniserState.ScriptData);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4804);tb.markInsertionMode();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4805);tb.transition(Text);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4806);tb.insert(start);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4807);if ((((name.equals("head"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4808)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4809)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4810);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4811);return false;
                    } }else {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4812);return anythingElse(t, tb);
                    }
                    }}}}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(4813);break;
                case EndTag:if (!__CLB4_2_1_bool0) {__CLR4_2_13lg3lgjpaexql1.R.inc(4814);__CLB4_2_1_bool0=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4815);Token.EndTag end = t.asEndTag();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4816);name = end.normalName();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4817);if ((((name.equals("head"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4818)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4819)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4820);tb.pop();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4821);tb.transition(AfterHead);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4822);if ((((StringUtil.in(name, "body", "html", "br"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4823)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4824)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4825);return anythingElse(t, tb);
                    } }else {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4826);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4827);return false;
                    }
                    }}__CLR4_2_13lg3lgjpaexql1.R.inc(4828);break;
                default:if (!__CLB4_2_1_bool0) {__CLR4_2_13lg3lgjpaexql1.R.inc(4829);__CLB4_2_1_bool0=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4830);return anythingElse(t, tb);
            }
            __CLR4_2_13lg3lgjpaexql1.R.inc(4831);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private boolean anythingElse(Token t, TreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(4832);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4833);tb.processEndTag("head");
            __CLR4_2_13lg3lgjpaexql1.R.inc(4834);return tb.process(t);
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InHeadNoscript {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(4835);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4836);if ((((t.isDoctype())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4837)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4838)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4839);tb.error(this);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4840);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4841)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4842)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4843);return tb.process(t, InBody);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4844);if ((((t.isEndTag() && t.asEndTag().normalName().equals("noscript"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4845)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4846)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4847);tb.pop();
                __CLR4_2_13lg3lgjpaexql1.R.inc(4848);tb.transition(InHead);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4849);if ((((isWhitespace(t) || t.isComment() || (t.isStartTag() && StringUtil.in(t.asStartTag().normalName(),
                    "basefont", "bgsound", "link", "meta", "noframes", "style")))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4850)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4851)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4852);return tb.process(t, InHead);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4853);if ((((t.isEndTag() && t.asEndTag().normalName().equals("br"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4854)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4855)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4856);return anythingElse(t, tb);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4857);if (((((t.isStartTag() && StringUtil.in(t.asStartTag().normalName(), "head", "noscript")) || t.isEndTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4858)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4859)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4860);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(4861);return false;
            } }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4862);return anythingElse(t, tb);
            }
            }}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(4863);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(4864);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4865);tb.error(this);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4866);tb.insert(new Token.Character().data(t.toString()));
            __CLR4_2_13lg3lgjpaexql1.R.inc(4867);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    AfterHead {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(4868);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4869);if ((((isWhitespace(t))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4870)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4871)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4872);tb.insert(t.asCharacter());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4873);if ((((t.isComment())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4874)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4875)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4876);tb.insert(t.asComment());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4877);if ((((t.isDoctype())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4878)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4879)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4880);tb.error(this);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4881);if ((((t.isStartTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4882)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4883)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4884);Token.StartTag startTag = t.asStartTag();
                __CLR4_2_13lg3lgjpaexql1.R.inc(4885);String name = startTag.normalName();
                __CLR4_2_13lg3lgjpaexql1.R.inc(4886);if ((((name.equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4887)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4888)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4889);return tb.process(t, InBody);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4890);if ((((name.equals("body"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4891)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4892)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4893);tb.insert(startTag);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4894);tb.framesetOk(false);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4895);tb.transition(InBody);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4896);if ((((name.equals("frameset"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4897)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4898)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4899);tb.insert(startTag);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4900);tb.transition(InFrameset);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4901);if ((((StringUtil.in(name, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4902)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4903)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4904);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4905);Element head = tb.getHeadElement();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4906);tb.push(head);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4907);tb.process(t, InHead);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4908);tb.removeFromStack(head);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4909);if ((((name.equals("head"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4910)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4911)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4912);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4913);return false;
                } }else {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4914);anythingElse(t, tb);
                }
            }}}}}} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4915);if ((((t.isEndTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4916)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4917)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4918);if ((((StringUtil.in(t.asEndTag().normalName(), "body", "html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4919)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4920)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4921);anythingElse(t, tb);
                } }else {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4922);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4923);return false;
                }
            }} }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(4924);anythingElse(t, tb);
            }
            }}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(4925);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(4926);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4927);tb.processStartTag("body");
            __CLR4_2_13lg3lgjpaexql1.R.inc(4928);tb.framesetOk(true);
            __CLR4_2_13lg3lgjpaexql1.R.inc(4929);return tb.process(t);
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(4930);
            boolean __CLB4_2_1_bool1=false;__CLR4_2_13lg3lgjpaexql1.R.inc(4931);switch (t.type) {
                case Character:if (!__CLB4_2_1_bool1) {__CLR4_2_13lg3lgjpaexql1.R.inc(4932);__CLB4_2_1_bool1=true;} {
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4933);Token.Character c = t.asCharacter();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4934);if ((((c.getData().equals(nullString))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4935)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4936)==0&false))) {{
                        // todo confirm that check
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4937);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4938);return false;
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4939);if ((((tb.framesetOk() && isWhitespace(c))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4940)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4941)==0&false))) {{ // don't check if whitespace if frames already closed
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4942);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4943);tb.insert(c);
                    } }else {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4944);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4945);tb.insert(c);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4946);tb.framesetOk(false);
                    }
                    }}__CLR4_2_13lg3lgjpaexql1.R.inc(4947);break;
                }
                case Comment:if (!__CLB4_2_1_bool1) {__CLR4_2_13lg3lgjpaexql1.R.inc(4948);__CLB4_2_1_bool1=true;} {
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4949);tb.insert(t.asComment());
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4950);break;
                }
                case Doctype:if (!__CLB4_2_1_bool1) {__CLR4_2_13lg3lgjpaexql1.R.inc(4951);__CLB4_2_1_bool1=true;} {
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4952);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4953);return false;
                }
                case StartTag:if (!__CLB4_2_1_bool1) {__CLR4_2_13lg3lgjpaexql1.R.inc(4954);__CLB4_2_1_bool1=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4955);Token.StartTag startTag = t.asStartTag();
                    // todo - refactor to a switch statement
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4956);String name = startTag.normalName();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(4957);if ((((name.equals("a"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4958)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4959)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4960);if ((((tb.getActiveFormattingElement("a") != null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4961)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4962)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(4963);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(4964);tb.processEndTag("a");

                            // still on stack?
                            __CLR4_2_13lg3lgjpaexql1.R.inc(4965);Element remainingA = tb.getFromStack("a");
                            __CLR4_2_13lg3lgjpaexql1.R.inc(4966);if ((((remainingA != null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4967)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4968)==0&false))) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(4969);tb.removeFromActiveFormattingElements(remainingA);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(4970);tb.removeFromStack(remainingA);
                            }
                        }}
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(4971);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4972);Element a = tb.insert(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4973);tb.pushActiveFormattingElements(a);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4974);if ((((StringUtil.inSorted(name, Constants.InBodyStartEmptyFormatters))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4975)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4976)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4977);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4978);tb.insertEmpty(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4979);tb.framesetOk(false);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4980);if ((((StringUtil.inSorted(name, Constants.InBodyStartPClosers))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4981)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4982)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4983);if ((((tb.inButtonScope("p"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4984)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4985)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(4986);tb.processEndTag("p");
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(4987);tb.insert(startTag);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4988);if ((((name.equals("span"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4989)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4990)==0&false))) {{
                        // same as final else, but short circuits lots of checks
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4991);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4992);tb.insert(startTag);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(4993);if ((((name.equals("li"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4994)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(4995)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4996);tb.framesetOk(false);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4997);ArrayList<Element> stack = tb.getStack();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(4998);for (int i = stack.size() - 1; (((i > 0)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(4999)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5000)==0&false)); i--) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5001);Element el = stack.get(i);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5002);if ((((el.nodeName().equals("li"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5003)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5004)==0&false))) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5005);tb.processEndTag("li");
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5006);break;
                            }
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5007);if ((((tb.isSpecial(el) && !StringUtil.inSorted(el.nodeName(), Constants.InBodyStartLiBreakers))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5008)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5009)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5010);break;
                        }}
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5011);if ((((tb.inButtonScope("p"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5012)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5013)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5014);tb.processEndTag("p");
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5015);tb.insert(startTag);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5016);if ((((name.equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5017)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5018)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5019);tb.error(this);
                        // merge attributes onto real html
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5020);Element html = tb.getStack().get(0);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5021);for (Attribute attribute : startTag.getAttributes()) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5022);if ((((!html.hasAttr(attribute.getKey()))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5023)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5024)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5025);html.attributes().put(attribute);
                        }}
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5026);if ((((StringUtil.inSorted(name, Constants.InBodyStartToHead))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5027)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5028)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5029);return tb.process(t, InHead);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5030);if ((((name.equals("body"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5031)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5032)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5033);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5034);ArrayList<Element> stack = tb.getStack();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5035);if ((((stack.size() == 1 || (stack.size() > 2 && !stack.get(1).nodeName().equals("body")))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5036)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5037)==0&false))) {{
                            // only in fragment case
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5038);return false; // ignore
                        } }else {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5039);tb.framesetOk(false);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5040);Element body = stack.get(1);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5041);for (Attribute attribute : startTag.getAttributes()) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5042);if ((((!body.hasAttr(attribute.getKey()))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5043)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5044)==0&false)))
                                    {__CLR4_2_13lg3lgjpaexql1.R.inc(5045);body.attributes().put(attribute);
                            }}
                        }}
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5046);if ((((name.equals("frameset"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5047)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5048)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5049);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5050);ArrayList<Element> stack = tb.getStack();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5051);if ((((stack.size() == 1 || (stack.size() > 2 && !stack.get(1).nodeName().equals("body")))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5052)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5053)==0&false))) {{
                            // only in fragment case
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5054);return false; // ignore
                        } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5055);if ((((!tb.framesetOk())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5056)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5057)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5058);return false; // ignore frameset
                        } }else {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5059);Element second = stack.get(1);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5060);if ((((second.parent() != null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5061)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5062)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5063);second.remove();
                            // pop up to html element
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5064);while ((((stack.size() > 1)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5065)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5066)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5067);stack.remove(stack.size()-1);
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5068);tb.insert(startTag);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5069);tb.transition(InFrameset);
                        }
                    }}} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5070);if ((((StringUtil.inSorted(name, Constants.Headings))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5071)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5072)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5073);if ((((tb.inButtonScope("p"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5074)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5075)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5076);tb.processEndTag("p");
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5077);if ((((StringUtil.inSorted(tb.currentElement().nodeName(), Constants.Headings))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5078)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5079)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5080);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5081);tb.pop();
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5082);tb.insert(startTag);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5083);if ((((StringUtil.inSorted(name, Constants.InBodyStartPreListing))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5084)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5085)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5086);if ((((tb.inButtonScope("p"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5087)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5088)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5089);tb.processEndTag("p");
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5090);tb.insert(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5091);tb.reader.matchConsume("\n"); // ignore LF if next token
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5092);tb.framesetOk(false);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5093);if ((((name.equals("form"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5094)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5095)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5096);if ((((tb.getFormElement() != null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5097)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5098)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5099);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5100);return false;
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5101);if ((((tb.inButtonScope("p"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5102)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5103)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5104);tb.processEndTag("p");
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5105);tb.insertForm(startTag, true);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5106);if ((((StringUtil.inSorted(name, Constants.DdDt))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5107)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5108)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5109);tb.framesetOk(false);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5110);ArrayList<Element> stack = tb.getStack();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5111);for (int i = stack.size() - 1; (((i > 0)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5112)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5113)==0&false)); i--) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5114);Element el = stack.get(i);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5115);if ((((StringUtil.inSorted(el.nodeName(), Constants.DdDt))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5116)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5117)==0&false))) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5118);tb.processEndTag(el.nodeName());
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5119);break;
                            }
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5120);if ((((tb.isSpecial(el) && !StringUtil.inSorted(el.nodeName(), Constants.InBodyStartLiBreakers))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5121)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5122)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5123);break;
                        }}
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5124);if ((((tb.inButtonScope("p"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5125)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5126)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5127);tb.processEndTag("p");
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5128);tb.insert(startTag);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5129);if ((((name.equals("plaintext"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5130)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5131)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5132);if ((((tb.inButtonScope("p"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5133)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5134)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5135);tb.processEndTag("p");
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5136);tb.insert(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5137);tb.tokeniser.transition(TokeniserState.PLAINTEXT); // once in, never gets out
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5138);if ((((name.equals("button"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5139)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5140)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5141);if ((((tb.inButtonScope("button"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5142)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5143)==0&false))) {{
                            // close and reprocess
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5144);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5145);tb.processEndTag("button");
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5146);tb.process(startTag);
                        } }else {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5147);tb.reconstructFormattingElements();
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5148);tb.insert(startTag);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5149);tb.framesetOk(false);
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5150);if ((((StringUtil.inSorted(name, Constants.Formatters))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5151)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5152)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5153);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5154);Element el = tb.insert(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5155);tb.pushActiveFormattingElements(el);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5156);if ((((name.equals("nobr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5157)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5158)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5159);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5160);if ((((tb.inScope("nobr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5161)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5162)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5163);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5164);tb.processEndTag("nobr");
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5165);tb.reconstructFormattingElements();
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5166);Element el = tb.insert(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5167);tb.pushActiveFormattingElements(el);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5168);if ((((StringUtil.inSorted(name, Constants.InBodyStartApplets))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5169)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5170)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5171);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5172);tb.insert(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5173);tb.insertMarkerToFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5174);tb.framesetOk(false);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5175);if ((((name.equals("table"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5176)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5177)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5178);if ((((tb.getDocument().quirksMode() != Document.QuirksMode.quirks && tb.inButtonScope("p"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5179)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5180)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5181);tb.processEndTag("p");
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5182);tb.insert(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5183);tb.framesetOk(false);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5184);tb.transition(InTable);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5185);if ((((name.equals("input"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5186)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5187)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5188);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5189);Element el = tb.insertEmpty(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5190);if ((((!el.attr("type").equalsIgnoreCase("hidden"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5191)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5192)==0&false)))
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(5193);tb.framesetOk(false);
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5194);if ((((StringUtil.inSorted(name, Constants.InBodyStartMedia))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5195)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5196)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5197);tb.insertEmpty(startTag);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5198);if ((((name.equals("hr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5199)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5200)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5201);if ((((tb.inButtonScope("p"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5202)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5203)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5204);tb.processEndTag("p");
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5205);tb.insertEmpty(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5206);tb.framesetOk(false);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5207);if ((((name.equals("image"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5208)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5209)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5210);if ((((tb.getFromStack("svg") == null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5211)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5212)==0&false)))
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(5213);return tb.process(startTag.name("img")); // change <image> to <img>, unless in svg
                        }else
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(5214);tb.insert(startTag);
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5215);if ((((name.equals("isindex"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5216)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5217)==0&false))) {{
                        // how much do we care about the early 90s?
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5218);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5219);if ((((tb.getFormElement() != null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5220)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5221)==0&false)))
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(5222);return false;

                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5223);tb.processStartTag("form");
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5224);if ((((startTag.attributes.hasKey("action"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5225)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5226)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5227);Element form = tb.getFormElement();
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5228);form.attr("action", startTag.attributes.get("action"));
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5229);tb.processStartTag("hr");
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5230);tb.processStartTag("label");
                        // hope you like english.
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5231);String prompt = (((startTag.attributes.hasKey("prompt") )&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5232)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5233)==0&false))?
                                startTag.attributes.get("prompt") :
                                "This is a searchable index. Enter search keywords: ";

                        __CLR4_2_13lg3lgjpaexql1.R.inc(5234);tb.process(new Token.Character().data(prompt));

                        // input
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5235);Attributes inputAttribs = new Attributes();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5236);for (Attribute attr : startTag.attributes) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5237);if ((((!StringUtil.inSorted(attr.getKey(), Constants.InBodyStartInputAttribs))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5238)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5239)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5240);inputAttribs.put(attr);
                        }}
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5241);inputAttribs.put("name", "isindex");
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5242);tb.processStartTag("input", inputAttribs);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5243);tb.processEndTag("label");
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5244);tb.processStartTag("hr");
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5245);tb.processEndTag("form");
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5246);if ((((name.equals("textarea"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5247)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5248)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5249);tb.insert(startTag);
                        // todo: If the next token is a U+000A LINE FEED (LF) character token, then ignore that token and move on to the next one. (Newlines at the start of textarea elements are ignored as an authoring convenience.)
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5250);tb.tokeniser.transition(TokeniserState.Rcdata);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5251);tb.markInsertionMode();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5252);tb.framesetOk(false);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5253);tb.transition(Text);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5254);if ((((name.equals("xmp"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5255)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5256)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5257);if ((((tb.inButtonScope("p"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5258)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5259)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5260);tb.processEndTag("p");
                        }
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5261);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5262);tb.framesetOk(false);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5263);handleRawtext(startTag, tb);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5264);if ((((name.equals("iframe"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5265)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5266)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5267);tb.framesetOk(false);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5268);handleRawtext(startTag, tb);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5269);if ((((name.equals("noembed"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5270)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5271)==0&false))) {{
                        // also handle noscript if script enabled
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5272);handleRawtext(startTag, tb);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5273);if ((((name.equals("select"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5274)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5275)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5276);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5277);tb.insert(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5278);tb.framesetOk(false);

                        __CLR4_2_13lg3lgjpaexql1.R.inc(5279);HtmlTreeBuilderState state = tb.state();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5280);if ((((state.equals(InTable) || state.equals(InCaption) || state.equals(InTableBody) || state.equals(InRow) || state.equals(InCell))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5281)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5282)==0&false)))
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(5283);tb.transition(InSelectInTable);
                        }else
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(5284);tb.transition(InSelect);
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5285);if ((((StringUtil.inSorted(name, Constants.InBodyStartOptions))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5286)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5287)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5288);if ((((tb.currentElement().nodeName().equals("option"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5289)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5290)==0&false)))
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(5291);tb.processEndTag("option");
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5292);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5293);tb.insert(startTag);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5294);if ((((StringUtil.inSorted(name, Constants.InBodyStartRuby))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5295)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5296)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5297);if ((((tb.inScope("ruby"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5298)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5299)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5300);tb.generateImpliedEndTags();
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5301);if ((((!tb.currentElement().nodeName().equals("ruby"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5302)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5303)==0&false))) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5304);tb.error(this);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5305);tb.popStackToBefore("ruby"); // i.e. close up to but not include name
                            }
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5306);tb.insert(startTag);
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5307);if ((((name.equals("math"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5308)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5309)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5310);tb.reconstructFormattingElements();
                        // todo: handle A start tag whose tag name is "math" (i.e. foreign, mathml)
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5311);tb.insert(startTag);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5312);if ((((name.equals("svg"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5313)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5314)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5315);tb.reconstructFormattingElements();
                        // todo: handle A start tag whose tag name is "svg" (xlink, svg)
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5316);tb.insert(startTag);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5317);if ((((StringUtil.inSorted(name, Constants.InBodyStartDrop))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5318)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5319)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5320);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5321);return false;
                    } }else {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5322);tb.reconstructFormattingElements();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5323);tb.insert(startTag);
                    }
                    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(5324);break;

                case EndTag:if (!__CLB4_2_1_bool1) {__CLR4_2_13lg3lgjpaexql1.R.inc(5325);__CLB4_2_1_bool1=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5326);Token.EndTag endTag = t.asEndTag();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5327);name = endTag.normalName();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5328);if ((((StringUtil.inSorted(name, Constants.InBodyEndAdoptionFormatters))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5329)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5330)==0&false))) {{
                        // Adoption Agency Algorithm.
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5331);for (int i = 0; (((i < 8)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5332)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5333)==0&false)); i++) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5334);Element formatEl = tb.getActiveFormattingElement(name);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5335);if ((((formatEl == null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5336)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5337)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5338);return anyOtherEndTag(t, tb);
                            }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5339);if ((((!tb.onStack(formatEl))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5340)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5341)==0&false))) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5342);tb.error(this);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5343);tb.removeFromActiveFormattingElements(formatEl);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5344);return true;
                            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5345);if ((((!tb.inScope(formatEl.nodeName()))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5346)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5347)==0&false))) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5348);tb.error(this);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5349);return false;
                            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5350);if ((((tb.currentElement() != formatEl)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5351)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5352)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5353);tb.error(this);

                            }}}}__CLR4_2_13lg3lgjpaexql1.R.inc(5354);Element furthestBlock = null;
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5355);Element commonAncestor = null;
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5356);boolean seenFormattingElement = false;
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5357);ArrayList<Element> stack = tb.getStack();
                            // the spec doesn't limit to < 64, but in degenerate cases (9000+ stack depth) this prevents
                            // run-aways
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5358);final int stackSize = stack.size();
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5359);for (int si = 0; (((si < stackSize && si < 64)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5360)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5361)==0&false)); si++) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5362);Element el = stack.get(si);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5363);if ((((el == formatEl)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5364)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5365)==0&false))) {{
                                    __CLR4_2_13lg3lgjpaexql1.R.inc(5366);commonAncestor = stack.get(si - 1);
                                    __CLR4_2_13lg3lgjpaexql1.R.inc(5367);seenFormattingElement = true;
                                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5368);if ((((seenFormattingElement && tb.isSpecial(el))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5369)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5370)==0&false))) {{
                                    __CLR4_2_13lg3lgjpaexql1.R.inc(5371);furthestBlock = el;
                                    __CLR4_2_13lg3lgjpaexql1.R.inc(5372);break;
                                }
                            }}}
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5373);if ((((furthestBlock == null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5374)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5375)==0&false))) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5376);tb.popStackToClose(formatEl.nodeName());
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5377);tb.removeFromActiveFormattingElements(formatEl);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5378);return true;
                            }

                            // todo: Let a bookmark note the position of the formatting element in the list of active formatting elements relative to the elements on either side of it in the list.
                            // does that mean: int pos of format el in list?
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5379);Element node = furthestBlock;
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5380);Element lastNode = furthestBlock;
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5381);for (int j = 0; (((j < 3)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5382)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5383)==0&false)); j++) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5384);if ((((tb.onStack(node))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5385)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5386)==0&false)))
                                    {__CLR4_2_13lg3lgjpaexql1.R.inc(5387);node = tb.aboveOnStack(node);
                                }__CLR4_2_13lg3lgjpaexql1.R.inc(5388);if ((((!tb.isInActiveFormattingElements(node))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5389)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5390)==0&false))) {{ // note no bookmark check
                                    __CLR4_2_13lg3lgjpaexql1.R.inc(5391);tb.removeFromStack(node);
                                    __CLR4_2_13lg3lgjpaexql1.R.inc(5392);continue;
                                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5393);if ((((node == formatEl)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5394)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5395)==0&false)))
                                    {__CLR4_2_13lg3lgjpaexql1.R.inc(5396);break;

                                }}__CLR4_2_13lg3lgjpaexql1.R.inc(5397);Element replacement = new Element(Tag.valueOf(node.nodeName(), ParseSettings.preserveCase), tb.getBaseUri());
                                // case will follow the original node (so honours ParseSettings)
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5398);tb.replaceActiveFormattingElement(node, replacement);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5399);tb.replaceOnStack(node, replacement);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5400);node = replacement;

                                __CLR4_2_13lg3lgjpaexql1.R.inc(5401);if ((((lastNode == furthestBlock)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5402)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5403)==0&false))) {{
                                    // todo: move the aforementioned bookmark to be immediately after the new node in the list of active formatting elements.
                                    // not getting how this bookmark both straddles the element above, but is inbetween here...
                                }
                                }__CLR4_2_13lg3lgjpaexql1.R.inc(5404);if ((((lastNode.parent() != null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5405)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5406)==0&false)))
                                    {__CLR4_2_13lg3lgjpaexql1.R.inc(5407);lastNode.remove();
                                }__CLR4_2_13lg3lgjpaexql1.R.inc(5408);node.appendChild(lastNode);

                                __CLR4_2_13lg3lgjpaexql1.R.inc(5409);lastNode = node;
                            }

                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5410);if ((((StringUtil.inSorted(commonAncestor.nodeName(), Constants.InBodyEndTableFosters))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5411)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5412)==0&false))) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5413);if ((((lastNode.parent() != null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5414)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5415)==0&false)))
                                    {__CLR4_2_13lg3lgjpaexql1.R.inc(5416);lastNode.remove();
                                }__CLR4_2_13lg3lgjpaexql1.R.inc(5417);tb.insertInFosterParent(lastNode);
                            } }else {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5418);if ((((lastNode.parent() != null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5419)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5420)==0&false)))
                                    {__CLR4_2_13lg3lgjpaexql1.R.inc(5421);lastNode.remove();
                                }__CLR4_2_13lg3lgjpaexql1.R.inc(5422);commonAncestor.appendChild(lastNode);
                            }

                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5423);Element adopter = new Element(formatEl.tag(), tb.getBaseUri());
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5424);adopter.attributes().addAll(formatEl.attributes());
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5425);Node[] childNodes = furthestBlock.childNodes().toArray(new Node[furthestBlock.childNodeSize()]);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5426);for (Node childNode : childNodes) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5427);adopter.appendChild(childNode); // append will reparent. thus the clone to avoid concurrent mod.
                            }
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5428);furthestBlock.appendChild(adopter);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5429);tb.removeFromActiveFormattingElements(formatEl);
                            // todo: insert the new element into the list of active formatting elements at the position of the aforementioned bookmark.
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5430);tb.removeFromStack(formatEl);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5431);tb.insertOnStackAfter(furthestBlock, adopter);
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5432);if ((((StringUtil.inSorted(name, Constants.InBodyEndClosers))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5433)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5434)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5435);if ((((!tb.inScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5436)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5437)==0&false))) {{
                            // nothing to close
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5438);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5439);return false;
                        } }else {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5440);tb.generateImpliedEndTags();
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5441);if ((((!tb.currentElement().nodeName().equals(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5442)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5443)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5444);tb.error(this);
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5445);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5446);if ((((name.equals("span"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5447)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5448)==0&false))) {{
                        // same as final fall through, but saves short circuit
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5449);return anyOtherEndTag(t, tb);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5450);if ((((name.equals("li"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5451)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5452)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5453);if ((((!tb.inListItemScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5454)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5455)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5456);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5457);return false;
                        } }else {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5458);tb.generateImpliedEndTags(name);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5459);if ((((!tb.currentElement().nodeName().equals(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5460)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5461)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5462);tb.error(this);
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5463);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5464);if ((((name.equals("body"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5465)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5466)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5467);if ((((!tb.inScope("body"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5468)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5469)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5470);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5471);return false;
                        } }else {{
                            // todo: error if stack contains something not dd, dt, li, optgroup, option, p, rp, rt, tbody, td, tfoot, th, thead, tr, body, html
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5472);tb.transition(AfterBody);
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5473);if ((((name.equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5474)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5475)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5476);boolean notIgnored = tb.processEndTag("body");
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5477);if ((((notIgnored)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5478)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5479)==0&false)))
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(5480);return tb.process(endTag);
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5481);if ((((name.equals("form"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5482)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5483)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5484);Element currentForm = tb.getFormElement();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5485);tb.setFormElement(null);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5486);if ((((currentForm == null || !tb.inScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5487)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5488)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5489);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5490);return false;
                        } }else {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5491);tb.generateImpliedEndTags();
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5492);if ((((!tb.currentElement().nodeName().equals(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5493)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5494)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5495);tb.error(this);
                            // remove currentForm from stack. will shift anything under up.
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5496);tb.removeFromStack(currentForm);
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5497);if ((((name.equals("p"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5498)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5499)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5500);if ((((!tb.inButtonScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5501)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5502)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5503);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5504);tb.processStartTag(name); // if no p to close, creates an empty <p></p>
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5505);return tb.process(endTag);
                        } }else {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5506);tb.generateImpliedEndTags(name);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5507);if ((((!tb.currentElement().nodeName().equals(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5508)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5509)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5510);tb.error(this);
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5511);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5512);if ((((StringUtil.inSorted(name, Constants.DdDt))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5513)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5514)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5515);if ((((!tb.inScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5516)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5517)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5518);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5519);return false;
                        } }else {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5520);tb.generateImpliedEndTags(name);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5521);if ((((!tb.currentElement().nodeName().equals(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5522)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5523)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5524);tb.error(this);
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5525);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5526);if ((((StringUtil.inSorted(name, Constants.Headings))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5527)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5528)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5529);if ((((!tb.inScope(Constants.Headings))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5530)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5531)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5532);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5533);return false;
                        } }else {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5534);tb.generateImpliedEndTags(name);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5535);if ((((!tb.currentElement().nodeName().equals(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5536)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5537)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5538);tb.error(this);
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5539);tb.popStackToClose(Constants.Headings);
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5540);if ((((name.equals("sarcasm"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5541)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5542)==0&false))) {{
                        // *sigh*
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5543);return anyOtherEndTag(t, tb);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5544);if ((((StringUtil.inSorted(name, Constants.InBodyStartApplets))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5545)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5546)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5547);if ((((!tb.inScope("name"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5548)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5549)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5550);if ((((!tb.inScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5551)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5552)==0&false))) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5553);tb.error(this);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5554);return false;
                            }
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5555);tb.generateImpliedEndTags();
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5556);if ((((!tb.currentElement().nodeName().equals(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5557)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5558)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5559);tb.error(this);
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(5560);tb.popStackToClose(name);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5561);tb.clearFormattingElementsToLastMarker();
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5562);if ((((name.equals("br"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5563)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5564)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5565);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5566);tb.processStartTag("br");
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5567);return false;
                    } }else {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5568);return anyOtherEndTag(t, tb);
                    }

                    }}}}}}}}}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(5569);break;
                case EOF:if (!__CLB4_2_1_bool1) {__CLR4_2_13lg3lgjpaexql1.R.inc(5570);__CLB4_2_1_bool1=true;}
                    // todo: error if stack contains something not dd, dt, li, p, tbody, td, tfoot, th, thead, tr, body, html
                    // stop parsing
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5571);break;
            }
            __CLR4_2_13lg3lgjpaexql1.R.inc(5572);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        boolean anyOtherEndTag(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5573);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5574);String name = tb.settings.normalizeTag(t.asEndTag().name()); // matches with case sensitivity if enabled
            __CLR4_2_13lg3lgjpaexql1.R.inc(5575);ArrayList<Element> stack = tb.getStack();
            __CLR4_2_13lg3lgjpaexql1.R.inc(5576);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5577)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5578)==0&false)); pos--) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5579);Element node = stack.get(pos);
                __CLR4_2_13lg3lgjpaexql1.R.inc(5580);if ((((node.nodeName().equals(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5581)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5582)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5583);tb.generateImpliedEndTags(name);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5584);if ((((!name.equals(tb.currentElement().nodeName()))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5585)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5586)==0&false)))
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(5587);tb.error(this);
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(5588);tb.popStackToClose(name);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5589);break;
                } }else {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5590);if ((((tb.isSpecial(node))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5591)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5592)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5593);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5594);return false;
                    }
                }}
            }}
            }__CLR4_2_13lg3lgjpaexql1.R.inc(5595);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    Text {
        // in script, style etc. normally treated as data tags
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5596);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5597);if ((((t.isCharacter())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5598)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5599)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5600);tb.insert(t.asCharacter());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5601);if ((((t.isEOF())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5602)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5603)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5604);tb.error(this);
                // if current node is script: already started
                __CLR4_2_13lg3lgjpaexql1.R.inc(5605);tb.pop();
                __CLR4_2_13lg3lgjpaexql1.R.inc(5606);tb.transition(tb.originalState());
                __CLR4_2_13lg3lgjpaexql1.R.inc(5607);return tb.process(t);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5608);if ((((t.isEndTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5609)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5610)==0&false))) {{
                // if: An end tag whose tag name is "script" -- scripting nesting level, if evaluating scripts
                __CLR4_2_13lg3lgjpaexql1.R.inc(5611);tb.pop();
                __CLR4_2_13lg3lgjpaexql1.R.inc(5612);tb.transition(tb.originalState());
            }
            }}}__CLR4_2_13lg3lgjpaexql1.R.inc(5613);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InTable {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5614);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5615);if ((((t.isCharacter())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5616)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5617)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5618);tb.newPendingTableCharacters();
                __CLR4_2_13lg3lgjpaexql1.R.inc(5619);tb.markInsertionMode();
                __CLR4_2_13lg3lgjpaexql1.R.inc(5620);tb.transition(InTableText);
                __CLR4_2_13lg3lgjpaexql1.R.inc(5621);return tb.process(t);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5622);if ((((t.isComment())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5623)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5624)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5625);tb.insert(t.asComment());
                __CLR4_2_13lg3lgjpaexql1.R.inc(5626);return true;
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5627);if ((((t.isDoctype())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5628)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5629)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5630);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(5631);return false;
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5632);if ((((t.isStartTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5633)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5634)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5635);Token.StartTag startTag = t.asStartTag();
                __CLR4_2_13lg3lgjpaexql1.R.inc(5636);String name = startTag.normalName();
                __CLR4_2_13lg3lgjpaexql1.R.inc(5637);if ((((name.equals("caption"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5638)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5639)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5640);tb.clearStackToTableContext();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5641);tb.insertMarkerToFormattingElements();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5642);tb.insert(startTag);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5643);tb.transition(InCaption);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5644);if ((((name.equals("colgroup"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5645)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5646)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5647);tb.clearStackToTableContext();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5648);tb.insert(startTag);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5649);tb.transition(InColumnGroup);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5650);if ((((name.equals("col"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5651)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5652)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5653);tb.processStartTag("colgroup");
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5654);return tb.process(t);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5655);if ((((StringUtil.in(name, "tbody", "tfoot", "thead"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5656)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5657)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5658);tb.clearStackToTableContext();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5659);tb.insert(startTag);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5660);tb.transition(InTableBody);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5661);if ((((StringUtil.in(name, "td", "th", "tr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5662)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5663)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5664);tb.processStartTag("tbody");
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5665);return tb.process(t);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5666);if ((((name.equals("table"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5667)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5668)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5669);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5670);boolean processed = tb.processEndTag("table");
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5671);if ((((processed)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5672)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5673)==0&false))) // only ignored if in fragment
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(5674);return tb.process(t);
                }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5675);if ((((StringUtil.in(name, "style", "script"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5676)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5677)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5678);return tb.process(t, InHead);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5679);if ((((name.equals("input"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5680)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5681)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5682);if ((((!startTag.attributes.get("type").equalsIgnoreCase("hidden"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5683)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5684)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5685);return anythingElse(t, tb);
                    } }else {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5686);tb.insertEmpty(startTag);
                    }
                }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5687);if ((((name.equals("form"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5688)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5689)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5690);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5691);if ((((tb.getFormElement() != null)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5692)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5693)==0&false)))
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(5694);return false;
                    }else {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5695);tb.insertForm(startTag, false);
                    }
                }} }else {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5696);return anythingElse(t, tb);
                }
                }}}}}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(5697);return true; // todo: check if should return processed http://www.whatwg.org/specs/web-apps/current-work/multipage/tree-construction.html#parsing-main-intable
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5698);if ((((t.isEndTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5699)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5700)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5701);Token.EndTag endTag = t.asEndTag();
                __CLR4_2_13lg3lgjpaexql1.R.inc(5702);String name = endTag.normalName();

                __CLR4_2_13lg3lgjpaexql1.R.inc(5703);if ((((name.equals("table"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5704)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5705)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5706);if ((((!tb.inTableScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5707)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5708)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5709);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5710);return false;
                    } }else {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5711);tb.popStackToClose("table");
                    }
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(5712);tb.resetInsertionMode();
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5713);if ((((StringUtil.in(name,
                        "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5714)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5715)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5716);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5717);return false;
                } }else {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5718);return anythingElse(t, tb);
                }
                }}__CLR4_2_13lg3lgjpaexql1.R.inc(5719);return true; // todo: as above todo
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5720);if ((((t.isEOF())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5721)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5722)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5723);if ((((tb.currentElement().nodeName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5724)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5725)==0&false)))
                    {__CLR4_2_13lg3lgjpaexql1.R.inc(5726);tb.error(this);
                }__CLR4_2_13lg3lgjpaexql1.R.inc(5727);return true; // stops parsing
            }
            }}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(5728);return anythingElse(t, tb);
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5729);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5730);tb.error(this);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5731);boolean processed;
            __CLR4_2_13lg3lgjpaexql1.R.inc(5732);if ((((StringUtil.in(tb.currentElement().nodeName(), "table", "tbody", "tfoot", "thead", "tr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5733)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5734)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5735);tb.setFosterInserts(true);
                __CLR4_2_13lg3lgjpaexql1.R.inc(5736);processed = tb.process(t, InBody);
                __CLR4_2_13lg3lgjpaexql1.R.inc(5737);tb.setFosterInserts(false);
            } }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5738);processed = tb.process(t, InBody);
            }
            }__CLR4_2_13lg3lgjpaexql1.R.inc(5739);return processed;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InTableText {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5740);
            boolean __CLB4_2_1_bool2=false;__CLR4_2_13lg3lgjpaexql1.R.inc(5741);switch (t.type) {
                case Character:if (!__CLB4_2_1_bool2) {__CLR4_2_13lg3lgjpaexql1.R.inc(5742);__CLB4_2_1_bool2=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5743);Token.Character c = t.asCharacter();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5744);if ((((c.getData().equals(nullString))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5745)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5746)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5747);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5748);return false;
                    } }else {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5749);tb.getPendingTableCharacters().add(c.getData());
                    }
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(5750);break;
                default:if (!__CLB4_2_1_bool2) {__CLR4_2_13lg3lgjpaexql1.R.inc(5751);__CLB4_2_1_bool2=true;}
                    // todo - don't really like the way these table character data lists are built
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5752);if ((((tb.getPendingTableCharacters().size() > 0)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5753)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5754)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5755);for (String character : tb.getPendingTableCharacters()) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5756);if ((((!isWhitespace(character))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5757)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5758)==0&false))) {{
                                // InTable anything else section:
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5759);tb.error(this);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(5760);if ((((StringUtil.in(tb.currentElement().nodeName(), "table", "tbody", "tfoot", "thead", "tr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5761)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5762)==0&false))) {{
                                    __CLR4_2_13lg3lgjpaexql1.R.inc(5763);tb.setFosterInserts(true);
                                    __CLR4_2_13lg3lgjpaexql1.R.inc(5764);tb.process(new Token.Character().data(character), InBody);
                                    __CLR4_2_13lg3lgjpaexql1.R.inc(5765);tb.setFosterInserts(false);
                                } }else {{
                                    __CLR4_2_13lg3lgjpaexql1.R.inc(5766);tb.process(new Token.Character().data(character), InBody);
                                }
                            }} }else
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(5767);tb.insert(new Token.Character().data(character));
                        }}
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(5768);tb.newPendingTableCharacters();
                    }
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(5769);tb.transition(tb.originalState());
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5770);return tb.process(t);
            }
            __CLR4_2_13lg3lgjpaexql1.R.inc(5771);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InCaption {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5772);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5773);if ((((t.isEndTag() && t.asEndTag().normalName().equals("caption"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5774)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5775)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5776);Token.EndTag endTag = t.asEndTag();
                __CLR4_2_13lg3lgjpaexql1.R.inc(5777);String name = endTag.normalName();
                __CLR4_2_13lg3lgjpaexql1.R.inc(5778);if ((((!tb.inTableScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5779)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5780)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5781);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5782);return false;
                } }else {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5783);tb.generateImpliedEndTags();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5784);if ((((!tb.currentElement().nodeName().equals("caption"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5785)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5786)==0&false)))
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(5787);tb.error(this);
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(5788);tb.popStackToClose("caption");
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5789);tb.clearFormattingElementsToLastMarker();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5790);tb.transition(InTable);
                }
            }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5791);if (((((
                    t.isStartTag() && StringUtil.in(t.asStartTag().normalName(),
                            "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr") ||
                            t.isEndTag() && t.asEndTag().normalName().equals("table"))
                    )&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5792)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5793)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5794);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(5795);boolean processed = tb.processEndTag("caption");
                __CLR4_2_13lg3lgjpaexql1.R.inc(5796);if ((((processed)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5797)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5798)==0&false)))
                    {__CLR4_2_13lg3lgjpaexql1.R.inc(5799);return tb.process(t);
            }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5800);if ((((t.isEndTag() && StringUtil.in(t.asEndTag().normalName(),
                    "body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5801)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5802)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5803);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(5804);return false;
            } }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5805);return tb.process(t, InBody);
            }
            }}}__CLR4_2_13lg3lgjpaexql1.R.inc(5806);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InColumnGroup {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5807);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5808);if ((((isWhitespace(t))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5809)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5810)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5811);tb.insert(t.asCharacter());
                __CLR4_2_13lg3lgjpaexql1.R.inc(5812);return true;
            }
            }boolean __CLB4_2_1_bool3=false;__CLR4_2_13lg3lgjpaexql1.R.inc(5813);switch (t.type) {
                case Comment:if (!__CLB4_2_1_bool3) {__CLR4_2_13lg3lgjpaexql1.R.inc(5814);__CLB4_2_1_bool3=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5815);tb.insert(t.asComment());
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5816);break;
                case Doctype:if (!__CLB4_2_1_bool3) {__CLR4_2_13lg3lgjpaexql1.R.inc(5817);__CLB4_2_1_bool3=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5818);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5819);break;
                case StartTag:if (!__CLB4_2_1_bool3) {__CLR4_2_13lg3lgjpaexql1.R.inc(5820);__CLB4_2_1_bool3=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5821);Token.StartTag startTag = t.asStartTag();
                    boolean __CLB4_2_1_bool4=false;__CLR4_2_13lg3lgjpaexql1.R.inc(5822);switch (startTag.normalName()) {
                        case "html":if (!__CLB4_2_1_bool4) {__CLR4_2_13lg3lgjpaexql1.R.inc(5823);__CLB4_2_1_bool4=true;}
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5824);return tb.process(t, InBody);
                        case "col":if (!__CLB4_2_1_bool4) {__CLR4_2_13lg3lgjpaexql1.R.inc(5825);__CLB4_2_1_bool4=true;}
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5826);tb.insertEmpty(startTag);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5827);break;
                        default:if (!__CLB4_2_1_bool4) {__CLR4_2_13lg3lgjpaexql1.R.inc(5828);__CLB4_2_1_bool4=true;}
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5829);return anythingElse(t, tb);
                    }
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5830);break;
                case EndTag:if (!__CLB4_2_1_bool3) {__CLR4_2_13lg3lgjpaexql1.R.inc(5831);__CLB4_2_1_bool3=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5832);Token.EndTag endTag = t.asEndTag();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5833);if ((((endTag.normalName.equals("colgroup"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5834)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5835)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5836);if ((((tb.currentElement().nodeName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5837)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5838)==0&false))) {{ // frag case
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5839);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5840);return false;
                        } }else {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5841);tb.pop();
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5842);tb.transition(InTable);
                        }
                    }} }else
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(5843);return anythingElse(t, tb);
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(5844);break;
                case EOF:if (!__CLB4_2_1_bool3) {__CLR4_2_13lg3lgjpaexql1.R.inc(5845);__CLB4_2_1_bool3=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5846);if ((((tb.currentElement().nodeName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5847)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5848)==0&false)))
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(5849);return true; // stop parsing; frag case
                    }else
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(5850);return anythingElse(t, tb);
                }default:if (!__CLB4_2_1_bool3) {__CLR4_2_13lg3lgjpaexql1.R.inc(5851);__CLB4_2_1_bool3=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5852);return anythingElse(t, tb);
            }
            __CLR4_2_13lg3lgjpaexql1.R.inc(5853);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private boolean anythingElse(Token t, TreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5854);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5855);boolean processed = tb.processEndTag("colgroup");
            __CLR4_2_13lg3lgjpaexql1.R.inc(5856);if ((((processed)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5857)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5858)==0&false))) // only ignored in frag case
                {__CLR4_2_13lg3lgjpaexql1.R.inc(5859);return tb.process(t);
            }__CLR4_2_13lg3lgjpaexql1.R.inc(5860);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InTableBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5861);
            boolean __CLB4_2_1_bool5=false;__CLR4_2_13lg3lgjpaexql1.R.inc(5862);switch (t.type) {
                case StartTag:if (!__CLB4_2_1_bool5) {__CLR4_2_13lg3lgjpaexql1.R.inc(5863);__CLB4_2_1_bool5=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5864);Token.StartTag startTag = t.asStartTag();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5865);String name = startTag.normalName();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5866);if ((((name.equals("template"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5867)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5868)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5869);tb.insert(startTag);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5870);if ((((name.equals("tr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5871)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5872)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5873);tb.clearStackToTableBodyContext();
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5874);tb.insert(startTag);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5875);tb.transition(InRow);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5876);if ((((StringUtil.in(name, "th", "td"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5877)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5878)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5879);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5880);tb.processStartTag("tr");
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5881);return tb.process(startTag);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5882);if ((((StringUtil.in(name, "caption", "col", "colgroup", "tbody", "tfoot", "thead"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5883)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5884)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5885);return exitTableBody(t, tb);
                    } }else
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(5886);return anythingElse(t, tb);
                    }}}}__CLR4_2_13lg3lgjpaexql1.R.inc(5887);break;
                case EndTag:if (!__CLB4_2_1_bool5) {__CLR4_2_13lg3lgjpaexql1.R.inc(5888);__CLB4_2_1_bool5=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5889);Token.EndTag endTag = t.asEndTag();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5890);name = endTag.normalName();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5891);if ((((StringUtil.in(name, "tbody", "tfoot", "thead"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5892)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5893)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5894);if ((((!tb.inTableScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5895)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5896)==0&false))) {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5897);tb.error(this);
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5898);return false;
                        } }else {{
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5899);tb.clearStackToTableBodyContext();
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5900);tb.pop();
                            __CLR4_2_13lg3lgjpaexql1.R.inc(5901);tb.transition(InTable);
                        }
                    }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5902);if ((((name.equals("table"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5903)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5904)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5905);return exitTableBody(t, tb);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5906);if ((((StringUtil.in(name, "body", "caption", "col", "colgroup", "html", "td", "th", "tr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5907)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5908)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5909);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5910);return false;
                    } }else
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(5911);return anythingElse(t, tb);
                    }}}__CLR4_2_13lg3lgjpaexql1.R.inc(5912);break;
                default:if (!__CLB4_2_1_bool5) {__CLR4_2_13lg3lgjpaexql1.R.inc(5913);__CLB4_2_1_bool5=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5914);return anythingElse(t, tb);
            }
            __CLR4_2_13lg3lgjpaexql1.R.inc(5915);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private boolean exitTableBody(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5916);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5917);if ((((!(tb.inTableScope("tbody") || tb.inTableScope("thead") || tb.inScope("tfoot")))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5918)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5919)==0&false))) {{
                // frag case
                __CLR4_2_13lg3lgjpaexql1.R.inc(5920);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(5921);return false;
            }
            }__CLR4_2_13lg3lgjpaexql1.R.inc(5922);tb.clearStackToTableBodyContext();
            __CLR4_2_13lg3lgjpaexql1.R.inc(5923);tb.processEndTag(tb.currentElement().nodeName()); // tbody, tfoot, thead
            __CLR4_2_13lg3lgjpaexql1.R.inc(5924);return tb.process(t);
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5925);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5926);return tb.process(t, InTable);
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InRow {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5927);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5928);if ((((t.isStartTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5929)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5930)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5931);Token.StartTag startTag = t.asStartTag();
                __CLR4_2_13lg3lgjpaexql1.R.inc(5932);String name = startTag.normalName();

                __CLR4_2_13lg3lgjpaexql1.R.inc(5933);if ((((name.equals("template"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5934)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5935)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5936);tb.insert(startTag);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5937);if ((((StringUtil.in(name, "th", "td"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5938)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5939)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5940);tb.clearStackToTableRowContext();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5941);tb.insert(startTag);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5942);tb.transition(InCell);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5943);tb.insertMarkerToFormattingElements();
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5944);if ((((StringUtil.in(name, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5945)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5946)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5947);return handleMissingTr(t, tb);
                } }else {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5948);return anythingElse(t, tb);
                }
            }}}} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5949);if ((((t.isEndTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5950)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5951)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5952);Token.EndTag endTag = t.asEndTag();
                __CLR4_2_13lg3lgjpaexql1.R.inc(5953);String name = endTag.normalName();

                __CLR4_2_13lg3lgjpaexql1.R.inc(5954);if ((((name.equals("tr"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5955)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5956)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5957);if ((((!tb.inTableScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5958)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5959)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5960);tb.error(this); // frag
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5961);return false;
                    }
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(5962);tb.clearStackToTableRowContext();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5963);tb.pop(); // tr
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5964);tb.transition(InTableBody);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5965);if ((((name.equals("table"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5966)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5967)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5968);return handleMissingTr(t, tb);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5969);if ((((StringUtil.in(name, "tbody", "tfoot", "thead"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5970)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5971)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5972);if ((((!tb.inTableScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5973)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5974)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5975);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(5976);return false;
                    }
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(5977);tb.processEndTag("tr");
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5978);return tb.process(t);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(5979);if ((((StringUtil.in(name, "body", "caption", "col", "colgroup", "html", "td", "th"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5980)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5981)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5982);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5983);return false;
                } }else {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(5984);return anythingElse(t, tb);
                }
            }}}}} }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(5985);return anythingElse(t, tb);
            }
            }}__CLR4_2_13lg3lgjpaexql1.R.inc(5986);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5987);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5988);return tb.process(t, InTable);
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private boolean handleMissingTr(Token t, TreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5989);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5990);boolean processed = tb.processEndTag("tr");
            __CLR4_2_13lg3lgjpaexql1.R.inc(5991);if ((((processed)&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5992)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5993)==0&false)))
                {__CLR4_2_13lg3lgjpaexql1.R.inc(5994);return tb.process(t);
            }else
                {__CLR4_2_13lg3lgjpaexql1.R.inc(5995);return false;
        }}finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InCell {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(5996);
            __CLR4_2_13lg3lgjpaexql1.R.inc(5997);if ((((t.isEndTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(5998)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(5999)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6000);Token.EndTag endTag = t.asEndTag();
                __CLR4_2_13lg3lgjpaexql1.R.inc(6001);String name = endTag.normalName();

                __CLR4_2_13lg3lgjpaexql1.R.inc(6002);if ((((StringUtil.inSorted(name, Constants.InCellNames))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6003)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6004)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6005);if ((((!tb.inTableScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6006)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6007)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6008);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6009);tb.transition(InRow); // might not be in scope if empty: <td /> and processing fake end tag
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6010);return false;
                    }
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(6011);tb.generateImpliedEndTags();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6012);if ((((!tb.currentElement().nodeName().equals(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6013)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6014)==0&false)))
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(6015);tb.error(this);
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(6016);tb.popStackToClose(name);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6017);tb.clearFormattingElementsToLastMarker();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6018);tb.transition(InRow);
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6019);if ((((StringUtil.inSorted(name, Constants.InCellBody))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6020)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6021)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6022);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6023);return false;
                } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6024);if ((((StringUtil.inSorted(name, Constants.InCellTable))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6025)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6026)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6027);if ((((!tb.inTableScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6028)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6029)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6030);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6031);return false;
                    }
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(6032);closeCell(tb);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6033);return tb.process(t);
                } }else {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6034);return anythingElse(t, tb);
                }
            }}}} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6035);if ((((t.isStartTag() &&
                    StringUtil.inSorted(t.asStartTag().normalName(), Constants.InCellCol))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6036)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6037)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6038);if ((((!(tb.inTableScope("td") || tb.inTableScope("th")))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6039)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6040)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6041);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6042);return false;
                }
                }__CLR4_2_13lg3lgjpaexql1.R.inc(6043);closeCell(tb);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6044);return tb.process(t);
            } }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6045);return anythingElse(t, tb);
            }
            }}__CLR4_2_13lg3lgjpaexql1.R.inc(6046);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6047);
            __CLR4_2_13lg3lgjpaexql1.R.inc(6048);return tb.process(t, InBody);
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private void closeCell(HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6049);
            __CLR4_2_13lg3lgjpaexql1.R.inc(6050);if ((((tb.inTableScope("td"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6051)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6052)==0&false)))
                {__CLR4_2_13lg3lgjpaexql1.R.inc(6053);tb.processEndTag("td");
            }else
                {__CLR4_2_13lg3lgjpaexql1.R.inc(6054);tb.processEndTag("th"); // only here if th or td in scope
        }}finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InSelect {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6055);
            boolean __CLB4_2_1_bool6=false;__CLR4_2_13lg3lgjpaexql1.R.inc(6056);switch (t.type) {
                case Character:if (!__CLB4_2_1_bool6) {__CLR4_2_13lg3lgjpaexql1.R.inc(6057);__CLB4_2_1_bool6=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6058);Token.Character c = t.asCharacter();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6059);if ((((c.getData().equals(nullString))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6060)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6061)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6062);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6063);return false;
                    } }else {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6064);tb.insert(c);
                    }
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(6065);break;
                case Comment:if (!__CLB4_2_1_bool6) {__CLR4_2_13lg3lgjpaexql1.R.inc(6066);__CLB4_2_1_bool6=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6067);tb.insert(t.asComment());
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6068);break;
                case Doctype:if (!__CLB4_2_1_bool6) {__CLR4_2_13lg3lgjpaexql1.R.inc(6069);__CLB4_2_1_bool6=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6070);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6071);return false;
                case StartTag:if (!__CLB4_2_1_bool6) {__CLR4_2_13lg3lgjpaexql1.R.inc(6072);__CLB4_2_1_bool6=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6073);Token.StartTag start = t.asStartTag();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6074);String name = start.normalName();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6075);if ((((name.equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6076)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6077)==0&false)))
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(6078);return tb.process(start, InBody);
                    }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6079);if ((((name.equals("option"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6080)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6081)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6082);if ((((tb.currentElement().nodeName().equals("option"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6083)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6084)==0&false)))
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(6085);tb.processEndTag("option");
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(6086);tb.insert(start);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6087);if ((((name.equals("optgroup"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6088)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6089)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6090);if ((((tb.currentElement().nodeName().equals("option"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6091)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6092)==0&false)))
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(6093);tb.processEndTag("option");
                        }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6094);if ((((tb.currentElement().nodeName().equals("optgroup"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6095)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6096)==0&false)))
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(6097);tb.processEndTag("optgroup");
                        }}__CLR4_2_13lg3lgjpaexql1.R.inc(6098);tb.insert(start);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6099);if ((((name.equals("select"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6100)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6101)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6102);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6103);return tb.processEndTag("select");
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6104);if ((((StringUtil.in(name, "input", "keygen", "textarea"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6105)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6106)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6107);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6108);if ((((!tb.inSelectScope("select"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6109)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6110)==0&false)))
                            {__CLR4_2_13lg3lgjpaexql1.R.inc(6111);return false; // frag
                        }__CLR4_2_13lg3lgjpaexql1.R.inc(6112);tb.processEndTag("select");
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6113);return tb.process(start);
                    } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6114);if ((((name.equals("script"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6115)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6116)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6117);return tb.process(t, InHead);
                    } }else {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6118);return anythingElse(t, tb);
                    }
                    }}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(6119);break;
                case EndTag:if (!__CLB4_2_1_bool6) {__CLR4_2_13lg3lgjpaexql1.R.inc(6120);__CLB4_2_1_bool6=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6121);Token.EndTag end = t.asEndTag();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6122);name = end.normalName();
                    boolean __CLB4_2_1_bool7=false;__CLR4_2_13lg3lgjpaexql1.R.inc(6123);switch (name) {
                        case "optgroup":if (!__CLB4_2_1_bool7) {__CLR4_2_13lg3lgjpaexql1.R.inc(6124);__CLB4_2_1_bool7=true;}
                            __CLR4_2_13lg3lgjpaexql1.R.inc(6125);if ((((tb.currentElement().nodeName().equals("option") && tb.aboveOnStack(tb.currentElement()) != null && tb.aboveOnStack(tb.currentElement()).nodeName().equals("optgroup"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6126)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6127)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(6128);tb.processEndTag("option");
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(6129);if ((((tb.currentElement().nodeName().equals("optgroup"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6130)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6131)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(6132);tb.pop();
                            }else
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(6133);tb.error(this);
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(6134);break;
                        case "option":if (!__CLB4_2_1_bool7) {__CLR4_2_13lg3lgjpaexql1.R.inc(6135);__CLB4_2_1_bool7=true;}
                            __CLR4_2_13lg3lgjpaexql1.R.inc(6136);if ((((tb.currentElement().nodeName().equals("option"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6137)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6138)==0&false)))
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(6139);tb.pop();
                            }else
                                {__CLR4_2_13lg3lgjpaexql1.R.inc(6140);tb.error(this);
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(6141);break;
                        case "select":if (!__CLB4_2_1_bool7) {__CLR4_2_13lg3lgjpaexql1.R.inc(6142);__CLB4_2_1_bool7=true;}
                            __CLR4_2_13lg3lgjpaexql1.R.inc(6143);if ((((!tb.inSelectScope(name))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6144)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6145)==0&false))) {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(6146);tb.error(this);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(6147);return false;
                            } }else {{
                                __CLR4_2_13lg3lgjpaexql1.R.inc(6148);tb.popStackToClose(name);
                                __CLR4_2_13lg3lgjpaexql1.R.inc(6149);tb.resetInsertionMode();
                            }
                            }__CLR4_2_13lg3lgjpaexql1.R.inc(6150);break;
                        default:if (!__CLB4_2_1_bool7) {__CLR4_2_13lg3lgjpaexql1.R.inc(6151);__CLB4_2_1_bool7=true;}
                            __CLR4_2_13lg3lgjpaexql1.R.inc(6152);return anythingElse(t, tb);
                    }
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6153);break;
                case EOF:if (!__CLB4_2_1_bool6) {__CLR4_2_13lg3lgjpaexql1.R.inc(6154);__CLB4_2_1_bool6=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6155);if ((((!tb.currentElement().nodeName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6156)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6157)==0&false)))
                        {__CLR4_2_13lg3lgjpaexql1.R.inc(6158);tb.error(this);
                    }__CLR4_2_13lg3lgjpaexql1.R.inc(6159);break;
                default:if (!__CLB4_2_1_bool6) {__CLR4_2_13lg3lgjpaexql1.R.inc(6160);__CLB4_2_1_bool6=true;}
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6161);return anythingElse(t, tb);
            }
            __CLR4_2_13lg3lgjpaexql1.R.inc(6162);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6163);
            __CLR4_2_13lg3lgjpaexql1.R.inc(6164);tb.error(this);
            __CLR4_2_13lg3lgjpaexql1.R.inc(6165);return false;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InSelectInTable {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6166);
            __CLR4_2_13lg3lgjpaexql1.R.inc(6167);if ((((t.isStartTag() && StringUtil.in(t.asStartTag().normalName(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6168)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6169)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6170);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6171);tb.processEndTag("select");
                __CLR4_2_13lg3lgjpaexql1.R.inc(6172);return tb.process(t);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6173);if ((((t.isEndTag() && StringUtil.in(t.asEndTag().normalName(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6174)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6175)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6176);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6177);if ((((tb.inTableScope(t.asEndTag().normalName()))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6178)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6179)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6180);tb.processEndTag("select");
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6181);return (tb.process(t));
                } }else
                    {__CLR4_2_13lg3lgjpaexql1.R.inc(6182);return false;
            }} }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6183);return tb.process(t, InSelect);
            }
        }}}finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    AfterBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6184);
            __CLR4_2_13lg3lgjpaexql1.R.inc(6185);if ((((isWhitespace(t))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6186)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6187)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6188);return tb.process(t, InBody);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6189);if ((((t.isComment())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6190)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6191)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6192);tb.insert(t.asComment()); // into html node
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6193);if ((((t.isDoctype())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6194)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6195)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6196);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6197);return false;
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6198);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6199)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6200)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6201);return tb.process(t, InBody);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6202);if ((((t.isEndTag() && t.asEndTag().normalName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6203)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6204)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6205);if ((((tb.isFragmentParsing())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6206)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6207)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6208);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6209);return false;
                } }else {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6210);tb.transition(AfterAfterBody);
                }
            }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6211);if ((((t.isEOF())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6212)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6213)==0&false))) {{
                // chillax! we're done
            } }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6214);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6215);tb.transition(InBody);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6216);return tb.process(t);
            }
            }}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(6217);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    InFrameset {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6218);
            __CLR4_2_13lg3lgjpaexql1.R.inc(6219);if ((((isWhitespace(t))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6220)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6221)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6222);tb.insert(t.asCharacter());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6223);if ((((t.isComment())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6224)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6225)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6226);tb.insert(t.asComment());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6227);if ((((t.isDoctype())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6228)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6229)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6230);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6231);return false;
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6232);if ((((t.isStartTag())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6233)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6234)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6235);Token.StartTag start = t.asStartTag();
                boolean __CLB4_2_1_bool8=false;__CLR4_2_13lg3lgjpaexql1.R.inc(6236);switch (start.normalName()) {
                    case "html":if (!__CLB4_2_1_bool8) {__CLR4_2_13lg3lgjpaexql1.R.inc(6237);__CLB4_2_1_bool8=true;}
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6238);return tb.process(start, InBody);
                    case "frameset":if (!__CLB4_2_1_bool8) {__CLR4_2_13lg3lgjpaexql1.R.inc(6239);__CLB4_2_1_bool8=true;}
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6240);tb.insert(start);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6241);break;
                    case "frame":if (!__CLB4_2_1_bool8) {__CLR4_2_13lg3lgjpaexql1.R.inc(6242);__CLB4_2_1_bool8=true;}
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6243);tb.insertEmpty(start);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6244);break;
                    case "noframes":if (!__CLB4_2_1_bool8) {__CLR4_2_13lg3lgjpaexql1.R.inc(6245);__CLB4_2_1_bool8=true;}
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6246);return tb.process(start, InHead);
                    default:if (!__CLB4_2_1_bool8) {__CLR4_2_13lg3lgjpaexql1.R.inc(6247);__CLB4_2_1_bool8=true;}
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6248);tb.error(this);
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6249);return false;
                }
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6250);if ((((t.isEndTag() && t.asEndTag().normalName().equals("frameset"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6251)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6252)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6253);if ((((tb.currentElement().nodeName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6254)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6255)==0&false))) {{ // frag
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6256);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6257);return false;
                } }else {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6258);tb.pop();
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6259);if ((((!tb.isFragmentParsing() && !tb.currentElement().nodeName().equals("frameset"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6260)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6261)==0&false))) {{
                        __CLR4_2_13lg3lgjpaexql1.R.inc(6262);tb.transition(AfterFrameset);
                    }
                }}
            }} }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6263);if ((((t.isEOF())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6264)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6265)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6266);if ((((!tb.currentElement().nodeName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6267)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6268)==0&false))) {{
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6269);tb.error(this);
                    __CLR4_2_13lg3lgjpaexql1.R.inc(6270);return true;
                }
            }} }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6271);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6272);return false;
            }
            }}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(6273);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    AfterFrameset {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6274);
            __CLR4_2_13lg3lgjpaexql1.R.inc(6275);if ((((isWhitespace(t))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6276)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6277)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6278);tb.insert(t.asCharacter());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6279);if ((((t.isComment())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6280)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6281)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6282);tb.insert(t.asComment());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6283);if ((((t.isDoctype())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6284)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6285)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6286);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6287);return false;
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6288);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6289)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6290)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6291);return tb.process(t, InBody);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6292);if ((((t.isEndTag() && t.asEndTag().normalName().equals("html"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6293)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6294)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6295);tb.transition(AfterAfterFrameset);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6296);if ((((t.isStartTag() && t.asStartTag().normalName().equals("noframes"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6297)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6298)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6299);return tb.process(t, InHead);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6300);if ((((t.isEOF())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6301)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6302)==0&false))) {{
                // cool your heels, we're complete
            } }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6303);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6304);return false;
            }
            }}}}}}}__CLR4_2_13lg3lgjpaexql1.R.inc(6305);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    AfterAfterBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6306);
            __CLR4_2_13lg3lgjpaexql1.R.inc(6307);if ((((t.isComment())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6308)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6309)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6310);tb.insert(t.asComment());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6311);if ((((t.isDoctype() || isWhitespace(t) || (t.isStartTag() && t.asStartTag().normalName().equals("html")))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6312)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6313)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6314);return tb.process(t, InBody);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6315);if ((((t.isEOF())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6316)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6317)==0&false))) {{
                // nice work chuck
            } }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6318);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6319);tb.transition(InBody);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6320);return tb.process(t);
            }
            }}}__CLR4_2_13lg3lgjpaexql1.R.inc(6321);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    AfterAfterFrameset {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6322);
            __CLR4_2_13lg3lgjpaexql1.R.inc(6323);if ((((t.isComment())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6324)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6325)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6326);tb.insert(t.asComment());
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6327);if ((((t.isDoctype() || isWhitespace(t) || (t.isStartTag() && t.asStartTag().normalName().equals("html")))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6328)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6329)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6330);return tb.process(t, InBody);
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6331);if ((((t.isEOF())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6332)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6333)==0&false))) {{
                // nice work chuck
            } }else {__CLR4_2_13lg3lgjpaexql1.R.inc(6334);if ((((t.isStartTag() && t.asStartTag().normalName().equals("noframes"))&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6335)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6336)==0&false))) {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6337);return tb.process(t, InHead);
            } }else {{
                __CLR4_2_13lg3lgjpaexql1.R.inc(6338);tb.error(this);
                __CLR4_2_13lg3lgjpaexql1.R.inc(6339);return false;
            }
            }}}}__CLR4_2_13lg3lgjpaexql1.R.inc(6340);return true;
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    },
    ForeignContent {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6341);
            __CLR4_2_13lg3lgjpaexql1.R.inc(6342);return true;
            // todo: implement. Also; how do we get here?
        }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}
    };

    private static String nullString = String.valueOf('\u0000');

    abstract boolean process(Token t, HtmlTreeBuilder tb);

    private static boolean isWhitespace(Token t) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6343);
        __CLR4_2_13lg3lgjpaexql1.R.inc(6344);if ((((t.isCharacter())&&(__CLR4_2_13lg3lgjpaexql1.R.iget(6345)!=0|true))||(__CLR4_2_13lg3lgjpaexql1.R.iget(6346)==0&false))) {{
            __CLR4_2_13lg3lgjpaexql1.R.inc(6347);String data = t.asCharacter().getData();
            __CLR4_2_13lg3lgjpaexql1.R.inc(6348);return isWhitespace(data);
        }
        }__CLR4_2_13lg3lgjpaexql1.R.inc(6349);return false;
    }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

    private static boolean isWhitespace(String data) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6350);
        __CLR4_2_13lg3lgjpaexql1.R.inc(6351);return StringUtil.isBlank(data);
    }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

    private static void handleRcData(Token.StartTag startTag, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6352);
        __CLR4_2_13lg3lgjpaexql1.R.inc(6353);tb.tokeniser.transition(TokeniserState.Rcdata);
        __CLR4_2_13lg3lgjpaexql1.R.inc(6354);tb.markInsertionMode();
        __CLR4_2_13lg3lgjpaexql1.R.inc(6355);tb.transition(Text);
        __CLR4_2_13lg3lgjpaexql1.R.inc(6356);tb.insert(startTag);
    }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

    private static void handleRawtext(Token.StartTag startTag, HtmlTreeBuilder tb) {try{__CLR4_2_13lg3lgjpaexql1.R.inc(6357);
        __CLR4_2_13lg3lgjpaexql1.R.inc(6358);tb.tokeniser.transition(TokeniserState.Rawtext);
        __CLR4_2_13lg3lgjpaexql1.R.inc(6359);tb.markInsertionMode();
        __CLR4_2_13lg3lgjpaexql1.R.inc(6360);tb.transition(Text);
        __CLR4_2_13lg3lgjpaexql1.R.inc(6361);tb.insert(startTag);
    }finally{__CLR4_2_13lg3lgjpaexql1.R.flushNeeded();}}

    // lists of tags to search through. A little harder to read here, but causes less GC than dynamic varargs.
    // was contributing around 10% of parse GC load.
    // must make sure these are sorted, as used in findSorted. MUST update HtmlTreebuilderStateTest if more arrays added.
    static final class Constants {
        static final String[] InBodyStartToHead = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
        static final String[] InBodyStartPClosers = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl",
            "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol",
            "p", "section", "summary", "ul"};
        static final String[] Headings = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
        static final String[] InBodyStartPreListing = new String[]{"listing", "pre"};
        static final String[] InBodyStartLiBreakers = new String[]{"address", "div", "p"};
        static final String[] DdDt = new String[]{"dd", "dt"};
        static final String[] Formatters = new String[]{"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
        static final String[] InBodyStartApplets = new String[]{"applet", "marquee", "object"};
        static final String[] InBodyStartEmptyFormatters = new String[]{"area", "br", "embed", "img", "keygen", "wbr"};
        static final String[] InBodyStartMedia = new String[]{"param", "source", "track"};
        static final String[] InBodyStartInputAttribs = new String[]{"action", "name", "prompt"};
        static final String[] InBodyStartOptions = new String[]{"optgroup", "option"};
        static final String[] InBodyStartRuby = new String[]{"rp", "rt"};
        static final String[] InBodyStartDrop = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] InBodyEndClosers = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div",
            "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu",
            "nav", "ol", "pre", "section", "summary", "ul"};
        static final String[] InBodyEndAdoptionFormatters = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
        static final String[] InBodyEndTableFosters = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] InCellNames = new String[]{"td", "th"};
        static final String[] InCellBody = new String[]{"body", "caption", "col", "colgroup", "html"};
        static final String[] InCellTable = new String[]{ "table", "tbody", "tfoot", "thead", "tr"};
        static final String[] InCellCol = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
    }
;public static class __CLR4_2_13lg3lgjpaexql1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,6362,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
