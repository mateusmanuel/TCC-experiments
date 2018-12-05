/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;

import java.io.IOException;

/**
 A comment node.

 @author Jonathan Hedley, jonathan@hedley.net */
public class Comment extends LeafNode {public static class __CLR4_2_11hx1hxjpaexqdo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,1972,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String COMMENT_KEY = "comment";

    /**
     Create a new comment node.
     @param data The contents of the comment
     */
    public Comment(String data) {try{__CLR4_2_11hx1hxjpaexqdo.R.inc(1941);
        __CLR4_2_11hx1hxjpaexqdo.R.inc(1942);value = data;
    }finally{__CLR4_2_11hx1hxjpaexqdo.R.flushNeeded();}}

    /**
     Create a new comment node.
     @param data The contents of the comment
     @param baseUri base URI not used. This is a leaf node.
     @deprecated
     */
    public Comment(String data, String baseUri) {
        this(data);__CLR4_2_11hx1hxjpaexqdo.R.inc(1944);try{__CLR4_2_11hx1hxjpaexqdo.R.inc(1943);
    }finally{__CLR4_2_11hx1hxjpaexqdo.R.flushNeeded();}}

    public String nodeName() {try{__CLR4_2_11hx1hxjpaexqdo.R.inc(1945);
        __CLR4_2_11hx1hxjpaexqdo.R.inc(1946);return "#comment";
    }finally{__CLR4_2_11hx1hxjpaexqdo.R.flushNeeded();}}

    /**
     Get the contents of the comment.
     @return comment content
     */
    public String getData() {try{__CLR4_2_11hx1hxjpaexqdo.R.inc(1947);
        __CLR4_2_11hx1hxjpaexqdo.R.inc(1948);return coreValue();
    }finally{__CLR4_2_11hx1hxjpaexqdo.R.flushNeeded();}}

	void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_2_11hx1hxjpaexqdo.R.inc(1949);
        __CLR4_2_11hx1hxjpaexqdo.R.inc(1950);if ((((out.prettyPrint())&&(__CLR4_2_11hx1hxjpaexqdo.R.iget(1951)!=0|true))||(__CLR4_2_11hx1hxjpaexqdo.R.iget(1952)==0&false)))
            {__CLR4_2_11hx1hxjpaexqdo.R.inc(1953);indent(accum, depth, out);
        }__CLR4_2_11hx1hxjpaexqdo.R.inc(1954);accum
                .append("<!--")
                .append(getData())
                .append("-->");
    }finally{__CLR4_2_11hx1hxjpaexqdo.R.flushNeeded();}}

	void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {try{__CLR4_2_11hx1hxjpaexqdo.R.inc(1955);}finally{__CLR4_2_11hx1hxjpaexqdo.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_11hx1hxjpaexqdo.R.inc(1956);
        __CLR4_2_11hx1hxjpaexqdo.R.inc(1957);return outerHtml();
    }finally{__CLR4_2_11hx1hxjpaexqdo.R.flushNeeded();}}

    /**
     * Check if this comment looks like an XML Declaration.
     * @return true if it looks like, maybe, it's an XML Declaration.
     */
    public boolean isXmlDeclaration() {try{__CLR4_2_11hx1hxjpaexqdo.R.inc(1958);
        __CLR4_2_11hx1hxjpaexqdo.R.inc(1959);String data = getData();
        __CLR4_2_11hx1hxjpaexqdo.R.inc(1960);return (data.length() > 1 && (data.startsWith("!") || data.startsWith("?")));
    }finally{__CLR4_2_11hx1hxjpaexqdo.R.flushNeeded();}}

    /**
     * Attempt to cast this comment to an XML Declaration note.
     * @return an XML declaration if it could be parsed as one, null otherwise.
     */
    public XmlDeclaration asXmlDeclaration() {try{__CLR4_2_11hx1hxjpaexqdo.R.inc(1961);
        __CLR4_2_11hx1hxjpaexqdo.R.inc(1962);String data = getData();
        __CLR4_2_11hx1hxjpaexqdo.R.inc(1963);Document doc = Jsoup.parse("<" + data.substring(1, data.length() -1) + ">", baseUri(), Parser.xmlParser());
        __CLR4_2_11hx1hxjpaexqdo.R.inc(1964);XmlDeclaration decl = null;
        __CLR4_2_11hx1hxjpaexqdo.R.inc(1965);if ((((doc.childNodeSize() > 0)&&(__CLR4_2_11hx1hxjpaexqdo.R.iget(1966)!=0|true))||(__CLR4_2_11hx1hxjpaexqdo.R.iget(1967)==0&false))) {{
            __CLR4_2_11hx1hxjpaexqdo.R.inc(1968);Element el = doc.child(0);
            __CLR4_2_11hx1hxjpaexqdo.R.inc(1969);decl = new XmlDeclaration(NodeUtils.parser(doc).settings().normalizeTag(el.tagName()), data.startsWith("!"));
            __CLR4_2_11hx1hxjpaexqdo.R.inc(1970);decl.attributes().addAll(el.attributes());
        }
        }__CLR4_2_11hx1hxjpaexqdo.R.inc(1971);return decl;
    }finally{__CLR4_2_11hx1hxjpaexqdo.R.flushNeeded();}}
}
