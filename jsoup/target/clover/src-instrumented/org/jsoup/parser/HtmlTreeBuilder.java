/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.jsoup.internal.StringUtil.inSorted;

/**
 * HTML Tree Builder; creates a DOM from Tokens.
 */
public class HtmlTreeBuilder extends TreeBuilder {public static class __CLR4_2_135e35ejp2rxa45{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543506510356L,8589935092L,4660,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // tag searches. must be sorted, used in inSorted. MUST update HtmlTreeBuilderTest if more arrays are added.
    static final String[] TagsSearchInScope = new String[]{"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    static final String[] TagSearchList = new String[]{"ol", "ul"};
    static final String[] TagSearchButton = new String[]{"button"};
    static final String[] TagSearchTableScope = new String[]{"html", "table"};
    static final String[] TagSearchSelectScope = new String[]{"optgroup", "option"};
    static final String[] TagSearchEndTags = new String[]{"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};
    static final String[] TagSearchSpecial = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound",
        "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd",
        "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form",
        "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html",
        "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav",
        "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script",
        "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead",
        "title", "tr", "ul", "wbr", "xmp"};

    public static final int MaxScopeSearchDepth = 100; // prevents the parser bogging down in exceptionally broken pages

    private HtmlTreeBuilderState state; // the current state
    private HtmlTreeBuilderState originalState; // original / marked state

    private boolean baseUriSetFromDoc;
    private Element headElement; // the current head element
    private FormElement formElement; // the current form element
    private Element contextElement; // fragment parse context -- could be null even if fragment parsing
    private ArrayList<Element> formattingElements; // active (open) formatting elements
    private List<String> pendingTableCharacters; // chars in table to be shifted out
    private Token.EndTag emptyEnd; // reused empty end tag

    private boolean framesetOk; // if ok to go into frameset
    private boolean fosterInserts; // if next inserts should be fostered
    private boolean fragmentParsing; // if parsing a fragment of html

    ParseSettings defaultSettings() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4082);
        __CLR4_2_135e35ejp2rxa45.R.inc(4083);return ParseSettings.htmlDefault;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4084);
        __CLR4_2_135e35ejp2rxa45.R.inc(4085);super.initialiseParse(input, baseUri, parser);

