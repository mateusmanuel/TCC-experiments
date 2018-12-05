/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.jsoup.select.NodeFilter.FilterResult.CONTINUE;
import static org.jsoup.select.NodeFilter.FilterResult.STOP;

/**
 * Collects a list of elements that match the supplied criteria.
 *
 * @author Jonathan Hedley
 */
public class Collector {public static class __CLR4_2_174i74ijpaexqr6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,9273,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Collector() {try{__CLR4_2_174i74ijpaexqr6.R.inc(9234);
    }finally{__CLR4_2_174i74ijpaexqr6.R.flushNeeded();}}

    /**
     Build a list of elements, by visiting root and every descendant of root, and testing it against the evaluator.
     @param eval Evaluator to test elements against
     @param root root of tree to descend
     @return list of matches; empty if none
     */
    public static Elements collect (Evaluator eval, Element root) {try{__CLR4_2_174i74ijpaexqr6.R.inc(9235);
        __CLR4_2_174i74ijpaexqr6.R.inc(9236);Elements elements = new Elements();
        __CLR4_2_174i74ijpaexqr6.R.inc(9237);NodeTraversor.traverse(new Accumulator(root, elements, eval), root);
        __CLR4_2_174i74ijpaexqr6.R.inc(9238);return elements;
    }finally{__CLR4_2_174i74ijpaexqr6.R.flushNeeded();}}

    private static class Accumulator implements NodeVisitor {
        private final Element root;
        private final Elements elements;
        private final Evaluator eval;

        Accumulator(Element root, Elements elements, Evaluator eval) {try{__CLR4_2_174i74ijpaexqr6.R.inc(9239);
            __CLR4_2_174i74ijpaexqr6.R.inc(9240);this.root = root;
            __CLR4_2_174i74ijpaexqr6.R.inc(9241);this.elements = elements;
            __CLR4_2_174i74ijpaexqr6.R.inc(9242);this.eval = eval;
        }finally{__CLR4_2_174i74ijpaexqr6.R.flushNeeded();}}

        public void head(Node node, int depth) {try{__CLR4_2_174i74ijpaexqr6.R.inc(9243);
            __CLR4_2_174i74ijpaexqr6.R.inc(9244);if ((((node instanceof Element)&&(__CLR4_2_174i74ijpaexqr6.R.iget(9245)!=0|true))||(__CLR4_2_174i74ijpaexqr6.R.iget(9246)==0&false))) {{
                __CLR4_2_174i74ijpaexqr6.R.inc(9247);Element el = (Element) node;
                __CLR4_2_174i74ijpaexqr6.R.inc(9248);if ((((eval.matches(root, el))&&(__CLR4_2_174i74ijpaexqr6.R.iget(9249)!=0|true))||(__CLR4_2_174i74ijpaexqr6.R.iget(9250)==0&false)))
                    {__CLR4_2_174i74ijpaexqr6.R.inc(9251);elements.add(el);
            }}
        }}finally{__CLR4_2_174i74ijpaexqr6.R.flushNeeded();}}

        public void tail(Node node, int depth) {try{__CLR4_2_174i74ijpaexqr6.R.inc(9252);
            // void
        }finally{__CLR4_2_174i74ijpaexqr6.R.flushNeeded();}}
    }

    public static Element findFirst(Evaluator eval, Element root) {try{__CLR4_2_174i74ijpaexqr6.R.inc(9253);
        __CLR4_2_174i74ijpaexqr6.R.inc(9254);FirstFinder finder = new FirstFinder(root, eval);
        __CLR4_2_174i74ijpaexqr6.R.inc(9255);NodeTraversor.filter(finder, root);
        __CLR4_2_174i74ijpaexqr6.R.inc(9256);return finder.match;
    }finally{__CLR4_2_174i74ijpaexqr6.R.flushNeeded();}}

    private static class FirstFinder implements NodeFilter {
        private final Element root;
        private Element match = null;
        private final Evaluator eval;

        FirstFinder(Element root, Evaluator eval) {try{__CLR4_2_174i74ijpaexqr6.R.inc(9257);
            __CLR4_2_174i74ijpaexqr6.R.inc(9258);this.root = root;
            __CLR4_2_174i74ijpaexqr6.R.inc(9259);this.eval = eval;
        }finally{__CLR4_2_174i74ijpaexqr6.R.flushNeeded();}}

        @Override
        public FilterResult head(Node node, int depth) {try{__CLR4_2_174i74ijpaexqr6.R.inc(9260);
            __CLR4_2_174i74ijpaexqr6.R.inc(9261);if ((((node instanceof Element)&&(__CLR4_2_174i74ijpaexqr6.R.iget(9262)!=0|true))||(__CLR4_2_174i74ijpaexqr6.R.iget(9263)==0&false))) {{
                __CLR4_2_174i74ijpaexqr6.R.inc(9264);Element el = (Element) node;
                __CLR4_2_174i74ijpaexqr6.R.inc(9265);if ((((eval.matches(root, el))&&(__CLR4_2_174i74ijpaexqr6.R.iget(9266)!=0|true))||(__CLR4_2_174i74ijpaexqr6.R.iget(9267)==0&false))) {{
                    __CLR4_2_174i74ijpaexqr6.R.inc(9268);match = el;
                    __CLR4_2_174i74ijpaexqr6.R.inc(9269);return STOP;
                }
            }}
            }__CLR4_2_174i74ijpaexqr6.R.inc(9270);return CONTINUE;
        }finally{__CLR4_2_174i74ijpaexqr6.R.flushNeeded();}}

        @Override
        public FilterResult tail(Node node, int depth) {try{__CLR4_2_174i74ijpaexqr6.R.inc(9271);
            __CLR4_2_174i74ijpaexqr6.R.inc(9272);return CONTINUE;
        }finally{__CLR4_2_174i74ijpaexqr6.R.flushNeeded();}}
    }

}
