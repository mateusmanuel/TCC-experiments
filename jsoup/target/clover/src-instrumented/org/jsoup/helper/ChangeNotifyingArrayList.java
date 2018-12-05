/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.helper;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Implementation of ArrayList that watches out for changes to the contents.
 */
public abstract class ChangeNotifyingArrayList<E> extends ArrayList<E> {public static class __CLR4_2_15f5fjpaexq8v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,230,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public ChangeNotifyingArrayList(int initialCapacity) {
        super(initialCapacity);__CLR4_2_15f5fjpaexq8v.R.inc(196);try{__CLR4_2_15f5fjpaexq8v.R.inc(195);
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

    public abstract void onContentsChanged();

    @Override
    public E set(int index, E element) {try{__CLR4_2_15f5fjpaexq8v.R.inc(197);
        __CLR4_2_15f5fjpaexq8v.R.inc(198);onContentsChanged();
        __CLR4_2_15f5fjpaexq8v.R.inc(199);return super.set(index, element);
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

    @Override
    public boolean add(E e) {try{__CLR4_2_15f5fjpaexq8v.R.inc(200);
        __CLR4_2_15f5fjpaexq8v.R.inc(201);onContentsChanged();
        __CLR4_2_15f5fjpaexq8v.R.inc(202);return super.add(e);
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

    @Override
    public void add(int index, E element) {try{__CLR4_2_15f5fjpaexq8v.R.inc(203);
        __CLR4_2_15f5fjpaexq8v.R.inc(204);onContentsChanged();
        __CLR4_2_15f5fjpaexq8v.R.inc(205);super.add(index, element);
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

    @Override
    public E remove(int index) {try{__CLR4_2_15f5fjpaexq8v.R.inc(206);
        __CLR4_2_15f5fjpaexq8v.R.inc(207);onContentsChanged();
        __CLR4_2_15f5fjpaexq8v.R.inc(208);return super.remove(index);
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

    @Override
    public boolean remove(Object o) {try{__CLR4_2_15f5fjpaexq8v.R.inc(209);
        __CLR4_2_15f5fjpaexq8v.R.inc(210);onContentsChanged();
        __CLR4_2_15f5fjpaexq8v.R.inc(211);return super.remove(o);
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

    @Override
    public void clear() {try{__CLR4_2_15f5fjpaexq8v.R.inc(212);
        __CLR4_2_15f5fjpaexq8v.R.inc(213);onContentsChanged();
        __CLR4_2_15f5fjpaexq8v.R.inc(214);super.clear();
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

    @Override
    public boolean addAll(Collection<? extends E> c) {try{__CLR4_2_15f5fjpaexq8v.R.inc(215);
        __CLR4_2_15f5fjpaexq8v.R.inc(216);onContentsChanged();
        __CLR4_2_15f5fjpaexq8v.R.inc(217);return super.addAll(c);
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {try{__CLR4_2_15f5fjpaexq8v.R.inc(218);
        __CLR4_2_15f5fjpaexq8v.R.inc(219);onContentsChanged();
        __CLR4_2_15f5fjpaexq8v.R.inc(220);return super.addAll(index, c);
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

    @Override
    protected void removeRange(int fromIndex, int toIndex) {try{__CLR4_2_15f5fjpaexq8v.R.inc(221);
        __CLR4_2_15f5fjpaexq8v.R.inc(222);onContentsChanged();
        __CLR4_2_15f5fjpaexq8v.R.inc(223);super.removeRange(fromIndex, toIndex);
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

    @Override
    public boolean removeAll(Collection<?> c) {try{__CLR4_2_15f5fjpaexq8v.R.inc(224);
        __CLR4_2_15f5fjpaexq8v.R.inc(225);onContentsChanged();
        __CLR4_2_15f5fjpaexq8v.R.inc(226);return super.removeAll(c);
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

    @Override
    public boolean retainAll(Collection<?> c) {try{__CLR4_2_15f5fjpaexq8v.R.inc(227);
        __CLR4_2_15f5fjpaexq8v.R.inc(228);onContentsChanged();
        __CLR4_2_15f5fjpaexq8v.R.inc(229);return super.retainAll(c);
    }finally{__CLR4_2_15f5fjpaexq8v.R.flushNeeded();}}

}
