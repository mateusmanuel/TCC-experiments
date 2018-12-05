/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Stack;

/**
 * Helper class to transform a {@link org.jsoup.nodes.Document} to a {@link org.w3c.dom.Document org.w3c.dom.Document},
 * for integration with toolsets that use the W3C DOM.
 */
public class W3CDom {public static class __CLR4_2_1ymymjpaexqbz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,1345,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    /**
     * Convert a jsoup Document to a W3C Document.
     * @param in jsoup doc
     * @return w3c doc
     */
    public Document fromJsoup(org.jsoup.nodes.Document in) {try{__CLR4_2_1ymymjpaexqbz.R.inc(1246);
        __CLR4_2_1ymymjpaexqbz.R.inc(1247);Validate.notNull(in);
        __CLR4_2_1ymymjpaexqbz.R.inc(1248);DocumentBuilder builder;
        __CLR4_2_1ymymjpaexqbz.R.inc(1249);try {
        	//set the factory to be namespace-aware
        	__CLR4_2_1ymymjpaexqbz.R.inc(1250);factory.setNamespaceAware(true);
            __CLR4_2_1ymymjpaexqbz.R.inc(1251);builder = factory.newDocumentBuilder();
            __CLR4_2_1ymymjpaexqbz.R.inc(1252);Document out = builder.newDocument();
            __CLR4_2_1ymymjpaexqbz.R.inc(1253);convert(in, out);
            __CLR4_2_1ymymjpaexqbz.R.inc(1254);return out;
        } catch (ParserConfigurationException e) {
            __CLR4_2_1ymymjpaexqbz.R.inc(1255);throw new IllegalStateException(e);
        }
    }finally{__CLR4_2_1ymymjpaexqbz.R.flushNeeded();}}

    /**
     * Converts a jsoup document into the provided W3C Document. If required, you can set options on the output document
     * before converting.
     * @param in jsoup doc
     * @param out w3c doc
     * @see org.jsoup.helper.W3CDom#fromJsoup(org.jsoup.nodes.Document)
     */
    public void convert(org.jsoup.nodes.Document in, Document out) {try{__CLR4_2_1ymymjpaexqbz.R.inc(1256);
        __CLR4_2_1ymymjpaexqbz.R.inc(1257);if ((((!StringUtil.isBlank(in.location()))&&(__CLR4_2_1ymymjpaexqbz.R.iget(1258)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1259)==0&false)))
            {__CLR4_2_1ymymjpaexqbz.R.inc(1260);out.setDocumentURI(in.location());

        }__CLR4_2_1ymymjpaexqbz.R.inc(1261);org.jsoup.nodes.Element rootEl = in.child(0); // skip the #root node
        __CLR4_2_1ymymjpaexqbz.R.inc(1262);NodeTraversor.traverse(new W3CBuilder(out), rootEl);
    }finally{__CLR4_2_1ymymjpaexqbz.R.flushNeeded();}}

    /**
     * Implements the conversion by walking the input.
     */
    protected static class W3CBuilder implements NodeVisitor {
        private static final String xmlnsKey = "xmlns";
        private static final String xmlnsPrefix = "xmlns:";

        private final Document doc;
        private final Stack<HashMap<String, String>> namespacesStack = new Stack<>(); // stack of namespaces, prefix => urn
        private Element dest;

        public W3CBuilder(Document doc) {try{__CLR4_2_1ymymjpaexqbz.R.inc(1263);
            __CLR4_2_1ymymjpaexqbz.R.inc(1264);this.doc = doc;
            __CLR4_2_1ymymjpaexqbz.R.inc(1265);this.namespacesStack.push(new HashMap<String, String>());
        }finally{__CLR4_2_1ymymjpaexqbz.R.flushNeeded();}}

