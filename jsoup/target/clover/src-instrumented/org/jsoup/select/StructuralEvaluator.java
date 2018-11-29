/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.select;

import org.jsoup.nodes.Element;

/**
 * Base structural evaluator.
 */
abstract class StructuralEvaluator extends Evaluator {public static class __CLR4_2_1803803jp2rxacp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543506510356L,8589935092L,10452,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Evaluator evaluator;

    static class Root extends Evaluator {
        public boolean matches(Element root, Element element) {try{__CLR4_2_1803803jp2rxacp.R.inc(10371);
            __CLR4_2_1803803jp2rxacp.R.inc(10372);return root == element;
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}
    }

    static class Has extends StructuralEvaluator {
        public Has(Evaluator evaluator) {try{__CLR4_2_1803803jp2rxacp.R.inc(10373);
            __CLR4_2_1803803jp2rxacp.R.inc(10374);this.evaluator = evaluator;
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_2_1803803jp2rxacp.R.inc(10375);
            __CLR4_2_1803803jp2rxacp.R.inc(10376);for (Element e : element.getAllElements()) {{
                __CLR4_2_1803803jp2rxacp.R.inc(10377);if ((((e != element && evaluator.matches(root, e))&&(__CLR4_2_1803803jp2rxacp.R.iget(10378)!=0|true))||(__CLR4_2_1803803jp2rxacp.R.iget(10379)==0&false)))
                    {__CLR4_2_1803803jp2rxacp.R.inc(10380);return true;
            }}
            }__CLR4_2_1803803jp2rxacp.R.inc(10381);return false;
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1803803jp2rxacp.R.inc(10382);
            __CLR4_2_1803803jp2rxacp.R.inc(10383);return String.format(":has(%s)", evaluator);
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}
    }

