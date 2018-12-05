/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter.FilterResult;

/**
 * Depth-first node traversor. Use to iterate through all nodes under and including the specified root node.
 * <p>
 * This implementation does not use recursion, so a deep DOM does not risk blowing the stack.
 * </p>
 */
public class NodeTraversor {public static class __CLR4_2_17lx7lxjpaexqsc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,9957,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private NodeVisitor visitor;

    /**
     * Create a new traversor.
     * @param visitor a class implementing the {@link NodeVisitor} interface, to be called when visiting each node.
     * @deprecated Just use the static {@link NodeTraversor#filter(NodeFilter, Node)} method.
     */
    public NodeTraversor(NodeVisitor visitor) {try{__CLR4_2_17lx7lxjpaexqsc.R.inc(9861);
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9862);this.visitor = visitor;
    }finally{__CLR4_2_17lx7lxjpaexqsc.R.flushNeeded();}}

    /**
     * Start a depth-first traverse of the root and all of its descendants.
     * @param root the root node point to traverse.
     * @deprecated Just use the static {@link NodeTraversor#filter(NodeFilter, Node)} method.
     */
    public void traverse(Node root) {try{__CLR4_2_17lx7lxjpaexqsc.R.inc(9863);
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9864);traverse(visitor, root);
    }finally{__CLR4_2_17lx7lxjpaexqsc.R.flushNeeded();}}

    /**
     * Start a depth-first traverse of the root and all of its descendants.
     * @param visitor Node visitor.
     * @param root the root node point to traverse.
     */
    public static void traverse(NodeVisitor visitor, Node root) {try{__CLR4_2_17lx7lxjpaexqsc.R.inc(9865);
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9866);Node node = root;
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9867);int depth = 0;
        
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9868);while ((((node != null)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9869)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9870)==0&false))) {{
            __CLR4_2_17lx7lxjpaexqsc.R.inc(9871);visitor.head(node, depth);
            __CLR4_2_17lx7lxjpaexqsc.R.inc(9872);if ((((node.childNodeSize() > 0)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9873)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9874)==0&false))) {{
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9875);node = node.childNode(0);
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9876);depth++;
            } }else {{
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9877);while ((((node.nextSibling() == null && depth > 0)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9878)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9879)==0&false))) {{
                    __CLR4_2_17lx7lxjpaexqsc.R.inc(9880);visitor.tail(node, depth);
                    __CLR4_2_17lx7lxjpaexqsc.R.inc(9881);node = node.parentNode();
                    __CLR4_2_17lx7lxjpaexqsc.R.inc(9882);depth--;
                }
                }__CLR4_2_17lx7lxjpaexqsc.R.inc(9883);visitor.tail(node, depth);
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9884);if ((((node == root)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9885)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9886)==0&false)))
                    {__CLR4_2_17lx7lxjpaexqsc.R.inc(9887);break;
                }__CLR4_2_17lx7lxjpaexqsc.R.inc(9888);node = node.nextSibling();
            }
        }}
    }}finally{__CLR4_2_17lx7lxjpaexqsc.R.flushNeeded();}}

    /**
     * Start a depth-first traverse of all elements.
     * @param visitor Node visitor.
     * @param elements Elements to filter.
     */
    public static void traverse(NodeVisitor visitor, Elements elements) {try{__CLR4_2_17lx7lxjpaexqsc.R.inc(9889);
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9890);Validate.notNull(visitor);
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9891);Validate.notNull(elements);
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9892);for (Element el : elements)
            {__CLR4_2_17lx7lxjpaexqsc.R.inc(9893);traverse(visitor, el);
    }}finally{__CLR4_2_17lx7lxjpaexqsc.R.flushNeeded();}}

    /**
     * Start a depth-first filtering of the root and all of its descendants.
     * @param filter Node visitor.
     * @param root the root node point to traverse.
     * @return The filter result of the root node, or {@link FilterResult#STOP}.
     */
    public static FilterResult filter(NodeFilter filter, Node root) {try{__CLR4_2_17lx7lxjpaexqsc.R.inc(9894);
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9895);Node node = root;
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9896);int depth = 0;

        __CLR4_2_17lx7lxjpaexqsc.R.inc(9897);while ((((node != null)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9898)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9899)==0&false))) {{
            __CLR4_2_17lx7lxjpaexqsc.R.inc(9900);FilterResult result = filter.head(node, depth);
            __CLR4_2_17lx7lxjpaexqsc.R.inc(9901);if ((((result == FilterResult.STOP)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9902)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9903)==0&false)))
                {__CLR4_2_17lx7lxjpaexqsc.R.inc(9904);return result;
            // Descend into child nodes:
            }__CLR4_2_17lx7lxjpaexqsc.R.inc(9905);if ((((result == FilterResult.CONTINUE && node.childNodeSize() > 0)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9906)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9907)==0&false))) {{
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9908);node = node.childNode(0);
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9909);++depth;
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9910);continue;
            }
            // No siblings, move upwards:
            }__CLR4_2_17lx7lxjpaexqsc.R.inc(9911);while ((((node.nextSibling() == null && depth > 0)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9912)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9913)==0&false))) {{
                // 'tail' current node:
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9914);if ((((result == FilterResult.CONTINUE || result == FilterResult.SKIP_CHILDREN)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9915)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9916)==0&false))) {{
                    __CLR4_2_17lx7lxjpaexqsc.R.inc(9917);result = filter.tail(node, depth);
                    __CLR4_2_17lx7lxjpaexqsc.R.inc(9918);if ((((result == FilterResult.STOP)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9919)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9920)==0&false)))
                        {__CLR4_2_17lx7lxjpaexqsc.R.inc(9921);return result;
                }}
                }__CLR4_2_17lx7lxjpaexqsc.R.inc(9922);Node prev = node; // In case we need to remove it below.
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9923);node = node.parentNode();
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9924);depth--;
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9925);if ((((result == FilterResult.REMOVE)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9926)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9927)==0&false)))
                    {__CLR4_2_17lx7lxjpaexqsc.R.inc(9928);prev.remove(); // Remove AFTER finding parent.
                }__CLR4_2_17lx7lxjpaexqsc.R.inc(9929);result = FilterResult.CONTINUE; // Parent was not pruned.
            }
            // 'tail' current node, then proceed with siblings:
            }__CLR4_2_17lx7lxjpaexqsc.R.inc(9930);if ((((result == FilterResult.CONTINUE || result == FilterResult.SKIP_CHILDREN)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9931)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9932)==0&false))) {{
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9933);result = filter.tail(node, depth);
                __CLR4_2_17lx7lxjpaexqsc.R.inc(9934);if ((((result == FilterResult.STOP)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9935)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9936)==0&false)))
                    {__CLR4_2_17lx7lxjpaexqsc.R.inc(9937);return result;
            }}
            }__CLR4_2_17lx7lxjpaexqsc.R.inc(9938);if ((((node == root)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9939)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9940)==0&false)))
                {__CLR4_2_17lx7lxjpaexqsc.R.inc(9941);return result;
            }__CLR4_2_17lx7lxjpaexqsc.R.inc(9942);Node prev = node; // In case we need to remove it below.
            __CLR4_2_17lx7lxjpaexqsc.R.inc(9943);node = node.nextSibling();
            __CLR4_2_17lx7lxjpaexqsc.R.inc(9944);if ((((result == FilterResult.REMOVE)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9945)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9946)==0&false)))
                {__CLR4_2_17lx7lxjpaexqsc.R.inc(9947);prev.remove(); // Remove AFTER finding sibling.
        }}
        // root == null?
        }__CLR4_2_17lx7lxjpaexqsc.R.inc(9948);return FilterResult.CONTINUE;
    }finally{__CLR4_2_17lx7lxjpaexqsc.R.flushNeeded();}}

    /**
     * Start a depth-first filtering of all elements.
     * @param filter Node filter.
     * @param elements Elements to filter.
     */
    public static void filter(NodeFilter filter, Elements elements) {try{__CLR4_2_17lx7lxjpaexqsc.R.inc(9949);
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9950);Validate.notNull(filter);
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9951);Validate.notNull(elements);
        __CLR4_2_17lx7lxjpaexqsc.R.inc(9952);for (Element el : elements)
            {__CLR4_2_17lx7lxjpaexqsc.R.inc(9953);if ((((filter(filter, el) == FilterResult.STOP)&&(__CLR4_2_17lx7lxjpaexqsc.R.iget(9954)!=0|true))||(__CLR4_2_17lx7lxjpaexqsc.R.iget(9955)==0&false)))
                {__CLR4_2_17lx7lxjpaexqsc.R.inc(9956);break;
    }}}finally{__CLR4_2_17lx7lxjpaexqsc.R.flushNeeded();}}
}
