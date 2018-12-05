/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.helper;

/**
 * Simple validation methods. Designed for jsoup internal use
 */
public final class Validate {public static class __CLR4_2_1x7x7jpaexqbq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,1246,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private Validate() {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1195);}finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}

    /**
     * Validates that the object is not null
     * @param obj object to test
     */
    public static void notNull(Object obj) {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1196);
        __CLR4_2_1x7x7jpaexqbq.R.inc(1197);if ((((obj == null)&&(__CLR4_2_1x7x7jpaexqbq.R.iget(1198)!=0|true))||(__CLR4_2_1x7x7jpaexqbq.R.iget(1199)==0&false)))
            {__CLR4_2_1x7x7jpaexqbq.R.inc(1200);throw new IllegalArgumentException("Object must not be null");
    }}finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}

    /**
     * Validates that the object is not null
     * @param obj object to test
     * @param msg message to output if validation fails
     */
    public static void notNull(Object obj, String msg) {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1201);
        __CLR4_2_1x7x7jpaexqbq.R.inc(1202);if ((((obj == null)&&(__CLR4_2_1x7x7jpaexqbq.R.iget(1203)!=0|true))||(__CLR4_2_1x7x7jpaexqbq.R.iget(1204)==0&false)))
            {__CLR4_2_1x7x7jpaexqbq.R.inc(1205);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}

    /**
     * Validates that the value is true
     * @param val object to test
     */
    public static void isTrue(boolean val) {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1206);
        __CLR4_2_1x7x7jpaexqbq.R.inc(1207);if ((((!val)&&(__CLR4_2_1x7x7jpaexqbq.R.iget(1208)!=0|true))||(__CLR4_2_1x7x7jpaexqbq.R.iget(1209)==0&false)))
            {__CLR4_2_1x7x7jpaexqbq.R.inc(1210);throw new IllegalArgumentException("Must be true");
    }}finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}

    /**
     * Validates that the value is true
     * @param val object to test
     * @param msg message to output if validation fails
     */
    public static void isTrue(boolean val, String msg) {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1211);
        __CLR4_2_1x7x7jpaexqbq.R.inc(1212);if ((((!val)&&(__CLR4_2_1x7x7jpaexqbq.R.iget(1213)!=0|true))||(__CLR4_2_1x7x7jpaexqbq.R.iget(1214)==0&false)))
            {__CLR4_2_1x7x7jpaexqbq.R.inc(1215);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}

    /**
     * Validates that the value is false
     * @param val object to test
     */
    public static void isFalse(boolean val) {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1216);
        __CLR4_2_1x7x7jpaexqbq.R.inc(1217);if ((((val)&&(__CLR4_2_1x7x7jpaexqbq.R.iget(1218)!=0|true))||(__CLR4_2_1x7x7jpaexqbq.R.iget(1219)==0&false)))
            {__CLR4_2_1x7x7jpaexqbq.R.inc(1220);throw new IllegalArgumentException("Must be false");
    }}finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}

    /**
     * Validates that the value is false
     * @param val object to test
     * @param msg message to output if validation fails
     */
    public static void isFalse(boolean val, String msg) {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1221);
        __CLR4_2_1x7x7jpaexqbq.R.inc(1222);if ((((val)&&(__CLR4_2_1x7x7jpaexqbq.R.iget(1223)!=0|true))||(__CLR4_2_1x7x7jpaexqbq.R.iget(1224)==0&false)))
            {__CLR4_2_1x7x7jpaexqbq.R.inc(1225);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}

    /**
     * Validates that the array contains no null elements
     * @param objects the array to test
     */
    public static void noNullElements(Object[] objects) {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1226);
        __CLR4_2_1x7x7jpaexqbq.R.inc(1227);noNullElements(objects, "Array must not contain any null objects");
    }finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}

    /**
     * Validates that the array contains no null elements
     * @param objects the array to test
     * @param msg message to output if validation fails
     */
    public static void noNullElements(Object[] objects, String msg) {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1228);
        __CLR4_2_1x7x7jpaexqbq.R.inc(1229);for (Object obj : objects)
            {__CLR4_2_1x7x7jpaexqbq.R.inc(1230);if ((((obj == null)&&(__CLR4_2_1x7x7jpaexqbq.R.iget(1231)!=0|true))||(__CLR4_2_1x7x7jpaexqbq.R.iget(1232)==0&false)))
                {__CLR4_2_1x7x7jpaexqbq.R.inc(1233);throw new IllegalArgumentException(msg);
    }}}finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}

    /**
     * Validates that the string is not empty
     * @param string the string to test
     */
    public static void notEmpty(String string) {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1234);
        __CLR4_2_1x7x7jpaexqbq.R.inc(1235);if ((((string == null || string.length() == 0)&&(__CLR4_2_1x7x7jpaexqbq.R.iget(1236)!=0|true))||(__CLR4_2_1x7x7jpaexqbq.R.iget(1237)==0&false)))
            {__CLR4_2_1x7x7jpaexqbq.R.inc(1238);throw new IllegalArgumentException("String must not be empty");
    }}finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}

    /**
     * Validates that the string is not empty
     * @param string the string to test
     * @param msg message to output if validation fails
     */
    public static void notEmpty(String string, String msg) {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1239);
        __CLR4_2_1x7x7jpaexqbq.R.inc(1240);if ((((string == null || string.length() == 0)&&(__CLR4_2_1x7x7jpaexqbq.R.iget(1241)!=0|true))||(__CLR4_2_1x7x7jpaexqbq.R.iget(1242)==0&false)))
            {__CLR4_2_1x7x7jpaexqbq.R.inc(1243);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}

    /**
     Cause a failure.
     @param msg message to output.
     */
    public static void fail(String msg) {try{__CLR4_2_1x7x7jpaexqbq.R.inc(1244);
        __CLR4_2_1x7x7jpaexqbq.R.inc(1245);throw new IllegalArgumentException(msg);
    }finally{__CLR4_2_1x7x7jpaexqbq.R.flushNeeded();}}
}
