/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.internal;

import org.jsoup.helper.Validate;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/**
 * A minimal String utility class. Designed for internal jsoup use only.
 */
public final class StringUtil {public static class __CLR4_2_113n13njp2rx9vx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543506510356L,8589935092L,1576,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // memoised padding up to 21
    static final String[] padding = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ",
        "         ", "          ", "           ", "            ", "             ", "              ", "               ",
        "                ", "                 ", "                  ", "                   ", "                    "};

    /**
     * Join a collection of strings by a separator
     * @param strings collection of string objects
     * @param sep string to place between strings
     * @return joined string
     */
    public static String join(Collection strings, String sep) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1427);
        __CLR4_2_113n13njp2rx9vx.R.inc(1428);return join(strings.iterator(), sep);
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * Join a collection of strings by a separator
     * @param strings iterator of string objects
     * @param sep string to place between strings
     * @return joined string
     */
    public static String join(Iterator strings, String sep) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1429);
        __CLR4_2_113n13njp2rx9vx.R.inc(1430);if ((((!strings.hasNext())&&(__CLR4_2_113n13njp2rx9vx.R.iget(1431)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1432)==0&false)))
            {__CLR4_2_113n13njp2rx9vx.R.inc(1433);return "";

        }__CLR4_2_113n13njp2rx9vx.R.inc(1434);String start = strings.next().toString();
        __CLR4_2_113n13njp2rx9vx.R.inc(1435);if ((((!strings.hasNext())&&(__CLR4_2_113n13njp2rx9vx.R.iget(1436)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1437)==0&false))) // only one, avoid builder
            {__CLR4_2_113n13njp2rx9vx.R.inc(1438);return start;

        }__CLR4_2_113n13njp2rx9vx.R.inc(1439);StringBuilder sb = StringUtil.borrowBuilder().append(start);
        __CLR4_2_113n13njp2rx9vx.R.inc(1440);while ((((strings.hasNext())&&(__CLR4_2_113n13njp2rx9vx.R.iget(1441)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1442)==0&false))) {{
            __CLR4_2_113n13njp2rx9vx.R.inc(1443);sb.append(sep);
            __CLR4_2_113n13njp2rx9vx.R.inc(1444);sb.append(strings.next());
        }
        }__CLR4_2_113n13njp2rx9vx.R.inc(1445);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * Join an array of strings by a separator
     * @param strings collection of string objects
     * @param sep string to place between strings
     * @return joined string
     */
    public static String join(String[] strings, String sep) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1446);
        __CLR4_2_113n13njp2rx9vx.R.inc(1447);return join(Arrays.asList(strings), sep);
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * Returns space padding
     * @param width amount of padding desired
     * @return string of spaces * width
     */
    public static String padding(int width) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1448);
        __CLR4_2_113n13njp2rx9vx.R.inc(1449);if ((((width < 0)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1450)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1451)==0&false)))
            {__CLR4_2_113n13njp2rx9vx.R.inc(1452);throw new IllegalArgumentException("width must be > 0");

        }__CLR4_2_113n13njp2rx9vx.R.inc(1453);if ((((width < padding.length)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1454)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1455)==0&false)))
            {__CLR4_2_113n13njp2rx9vx.R.inc(1456);return padding[width];
        }__CLR4_2_113n13njp2rx9vx.R.inc(1457);char[] out = new char[width];
        __CLR4_2_113n13njp2rx9vx.R.inc(1458);for (int i = 0; (((i < width)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1459)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1460)==0&false)); i++)
            {__CLR4_2_113n13njp2rx9vx.R.inc(1461);out[i] = ' ';
        }__CLR4_2_113n13njp2rx9vx.R.inc(1462);return String.valueOf(out);
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * Tests if a string is blank: null, empty, or only whitespace (" ", \r\n, \t, etc)
     * @param string string to test
     * @return if string is blank
     */
    public static boolean isBlank(String string) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1463);
        __CLR4_2_113n13njp2rx9vx.R.inc(1464);if ((((string == null || string.length() == 0)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1465)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1466)==0&false)))
            {__CLR4_2_113n13njp2rx9vx.R.inc(1467);return true;

        }__CLR4_2_113n13njp2rx9vx.R.inc(1468);int l = string.length();
        __CLR4_2_113n13njp2rx9vx.R.inc(1469);for (int i = 0; (((i < l)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1470)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1471)==0&false)); i++) {{
            __CLR4_2_113n13njp2rx9vx.R.inc(1472);if ((((!StringUtil.isWhitespace(string.codePointAt(i)))&&(__CLR4_2_113n13njp2rx9vx.R.iget(1473)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1474)==0&false)))
                {__CLR4_2_113n13njp2rx9vx.R.inc(1475);return false;
        }}
        }__CLR4_2_113n13njp2rx9vx.R.inc(1476);return true;
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * Tests if a string is numeric, i.e. contains only digit characters
     * @param string string to test
     * @return true if only digit chars, false if empty or null or contains non-digit chars
     */
    public static boolean isNumeric(String string) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1477);
        __CLR4_2_113n13njp2rx9vx.R.inc(1478);if ((((string == null || string.length() == 0)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1479)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1480)==0&false)))
            {__CLR4_2_113n13njp2rx9vx.R.inc(1481);return false;

        }__CLR4_2_113n13njp2rx9vx.R.inc(1482);int l = string.length();
        __CLR4_2_113n13njp2rx9vx.R.inc(1483);for (int i = 0; (((i < l)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1484)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1485)==0&false)); i++) {{
            __CLR4_2_113n13njp2rx9vx.R.inc(1486);if ((((!Character.isDigit(string.codePointAt(i)))&&(__CLR4_2_113n13njp2rx9vx.R.iget(1487)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1488)==0&false)))
                {__CLR4_2_113n13njp2rx9vx.R.inc(1489);return false;
        }}
        }__CLR4_2_113n13njp2rx9vx.R.inc(1490);return true;
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * Tests if a code point is "whitespace" as defined in the HTML spec. Used for output HTML.
     * @param c code point to test
     * @return true if code point is whitespace, false otherwise
     * @see #isActuallyWhitespace(int)
     */
    public static boolean isWhitespace(int c){try{__CLR4_2_113n13njp2rx9vx.R.inc(1491);
        __CLR4_2_113n13njp2rx9vx.R.inc(1492);return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * Tests if a code point is "whitespace" as defined by what it looks like. Used for Element.text etc.
     * @param c code point to test
     * @return true if code point is whitespace, false otherwise
     */
    public static boolean isActuallyWhitespace(int c){try{__CLR4_2_113n13njp2rx9vx.R.inc(1493);
        __CLR4_2_113n13njp2rx9vx.R.inc(1494);return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == 160;
        // 160 is &nbsp; (non-breaking space). Not in the spec but expected.
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    public static boolean isInvisibleChar(int c) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1495);
        __CLR4_2_113n13njp2rx9vx.R.inc(1496);return Character.getType(c) == 16 && (c == 8203 || c == 8204 || c == 8205 || c == 173);
        // zero width sp, zw non join, zw join, soft hyphen
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * Normalise the whitespace within this string; multiple spaces collapse to a single, and all whitespace characters
     * (e.g. newline, tab) convert to a simple space
     * @param string content to normalise
     * @return normalised string
     */
    public static String normaliseWhitespace(String string) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1497);
        __CLR4_2_113n13njp2rx9vx.R.inc(1498);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_2_113n13njp2rx9vx.R.inc(1499);appendNormalisedWhitespace(sb, string, false);
        __CLR4_2_113n13njp2rx9vx.R.inc(1500);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * After normalizing the whitespace within a string, appends it to a string builder.
     * @param accum builder to append to
     * @param string string to normalize whitespace within
     * @param stripLeading set to true if you wish to remove any leading whitespace
     */
    public static void appendNormalisedWhitespace(StringBuilder accum, String string, boolean stripLeading) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1501);
        __CLR4_2_113n13njp2rx9vx.R.inc(1502);boolean lastWasWhite = false;
        __CLR4_2_113n13njp2rx9vx.R.inc(1503);boolean reachedNonWhite = false;

        __CLR4_2_113n13njp2rx9vx.R.inc(1504);int len = string.length();
        __CLR4_2_113n13njp2rx9vx.R.inc(1505);int c;
        __CLR4_2_113n13njp2rx9vx.R.inc(1506);for (int i = 0; (((i < len)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1507)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1508)==0&false)); i+= Character.charCount(c)) {{
            __CLR4_2_113n13njp2rx9vx.R.inc(1509);c = string.codePointAt(i);
            __CLR4_2_113n13njp2rx9vx.R.inc(1510);if ((((isActuallyWhitespace(c))&&(__CLR4_2_113n13njp2rx9vx.R.iget(1511)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1512)==0&false))) {{
                __CLR4_2_113n13njp2rx9vx.R.inc(1513);if (((((stripLeading && !reachedNonWhite) || lastWasWhite)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1514)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1515)==0&false)))
                    {__CLR4_2_113n13njp2rx9vx.R.inc(1516);continue;
                }__CLR4_2_113n13njp2rx9vx.R.inc(1517);accum.append(' ');
                __CLR4_2_113n13njp2rx9vx.R.inc(1518);lastWasWhite = true;
            }
            }else {__CLR4_2_113n13njp2rx9vx.R.inc(1519);if ((((!isInvisibleChar(c))&&(__CLR4_2_113n13njp2rx9vx.R.iget(1520)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1521)==0&false))) {{
                __CLR4_2_113n13njp2rx9vx.R.inc(1522);accum.appendCodePoint(c);
                __CLR4_2_113n13njp2rx9vx.R.inc(1523);lastWasWhite = false;
                __CLR4_2_113n13njp2rx9vx.R.inc(1524);reachedNonWhite = true;
            }
        }}}
    }}finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    public static boolean in(final String needle, final String... haystack) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1525);
        __CLR4_2_113n13njp2rx9vx.R.inc(1526);final int len = haystack.length;
        __CLR4_2_113n13njp2rx9vx.R.inc(1527);for (int i = 0; (((i < len)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1528)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1529)==0&false)); i++) {{
            __CLR4_2_113n13njp2rx9vx.R.inc(1530);if ((((haystack[i].equals(needle))&&(__CLR4_2_113n13njp2rx9vx.R.iget(1531)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1532)==0&false)))
            {__CLR4_2_113n13njp2rx9vx.R.inc(1533);return true;
        }}
        }__CLR4_2_113n13njp2rx9vx.R.inc(1534);return false;
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    public static boolean inSorted(String needle, String[] haystack) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1535);
        __CLR4_2_113n13njp2rx9vx.R.inc(1536);return Arrays.binarySearch(haystack, needle) >= 0;
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.
     * @param base the existing absolute base URL
     * @param relUrl the relative URL to resolve. (If it's already absolute, it will be returned)
     * @return the resolved absolute URL
     * @throws MalformedURLException if an error occurred generating the URL
     */
    public static URL resolve(URL base, String relUrl) throws MalformedURLException {try{__CLR4_2_113n13njp2rx9vx.R.inc(1537);
        // workaround: java resolves '//path/file + ?foo' to '//path/?foo', not '//path/file?foo' as desired
        __CLR4_2_113n13njp2rx9vx.R.inc(1538);if ((((relUrl.startsWith("?"))&&(__CLR4_2_113n13njp2rx9vx.R.iget(1539)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1540)==0&false)))
            {__CLR4_2_113n13njp2rx9vx.R.inc(1541);relUrl = base.getPath() + relUrl;
        // workaround: //example.com + ./foo = //example.com/./foo, not //example.com/foo
        }__CLR4_2_113n13njp2rx9vx.R.inc(1542);if ((((relUrl.indexOf('.') == 0 && base.getFile().indexOf('/') != 0)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1543)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1544)==0&false))) {{
            __CLR4_2_113n13njp2rx9vx.R.inc(1545);base = new URL(base.getProtocol(), base.getHost(), base.getPort(), "/" + base.getFile());
        }
        }__CLR4_2_113n13njp2rx9vx.R.inc(1546);return new URL(base, relUrl);
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.
     * @param baseUrl the existing absolute base URL
     * @param relUrl the relative URL to resolve. (If it's already absolute, it will be returned)
     * @return an absolute URL if one was able to be generated, or the empty string if not
     */
    public static String resolve(final String baseUrl, final String relUrl) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1547);
        __CLR4_2_113n13njp2rx9vx.R.inc(1548);URL base;
        __CLR4_2_113n13njp2rx9vx.R.inc(1549);try {
            __CLR4_2_113n13njp2rx9vx.R.inc(1550);try {
                __CLR4_2_113n13njp2rx9vx.R.inc(1551);base = new URL(baseUrl);
            } catch (MalformedURLException e) {
                // the base is unsuitable, but the attribute/rel may be abs on its own, so try that
                __CLR4_2_113n13njp2rx9vx.R.inc(1552);URL abs = new URL(relUrl);
                __CLR4_2_113n13njp2rx9vx.R.inc(1553);return abs.toExternalForm();
            }
            __CLR4_2_113n13njp2rx9vx.R.inc(1554);return resolve(base, relUrl).toExternalForm();
        } catch (MalformedURLException e) {
            __CLR4_2_113n13njp2rx9vx.R.inc(1555);return "";
        }
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    private static final Stack<StringBuilder> builders = new Stack<>();

    /**
     * Maintains cached StringBuilders in a flyweight pattern, to minimize new StringBuilder GCs. The StringBuilder is
     * prevented from growing too large.
     * <p>
     * Care must be taken to release the builder once its work has been completed, with {@see #releaseBuilder}
     * @return an empty StringBuilder
     * @
     */
    public static StringBuilder borrowBuilder() {try{__CLR4_2_113n13njp2rx9vx.R.inc(1556);
        __CLR4_2_113n13njp2rx9vx.R.inc(1557);synchronized (builders) {
            __CLR4_2_113n13njp2rx9vx.R.inc(1558);return (((builders.empty() )&&(__CLR4_2_113n13njp2rx9vx.R.iget(1559)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1560)==0&false))?
                new StringBuilder(MaxCachedBuilderSize) :
                builders.pop();
        }
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    /**
     * Release a borrowed builder. Care must be taken not to use the builder after it has been returned, as its
     * contents may be changed by this method, or by a concurrent thread.
     * @param sb the StringBuilder to release.
     * @return the string value of the released String Builder (as an incentive to release it!).
     */
    public static String releaseBuilder(StringBuilder sb) {try{__CLR4_2_113n13njp2rx9vx.R.inc(1561);
        __CLR4_2_113n13njp2rx9vx.R.inc(1562);Validate.notNull(sb);
        __CLR4_2_113n13njp2rx9vx.R.inc(1563);String string = sb.toString();

        __CLR4_2_113n13njp2rx9vx.R.inc(1564);if ((((sb.length() > MaxCachedBuilderSize)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1565)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1566)==0&false)))
            {__CLR4_2_113n13njp2rx9vx.R.inc(1567);sb = new StringBuilder(MaxCachedBuilderSize); // make sure it hasn't grown too big
        }else
            {__CLR4_2_113n13njp2rx9vx.R.inc(1568);sb.delete(0, sb.length()); // make sure it's emptied on release

        }__CLR4_2_113n13njp2rx9vx.R.inc(1569);synchronized (builders) {
            __CLR4_2_113n13njp2rx9vx.R.inc(1570);builders.push(sb);

            __CLR4_2_113n13njp2rx9vx.R.inc(1571);while ((((builders.size() > MaxIdleBuilders)&&(__CLR4_2_113n13njp2rx9vx.R.iget(1572)!=0|true))||(__CLR4_2_113n13njp2rx9vx.R.iget(1573)==0&false))) {{
                __CLR4_2_113n13njp2rx9vx.R.inc(1574);builders.pop();
            }
        }}
        __CLR4_2_113n13njp2rx9vx.R.inc(1575);return string;
    }finally{__CLR4_2_113n13njp2rx9vx.R.flushNeeded();}}

    private static final int MaxCachedBuilderSize = 8 * 1024;
    private static final int MaxIdleBuilders = 8;
}
