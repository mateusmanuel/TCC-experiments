/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;

import java.io.IOException;

/**
 A text node.

 @author Jonathan Hedley, jonathan@hedley.net */
public class TextNode extends LeafNode {public static class __CLR4_2_12s12s1jpaexqi8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,3652,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     Create a new TextNode representing the supplied (unencoded) text).

     @param text raw text
     @see #createFromEncoded(String)
     */
    public TextNode(String text) {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3601);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3602);value = text;
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

    /**
     Create a new TextNode representing the supplied (unencoded) text).

     @param text raw text
     @param baseUri base uri - ignored for this node type
     @see #createFromEncoded(String, String)
     @deprecated use {@link TextNode#TextNode(String)}
     */
    public TextNode(String text, String baseUri) {
        this(text);__CLR4_2_12s12s1jpaexqi8.R.inc(3604);try{__CLR4_2_12s12s1jpaexqi8.R.inc(3603);
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

	public String nodeName() {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3605);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3606);return "#text";
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}
    
    /**
     * Get the text content of this text node.
     * @return Unencoded, normalised text.
     * @see TextNode#getWholeText()
     */
    public String text() {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3607);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3608);return StringUtil.normaliseWhitespace(getWholeText());
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}
    
    /**
     * Set the text content of this text node.
     * @param text unencoded text
     * @return this, for chaining
     */
    public TextNode text(String text) {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3609);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3610);coreValue(text);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3611);return this;
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

    /**
     Get the (unencoded) text of this text node, including any newlines and spaces present in the original.
     @return text
     */
    public String getWholeText() {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3612);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3613);return coreValue();
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

    /**
     Test if this text node is blank -- that is, empty or only whitespace (including newlines).
     @return true if this document is empty or only whitespace, false if it contains any text content.
     */
    public boolean isBlank() {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3614);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3615);return StringUtil.isBlank(coreValue());
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

    /**
     * Split this text node into two nodes at the specified string offset. After splitting, this node will contain the
     * original text up to the offset, and will have a new text node sibling containing the text after the offset.
     * @param offset string offset point to split node at.
     * @return the newly created text node containing the text after the offset.
     */
    public TextNode splitText(int offset) {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3616);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3617);final String text = coreValue();
        __CLR4_2_12s12s1jpaexqi8.R.inc(3618);Validate.isTrue(offset >= 0, "Split offset must be not be negative");
        __CLR4_2_12s12s1jpaexqi8.R.inc(3619);Validate.isTrue(offset < text.length(), "Split offset must not be greater than current text length");

        __CLR4_2_12s12s1jpaexqi8.R.inc(3620);String head = text.substring(0, offset);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3621);String tail = text.substring(offset);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3622);text(head);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3623);TextNode tailNode = new TextNode(tail);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3624);if ((((parent() != null)&&(__CLR4_2_12s12s1jpaexqi8.R.iget(3625)!=0|true))||(__CLR4_2_12s12s1jpaexqi8.R.iget(3626)==0&false)))
            {__CLR4_2_12s12s1jpaexqi8.R.inc(3627);parent().addChildren(siblingIndex()+1, tailNode);

        }__CLR4_2_12s12s1jpaexqi8.R.inc(3628);return tailNode;
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

	void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3629);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3630);if ((((out.prettyPrint() && ((siblingIndex() == 0 && parentNode instanceof Element && ((Element) parentNode).tag().formatAsBlock() && !isBlank()) || (out.outline() && siblingNodes().size()>0 && !isBlank()) ))&&(__CLR4_2_12s12s1jpaexqi8.R.iget(3631)!=0|true))||(__CLR4_2_12s12s1jpaexqi8.R.iget(3632)==0&false)))
            {__CLR4_2_12s12s1jpaexqi8.R.inc(3633);indent(accum, depth, out);

        }__CLR4_2_12s12s1jpaexqi8.R.inc(3634);boolean normaliseWhite = out.prettyPrint() && parent() instanceof Element
                && !Element.preserveWhitespace(parent());
        __CLR4_2_12s12s1jpaexqi8.R.inc(3635);Entities.escape(accum, coreValue(), out, false, normaliseWhite, false);
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

	void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3636);}finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3637);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3638);return outerHtml();
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

    /**
     * Create a new TextNode from HTML encoded (aka escaped) data.
     * @param encodedText Text containing encoded HTML (e.g. &amp;lt;)
     * @param baseUri Base uri
     * @return TextNode containing unencoded data (e.g. &lt;)
     * @deprecated use {@link TextNode#createFromEncoded(String)} instead, as LeafNodes don't carry base URIs.
     */
    public static TextNode createFromEncoded(String encodedText, String baseUri) {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3639);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3640);String text = Entities.unescape(encodedText);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3641);return new TextNode(text);
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

    /**
     * Create a new TextNode from HTML encoded (aka escaped) data.
     * @param encodedText Text containing encoded HTML (e.g. &amp;lt;)
     * @return TextNode containing unencoded data (e.g. &lt;)
     */
    public static TextNode createFromEncoded(String encodedText) {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3642);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3643);String text = Entities.unescape(encodedText);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3644);return new TextNode(text);
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

    static String normaliseWhitespace(String text) {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3645);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3646);text = StringUtil.normaliseWhitespace(text);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3647);return text;
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

    static String stripLeadingWhitespace(String text) {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3648);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3649);return text.replaceFirst("^\\s+", "");
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}

    static boolean lastCharIsWhitespace(StringBuilder sb) {try{__CLR4_2_12s12s1jpaexqi8.R.inc(3650);
        __CLR4_2_12s12s1jpaexqi8.R.inc(3651);return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }finally{__CLR4_2_12s12s1jpaexqi8.R.flushNeeded();}}


}
