/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

/**
 * HTML Tag capabilities.
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class Tag {public static class __CLR4_2_14zw4zwjpaexqm5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,6628,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Map<String, Tag> tags = new HashMap<>(); // map of known tags

    private String tagName;
    private boolean isBlock = true; // block or inline
    private boolean formatAsBlock = true; // should be formatted as a block
    private boolean canContainInline = true; // only pcdata if not
    private boolean empty = false; // can hold nothing; e.g. img
    private boolean selfClosing = false; // can self close (<foo />). used for unknown tags that self close, without forcing them as empty.
    private boolean preserveWhitespace = false; // for pre, textarea, script etc
    private boolean formList = false; // a control that appears in forms: input, textarea, output etc
    private boolean formSubmit = false; // a control that can be submitted in a form: input etc

    private Tag(String tagName) {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6476);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6477);this.tagName = tagName;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Get this tag's name.
     *
     * @return the tag's name
     */
    public String getName() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6478);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6479);return tagName;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.
     * <p>
     * Pre-defined tags (P, DIV etc) will be ==, but unknown tags are not registered and will only .equals().
     * </p>
     * 
     * @param tagName Name of tag, e.g. "p". Case insensitive.
     * @param settings used to control tag name sensitivity
     * @return The tag, either defined or new generic.
     */
    public static Tag valueOf(String tagName, ParseSettings settings) {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6480);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6481);Validate.notNull(tagName);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6482);Tag tag = tags.get(tagName);

        __CLR4_2_14zw4zwjpaexqm5.R.inc(6483);if ((((tag == null)&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6484)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6485)==0&false))) {{
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6486);tagName = settings.normalizeTag(tagName);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6487);Validate.notEmpty(tagName);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6488);tag = tags.get(tagName);

            __CLR4_2_14zw4zwjpaexqm5.R.inc(6489);if ((((tag == null)&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6490)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6491)==0&false))) {{
                // not defined: create default; go anywhere, do anything! (incl be inside a <p>)
                __CLR4_2_14zw4zwjpaexqm5.R.inc(6492);tag = new Tag(tagName);
                __CLR4_2_14zw4zwjpaexqm5.R.inc(6493);tag.isBlock = false;
            }
        }}
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6494);return tag;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.
     * <p>
     * Pre-defined tags (P, DIV etc) will be ==, but unknown tags are not registered and will only .equals().
     * </p>
     *
     * @param tagName Name of tag, e.g. "p". <b>Case sensitive</b>.
     * @return The tag, either defined or new generic.
     */
    public static Tag valueOf(String tagName) {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6495);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6496);return valueOf(tagName, ParseSettings.preserveCase);
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Gets if this is a block tag.
     *
     * @return if block tag
     */
    public boolean isBlock() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6497);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6498);return isBlock;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Gets if this tag should be formatted as a block (or as inline)
     *
     * @return if should be formatted as block or inline
     */
    public boolean formatAsBlock() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6499);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6500);return formatAsBlock;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Gets if this tag can contain block tags.
     *
     * @return if tag can contain block tags
     * @deprecated No longer used, and no different result than {{@link #isBlock()}}
     */
    public boolean canContainBlock() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6501);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6502);return isBlock;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Gets if this tag is an inline tag.
     *
     * @return if this tag is an inline tag.
     */
    public boolean isInline() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6503);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6504);return !isBlock;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Gets if this tag is a data only tag.
     *
     * @return if this tag is a data only tag
     */
    public boolean isData() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6505);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6506);return !canContainInline && !isEmpty();
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Get if this is an empty tag
     *
     * @return if this is an empty tag
     */
    public boolean isEmpty() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6507);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6508);return empty;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Get if this tag is self closing.
     *
     * @return if this tag should be output as self closing.
     */
    public boolean isSelfClosing() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6509);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6510);return empty || selfClosing;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Get if this is a pre-defined tag, or was auto created on parsing.
     *
     * @return if a known tag
     */
    public boolean isKnownTag() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6511);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6512);return tags.containsKey(tagName);
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Check if this tagname is a known tag.
     *
     * @param tagName name of tag
     * @return if known HTML tag
     */
    public static boolean isKnownTag(String tagName) {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6513);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6514);return tags.containsKey(tagName);
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Get if this tag should preserve whitespace within child text nodes.
     *
     * @return if preserve whitespace
     */
    public boolean preserveWhitespace() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6515);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6516);return preserveWhitespace;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Get if this tag represents a control associated with a form. E.g. input, textarea, output
     * @return if associated with a form
     */
    public boolean isFormListed() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6517);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6518);return formList;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    /**
     * Get if this tag represents an element that should be submitted with a form. E.g. input, option
     * @return if submittable with a form
     */
    public boolean isFormSubmittable() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6519);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6520);return formSubmit;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    Tag setSelfClosing() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6521);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6522);selfClosing = true;
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6523);return this;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6524);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6525);if ((((this == o)&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6526)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6527)==0&false))) {__CLR4_2_14zw4zwjpaexqm5.R.inc(6528);return true;
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6529);if ((((!(o instanceof Tag))&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6530)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6531)==0&false))) {__CLR4_2_14zw4zwjpaexqm5.R.inc(6532);return false;

        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6533);Tag tag = (Tag) o;

        __CLR4_2_14zw4zwjpaexqm5.R.inc(6534);if ((((!tagName.equals(tag.tagName))&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6535)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6536)==0&false))) {__CLR4_2_14zw4zwjpaexqm5.R.inc(6537);return false;
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6538);if ((((canContainInline != tag.canContainInline)&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6539)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6540)==0&false))) {__CLR4_2_14zw4zwjpaexqm5.R.inc(6541);return false;
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6542);if ((((empty != tag.empty)&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6543)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6544)==0&false))) {__CLR4_2_14zw4zwjpaexqm5.R.inc(6545);return false;
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6546);if ((((formatAsBlock != tag.formatAsBlock)&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6547)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6548)==0&false))) {__CLR4_2_14zw4zwjpaexqm5.R.inc(6549);return false;
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6550);if ((((isBlock != tag.isBlock)&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6551)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6552)==0&false))) {__CLR4_2_14zw4zwjpaexqm5.R.inc(6553);return false;
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6554);if ((((preserveWhitespace != tag.preserveWhitespace)&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6555)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6556)==0&false))) {__CLR4_2_14zw4zwjpaexqm5.R.inc(6557);return false;
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6558);if ((((selfClosing != tag.selfClosing)&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6559)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6560)==0&false))) {__CLR4_2_14zw4zwjpaexqm5.R.inc(6561);return false;
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6562);if ((((formList != tag.formList)&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6563)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6564)==0&false))) {__CLR4_2_14zw4zwjpaexqm5.R.inc(6565);return false;
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6566);return formSubmit == tag.formSubmit;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6567);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6568);int result = tagName.hashCode();
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6569);result = 31 * result + ((((isBlock )&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6570)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6571)==0&false))? 1 : 0);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6572);result = 31 * result + ((((formatAsBlock )&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6573)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6574)==0&false))? 1 : 0);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6575);result = 31 * result + ((((canContainInline )&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6576)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6577)==0&false))? 1 : 0);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6578);result = 31 * result + ((((empty )&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6579)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6580)==0&false))? 1 : 0);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6581);result = 31 * result + ((((selfClosing )&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6582)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6583)==0&false))? 1 : 0);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6584);result = 31 * result + ((((preserveWhitespace )&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6585)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6586)==0&false))? 1 : 0);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6587);result = 31 * result + ((((formList )&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6588)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6589)==0&false))? 1 : 0);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6590);result = 31 * result + ((((formSubmit )&&(__CLR4_2_14zw4zwjpaexqm5.R.iget(6591)!=0|true))||(__CLR4_2_14zw4zwjpaexqm5.R.iget(6592)==0&false))? 1 : 0);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6593);return result;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6594);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6595);return tagName;
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    // internal static initialisers:
    // prepped from http://www.w3.org/TR/REC-html40/sgml/dtd.html and other sources
    private static final String[] blockTags = {
            "html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame",
            "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6",
            "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins",
            "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th",
            "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main",
            "svg", "math"
    };
    private static final String[] inlineTags = {
            "object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd",
            "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q",
            "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup",
            "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track",
            "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track",
            "data", "bdi", "s"
    };
    private static final String[] emptyTags = {
            "meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command",
            "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"
    };
    private static final String[] formatAsInlineTags = {
            "title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style",
            "ins", "del", "s"
    };
    private static final String[] preserveWhitespaceTags = {
            "pre", "plaintext", "title", "textarea"
            // script is not here as it is a data node, which always preserve whitespace
    };
    // todo: I think we just need submit tags, and can scrub listed
    private static final String[] formListedTags = {
            "button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"
    };
    private static final String[] formSubmitTags = {
            "input", "keygen", "object", "select", "textarea"
    };

    static {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6596);
        // creates
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6597);for (String tagName : blockTags) {{
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6598);Tag tag = new Tag(tagName);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6599);register(tag);
        }
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6600);for (String tagName : inlineTags) {{
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6601);Tag tag = new Tag(tagName);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6602);tag.isBlock = false;
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6603);tag.formatAsBlock = false;
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6604);register(tag);
        }

        // mods:
        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6605);for (String tagName : emptyTags) {{
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6606);Tag tag = tags.get(tagName);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6607);Validate.notNull(tag);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6608);tag.canContainInline = false;
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6609);tag.empty = true;
        }

        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6610);for (String tagName : formatAsInlineTags) {{
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6611);Tag tag = tags.get(tagName);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6612);Validate.notNull(tag);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6613);tag.formatAsBlock = false;
        }

        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6614);for (String tagName : preserveWhitespaceTags) {{
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6615);Tag tag = tags.get(tagName);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6616);Validate.notNull(tag);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6617);tag.preserveWhitespace = true;
        }

        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6618);for (String tagName : formListedTags) {{
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6619);Tag tag = tags.get(tagName);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6620);Validate.notNull(tag);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6621);tag.formList = true;
        }

        }__CLR4_2_14zw4zwjpaexqm5.R.inc(6622);for (String tagName : formSubmitTags) {{
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6623);Tag tag = tags.get(tagName);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6624);Validate.notNull(tag);
            __CLR4_2_14zw4zwjpaexqm5.R.inc(6625);tag.formSubmit = true;
        }
    }}finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}

    private static void register(Tag tag) {try{__CLR4_2_14zw4zwjpaexqm5.R.inc(6626);
        __CLR4_2_14zw4zwjpaexqm5.R.inc(6627);tags.put(tag.tagName, tag);
    }finally{__CLR4_2_14zw4zwjpaexqm5.R.flushNeeded();}}
}