        // this is a bit mucky. todo - probably just create new parser objects to ensure all reset.
        __CLR4_2_135e35ejp2rxa45.R.inc(4086);state = HtmlTreeBuilderState.Initial;
        __CLR4_2_135e35ejp2rxa45.R.inc(4087);originalState = null;
        __CLR4_2_135e35ejp2rxa45.R.inc(4088);baseUriSetFromDoc = false;
        __CLR4_2_135e35ejp2rxa45.R.inc(4089);headElement = null;
        __CLR4_2_135e35ejp2rxa45.R.inc(4090);formElement = null;
        __CLR4_2_135e35ejp2rxa45.R.inc(4091);contextElement = null;
        __CLR4_2_135e35ejp2rxa45.R.inc(4092);formattingElements = new ArrayList<>();
        __CLR4_2_135e35ejp2rxa45.R.inc(4093);pendingTableCharacters = new ArrayList<>();
        __CLR4_2_135e35ejp2rxa45.R.inc(4094);emptyEnd = new Token.EndTag();
        __CLR4_2_135e35ejp2rxa45.R.inc(4095);framesetOk = true;
        __CLR4_2_135e35ejp2rxa45.R.inc(4096);fosterInserts = false;
        __CLR4_2_135e35ejp2rxa45.R.inc(4097);fragmentParsing = false;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    List<Node> parseFragment(String inputFragment, Element context, String baseUri, Parser parser) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4098);
        // context may be null
        __CLR4_2_135e35ejp2rxa45.R.inc(4099);state = HtmlTreeBuilderState.Initial;
        __CLR4_2_135e35ejp2rxa45.R.inc(4100);initialiseParse(new StringReader(inputFragment), baseUri, parser);
        __CLR4_2_135e35ejp2rxa45.R.inc(4101);contextElement = context;
        __CLR4_2_135e35ejp2rxa45.R.inc(4102);fragmentParsing = true;
        __CLR4_2_135e35ejp2rxa45.R.inc(4103);Element root = null;

        __CLR4_2_135e35ejp2rxa45.R.inc(4104);if ((((context != null)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4105)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4106)==0&false))) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4107);if ((((context.ownerDocument() != null)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4108)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4109)==0&false))) // quirks setup:
                {__CLR4_2_135e35ejp2rxa45.R.inc(4110);doc.quirksMode(context.ownerDocument().quirksMode());

            // initialise the tokeniser state:
            }__CLR4_2_135e35ejp2rxa45.R.inc(4111);String contextTag = context.tagName();
            __CLR4_2_135e35ejp2rxa45.R.inc(4112);if ((((StringUtil.in(contextTag, "title", "textarea"))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4113)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4114)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4115);tokeniser.transition(TokeniserState.Rcdata);
            }else {__CLR4_2_135e35ejp2rxa45.R.inc(4116);if ((((StringUtil.in(contextTag, "iframe", "noembed", "noframes", "style", "xmp"))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4117)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4118)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4119);tokeniser.transition(TokeniserState.Rawtext);
            }else {__CLR4_2_135e35ejp2rxa45.R.inc(4120);if ((((contextTag.equals("script"))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4121)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4122)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4123);tokeniser.transition(TokeniserState.ScriptData);
            }else {__CLR4_2_135e35ejp2rxa45.R.inc(4124);if ((((contextTag.equals(("noscript")))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4125)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4126)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4127);tokeniser.transition(TokeniserState.Data); // if scripting enabled, rawtext
            }else {__CLR4_2_135e35ejp2rxa45.R.inc(4128);if ((((contextTag.equals("plaintext"))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4129)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4130)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4131);tokeniser.transition(TokeniserState.Data);
            }else
                {__CLR4_2_135e35ejp2rxa45.R.inc(4132);tokeniser.transition(TokeniserState.Data); // default

            }}}}}__CLR4_2_135e35ejp2rxa45.R.inc(4133);root = new Element(Tag.valueOf("html", settings), baseUri);
            __CLR4_2_135e35ejp2rxa45.R.inc(4134);doc.appendChild(root);
            __CLR4_2_135e35ejp2rxa45.R.inc(4135);stack.add(root);
            __CLR4_2_135e35ejp2rxa45.R.inc(4136);resetInsertionMode();

            // setup form element to nearest form on context (up ancestor chain). ensures form controls are associated
            // with form correctly
            __CLR4_2_135e35ejp2rxa45.R.inc(4137);Elements contextChain = context.parents();
            __CLR4_2_135e35ejp2rxa45.R.inc(4138);contextChain.add(0, context);
            __CLR4_2_135e35ejp2rxa45.R.inc(4139);for (Element parent: contextChain) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4140);if ((((parent instanceof FormElement)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4141)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4142)==0&false))) {{
                    __CLR4_2_135e35ejp2rxa45.R.inc(4143);formElement = (FormElement) parent;
                    __CLR4_2_135e35ejp2rxa45.R.inc(4144);break;
                }
            }}
        }}

        }__CLR4_2_135e35ejp2rxa45.R.inc(4145);runParser();
        __CLR4_2_135e35ejp2rxa45.R.inc(4146);if ((((context != null)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4147)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4148)==0&false)))
            {__CLR4_2_135e35ejp2rxa45.R.inc(4149);return root.childNodes();
        }else
            {__CLR4_2_135e35ejp2rxa45.R.inc(4150);return doc.childNodes();
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    @Override
    protected boolean process(Token token) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4151);
        __CLR4_2_135e35ejp2rxa45.R.inc(4152);currentToken = token;
        __CLR4_2_135e35ejp2rxa45.R.inc(4153);return this.state.process(token, this);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean process(Token token, HtmlTreeBuilderState state) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4154);
        __CLR4_2_135e35ejp2rxa45.R.inc(4155);currentToken = token;
        __CLR4_2_135e35ejp2rxa45.R.inc(4156);return state.process(token, this);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void transition(HtmlTreeBuilderState state) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4157);
        __CLR4_2_135e35ejp2rxa45.R.inc(4158);this.state = state;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    HtmlTreeBuilderState state() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4159);
        __CLR4_2_135e35ejp2rxa45.R.inc(4160);return state;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void markInsertionMode() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4161);
        __CLR4_2_135e35ejp2rxa45.R.inc(4162);originalState = state;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    HtmlTreeBuilderState originalState() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4163);
        __CLR4_2_135e35ejp2rxa45.R.inc(4164);return originalState;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void framesetOk(boolean framesetOk) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4165);
        __CLR4_2_135e35ejp2rxa45.R.inc(4166);this.framesetOk = framesetOk;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean framesetOk() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4167);
        __CLR4_2_135e35ejp2rxa45.R.inc(4168);return framesetOk;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    Document getDocument() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4169);
        __CLR4_2_135e35ejp2rxa45.R.inc(4170);return doc;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    String getBaseUri() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4171);
        __CLR4_2_135e35ejp2rxa45.R.inc(4172);return baseUri;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void maybeSetBaseUri(Element base) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4173);
        __CLR4_2_135e35ejp2rxa45.R.inc(4174);if ((((baseUriSetFromDoc)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4175)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4176)==0&false))) // only listen to the first <base href> in parse
            {__CLR4_2_135e35ejp2rxa45.R.inc(4177);return;

        }__CLR4_2_135e35ejp2rxa45.R.inc(4178);String href = base.absUrl("href");
        __CLR4_2_135e35ejp2rxa45.R.inc(4179);if ((((href.length() != 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4180)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4181)==0&false))) {{ // ignore <base target> etc
            __CLR4_2_135e35ejp2rxa45.R.inc(4182);baseUri = href;
            __CLR4_2_135e35ejp2rxa45.R.inc(4183);baseUriSetFromDoc = true;
            __CLR4_2_135e35ejp2rxa45.R.inc(4184);doc.setBaseUri(href); // set on the doc so doc.createElement(Tag) will get updated base, and to update all descendants
        }
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean isFragmentParsing() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4185);
        __CLR4_2_135e35ejp2rxa45.R.inc(4186);return fragmentParsing;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void error(HtmlTreeBuilderState state) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4187);
        __CLR4_2_135e35ejp2rxa45.R.inc(4188);if ((((parser.getErrors().canAddError())&&(__CLR4_2_135e35ejp2rxa45.R.iget(4189)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4190)==0&false)))
            {__CLR4_2_135e35ejp2rxa45.R.inc(4191);parser.getErrors().add(new ParseError(reader.pos(), "Unexpected token [%s] when in state [%s]", currentToken.tokenType(), state));
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    Element insert(Token.StartTag startTag) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4192);
        // handle empty unknown tags
        // when the spec expects an empty tag, will directly hit insertEmpty, so won't generate this fake end tag.
        __CLR4_2_135e35ejp2rxa45.R.inc(4193);if ((((startTag.isSelfClosing())&&(__CLR4_2_135e35ejp2rxa45.R.iget(4194)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4195)==0&false))) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4196);Element el = insertEmpty(startTag);
            __CLR4_2_135e35ejp2rxa45.R.inc(4197);stack.add(el);
            __CLR4_2_135e35ejp2rxa45.R.inc(4198);tokeniser.transition(TokeniserState.Data); // handles <script />, otherwise needs breakout steps from script data
            __CLR4_2_135e35ejp2rxa45.R.inc(4199);tokeniser.emit(emptyEnd.reset().name(el.tagName()));  // ensure we get out of whatever state we are in. emitted for yielded processing
            __CLR4_2_135e35ejp2rxa45.R.inc(4200);return el;
        }
        
        }__CLR4_2_135e35ejp2rxa45.R.inc(4201);Element el = new Element(Tag.valueOf(startTag.name(), settings), baseUri, settings.normalizeAttributes(startTag.attributes));
        __CLR4_2_135e35ejp2rxa45.R.inc(4202);insert(el);
        __CLR4_2_135e35ejp2rxa45.R.inc(4203);return el;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    Element insertStartTag(String startTagName) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4204);
        __CLR4_2_135e35ejp2rxa45.R.inc(4205);Element el = new Element(Tag.valueOf(startTagName, settings), baseUri);
        __CLR4_2_135e35ejp2rxa45.R.inc(4206);insert(el);
        __CLR4_2_135e35ejp2rxa45.R.inc(4207);return el;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void insert(Element el) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4208);
        __CLR4_2_135e35ejp2rxa45.R.inc(4209);insertNode(el);
        __CLR4_2_135e35ejp2rxa45.R.inc(4210);stack.add(el);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    Element insertEmpty(Token.StartTag startTag) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4211);
        __CLR4_2_135e35ejp2rxa45.R.inc(4212);Tag tag = Tag.valueOf(startTag.name(), settings);
        __CLR4_2_135e35ejp2rxa45.R.inc(4213);Element el = new Element(tag, baseUri, startTag.attributes);
        __CLR4_2_135e35ejp2rxa45.R.inc(4214);insertNode(el);
        __CLR4_2_135e35ejp2rxa45.R.inc(4215);if ((((startTag.isSelfClosing())&&(__CLR4_2_135e35ejp2rxa45.R.iget(4216)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4217)==0&false))) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4218);if ((((tag.isKnownTag())&&(__CLR4_2_135e35ejp2rxa45.R.iget(4219)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4220)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4221);if ((((!tag.isEmpty())&&(__CLR4_2_135e35ejp2rxa45.R.iget(4222)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4223)==0&false)))
                    {__CLR4_2_135e35ejp2rxa45.R.inc(4224);tokeniser.error("Tag cannot be self closing; not a void tag");
            }}
            }else // unknown tag, remember this is self closing for output
                {__CLR4_2_135e35ejp2rxa45.R.inc(4225);tag.setSelfClosing();
        }}
        }__CLR4_2_135e35ejp2rxa45.R.inc(4226);return el;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    FormElement insertForm(Token.StartTag startTag, boolean onStack) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4227);
        __CLR4_2_135e35ejp2rxa45.R.inc(4228);Tag tag = Tag.valueOf(startTag.name(), settings);
        __CLR4_2_135e35ejp2rxa45.R.inc(4229);FormElement el = new FormElement(tag, baseUri, startTag.attributes);
        __CLR4_2_135e35ejp2rxa45.R.inc(4230);setFormElement(el);
        __CLR4_2_135e35ejp2rxa45.R.inc(4231);insertNode(el);
        __CLR4_2_135e35ejp2rxa45.R.inc(4232);if ((((onStack)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4233)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4234)==0&false)))
            {__CLR4_2_135e35ejp2rxa45.R.inc(4235);stack.add(el);
        }__CLR4_2_135e35ejp2rxa45.R.inc(4236);return el;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void insert(Token.Comment commentToken) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4237);
        __CLR4_2_135e35ejp2rxa45.R.inc(4238);Comment comment = new Comment(commentToken.getData());
        __CLR4_2_135e35ejp2rxa45.R.inc(4239);insertNode(comment);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void insert(Token.Character characterToken) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4240);
        __CLR4_2_135e35ejp2rxa45.R.inc(4241);final Node node;
        __CLR4_2_135e35ejp2rxa45.R.inc(4242);final Element el = currentElement();
        __CLR4_2_135e35ejp2rxa45.R.inc(4243);final String tagName = el.tagName();
        __CLR4_2_135e35ejp2rxa45.R.inc(4244);final String data = characterToken.getData();

        __CLR4_2_135e35ejp2rxa45.R.inc(4245);if ((((characterToken.isCData())&&(__CLR4_2_135e35ejp2rxa45.R.iget(4246)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4247)==0&false)))
            {__CLR4_2_135e35ejp2rxa45.R.inc(4248);node = new CDataNode(data);
        }else {__CLR4_2_135e35ejp2rxa45.R.inc(4249);if ((((tagName.equals("script") || tagName.equals("style"))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4250)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4251)==0&false)))
            {__CLR4_2_135e35ejp2rxa45.R.inc(4252);node = new DataNode(data);
        }else
            {__CLR4_2_135e35ejp2rxa45.R.inc(4253);node = new TextNode(data);
        }}__CLR4_2_135e35ejp2rxa45.R.inc(4254);el.appendChild(node); // doesn't use insertNode, because we don't foster these; and will always have a stack.
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    private void insertNode(Node node) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4255);
        // if the stack hasn't been set up yet, elements (doctype, comments) go into the doc
        __CLR4_2_135e35ejp2rxa45.R.inc(4256);if ((((stack.size() == 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4257)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4258)==0&false)))
            {__CLR4_2_135e35ejp2rxa45.R.inc(4259);doc.appendChild(node);
        }else {__CLR4_2_135e35ejp2rxa45.R.inc(4260);if ((((isFosterInserts())&&(__CLR4_2_135e35ejp2rxa45.R.iget(4261)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4262)==0&false)))
            {__CLR4_2_135e35ejp2rxa45.R.inc(4263);insertInFosterParent(node);
        }else
            {__CLR4_2_135e35ejp2rxa45.R.inc(4264);currentElement().appendChild(node);

        // connect form controls to their form element
        }}__CLR4_2_135e35ejp2rxa45.R.inc(4265);if ((((node instanceof Element && ((Element) node).tag().isFormListed())&&(__CLR4_2_135e35ejp2rxa45.R.iget(4266)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4267)==0&false))) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4268);if ((((formElement != null)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4269)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4270)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4271);formElement.addElement((Element) node);
        }}
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    Element pop() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4272);
        __CLR4_2_135e35ejp2rxa45.R.inc(4273);int size = stack.size();
        __CLR4_2_135e35ejp2rxa45.R.inc(4274);return stack.remove(size-1);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void push(Element element) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4275);
        __CLR4_2_135e35ejp2rxa45.R.inc(4276);stack.add(element);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    ArrayList<Element> getStack() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4277);
        __CLR4_2_135e35ejp2rxa45.R.inc(4278);return stack;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean onStack(Element el) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4279);
        __CLR4_2_135e35ejp2rxa45.R.inc(4280);return isElementInQueue(stack, el);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    private boolean isElementInQueue(ArrayList<Element> queue, Element element) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4281);
        __CLR4_2_135e35ejp2rxa45.R.inc(4282);for (int pos = queue.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4283)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4284)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4285);Element next = queue.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4286);if ((((next == element)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4287)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4288)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4289);return true;
            }
        }}
        }__CLR4_2_135e35ejp2rxa45.R.inc(4290);return false;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    Element getFromStack(String elName) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4291);
        __CLR4_2_135e35ejp2rxa45.R.inc(4292);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4293)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4294)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4295);Element next = stack.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4296);if ((((next.nodeName().equals(elName))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4297)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4298)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4299);return next;
            }
        }}
        }__CLR4_2_135e35ejp2rxa45.R.inc(4300);return null;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean removeFromStack(Element el) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4301);
        __CLR4_2_135e35ejp2rxa45.R.inc(4302);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4303)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4304)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4305);Element next = stack.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4306);if ((((next == el)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4307)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4308)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4309);stack.remove(pos);
                __CLR4_2_135e35ejp2rxa45.R.inc(4310);return true;
            }
        }}
        }__CLR4_2_135e35ejp2rxa45.R.inc(4311);return false;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void popStackToClose(String elName) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4312);
        __CLR4_2_135e35ejp2rxa45.R.inc(4313);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4314)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4315)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4316);Element next = stack.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4317);stack.remove(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4318);if ((((next.nodeName().equals(elName))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4319)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4320)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4321);break;
        }}
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    // elnames is sorted, comes from Constants
    void popStackToClose(String... elNames) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4322);
        __CLR4_2_135e35ejp2rxa45.R.inc(4323);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4324)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4325)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4326);Element next = stack.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4327);stack.remove(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4328);if ((((inSorted(next.nodeName(), elNames))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4329)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4330)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4331);break;
        }}
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void popStackToBefore(String elName) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4332);
        __CLR4_2_135e35ejp2rxa45.R.inc(4333);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4334)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4335)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4336);Element next = stack.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4337);if ((((next.nodeName().equals(elName))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4338)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4339)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4340);break;
            } }else {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4341);stack.remove(pos);
            }
        }}
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void clearStackToTableContext() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4342);
        __CLR4_2_135e35ejp2rxa45.R.inc(4343);clearStackToContext("table");
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void clearStackToTableBodyContext() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4344);
        __CLR4_2_135e35ejp2rxa45.R.inc(4345);clearStackToContext("tbody", "tfoot", "thead", "template");
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void clearStackToTableRowContext() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4346);
        __CLR4_2_135e35ejp2rxa45.R.inc(4347);clearStackToContext("tr", "template");
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    private void clearStackToContext(String... nodeNames) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4348);
        __CLR4_2_135e35ejp2rxa45.R.inc(4349);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4350)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4351)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4352);Element next = stack.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4353);if ((((StringUtil.in(next.nodeName(), nodeNames) || next.nodeName().equals("html"))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4354)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4355)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4356);break;
            }else
                {__CLR4_2_135e35ejp2rxa45.R.inc(4357);stack.remove(pos);
        }}
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    Element aboveOnStack(Element el) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4358);
        assert (((onStack(el))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4359)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4360)==0&false));
        __CLR4_2_135e35ejp2rxa45.R.inc(4361);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4362)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4363)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4364);Element next = stack.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4365);if ((((next == el)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4366)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4367)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4368);return stack.get(pos-1);
            }
        }}
        }__CLR4_2_135e35ejp2rxa45.R.inc(4369);return null;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void insertOnStackAfter(Element after, Element in) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4370);
        __CLR4_2_135e35ejp2rxa45.R.inc(4371);int i = stack.lastIndexOf(after);
        __CLR4_2_135e35ejp2rxa45.R.inc(4372);Validate.isTrue(i != -1);
        __CLR4_2_135e35ejp2rxa45.R.inc(4373);stack.add(i+1, in);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void replaceOnStack(Element out, Element in) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4374);
        __CLR4_2_135e35ejp2rxa45.R.inc(4375);replaceInQueue(stack, out, in);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    private void replaceInQueue(ArrayList<Element> queue, Element out, Element in) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4376);
        __CLR4_2_135e35ejp2rxa45.R.inc(4377);int i = queue.lastIndexOf(out);
        __CLR4_2_135e35ejp2rxa45.R.inc(4378);Validate.isTrue(i != -1);
        __CLR4_2_135e35ejp2rxa45.R.inc(4379);queue.set(i, in);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void resetInsertionMode() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4380);
        __CLR4_2_135e35ejp2rxa45.R.inc(4381);boolean last = false;
        __CLR4_2_135e35ejp2rxa45.R.inc(4382);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4383)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4384)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4385);Element node = stack.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4386);if ((((pos == 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4387)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4388)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4389);last = true;
                __CLR4_2_135e35ejp2rxa45.R.inc(4390);node = contextElement;
            }
            }__CLR4_2_135e35ejp2rxa45.R.inc(4391);String name = node.nodeName();
            __CLR4_2_135e35ejp2rxa45.R.inc(4392);if (((("select".equals(name))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4393)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4394)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4395);transition(HtmlTreeBuilderState.InSelect);
                __CLR4_2_135e35ejp2rxa45.R.inc(4396);break; // frag
            } }else {__CLR4_2_135e35ejp2rxa45.R.inc(4397);if ((((("td".equals(name) || "th".equals(name) && !last))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4398)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4399)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4400);transition(HtmlTreeBuilderState.InCell);
                __CLR4_2_135e35ejp2rxa45.R.inc(4401);break;
            } }else {__CLR4_2_135e35ejp2rxa45.R.inc(4402);if (((("tr".equals(name))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4403)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4404)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4405);transition(HtmlTreeBuilderState.InRow);
                __CLR4_2_135e35ejp2rxa45.R.inc(4406);break;
            } }else {__CLR4_2_135e35ejp2rxa45.R.inc(4407);if (((("tbody".equals(name) || "thead".equals(name) || "tfoot".equals(name))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4408)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4409)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4410);transition(HtmlTreeBuilderState.InTableBody);
                __CLR4_2_135e35ejp2rxa45.R.inc(4411);break;
            } }else {__CLR4_2_135e35ejp2rxa45.R.inc(4412);if (((("caption".equals(name))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4413)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4414)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4415);transition(HtmlTreeBuilderState.InCaption);
                __CLR4_2_135e35ejp2rxa45.R.inc(4416);break;
            } }else {__CLR4_2_135e35ejp2rxa45.R.inc(4417);if (((("colgroup".equals(name))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4418)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4419)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4420);transition(HtmlTreeBuilderState.InColumnGroup);
                __CLR4_2_135e35ejp2rxa45.R.inc(4421);break; // frag
            } }else {__CLR4_2_135e35ejp2rxa45.R.inc(4422);if (((("table".equals(name))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4423)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4424)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4425);transition(HtmlTreeBuilderState.InTable);
                __CLR4_2_135e35ejp2rxa45.R.inc(4426);break;
            } }else {__CLR4_2_135e35ejp2rxa45.R.inc(4427);if (((("head".equals(name))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4428)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4429)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4430);transition(HtmlTreeBuilderState.InBody);
                __CLR4_2_135e35ejp2rxa45.R.inc(4431);break; // frag
            } }else {__CLR4_2_135e35ejp2rxa45.R.inc(4432);if (((("body".equals(name))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4433)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4434)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4435);transition(HtmlTreeBuilderState.InBody);
                __CLR4_2_135e35ejp2rxa45.R.inc(4436);break;
            } }else {__CLR4_2_135e35ejp2rxa45.R.inc(4437);if (((("frameset".equals(name))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4438)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4439)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4440);transition(HtmlTreeBuilderState.InFrameset);
                __CLR4_2_135e35ejp2rxa45.R.inc(4441);break; // frag
            } }else {__CLR4_2_135e35ejp2rxa45.R.inc(4442);if (((("html".equals(name))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4443)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4444)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4445);transition(HtmlTreeBuilderState.BeforeHead);
                __CLR4_2_135e35ejp2rxa45.R.inc(4446);break; // frag
            } }else {__CLR4_2_135e35ejp2rxa45.R.inc(4447);if ((((last)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4448)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4449)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4450);transition(HtmlTreeBuilderState.InBody);
                __CLR4_2_135e35ejp2rxa45.R.inc(4451);break; // frag
            }
        }}}}}}}}}}}}}
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    // todo: tidy up in specific scope methods
    private String[] specificScopeTarget = {null};

    private boolean inSpecificScope(String targetName, String[] baseTypes, String[] extraTypes) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4452);
        __CLR4_2_135e35ejp2rxa45.R.inc(4453);specificScopeTarget[0] = targetName;
        __CLR4_2_135e35ejp2rxa45.R.inc(4454);return inSpecificScope(specificScopeTarget, baseTypes, extraTypes);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    private boolean inSpecificScope(String[] targetNames, String[] baseTypes, String[] extraTypes) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4455);
        // https://html.spec.whatwg.org/multipage/parsing.html#has-an-element-in-the-specific-scope
        __CLR4_2_135e35ejp2rxa45.R.inc(4456);final int bottom = stack.size() -1;
        __CLR4_2_135e35ejp2rxa45.R.inc(4457);final int top = (((bottom > MaxScopeSearchDepth )&&(__CLR4_2_135e35ejp2rxa45.R.iget(4458)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4459)==0&false))? bottom - MaxScopeSearchDepth : 0;
        // don't walk too far up the tree

        __CLR4_2_135e35ejp2rxa45.R.inc(4460);for (int pos = bottom; (((pos >= top)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4461)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4462)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4463);final String elName = stack.get(pos).nodeName();
            __CLR4_2_135e35ejp2rxa45.R.inc(4464);if ((((inSorted(elName, targetNames))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4465)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4466)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4467);return true;
            }__CLR4_2_135e35ejp2rxa45.R.inc(4468);if ((((inSorted(elName, baseTypes))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4469)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4470)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4471);return false;
            }__CLR4_2_135e35ejp2rxa45.R.inc(4472);if ((((extraTypes != null && inSorted(elName, extraTypes))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4473)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4474)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4475);return false;
        }}
        //Validate.fail("Should not be reachable"); // would end up false because hitting 'html' at root (basetypes)
        }__CLR4_2_135e35ejp2rxa45.R.inc(4476);return false;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean inScope(String[] targetNames) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4477);
        __CLR4_2_135e35ejp2rxa45.R.inc(4478);return inSpecificScope(targetNames, TagsSearchInScope, null);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean inScope(String targetName) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4479);
        __CLR4_2_135e35ejp2rxa45.R.inc(4480);return inScope(targetName, null);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean inScope(String targetName, String[] extras) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4481);
        __CLR4_2_135e35ejp2rxa45.R.inc(4482);return inSpecificScope(targetName, TagsSearchInScope, extras);
        // todo: in mathml namespace: mi, mo, mn, ms, mtext annotation-xml
        // todo: in svg namespace: forignOjbect, desc, title
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean inListItemScope(String targetName) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4483);
        __CLR4_2_135e35ejp2rxa45.R.inc(4484);return inScope(targetName, TagSearchList);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean inButtonScope(String targetName) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4485);
        __CLR4_2_135e35ejp2rxa45.R.inc(4486);return inScope(targetName, TagSearchButton);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean inTableScope(String targetName) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4487);
        __CLR4_2_135e35ejp2rxa45.R.inc(4488);return inSpecificScope(targetName, TagSearchTableScope, null);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean inSelectScope(String targetName) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4489);
        __CLR4_2_135e35ejp2rxa45.R.inc(4490);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4491)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4492)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4493);Element el = stack.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4494);String elName = el.nodeName();
            __CLR4_2_135e35ejp2rxa45.R.inc(4495);if ((((elName.equals(targetName))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4496)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4497)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4498);return true;
            }__CLR4_2_135e35ejp2rxa45.R.inc(4499);if ((((!inSorted(elName, TagSearchSelectScope))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4500)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4501)==0&false))) // all elements except
                {__CLR4_2_135e35ejp2rxa45.R.inc(4502);return false;
        }}
        }__CLR4_2_135e35ejp2rxa45.R.inc(4503);Validate.fail("Should not be reachable");
        __CLR4_2_135e35ejp2rxa45.R.inc(4504);return false;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void setHeadElement(Element headElement) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4505);
        __CLR4_2_135e35ejp2rxa45.R.inc(4506);this.headElement = headElement;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    Element getHeadElement() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4507);
        __CLR4_2_135e35ejp2rxa45.R.inc(4508);return headElement;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean isFosterInserts() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4509);
        __CLR4_2_135e35ejp2rxa45.R.inc(4510);return fosterInserts;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void setFosterInserts(boolean fosterInserts) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4511);
        __CLR4_2_135e35ejp2rxa45.R.inc(4512);this.fosterInserts = fosterInserts;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    FormElement getFormElement() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4513);
        __CLR4_2_135e35ejp2rxa45.R.inc(4514);return formElement;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void setFormElement(FormElement formElement) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4515);
        __CLR4_2_135e35ejp2rxa45.R.inc(4516);this.formElement = formElement;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void newPendingTableCharacters() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4517);
        __CLR4_2_135e35ejp2rxa45.R.inc(4518);pendingTableCharacters = new ArrayList<>();
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    List<String> getPendingTableCharacters() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4519);
        __CLR4_2_135e35ejp2rxa45.R.inc(4520);return pendingTableCharacters;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    /**
     11.2.5.2 Closing elements that have implied end tags<p/>
     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a
     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,
     the UA must pop the current node off the stack of open elements.

     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the
     process, then the UA must perform the above steps as if that element was not in the above list.
     */
    void generateImpliedEndTags(String excludeTag) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4521);
        __CLR4_2_135e35ejp2rxa45.R.inc(4522);while (((((excludeTag != null && !currentElement().nodeName().equals(excludeTag)) &&
                inSorted(currentElement().nodeName(), TagSearchEndTags))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4523)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4524)==0&false)))
            {__CLR4_2_135e35ejp2rxa45.R.inc(4525);pop();
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void generateImpliedEndTags() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4526);
        __CLR4_2_135e35ejp2rxa45.R.inc(4527);generateImpliedEndTags(null);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean isSpecial(Element el) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4528);
        // todo: mathml's mi, mo, mn
        // todo: svg's foreigObject, desc, title
        __CLR4_2_135e35ejp2rxa45.R.inc(4529);String name = el.nodeName();
        __CLR4_2_135e35ejp2rxa45.R.inc(4530);return inSorted(name, TagSearchSpecial);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    Element lastFormattingElement() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4531);
        __CLR4_2_135e35ejp2rxa45.R.inc(4532);return (((formattingElements.size() > 0 )&&(__CLR4_2_135e35ejp2rxa45.R.iget(4533)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4534)==0&false))? formattingElements.get(formattingElements.size()-1) : null;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    Element removeLastFormattingElement() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4535);
        __CLR4_2_135e35ejp2rxa45.R.inc(4536);int size = formattingElements.size();
        __CLR4_2_135e35ejp2rxa45.R.inc(4537);if ((((size > 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4538)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4539)==0&false)))
            {__CLR4_2_135e35ejp2rxa45.R.inc(4540);return formattingElements.remove(size-1);
        }else
            {__CLR4_2_135e35ejp2rxa45.R.inc(4541);return null;
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    // active formatting elements
    void pushActiveFormattingElements(Element in) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4542);
        __CLR4_2_135e35ejp2rxa45.R.inc(4543);int numSeen = 0;
        __CLR4_2_135e35ejp2rxa45.R.inc(4544);for (int pos = formattingElements.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4545)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4546)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4547);Element el = formattingElements.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4548);if ((((el == null)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4549)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4550)==0&false))) // marker
                {__CLR4_2_135e35ejp2rxa45.R.inc(4551);break;

            }__CLR4_2_135e35ejp2rxa45.R.inc(4552);if ((((isSameFormattingElement(in, el))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4553)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4554)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4555);numSeen++;

            }__CLR4_2_135e35ejp2rxa45.R.inc(4556);if ((((numSeen == 3)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4557)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4558)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4559);formattingElements.remove(pos);
                __CLR4_2_135e35ejp2rxa45.R.inc(4560);break;
            }
        }}
        }__CLR4_2_135e35ejp2rxa45.R.inc(4561);formattingElements.add(in);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    private boolean isSameFormattingElement(Element a, Element b) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4562);
        // same if: same namespace, tag, and attributes. Element.equals only checks tag, might in future check children
        __CLR4_2_135e35ejp2rxa45.R.inc(4563);return a.nodeName().equals(b.nodeName()) &&
                // a.namespace().equals(b.namespace()) &&
                a.attributes().equals(b.attributes());
        // todo: namespaces
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void reconstructFormattingElements() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4564);
        __CLR4_2_135e35ejp2rxa45.R.inc(4565);Element last = lastFormattingElement();
        __CLR4_2_135e35ejp2rxa45.R.inc(4566);if ((((last == null || onStack(last))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4567)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4568)==0&false)))
            {__CLR4_2_135e35ejp2rxa45.R.inc(4569);return;

        }__CLR4_2_135e35ejp2rxa45.R.inc(4570);Element entry = last;
        __CLR4_2_135e35ejp2rxa45.R.inc(4571);int size = formattingElements.size();
        __CLR4_2_135e35ejp2rxa45.R.inc(4572);int pos = size - 1;
        __CLR4_2_135e35ejp2rxa45.R.inc(4573);boolean skip = false;
        __CLR4_2_135e35ejp2rxa45.R.inc(4574);while (true) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4575);if ((((pos == 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4576)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4577)==0&false))) {{ // step 4. if none before, skip to 8
                __CLR4_2_135e35ejp2rxa45.R.inc(4578);skip = true;
                __CLR4_2_135e35ejp2rxa45.R.inc(4579);break;
            }
            }__CLR4_2_135e35ejp2rxa45.R.inc(4580);entry = formattingElements.get(--pos); // step 5. one earlier than entry
            __CLR4_2_135e35ejp2rxa45.R.inc(4581);if ((((entry == null || onStack(entry))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4582)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4583)==0&false))) // step 6 - neither marker nor on stack
                {__CLR4_2_135e35ejp2rxa45.R.inc(4584);break; // jump to 8, else continue back to 4
        }}
        }__CLR4_2_135e35ejp2rxa45.R.inc(4585);while(true) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4586);if ((((!skip)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4587)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4588)==0&false))) // step 7: on later than entry
                {__CLR4_2_135e35ejp2rxa45.R.inc(4589);entry = formattingElements.get(++pos);
            }__CLR4_2_135e35ejp2rxa45.R.inc(4590);Validate.notNull(entry); // should not occur, as we break at last element

            // 8. create new element from element, 9 insert into current node, onto stack
            __CLR4_2_135e35ejp2rxa45.R.inc(4591);skip = false; // can only skip increment from 4.
            __CLR4_2_135e35ejp2rxa45.R.inc(4592);Element newEl = insertStartTag(entry.nodeName()); // todo: avoid fostering here?
            // newEl.namespace(entry.namespace()); // todo: namespaces
            __CLR4_2_135e35ejp2rxa45.R.inc(4593);newEl.attributes().addAll(entry.attributes());

            // 10. replace entry with new entry
            __CLR4_2_135e35ejp2rxa45.R.inc(4594);formattingElements.set(pos, newEl);

            // 11
            __CLR4_2_135e35ejp2rxa45.R.inc(4595);if ((((pos == size-1)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4596)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4597)==0&false))) // if not last entry in list, jump to 7
                {__CLR4_2_135e35ejp2rxa45.R.inc(4598);break;
        }}
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void clearFormattingElementsToLastMarker() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4599);
        __CLR4_2_135e35ejp2rxa45.R.inc(4600);while ((((!formattingElements.isEmpty())&&(__CLR4_2_135e35ejp2rxa45.R.iget(4601)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4602)==0&false))) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4603);Element el = removeLastFormattingElement();
            __CLR4_2_135e35ejp2rxa45.R.inc(4604);if ((((el == null)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4605)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4606)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4607);break;
        }}
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void removeFromActiveFormattingElements(Element el) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4608);
        __CLR4_2_135e35ejp2rxa45.R.inc(4609);for (int pos = formattingElements.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4610)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4611)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4612);Element next = formattingElements.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4613);if ((((next == el)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4614)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4615)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4616);formattingElements.remove(pos);
                __CLR4_2_135e35ejp2rxa45.R.inc(4617);break;
            }
        }}
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    boolean isInActiveFormattingElements(Element el) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4618);
        __CLR4_2_135e35ejp2rxa45.R.inc(4619);return isElementInQueue(formattingElements, el);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    Element getActiveFormattingElement(String nodeName) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4620);
        __CLR4_2_135e35ejp2rxa45.R.inc(4621);for (int pos = formattingElements.size() -1; (((pos >= 0)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4622)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4623)==0&false)); pos--) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4624);Element next = formattingElements.get(pos);
            __CLR4_2_135e35ejp2rxa45.R.inc(4625);if ((((next == null)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4626)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4627)==0&false))) // scope marker
                {__CLR4_2_135e35ejp2rxa45.R.inc(4628);break;
            }else {__CLR4_2_135e35ejp2rxa45.R.inc(4629);if ((((next.nodeName().equals(nodeName))&&(__CLR4_2_135e35ejp2rxa45.R.iget(4630)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4631)==0&false)))
                {__CLR4_2_135e35ejp2rxa45.R.inc(4632);return next;
        }}}
        }__CLR4_2_135e35ejp2rxa45.R.inc(4633);return null;
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void replaceActiveFormattingElement(Element out, Element in) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4634);
        __CLR4_2_135e35ejp2rxa45.R.inc(4635);replaceInQueue(formattingElements, out, in);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void insertMarkerToFormattingElements() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4636);
        __CLR4_2_135e35ejp2rxa45.R.inc(4637);formattingElements.add(null);
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    void insertInFosterParent(Node in) {try{__CLR4_2_135e35ejp2rxa45.R.inc(4638);
        __CLR4_2_135e35ejp2rxa45.R.inc(4639);Element fosterParent;
        __CLR4_2_135e35ejp2rxa45.R.inc(4640);Element lastTable = getFromStack("table");
        __CLR4_2_135e35ejp2rxa45.R.inc(4641);boolean isLastTableParent = false;
        __CLR4_2_135e35ejp2rxa45.R.inc(4642);if ((((lastTable != null)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4643)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4644)==0&false))) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4645);if ((((lastTable.parent() != null)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4646)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4647)==0&false))) {{
                __CLR4_2_135e35ejp2rxa45.R.inc(4648);fosterParent = lastTable.parent();
                __CLR4_2_135e35ejp2rxa45.R.inc(4649);isLastTableParent = true;
            } }else
                {__CLR4_2_135e35ejp2rxa45.R.inc(4650);fosterParent = aboveOnStack(lastTable);
        }} }else {{ // no table == frag
            __CLR4_2_135e35ejp2rxa45.R.inc(4651);fosterParent = stack.get(0);
        }

        }__CLR4_2_135e35ejp2rxa45.R.inc(4652);if ((((isLastTableParent)&&(__CLR4_2_135e35ejp2rxa45.R.iget(4653)!=0|true))||(__CLR4_2_135e35ejp2rxa45.R.iget(4654)==0&false))) {{
            __CLR4_2_135e35ejp2rxa45.R.inc(4655);Validate.notNull(lastTable); // last table cannot be null by this point.
            __CLR4_2_135e35ejp2rxa45.R.inc(4656);lastTable.before(in);
        }
        }else
            {__CLR4_2_135e35ejp2rxa45.R.inc(4657);fosterParent.appendChild(in);
    }}finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_135e35ejp2rxa45.R.inc(4658);
        __CLR4_2_135e35ejp2rxa45.R.inc(4659);return "TreeBuilder{" +
                "currentToken=" + currentToken +
                ", state=" + state +
                ", currentElement=" + currentElement() +
                '}';
    }finally{__CLR4_2_135e35ejp2rxa45.R.flushNeeded();}}
}
