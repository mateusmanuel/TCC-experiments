/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.safety;

/*
    Thank you to Ryan Grove (wonko.com) for the Ruby HTML cleaner http://github.com/rgrove/sanitize/, which inspired
    this whitelist configuration, and the initial defaults.
 */

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;


/**
 Whitelists define what HTML (elements and attributes) to allow through the cleaner. Everything else is removed.
 <p>
 Start with one of the defaults:
 </p>
 <ul>
 <li>{@link #none}
 <li>{@link #simpleText}
 <li>{@link #basic}
 <li>{@link #basicWithImages}
 <li>{@link #relaxed}
 </ul>
 <p>
 If you need to allow more through (please be careful!), tweak a base whitelist with:
 </p>
 <ul>
 <li>{@link #addTags}
 <li>{@link #addAttributes}
 <li>{@link #addEnforcedAttribute}
 <li>{@link #addProtocols}
 </ul>
 <p>
 You can remove any setting from an existing whitelist with:
 </p>
 <ul>
 <li>{@link #removeTags}
 <li>{@link #removeAttributes}
 <li>{@link #removeEnforcedAttribute}
 <li>{@link #removeProtocols}
 </ul>
 
 <p>
 The cleaner and these whitelists assume that you want to clean a <code>body</code> fragment of HTML (to add user
 supplied HTML into a templated page), and not to clean a full HTML document. If the latter is the case, either wrap the
 document HTML around the cleaned body HTML, or create a whitelist that allows <code>html</code> and <code>head</code>
 elements as appropriate.
 </p>
 <p>
 If you are going to extend a whitelist, please be very careful. Make sure you understand what attributes may lead to
 XSS attack vectors. URL attributes are particularly vulnerable and require careful validation. See 
 http://ha.ckers.org/xss.html for some XSS attack examples.
 </p>

 @author Jonathan Hedley
 */
public class Whitelist {public static class __CLR4_2_16wy6wyjp2rxaam{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543506510356L,8589935092L,9234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Set<TagName> tagNames; // tags allowed, lower case. e.g. [p, br, span]
    private Map<TagName, Set<AttributeKey>> attributes; // tag -> attribute[]. allowed attributes [href] for a tag.
    private Map<TagName, Map<AttributeKey, AttributeValue>> enforcedAttributes; // always set these attribute values
    private Map<TagName, Map<AttributeKey, Set<Protocol>>> protocols; // allowed URL protocols for attributes
    private boolean preserveRelativeLinks; // option to preserve relative links

    /**
     This whitelist allows only text nodes: all HTML will be stripped.

     @return whitelist
     */
    public static Whitelist none() {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(8962);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8963);return new Whitelist();
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     This whitelist allows only simple text formatting: <code>b, em, i, strong, u</code>. All other HTML (tags and
     attributes) will be removed.

     @return whitelist
     */
    public static Whitelist simpleText() {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(8964);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8965);return new Whitelist()
                .addTags("b", "em", "i", "strong", "u")
                ;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     <p>
     This whitelist allows a fuller range of text nodes: <code>a, b, blockquote, br, cite, code, dd, dl, dt, em, i, li,
     ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul</code>, and appropriate attributes.
     </p>
     <p>
     Links (<code>a</code> elements) can point to <code>http, https, ftp, mailto</code>, and have an enforced
     <code>rel=nofollow</code> attribute.
     </p>
     <p>
     Does not allow images.
     </p>

     @return whitelist
     */
    public static Whitelist basic() {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(8966);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8967);return new Whitelist()
                .addTags(
                        "a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em",
                        "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub",
                        "sup", "u", "ul")

                .addAttributes("a", "href")
                .addAttributes("blockquote", "cite")
                .addAttributes("q", "cite")

                .addProtocols("a", "href", "ftp", "http", "https", "mailto")
                .addProtocols("blockquote", "cite", "http", "https")
                .addProtocols("cite", "cite", "http", "https")

