/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.List;


/**
 The whitelist based HTML cleaner. Use to ensure that end-user provided HTML contains only the elements and attributes
 that you are expecting; no junk, and no cross-site scripting attacks!
 <p>
 The HTML cleaner parses the input as HTML and then runs it through a white-list, so the output HTML can only contain
 HTML that is allowed by the whitelist.
 </p>
 <p>
 It is assumed that the input HTML is a body fragment; the clean methods only pull from the source's body, and the
 canned white-lists only allow body contained tags.
 </p>
 <p>
 Rather than interacting directly with a Cleaner object, generally see the {@code clean} methods in {@link org.jsoup.Jsoup}.
 </p>
 */
public class Cleaner {public static class __CLR4_2_16um6umjpaexqqh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,8962,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Whitelist whitelist;

    /**
     Create a new cleaner, that sanitizes documents using the supplied whitelist.
     @param whitelist white-list to clean with
     */
    public Cleaner(Whitelist whitelist) {try{__CLR4_2_16um6umjpaexqqh.R.inc(8878);
        __CLR4_2_16um6umjpaexqqh.R.inc(8879);Validate.notNull(whitelist);
        __CLR4_2_16um6umjpaexqqh.R.inc(8880);this.whitelist = whitelist;
    }finally{__CLR4_2_16um6umjpaexqqh.R.flushNeeded();}}

    /**
     Creates a new, clean document, from the original dirty document, containing only elements allowed by the whitelist.
     The original document is not modified. Only elements from the dirt document's <code>body</code> are used.
     @param dirtyDocument Untrusted base document to clean.
     @return cleaned document.
     */
    public Document clean(Document dirtyDocument) {try{__CLR4_2_16um6umjpaexqqh.R.inc(8881);
        __CLR4_2_16um6umjpaexqqh.R.inc(8882);Validate.notNull(dirtyDocument);

        __CLR4_2_16um6umjpaexqqh.R.inc(8883);Document clean = Document.createShell(dirtyDocument.baseUri());
        __CLR4_2_16um6umjpaexqqh.R.inc(8884);if ((((dirtyDocument.body() != null)&&(__CLR4_2_16um6umjpaexqqh.R.iget(8885)!=0|true))||(__CLR4_2_16um6umjpaexqqh.R.iget(8886)==0&false))) // frameset documents won't have a body. the clean doc will have empty body.
            {__CLR4_2_16um6umjpaexqqh.R.inc(8887);copySafeNodes(dirtyDocument.body(), clean.body());

        }__CLR4_2_16um6umjpaexqqh.R.inc(8888);return clean;
    }finally{__CLR4_2_16um6umjpaexqqh.R.flushNeeded();}}

    /**
     Determines if the input document <b>body</b>is valid, against the whitelist. It is considered valid if all the tags and attributes
     in the input HTML are allowed by the whitelist, and that there is no content in the <code>head</code>.
     <p>
     This method can be used as a validator for user input. An invalid document will still be cleaned successfully
     using the {@link #clean(Document)} document. If using as a validator, it is recommended to still clean the document
     to ensure enforced attributes are set correctly, and that the output is tidied.
     </p>
     @param dirtyDocument document to test
     @return true if no tags or attributes need to be removed; false if they do
     */
    public boolean isValid(Document dirtyDocument) {try{__CLR4_2_16um6umjpaexqqh.R.inc(8889);
        __CLR4_2_16um6umjpaexqqh.R.inc(8890);Validate.notNull(dirtyDocument);

        __CLR4_2_16um6umjpaexqqh.R.inc(8891);Document clean = Document.createShell(dirtyDocument.baseUri());
        __CLR4_2_16um6umjpaexqqh.R.inc(8892);int numDiscarded = copySafeNodes(dirtyDocument.body(), clean.body());
        __CLR4_2_16um6umjpaexqqh.R.inc(8893);return numDiscarded == 0
            && dirtyDocument.head().childNodes().size() == 0; // because we only look at the body, but we start from a shell, make sure there's nothing in the head
    }finally{__CLR4_2_16um6umjpaexqqh.R.flushNeeded();}}