        public void head(org.jsoup.nodes.Node source, int depth) {try{__CLR4_2_1ymymjpaexqbz.R.inc(1266);
            __CLR4_2_1ymymjpaexqbz.R.inc(1267);namespacesStack.push(new HashMap<>(namespacesStack.peek())); // inherit from above on the stack
            __CLR4_2_1ymymjpaexqbz.R.inc(1268);if ((((source instanceof org.jsoup.nodes.Element)&&(__CLR4_2_1ymymjpaexqbz.R.iget(1269)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1270)==0&false))) {{
                __CLR4_2_1ymymjpaexqbz.R.inc(1271);org.jsoup.nodes.Element sourceEl = (org.jsoup.nodes.Element) source;

                __CLR4_2_1ymymjpaexqbz.R.inc(1272);String prefix = updateNamespaces(sourceEl);
                __CLR4_2_1ymymjpaexqbz.R.inc(1273);String namespace = namespacesStack.peek().get(prefix);
                __CLR4_2_1ymymjpaexqbz.R.inc(1274);String tagName = sourceEl.tagName();

                __CLR4_2_1ymymjpaexqbz.R.inc(1275);Element el = (((namespace == null && tagName.contains(":") )&&(__CLR4_2_1ymymjpaexqbz.R.iget(1276)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1277)==0&false))?
                    doc.createElementNS("", tagName) : // doesn't have a real namespace defined
                    doc.createElementNS(namespace, tagName);
                __CLR4_2_1ymymjpaexqbz.R.inc(1278);copyAttributes(sourceEl, el);
                __CLR4_2_1ymymjpaexqbz.R.inc(1279);if ((((dest == null)&&(__CLR4_2_1ymymjpaexqbz.R.iget(1280)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1281)==0&false))) {{ // sets up the root
                    __CLR4_2_1ymymjpaexqbz.R.inc(1282);doc.appendChild(el);
                } }else {{
                    __CLR4_2_1ymymjpaexqbz.R.inc(1283);dest.appendChild(el);
                }
                }__CLR4_2_1ymymjpaexqbz.R.inc(1284);dest = el; // descend
            } }else {__CLR4_2_1ymymjpaexqbz.R.inc(1285);if ((((source instanceof org.jsoup.nodes.TextNode)&&(__CLR4_2_1ymymjpaexqbz.R.iget(1286)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1287)==0&false))) {{
                __CLR4_2_1ymymjpaexqbz.R.inc(1288);org.jsoup.nodes.TextNode sourceText = (org.jsoup.nodes.TextNode) source;
                __CLR4_2_1ymymjpaexqbz.R.inc(1289);Text text = doc.createTextNode(sourceText.getWholeText());
                __CLR4_2_1ymymjpaexqbz.R.inc(1290);dest.appendChild(text);
            } }else {__CLR4_2_1ymymjpaexqbz.R.inc(1291);if ((((source instanceof org.jsoup.nodes.Comment)&&(__CLR4_2_1ymymjpaexqbz.R.iget(1292)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1293)==0&false))) {{
                __CLR4_2_1ymymjpaexqbz.R.inc(1294);org.jsoup.nodes.Comment sourceComment = (org.jsoup.nodes.Comment) source;
                __CLR4_2_1ymymjpaexqbz.R.inc(1295);Comment comment = doc.createComment(sourceComment.getData());
                __CLR4_2_1ymymjpaexqbz.R.inc(1296);dest.appendChild(comment);
            } }else {__CLR4_2_1ymymjpaexqbz.R.inc(1297);if ((((source instanceof org.jsoup.nodes.DataNode)&&(__CLR4_2_1ymymjpaexqbz.R.iget(1298)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1299)==0&false))) {{
                __CLR4_2_1ymymjpaexqbz.R.inc(1300);org.jsoup.nodes.DataNode sourceData = (org.jsoup.nodes.DataNode) source;
                __CLR4_2_1ymymjpaexqbz.R.inc(1301);Text node = doc.createTextNode(sourceData.getWholeData());
                __CLR4_2_1ymymjpaexqbz.R.inc(1302);dest.appendChild(node);
            } }else {{
                // unhandled
            }
        }}}}}finally{__CLR4_2_1ymymjpaexqbz.R.flushNeeded();}}

        public void tail(org.jsoup.nodes.Node source, int depth) {try{__CLR4_2_1ymymjpaexqbz.R.inc(1303);
            __CLR4_2_1ymymjpaexqbz.R.inc(1304);if ((((source instanceof org.jsoup.nodes.Element && dest.getParentNode() instanceof Element)&&(__CLR4_2_1ymymjpaexqbz.R.iget(1305)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1306)==0&false))) {{
                __CLR4_2_1ymymjpaexqbz.R.inc(1307);dest = (Element) dest.getParentNode(); // undescend. cromulent.
            }
            }__CLR4_2_1ymymjpaexqbz.R.inc(1308);namespacesStack.pop();
        }finally{__CLR4_2_1ymymjpaexqbz.R.flushNeeded();}}

