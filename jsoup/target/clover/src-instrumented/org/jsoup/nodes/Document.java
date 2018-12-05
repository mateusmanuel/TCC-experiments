/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 A HTML Document.

 @author Jonathan Hedley, jonathan@hedley.net */
public class Document extends Element {public static class __CLR4_2_11jb1jbjpaexqe7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,2231,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private OutputSettings outputSettings = new OutputSettings();
    private Parser parser; // the parser used to parse this document
    private QuirksMode quirksMode = QuirksMode.noQuirks;
    private String location;
    private boolean updateMetaCharset = false;

    /**
     Create a new, empty Document.
     @param baseUri base URI of document
     @see org.jsoup.Jsoup#parse
     @see #createShell
     */
    public Document(String baseUri) {
        super(Tag.valueOf("#root", ParseSettings.htmlDefault), baseUri);__CLR4_2_11jb1jbjpaexqe7.R.inc(1992);try{__CLR4_2_11jb1jbjpaexqe7.R.inc(1991);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(1993);this.location = baseUri;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    /**
     Create a valid, empty shell of a document, suitable for adding more elements to.
     @param baseUri baseUri of document
     @return document with html, head, and body elements.
     */
    public static Document createShell(String baseUri) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(1994);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(1995);Validate.notNull(baseUri);

        __CLR4_2_11jb1jbjpaexqe7.R.inc(1996);Document doc = new Document(baseUri);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(1997);doc.parser = doc.parser();
        __CLR4_2_11jb1jbjpaexqe7.R.inc(1998);Element html = doc.appendElement("html");
        __CLR4_2_11jb1jbjpaexqe7.R.inc(1999);html.appendElement("head");
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2000);html.appendElement("body");

        __CLR4_2_11jb1jbjpaexqe7.R.inc(2001);return doc;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    /**
     * Get the URL this Document was parsed from. If the starting URL is a redirect,
     * this will return the final URL from which the document was served from.
     * @return location
     */
    public String location() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2002);
     __CLR4_2_11jb1jbjpaexqe7.R.inc(2003);return location;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
    