    public boolean isValidBodyHtml(String bodyHtml) {try{__CLR4_2_16um6umjpaexqqh.R.inc(8894);
        __CLR4_2_16um6umjpaexqqh.R.inc(8895);Document clean = Document.createShell("");
        __CLR4_2_16um6umjpaexqqh.R.inc(8896);Document dirty = Document.createShell("");
        __CLR4_2_16um6umjpaexqqh.R.inc(8897);ParseErrorList errorList = ParseErrorList.tracking(1);
        __CLR4_2_16um6umjpaexqqh.R.inc(8898);List<Node> nodes = Parser.parseFragment(bodyHtml, dirty.body(), "", errorList);
        __CLR4_2_16um6umjpaexqqh.R.inc(8899);dirty.body().insertChildren(0, nodes);
        __CLR4_2_16um6umjpaexqqh.R.inc(8900);int numDiscarded = copySafeNodes(dirty.body(), clean.body());
        __CLR4_2_16um6umjpaexqqh.R.inc(8901);return numDiscarded == 0 && errorList.size() == 0;
    }finally{__CLR4_2_16um6umjpaexqqh.R.flushNeeded();}}

    /**
     Iterates the input and copies trusted nodes (tags, attributes, text) into the destination.
     */
    private final class CleaningVisitor implements NodeVisitor {
        private int numDiscarded = 0;
        private final Element root;
        private Element destination; // current element to append nodes to

        private CleaningVisitor(Element root, Element destination) {try{__CLR4_2_16um6umjpaexqqh.R.inc(8902);
            __CLR4_2_16um6umjpaexqqh.R.inc(8903);this.root = root;
            __CLR4_2_16um6umjpaexqqh.R.inc(8904);this.destination = destination;
        }finally{__CLR4_2_16um6umjpaexqqh.R.flushNeeded();}}

        public void head(Node source, int depth) {try{__CLR4_2_16um6umjpaexqqh.R.inc(8905);
            __CLR4_2_16um6umjpaexqqh.R.inc(8906);if ((((source instanceof Element)&&(__CLR4_2_16um6umjpaexqqh.R.iget(8907)!=0|true))||(__CLR4_2_16um6umjpaexqqh.R.iget(8908)==0&false))) {{
                __CLR4_2_16um6umjpaexqqh.R.inc(8909);Element sourceEl = (Element) source;

                __CLR4_2_16um6umjpaexqqh.R.inc(8910);if ((((whitelist.isSafeTag(sourceEl.tagName()))&&(__CLR4_2_16um6umjpaexqqh.R.iget(8911)!=0|true))||(__CLR4_2_16um6umjpaexqqh.R.iget(8912)==0&false))) {{ // safe, clone and copy safe attrs
                    __CLR4_2_16um6umjpaexqqh.R.inc(8913);ElementMeta meta = createSafeElement(sourceEl);
                    __CLR4_2_16um6umjpaexqqh.R.inc(8914);Element destChild = meta.el;
                    __CLR4_2_16um6umjpaexqqh.R.inc(8915);destination.appendChild(destChild);

                    __CLR4_2_16um6umjpaexqqh.R.inc(8916);numDiscarded += meta.numAttribsDiscarded;
                    __CLR4_2_16um6umjpaexqqh.R.inc(8917);destination = destChild;
                } }else {__CLR4_2_16um6umjpaexqqh.R.inc(8918);if ((((source != root)&&(__CLR4_2_16um6umjpaexqqh.R.iget(8919)!=0|true))||(__CLR4_2_16um6umjpaexqqh.R.iget(8920)==0&false))) {{ // not a safe tag, so don't add. don't count root against discarded.
                    __CLR4_2_16um6umjpaexqqh.R.inc(8921);numDiscarded++;
                }
            }}} }else {__CLR4_2_16um6umjpaexqqh.R.inc(8922);if ((((source instanceof TextNode)&&(__CLR4_2_16um6umjpaexqqh.R.iget(8923)!=0|true))||(__CLR4_2_16um6umjpaexqqh.R.iget(8924)==0&false))) {{
                __CLR4_2_16um6umjpaexqqh.R.inc(8925);TextNode sourceText = (TextNode) source;
                __CLR4_2_16um6umjpaexqqh.R.inc(8926);TextNode destText = new TextNode(sourceText.getWholeText());
                __CLR4_2_16um6umjpaexqqh.R.inc(8927);destination.appendChild(destText);
            } }else {__CLR4_2_16um6umjpaexqqh.R.inc(8928);if ((((source instanceof DataNode && whitelist.isSafeTag(source.parent().nodeName()))&&(__CLR4_2_16um6umjpaexqqh.R.iget(8929)!=0|true))||(__CLR4_2_16um6umjpaexqqh.R.iget(8930)==0&false))) {{
              __CLR4_2_16um6umjpaexqqh.R.inc(8931);DataNode sourceData = (DataNode) source;
              __CLR4_2_16um6umjpaexqqh.R.inc(8932);DataNode destData = new DataNode(sourceData.getWholeData());
              __CLR4_2_16um6umjpaexqqh.R.inc(8933);destination.appendChild(destData);
            } }else {{ // else, we don't care about comments, xml proc instructions, etc
                __CLR4_2_16um6umjpaexqqh.R.inc(8934);numDiscarded++;
            }
        }}}}finally{__CLR4_2_16um6umjpaexqqh.R.flushNeeded();}}