        private void copyAttributes(org.jsoup.nodes.Node source, Element el) {try{__CLR4_2_1ymymjpaexqbz.R.inc(1309);
            __CLR4_2_1ymymjpaexqbz.R.inc(1310);for (Attribute attribute : source.attributes()) {{
                // valid xml attribute names are: ^[a-zA-Z_:][-a-zA-Z0-9_:.]
                __CLR4_2_1ymymjpaexqbz.R.inc(1311);String key = attribute.getKey().replaceAll("[^-a-zA-Z0-9_:.]", "");
                __CLR4_2_1ymymjpaexqbz.R.inc(1312);if ((((key.matches("[a-zA-Z_:][-a-zA-Z0-9_:.]*"))&&(__CLR4_2_1ymymjpaexqbz.R.iget(1313)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1314)==0&false)))
                    {__CLR4_2_1ymymjpaexqbz.R.inc(1315);el.setAttribute(key, attribute.getValue());
            }}
        }}finally{__CLR4_2_1ymymjpaexqbz.R.flushNeeded();}}

        /**
         * Finds any namespaces defined in this element. Returns any tag prefix.
         */
        private String updateNamespaces(org.jsoup.nodes.Element el) {try{__CLR4_2_1ymymjpaexqbz.R.inc(1316);
            // scan the element for namespace declarations
            // like: xmlns="blah" or xmlns:prefix="blah"
            __CLR4_2_1ymymjpaexqbz.R.inc(1317);Attributes attributes = el.attributes();
            __CLR4_2_1ymymjpaexqbz.R.inc(1318);for (Attribute attr : attributes) {{
                __CLR4_2_1ymymjpaexqbz.R.inc(1319);String key = attr.getKey();
                __CLR4_2_1ymymjpaexqbz.R.inc(1320);String prefix;
                __CLR4_2_1ymymjpaexqbz.R.inc(1321);if ((((key.equals(xmlnsKey))&&(__CLR4_2_1ymymjpaexqbz.R.iget(1322)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1323)==0&false))) {{
                    __CLR4_2_1ymymjpaexqbz.R.inc(1324);prefix = "";
                } }else {__CLR4_2_1ymymjpaexqbz.R.inc(1325);if ((((key.startsWith(xmlnsPrefix))&&(__CLR4_2_1ymymjpaexqbz.R.iget(1326)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1327)==0&false))) {{
                    __CLR4_2_1ymymjpaexqbz.R.inc(1328);prefix = key.substring(xmlnsPrefix.length());
                } }else {{
                    __CLR4_2_1ymymjpaexqbz.R.inc(1329);continue;
                }
                }}__CLR4_2_1ymymjpaexqbz.R.inc(1330);namespacesStack.peek().put(prefix, attr.getValue());
            }

            // get the element prefix if any
            }__CLR4_2_1ymymjpaexqbz.R.inc(1331);int pos = el.tagName().indexOf(":");
            __CLR4_2_1ymymjpaexqbz.R.inc(1332);return (((pos > 0 )&&(__CLR4_2_1ymymjpaexqbz.R.iget(1333)!=0|true))||(__CLR4_2_1ymymjpaexqbz.R.iget(1334)==0&false))? el.tagName().substring(0, pos) : "";
        }finally{__CLR4_2_1ymymjpaexqbz.R.flushNeeded();}}

    }

    /**
     * Serialize a W3C document to a String.
     * @param doc Document
     * @return Document as string
     */
    public String asString(Document doc) {try{__CLR4_2_1ymymjpaexqbz.R.inc(1335);
        __CLR4_2_1ymymjpaexqbz.R.inc(1336);try {
            __CLR4_2_1ymymjpaexqbz.R.inc(1337);DOMSource domSource = new DOMSource(doc);
            __CLR4_2_1ymymjpaexqbz.R.inc(1338);StringWriter writer = new StringWriter();
            __CLR4_2_1ymymjpaexqbz.R.inc(1339);StreamResult result = new StreamResult(writer);
            __CLR4_2_1ymymjpaexqbz.R.inc(1340);TransformerFactory tf = TransformerFactory.newInstance();
            __CLR4_2_1ymymjpaexqbz.R.inc(1341);Transformer transformer = tf.newTransformer();
            __CLR4_2_1ymymjpaexqbz.R.inc(1342);transformer.transform(domSource, result);
            __CLR4_2_1ymymjpaexqbz.R.inc(1343);return writer.toString();
        } catch (TransformerException e) {
            __CLR4_2_1ymymjpaexqbz.R.inc(1344);throw new IllegalStateException(e);
        }
    }finally{__CLR4_2_1ymymjpaexqbz.R.flushNeeded();}}
}
