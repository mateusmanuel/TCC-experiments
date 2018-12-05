/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * The attributes of an Element.
 * <p>
 * Attributes are treated as a map: there can be only one value associated with an attribute key/name.
 * </p>
 * <p>
 * Attribute name and value comparisons are  generally <b>case sensitive</b>. By default for HTML, attribute names are
 * normalized to lower-case on parsing. That means you should use lower-case strings when referring to attributes by
 * name.
 * </p>
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class Attributes implements Iterable<Attribute>, Cloneable {public static class __CLR4_2_11al1aljpaexqda{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,1925,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected static final String dataPrefix = "data-";
    private static final int InitialCapacity = 4; // todo - analyze Alexa 1MM sites, determine best setting

    // manages the key/val arrays
    private static final int GrowthFactor = 2;
    private static final String[] Empty = {};
    static final int NotFound = -1;
    private static final String EmptyString = "";

    private int size = 0; // number of slots used (not capacity, which is keys.length
    String[] keys = Empty;
    String[] vals = Empty;

    // check there's room for more
    private void checkCapacity(int minNewSize) {try{__CLR4_2_11al1aljpaexqda.R.inc(1677);
        __CLR4_2_11al1aljpaexqda.R.inc(1678);Validate.isTrue(minNewSize >= size);
        __CLR4_2_11al1aljpaexqda.R.inc(1679);int curSize = keys.length;
        __CLR4_2_11al1aljpaexqda.R.inc(1680);if ((((curSize >= minNewSize)&&(__CLR4_2_11al1aljpaexqda.R.iget(1681)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1682)==0&false)))
            {__CLR4_2_11al1aljpaexqda.R.inc(1683);return;

        }__CLR4_2_11al1aljpaexqda.R.inc(1684);int newSize = (((curSize >= InitialCapacity )&&(__CLR4_2_11al1aljpaexqda.R.iget(1685)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1686)==0&false))? size * GrowthFactor : InitialCapacity;
        __CLR4_2_11al1aljpaexqda.R.inc(1687);if ((((minNewSize > newSize)&&(__CLR4_2_11al1aljpaexqda.R.iget(1688)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1689)==0&false)))
            {__CLR4_2_11al1aljpaexqda.R.inc(1690);newSize = minNewSize;

        }__CLR4_2_11al1aljpaexqda.R.inc(1691);keys = copyOf(keys, newSize);
        __CLR4_2_11al1aljpaexqda.R.inc(1692);vals = copyOf(vals, newSize);
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    // simple implementation of Arrays.copy, for support of Android API 8.
    private static String[] copyOf(String[] orig, int size) {try{__CLR4_2_11al1aljpaexqda.R.inc(1693);
        __CLR4_2_11al1aljpaexqda.R.inc(1694);final String[] copy = new String[size];
        __CLR4_2_11al1aljpaexqda.R.inc(1695);System.arraycopy(orig, 0, copy, 0,
                Math.min(orig.length, size));
        __CLR4_2_11al1aljpaexqda.R.inc(1696);return copy;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    int indexOfKey(String key) {try{__CLR4_2_11al1aljpaexqda.R.inc(1697);
        __CLR4_2_11al1aljpaexqda.R.inc(1698);Validate.notNull(key);
        __CLR4_2_11al1aljpaexqda.R.inc(1699);for (int i = 0; (((i < size)&&(__CLR4_2_11al1aljpaexqda.R.iget(1700)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1701)==0&false)); i++) {{
            __CLR4_2_11al1aljpaexqda.R.inc(1702);if ((((key.equals(keys[i]))&&(__CLR4_2_11al1aljpaexqda.R.iget(1703)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1704)==0&false)))
                {__CLR4_2_11al1aljpaexqda.R.inc(1705);return i;
        }}
        }__CLR4_2_11al1aljpaexqda.R.inc(1706);return NotFound;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    private int indexOfKeyIgnoreCase(String key) {try{__CLR4_2_11al1aljpaexqda.R.inc(1707);
        __CLR4_2_11al1aljpaexqda.R.inc(1708);Validate.notNull(key);
        __CLR4_2_11al1aljpaexqda.R.inc(1709);for (int i = 0; (((i < size)&&(__CLR4_2_11al1aljpaexqda.R.iget(1710)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1711)==0&false)); i++) {{
            __CLR4_2_11al1aljpaexqda.R.inc(1712);if ((((key.equalsIgnoreCase(keys[i]))&&(__CLR4_2_11al1aljpaexqda.R.iget(1713)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1714)==0&false)))
                {__CLR4_2_11al1aljpaexqda.R.inc(1715);return i;
        }}
        }__CLR4_2_11al1aljpaexqda.R.inc(1716);return NotFound;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    // we track boolean attributes as null in values - they're just keys. so returns empty for consumers
    static String checkNotNull(String val) {try{__CLR4_2_11al1aljpaexqda.R.inc(1717);
        __CLR4_2_11al1aljpaexqda.R.inc(1718);return (((val == null )&&(__CLR4_2_11al1aljpaexqda.R.iget(1719)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1720)==0&false))? EmptyString : val;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     Get an attribute value by key.
     @param key the (case-sensitive) attribute key
     @return the attribute value if set; or empty string if not set (or a boolean attribute).
     @see #hasKey(String)
     */
    public String get(String key) {try{__CLR4_2_11al1aljpaexqda.R.inc(1721);
        __CLR4_2_11al1aljpaexqda.R.inc(1722);int i = indexOfKey(key);
        __CLR4_2_11al1aljpaexqda.R.inc(1723);return (((i == NotFound )&&(__CLR4_2_11al1aljpaexqda.R.iget(1724)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1725)==0&false))? EmptyString : checkNotNull(vals[i]);
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     * Get an attribute's value by case-insensitive key
     * @param key the attribute name
     * @return the first matching attribute value if set; or empty string if not set (ora boolean attribute).
     */
    public String getIgnoreCase(String key) {try{__CLR4_2_11al1aljpaexqda.R.inc(1726);
        __CLR4_2_11al1aljpaexqda.R.inc(1727);int i = indexOfKeyIgnoreCase(key);
        __CLR4_2_11al1aljpaexqda.R.inc(1728);return (((i == NotFound )&&(__CLR4_2_11al1aljpaexqda.R.iget(1729)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1730)==0&false))? EmptyString : checkNotNull(vals[i]);
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    // adds without checking if this key exists
    private void add(String key, String value) {try{__CLR4_2_11al1aljpaexqda.R.inc(1731);
        __CLR4_2_11al1aljpaexqda.R.inc(1732);checkCapacity(size + 1);
        __CLR4_2_11al1aljpaexqda.R.inc(1733);keys[size] = key;
        __CLR4_2_11al1aljpaexqda.R.inc(1734);vals[size] = value;
        __CLR4_2_11al1aljpaexqda.R.inc(1735);size++;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     * Set a new attribute, or replace an existing one by key.
     * @param key case sensitive attribute key
     * @param value attribute value
     * @return these attributes, for chaining
     */
    public Attributes put(String key, String value) {try{__CLR4_2_11al1aljpaexqda.R.inc(1736);
        __CLR4_2_11al1aljpaexqda.R.inc(1737);int i = indexOfKey(key);
        __CLR4_2_11al1aljpaexqda.R.inc(1738);if ((((i != NotFound)&&(__CLR4_2_11al1aljpaexqda.R.iget(1739)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1740)==0&false)))
            {__CLR4_2_11al1aljpaexqda.R.inc(1741);vals[i] = value;
        }else
            {__CLR4_2_11al1aljpaexqda.R.inc(1742);add(key, value);
        }__CLR4_2_11al1aljpaexqda.R.inc(1743);return this;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    void putIgnoreCase(String key, String value) {try{__CLR4_2_11al1aljpaexqda.R.inc(1744);
        __CLR4_2_11al1aljpaexqda.R.inc(1745);int i = indexOfKeyIgnoreCase(key);
        __CLR4_2_11al1aljpaexqda.R.inc(1746);if ((((i != NotFound)&&(__CLR4_2_11al1aljpaexqda.R.iget(1747)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1748)==0&false))) {{
            __CLR4_2_11al1aljpaexqda.R.inc(1749);vals[i] = value;
            __CLR4_2_11al1aljpaexqda.R.inc(1750);if ((((!keys[i].equals(key))&&(__CLR4_2_11al1aljpaexqda.R.iget(1751)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1752)==0&false))) // case changed, update
                {__CLR4_2_11al1aljpaexqda.R.inc(1753);keys[i] = key;
        }}
        }else
            {__CLR4_2_11al1aljpaexqda.R.inc(1754);add(key, value);
    }}finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     * Set a new boolean attribute, remove attribute if value is false.
     * @param key case <b>insensitive</b> attribute key
     * @param value attribute value
     * @return these attributes, for chaining
     */
    public Attributes put(String key, boolean value) {try{__CLR4_2_11al1aljpaexqda.R.inc(1755);
        __CLR4_2_11al1aljpaexqda.R.inc(1756);if ((((value)&&(__CLR4_2_11al1aljpaexqda.R.iget(1757)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1758)==0&false)))
            {__CLR4_2_11al1aljpaexqda.R.inc(1759);putIgnoreCase(key, null);
        }else
            {__CLR4_2_11al1aljpaexqda.R.inc(1760);remove(key);
        }__CLR4_2_11al1aljpaexqda.R.inc(1761);return this;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     Set a new attribute, or replace an existing one by key.
     @param attribute attribute with case sensitive key
     @return these attributes, for chaining
     */
    public Attributes put(Attribute attribute) {try{__CLR4_2_11al1aljpaexqda.R.inc(1762);
        __CLR4_2_11al1aljpaexqda.R.inc(1763);Validate.notNull(attribute);
        __CLR4_2_11al1aljpaexqda.R.inc(1764);put(attribute.getKey(), attribute.getValue());
        __CLR4_2_11al1aljpaexqda.R.inc(1765);attribute.parent = this;
        __CLR4_2_11al1aljpaexqda.R.inc(1766);return this;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    // removes and shifts up
    private void remove(int index) {try{__CLR4_2_11al1aljpaexqda.R.inc(1767);
        __CLR4_2_11al1aljpaexqda.R.inc(1768);Validate.isFalse(index >= size);
        __CLR4_2_11al1aljpaexqda.R.inc(1769);int shifted = size - index - 1;
        __CLR4_2_11al1aljpaexqda.R.inc(1770);if ((((shifted > 0)&&(__CLR4_2_11al1aljpaexqda.R.iget(1771)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1772)==0&false))) {{
            __CLR4_2_11al1aljpaexqda.R.inc(1773);System.arraycopy(keys, index + 1, keys, index, shifted);
            __CLR4_2_11al1aljpaexqda.R.inc(1774);System.arraycopy(vals, index + 1, vals, index, shifted);
        }
        }__CLR4_2_11al1aljpaexqda.R.inc(1775);size--;
        __CLR4_2_11al1aljpaexqda.R.inc(1776);keys[size] = null; // release hold
        __CLR4_2_11al1aljpaexqda.R.inc(1777);vals[size] = null;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     Remove an attribute by key. <b>Case sensitive.</b>
     @param key attribute key to remove
     */
    public void remove(String key) {try{__CLR4_2_11al1aljpaexqda.R.inc(1778);
        __CLR4_2_11al1aljpaexqda.R.inc(1779);int i = indexOfKey(key);
        __CLR4_2_11al1aljpaexqda.R.inc(1780);if ((((i != NotFound)&&(__CLR4_2_11al1aljpaexqda.R.iget(1781)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1782)==0&false)))
            {__CLR4_2_11al1aljpaexqda.R.inc(1783);remove(i);
    }}finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     Remove an attribute by key. <b>Case insensitive.</b>
     @param key attribute key to remove
     */
    public void removeIgnoreCase(String key) {try{__CLR4_2_11al1aljpaexqda.R.inc(1784);
        __CLR4_2_11al1aljpaexqda.R.inc(1785);int i = indexOfKeyIgnoreCase(key);
        __CLR4_2_11al1aljpaexqda.R.inc(1786);if ((((i != NotFound)&&(__CLR4_2_11al1aljpaexqda.R.iget(1787)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1788)==0&false)))
            {__CLR4_2_11al1aljpaexqda.R.inc(1789);remove(i);
    }}finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     Tests if these attributes contain an attribute with this key.
     @param key case-sensitive key to check for
     @return true if key exists, false otherwise
     */
    public boolean hasKey(String key) {try{__CLR4_2_11al1aljpaexqda.R.inc(1790);
        __CLR4_2_11al1aljpaexqda.R.inc(1791);return indexOfKey(key) != NotFound;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     Tests if these attributes contain an attribute with this key.
     @param key key to check for
     @return true if key exists, false otherwise
     */
    public boolean hasKeyIgnoreCase(String key) {try{__CLR4_2_11al1aljpaexqda.R.inc(1792);
        __CLR4_2_11al1aljpaexqda.R.inc(1793);return indexOfKeyIgnoreCase(key) != NotFound;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     Get the number of attributes in this set.
     @return size
     */
    public int size() {try{__CLR4_2_11al1aljpaexqda.R.inc(1794);
        __CLR4_2_11al1aljpaexqda.R.inc(1795);return size;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     Add all the attributes from the incoming set to this set.
     @param incoming attributes to add to these attributes.
     */
    public void addAll(Attributes incoming) {try{__CLR4_2_11al1aljpaexqda.R.inc(1796);
        __CLR4_2_11al1aljpaexqda.R.inc(1797);if ((((incoming.size() == 0)&&(__CLR4_2_11al1aljpaexqda.R.iget(1798)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1799)==0&false)))
            {__CLR4_2_11al1aljpaexqda.R.inc(1800);return;
        }__CLR4_2_11al1aljpaexqda.R.inc(1801);checkCapacity(size + incoming.size);

        __CLR4_2_11al1aljpaexqda.R.inc(1802);for (Attribute attr : incoming) {{
            // todo - should this be case insensitive?
            __CLR4_2_11al1aljpaexqda.R.inc(1803);put(attr);
        }

    }}finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    public Iterator<Attribute> iterator() {try{__CLR4_2_11al1aljpaexqda.R.inc(1804);
        __CLR4_2_11al1aljpaexqda.R.inc(1805);return new Iterator<Attribute>() {
            int i = 0;

            @Override
            public boolean hasNext() {try{__CLR4_2_11al1aljpaexqda.R.inc(1806);
                __CLR4_2_11al1aljpaexqda.R.inc(1807);return i < size;
            }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

            @Override
            public Attribute next() {try{__CLR4_2_11al1aljpaexqda.R.inc(1808);
                __CLR4_2_11al1aljpaexqda.R.inc(1809);final Attribute attr = new Attribute(keys[i], vals[i], Attributes.this);
                __CLR4_2_11al1aljpaexqda.R.inc(1810);i++;
                __CLR4_2_11al1aljpaexqda.R.inc(1811);return attr;
            }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

            @Override
            public void remove() {try{__CLR4_2_11al1aljpaexqda.R.inc(1812);
                __CLR4_2_11al1aljpaexqda.R.inc(1813);Attributes.this.remove(--i); // next() advanced, so rewind
            }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}
        };
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     Get the attributes as a List, for iteration.
     @return an view of the attributes as an unmodifialbe List.
     */
    public List<Attribute> asList() {try{__CLR4_2_11al1aljpaexqda.R.inc(1814);
        __CLR4_2_11al1aljpaexqda.R.inc(1815);ArrayList<Attribute> list = new ArrayList<>(size);
        __CLR4_2_11al1aljpaexqda.R.inc(1816);for (int i = 0; (((i < size)&&(__CLR4_2_11al1aljpaexqda.R.iget(1817)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1818)==0&false)); i++) {{
            __CLR4_2_11al1aljpaexqda.R.inc(1819);Attribute attr = (((vals[i] == null )&&(__CLR4_2_11al1aljpaexqda.R.iget(1820)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1821)==0&false))?
                new BooleanAttribute(keys[i]) : // deprecated class, but maybe someone still wants it
                new Attribute(keys[i], vals[i], Attributes.this);
            __CLR4_2_11al1aljpaexqda.R.inc(1822);list.add(attr);
        }
        }__CLR4_2_11al1aljpaexqda.R.inc(1823);return Collections.unmodifiableList(list);
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     * Retrieves a filtered view of attributes that are HTML5 custom data attributes; that is, attributes with keys
     * starting with {@code data-}.
     * @return map of custom data attributes.
     */
    public Map<String, String> dataset() {try{__CLR4_2_11al1aljpaexqda.R.inc(1824);
        __CLR4_2_11al1aljpaexqda.R.inc(1825);return new Dataset(this);
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     Get the HTML representation of these attributes.
     @return HTML
     @throws SerializationException if the HTML representation of the attributes cannot be constructed.
     */
    public String html() {try{__CLR4_2_11al1aljpaexqda.R.inc(1826);
        __CLR4_2_11al1aljpaexqda.R.inc(1827);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_2_11al1aljpaexqda.R.inc(1828);try {
            __CLR4_2_11al1aljpaexqda.R.inc(1829);html(sb, (new Document("")).outputSettings()); // output settings a bit funky, but this html() seldom used
        } catch (IOException e) { // ought never happen
            __CLR4_2_11al1aljpaexqda.R.inc(1830);throw new SerializationException(e);
        }
        __CLR4_2_11al1aljpaexqda.R.inc(1831);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    final void html(final Appendable accum, final Document.OutputSettings out) throws IOException {try{__CLR4_2_11al1aljpaexqda.R.inc(1832);
        __CLR4_2_11al1aljpaexqda.R.inc(1833);final int sz = size;
        __CLR4_2_11al1aljpaexqda.R.inc(1834);for (int i = 0; (((i < sz)&&(__CLR4_2_11al1aljpaexqda.R.iget(1835)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1836)==0&false)); i++) {{
            // inlined from Attribute.html()
            __CLR4_2_11al1aljpaexqda.R.inc(1837);final String key = keys[i];
            __CLR4_2_11al1aljpaexqda.R.inc(1838);final String val = vals[i];
            __CLR4_2_11al1aljpaexqda.R.inc(1839);accum.append(' ').append(key);

            // collapse checked=null, checked="", checked=checked; write out others
            __CLR4_2_11al1aljpaexqda.R.inc(1840);if ((((!Attribute.shouldCollapseAttribute(key, val, out))&&(__CLR4_2_11al1aljpaexqda.R.iget(1841)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1842)==0&false))) {{
                __CLR4_2_11al1aljpaexqda.R.inc(1843);accum.append("=\"");
                __CLR4_2_11al1aljpaexqda.R.inc(1844);Entities.escape(accum, (((val == null )&&(__CLR4_2_11al1aljpaexqda.R.iget(1845)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1846)==0&false))? EmptyString : val, out, true, false, false);
                __CLR4_2_11al1aljpaexqda.R.inc(1847);accum.append('"');
            }
        }}
    }}finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_11al1aljpaexqda.R.inc(1848);
        __CLR4_2_11al1aljpaexqda.R.inc(1849);return html();
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     * Checks if these attributes are equal to another set of attributes, by comparing the two sets
     * @param o attributes to compare with
     * @return if both sets of attributes have the same content
     */
    @Override
    public boolean equals(Object o) {try{__CLR4_2_11al1aljpaexqda.R.inc(1850);
        __CLR4_2_11al1aljpaexqda.R.inc(1851);if ((((this == o)&&(__CLR4_2_11al1aljpaexqda.R.iget(1852)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1853)==0&false))) {__CLR4_2_11al1aljpaexqda.R.inc(1854);return true;
        }__CLR4_2_11al1aljpaexqda.R.inc(1855);if ((((o == null || getClass() != o.getClass())&&(__CLR4_2_11al1aljpaexqda.R.iget(1856)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1857)==0&false))) {__CLR4_2_11al1aljpaexqda.R.inc(1858);return false;

        }__CLR4_2_11al1aljpaexqda.R.inc(1859);Attributes that = (Attributes) o;

        __CLR4_2_11al1aljpaexqda.R.inc(1860);if ((((size != that.size)&&(__CLR4_2_11al1aljpaexqda.R.iget(1861)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1862)==0&false))) {__CLR4_2_11al1aljpaexqda.R.inc(1863);return false;
        }__CLR4_2_11al1aljpaexqda.R.inc(1864);if ((((!Arrays.equals(keys, that.keys))&&(__CLR4_2_11al1aljpaexqda.R.iget(1865)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1866)==0&false))) {__CLR4_2_11al1aljpaexqda.R.inc(1867);return false;
        }__CLR4_2_11al1aljpaexqda.R.inc(1868);return Arrays.equals(vals, that.vals);
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     * Calculates the hashcode of these attributes, by iterating all attributes and summing their hashcodes.
     * @return calculated hashcode
     */
    @Override
    public int hashCode() {try{__CLR4_2_11al1aljpaexqda.R.inc(1869);
        __CLR4_2_11al1aljpaexqda.R.inc(1870);int result = size;
        __CLR4_2_11al1aljpaexqda.R.inc(1871);result = 31 * result + Arrays.hashCode(keys);
        __CLR4_2_11al1aljpaexqda.R.inc(1872);result = 31 * result + Arrays.hashCode(vals);
        __CLR4_2_11al1aljpaexqda.R.inc(1873);return result;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    @Override
    public Attributes clone() {try{__CLR4_2_11al1aljpaexqda.R.inc(1874);
        __CLR4_2_11al1aljpaexqda.R.inc(1875);Attributes clone;
        __CLR4_2_11al1aljpaexqda.R.inc(1876);try {
            __CLR4_2_11al1aljpaexqda.R.inc(1877);clone = (Attributes) super.clone();
        } catch (CloneNotSupportedException e) {
            __CLR4_2_11al1aljpaexqda.R.inc(1878);throw new RuntimeException(e);
        }
        __CLR4_2_11al1aljpaexqda.R.inc(1879);clone.size = size;
        __CLR4_2_11al1aljpaexqda.R.inc(1880);keys = copyOf(keys, size);
        __CLR4_2_11al1aljpaexqda.R.inc(1881);vals = copyOf(vals, size);
        __CLR4_2_11al1aljpaexqda.R.inc(1882);return clone;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    /**
     * Internal method. Lowercases all keys.
     */
    public void normalize() {try{__CLR4_2_11al1aljpaexqda.R.inc(1883);
        __CLR4_2_11al1aljpaexqda.R.inc(1884);for (int i = 0; (((i < size)&&(__CLR4_2_11al1aljpaexqda.R.iget(1885)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1886)==0&false)); i++) {{
            __CLR4_2_11al1aljpaexqda.R.inc(1887);keys[i] = lowerCase(keys[i]);
        }
    }}finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

    private static class Dataset extends AbstractMap<String, String> {
        private final Attributes attributes;

        private Dataset(Attributes attributes) {try{__CLR4_2_11al1aljpaexqda.R.inc(1888);
            __CLR4_2_11al1aljpaexqda.R.inc(1889);this.attributes = attributes;
        }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

        @Override
        public Set<Entry<String, String>> entrySet() {try{__CLR4_2_11al1aljpaexqda.R.inc(1890);
            __CLR4_2_11al1aljpaexqda.R.inc(1891);return new EntrySet();
        }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

        @Override
        public String put(String key, String value) {try{__CLR4_2_11al1aljpaexqda.R.inc(1892);
            __CLR4_2_11al1aljpaexqda.R.inc(1893);String dataKey = dataKey(key);
            __CLR4_2_11al1aljpaexqda.R.inc(1894);String oldValue = (((attributes.hasKey(dataKey) )&&(__CLR4_2_11al1aljpaexqda.R.iget(1895)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1896)==0&false))? attributes.get(dataKey) : null;
            __CLR4_2_11al1aljpaexqda.R.inc(1897);attributes.put(dataKey, value);
            __CLR4_2_11al1aljpaexqda.R.inc(1898);return oldValue;
        }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

        private class EntrySet extends AbstractSet<Map.Entry<String, String>> {

            @Override
            public Iterator<Map.Entry<String, String>> iterator() {try{__CLR4_2_11al1aljpaexqda.R.inc(1899);
                __CLR4_2_11al1aljpaexqda.R.inc(1900);return new DatasetIterator();
            }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

            @Override
            public int size() {try{__CLR4_2_11al1aljpaexqda.R.inc(1901);
                __CLR4_2_11al1aljpaexqda.R.inc(1902);int count = 0;
                __CLR4_2_11al1aljpaexqda.R.inc(1903);Iterator iter = new DatasetIterator();
                __CLR4_2_11al1aljpaexqda.R.inc(1904);while ((((iter.hasNext())&&(__CLR4_2_11al1aljpaexqda.R.iget(1905)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1906)==0&false)))
                    {__CLR4_2_11al1aljpaexqda.R.inc(1907);count++;
                }__CLR4_2_11al1aljpaexqda.R.inc(1908);return count;
            }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}
        }

        private class DatasetIterator implements Iterator<Map.Entry<String, String>> {
            private Iterator<Attribute> attrIter = attributes.iterator();
            private Attribute attr;
            public boolean hasNext() {try{__CLR4_2_11al1aljpaexqda.R.inc(1909);
                __CLR4_2_11al1aljpaexqda.R.inc(1910);while ((((attrIter.hasNext())&&(__CLR4_2_11al1aljpaexqda.R.iget(1911)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1912)==0&false))) {{
                    __CLR4_2_11al1aljpaexqda.R.inc(1913);attr = attrIter.next();
                    __CLR4_2_11al1aljpaexqda.R.inc(1914);if ((((attr.isDataAttribute())&&(__CLR4_2_11al1aljpaexqda.R.iget(1915)!=0|true))||(__CLR4_2_11al1aljpaexqda.R.iget(1916)==0&false))) {__CLR4_2_11al1aljpaexqda.R.inc(1917);return true;
                }}
                }__CLR4_2_11al1aljpaexqda.R.inc(1918);return false;
            }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

            public Entry<String, String> next() {try{__CLR4_2_11al1aljpaexqda.R.inc(1919);
                __CLR4_2_11al1aljpaexqda.R.inc(1920);return new Attribute(attr.getKey().substring(dataPrefix.length()), attr.getValue());
            }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}

            public void remove() {try{__CLR4_2_11al1aljpaexqda.R.inc(1921);
                __CLR4_2_11al1aljpaexqda.R.inc(1922);attributes.remove(attr.getKey());
            }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}
        }
    }

    private static String dataKey(String key) {try{__CLR4_2_11al1aljpaexqda.R.inc(1923);
        __CLR4_2_11al1aljpaexqda.R.inc(1924);return dataPrefix + key;
    }finally{__CLR4_2_11al1aljpaexqda.R.flushNeeded();}}
}