        public void tail(Node source, int depth) {try{__CLR4_2_16um6umjpaexqqh.R.inc(8935);
            __CLR4_2_16um6umjpaexqqh.R.inc(8936);if ((((source instanceof Element && whitelist.isSafeTag(source.nodeName()))&&(__CLR4_2_16um6umjpaexqqh.R.iget(8937)!=0|true))||(__CLR4_2_16um6umjpaexqqh.R.iget(8938)==0&false))) {{
                __CLR4_2_16um6umjpaexqqh.R.inc(8939);destination = destination.parent(); // would have descended, so pop destination stack
            }
        }}finally{__CLR4_2_16um6umjpaexqqh.R.flushNeeded();}}
    }

    private int copySafeNodes(Element source, Element dest) {try{__CLR4_2_16um6umjpaexqqh.R.inc(8940);
        __CLR4_2_16um6umjpaexqqh.R.inc(8941);CleaningVisitor cleaningVisitor = new CleaningVisitor(source, dest);
        __CLR4_2_16um6umjpaexqqh.R.inc(8942);NodeTraversor.traverse(cleaningVisitor, source);
        __CLR4_2_16um6umjpaexqqh.R.inc(8943);return cleaningVisitor.numDiscarded;
    }finally{__CLR4_2_16um6umjpaexqqh.R.flushNeeded();}}

    private ElementMeta createSafeElement(Element sourceEl) {try{__CLR4_2_16um6umjpaexqqh.R.inc(8944);
        __CLR4_2_16um6umjpaexqqh.R.inc(8945);String sourceTag = sourceEl.tagName();
        __CLR4_2_16um6umjpaexqqh.R.inc(8946);Attributes destAttrs = new Attributes();
        __CLR4_2_16um6umjpaexqqh.R.inc(8947);Element dest = new Element(Tag.valueOf(sourceTag), sourceEl.baseUri(), destAttrs);
        __CLR4_2_16um6umjpaexqqh.R.inc(8948);int numDiscarded = 0;

        __CLR4_2_16um6umjpaexqqh.R.inc(8949);Attributes sourceAttrs = sourceEl.attributes();
        __CLR4_2_16um6umjpaexqqh.R.inc(8950);for (Attribute sourceAttr : sourceAttrs) {{
            __CLR4_2_16um6umjpaexqqh.R.inc(8951);if ((((whitelist.isSafeAttribute(sourceTag, sourceEl, sourceAttr))&&(__CLR4_2_16um6umjpaexqqh.R.iget(8952)!=0|true))||(__CLR4_2_16um6umjpaexqqh.R.iget(8953)==0&false)))
                {__CLR4_2_16um6umjpaexqqh.R.inc(8954);destAttrs.put(sourceAttr);
            }else
                {__CLR4_2_16um6umjpaexqqh.R.inc(8955);numDiscarded++;
        }}
        }__CLR4_2_16um6umjpaexqqh.R.inc(8956);Attributes enforcedAttrs = whitelist.getEnforcedAttributes(sourceTag);
        __CLR4_2_16um6umjpaexqqh.R.inc(8957);destAttrs.addAll(enforcedAttrs);

        __CLR4_2_16um6umjpaexqqh.R.inc(8958);return new ElementMeta(dest, numDiscarded);
    }finally{__CLR4_2_16um6umjpaexqqh.R.flushNeeded();}}

    private static class ElementMeta {
        Element el;
        int numAttribsDiscarded;

        ElementMeta(Element el, int numAttribsDiscarded) {try{__CLR4_2_16um6umjpaexqqh.R.inc(8959);
            __CLR4_2_16um6umjpaexqqh.R.inc(8960);this.el = el;
            __CLR4_2_16um6umjpaexqqh.R.inc(8961);this.numAttribsDiscarded = numAttribsDiscarded;
        }finally{__CLR4_2_16um6umjpaexqqh.R.flushNeeded();}}
    }

}
