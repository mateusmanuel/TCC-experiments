/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package tutorial;

import java.util.EmptyStackException;

public class Stack<T> {public static class __CLR4_2_100jp2n3qss{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u0073\u0074\u0061\u0063\u006b\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543498414402L,8589935092L,14,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private int capacity = 10;
    private int pointer  = 0;
    private T[] objects = (T[]) new Object[capacity];
    
    public void push(T o) {try{__CLR4_2_100jp2n3qss.R.inc(0);
	__CLR4_2_100jp2n3qss.R.inc(1);if((((pointer >= capacity)&&(__CLR4_2_100jp2n3qss.R.iget(2)!=0|true))||(__CLR4_2_100jp2n3qss.R.iget(3)==0&false)))
	    {__CLR4_2_100jp2n3qss.R.inc(4);throw new RuntimeException("Stack exceeded capacity!");
	}__CLR4_2_100jp2n3qss.R.inc(5);objects[pointer++] = o;
    }finally{__CLR4_2_100jp2n3qss.R.flushNeeded();}}
    public T pop() {try{__CLR4_2_100jp2n3qss.R.inc(6);
	__CLR4_2_100jp2n3qss.R.inc(7);if((((pointer <= 0)&&(__CLR4_2_100jp2n3qss.R.iget(8)!=0|true))||(__CLR4_2_100jp2n3qss.R.iget(9)==0&false)))
	    {__CLR4_2_100jp2n3qss.R.inc(10);throw new EmptyStackException();
	}__CLR4_2_100jp2n3qss.R.inc(11);return objects[--pointer];
    }finally{__CLR4_2_100jp2n3qss.R.flushNeeded();}}
    public boolean isEmpty() {try{__CLR4_2_100jp2n3qss.R.inc(12);
	__CLR4_2_100jp2n3qss.R.inc(13);return pointer <= 0;
    }finally{__CLR4_2_100jp2n3qss.R.flushNeeded();}} 
}