    /**
     Accessor to the document's {@code head} element.
     @return {@code head}
     */
    public Element head() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2004);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2005);return findFirstElementByTagName("head", this);
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    /**
     Accessor to the document's {@code body} element.
     @return {@code body}
     */
    public Element body() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2006);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2007);return findFirstElementByTagName("body", this);
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    /**
     Get the string contents of the document's {@code title} element.
     @return Trimmed title, or empty string if none set.
     */
    public String title() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2008);
        // title is a preserve whitespace tag (for document output), but normalised here
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2009);Element titleEl = getElementsByTag("title").first();
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2010);return (((titleEl != null )&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2011)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2012)==0&false))? StringUtil.normaliseWhitespace(titleEl.text()).trim() : "";
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    /**
     Set the document's {@code title} element. Updates the existing element, or adds {@code title} to {@code head} if
     not present
     @param title string to set as title
     */
    public void title(String title) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2013);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2014);Validate.notNull(title);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2015);Element titleEl = getElementsByTag("title").first();
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2016);if ((((titleEl == null)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2017)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2018)==0&false))) {{ // add to head
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2019);head().appendElement("title").text(title);
        } }else {{
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2020);titleEl.text(title);
        }
    }}finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    /**
     Create a new Element, with this document's base uri. Does not make the new element a child of this document.
     @param tagName element tag name (e.g. {@code a})
     @return new element
     */
    public Element createElement(String tagName) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2021);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2022);return new Element(Tag.valueOf(tagName, ParseSettings.preserveCase), this.baseUri());
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    /**
     Normalise the document. This happens after the parse phase so generally does not need to be called.
     Moves any text content that is not in the body element into the body.
     @return this document after normalisation
     */
    public Document normalise() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2023);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2024);Element htmlEl = findFirstElementByTagName("html", this);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2025);if ((((htmlEl == null)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2026)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2027)==0&false)))
            {__CLR4_2_11jb1jbjpaexqe7.R.inc(2028);htmlEl = appendElement("html");
        }__CLR4_2_11jb1jbjpaexqe7.R.inc(2029);if ((((head() == null)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2030)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2031)==0&false)))
            {__CLR4_2_11jb1jbjpaexqe7.R.inc(2032);htmlEl.prependElement("head");
        }__CLR4_2_11jb1jbjpaexqe7.R.inc(2033);if ((((body() == null)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2034)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2035)==0&false)))
            {__CLR4_2_11jb1jbjpaexqe7.R.inc(2036);htmlEl.appendElement("body");

        // pull text nodes out of root, html, and head els, and push into body. non-text nodes are already taken care
        // of. do in inverse order to maintain text order.
        }__CLR4_2_11jb1jbjpaexqe7.R.inc(2037);normaliseTextNodes(head());
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2038);normaliseTextNodes(htmlEl);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2039);normaliseTextNodes(this);

        __CLR4_2_11jb1jbjpaexqe7.R.inc(2040);normaliseStructure("head", htmlEl);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2041);normaliseStructure("body", htmlEl);
        
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2042);ensureMetaCharsetElement();
        
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2043);return this;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    // does not recurse.
    private void normaliseTextNodes(Element element) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2044);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2045);List<Node> toMove = new ArrayList<>();
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2046);for (Node node: element.childNodes) {{
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2047);if ((((node instanceof TextNode)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2048)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2049)==0&false))) {{
                __CLR4_2_11jb1jbjpaexqe7.R.inc(2050);TextNode tn = (TextNode) node;
                __CLR4_2_11jb1jbjpaexqe7.R.inc(2051);if ((((!tn.isBlank())&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2052)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2053)==0&false)))
                    {__CLR4_2_11jb1jbjpaexqe7.R.inc(2054);toMove.add(tn);
            }}
        }}

        }__CLR4_2_11jb1jbjpaexqe7.R.inc(2055);for (int i = toMove.size()-1; (((i >= 0)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2056)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2057)==0&false)); i--) {{
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2058);Node node = toMove.get(i);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2059);element.removeChild(node);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2060);body().prependChild(new TextNode(" "));
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2061);body().prependChild(node);
        }
    }}finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    // merge multiple <head> or <body> contents into one, delete the remainder, and ensure they are owned by <html>
    private void normaliseStructure(String tag, Element htmlEl) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2062);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2063);Elements elements = this.getElementsByTag(tag);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2064);Element master = elements.first(); // will always be available as created above if not existent
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2065);if ((((elements.size() > 1)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2066)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2067)==0&false))) {{ // dupes, move contents to master
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2068);List<Node> toMove = new ArrayList<>();
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2069);for (int i = 1; (((i < elements.size())&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2070)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2071)==0&false)); i++) {{
                __CLR4_2_11jb1jbjpaexqe7.R.inc(2072);Node dupe = elements.get(i);
                __CLR4_2_11jb1jbjpaexqe7.R.inc(2073);toMove.addAll(dupe.ensureChildNodes());
                __CLR4_2_11jb1jbjpaexqe7.R.inc(2074);dupe.remove();
            }

            }__CLR4_2_11jb1jbjpaexqe7.R.inc(2075);for (Node dupe : toMove)
                {__CLR4_2_11jb1jbjpaexqe7.R.inc(2076);master.appendChild(dupe);
        }}
        // ensure parented by <html>
        }__CLR4_2_11jb1jbjpaexqe7.R.inc(2077);if ((((!master.parent().equals(htmlEl))&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2078)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2079)==0&false))) {{
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2080);htmlEl.appendChild(master); // includes remove()            
        }
    }}finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    // fast method to get first by tag name, used for html, head, body finders
    private Element findFirstElementByTagName(String tag, Node node) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2081);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2082);if ((((node.nodeName().equals(tag))&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2083)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2084)==0&false)))
            {__CLR4_2_11jb1jbjpaexqe7.R.inc(2085);return (Element) node;
        }else {{
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2086);int size = node.childNodeSize();
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2087);for (int i = 0; (((i < size)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2088)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2089)==0&false)); i++) {{
                __CLR4_2_11jb1jbjpaexqe7.R.inc(2090);Element found = findFirstElementByTagName(tag, node.childNode(i));
                __CLR4_2_11jb1jbjpaexqe7.R.inc(2091);if ((((found != null)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2092)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2093)==0&false)))
                    {__CLR4_2_11jb1jbjpaexqe7.R.inc(2094);return found;
            }}
        }}
        }__CLR4_2_11jb1jbjpaexqe7.R.inc(2095);return null;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    @Override
    public String outerHtml() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2096);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2097);return super.html(); // no outer wrapper tag
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    /**
     Set the text of the {@code body} of this document. Any existing nodes within the body will be cleared.
     @param text unencoded text
     @return this document
     */
    @Override
    public Element text(String text) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2098);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2099);body().text(text); // overridden to not nuke doc structure
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2100);return this;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    @Override
    public String nodeName() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2101);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2102);return "#document";
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
    
    /**
     * Sets the charset used in this document. This method is equivalent
     * to {@link OutputSettings#charset(java.nio.charset.Charset)
     * OutputSettings.charset(Charset)} but in addition it updates the
     * charset / encoding element within the document.
     * 
     * <p>This enables
     * {@link #updateMetaCharsetElement(boolean) meta charset update}.</p>
     * 
     * <p>If there's no element with charset / encoding information yet it will
     * be created. Obsolete charset / encoding definitions are removed!</p>
     * 
     * <p><b>Elements used:</b></p>
     * 
     * <ul>
     * <li><b>Html:</b> <i>&lt;meta charset="CHARSET"&gt;</i></li>
     * <li><b>Xml:</b> <i>&lt;?xml version="1.0" encoding="CHARSET"&gt;</i></li>
     * </ul>
     * 
     * @param charset Charset
     * 
     * @see #updateMetaCharsetElement(boolean) 
     * @see OutputSettings#charset(java.nio.charset.Charset) 
     */
    public void charset(Charset charset) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2103);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2104);updateMetaCharsetElement(true);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2105);outputSettings.charset(charset);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2106);ensureMetaCharsetElement();
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
    
    /**
     * Returns the charset used in this document. This method is equivalent
     * to {@link OutputSettings#charset()}.
     * 
     * @return Current Charset
     * 
     * @see OutputSettings#charset() 
     */
    public Charset charset() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2107);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2108);return outputSettings.charset();
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
    
    /**
     * Sets whether the element with charset information in this document is
     * updated on changes through {@link #charset(java.nio.charset.Charset)
     * Document.charset(Charset)} or not.
     * 
     * <p>If set to <tt>false</tt> <i>(default)</i> there are no elements
     * modified.</p>
     * 
     * @param update If <tt>true</tt> the element updated on charset
     * changes, <tt>false</tt> if not
     * 
     * @see #charset(java.nio.charset.Charset) 
     */
    public void updateMetaCharsetElement(boolean update) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2109);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2110);this.updateMetaCharset = update;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
    
    /**
     * Returns whether the element with charset information in this document is
     * updated on changes through {@link #charset(java.nio.charset.Charset)
     * Document.charset(Charset)} or not.
     * 
     * @return Returns <tt>true</tt> if the element is updated on charset
     * changes, <tt>false</tt> if not
     */
    public boolean updateMetaCharsetElement() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2111);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2112);return updateMetaCharset;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    @Override
    public Document clone() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2113);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2114);Document clone = (Document) super.clone();
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2115);clone.outputSettings = this.outputSettings.clone();
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2116);return clone;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
    
    /**
     * Ensures a meta charset (html) or xml declaration (xml) with the current
     * encoding used. This only applies with
     * {@link #updateMetaCharsetElement(boolean) updateMetaCharset} set to
     * <tt>true</tt>, otherwise this method does nothing.
     * 
     * <ul>
     * <li>An existing element gets updated with the current charset</li>
     * <li>If there's no element yet it will be inserted</li>
     * <li>Obsolete elements are removed</li>
     * </ul>
     * 
     * <p><b>Elements used:</b></p>
     * 
     * <ul>
     * <li><b>Html:</b> <i>&lt;meta charset="CHARSET"&gt;</i></li>
     * <li><b>Xml:</b> <i>&lt;?xml version="1.0" encoding="CHARSET"&gt;</i></li>
     * </ul>
     */
    private void ensureMetaCharsetElement() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2117);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2118);if ((((updateMetaCharset)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2119)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2120)==0&false))) {{
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2121);OutputSettings.Syntax syntax = outputSettings().syntax();

            __CLR4_2_11jb1jbjpaexqe7.R.inc(2122);if ((((syntax == OutputSettings.Syntax.html)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2123)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2124)==0&false))) {{
                __CLR4_2_11jb1jbjpaexqe7.R.inc(2125);Element metaCharset = select("meta[charset]").first();

                __CLR4_2_11jb1jbjpaexqe7.R.inc(2126);if ((((metaCharset != null)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2127)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2128)==0&false))) {{
                    __CLR4_2_11jb1jbjpaexqe7.R.inc(2129);metaCharset.attr("charset", charset().displayName());
                } }else {{
                    __CLR4_2_11jb1jbjpaexqe7.R.inc(2130);Element head = head();

                    __CLR4_2_11jb1jbjpaexqe7.R.inc(2131);if ((((head != null)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2132)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2133)==0&false))) {{
                        __CLR4_2_11jb1jbjpaexqe7.R.inc(2134);head.appendElement("meta").attr("charset", charset().displayName());
                    }
                }}

                // Remove obsolete elements
                }__CLR4_2_11jb1jbjpaexqe7.R.inc(2135);select("meta[name=charset]").remove();
            } }else {__CLR4_2_11jb1jbjpaexqe7.R.inc(2136);if ((((syntax == OutputSettings.Syntax.xml)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2137)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2138)==0&false))) {{
                __CLR4_2_11jb1jbjpaexqe7.R.inc(2139);Node node = childNodes().get(0);

                __CLR4_2_11jb1jbjpaexqe7.R.inc(2140);if ((((node instanceof XmlDeclaration)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2141)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2142)==0&false))) {{
                    __CLR4_2_11jb1jbjpaexqe7.R.inc(2143);XmlDeclaration decl = (XmlDeclaration) node;

                    __CLR4_2_11jb1jbjpaexqe7.R.inc(2144);if ((((decl.name().equals("xml"))&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2145)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2146)==0&false))) {{
                        __CLR4_2_11jb1jbjpaexqe7.R.inc(2147);decl.attr("encoding", charset().displayName());

                        __CLR4_2_11jb1jbjpaexqe7.R.inc(2148);final String version = decl.attr("version");

                        __CLR4_2_11jb1jbjpaexqe7.R.inc(2149);if ((((version != null)&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2150)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2151)==0&false))) {{
                            __CLR4_2_11jb1jbjpaexqe7.R.inc(2152);decl.attr("version", "1.0");
                        }
                    }} }else {{
                        __CLR4_2_11jb1jbjpaexqe7.R.inc(2153);decl = new XmlDeclaration("xml", false);
                        __CLR4_2_11jb1jbjpaexqe7.R.inc(2154);decl.attr("version", "1.0");
                        __CLR4_2_11jb1jbjpaexqe7.R.inc(2155);decl.attr("encoding", charset().displayName());

                        __CLR4_2_11jb1jbjpaexqe7.R.inc(2156);prependChild(decl);
                    }
                }} }else {{
                    __CLR4_2_11jb1jbjpaexqe7.R.inc(2157);XmlDeclaration decl = new XmlDeclaration("xml", false);
                    __CLR4_2_11jb1jbjpaexqe7.R.inc(2158);decl.attr("version", "1.0");
                    __CLR4_2_11jb1jbjpaexqe7.R.inc(2159);decl.attr("encoding", charset().displayName());

                    __CLR4_2_11jb1jbjpaexqe7.R.inc(2160);prependChild(decl);
                }
            }}
        }}}
    }}finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
    

    /**
     * A Document's output settings control the form of the text() and html() methods.
     */
    public static class OutputSettings implements Cloneable {
        /**
         * The output serialization syntax.
         */
        public enum Syntax {html, xml}

        private Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        private Charset charset;
        private ThreadLocal<CharsetEncoder> encoderThreadLocal = new ThreadLocal<>(); // initialized by start of OuterHtmlVisitor
        Entities.CoreCharset coreCharset; // fast encoders for ascii and utf8

        private boolean prettyPrint = true;
        private boolean outline = false;
        private int indentAmount = 1;
        private Syntax syntax = Syntax.html;

        public OutputSettings() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2161);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2162);charset(Charset.forName("UTF8"));
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
        
        /**
         * Get the document's current HTML escape mode: <code>base</code>, which provides a limited set of named HTML
         * entities and escapes other characters as numbered entities for maximum compatibility; or <code>extended</code>,
         * which uses the complete set of HTML named entities.
         * <p>
         * The default escape mode is <code>base</code>.
         * @return the document's current escape mode
         */
        public Entities.EscapeMode escapeMode() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2163);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2164);return escapeMode;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        /**
         * Set the document's escape mode, which determines how characters are escaped when the output character set
         * does not support a given character:- using either a named or a numbered escape.
         * @param escapeMode the new escape mode to use
         * @return the document's output settings, for chaining
         */
        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2165);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2166);this.escapeMode = escapeMode;
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2167);return this;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        /**
         * Get the document's current output charset, which is used to control which characters are escaped when
         * generating HTML (via the <code>html()</code> methods), and which are kept intact.
         * <p>
         * Where possible (when parsing from a URL or File), the document's output charset is automatically set to the
         * input charset. Otherwise, it defaults to UTF-8.
         * @return the document's current charset.
         */
        public Charset charset() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2168);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2169);return charset;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        /**
         * Update the document's output charset.
         * @param charset the new charset to use.
         * @return the document's output settings, for chaining
         */
        public OutputSettings charset(Charset charset) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2170);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2171);this.charset = charset;
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2172);return this;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        /**
         * Update the document's output charset.
         * @param charset the new charset (by name) to use.
         * @return the document's output settings, for chaining
         */
        public OutputSettings charset(String charset) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2173);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2174);charset(Charset.forName(charset));
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2175);return this;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        CharsetEncoder prepareEncoder() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2176);
            // created at start of OuterHtmlVisitor so each pass has own encoder, so OutputSettings can be shared among threads
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2177);CharsetEncoder encoder = charset.newEncoder();
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2178);encoderThreadLocal.set(encoder);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2179);coreCharset = Entities.CoreCharset.byName(encoder.charset().name());
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2180);return encoder;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        CharsetEncoder encoder() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2181);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2182);CharsetEncoder encoder = encoderThreadLocal.get();
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2183);return (((encoder != null )&&(__CLR4_2_11jb1jbjpaexqe7.R.iget(2184)!=0|true))||(__CLR4_2_11jb1jbjpaexqe7.R.iget(2185)==0&false))? encoder : prepareEncoder();
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        /**
         * Get the document's current output syntax.
         * @return current syntax
         */
        public Syntax syntax() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2186);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2187);return syntax;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        /**
         * Set the document's output syntax. Either {@code html}, with empty tags and boolean attributes (etc), or
         * {@code xml}, with self-closing tags.
         * @param syntax serialization syntax
         * @return the document's output settings, for chaining
         */
        public OutputSettings syntax(Syntax syntax) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2188);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2189);this.syntax = syntax;
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2190);return this;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        /**
         * Get if pretty printing is enabled. Default is true. If disabled, the HTML output methods will not re-format
         * the output, and the output will generally look like the input.
         * @return if pretty printing is enabled.
         */
        public boolean prettyPrint() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2191);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2192);return prettyPrint;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        /**
         * Enable or disable pretty printing.
         * @param pretty new pretty print setting
         * @return this, for chaining
         */
        public OutputSettings prettyPrint(boolean pretty) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2193);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2194);prettyPrint = pretty;
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2195);return this;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
        
        /**
         * Get if outline mode is enabled. Default is false. If enabled, the HTML output methods will consider
         * all tags as block.
         * @return if outline mode is enabled.
         */
        public boolean outline() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2196);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2197);return outline;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
        
        /**
         * Enable or disable HTML outline mode.
         * @param outlineMode new outline setting
         * @return this, for chaining
         */
        public OutputSettings outline(boolean outlineMode) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2198);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2199);outline = outlineMode;
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2200);return this;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        /**
         * Get the current tag indent amount, used when pretty printing.
         * @return the current indent amount
         */
        public int indentAmount() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2201);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2202);return indentAmount;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        /**
         * Set the indent amount for pretty printing
         * @param indentAmount number of spaces to use for indenting each level. Must be {@literal >=} 0.
         * @return this, for chaining
         */
        public OutputSettings indentAmount(int indentAmount) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2203);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2204);Validate.isTrue(indentAmount >= 0);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2205);this.indentAmount = indentAmount;
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2206);return this;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

        @Override
        public OutputSettings clone() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2207);
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2208);OutputSettings clone;
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2209);try {
                __CLR4_2_11jb1jbjpaexqe7.R.inc(2210);clone = (OutputSettings) super.clone();
            } catch (CloneNotSupportedException e) {
                __CLR4_2_11jb1jbjpaexqe7.R.inc(2211);throw new RuntimeException(e);
            }
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2212);clone.charset(charset.name()); // new charset and charset encoder
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2213);clone.escapeMode = Entities.EscapeMode.valueOf(escapeMode.name());
            // indentAmount, prettyPrint are primitives so object.clone() will handle
            __CLR4_2_11jb1jbjpaexqe7.R.inc(2214);return clone;
        }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
    }

    /**
     * Get the document's current output settings.
     * @return the document's current output settings.
     */
    public OutputSettings outputSettings() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2215);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2216);return outputSettings;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    /**
     * Set the document's output settings.
     * @param outputSettings new output settings.
     * @return this document, for chaining.
     */
    public Document outputSettings(OutputSettings outputSettings) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2217);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2218);Validate.notNull(outputSettings);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2219);this.outputSettings = outputSettings;
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2220);return this;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    public enum QuirksMode {
        noQuirks, quirks, limitedQuirks
    }

    public QuirksMode quirksMode() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2221);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2222);return quirksMode;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    public Document quirksMode(QuirksMode quirksMode) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2223);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2224);this.quirksMode = quirksMode;
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2225);return this;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    /**
     * Get the parser that was used to parse this document.
     * @return the parser
     */
    public Parser parser() {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2226);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2227);return parser;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}

    /**
     * Set the parser used to create this document. This parser is then used when further parsing within this document
     * is required.
     * @param parser the configured parser to use when further parsing is required for this document.
     * @return this document, for chaining.
     */
    public Document parser(Parser parser) {try{__CLR4_2_11jb1jbjpaexqe7.R.inc(2228);
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2229);this.parser = parser;
        __CLR4_2_11jb1jbjpaexqe7.R.inc(2230);return this;
    }finally{__CLR4_2_11jb1jbjpaexqe7.R.flushNeeded();}}
}
