/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 A single key + value attribute. (Only used for presentation.)
 */
public class Attribute implements Map.Entry<String, String>, Cloneable  {public static class __CLR4_2_117s17sjpaexqcu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,1677,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String[] booleanAttributes = {
            "allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled",
            "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize",
            "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected",
            "sortable", "truespeed", "typemustmatch"
    };

    private String key;
    private String val;
    Attributes parent; // used to update the holding Attributes when the key / value is changed via this interface

    /**
     * Create a new attribute from unencoded (raw) key and value.
     * @param key attribute key; case is preserved.
     * @param value attribute value
     * @see #createFromEncoded
     */
    public Attribute(String key, String value) {
        this(key, value, null);__CLR4_2_117s17sjpaexqcu.R.inc(1577);try{__CLR4_2_117s17sjpaexqcu.R.inc(1576);
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    /**
     * Create a new attribute from unencoded (raw) key and value.
     * @param key attribute key; case is preserved.
     * @param val attribute value
     * @param parent the containing Attributes (this Attribute is not automatically added to said Attributes)
     * @see #createFromEncoded*/
    public Attribute(String key, String val, Attributes parent) {try{__CLR4_2_117s17sjpaexqcu.R.inc(1578);
        __CLR4_2_117s17sjpaexqcu.R.inc(1579);Validate.notNull(key);
        __CLR4_2_117s17sjpaexqcu.R.inc(1580);this.key = key.trim();
        __CLR4_2_117s17sjpaexqcu.R.inc(1581);Validate.notEmpty(key); // trimming could potentially make empty, so validate here
        __CLR4_2_117s17sjpaexqcu.R.inc(1582);this.val = val;
        __CLR4_2_117s17sjpaexqcu.R.inc(1583);this.parent = parent;
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    /**
     Get the attribute key.
     @return the attribute key
     */
    public String getKey() {try{__CLR4_2_117s17sjpaexqcu.R.inc(1584);
        __CLR4_2_117s17sjpaexqcu.R.inc(1585);return key;
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    /**
     Set the attribute key; case is preserved.
     @param key the new key; must not be null
     */
    public void setKey(String key) {try{__CLR4_2_117s17sjpaexqcu.R.inc(1586);
        __CLR4_2_117s17sjpaexqcu.R.inc(1587);Validate.notNull(key);
        __CLR4_2_117s17sjpaexqcu.R.inc(1588);key = key.trim();
        __CLR4_2_117s17sjpaexqcu.R.inc(1589);Validate.notEmpty(key); // trimming could potentially make empty, so validate here
        __CLR4_2_117s17sjpaexqcu.R.inc(1590);if ((((parent != null)&&(__CLR4_2_117s17sjpaexqcu.R.iget(1591)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1592)==0&false))) {{
            __CLR4_2_117s17sjpaexqcu.R.inc(1593);int i = parent.indexOfKey(this.key);
            __CLR4_2_117s17sjpaexqcu.R.inc(1594);if ((((i != Attributes.NotFound)&&(__CLR4_2_117s17sjpaexqcu.R.iget(1595)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1596)==0&false)))
                {__CLR4_2_117s17sjpaexqcu.R.inc(1597);parent.keys[i] = key;
        }}
        }__CLR4_2_117s17sjpaexqcu.R.inc(1598);this.key = key;
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    /**
     Get the attribute value.
     @return the attribute value
     */
    public String getValue() {try{__CLR4_2_117s17sjpaexqcu.R.inc(1599);
        __CLR4_2_117s17sjpaexqcu.R.inc(1600);return val;
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    /**
     Set the attribute value.
     @param val the new attribute value; must not be null
     */
    public String setValue(String val) {try{__CLR4_2_117s17sjpaexqcu.R.inc(1601);
        __CLR4_2_117s17sjpaexqcu.R.inc(1602);String oldVal = parent.get(this.key);
        __CLR4_2_117s17sjpaexqcu.R.inc(1603);if ((((parent != null)&&(__CLR4_2_117s17sjpaexqcu.R.iget(1604)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1605)==0&false))) {{
            __CLR4_2_117s17sjpaexqcu.R.inc(1606);int i = parent.indexOfKey(this.key);
            __CLR4_2_117s17sjpaexqcu.R.inc(1607);if ((((i != Attributes.NotFound)&&(__CLR4_2_117s17sjpaexqcu.R.iget(1608)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1609)==0&false)))
                {__CLR4_2_117s17sjpaexqcu.R.inc(1610);parent.vals[i] = val;
        }}
        }__CLR4_2_117s17sjpaexqcu.R.inc(1611);this.val = val;
        __CLR4_2_117s17sjpaexqcu.R.inc(1612);return oldVal;
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    /**
     Get the HTML representation of this attribute; e.g. {@code href="index.html"}.
     @return HTML
     */
    public String html() {try{__CLR4_2_117s17sjpaexqcu.R.inc(1613);
        __CLR4_2_117s17sjpaexqcu.R.inc(1614);StringBuilder sb = StringUtil.borrowBuilder();
        
        __CLR4_2_117s17sjpaexqcu.R.inc(1615);try {
        	__CLR4_2_117s17sjpaexqcu.R.inc(1616);html(sb, (new Document("")).outputSettings());
        } catch(IOException exception) {
        	__CLR4_2_117s17sjpaexqcu.R.inc(1617);throw new SerializationException(exception);
        }
        __CLR4_2_117s17sjpaexqcu.R.inc(1618);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    protected static void html(String key, String val, Appendable accum, Document.OutputSettings out) throws IOException {try{__CLR4_2_117s17sjpaexqcu.R.inc(1619);
        __CLR4_2_117s17sjpaexqcu.R.inc(1620);accum.append(key);
        __CLR4_2_117s17sjpaexqcu.R.inc(1621);if ((((!shouldCollapseAttribute(key, val, out))&&(__CLR4_2_117s17sjpaexqcu.R.iget(1622)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1623)==0&false))) {{
            __CLR4_2_117s17sjpaexqcu.R.inc(1624);accum.append("=\"");
            __CLR4_2_117s17sjpaexqcu.R.inc(1625);Entities.escape(accum, Attributes.checkNotNull(val) , out, true, false, false);
            __CLR4_2_117s17sjpaexqcu.R.inc(1626);accum.append('"');
        }
    }}finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}
    
    protected void html(Appendable accum, Document.OutputSettings out) throws IOException {try{__CLR4_2_117s17sjpaexqcu.R.inc(1627);
        __CLR4_2_117s17sjpaexqcu.R.inc(1628);html(key, val, accum, out);
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    /**
     Get the string representation of this attribute, implemented as {@link #html()}.
     @return string
     */
    @Override
    public String toString() {try{__CLR4_2_117s17sjpaexqcu.R.inc(1629);
        __CLR4_2_117s17sjpaexqcu.R.inc(1630);return html();
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    /**
     * Create a new Attribute from an unencoded key and a HTML attribute encoded value.
     * @param unencodedKey assumes the key is not encoded, as can be only run of simple \w chars.
     * @param encodedValue HTML attribute encoded value
     * @return attribute
     */
    public static Attribute createFromEncoded(String unencodedKey, String encodedValue) {try{__CLR4_2_117s17sjpaexqcu.R.inc(1631);
        __CLR4_2_117s17sjpaexqcu.R.inc(1632);String value = Entities.unescape(encodedValue, true);
        __CLR4_2_117s17sjpaexqcu.R.inc(1633);return new Attribute(unencodedKey, value, null); // parent will get set when Put
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    protected boolean isDataAttribute() {try{__CLR4_2_117s17sjpaexqcu.R.inc(1634);
        __CLR4_2_117s17sjpaexqcu.R.inc(1635);return isDataAttribute(key);
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    protected static boolean isDataAttribute(String key) {try{__CLR4_2_117s17sjpaexqcu.R.inc(1636);
        __CLR4_2_117s17sjpaexqcu.R.inc(1637);return key.startsWith(Attributes.dataPrefix) && key.length() > Attributes.dataPrefix.length();
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    /**
     * Collapsible if it's a boolean attribute and value is empty or same as name
     * 
     * @param out output settings
     * @return  Returns whether collapsible or not
     */
    protected final boolean shouldCollapseAttribute(Document.OutputSettings out) {try{__CLR4_2_117s17sjpaexqcu.R.inc(1638);
        __CLR4_2_117s17sjpaexqcu.R.inc(1639);return shouldCollapseAttribute(key, val, out);
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    protected static boolean shouldCollapseAttribute(final String key, final String val, final Document.OutputSettings out) {try{__CLR4_2_117s17sjpaexqcu.R.inc(1640);
        __CLR4_2_117s17sjpaexqcu.R.inc(1641);return (
            out.syntax() == Document.OutputSettings.Syntax.html &&
                (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key)));
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    /**
     * @deprecated
     */
    protected boolean isBooleanAttribute() {try{__CLR4_2_117s17sjpaexqcu.R.inc(1642);
        __CLR4_2_117s17sjpaexqcu.R.inc(1643);return Arrays.binarySearch(booleanAttributes, key) >= 0 || val == null;
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    /**
     * Checks if this attribute name is defined as a boolean attribute in HTML5
     */
    protected static boolean isBooleanAttribute(final String key) {try{__CLR4_2_117s17sjpaexqcu.R.inc(1644);
        __CLR4_2_117s17sjpaexqcu.R.inc(1645);return Arrays.binarySearch(booleanAttributes, key) >= 0;
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_2_117s17sjpaexqcu.R.inc(1646); // note parent not considered
        __CLR4_2_117s17sjpaexqcu.R.inc(1647);if ((((this == o)&&(__CLR4_2_117s17sjpaexqcu.R.iget(1648)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1649)==0&false))) {__CLR4_2_117s17sjpaexqcu.R.inc(1650);return true;
        }__CLR4_2_117s17sjpaexqcu.R.inc(1651);if ((((o == null || getClass() != o.getClass())&&(__CLR4_2_117s17sjpaexqcu.R.iget(1652)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1653)==0&false))) {__CLR4_2_117s17sjpaexqcu.R.inc(1654);return false;
        }__CLR4_2_117s17sjpaexqcu.R.inc(1655);Attribute attribute = (Attribute) o;
        __CLR4_2_117s17sjpaexqcu.R.inc(1656);if (((((((key != null )&&(__CLR4_2_117s17sjpaexqcu.R.iget(1657)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1658)==0&false))? !key.equals(attribute.key) : attribute.key != null)&&(__CLR4_2_117s17sjpaexqcu.R.iget(1659)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1660)==0&false))) {__CLR4_2_117s17sjpaexqcu.R.inc(1661);return false;
        }__CLR4_2_117s17sjpaexqcu.R.inc(1662);return (((val != null )&&(__CLR4_2_117s17sjpaexqcu.R.iget(1663)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1664)==0&false))? val.equals(attribute.val) : attribute.val == null;
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_2_117s17sjpaexqcu.R.inc(1665); // note parent not considered
        __CLR4_2_117s17sjpaexqcu.R.inc(1666);int result = (((key != null )&&(__CLR4_2_117s17sjpaexqcu.R.iget(1667)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1668)==0&false))? key.hashCode() : 0;
        __CLR4_2_117s17sjpaexqcu.R.inc(1669);result = 31 * result + ((((val != null )&&(__CLR4_2_117s17sjpaexqcu.R.iget(1670)!=0|true))||(__CLR4_2_117s17sjpaexqcu.R.iget(1671)==0&false))? val.hashCode() : 0);
        __CLR4_2_117s17sjpaexqcu.R.inc(1672);return result;
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}

    @Override
    public Attribute clone() {try{__CLR4_2_117s17sjpaexqcu.R.inc(1673);
        __CLR4_2_117s17sjpaexqcu.R.inc(1674);try {
            __CLR4_2_117s17sjpaexqcu.R.inc(1675);return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            __CLR4_2_117s17sjpaexqcu.R.inc(1676);throw new RuntimeException(e);
        }
    }finally{__CLR4_2_117s17sjpaexqcu.R.flushNeeded();}}
}
