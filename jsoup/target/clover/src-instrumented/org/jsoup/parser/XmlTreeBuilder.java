/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

/**
 * Use the {@code XmlTreeBuilder} when you want to parse XML without any of the HTML DOM rules being applied to the
 * document.
 * <p>Usage example: {@code Document xmlDoc = Jsoup.parse(html, baseUrl, Parser.xmlParser());}</p>
 *
 * @author Jonathan Hedley
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class XmlTreeBuilder extends TreeBuilder {public static class __CLR4_2_16rv6rvjpaexqq8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,8878,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ParseSettings defaultSettings() {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8779);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8780);return ParseSettings.preserveCase;
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8781);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8782);super.initialiseParse(input, baseUri, parser);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8783);stack.add(doc); // place the document onto the stack. differs from HtmlTreeBuilder (not on stack)
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8784);doc.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}

    Document parse(Reader input, String baseUri) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8785);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8786);return parse(input, baseUri, new Parser(this));
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}

    Document parse(String input, String baseUri) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8787);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8788);return parse(new StringReader(input), baseUri, new Parser(this));
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}

    @Override
    protected boolean process(Token token) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8789);
        // start tag, end tag, doctype, comment, character, eof
        boolean __CLB4_2_1_bool0=false;__CLR4_2_16rv6rvjpaexqq8.R.inc(8790);switch (token.type) {
            case StartTag:if (!__CLB4_2_1_bool0) {__CLR4_2_16rv6rvjpaexqq8.R.inc(8791);__CLB4_2_1_bool0=true;}
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8792);insert(token.asStartTag());
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8793);break;
            case EndTag:if (!__CLB4_2_1_bool0) {__CLR4_2_16rv6rvjpaexqq8.R.inc(8794);__CLB4_2_1_bool0=true;}
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8795);popStackToClose(token.asEndTag());
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8796);break;
            case Comment:if (!__CLB4_2_1_bool0) {__CLR4_2_16rv6rvjpaexqq8.R.inc(8797);__CLB4_2_1_bool0=true;}
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8798);insert(token.asComment());
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8799);break;
            case Character:if (!__CLB4_2_1_bool0) {__CLR4_2_16rv6rvjpaexqq8.R.inc(8800);__CLB4_2_1_bool0=true;}
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8801);insert(token.asCharacter());
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8802);break;
            case Doctype:if (!__CLB4_2_1_bool0) {__CLR4_2_16rv6rvjpaexqq8.R.inc(8803);__CLB4_2_1_bool0=true;}
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8804);insert(token.asDoctype());
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8805);break;
            case EOF:if (!__CLB4_2_1_bool0) {__CLR4_2_16rv6rvjpaexqq8.R.inc(8806);__CLB4_2_1_bool0=true;} // could put some normalisation here if desired
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8807);break;
            default:if (!__CLB4_2_1_bool0) {__CLR4_2_16rv6rvjpaexqq8.R.inc(8808);__CLB4_2_1_bool0=true;}
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8809);Validate.fail("Unexpected token type: " + token.type);
        }
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8810);return true;
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}

    private void insertNode(Node node) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8811);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8812);currentElement().appendChild(node);
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}

    Element insert(Token.StartTag startTag) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8813);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8814);Tag tag = Tag.valueOf(startTag.name(), settings);
        // todo: wonder if for xml parsing, should treat all tags as unknown? because it's not html.
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8815);Element el = new Element(tag, baseUri, settings.normalizeAttributes(startTag.attributes));
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8816);insertNode(el);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8817);if ((((startTag.isSelfClosing())&&(__CLR4_2_16rv6rvjpaexqq8.R.iget(8818)!=0|true))||(__CLR4_2_16rv6rvjpaexqq8.R.iget(8819)==0&false))) {{
            __CLR4_2_16rv6rvjpaexqq8.R.inc(8820);if ((((!tag.isKnownTag())&&(__CLR4_2_16rv6rvjpaexqq8.R.iget(8821)!=0|true))||(__CLR4_2_16rv6rvjpaexqq8.R.iget(8822)==0&false))) // unknown tag, remember this is self closing for output. see above.
                {__CLR4_2_16rv6rvjpaexqq8.R.inc(8823);tag.setSelfClosing();
        }} }else {{
            __CLR4_2_16rv6rvjpaexqq8.R.inc(8824);stack.add(el);
        }
        }__CLR4_2_16rv6rvjpaexqq8.R.inc(8825);return el;
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}

    void insert(Token.Comment commentToken) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8826);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8827);Comment comment = new Comment(commentToken.getData());
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8828);Node insert = comment;
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8829);if ((((commentToken.bogus && comment.isXmlDeclaration())&&(__CLR4_2_16rv6rvjpaexqq8.R.iget(8830)!=0|true))||(__CLR4_2_16rv6rvjpaexqq8.R.iget(8831)==0&false))) {{
            // xml declarations are emitted as bogus comments (which is right for html, but not xml)
            // so we do a bit of a hack and parse the data as an element to pull the attributes out
            __CLR4_2_16rv6rvjpaexqq8.R.inc(8832);XmlDeclaration decl = comment.asXmlDeclaration(); // else, we couldn't parse it as a decl, so leave as a comment
            __CLR4_2_16rv6rvjpaexqq8.R.inc(8833);if ((((decl != null)&&(__CLR4_2_16rv6rvjpaexqq8.R.iget(8834)!=0|true))||(__CLR4_2_16rv6rvjpaexqq8.R.iget(8835)==0&false)))
                {__CLR4_2_16rv6rvjpaexqq8.R.inc(8836);insert = decl;
        }}
        }__CLR4_2_16rv6rvjpaexqq8.R.inc(8837);insertNode(insert);
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}

    void insert(Token.Character token) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8838);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8839);final String data = token.getData();
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8840);insertNode((((token.isCData() )&&(__CLR4_2_16rv6rvjpaexqq8.R.iget(8841)!=0|true))||(__CLR4_2_16rv6rvjpaexqq8.R.iget(8842)==0&false))? new CDataNode(data) : new TextNode(data));
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}

    void insert(Token.Doctype d) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8843);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8844);DocumentType doctypeNode = new DocumentType(settings.normalizeTag(d.getName()), d.getPublicIdentifier(), d.getSystemIdentifier());
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8845);doctypeNode.setPubSysKey(d.getPubSysKey());
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8846);insertNode(doctypeNode);
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}

    /**
     * If the stack contains an element with this tag's name, pop up the stack to remove the first occurrence. If not
     * found, skips.
     *
     * @param endTag tag to close
     */
    private void popStackToClose(Token.EndTag endTag) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8847);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8848);String elName = settings.normalizeTag(endTag.tagName);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8849);Element firstFound = null;

        __CLR4_2_16rv6rvjpaexqq8.R.inc(8850);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_16rv6rvjpaexqq8.R.iget(8851)!=0|true))||(__CLR4_2_16rv6rvjpaexqq8.R.iget(8852)==0&false)); pos--) {{
            __CLR4_2_16rv6rvjpaexqq8.R.inc(8853);Element next = stack.get(pos);
            __CLR4_2_16rv6rvjpaexqq8.R.inc(8854);if ((((next.nodeName().equals(elName))&&(__CLR4_2_16rv6rvjpaexqq8.R.iget(8855)!=0|true))||(__CLR4_2_16rv6rvjpaexqq8.R.iget(8856)==0&false))) {{
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8857);firstFound = next;
                __CLR4_2_16rv6rvjpaexqq8.R.inc(8858);break;
            }
        }}
        }__CLR4_2_16rv6rvjpaexqq8.R.inc(8859);if ((((firstFound == null)&&(__CLR4_2_16rv6rvjpaexqq8.R.iget(8860)!=0|true))||(__CLR4_2_16rv6rvjpaexqq8.R.iget(8861)==0&false)))
            {__CLR4_2_16rv6rvjpaexqq8.R.inc(8862);return; // not found, skip

        }__CLR4_2_16rv6rvjpaexqq8.R.inc(8863);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_16rv6rvjpaexqq8.R.iget(8864)!=0|true))||(__CLR4_2_16rv6rvjpaexqq8.R.iget(8865)==0&false)); pos--) {{
            __CLR4_2_16rv6rvjpaexqq8.R.inc(8866);Element next = stack.get(pos);
            __CLR4_2_16rv6rvjpaexqq8.R.inc(8867);stack.remove(pos);
            __CLR4_2_16rv6rvjpaexqq8.R.inc(8868);if ((((next == firstFound)&&(__CLR4_2_16rv6rvjpaexqq8.R.iget(8869)!=0|true))||(__CLR4_2_16rv6rvjpaexqq8.R.iget(8870)==0&false)))
                {__CLR4_2_16rv6rvjpaexqq8.R.inc(8871);break;
        }}
    }}finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}


    List<Node> parseFragment(String inputFragment, String baseUri, Parser parser) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8872);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8873);initialiseParse(new StringReader(inputFragment), baseUri, parser);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8874);runParser();
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8875);return doc.childNodes();
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}

    List<Node> parseFragment(String inputFragment, Element context, String baseUri, Parser parser) {try{__CLR4_2_16rv6rvjpaexqq8.R.inc(8876);
        __CLR4_2_16rv6rvjpaexqq8.R.inc(8877);return parseFragment(inputFragment, baseUri, parser);
    }finally{__CLR4_2_16rv6rvjpaexqq8.R.flushNeeded();}}
}
