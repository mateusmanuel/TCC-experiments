/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.select;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Base combining (and, or) evaluator.
 */
abstract class CombiningEvaluator extends Evaluator {public static class __CLR4_2_175l75ljpaexqr9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,9331,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final ArrayList<Evaluator> evaluators;
    int num = 0;

    CombiningEvaluator() {
        super();__CLR4_2_175l75ljpaexqr9.R.inc(9274);try{__CLR4_2_175l75ljpaexqr9.R.inc(9273);
        __CLR4_2_175l75ljpaexqr9.R.inc(9275);evaluators = new ArrayList<>();
    }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

    CombiningEvaluator(Collection<Evaluator> evaluators) {
        this();__CLR4_2_175l75ljpaexqr9.R.inc(9277);try{__CLR4_2_175l75ljpaexqr9.R.inc(9276);
        __CLR4_2_175l75ljpaexqr9.R.inc(9278);this.evaluators.addAll(evaluators);
        __CLR4_2_175l75ljpaexqr9.R.inc(9279);updateNumEvaluators();
    }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

    Evaluator rightMostEvaluator() {try{__CLR4_2_175l75ljpaexqr9.R.inc(9280);
        __CLR4_2_175l75ljpaexqr9.R.inc(9281);return (((num > 0 )&&(__CLR4_2_175l75ljpaexqr9.R.iget(9282)!=0|true))||(__CLR4_2_175l75ljpaexqr9.R.iget(9283)==0&false))? evaluators.get(num - 1) : null;
    }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}
    
    void replaceRightMostEvaluator(Evaluator replacement) {try{__CLR4_2_175l75ljpaexqr9.R.inc(9284);
        __CLR4_2_175l75ljpaexqr9.R.inc(9285);evaluators.set(num - 1, replacement);
    }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

    void updateNumEvaluators() {try{__CLR4_2_175l75ljpaexqr9.R.inc(9286);
        // used so we don't need to bash on size() for every match test
        __CLR4_2_175l75ljpaexqr9.R.inc(9287);num = evaluators.size();
    }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

    static final class And extends CombiningEvaluator {
        And(Collection<Evaluator> evaluators) {
            super(evaluators);__CLR4_2_175l75ljpaexqr9.R.inc(9289);try{__CLR4_2_175l75ljpaexqr9.R.inc(9288);
        }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

        And(Evaluator... evaluators) {
            this(Arrays.asList(evaluators));__CLR4_2_175l75ljpaexqr9.R.inc(9291);try{__CLR4_2_175l75ljpaexqr9.R.inc(9290);
        }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element node) {try{__CLR4_2_175l75ljpaexqr9.R.inc(9292);
            __CLR4_2_175l75ljpaexqr9.R.inc(9293);for (int i = 0; (((i < num)&&(__CLR4_2_175l75ljpaexqr9.R.iget(9294)!=0|true))||(__CLR4_2_175l75ljpaexqr9.R.iget(9295)==0&false)); i++) {{
                __CLR4_2_175l75ljpaexqr9.R.inc(9296);Evaluator s = evaluators.get(i);
                __CLR4_2_175l75ljpaexqr9.R.inc(9297);if ((((!s.matches(root, node))&&(__CLR4_2_175l75ljpaexqr9.R.iget(9298)!=0|true))||(__CLR4_2_175l75ljpaexqr9.R.iget(9299)==0&false)))
                    {__CLR4_2_175l75ljpaexqr9.R.inc(9300);return false;
            }}
            }__CLR4_2_175l75ljpaexqr9.R.inc(9301);return true;
        }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_175l75ljpaexqr9.R.inc(9302);
            __CLR4_2_175l75ljpaexqr9.R.inc(9303);return StringUtil.join(evaluators, " ");
        }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}
    }

    static final class Or extends CombiningEvaluator {
        /**
         * Create a new Or evaluator. The initial evaluators are ANDed together and used as the first clause of the OR.
         * @param evaluators initial OR clause (these are wrapped into an AND evaluator).
         */
        Or(Collection<Evaluator> evaluators) {
            super();__CLR4_2_175l75ljpaexqr9.R.inc(9305);try{__CLR4_2_175l75ljpaexqr9.R.inc(9304);
            __CLR4_2_175l75ljpaexqr9.R.inc(9306);if ((((num > 1)&&(__CLR4_2_175l75ljpaexqr9.R.iget(9307)!=0|true))||(__CLR4_2_175l75ljpaexqr9.R.iget(9308)==0&false)))
                {__CLR4_2_175l75ljpaexqr9.R.inc(9309);this.evaluators.add(new And(evaluators));
            }else // 0 or 1
                {__CLR4_2_175l75ljpaexqr9.R.inc(9310);this.evaluators.addAll(evaluators);
            }__CLR4_2_175l75ljpaexqr9.R.inc(9311);updateNumEvaluators();
        }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

        Or(Evaluator... evaluators) { this(Arrays.asList(evaluators));__CLR4_2_175l75ljpaexqr9.R.inc(9313);try{__CLR4_2_175l75ljpaexqr9.R.inc(9312); }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

        Or() {
            super();__CLR4_2_175l75ljpaexqr9.R.inc(9315);try{__CLR4_2_175l75ljpaexqr9.R.inc(9314);
        }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

        public void add(Evaluator e) {try{__CLR4_2_175l75ljpaexqr9.R.inc(9316);
            __CLR4_2_175l75ljpaexqr9.R.inc(9317);evaluators.add(e);
            __CLR4_2_175l75ljpaexqr9.R.inc(9318);updateNumEvaluators();
        }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element node) {try{__CLR4_2_175l75ljpaexqr9.R.inc(9319);
            __CLR4_2_175l75ljpaexqr9.R.inc(9320);for (int i = 0; (((i < num)&&(__CLR4_2_175l75ljpaexqr9.R.iget(9321)!=0|true))||(__CLR4_2_175l75ljpaexqr9.R.iget(9322)==0&false)); i++) {{
                __CLR4_2_175l75ljpaexqr9.R.inc(9323);Evaluator s = evaluators.get(i);
                __CLR4_2_175l75ljpaexqr9.R.inc(9324);if ((((s.matches(root, node))&&(__CLR4_2_175l75ljpaexqr9.R.iget(9325)!=0|true))||(__CLR4_2_175l75ljpaexqr9.R.iget(9326)==0&false)))
                    {__CLR4_2_175l75ljpaexqr9.R.inc(9327);return true;
            }}
            }__CLR4_2_175l75ljpaexqr9.R.inc(9328);return false;
        }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_175l75ljpaexqr9.R.inc(9329);
            __CLR4_2_175l75ljpaexqr9.R.inc(9330);return StringUtil.join(evaluators, ", ");
        }finally{__CLR4_2_175l75ljpaexqr9.R.flushNeeded();}}
    }
}
