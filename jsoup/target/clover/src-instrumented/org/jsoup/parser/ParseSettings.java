/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.parser;

import org.jsoup.nodes.Attributes;

import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * Controls parser settings, to optionally preserve tag and/or attribute name case.
 */
public class ParseSettings {public static class __CLR4_2_14xd4xdjp2rxa6w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543506510356L,8589935092L,6411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * HTML default settings: both tag and attribute names are lower-cased during parsing.
     */
    public static final ParseSettings htmlDefault;
    /**
     * Preserve both tag and attribute case.
     */
    public static final ParseSettings preserveCase;

    static {try{__CLR4_2_14xd4xdjp2rxa6w.R.inc(6385);
        __CLR4_2_14xd4xdjp2rxa6w.R.inc(6386);htmlDefault = new ParseSettings(false, false);
        __CLR4_2_14xd4xdjp2rxa6w.R.inc(6387);preserveCase = new ParseSettings(true, true);
    }finally{__CLR4_2_14xd4xdjp2rxa6w.R.flushNeeded();}}

    private final boolean preserveTagCase;
    private final boolean preserveAttributeCase;

    /**
     * Define parse settings.
     * @param tag preserve tag case?
     * @param attribute preserve attribute name case?
     */
    public ParseSettings(boolean tag, boolean attribute) {try{__CLR4_2_14xd4xdjp2rxa6w.R.inc(6388);
        __CLR4_2_14xd4xdjp2rxa6w.R.inc(6389);preserveTagCase = tag;
        __CLR4_2_14xd4xdjp2rxa6w.R.inc(6390);preserveAttributeCase = attribute;
    }finally{__CLR4_2_14xd4xdjp2rxa6w.R.flushNeeded();}}

    public String normalizeTag(String name) {try{__CLR4_2_14xd4xdjp2rxa6w.R.inc(6391);
        __CLR4_2_14xd4xdjp2rxa6w.R.inc(6392);name = name.trim();
        __CLR4_2_14xd4xdjp2rxa6w.R.inc(6393);if ((((!preserveTagCase)&&(__CLR4_2_14xd4xdjp2rxa6w.R.iget(6394)!=0|true))||(__CLR4_2_14xd4xdjp2rxa6w.R.iget(6395)==0&false)))
            {__CLR4_2_14xd4xdjp2rxa6w.R.inc(6396);name = lowerCase(name);
        }__CLR4_2_14xd4xdjp2rxa6w.R.inc(6397);return name;
    }finally{__CLR4_2_14xd4xdjp2rxa6w.R.flushNeeded();}}

    public String normalizeAttribute(String name) {try{__CLR4_2_14xd4xdjp2rxa6w.R.inc(6398);
        __CLR4_2_14xd4xdjp2rxa6w.R.inc(6399);name = name.trim();
        __CLR4_2_14xd4xdjp2rxa6w.R.inc(6400);if ((((!preserveAttributeCase)&&(__CLR4_2_14xd4xdjp2rxa6w.R.iget(6401)!=0|true))||(__CLR4_2_14xd4xdjp2rxa6w.R.iget(6402)==0&false)))
            {__CLR4_2_14xd4xdjp2rxa6w.R.inc(6403);name = lowerCase(name);
        }__CLR4_2_14xd4xdjp2rxa6w.R.inc(6404);return name;
    }finally{__CLR4_2_14xd4xdjp2rxa6w.R.flushNeeded();}}

    Attributes normalizeAttributes(Attributes attributes) {try{__CLR4_2_14xd4xdjp2rxa6w.R.inc(6405);
        __CLR4_2_14xd4xdjp2rxa6w.R.inc(6406);if ((((!preserveAttributeCase)&&(__CLR4_2_14xd4xdjp2rxa6w.R.iget(6407)!=0|true))||(__CLR4_2_14xd4xdjp2rxa6w.R.iget(6408)==0&false))) {{
            __CLR4_2_14xd4xdjp2rxa6w.R.inc(6409);attributes.normalize();
        }
        }__CLR4_2_14xd4xdjp2rxa6w.R.inc(6410);return attributes;
    }finally{__CLR4_2_14xd4xdjp2rxa6w.R.flushNeeded();}}
}
