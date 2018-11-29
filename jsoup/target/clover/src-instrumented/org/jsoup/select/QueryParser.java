/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.select;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.TokenQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.jsoup.internal.Normalizer.normalize;

/**
 * Parses a CSS selector into an Evaluator tree.
 */
public class QueryParser {public static class __CLR4_2_17ol7oljp2rxacb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543506510356L,8589935092L,10328,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static String[] combinators = {",", ">", "+", "~", " "};
    private static final String[] AttributeEvals = new String[]{"=", "!=", "^=", "$=", "*=", "~="};

    private TokenQueue tq;
    private String query;
    private List<Evaluator> evals = new ArrayList<>();

    /**
     * Create a new QueryParser.
     * @param query CSS query
     */
    private QueryParser(String query) {try{__CLR4_2_17ol7oljp2rxacb.R.inc(9957);
        __CLR4_2_17ol7oljp2rxacb.R.inc(9958);this.query = query;
        __CLR4_2_17ol7oljp2rxacb.R.inc(9959);this.tq = new TokenQueue(query);
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    /**
     * Parse a CSS query into an Evaluator.
     * @param query CSS query
     * @return Evaluator
     */
    public static Evaluator parse(String query) {try{__CLR4_2_17ol7oljp2rxacb.R.inc(9960);
        __CLR4_2_17ol7oljp2rxacb.R.inc(9961);try {
            __CLR4_2_17ol7oljp2rxacb.R.inc(9962);QueryParser p = new QueryParser(query);
            __CLR4_2_17ol7oljp2rxacb.R.inc(9963);return p.parse();
        } catch (IllegalArgumentException e) {
            __CLR4_2_17ol7oljp2rxacb.R.inc(9964);throw new Selector.SelectorParseException(e.getMessage());
        }
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    /**
     * Parse the query
     * @return Evaluator
     */
    Evaluator parse() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(9965);
        __CLR4_2_17ol7oljp2rxacb.R.inc(9966);tq.consumeWhitespace();

        __CLR4_2_17ol7oljp2rxacb.R.inc(9967);if ((((tq.matchesAny(combinators))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(9968)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(9969)==0&false))) {{ // if starts with a combinator, use root as elements
            __CLR4_2_17ol7oljp2rxacb.R.inc(9970);evals.add(new StructuralEvaluator.Root());
            __CLR4_2_17ol7oljp2rxacb.R.inc(9971);combinator(tq.consume());
        } }else {{
            __CLR4_2_17ol7oljp2rxacb.R.inc(9972);findElements();
        }

        }__CLR4_2_17ol7oljp2rxacb.R.inc(9973);while ((((!tq.isEmpty())&&(__CLR4_2_17ol7oljp2rxacb.R.iget(9974)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(9975)==0&false))) {{
            // hierarchy and extras
            __CLR4_2_17ol7oljp2rxacb.R.inc(9976);boolean seenWhite = tq.consumeWhitespace();

            __CLR4_2_17ol7oljp2rxacb.R.inc(9977);if ((((tq.matchesAny(combinators))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(9978)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(9979)==0&false))) {{
                __CLR4_2_17ol7oljp2rxacb.R.inc(9980);combinator(tq.consume());
            } }else {__CLR4_2_17ol7oljp2rxacb.R.inc(9981);if ((((seenWhite)&&(__CLR4_2_17ol7oljp2rxacb.R.iget(9982)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(9983)==0&false))) {{
                __CLR4_2_17ol7oljp2rxacb.R.inc(9984);combinator(' ');
            } }else {{ // E.class, E#id, E[attr] etc. AND
                __CLR4_2_17ol7oljp2rxacb.R.inc(9985);findElements(); // take next el, #. etc off queue
            }
        }}}

        }__CLR4_2_17ol7oljp2rxacb.R.inc(9986);if ((((evals.size() == 1)&&(__CLR4_2_17ol7oljp2rxacb.R.iget(9987)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(9988)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(9989);return evals.get(0);

        }__CLR4_2_17ol7oljp2rxacb.R.inc(9990);return new CombiningEvaluator.And(evals);
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    private void combinator(char combinator) {try{__CLR4_2_17ol7oljp2rxacb.R.inc(9991);
        __CLR4_2_17ol7oljp2rxacb.R.inc(9992);tq.consumeWhitespace();
        __CLR4_2_17ol7oljp2rxacb.R.inc(9993);String subQuery = consumeSubQuery(); // support multi > childs

        __CLR4_2_17ol7oljp2rxacb.R.inc(9994);Evaluator rootEval; // the new topmost evaluator
        __CLR4_2_17ol7oljp2rxacb.R.inc(9995);Evaluator currentEval; // the evaluator the new eval will be combined to. could be root, or rightmost or.
        __CLR4_2_17ol7oljp2rxacb.R.inc(9996);Evaluator newEval = parse(subQuery); // the evaluator to add into target evaluator
        __CLR4_2_17ol7oljp2rxacb.R.inc(9997);boolean replaceRightMost = false;

        __CLR4_2_17ol7oljp2rxacb.R.inc(9998);if ((((evals.size() == 1)&&(__CLR4_2_17ol7oljp2rxacb.R.iget(9999)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10000)==0&false))) {{
            __CLR4_2_17ol7oljp2rxacb.R.inc(10001);rootEval = currentEval = evals.get(0);
            // make sure OR (,) has precedence:
            __CLR4_2_17ol7oljp2rxacb.R.inc(10002);if ((((rootEval instanceof CombiningEvaluator.Or && combinator != ',')&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10003)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10004)==0&false))) {{
                __CLR4_2_17ol7oljp2rxacb.R.inc(10005);currentEval = ((CombiningEvaluator.Or) currentEval).rightMostEvaluator();
                __CLR4_2_17ol7oljp2rxacb.R.inc(10006);replaceRightMost = true;
            }
        }}
        }else {{
            __CLR4_2_17ol7oljp2rxacb.R.inc(10007);rootEval = currentEval = new CombiningEvaluator.And(evals);
        }
        }__CLR4_2_17ol7oljp2rxacb.R.inc(10008);evals.clear();

        // for most combinators: change the current eval into an AND of the current eval and the new eval
        __CLR4_2_17ol7oljp2rxacb.R.inc(10009);if ((((combinator == '>')&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10010)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10011)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10012);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.ImmediateParent(currentEval));
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10013);if ((((combinator == ' ')&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10014)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10015)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10016);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.Parent(currentEval));
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10017);if ((((combinator == '+')&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10018)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10019)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10020);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.ImmediatePreviousSibling(currentEval));
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10021);if ((((combinator == '~')&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10022)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10023)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10024);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.PreviousSibling(currentEval));
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10025);if ((((combinator == ',')&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10026)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10027)==0&false))) {{ // group or.
            __CLR4_2_17ol7oljp2rxacb.R.inc(10028);CombiningEvaluator.Or or;
            __CLR4_2_17ol7oljp2rxacb.R.inc(10029);if ((((currentEval instanceof CombiningEvaluator.Or)&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10030)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10031)==0&false))) {{
                __CLR4_2_17ol7oljp2rxacb.R.inc(10032);or = (CombiningEvaluator.Or) currentEval;
                __CLR4_2_17ol7oljp2rxacb.R.inc(10033);or.add(newEval);
            } }else {{
                __CLR4_2_17ol7oljp2rxacb.R.inc(10034);or = new CombiningEvaluator.Or();
                __CLR4_2_17ol7oljp2rxacb.R.inc(10035);or.add(currentEval);
                __CLR4_2_17ol7oljp2rxacb.R.inc(10036);or.add(newEval);
            }
            }__CLR4_2_17ol7oljp2rxacb.R.inc(10037);currentEval = or;
        }
        }else
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10038);throw new Selector.SelectorParseException("Unknown combinator: " + combinator);

        }}}}}__CLR4_2_17ol7oljp2rxacb.R.inc(10039);if ((((replaceRightMost)&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10040)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10041)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10042);((CombiningEvaluator.Or) rootEval).replaceRightMostEvaluator(currentEval);
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10043);rootEval = currentEval;
        }__CLR4_2_17ol7oljp2rxacb.R.inc(10044);evals.add(rootEval);
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    private String consumeSubQuery() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10045);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10046);StringBuilder sq = StringUtil.borrowBuilder();
        __CLR4_2_17ol7oljp2rxacb.R.inc(10047);while ((((!tq.isEmpty())&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10048)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10049)==0&false))) {{
            __CLR4_2_17ol7oljp2rxacb.R.inc(10050);if ((((tq.matches("("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10051)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10052)==0&false)))
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10053);sq.append("(").append(tq.chompBalanced('(', ')')).append(")");
            }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10054);if ((((tq.matches("["))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10055)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10056)==0&false)))
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10057);sq.append("[").append(tq.chompBalanced('[', ']')).append("]");
            }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10058);if ((((tq.matchesAny(combinators))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10059)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10060)==0&false)))
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10061);break;
            }else
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10062);sq.append(tq.consume());
        }}}}
        }__CLR4_2_17ol7oljp2rxacb.R.inc(10063);return StringUtil.releaseBuilder(sq);
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    private void findElements() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10064);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10065);if ((((tq.matchChomp("#"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10066)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10067)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10068);byId();
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10069);if ((((tq.matchChomp("."))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10070)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10071)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10072);byClass();
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10073);if ((((tq.matchesWord() || tq.matches("*|"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10074)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10075)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10076);byTag();
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10077);if ((((tq.matches("["))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10078)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10079)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10080);byAttribute();
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10081);if ((((tq.matchChomp("*"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10082)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10083)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10084);allElements();
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10085);if ((((tq.matchChomp(":lt("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10086)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10087)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10088);indexLessThan();
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10089);if ((((tq.matchChomp(":gt("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10090)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10091)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10092);indexGreaterThan();
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10093);if ((((tq.matchChomp(":eq("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10094)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10095)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10096);indexEquals();
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10097);if ((((tq.matches(":has("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10098)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10099)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10100);has();
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10101);if ((((tq.matches(":contains("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10102)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10103)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10104);contains(false);
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10105);if ((((tq.matches(":containsOwn("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10106)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10107)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10108);contains(true);
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10109);if ((((tq.matches(":containsData("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10110)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10111)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10112);containsData();
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10113);if ((((tq.matches(":matches("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10114)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10115)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10116);matches(false);
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10117);if ((((tq.matches(":matchesOwn("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10118)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10119)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10120);matches(true);
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10121);if ((((tq.matches(":not("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10122)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10123)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10124);not();
		}else {__CLR4_2_17ol7oljp2rxacb.R.inc(10125);if ((((tq.matchChomp(":nth-child("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10126)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10127)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10128);cssNthChild(false, false);
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10129);if ((((tq.matchChomp(":nth-last-child("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10130)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10131)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10132);cssNthChild(true, false);
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10133);if ((((tq.matchChomp(":nth-of-type("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10134)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10135)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10136);cssNthChild(false, true);
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10137);if ((((tq.matchChomp(":nth-last-of-type("))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10138)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10139)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10140);cssNthChild(true, true);
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10141);if ((((tq.matchChomp(":first-child"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10142)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10143)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10144);evals.add(new Evaluator.IsFirstChild());
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10145);if ((((tq.matchChomp(":last-child"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10146)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10147)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10148);evals.add(new Evaluator.IsLastChild());
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10149);if ((((tq.matchChomp(":first-of-type"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10150)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10151)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10152);evals.add(new Evaluator.IsFirstOfType());
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10153);if ((((tq.matchChomp(":last-of-type"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10154)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10155)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10156);evals.add(new Evaluator.IsLastOfType());
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10157);if ((((tq.matchChomp(":only-child"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10158)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10159)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10160);evals.add(new Evaluator.IsOnlyChild());
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10161);if ((((tq.matchChomp(":only-of-type"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10162)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10163)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10164);evals.add(new Evaluator.IsOnlyOfType());
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10165);if ((((tq.matchChomp(":empty"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10166)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10167)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10168);evals.add(new Evaluator.IsEmpty());
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10169);if ((((tq.matchChomp(":root"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10170)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10171)==0&false)))
        	{__CLR4_2_17ol7oljp2rxacb.R.inc(10172);evals.add(new Evaluator.IsRoot());
        }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10173);if ((((tq.matchChomp(":matchText"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10174)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10175)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10176);evals.add(new Evaluator.MatchText());
		}else // unhandled
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10177);throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", query, tq.remainder());

    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    private void byId() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10178);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10179);String id = tq.consumeCssIdentifier();
        __CLR4_2_17ol7oljp2rxacb.R.inc(10180);Validate.notEmpty(id);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10181);evals.add(new Evaluator.Id(id));
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    private void byClass() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10182);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10183);String className = tq.consumeCssIdentifier();
        __CLR4_2_17ol7oljp2rxacb.R.inc(10184);Validate.notEmpty(className);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10185);evals.add(new Evaluator.Class(className.trim()));
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    private void byTag() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10186);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10187);String tagName = tq.consumeElementSelector();

        __CLR4_2_17ol7oljp2rxacb.R.inc(10188);Validate.notEmpty(tagName);

        // namespaces: wildcard match equals(tagName) or ending in ":"+tagName
        __CLR4_2_17ol7oljp2rxacb.R.inc(10189);if ((((tagName.startsWith("*|"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10190)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10191)==0&false))) {{
            __CLR4_2_17ol7oljp2rxacb.R.inc(10192);evals.add(new CombiningEvaluator.Or(new Evaluator.Tag(normalize(tagName)), new Evaluator.TagEndsWith(normalize(tagName.replace("*|", ":")))));
        } }else {{
            // namespaces: if element name is "abc:def", selector must be "abc|def", so flip:
            __CLR4_2_17ol7oljp2rxacb.R.inc(10193);if ((((tagName.contains("|"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10194)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10195)==0&false)))
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10196);tagName = tagName.replace("|", ":");

            }__CLR4_2_17ol7oljp2rxacb.R.inc(10197);evals.add(new Evaluator.Tag(tagName.trim()));
        }
    }}finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    private void byAttribute() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10198);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10199);TokenQueue cq = new TokenQueue(tq.chompBalanced('[', ']')); // content queue
        __CLR4_2_17ol7oljp2rxacb.R.inc(10200);String key = cq.consumeToAny(AttributeEvals); // eq, not, start, end, contain, match, (no val)
        __CLR4_2_17ol7oljp2rxacb.R.inc(10201);Validate.notEmpty(key);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10202);cq.consumeWhitespace();

        __CLR4_2_17ol7oljp2rxacb.R.inc(10203);if ((((cq.isEmpty())&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10204)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10205)==0&false))) {{
            __CLR4_2_17ol7oljp2rxacb.R.inc(10206);if ((((key.startsWith("^"))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10207)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10208)==0&false)))
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10209);evals.add(new Evaluator.AttributeStarting(key.substring(1)));
            }else
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10210);evals.add(new Evaluator.Attribute(key));
        }} }else {{
            __CLR4_2_17ol7oljp2rxacb.R.inc(10211);if ((((cq.matchChomp("="))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10212)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10213)==0&false)))
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10214);evals.add(new Evaluator.AttributeWithValue(key, cq.remainder()));

            }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10215);if ((((cq.matchChomp("!="))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10216)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10217)==0&false)))
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10218);evals.add(new Evaluator.AttributeWithValueNot(key, cq.remainder()));

            }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10219);if ((((cq.matchChomp("^="))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10220)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10221)==0&false)))
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10222);evals.add(new Evaluator.AttributeWithValueStarting(key, cq.remainder()));

            }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10223);if ((((cq.matchChomp("$="))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10224)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10225)==0&false)))
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10226);evals.add(new Evaluator.AttributeWithValueEnding(key, cq.remainder()));

            }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10227);if ((((cq.matchChomp("*="))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10228)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10229)==0&false)))
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10230);evals.add(new Evaluator.AttributeWithValueContaining(key, cq.remainder()));

            }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10231);if ((((cq.matchChomp("~="))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10232)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10233)==0&false)))
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10234);evals.add(new Evaluator.AttributeWithValueMatching(key, Pattern.compile(cq.remainder())));
            }else
                {__CLR4_2_17ol7oljp2rxacb.R.inc(10235);throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", query, cq.remainder());
        }}}}}}}
    }}finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    private void allElements() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10236);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10237);evals.add(new Evaluator.AllElements());
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    // pseudo selectors :lt, :gt, :eq
    private void indexLessThan() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10238);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10239);evals.add(new Evaluator.IndexLessThan(consumeIndex()));
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    private void indexGreaterThan() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10240);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10241);evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    private void indexEquals() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10242);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10243);evals.add(new Evaluator.IndexEquals(consumeIndex()));
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}
    
    //pseudo selectors :first-child, :last-child, :nth-child, ...
    private static final Pattern NTH_AB = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", Pattern.CASE_INSENSITIVE);
    private static final Pattern NTH_B  = Pattern.compile("([+-])?(\\d+)");

	private void cssNthChild(boolean backwards, boolean ofType) {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10244);
		__CLR4_2_17ol7oljp2rxacb.R.inc(10245);String argS = normalize(tq.chompTo(")"));
		__CLR4_2_17ol7oljp2rxacb.R.inc(10246);Matcher mAB = NTH_AB.matcher(argS);
		__CLR4_2_17ol7oljp2rxacb.R.inc(10247);Matcher mB = NTH_B.matcher(argS);
		__CLR4_2_17ol7oljp2rxacb.R.inc(10248);final int a, b;
		__CLR4_2_17ol7oljp2rxacb.R.inc(10249);if (((("odd".equals(argS))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10250)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10251)==0&false))) {{
			__CLR4_2_17ol7oljp2rxacb.R.inc(10252);a = 2;
			__CLR4_2_17ol7oljp2rxacb.R.inc(10253);b = 1;
		} }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10254);if (((("even".equals(argS))&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10255)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10256)==0&false))) {{
			__CLR4_2_17ol7oljp2rxacb.R.inc(10257);a = 2;
			__CLR4_2_17ol7oljp2rxacb.R.inc(10258);b = 0;
		} }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10259);if ((((mAB.matches())&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10260)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10261)==0&false))) {{
			__CLR4_2_17ol7oljp2rxacb.R.inc(10262);a = (((mAB.group(3) != null )&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10263)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10264)==0&false))? Integer.parseInt(mAB.group(1).replaceFirst("^\\+", "")) : 1;
			__CLR4_2_17ol7oljp2rxacb.R.inc(10265);b = (((mAB.group(4) != null )&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10266)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10267)==0&false))? Integer.parseInt(mAB.group(4).replaceFirst("^\\+", "")) : 0;
		} }else {__CLR4_2_17ol7oljp2rxacb.R.inc(10268);if ((((mB.matches())&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10269)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10270)==0&false))) {{
			__CLR4_2_17ol7oljp2rxacb.R.inc(10271);a = 0;
			__CLR4_2_17ol7oljp2rxacb.R.inc(10272);b = Integer.parseInt(mB.group().replaceFirst("^\\+", ""));
		} }else {{
			__CLR4_2_17ol7oljp2rxacb.R.inc(10273);throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", argS);
		}
		}}}}__CLR4_2_17ol7oljp2rxacb.R.inc(10274);if ((((ofType)&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10275)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10276)==0&false)))
			{__CLR4_2_17ol7oljp2rxacb.R.inc(10277);if ((((backwards)&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10278)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10279)==0&false)))
				{__CLR4_2_17ol7oljp2rxacb.R.inc(10280);evals.add(new Evaluator.IsNthLastOfType(a, b));
			}else
				{__CLR4_2_17ol7oljp2rxacb.R.inc(10281);evals.add(new Evaluator.IsNthOfType(a, b));
		}}else {{
			__CLR4_2_17ol7oljp2rxacb.R.inc(10282);if ((((backwards)&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10283)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10284)==0&false)))
				{__CLR4_2_17ol7oljp2rxacb.R.inc(10285);evals.add(new Evaluator.IsNthLastChild(a, b));
			}else
				{__CLR4_2_17ol7oljp2rxacb.R.inc(10286);evals.add(new Evaluator.IsNthChild(a, b));
		}}
	}}finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    private int consumeIndex() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10287);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10288);String indexS = tq.chompTo(")").trim();
        __CLR4_2_17ol7oljp2rxacb.R.inc(10289);Validate.isTrue(StringUtil.isNumeric(indexS), "Index must be numeric");
        __CLR4_2_17ol7oljp2rxacb.R.inc(10290);return Integer.parseInt(indexS);
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    // pseudo selector :has(el)
    private void has() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10291);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10292);tq.consume(":has");
        __CLR4_2_17ol7oljp2rxacb.R.inc(10293);String subQuery = tq.chompBalanced('(', ')');
        __CLR4_2_17ol7oljp2rxacb.R.inc(10294);Validate.notEmpty(subQuery, ":has(el) subselect must not be empty");
        __CLR4_2_17ol7oljp2rxacb.R.inc(10295);evals.add(new StructuralEvaluator.Has(parse(subQuery)));
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    // pseudo selector :contains(text), containsOwn(text)
    private void contains(boolean own) {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10296);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10297);tq.consume((((own )&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10298)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10299)==0&false))? ":containsOwn" : ":contains");
        __CLR4_2_17ol7oljp2rxacb.R.inc(10300);String searchText = TokenQueue.unescape(tq.chompBalanced('(', ')'));
        __CLR4_2_17ol7oljp2rxacb.R.inc(10301);Validate.notEmpty(searchText, ":contains(text) query must not be empty");
        __CLR4_2_17ol7oljp2rxacb.R.inc(10302);if ((((own)&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10303)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10304)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10305);evals.add(new Evaluator.ContainsOwnText(searchText));
        }else
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10306);evals.add(new Evaluator.ContainsText(searchText));
    }}finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    // pseudo selector :containsData(data)
    private void containsData() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10307);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10308);tq.consume(":containsData");
        __CLR4_2_17ol7oljp2rxacb.R.inc(10309);String searchText = TokenQueue.unescape(tq.chompBalanced('(', ')'));
        __CLR4_2_17ol7oljp2rxacb.R.inc(10310);Validate.notEmpty(searchText, ":containsData(text) query must not be empty");
        __CLR4_2_17ol7oljp2rxacb.R.inc(10311);evals.add(new Evaluator.ContainsData(searchText));
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    // :matches(regex), matchesOwn(regex)
    private void matches(boolean own) {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10312);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10313);tq.consume((((own )&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10314)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10315)==0&false))? ":matchesOwn" : ":matches");
        __CLR4_2_17ol7oljp2rxacb.R.inc(10316);String regex = tq.chompBalanced('(', ')'); // don't unescape, as regex bits will be escaped
        __CLR4_2_17ol7oljp2rxacb.R.inc(10317);Validate.notEmpty(regex, ":matches(regex) query must not be empty");

        __CLR4_2_17ol7oljp2rxacb.R.inc(10318);if ((((own)&&(__CLR4_2_17ol7oljp2rxacb.R.iget(10319)!=0|true))||(__CLR4_2_17ol7oljp2rxacb.R.iget(10320)==0&false)))
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10321);evals.add(new Evaluator.MatchesOwn(Pattern.compile(regex)));
        }else
            {__CLR4_2_17ol7oljp2rxacb.R.inc(10322);evals.add(new Evaluator.Matches(Pattern.compile(regex)));
    }}finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}

    // :not(selector)
    private void not() {try{__CLR4_2_17ol7oljp2rxacb.R.inc(10323);
        __CLR4_2_17ol7oljp2rxacb.R.inc(10324);tq.consume(":not");
        __CLR4_2_17ol7oljp2rxacb.R.inc(10325);String subQuery = tq.chompBalanced('(', ')');
        __CLR4_2_17ol7oljp2rxacb.R.inc(10326);Validate.notEmpty(subQuery, ":not(selector) subselect must not be empty");

        __CLR4_2_17ol7oljp2rxacb.R.inc(10327);evals.add(new StructuralEvaluator.Not(parse(subQuery)));
    }finally{__CLR4_2_17ol7oljp2rxacb.R.flushNeeded();}}
}