    static class Not extends StructuralEvaluator {
        public Not(Evaluator evaluator) {try{__CLR4_2_1803803jp2rxacp.R.inc(10384);
            __CLR4_2_1803803jp2rxacp.R.inc(10385);this.evaluator = evaluator;
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        public boolean matches(Element root, Element node) {try{__CLR4_2_1803803jp2rxacp.R.inc(10386);
            __CLR4_2_1803803jp2rxacp.R.inc(10387);return !evaluator.matches(root, node);
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1803803jp2rxacp.R.inc(10388);
            __CLR4_2_1803803jp2rxacp.R.inc(10389);return String.format(":not%s", evaluator);
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}
    }

    static class Parent extends StructuralEvaluator {
        public Parent(Evaluator evaluator) {try{__CLR4_2_1803803jp2rxacp.R.inc(10390);
            __CLR4_2_1803803jp2rxacp.R.inc(10391);this.evaluator = evaluator;
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_2_1803803jp2rxacp.R.inc(10392);
            __CLR4_2_1803803jp2rxacp.R.inc(10393);if ((((root == element)&&(__CLR4_2_1803803jp2rxacp.R.iget(10394)!=0|true))||(__CLR4_2_1803803jp2rxacp.R.iget(10395)==0&false)))
                {__CLR4_2_1803803jp2rxacp.R.inc(10396);return false;

            }__CLR4_2_1803803jp2rxacp.R.inc(10397);Element parent = element.parent();
            __CLR4_2_1803803jp2rxacp.R.inc(10398);while (true) {{
                __CLR4_2_1803803jp2rxacp.R.inc(10399);if ((((evaluator.matches(root, parent))&&(__CLR4_2_1803803jp2rxacp.R.iget(10400)!=0|true))||(__CLR4_2_1803803jp2rxacp.R.iget(10401)==0&false)))
                    {__CLR4_2_1803803jp2rxacp.R.inc(10402);return true;
                }__CLR4_2_1803803jp2rxacp.R.inc(10403);if ((((parent == root)&&(__CLR4_2_1803803jp2rxacp.R.iget(10404)!=0|true))||(__CLR4_2_1803803jp2rxacp.R.iget(10405)==0&false)))
                    {__CLR4_2_1803803jp2rxacp.R.inc(10406);break;
                }__CLR4_2_1803803jp2rxacp.R.inc(10407);parent = parent.parent();
            }
            }__CLR4_2_1803803jp2rxacp.R.inc(10408);return false;
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1803803jp2rxacp.R.inc(10409);
            __CLR4_2_1803803jp2rxacp.R.inc(10410);return String.format(":parent%s", evaluator);
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}
    }

    static class ImmediateParent extends StructuralEvaluator {
        public ImmediateParent(Evaluator evaluator) {try{__CLR4_2_1803803jp2rxacp.R.inc(10411);
            __CLR4_2_1803803jp2rxacp.R.inc(10412);this.evaluator = evaluator;
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_2_1803803jp2rxacp.R.inc(10413);
            __CLR4_2_1803803jp2rxacp.R.inc(10414);if ((((root == element)&&(__CLR4_2_1803803jp2rxacp.R.iget(10415)!=0|true))||(__CLR4_2_1803803jp2rxacp.R.iget(10416)==0&false)))
                {__CLR4_2_1803803jp2rxacp.R.inc(10417);return false;

            }__CLR4_2_1803803jp2rxacp.R.inc(10418);Element parent = element.parent();
            __CLR4_2_1803803jp2rxacp.R.inc(10419);return parent != null && evaluator.matches(root, parent);
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1803803jp2rxacp.R.inc(10420);
            __CLR4_2_1803803jp2rxacp.R.inc(10421);return String.format(":ImmediateParent%s", evaluator);
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}
    }

    static class PreviousSibling extends StructuralEvaluator {
        public PreviousSibling(Evaluator evaluator) {try{__CLR4_2_1803803jp2rxacp.R.inc(10422);
            __CLR4_2_1803803jp2rxacp.R.inc(10423);this.evaluator = evaluator;
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_2_1803803jp2rxacp.R.inc(10424);
            __CLR4_2_1803803jp2rxacp.R.inc(10425);if ((((root == element)&&(__CLR4_2_1803803jp2rxacp.R.iget(10426)!=0|true))||(__CLR4_2_1803803jp2rxacp.R.iget(10427)==0&false)))
                {__CLR4_2_1803803jp2rxacp.R.inc(10428);return false;

            }__CLR4_2_1803803jp2rxacp.R.inc(10429);Element prev = element.previousElementSibling();

            __CLR4_2_1803803jp2rxacp.R.inc(10430);while ((((prev != null)&&(__CLR4_2_1803803jp2rxacp.R.iget(10431)!=0|true))||(__CLR4_2_1803803jp2rxacp.R.iget(10432)==0&false))) {{
                __CLR4_2_1803803jp2rxacp.R.inc(10433);if ((((evaluator.matches(root, prev))&&(__CLR4_2_1803803jp2rxacp.R.iget(10434)!=0|true))||(__CLR4_2_1803803jp2rxacp.R.iget(10435)==0&false)))
                    {__CLR4_2_1803803jp2rxacp.R.inc(10436);return true;

                }__CLR4_2_1803803jp2rxacp.R.inc(10437);prev = prev.previousElementSibling();
            }
            }__CLR4_2_1803803jp2rxacp.R.inc(10438);return false;
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1803803jp2rxacp.R.inc(10439);
            __CLR4_2_1803803jp2rxacp.R.inc(10440);return String.format(":prev*%s", evaluator);
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}
    }

    static class ImmediatePreviousSibling extends StructuralEvaluator {
        public ImmediatePreviousSibling(Evaluator evaluator) {try{__CLR4_2_1803803jp2rxacp.R.inc(10441);
            __CLR4_2_1803803jp2rxacp.R.inc(10442);this.evaluator = evaluator;
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_2_1803803jp2rxacp.R.inc(10443);
            __CLR4_2_1803803jp2rxacp.R.inc(10444);if ((((root == element)&&(__CLR4_2_1803803jp2rxacp.R.iget(10445)!=0|true))||(__CLR4_2_1803803jp2rxacp.R.iget(10446)==0&false)))
                {__CLR4_2_1803803jp2rxacp.R.inc(10447);return false;

            }__CLR4_2_1803803jp2rxacp.R.inc(10448);Element prev = element.previousElementSibling();
            __CLR4_2_1803803jp2rxacp.R.inc(10449);return prev != null && evaluator.matches(root, prev);
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1803803jp2rxacp.R.inc(10450);
            __CLR4_2_1803803jp2rxacp.R.inc(10451);return String.format(":prev%s", evaluator);
        }finally{__CLR4_2_1803803jp2rxacp.R.flushNeeded();}}
    }
}
