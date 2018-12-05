/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.util.Collections;
import java.util.List;

abstract class LeafNode extends Node {public static class __CLR4_2_12h62h6jpaexqh9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,3265,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final List<Node> EmptyNodes = Collections.emptyList();

    Object value; // either a string value, or an attribute map (in the rare case multiple attributes are set)

    protected final boolean hasAttributes() {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3210);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3211);return value instanceof Attributes;
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    @Override
    public final Attributes attributes() {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3212);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3213);ensureAttributes();
        __CLR4_2_12h62h6jpaexqh9.R.inc(3214);return (Attributes) value;
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    private void ensureAttributes() {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3215);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3216);if ((((!hasAttributes())&&(__CLR4_2_12h62h6jpaexqh9.R.iget(3217)!=0|true))||(__CLR4_2_12h62h6jpaexqh9.R.iget(3218)==0&false))) {{
            __CLR4_2_12h62h6jpaexqh9.R.inc(3219);Object coreValue = value;
            __CLR4_2_12h62h6jpaexqh9.R.inc(3220);Attributes attributes = new Attributes();
            __CLR4_2_12h62h6jpaexqh9.R.inc(3221);value = attributes;
            __CLR4_2_12h62h6jpaexqh9.R.inc(3222);if ((((coreValue != null)&&(__CLR4_2_12h62h6jpaexqh9.R.iget(3223)!=0|true))||(__CLR4_2_12h62h6jpaexqh9.R.iget(3224)==0&false)))
                {__CLR4_2_12h62h6jpaexqh9.R.inc(3225);attributes.put(nodeName(), (String) coreValue);
        }}
    }}finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    String coreValue() {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3226);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3227);return attr(nodeName());
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    void coreValue(String value) {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3228);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3229);attr(nodeName(), value);
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    @Override
    public String attr(String key) {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3230);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3231);Validate.notNull(key);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3232);if ((((!hasAttributes())&&(__CLR4_2_12h62h6jpaexqh9.R.iget(3233)!=0|true))||(__CLR4_2_12h62h6jpaexqh9.R.iget(3234)==0&false))) {{
            __CLR4_2_12h62h6jpaexqh9.R.inc(3235);return (((key.equals(nodeName()) )&&(__CLR4_2_12h62h6jpaexqh9.R.iget(3236)!=0|true))||(__CLR4_2_12h62h6jpaexqh9.R.iget(3237)==0&false))? (String) value : EmptyString;
        }
        }__CLR4_2_12h62h6jpaexqh9.R.inc(3238);return super.attr(key);
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    @Override
    public Node attr(String key, String value) {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3239);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3240);if ((((!hasAttributes() && key.equals(nodeName()))&&(__CLR4_2_12h62h6jpaexqh9.R.iget(3241)!=0|true))||(__CLR4_2_12h62h6jpaexqh9.R.iget(3242)==0&false))) {{
            __CLR4_2_12h62h6jpaexqh9.R.inc(3243);this.value = value;
        } }else {{
            __CLR4_2_12h62h6jpaexqh9.R.inc(3244);ensureAttributes();
            __CLR4_2_12h62h6jpaexqh9.R.inc(3245);super.attr(key, value);
        }
        }__CLR4_2_12h62h6jpaexqh9.R.inc(3246);return this;
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    @Override
    public boolean hasAttr(String key) {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3247);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3248);ensureAttributes();
        __CLR4_2_12h62h6jpaexqh9.R.inc(3249);return super.hasAttr(key);
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    @Override
    public Node removeAttr(String key) {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3250);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3251);ensureAttributes();
        __CLR4_2_12h62h6jpaexqh9.R.inc(3252);return super.removeAttr(key);
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    @Override
    public String absUrl(String key) {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3253);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3254);ensureAttributes();
        __CLR4_2_12h62h6jpaexqh9.R.inc(3255);return super.absUrl(key);
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    @Override
    public String baseUri() {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3256);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3257);return (((hasParent() )&&(__CLR4_2_12h62h6jpaexqh9.R.iget(3258)!=0|true))||(__CLR4_2_12h62h6jpaexqh9.R.iget(3259)==0&false))? parent().baseUri() : "";
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    @Override
    protected void doSetBaseUri(String baseUri) {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3260);
        // noop
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    @Override
    public int childNodeSize() {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3261);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3262);return 0;
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}

    @Override
    protected List<Node> ensureChildNodes() {try{__CLR4_2_12h62h6jpaexqh9.R.inc(3263);
        __CLR4_2_12h62h6jpaexqh9.R.inc(3264);return EmptyNodes;
    }finally{__CLR4_2_12h62h6jpaexqh9.R.flushNeeded();}}
}
