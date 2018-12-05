/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document.OutputSettings.Syntax;

import java.io.IOException;

/**
 * A {@code <!DOCTYPE>} node.
 */
public class DocumentType extends LeafNode {public static class __CLR4_2_11pz1pzjpaexqeg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,2291,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // todo needs a bit of a chunky cleanup. this level of detail isn't needed
    public static final String PUBLIC_KEY = "PUBLIC";
    public static final String SYSTEM_KEY = "SYSTEM";
    private static final String NAME = "name";
    private static final String PUB_SYS_KEY = "pubSysKey"; // PUBLIC or SYSTEM
    private static final String PUBLIC_ID = "publicId";
    private static final String SYSTEM_ID = "systemId";
    // todo: quirk mode from publicId and systemId

    /**
     * Create a new doctype element.
     * @param name the doctype's name
     * @param publicId the doctype's public ID
     * @param systemId the doctype's system ID
     */
    public DocumentType(String name, String publicId, String systemId) {try{__CLR4_2_11pz1pzjpaexqeg.R.inc(2231);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2232);Validate.notNull(name);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2233);Validate.notNull(publicId);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2234);Validate.notNull(systemId);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2235);attr(NAME, name);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2236);attr(PUBLIC_ID, publicId);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2237);if ((((has(PUBLIC_ID))&&(__CLR4_2_11pz1pzjpaexqeg.R.iget(2238)!=0|true))||(__CLR4_2_11pz1pzjpaexqeg.R.iget(2239)==0&false))) {{
            __CLR4_2_11pz1pzjpaexqeg.R.inc(2240);attr(PUB_SYS_KEY, PUBLIC_KEY);
        }
        }__CLR4_2_11pz1pzjpaexqeg.R.inc(2241);attr(SYSTEM_ID, systemId);
    }finally{__CLR4_2_11pz1pzjpaexqeg.R.flushNeeded();}}

    /**
     * Create a new doctype element.
     * @param name the doctype's name
     * @param publicId the doctype's public ID
     * @param systemId the doctype's system ID
     * @param baseUri unused
     * @deprecated
     */
    public DocumentType(String name, String publicId, String systemId, String baseUri) {try{__CLR4_2_11pz1pzjpaexqeg.R.inc(2242);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2243);attr(NAME, name);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2244);attr(PUBLIC_ID, publicId);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2245);if ((((has(PUBLIC_ID))&&(__CLR4_2_11pz1pzjpaexqeg.R.iget(2246)!=0|true))||(__CLR4_2_11pz1pzjpaexqeg.R.iget(2247)==0&false))) {{
            __CLR4_2_11pz1pzjpaexqeg.R.inc(2248);attr(PUB_SYS_KEY, PUBLIC_KEY);
        }
        }__CLR4_2_11pz1pzjpaexqeg.R.inc(2249);attr(SYSTEM_ID, systemId);
    }finally{__CLR4_2_11pz1pzjpaexqeg.R.flushNeeded();}}

    /**
     * Create a new doctype element.
     * @param name the doctype's name
     * @param publicId the doctype's public ID
     * @param systemId the doctype's system ID
     * @param baseUri unused
     * @deprecated
     */
    public DocumentType(String name, String pubSysKey, String publicId, String systemId, String baseUri) {try{__CLR4_2_11pz1pzjpaexqeg.R.inc(2250);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2251);attr(NAME, name);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2252);if ((((pubSysKey != null)&&(__CLR4_2_11pz1pzjpaexqeg.R.iget(2253)!=0|true))||(__CLR4_2_11pz1pzjpaexqeg.R.iget(2254)==0&false))) {{
            __CLR4_2_11pz1pzjpaexqeg.R.inc(2255);attr(PUB_SYS_KEY, pubSysKey);
        }
        }__CLR4_2_11pz1pzjpaexqeg.R.inc(2256);attr(PUBLIC_ID, publicId);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2257);attr(SYSTEM_ID, systemId);
    }finally{__CLR4_2_11pz1pzjpaexqeg.R.flushNeeded();}}
    public void setPubSysKey(String value) {try{__CLR4_2_11pz1pzjpaexqeg.R.inc(2258);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2259);if ((((value != null)&&(__CLR4_2_11pz1pzjpaexqeg.R.iget(2260)!=0|true))||(__CLR4_2_11pz1pzjpaexqeg.R.iget(2261)==0&false)))
            {__CLR4_2_11pz1pzjpaexqeg.R.inc(2262);attr(PUB_SYS_KEY, value);
    }}finally{__CLR4_2_11pz1pzjpaexqeg.R.flushNeeded();}}

    @Override
    public String nodeName() {try{__CLR4_2_11pz1pzjpaexqeg.R.inc(2263);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2264);return "#doctype";
    }finally{__CLR4_2_11pz1pzjpaexqeg.R.flushNeeded();}}

    @Override
    void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_2_11pz1pzjpaexqeg.R.inc(2265);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2266);if ((((out.syntax() == Syntax.html && !has(PUBLIC_ID) && !has(SYSTEM_ID))&&(__CLR4_2_11pz1pzjpaexqeg.R.iget(2267)!=0|true))||(__CLR4_2_11pz1pzjpaexqeg.R.iget(2268)==0&false))) {{
            // looks like a html5 doctype, go lowercase for aesthetics
            __CLR4_2_11pz1pzjpaexqeg.R.inc(2269);accum.append("<!doctype");
        } }else {{
            __CLR4_2_11pz1pzjpaexqeg.R.inc(2270);accum.append("<!DOCTYPE");
        }
        }__CLR4_2_11pz1pzjpaexqeg.R.inc(2271);if ((((has(NAME))&&(__CLR4_2_11pz1pzjpaexqeg.R.iget(2272)!=0|true))||(__CLR4_2_11pz1pzjpaexqeg.R.iget(2273)==0&false)))
            {__CLR4_2_11pz1pzjpaexqeg.R.inc(2274);accum.append(" ").append(attr(NAME));
        }__CLR4_2_11pz1pzjpaexqeg.R.inc(2275);if ((((has(PUB_SYS_KEY))&&(__CLR4_2_11pz1pzjpaexqeg.R.iget(2276)!=0|true))||(__CLR4_2_11pz1pzjpaexqeg.R.iget(2277)==0&false)))
            {__CLR4_2_11pz1pzjpaexqeg.R.inc(2278);accum.append(" ").append(attr(PUB_SYS_KEY));
        }__CLR4_2_11pz1pzjpaexqeg.R.inc(2279);if ((((has(PUBLIC_ID))&&(__CLR4_2_11pz1pzjpaexqeg.R.iget(2280)!=0|true))||(__CLR4_2_11pz1pzjpaexqeg.R.iget(2281)==0&false)))
            {__CLR4_2_11pz1pzjpaexqeg.R.inc(2282);accum.append(" \"").append(attr(PUBLIC_ID)).append('"');
        }__CLR4_2_11pz1pzjpaexqeg.R.inc(2283);if ((((has(SYSTEM_ID))&&(__CLR4_2_11pz1pzjpaexqeg.R.iget(2284)!=0|true))||(__CLR4_2_11pz1pzjpaexqeg.R.iget(2285)==0&false)))
            {__CLR4_2_11pz1pzjpaexqeg.R.inc(2286);accum.append(" \"").append(attr(SYSTEM_ID)).append('"');
        }__CLR4_2_11pz1pzjpaexqeg.R.inc(2287);accum.append('>');
    }finally{__CLR4_2_11pz1pzjpaexqeg.R.flushNeeded();}}

    @Override
    void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {try{__CLR4_2_11pz1pzjpaexqeg.R.inc(2288);
    }finally{__CLR4_2_11pz1pzjpaexqeg.R.flushNeeded();}}

    private boolean has(final String attribute) {try{__CLR4_2_11pz1pzjpaexqeg.R.inc(2289);
        __CLR4_2_11pz1pzjpaexqeg.R.inc(2290);return !StringUtil.isBlank(attr(attribute));
    }finally{__CLR4_2_11pz1pzjpaexqeg.R.flushNeeded();}}
}