                .addEnforcedAttribute("a", "rel", "nofollow")
                ;

    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     This whitelist allows the same text tags as {@link #basic}, and also allows <code>img</code> tags, with appropriate
     attributes, with <code>src</code> pointing to <code>http</code> or <code>https</code>.

     @return whitelist
     */
    public static Whitelist basicWithImages() {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(8968);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8969);return basic()
                .addTags("img")
                .addAttributes("img", "align", "alt", "height", "src", "title", "width")
                .addProtocols("img", "src", "http", "https")
                ;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     This whitelist allows a full range of text and structural body HTML: <code>a, b, blockquote, br, caption, cite,
     code, col, colgroup, dd, div, dl, dt, em, h1, h2, h3, h4, h5, h6, i, img, li, ol, p, pre, q, small, span, strike, strong, sub,
     sup, table, tbody, td, tfoot, th, thead, tr, u, ul</code>
     <p>
     Links do not have an enforced <code>rel=nofollow</code> attribute, but you can add that if desired.
     </p>

     @return whitelist
     */
    public static Whitelist relaxed() {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(8970);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8971);return new Whitelist()
                .addTags(
                        "a", "b", "blockquote", "br", "caption", "cite", "code", "col",
                        "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6",
                        "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong",
                        "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u",
                        "ul")

                .addAttributes("a", "href", "title")
                .addAttributes("blockquote", "cite")
                .addAttributes("col", "span", "width")
                .addAttributes("colgroup", "span", "width")
                .addAttributes("img", "align", "alt", "height", "src", "title", "width")
                .addAttributes("ol", "start", "type")
                .addAttributes("q", "cite")
                .addAttributes("table", "summary", "width")
                .addAttributes("td", "abbr", "axis", "colspan", "rowspan", "width")
                .addAttributes(
                        "th", "abbr", "axis", "colspan", "rowspan", "scope",
                        "width")
                .addAttributes("ul", "type")

                .addProtocols("a", "href", "ftp", "http", "https", "mailto")
                .addProtocols("blockquote", "cite", "http", "https")
                .addProtocols("cite", "cite", "http", "https")
                .addProtocols("img", "src", "http", "https")
                .addProtocols("q", "cite", "http", "https")
                ;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     Create a new, empty whitelist. Generally it will be better to start with a default prepared whitelist instead.

     @see #basic()
     @see #basicWithImages()
     @see #simpleText()
     @see #relaxed()
     */
    public Whitelist() {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(8972);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8973);tagNames = new HashSet<>();
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8974);attributes = new HashMap<>();
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8975);enforcedAttributes = new HashMap<>();
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8976);protocols = new HashMap<>();
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8977);preserveRelativeLinks = false;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     Add a list of allowed elements to a whitelist. (If a tag is not allowed, it will be removed from the HTML.)

     @param tags tag names to allow
     @return this (for chaining)
     */
    public Whitelist addTags(String... tags) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(8978);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8979);Validate.notNull(tags);

        __CLR4_2_16wy6wyjp2rxaam.R.inc(8980);for (String tagName : tags) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(8981);Validate.notEmpty(tagName);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(8982);tagNames.add(TagName.valueOf(tagName));
        }
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(8983);return this;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     Remove a list of allowed elements from a whitelist. (If a tag is not allowed, it will be removed from the HTML.)

     @param tags tag names to disallow
     @return this (for chaining)
     */
    public Whitelist removeTags(String... tags) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(8984);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8985);Validate.notNull(tags);

        __CLR4_2_16wy6wyjp2rxaam.R.inc(8986);for(String tag: tags) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(8987);Validate.notEmpty(tag);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(8988);TagName tagName = TagName.valueOf(tag);

            __CLR4_2_16wy6wyjp2rxaam.R.inc(8989);if((((tagNames.remove(tagName))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(8990)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(8991)==0&false))) {{ // Only look in sub-maps if tag was allowed
                __CLR4_2_16wy6wyjp2rxaam.R.inc(8992);attributes.remove(tagName);
                __CLR4_2_16wy6wyjp2rxaam.R.inc(8993);enforcedAttributes.remove(tagName);
                __CLR4_2_16wy6wyjp2rxaam.R.inc(8994);protocols.remove(tagName);
            }
        }}
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(8995);return this;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     Add a list of allowed attributes to a tag. (If an attribute is not allowed on an element, it will be removed.)
     <p>
     E.g.: <code>addAttributes("a", "href", "class")</code> allows <code>href</code> and <code>class</code> attributes
     on <code>a</code> tags.
     </p>
     <p>
     To make an attribute valid for <b>all tags</b>, use the pseudo tag <code>:all</code>, e.g.
     <code>addAttributes(":all", "class")</code>.
     </p>

     @param tag  The tag the attributes are for. The tag will be added to the allowed tag list if necessary.
     @param attributes List of valid attributes for the tag
     @return this (for chaining)
     */
    public Whitelist addAttributes(String tag, String... attributes) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(8996);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8997);Validate.notEmpty(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8998);Validate.notNull(attributes);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(8999);Validate.isTrue(attributes.length > 0, "No attribute names supplied.");

        __CLR4_2_16wy6wyjp2rxaam.R.inc(9000);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9001);tagNames.add(tagName);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9002);Set<AttributeKey> attributeSet = new HashSet<>();
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9003);for (String key : attributes) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9004);Validate.notEmpty(key);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9005);attributeSet.add(AttributeKey.valueOf(key));
        }
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9006);if ((((this.attributes.containsKey(tagName))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9007)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9008)==0&false))) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9009);Set<AttributeKey> currentSet = this.attributes.get(tagName);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9010);currentSet.addAll(attributeSet);
        } }else {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9011);this.attributes.put(tagName, attributeSet);
        }
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9012);return this;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     Remove a list of allowed attributes from a tag. (If an attribute is not allowed on an element, it will be removed.)
     <p>
     E.g.: <code>removeAttributes("a", "href", "class")</code> disallows <code>href</code> and <code>class</code>
     attributes on <code>a</code> tags.
     </p>
     <p>
     To make an attribute invalid for <b>all tags</b>, use the pseudo tag <code>:all</code>, e.g.
     <code>removeAttributes(":all", "class")</code>.
     </p>

     @param tag  The tag the attributes are for.
     @param attributes List of invalid attributes for the tag
     @return this (for chaining)
     */
    public Whitelist removeAttributes(String tag, String... attributes) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9013);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9014);Validate.notEmpty(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9015);Validate.notNull(attributes);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9016);Validate.isTrue(attributes.length > 0, "No attribute names supplied.");

        __CLR4_2_16wy6wyjp2rxaam.R.inc(9017);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9018);Set<AttributeKey> attributeSet = new HashSet<>();
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9019);for (String key : attributes) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9020);Validate.notEmpty(key);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9021);attributeSet.add(AttributeKey.valueOf(key));
        }
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9022);if((((tagNames.contains(tagName) && this.attributes.containsKey(tagName))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9023)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9024)==0&false))) {{ // Only look in sub-maps if tag was allowed
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9025);Set<AttributeKey> currentSet = this.attributes.get(tagName);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9026);currentSet.removeAll(attributeSet);

            __CLR4_2_16wy6wyjp2rxaam.R.inc(9027);if((((currentSet.isEmpty())&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9028)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9029)==0&false))) // Remove tag from attribute map if no attributes are allowed for tag
                {__CLR4_2_16wy6wyjp2rxaam.R.inc(9030);this.attributes.remove(tagName);
        }}
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9031);if((((tag.equals(":all"))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9032)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9033)==0&false))) // Attribute needs to be removed from all individually set tags
            {__CLR4_2_16wy6wyjp2rxaam.R.inc(9034);for(TagName name: this.attributes.keySet()) {{
                __CLR4_2_16wy6wyjp2rxaam.R.inc(9035);Set<AttributeKey> currentSet = this.attributes.get(name);
                __CLR4_2_16wy6wyjp2rxaam.R.inc(9036);currentSet.removeAll(attributeSet);

                __CLR4_2_16wy6wyjp2rxaam.R.inc(9037);if((((currentSet.isEmpty())&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9038)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9039)==0&false))) // Remove tag from attribute map if no attributes are allowed for tag
                    {__CLR4_2_16wy6wyjp2rxaam.R.inc(9040);this.attributes.remove(name);
            }}
        }}__CLR4_2_16wy6wyjp2rxaam.R.inc(9041);return this;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     Add an enforced attribute to a tag. An enforced attribute will always be added to the element. If the element
     already has the attribute set, it will be overridden with this value.
     <p>
     E.g.: <code>addEnforcedAttribute("a", "rel", "nofollow")</code> will make all <code>a</code> tags output as
     <code>&lt;a href="..." rel="nofollow"&gt;</code>
     </p>

     @param tag   The tag the enforced attribute is for. The tag will be added to the allowed tag list if necessary.
     @param attribute   The attribute name
     @param value The enforced attribute value
     @return this (for chaining)
     */
    public Whitelist addEnforcedAttribute(String tag, String attribute, String value) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9042);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9043);Validate.notEmpty(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9044);Validate.notEmpty(attribute);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9045);Validate.notEmpty(value);

        __CLR4_2_16wy6wyjp2rxaam.R.inc(9046);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9047);tagNames.add(tagName);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9048);AttributeKey attrKey = AttributeKey.valueOf(attribute);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9049);AttributeValue attrVal = AttributeValue.valueOf(value);

        __CLR4_2_16wy6wyjp2rxaam.R.inc(9050);if ((((enforcedAttributes.containsKey(tagName))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9051)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9052)==0&false))) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9053);enforcedAttributes.get(tagName).put(attrKey, attrVal);
        } }else {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9054);Map<AttributeKey, AttributeValue> attrMap = new HashMap<>();
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9055);attrMap.put(attrKey, attrVal);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9056);enforcedAttributes.put(tagName, attrMap);
        }
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9057);return this;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     Remove a previously configured enforced attribute from a tag.

     @param tag   The tag the enforced attribute is for.
     @param attribute   The attribute name
     @return this (for chaining)
     */
    public Whitelist removeEnforcedAttribute(String tag, String attribute) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9058);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9059);Validate.notEmpty(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9060);Validate.notEmpty(attribute);

        __CLR4_2_16wy6wyjp2rxaam.R.inc(9061);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9062);if((((tagNames.contains(tagName) && enforcedAttributes.containsKey(tagName))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9063)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9064)==0&false))) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9065);AttributeKey attrKey = AttributeKey.valueOf(attribute);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9066);Map<AttributeKey, AttributeValue> attrMap = enforcedAttributes.get(tagName);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9067);attrMap.remove(attrKey);

            __CLR4_2_16wy6wyjp2rxaam.R.inc(9068);if((((attrMap.isEmpty())&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9069)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9070)==0&false))) // Remove tag from enforced attribute map if no enforced attributes are present
                {__CLR4_2_16wy6wyjp2rxaam.R.inc(9071);enforcedAttributes.remove(tagName);
        }}
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9072);return this;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     * Configure this Whitelist to preserve relative links in an element's URL attribute, or convert them to absolute
     * links. By default, this is <b>false</b>: URLs will be  made absolute (e.g. start with an allowed protocol, like
     * e.g. {@code http://}.
     * <p>
     * Note that when handling relative links, the input document must have an appropriate {@code base URI} set when
     * parsing, so that the link's protocol can be confirmed. Regardless of the setting of the {@code preserve relative
     * links} option, the link must be resolvable against the base URI to an allowed protocol; otherwise the attribute
     * will be removed.
     * </p>
     *
     * @param preserve {@code true} to allow relative links, {@code false} (default) to deny
     * @return this Whitelist, for chaining.
     * @see #addProtocols
     */
    public Whitelist preserveRelativeLinks(boolean preserve) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9073);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9074);preserveRelativeLinks = preserve;
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9075);return this;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     Add allowed URL protocols for an element's URL attribute. This restricts the possible values of the attribute to
     URLs with the defined protocol.
     <p>
     E.g.: <code>addProtocols("a", "href", "ftp", "http", "https")</code>
     </p>
     <p>
     To allow a link to an in-page URL anchor (i.e. <code>&lt;a href="#anchor"&gt;</code>, add a <code>#</code>:<br>
     E.g.: <code>addProtocols("a", "href", "#")</code>
     </p>

     @param tag       Tag the URL protocol is for
     @param attribute       Attribute name
     @param protocols List of valid protocols
     @return this, for chaining
     */
    public Whitelist addProtocols(String tag, String attribute, String... protocols) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9076);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9077);Validate.notEmpty(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9078);Validate.notEmpty(attribute);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9079);Validate.notNull(protocols);

        __CLR4_2_16wy6wyjp2rxaam.R.inc(9080);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9081);AttributeKey attrKey = AttributeKey.valueOf(attribute);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9082);Map<AttributeKey, Set<Protocol>> attrMap;
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9083);Set<Protocol> protSet;

        __CLR4_2_16wy6wyjp2rxaam.R.inc(9084);if ((((this.protocols.containsKey(tagName))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9085)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9086)==0&false))) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9087);attrMap = this.protocols.get(tagName);
        } }else {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9088);attrMap = new HashMap<>();
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9089);this.protocols.put(tagName, attrMap);
        }
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9090);if ((((attrMap.containsKey(attrKey))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9091)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9092)==0&false))) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9093);protSet = attrMap.get(attrKey);
        } }else {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9094);protSet = new HashSet<>();
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9095);attrMap.put(attrKey, protSet);
        }
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9096);for (String protocol : protocols) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9097);Validate.notEmpty(protocol);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9098);Protocol prot = Protocol.valueOf(protocol);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9099);protSet.add(prot);
        }
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9100);return this;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     Remove allowed URL protocols for an element's URL attribute. If you remove all protocols for an attribute, that
     attribute will allow any protocol.
     <p>
     E.g.: <code>removeProtocols("a", "href", "ftp")</code>
     </p>

     @param tag Tag the URL protocol is for
     @param attribute Attribute name
     @param removeProtocols List of invalid protocols
     @return this, for chaining
     */
    public Whitelist removeProtocols(String tag, String attribute, String... removeProtocols) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9101);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9102);Validate.notEmpty(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9103);Validate.notEmpty(attribute);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9104);Validate.notNull(removeProtocols);

        __CLR4_2_16wy6wyjp2rxaam.R.inc(9105);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9106);AttributeKey attr = AttributeKey.valueOf(attribute);

        // make sure that what we're removing actually exists; otherwise can open the tag to any data and that can
        // be surprising
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9107);Validate.isTrue(protocols.containsKey(tagName), "Cannot remove a protocol that is not set.");
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9108);Map<AttributeKey, Set<Protocol>> tagProtocols = protocols.get(tagName);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9109);Validate.isTrue(tagProtocols.containsKey(attr), "Cannot remove a protocol that is not set.");

        __CLR4_2_16wy6wyjp2rxaam.R.inc(9110);Set<Protocol> attrProtocols = tagProtocols.get(attr);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9111);for (String protocol : removeProtocols) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9112);Validate.notEmpty(protocol);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9113);attrProtocols.remove(Protocol.valueOf(protocol));
        }

        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9114);if ((((attrProtocols.isEmpty())&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9115)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9116)==0&false))) {{ // Remove protocol set if empty
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9117);tagProtocols.remove(attr);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9118);if ((((tagProtocols.isEmpty())&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9119)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9120)==0&false))) // Remove entry for tag if empty
                {__CLR4_2_16wy6wyjp2rxaam.R.inc(9121);protocols.remove(tagName);
        }}
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9122);return this;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     * Test if the supplied tag is allowed by this whitelist
     * @param tag test tag
     * @return true if allowed
     */
    protected boolean isSafeTag(String tag) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9123);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9124);return tagNames.contains(TagName.valueOf(tag));
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    /**
     * Test if the supplied attribute is allowed by this whitelist for this tag
     * @param tagName tag to consider allowing the attribute in
     * @param el element under test, to confirm protocol
     * @param attr attribute under test
     * @return true if allowed
     */
    protected boolean isSafeAttribute(String tagName, Element el, Attribute attr) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9125);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9126);TagName tag = TagName.valueOf(tagName);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9127);AttributeKey key = AttributeKey.valueOf(attr.getKey());

        __CLR4_2_16wy6wyjp2rxaam.R.inc(9128);Set<AttributeKey> okSet = attributes.get(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9129);if ((((okSet != null && okSet.contains(key))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9130)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9131)==0&false))) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9132);if ((((protocols.containsKey(tag))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9133)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9134)==0&false))) {{
                __CLR4_2_16wy6wyjp2rxaam.R.inc(9135);Map<AttributeKey, Set<Protocol>> attrProts = protocols.get(tag);
                // ok if not defined protocol; otherwise test
                __CLR4_2_16wy6wyjp2rxaam.R.inc(9136);return !attrProts.containsKey(key) || testValidProtocol(el, attr, attrProts.get(key));
            } }else {{ // attribute found, no protocols defined, so OK
                __CLR4_2_16wy6wyjp2rxaam.R.inc(9137);return true;
            }
        }}
        // might be an enforced attribute?
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9138);Map<AttributeKey, AttributeValue> enforcedSet = enforcedAttributes.get(tag);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9139);if ((((enforcedSet != null)&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9140)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9141)==0&false))) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9142);Attributes expect = getEnforcedAttributes(tagName);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9143);String attrKey = attr.getKey();
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9144);if ((((expect.hasKeyIgnoreCase(attrKey))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9145)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9146)==0&false))) {{
                __CLR4_2_16wy6wyjp2rxaam.R.inc(9147);return expect.getIgnoreCase(attrKey).equals(attr.getValue());
            }
        }}
        // no attributes defined for tag, try :all tag
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9148);return !tagName.equals(":all") && isSafeAttribute(":all", el, attr);
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    private boolean testValidProtocol(Element el, Attribute attr, Set<Protocol> protocols) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9149);
        // try to resolve relative urls to abs, and optionally update the attribute so output html has abs.
        // rels without a baseuri get removed
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9150);String value = el.absUrl(attr.getKey());
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9151);if ((((value.length() == 0)&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9152)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9153)==0&false)))
            {__CLR4_2_16wy6wyjp2rxaam.R.inc(9154);value = attr.getValue(); // if it could not be made abs, run as-is to allow custom unknown protocols
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9155);if ((((!preserveRelativeLinks)&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9156)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9157)==0&false)))
            {__CLR4_2_16wy6wyjp2rxaam.R.inc(9158);attr.setValue(value);
        
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9159);for (Protocol protocol : protocols) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9160);String prot = protocol.toString();

            __CLR4_2_16wy6wyjp2rxaam.R.inc(9161);if ((((prot.equals("#"))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9162)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9163)==0&false))) {{ // allows anchor links
                __CLR4_2_16wy6wyjp2rxaam.R.inc(9164);if ((((isValidAnchor(value))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9165)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9166)==0&false))) {{
                    __CLR4_2_16wy6wyjp2rxaam.R.inc(9167);return true;
                } }else {{
                    __CLR4_2_16wy6wyjp2rxaam.R.inc(9168);continue;
                }
            }}

            }__CLR4_2_16wy6wyjp2rxaam.R.inc(9169);prot += ":";

            __CLR4_2_16wy6wyjp2rxaam.R.inc(9170);if ((((lowerCase(value).startsWith(prot))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9171)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9172)==0&false))) {{
                __CLR4_2_16wy6wyjp2rxaam.R.inc(9173);return true;
            }
        }}
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9174);return false;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    private boolean isValidAnchor(String value) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9175);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9176);return value.startsWith("#") && !value.matches(".*\\s.*");
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

    Attributes getEnforcedAttributes(String tagName) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9177);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9178);Attributes attrs = new Attributes();
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9179);TagName tag = TagName.valueOf(tagName);
        __CLR4_2_16wy6wyjp2rxaam.R.inc(9180);if ((((enforcedAttributes.containsKey(tag))&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9181)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9182)==0&false))) {{
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9183);Map<AttributeKey, AttributeValue> keyVals = enforcedAttributes.get(tag);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9184);for (Map.Entry<AttributeKey, AttributeValue> entry : keyVals.entrySet()) {{
                __CLR4_2_16wy6wyjp2rxaam.R.inc(9185);attrs.put(entry.getKey().toString(), entry.getValue().toString());
            }
        }}
        }__CLR4_2_16wy6wyjp2rxaam.R.inc(9186);return attrs;
    }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}
    
    // named types for config. All just hold strings, but here for my sanity.

    static class TagName extends TypedValue {
        TagName(String value) {
            super(value);__CLR4_2_16wy6wyjp2rxaam.R.inc(9188);try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9187);
        }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

        static TagName valueOf(String value) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9189);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9190);return new TagName(value);
        }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}
    }

    static class AttributeKey extends TypedValue {
        AttributeKey(String value) {
            super(value);__CLR4_2_16wy6wyjp2rxaam.R.inc(9192);try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9191);
        }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

        static AttributeKey valueOf(String value) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9193);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9194);return new AttributeKey(value);
        }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}
    }

    static class AttributeValue extends TypedValue {
        AttributeValue(String value) {
            super(value);__CLR4_2_16wy6wyjp2rxaam.R.inc(9196);try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9195);
        }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

        static AttributeValue valueOf(String value) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9197);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9198);return new AttributeValue(value);
        }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}
    }

    static class Protocol extends TypedValue {
        Protocol(String value) {
            super(value);__CLR4_2_16wy6wyjp2rxaam.R.inc(9200);try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9199);
        }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

        static Protocol valueOf(String value) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9201);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9202);return new Protocol(value);
        }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}
    }

    abstract static class TypedValue {
        private String value;

        TypedValue(String value) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9203);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9204);Validate.notNull(value);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9205);this.value = value;
        }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9206);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9207);final int prime = 31;
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9208);int result = 1;
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9209);result = prime * result + (((((value == null) )&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9210)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9211)==0&false))? 0 : value.hashCode());
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9212);return result;
        }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9213);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9214);if ((((this == obj)&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9215)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9216)==0&false))) {__CLR4_2_16wy6wyjp2rxaam.R.inc(9217);return true;
            }__CLR4_2_16wy6wyjp2rxaam.R.inc(9218);if ((((obj == null)&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9219)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9220)==0&false))) {__CLR4_2_16wy6wyjp2rxaam.R.inc(9221);return false;
            }__CLR4_2_16wy6wyjp2rxaam.R.inc(9222);if ((((getClass() != obj.getClass())&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9223)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9224)==0&false))) {__CLR4_2_16wy6wyjp2rxaam.R.inc(9225);return false;
            }__CLR4_2_16wy6wyjp2rxaam.R.inc(9226);TypedValue other = (TypedValue) obj;
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9227);if ((((value == null)&&(__CLR4_2_16wy6wyjp2rxaam.R.iget(9228)!=0|true))||(__CLR4_2_16wy6wyjp2rxaam.R.iget(9229)==0&false))) {{
                __CLR4_2_16wy6wyjp2rxaam.R.inc(9230);return other.value == null;
            } }else {__CLR4_2_16wy6wyjp2rxaam.R.inc(9231);return value.equals(other.value);
        }}finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_16wy6wyjp2rxaam.R.inc(9232);
            __CLR4_2_16wy6wyjp2rxaam.R.inc(9233);return value;
        }finally{__CLR4_2_16wy6wyjp2rxaam.R.flushNeeded();}}
    }
}

