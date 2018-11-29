/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.nodes;

import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import static org.jsoup.internal.Normalizer.normalize;

/**
 * A HTML element consists of a tag name, attributes, and child nodes (including text nodes and
 * other elements).
 * 
 * From an Element, you can extract data, traverse the node graph, and manipulate the HTML.
 * 
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class Element extends Node {public static class __CLR4_2_11rn1rnjp2rxa0f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543506510356L,8589935092L,2943,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final List<Node> EMPTY_NODES = Collections.emptyList();
    private static final Pattern classSplit = Pattern.compile("\\s+");
    private Tag tag;
    private WeakReference<List<Element>> shadowChildrenRef; // points to child elements shadowed from node children
    List<Node> childNodes;
    private Attributes attributes;
    private String baseUri;

    /**
     * Create a new, standalone element.
     * @param tag tag name
     */
    public Element(String tag) {
        this(Tag.valueOf(tag), "", new Attributes());__CLR4_2_11rn1rnjp2rxa0f.R.inc(2292);try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2291);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Create a new, standalone Element. (Standalone in that is has no parent.)
     * 
     * @param tag tag of this element
     * @param baseUri the base URI
     * @param attributes initial attributes
     * @see #appendChild(Node)
     * @see #appendElement(String)
     */
    public Element(Tag tag, String baseUri, Attributes attributes) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2293);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2294);Validate.notNull(tag);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2295);Validate.notNull(baseUri);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2296);childNodes = EMPTY_NODES;
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2297);this.baseUri = baseUri;
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2298);this.attributes = attributes;
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2299);this.tag = tag;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Create a new Element from a tag and a base URI.
     * 
     * @param tag element tag
     * @param baseUri the base URI of this element. It is acceptable for the base URI to be an empty
     *            string, but not null.
     * @see Tag#valueOf(String, ParseSettings)
     */
    public Element(Tag tag, String baseUri) {
        this(tag, baseUri, null);__CLR4_2_11rn1rnjp2rxa0f.R.inc(2301);try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2300);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    protected List<Node> ensureChildNodes() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2302);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2303);if ((((childNodes == EMPTY_NODES)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2304)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2305)==0&false))) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2306);childNodes = new NodeList(this, 4);
        }
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2307);return childNodes;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    @Override
    protected boolean hasAttributes() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2308);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2309);return attributes != null;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    @Override
    public Attributes attributes() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2310);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2311);if ((((!hasAttributes())&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2312)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2313)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2314);attributes = new Attributes();
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2315);return attributes;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    @Override
    public String baseUri() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2316);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2317);return baseUri;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    @Override
    protected void doSetBaseUri(String baseUri) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2318);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2319);this.baseUri = baseUri;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    @Override
    public int childNodeSize() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2320);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2321);return childNodes.size();
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    @Override
    public String nodeName() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2322);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2323);return tag.getName();
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get the name of the tag for this element. E.g. {@code div}
     * 
     * @return the tag name
     */
    public String tagName() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2324);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2325);return tag.getName();
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Change the tag of this element. For example, convert a {@code <span>} to a {@code <div>} with
     * {@code el.tagName("div");}.
     *
     * @param tagName new tag name for this element
     * @return this element, for chaining
     */
    public Element tagName(String tagName) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2326);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2327);Validate.notEmpty(tagName, "Tag name must not be empty.");
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2328);tag = Tag.valueOf(tagName, NodeUtils.parser(this).settings()); // maintains the case option of the original parse
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2329);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get the Tag for this element.
     * 
     * @return the tag object
     */
    public Tag tag() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2330);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2331);return tag;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Test if this element is a block-level element. (E.g. {@code <div> == true} or an inline element
     * {@code <p> == false}).
     * 
     * @return true if block, false if not (and thus inline)
     */
    public boolean isBlock() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2332);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2333);return tag.isBlock();
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get the {@code id} attribute of this element.
     * 
     * @return The id attribute, if present, or an empty string if not.
     */
    public String id() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2334);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2335);return attributes().getIgnoreCase("id");
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Set an attribute value on this element. If this element already has an attribute with the
     * key, its value is updated; otherwise, a new attribute is added.
     * 
     * @return this element
     */
    public Element attr(String attributeKey, String attributeValue) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2336);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2337);super.attr(attributeKey, attributeValue);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2338);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Set a boolean attribute value on this element. Setting to <code>true</code> sets the attribute value to "" and
     * marks the attribute as boolean so no value is written out. Setting to <code>false</code> removes the attribute
     * with the same key if it exists.
     * 
     * @param attributeKey the attribute key
     * @param attributeValue the attribute value
     * 
     * @return this element
     */
    public Element attr(String attributeKey, boolean attributeValue) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2339);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2340);attributes().put(attributeKey, attributeValue);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2341);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get this element's HTML5 custom data attributes. Each attribute in the element that has a key
     * starting with "data-" is included the dataset.
     * <p>
     * E.g., the element {@code <div data-package="jsoup" data-language="Java" class="group">...} has the dataset
     * {@code package=jsoup, language=java}.
     * <p>
     * This map is a filtered view of the element's attribute map. Changes to one map (add, remove, update) are reflected
     * in the other map.
     * <p>
     * You can find elements that have data attributes using the {@code [^data-]} attribute key prefix selector.
     * @return a map of {@code key=value} custom data attributes.
     */
    public Map<String, String> dataset() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2342);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2343);return attributes().dataset();
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    @Override
    public final Element parent() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2344);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2345);return (Element) parentNode;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get this element's parent and ancestors, up to the document root.
     * @return this element's stack of parents, closest first.
     */
    public Elements parents() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2346);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2347);Elements parents = new Elements();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2348);accumulateParents(this, parents);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2349);return parents;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    private static void accumulateParents(Element el, Elements parents) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2350);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2351);Element parent = el.parent();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2352);if ((((parent != null && !parent.tagName().equals("#root"))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2353)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2354)==0&false))) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2355);parents.add(parent);
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2356);accumulateParents(parent, parents);
        }
    }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get a child element of this element, by its 0-based index number.
     * <p>
     * Note that an element can have both mixed Nodes and Elements as children. This method inspects
     * a filtered list of children that are elements, and the index is based on that filtered list.
     * </p>
     * 
     * @param index the index number of the element to retrieve
     * @return the child element, if it exists, otherwise throws an {@code IndexOutOfBoundsException}
     * @see #childNode(int)
     */
    public Element child(int index) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2357);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2358);return childElementsList().get(index);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get this element's child elements.
     * <p>
     * This is effectively a filter on {@link #childNodes()} to get Element nodes.
     * </p>
     * @return child elements. If this element has no children, returns an empty list.
     * @see #childNodes()
     */
    public Elements children() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2359);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2360);return new Elements(childElementsList());
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Maintains a shadow copy of this element's child elements. If the nodelist is changed, this cache is invalidated.
     * TODO - think about pulling this out as a helper as there are other shadow lists (like in Attributes) kept around.
     * @return a list of child elements
     */
    private List<Element> childElementsList() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2361);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2362);List<Element> children;
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2363);if (shadowChildrenRef == null || (children = shadowChildrenRef.get()) == null) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2366);final int size = childNodes.size();
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2367);children = new ArrayList<>(size);
            //noinspection ForLoopReplaceableByForEach (beacause it allocates an Iterator which is wasteful here)
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2368);for (int i = 0; (((i < size)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2369)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2370)==0&false)); i++) {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2371);final Node node = childNodes.get(i);
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2372);if ((((node instanceof Element)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2373)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2374)==0&false)))
                    {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2375);children.add((Element) node);
            }}
            }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2376);shadowChildrenRef = new WeakReference<>(children);
        }
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2377);return children;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Clears the cached shadow child elements.
     */
    @Override
    void nodelistChanged() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2378);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2379);super.nodelistChanged();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2380);shadowChildrenRef = null;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get this element's child text nodes. The list is unmodifiable but the text nodes may be manipulated.
     * <p>
     * This is effectively a filter on {@link #childNodes()} to get Text nodes.
     * @return child text nodes. If this element has no text nodes, returns an
     * empty list.
     * </p>
     * For example, with the input HTML: {@code <p>One <span>Two</span> Three <br> Four</p>} with the {@code p} element selected:
     * <ul>
     *     <li>{@code p.text()} = {@code "One Two Three Four"}</li>
     *     <li>{@code p.ownText()} = {@code "One Three Four"}</li>
     *     <li>{@code p.children()} = {@code Elements[<span>, <br>]}</li>
     *     <li>{@code p.childNodes()} = {@code List<Node>["One ", <span>, " Three ", <br>, " Four"]}</li>
     *     <li>{@code p.textNodes()} = {@code List<TextNode>["One ", " Three ", " Four"]}</li>
     * </ul>
     */
    public List<TextNode> textNodes() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2381);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2382);List<TextNode> textNodes = new ArrayList<>();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2383);for (Node node : childNodes) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2384);if ((((node instanceof TextNode)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2385)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2386)==0&false)))
                {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2387);textNodes.add((TextNode) node);
        }}
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2388);return Collections.unmodifiableList(textNodes);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get this element's child data nodes. The list is unmodifiable but the data nodes may be manipulated.
     * <p>
     * This is effectively a filter on {@link #childNodes()} to get Data nodes.
     * </p>
     * @return child data nodes. If this element has no data nodes, returns an
     * empty list.
     * @see #data()
     */
    public List<DataNode> dataNodes() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2389);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2390);List<DataNode> dataNodes = new ArrayList<>();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2391);for (Node node : childNodes) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2392);if ((((node instanceof DataNode)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2393)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2394)==0&false)))
                {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2395);dataNodes.add((DataNode) node);
        }}
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2396);return Collections.unmodifiableList(dataNodes);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Find elements that match the {@link Selector} CSS query, with this element as the starting context. Matched elements
     * may include this element, or any of its children.
     * <p>
     * This method is generally more powerful to use than the DOM-type {@code getElementBy*} methods, because
     * multiple filters can be combined, e.g.:
     * </p>
     * <ul>
     * <li>{@code el.select("a[href]")} - finds links ({@code a} tags with {@code href} attributes)
     * <li>{@code el.select("a[href*=example.com]")} - finds links pointing to example.com (loosely)
     * </ul>
     * <p>
     * See the query syntax documentation in {@link org.jsoup.select.Selector}.
     * </p>
     * 
     * @param cssQuery a {@link Selector} CSS-like query
     * @return elements that match the query (empty if none match)
     * @see org.jsoup.select.Selector
     * @throws Selector.SelectorParseException (unchecked) on an invalid CSS query.
     */
    public Elements select(String cssQuery) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2397);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2398);return Selector.select(cssQuery, this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Find the first Element that matches the {@link Selector} CSS query, with this element as the starting context.
     * <p>This is effectively the same as calling {@code element.select(query).first()}, but is more efficient as query
     * execution stops on the first hit.</p>
     * @param cssQuery cssQuery a {@link Selector} CSS-like query
     * @return the first matching element, or <b>{@code null}</b> if there is no match.
     */
    public Element selectFirst(String cssQuery) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2399);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2400);return Selector.selectFirst(cssQuery, this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Check if this element matches the given {@link Selector} CSS query.
     * @param cssQuery a {@link Selector} CSS query
     * @return if this element matches the query
     */
    public boolean is(String cssQuery) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2401);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2402);return is(QueryParser.parse(cssQuery));
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Check if this element matches the given evaluator.
     * @param evaluator an element evaluator
     * @return if this element matches
     */
    public boolean is(Evaluator evaluator) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2403);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2404);return evaluator.matches((Element)this.root(), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Add a node child node to this element.
     * 
     * @param child node to add.
     * @return this element, so that you can add more child nodes or elements.
     */
    public Element appendChild(Node child) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2405);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2406);Validate.notNull(child);

        // was - Node#addChildren(child). short-circuits an array create and a loop.
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2407);reparentChild(child);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2408);ensureChildNodes();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2409);childNodes.add(child);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2410);child.setSiblingIndex(childNodes.size() - 1);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2411);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Add this element to the supplied parent element, as its next child.
     *
     * @param parent element to which this element will be appended
     * @return this element, so that you can continue modifying the element
     */
    public Element appendTo(Element parent) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2412);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2413);Validate.notNull(parent);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2414);parent.appendChild(this);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2415);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Add a node to the start of this element's children.
     * 
     * @param child node to add.
     * @return this element, so that you can add more child nodes or elements.
     */
    public Element prependChild(Node child) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2416);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2417);Validate.notNull(child);
        
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2418);addChildren(0, child);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2419);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}


    /**
     * Inserts the given child nodes into this element at the specified index. Current nodes will be shifted to the
     * right. The inserted nodes will be moved from their current parent. To prevent moving, copy the nodes first.
     *
     * @param index 0-based index to insert children at. Specify {@code 0} to insert at the start, {@code -1} at the
     * end
     * @param children child nodes to insert
     * @return this element, for chaining.
     */
    public Element insertChildren(int index, Collection<? extends Node> children) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2420);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2421);Validate.notNull(children, "Children collection to be inserted must not be null.");
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2422);int currentSize = childNodeSize();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2423);if ((((index < 0)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2424)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2425)==0&false))) {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2426);index += currentSize +1; // roll around
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2427);Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2428);ArrayList<Node> nodes = new ArrayList<>(children);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2429);Node[] nodeArray = nodes.toArray(new Node[nodes.size()]);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2430);addChildren(index, nodeArray);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2431);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Inserts the given child nodes into this element at the specified index. Current nodes will be shifted to the
     * right. The inserted nodes will be moved from their current parent. To prevent moving, copy the nodes first.
     *
     * @param index 0-based index to insert children at. Specify {@code 0} to insert at the start, {@code -1} at the
     * end
     * @param children child nodes to insert
     * @return this element, for chaining.
     */
    public Element insertChildren(int index, Node... children) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2432);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2433);Validate.notNull(children, "Children collection to be inserted must not be null.");
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2434);int currentSize = childNodeSize();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2435);if ((((index < 0)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2436)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2437)==0&false))) {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2438);index += currentSize +1; // roll around
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2439);Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2440);addChildren(index, children);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2441);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Create a new element by tag name, and add it as the last child.
     * 
     * @param tagName the name of the tag (e.g. {@code div}).
     * @return the new element, to allow you to add content to it, e.g.:
     *  {@code parent.appendElement("h1").attr("id", "header").text("Welcome");}
     */
    public Element appendElement(String tagName) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2442);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2443);Element child = new Element(Tag.valueOf(tagName, NodeUtils.parser(this).settings()), baseUri());
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2444);appendChild(child);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2445);return child;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Create a new element by tag name, and add it as the first child.
     * 
     * @param tagName the name of the tag (e.g. {@code div}).
     * @return the new element, to allow you to add content to it, e.g.:
     *  {@code parent.prependElement("h1").attr("id", "header").text("Welcome");}
     */
    public Element prependElement(String tagName) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2446);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2447);Element child = new Element(Tag.valueOf(tagName, NodeUtils.parser(this).settings()), baseUri());
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2448);prependChild(child);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2449);return child;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Create and append a new TextNode to this element.
     * 
     * @param text the unencoded text to add
     * @return this element
     */
    public Element appendText(String text) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2450);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2451);Validate.notNull(text);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2452);TextNode node = new TextNode(text);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2453);appendChild(node);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2454);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Create and prepend a new TextNode to this element.
     * 
     * @param text the unencoded text to add
     * @return this element
     */
    public Element prependText(String text) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2455);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2456);Validate.notNull(text);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2457);TextNode node = new TextNode(text);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2458);prependChild(node);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2459);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Add inner HTML to this element. The supplied HTML will be parsed, and each node appended to the end of the children.
     * @param html HTML to add inside this element, after the existing HTML
     * @return this element
     * @see #html(String)
     */
    public Element append(String html) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2460);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2461);Validate.notNull(html);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2462);List<Node> nodes = NodeUtils.parser(this).parseFragmentInput(html, this, baseUri());
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2463);addChildren(nodes.toArray(new Node[nodes.size()]));
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2464);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Add inner HTML into this element. The supplied HTML will be parsed, and each node prepended to the start of the element's children.
     * @param html HTML to add inside this element, before the existing HTML
     * @return this element
     * @see #html(String)
     */
    public Element prepend(String html) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2465);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2466);Validate.notNull(html);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2467);List<Node> nodes = NodeUtils.parser(this).parseFragmentInput(html, this, baseUri());
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2468);addChildren(0, nodes.toArray(new Node[nodes.size()]));
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2469);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Insert the specified HTML into the DOM before this element (as a preceding sibling).
     *
     * @param html HTML to add before this element
     * @return this element, for chaining
     * @see #after(String)
     */
    @Override
    public Element before(String html) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2470);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2471);return (Element) super.before(html);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Insert the specified node into the DOM before this node (as a preceding sibling).
     * @param node to add before this element
     * @return this Element, for chaining
     * @see #after(Node)
     */
    @Override
    public Element before(Node node) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2472);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2473);return (Element) super.before(node);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Insert the specified HTML into the DOM after this element (as a following sibling).
     *
     * @param html HTML to add after this element
     * @return this element, for chaining
     * @see #before(String)
     */
    @Override
    public Element after(String html) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2474);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2475);return (Element) super.after(html);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Insert the specified node into the DOM after this node (as a following sibling).
     * @param node to add after this element
     * @return this element, for chaining
     * @see #before(Node)
     */
    @Override
    public Element after(Node node) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2476);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2477);return (Element) super.after(node);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Remove all of the element's child nodes. Any attributes are left as-is.
     * @return this element
     */
    public Element empty() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2478);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2479);childNodes.clear();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2480);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Wrap the supplied HTML around this element.
     *
     * @param html HTML to wrap around this element, e.g. {@code <div class="head"></div>}. Can be arbitrarily deep.
     * @return this element, for chaining.
     */
    @Override
    public Element wrap(String html) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2481);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2482);return (Element) super.wrap(html);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get a CSS selector that will uniquely select this element.
     * <p>
     * If the element has an ID, returns #id;
     * otherwise returns the parent (if any) CSS selector, followed by {@literal '>'},
     * followed by a unique selector for the element (tag.class.class:nth-child(n)).
     * </p>
     *
     * @return the CSS Path that can be used to retrieve the element in a selector.
     */
    public String cssSelector() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2483);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2484);if ((((id().length() > 0)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2485)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2486)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2487);return "#" + id();

        // Translate HTML namespace ns:tag to CSS namespace syntax ns|tag
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2488);String tagName = tagName().replace(':', '|');
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2489);StringBuilder selector = new StringBuilder(tagName);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2490);String classes = StringUtil.join(classNames(), ".");
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2491);if ((((classes.length() > 0)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2492)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2493)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2494);selector.append('.').append(classes);

        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2495);if ((((parent() == null || parent() instanceof Document)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2496)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2497)==0&false))) // don't add Document to selector, as will always have a html node
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2498);return selector.toString();

        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2499);selector.insert(0, " > ");
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2500);if ((((parent().select(selector.toString()).size() > 1)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2501)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2502)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2503);selector.append(String.format(
                ":nth-child(%d)", elementSiblingIndex() + 1));

        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2504);return parent().cssSelector() + selector.toString();
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get sibling elements. If the element has no sibling elements, returns an empty list. An element is not a sibling
     * of itself, so will not be included in the returned list.
     * @return sibling elements
     */
    public Elements siblingElements() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2505);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2506);if ((((parentNode == null)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2507)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2508)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2509);return new Elements(0);

        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2510);List<Element> elements = parent().childElementsList();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2511);Elements siblings = new Elements(elements.size() - 1);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2512);for (Element el: elements)
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2513);if ((((el != this)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2514)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2515)==0&false)))
                {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2516);siblings.add(el);
        }}__CLR4_2_11rn1rnjp2rxa0f.R.inc(2517);return siblings;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Gets the next sibling element of this element. E.g., if a {@code div} contains two {@code p}s, 
     * the {@code nextElementSibling} of the first {@code p} is the second {@code p}.
     * <p>
     * This is similar to {@link #nextSibling()}, but specifically finds only Elements
     * </p>
     * @return the next element, or null if there is no next element
     * @see #previousElementSibling()
     */
    public Element nextElementSibling() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2518);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2519);if ((((parentNode == null)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2520)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2521)==0&false))) {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2522);return null;
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2523);List<Element> siblings = parent().childElementsList();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2524);Integer index = indexInList(this, siblings);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2525);Validate.notNull(index);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2526);if ((((siblings.size() > index+1)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2527)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2528)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2529);return siblings.get(index+1);
        }else
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2530);return null;
    }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get each of the sibling elements that come after this element.
     *
     * @return each of the element siblings after this element, or an empty list if there are no next sibling elements
     */
    public Elements nextElementSiblings() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2531);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2532);return nextElementSiblings(true);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Gets the previous element sibling of this element.
     * @return the previous element, or null if there is no previous element
     * @see #nextElementSibling()
     */
    public Element previousElementSibling() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2533);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2534);if ((((parentNode == null)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2535)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2536)==0&false))) {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2537);return null;
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2538);List<Element> siblings = parent().childElementsList();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2539);Integer index = indexInList(this, siblings);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2540);Validate.notNull(index);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2541);if ((((index > 0)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2542)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2543)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2544);return siblings.get(index-1);
        }else
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2545);return null;
    }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get each of the element siblings before this element.
     *
     * @return the previous element siblings, or an empty list if there are none.
     */
    public Elements previousElementSiblings() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2546);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2547);return nextElementSiblings(false);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    private Elements nextElementSiblings(boolean next) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2548);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2549);Elements els = new Elements();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2550);if ((((parentNode == null)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2551)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2552)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2553);return  els;
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2554);els.add(this);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2555);return (((next )&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2556)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2557)==0&false))?  els.nextAll() : els.prevAll();
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Gets the first element sibling of this element.
     * @return the first sibling that is an element (aka the parent's first element child) 
     */
    public Element firstElementSibling() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2558);
        // todo: should firstSibling() exclude this?
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2559);List<Element> siblings = parent().childElementsList();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2560);return (((siblings.size() > 1 )&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2561)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2562)==0&false))? siblings.get(0) : null;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Get the list index of this element in its element sibling list. I.e. if this is the first element
     * sibling, returns 0.
     * @return position in element sibling list
     */
    public int elementSiblingIndex() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2563);
       __CLR4_2_11rn1rnjp2rxa0f.R.inc(2564);if ((((parent() == null)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2565)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2566)==0&false))) {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2567);return 0;
       }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2568);return indexInList(this, parent().childElementsList());
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Gets the last element sibling of this element
     * @return the last sibling that is an element (aka the parent's last element child) 
     */
    public Element lastElementSibling() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2569);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2570);List<Element> siblings = parent().childElementsList();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2571);return (((siblings.size() > 1 )&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2572)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2573)==0&false))? siblings.get(siblings.size() - 1) : null;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    private static <E extends Element> int indexInList(Element search, List<E> elements) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2574);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2575);final int size = elements.size();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2576);for (int i = 0; (((i < size)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2577)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2578)==0&false)); i++) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2579);if ((((elements.get(i) == search)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2580)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2581)==0&false)))
                {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2582);return i;
        }}
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2583);return 0;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    // DOM type methods

    /**
     * Finds elements, including and recursively under this element, with the specified tag name.
     * @param tagName The tag name to search for (case insensitively).
     * @return a matching unmodifiable list of elements. Will be empty if this element and none of its children match.
     */
    public Elements getElementsByTag(String tagName) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2584);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2585);Validate.notEmpty(tagName);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2586);tagName = normalize(tagName);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2587);return Collector.collect(new Evaluator.Tag(tagName), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Find an element by ID, including or under this element.
     * <p>
     * Note that this finds the first matching ID, starting with this element. If you search down from a different
     * starting point, it is possible to find a different element by ID. For unique element by ID within a Document,
     * use {@link Document#getElementById(String)}
     * @param id The ID to search for.
     * @return The first matching element by ID, starting with this element, or null if none found.
     */
    public Element getElementById(String id) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2588);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2589);Validate.notEmpty(id);
        
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2590);Elements elements = Collector.collect(new Evaluator.Id(id), this);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2591);if ((((elements.size() > 0)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2592)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2593)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2594);return elements.get(0);
        }else
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2595);return null;
    }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Find elements that have this class, including or under this element. Case insensitive.
     * <p>
     * Elements can have multiple classes (e.g. {@code <div class="header round first">}. This method
     * checks each class, so you can find the above with {@code el.getElementsByClass("header");}.
     * 
     * @param className the name of the class to search for.
     * @return elements with the supplied class name, empty if none
     * @see #hasClass(String)
     * @see #classNames()
     */
    public Elements getElementsByClass(String className) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2596);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2597);Validate.notEmpty(className);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2598);return Collector.collect(new Evaluator.Class(className), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Find elements that have a named attribute set. Case insensitive.
     *
     * @param key name of the attribute, e.g. {@code href}
     * @return elements that have this attribute, empty if none
     */
    public Elements getElementsByAttribute(String key) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2599);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2600);Validate.notEmpty(key);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2601);key = key.trim();

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2602);return Collector.collect(new Evaluator.Attribute(key), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Find elements that have an attribute name starting with the supplied prefix. Use {@code data-} to find elements
     * that have HTML5 datasets.
     * @param keyPrefix name prefix of the attribute e.g. {@code data-}
     * @return elements that have attribute names that start with with the prefix, empty if none.
     */
    public Elements getElementsByAttributeStarting(String keyPrefix) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2603);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2604);Validate.notEmpty(keyPrefix);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2605);keyPrefix = keyPrefix.trim();

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2606);return Collector.collect(new Evaluator.AttributeStarting(keyPrefix), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Find elements that have an attribute with the specific value. Case insensitive.
     * 
     * @param key name of the attribute
     * @param value value of the attribute
     * @return elements that have this attribute with this value, empty if none
     */
    public Elements getElementsByAttributeValue(String key, String value) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2607);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2608);return Collector.collect(new Evaluator.AttributeWithValue(key, value), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Find elements that either do not have this attribute, or have it with a different value. Case insensitive.
     * 
     * @param key name of the attribute
     * @param value value of the attribute
     * @return elements that do not have a matching attribute
     */
    public Elements getElementsByAttributeValueNot(String key, String value) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2609);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2610);return Collector.collect(new Evaluator.AttributeWithValueNot(key, value), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Find elements that have attributes that start with the value prefix. Case insensitive.
     * 
     * @param key name of the attribute
     * @param valuePrefix start of attribute value
     * @return elements that have attributes that start with the value prefix
     */
    public Elements getElementsByAttributeValueStarting(String key, String valuePrefix) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2611);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2612);return Collector.collect(new Evaluator.AttributeWithValueStarting(key, valuePrefix), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Find elements that have attributes that end with the value suffix. Case insensitive.
     * 
     * @param key name of the attribute
     * @param valueSuffix end of the attribute value
     * @return elements that have attributes that end with the value suffix
     */
    public Elements getElementsByAttributeValueEnding(String key, String valueSuffix) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2613);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2614);return Collector.collect(new Evaluator.AttributeWithValueEnding(key, valueSuffix), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Find elements that have attributes whose value contains the match string. Case insensitive.
     * 
     * @param key name of the attribute
     * @param match substring of value to search for
     * @return elements that have attributes containing this text
     */
    public Elements getElementsByAttributeValueContaining(String key, String match) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2615);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2616);return Collector.collect(new Evaluator.AttributeWithValueContaining(key, match), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find elements that have attributes whose values match the supplied regular expression.
     * @param key name of the attribute
     * @param pattern compiled regular expression to match against attribute values
     * @return elements that have attributes matching this regular expression
     */
    public Elements getElementsByAttributeValueMatching(String key, Pattern pattern) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2617);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2618);return Collector.collect(new Evaluator.AttributeWithValueMatching(key, pattern), this);
        
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find elements that have attributes whose values match the supplied regular expression.
     * @param key name of the attribute
     * @param regex regular expression to match against attribute values. You can use <a href="http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded">embedded flags</a> (such as (?i) and (?m) to control regex options.
     * @return elements that have attributes matching this regular expression
     */
    public Elements getElementsByAttributeValueMatching(String key, String regex) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2619);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2620);Pattern pattern;
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2621);try {
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2622);pattern = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2623);throw new IllegalArgumentException("Pattern syntax error: " + regex, e);
        }
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2624);return getElementsByAttributeValueMatching(key, pattern);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find elements whose sibling index is less than the supplied index.
     * @param index 0-based index
     * @return elements less than index
     */
    public Elements getElementsByIndexLessThan(int index) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2625);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2626);return Collector.collect(new Evaluator.IndexLessThan(index), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find elements whose sibling index is greater than the supplied index.
     * @param index 0-based index
     * @return elements greater than index
     */
    public Elements getElementsByIndexGreaterThan(int index) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2627);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2628);return Collector.collect(new Evaluator.IndexGreaterThan(index), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find elements whose sibling index is equal to the supplied index.
     * @param index 0-based index
     * @return elements equal to index
     */
    public Elements getElementsByIndexEquals(int index) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2629);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2630);return Collector.collect(new Evaluator.IndexEquals(index), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find elements that contain the specified string. The search is case insensitive. The text may appear directly
     * in the element, or in any of its descendants.
     * @param searchText to look for in the element's text
     * @return elements that contain the string, case insensitive.
     * @see Element#text()
     */
    public Elements getElementsContainingText(String searchText) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2631);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2632);return Collector.collect(new Evaluator.ContainsText(searchText), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find elements that directly contain the specified string. The search is case insensitive. The text must appear directly
     * in the element, not in any of its descendants.
     * @param searchText to look for in the element's own text
     * @return elements that contain the string, case insensitive.
     * @see Element#ownText()
     */
    public Elements getElementsContainingOwnText(String searchText) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2633);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2634);return Collector.collect(new Evaluator.ContainsOwnText(searchText), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find elements whose text matches the supplied regular expression.
     * @param pattern regular expression to match text against
     * @return elements matching the supplied regular expression.
     * @see Element#text()
     */
    public Elements getElementsMatchingText(Pattern pattern) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2635);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2636);return Collector.collect(new Evaluator.Matches(pattern), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find elements whose text matches the supplied regular expression.
     * @param regex regular expression to match text against. You can use <a href="http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded">embedded flags</a> (such as (?i) and (?m) to control regex options.
     * @return elements matching the supplied regular expression.
     * @see Element#text()
     */
    public Elements getElementsMatchingText(String regex) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2637);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2638);Pattern pattern;
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2639);try {
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2640);pattern = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2641);throw new IllegalArgumentException("Pattern syntax error: " + regex, e);
        }
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2642);return getElementsMatchingText(pattern);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find elements whose own text matches the supplied regular expression.
     * @param pattern regular expression to match text against
     * @return elements matching the supplied regular expression.
     * @see Element#ownText()
     */
    public Elements getElementsMatchingOwnText(Pattern pattern) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2643);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2644);return Collector.collect(new Evaluator.MatchesOwn(pattern), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find elements whose text matches the supplied regular expression.
     * @param regex regular expression to match text against. You can use <a href="http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded">embedded flags</a> (such as (?i) and (?m) to control regex options.
     * @return elements matching the supplied regular expression.
     * @see Element#ownText()
     */
    public Elements getElementsMatchingOwnText(String regex) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2645);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2646);Pattern pattern;
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2647);try {
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2648);pattern = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2649);throw new IllegalArgumentException("Pattern syntax error: " + regex, e);
        }
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2650);return getElementsMatchingOwnText(pattern);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Find all elements under this element (including self, and children of children).
     * 
     * @return all elements
     */
    public Elements getAllElements() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2651);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2652);return Collector.collect(new Evaluator.AllElements(), this);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Gets the combined text of this element and all its children. Whitespace is normalized and trimmed.
     * <p>
     * For example, given HTML {@code <p>Hello  <b>there</b> now! </p>}, {@code p.text()} returns {@code "Hello there now!"}
     *
     * @return unencoded, normalized text, or empty string if none.
     * @see #wholeText() if you don't want the text to be normalized.
     * @see #ownText()
     * @see #textNodes()
     */
    public String text() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2653);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2654);final StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2655);NodeTraversor.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2656);
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2657);if ((((node instanceof TextNode)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2658)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2659)==0&false))) {{
                    __CLR4_2_11rn1rnjp2rxa0f.R.inc(2660);TextNode textNode = (TextNode) node;
                    __CLR4_2_11rn1rnjp2rxa0f.R.inc(2661);appendNormalisedText(accum, textNode);
                } }else {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2662);if ((((node instanceof Element)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2663)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2664)==0&false))) {{
                    __CLR4_2_11rn1rnjp2rxa0f.R.inc(2665);Element element = (Element) node;
                    __CLR4_2_11rn1rnjp2rxa0f.R.inc(2666);if ((((accum.length() > 0 &&
                        (element.isBlock() || element.tag.getName().equals("br")) &&
                        !TextNode.lastCharIsWhitespace(accum))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2667)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2668)==0&false)))
                        {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2669);accum.append(' ');
                }}
            }}}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

            public void tail(Node node, int depth) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2670);
                // make sure there is a space between block tags and immediately following text nodes <div>One</div>Two should be "One Two".
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2671);if ((((node instanceof Element)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2672)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2673)==0&false))) {{
                    __CLR4_2_11rn1rnjp2rxa0f.R.inc(2674);Element element = (Element) node;
                    __CLR4_2_11rn1rnjp2rxa0f.R.inc(2675);if ((((element.isBlock() && (node.nextSibling() instanceof TextNode) && !TextNode.lastCharIsWhitespace(accum))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2676)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2677)==0&false)))
                        {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2678);accum.append(' ');
                }}

            }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
        }, this);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2679);return StringUtil.releaseBuilder(accum).trim();
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get the (unencoded) text of all children of this element, including any newlines and spaces present in the
     * original.
     *
     * @return unencoded, un-normalized text
     * @see #text()
     */
    public String wholeText() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2680);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2681);final StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2682);NodeTraversor.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2683);
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2684);if ((((node instanceof TextNode)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2685)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2686)==0&false))) {{
                    __CLR4_2_11rn1rnjp2rxa0f.R.inc(2687);TextNode textNode = (TextNode) node;
                    __CLR4_2_11rn1rnjp2rxa0f.R.inc(2688);accum.append(textNode.getWholeText());
                }
            }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

            public void tail(Node node, int depth) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2689);
            }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
        }, this);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2690);return StringUtil.releaseBuilder(accum);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Gets the text owned by this element only; does not get the combined text of all children.
     * <p>
     * For example, given HTML {@code <p>Hello <b>there</b> now!</p>}, {@code p.ownText()} returns {@code "Hello now!"},
     * whereas {@code p.text()} returns {@code "Hello there now!"}.
     * Note that the text within the {@code b} element is not returned, as it is not a direct child of the {@code p} element.
     *
     * @return unencoded text, or empty string if none.
     * @see #text()
     * @see #textNodes()
     */
    public String ownText() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2691);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2692);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2693);ownText(sb);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2694);return StringUtil.releaseBuilder(sb).trim();
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    private void ownText(StringBuilder accum) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2695);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2696);for (Node child : childNodes) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2697);if ((((child instanceof TextNode)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2698)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2699)==0&false))) {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2700);TextNode textNode = (TextNode) child;
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2701);appendNormalisedText(accum, textNode);
            } }else {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2702);if ((((child instanceof Element)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2703)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2704)==0&false))) {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2705);appendWhitespaceIfBr((Element) child, accum);
            }
        }}}
    }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    private static void appendNormalisedText(StringBuilder accum, TextNode textNode) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2706);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2707);String text = textNode.getWholeText();

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2708);if ((((preserveWhitespace(textNode.parentNode) || textNode instanceof CDataNode)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2709)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2710)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2711);accum.append(text);
        }else
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2712);StringUtil.appendNormalisedWhitespace(accum, text, TextNode.lastCharIsWhitespace(accum));
    }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    private static void appendWhitespaceIfBr(Element element, StringBuilder accum) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2713);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2714);if ((((element.tag.getName().equals("br") && !TextNode.lastCharIsWhitespace(accum))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2715)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2716)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2717);accum.append(" ");
    }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    static boolean preserveWhitespace(Node node) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2718);
        // looks only at this element and five levels up, to prevent recursion & needless stack searches
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2719);if ((((node instanceof Element)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2720)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2721)==0&false))) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2722);Element el = (Element) node;
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2723);int i = 0;
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2724);do {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2725);if ((((el.tag.preserveWhitespace())&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2726)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2727)==0&false)))
                    {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2728);return true;
                }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2729);el = el.parent();
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2730);i++;
            } }while ((((i < 6 && el != null)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2731)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2732)==0&false)));
        }
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2733);return false;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Set the text of this element. Any existing contents (text or elements) will be cleared
     * @param text unencoded text
     * @return this element
     */
    public Element text(String text) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2734);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2735);Validate.notNull(text);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2736);empty();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2737);TextNode textNode = new TextNode(text);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2738);appendChild(textNode);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2739);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     Test if this element has any text content (that is not just whitespace).
     @return true if element has non-blank text content.
     */
    public boolean hasText() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2740);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2741);for (Node child: childNodes) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2742);if ((((child instanceof TextNode)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2743)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2744)==0&false))) {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2745);TextNode textNode = (TextNode) child;
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2746);if ((((!textNode.isBlank())&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2747)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2748)==0&false)))
                    {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2749);return true;
            }} }else {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2750);if ((((child instanceof Element)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2751)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2752)==0&false))) {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2753);Element el = (Element) child;
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2754);if ((((el.hasText())&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2755)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2756)==0&false)))
                    {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2757);return true;
            }}
        }}}
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2758);return false;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get the combined data of this element. Data is e.g. the inside of a {@code script} tag. Note that data is NOT the
     * text of the element. Use {@link #text()} to get the text that would be visible to a user, and {@link #data()}
     * for the contents of scripts, comments, CSS styles, etc.
     *
     * @return the data, or empty string if none
     *
     * @see #dataNodes()
     */
    public String data() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2759);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2760);StringBuilder sb = StringUtil.borrowBuilder();

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2761);for (Node childNode : childNodes) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2762);if ((((childNode instanceof DataNode)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2763)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2764)==0&false))) {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2765);DataNode data = (DataNode) childNode;
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2766);sb.append(data.getWholeData());
            } }else {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2767);if ((((childNode instanceof Comment)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2768)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2769)==0&false))) {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2770);Comment comment = (Comment) childNode;
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2771);sb.append(comment.getData());
            } }else {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2772);if ((((childNode instanceof Element)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2773)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2774)==0&false))) {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2775);Element element = (Element) childNode;
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2776);String elementData = element.data();
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2777);sb.append(elementData);
            } }else {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2778);if ((((childNode instanceof CDataNode)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2779)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2780)==0&false))) {{
                // this shouldn't really happen because the html parser won't see the cdata as anything special when parsing script.
                // but incase another type gets through.
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2781);CDataNode cDataNode = (CDataNode) childNode;
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2782);sb.append(cDataNode.getWholeText());
            }
        }}}}}
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2783);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}   

    /**
     * Gets the literal value of this element's "class" attribute, which may include multiple class names, space
     * separated. (E.g. on <code>&lt;div class="header gray"&gt;</code> returns, "<code>header gray</code>")
     * @return The literal class attribute, or <b>empty string</b> if no class attribute set.
     */
    public String className() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2784);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2785);return attr("class").trim();
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Get all of the element's class names. E.g. on element {@code <div class="header gray">},
     * returns a set of two elements {@code "header", "gray"}. Note that modifications to this set are not pushed to
     * the backing {@code class} attribute; use the {@link #classNames(java.util.Set)} method to persist them.
     * @return set of classnames, empty if no class attribute
     */
    public Set<String> classNames() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2786);
    	__CLR4_2_11rn1rnjp2rxa0f.R.inc(2787);String[] names = classSplit.split(className());
    	__CLR4_2_11rn1rnjp2rxa0f.R.inc(2788);Set<String> classNames = new LinkedHashSet<>(Arrays.asList(names));
    	__CLR4_2_11rn1rnjp2rxa0f.R.inc(2789);classNames.remove(""); // if classNames() was empty, would include an empty class

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2790);return classNames;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     Set the element's {@code class} attribute to the supplied class names.
     @param classNames set of classes
     @return this element, for chaining
     */
    public Element classNames(Set<String> classNames) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2791);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2792);Validate.notNull(classNames);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2793);if ((((classNames.isEmpty())&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2794)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2795)==0&false))) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2796);attributes().remove("class");
        } }else {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2797);attributes().put("class", StringUtil.join(classNames, " "));
        }
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2798);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Tests if this element has a class. Case insensitive.
     * @param className name of class to check for
     * @return true if it does, false if not
     */
    // performance sensitive
    public boolean hasClass(String className) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2799);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2800);final String classAttr = attributes().getIgnoreCase("class");
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2801);final int len = classAttr.length();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2802);final int wantLen = className.length();

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2803);if ((((len == 0 || len < wantLen)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2804)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2805)==0&false))) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2806);return false;
        }

        // if both lengths are equal, only need compare the className with the attribute
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2807);if ((((len == wantLen)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2808)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2809)==0&false))) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2810);return className.equalsIgnoreCase(classAttr);
        }

        // otherwise, scan for whitespace and compare regions (with no string or arraylist allocations)
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2811);boolean inClass = false;
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2812);int start = 0;
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2813);for (int i = 0; (((i < len)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2814)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2815)==0&false)); i++) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2816);if ((((Character.isWhitespace(classAttr.charAt(i)))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2817)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2818)==0&false))) {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2819);if ((((inClass)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2820)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2821)==0&false))) {{
                    // white space ends a class name, compare it with the requested one, ignore case
                    __CLR4_2_11rn1rnjp2rxa0f.R.inc(2822);if ((((i - start == wantLen && classAttr.regionMatches(true, start, className, 0, wantLen))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2823)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2824)==0&false))) {{
                        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2825);return true;
                    }
                    }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2826);inClass = false;
                }
            }} }else {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2827);if ((((!inClass)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2828)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2829)==0&false))) {{
                    // we're in a class name : keep the start of the substring
                    __CLR4_2_11rn1rnjp2rxa0f.R.inc(2830);inClass = true;
                    __CLR4_2_11rn1rnjp2rxa0f.R.inc(2831);start = i;
                }
            }}
        }}

        // check the last entry
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2832);if ((((inClass && len - start == wantLen)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2833)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2834)==0&false))) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2835);return classAttr.regionMatches(true, start, className, 0, wantLen);
        }

        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2836);return false;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     Add a class name to this element's {@code class} attribute.
     @param className class name to add
     @return this element
     */
    public Element addClass(String className) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2837);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2838);Validate.notNull(className);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2839);Set<String> classes = classNames();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2840);classes.add(className);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2841);classNames(classes);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2842);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     Remove a class name from this element's {@code class} attribute.
     @param className class name to remove
     @return this element
     */
    public Element removeClass(String className) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2843);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2844);Validate.notNull(className);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2845);Set<String> classes = classNames();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2846);classes.remove(className);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2847);classNames(classes);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2848);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     Toggle a class name on this element's {@code class} attribute: if present, remove it; otherwise add it.
     @param className class name to toggle
     @return this element
     */
    public Element toggleClass(String className) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2849);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2850);Validate.notNull(className);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2851);Set<String> classes = classNames();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2852);if ((((classes.contains(className))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2853)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2854)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2855);classes.remove(className);
        }else
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2856);classes.add(className);
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2857);classNames(classes);

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2858);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Get the value of a form element (input, textarea, etc).
     * @return the value of the form element, or empty string if not set.
     */
    public String val() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2859);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2860);if ((((tagName().equals("textarea"))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2861)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2862)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2863);return text();
        }else
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2864);return attr("value");
    }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Set the value of a form element (input, textarea, etc).
     * @param value value to set
     * @return this element (for chaining)
     */
    public Element val(String value) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2865);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2866);if ((((tagName().equals("textarea"))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2867)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2868)==0&false)))
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2869);text(value);
        }else
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2870);attr("value", value);
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2871);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    void outerHtmlHead(final Appendable accum, int depth, final Document.OutputSettings out) throws IOException {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2872);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2873);if ((((out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline()))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2874)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2875)==0&false))) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2876);if ((((accum instanceof StringBuilder)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2877)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2878)==0&false))) {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2879);if ((((((StringBuilder) accum).length() > 0)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2880)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2881)==0&false)))
                    {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2882);indent(accum, depth, out);
            }} }else {{
                __CLR4_2_11rn1rnjp2rxa0f.R.inc(2883);indent(accum, depth, out);
            }
        }}
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2884);accum.append('<').append(tagName());
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2885);if ((((attributes != null)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2886)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2887)==0&false))) {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2888);attributes.html(accum, out);

        // selfclosing includes unknown tags, isEmpty defines tags that are always empty
        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2889);if ((((childNodes.isEmpty() && tag.isSelfClosing())&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2890)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2891)==0&false))) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2892);if ((((out.syntax() == Document.OutputSettings.Syntax.html && tag.isEmpty())&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2893)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2894)==0&false)))
                {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2895);accum.append('>');
            }else
                {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2896);accum.append(" />"); // <img> in html, <img /> in xml
        }}
        }else
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2897);accum.append('>');
    }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

	void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2898);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2899);if ((((!(childNodes.isEmpty() && tag.isSelfClosing()))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2900)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2901)==0&false))) {{
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2902);if ((((out.prettyPrint() && (!childNodes.isEmpty() && (
                    tag.formatAsBlock() || (out.outline() && (childNodes.size()>1 || (childNodes.size()==1 && !(childNodes.get(0) instanceof TextNode))))
            )))&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2903)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2904)==0&false)))
                {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2905);indent(accum, depth, out);
            }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2906);accum.append("</").append(tagName()).append('>');
        }
    }}finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    /**
     * Retrieves the element's inner HTML. E.g. on a {@code <div>} with one empty {@code <p>}, would return
     * {@code <p></p>}. (Whereas {@link #outerHtml()} would return {@code <div><p></p></div>}.)
     * 
     * @return String of HTML.
     * @see #outerHtml()
     */
    public String html() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2907);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2908);StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2909);html(accum);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2910);String html = StringUtil.releaseBuilder(accum);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2911);return (((NodeUtils.outputSettings(this).prettyPrint() )&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2912)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2913)==0&false))? html.trim() : html;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    @Override
    public <T extends Appendable> T html(T appendable) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2914);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2915);final int size = childNodes.size();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2916);for (int i = 0; (((i < size)&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2917)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2918)==0&false)); i++)
            {__CLR4_2_11rn1rnjp2rxa0f.R.inc(2919);childNodes.get(i).outerHtml(appendable);

        }__CLR4_2_11rn1rnjp2rxa0f.R.inc(2920);return appendable;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    
    /**
     * Set this element's inner HTML. Clears the existing HTML first.
     * @param html HTML to parse and set into this element
     * @return this element
     * @see #append(String)
     */
    public Element html(String html) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2921);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2922);empty();
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2923);append(html);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2924);return this;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    @Override
    public Element clone() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2925);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2926);return (Element) super.clone();
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    @Override
    public Element shallowClone() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2927);
        // simpler than implementing a clone version with no child copy
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2928);return new Element(tag, baseUri, attributes);
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    @Override
    protected Element doClone(Node parent) {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2929);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2930);Element clone = (Element) super.doClone(parent);
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2931);clone.attributes = (((attributes != null )&&(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2932)!=0|true))||(__CLR4_2_11rn1rnjp2rxa0f.R.iget(2933)==0&false))? attributes.clone() : null;
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2934);clone.baseUri = baseUri;
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2935);clone.childNodes = new NodeList(clone, childNodes.size());
        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2936);clone.childNodes.addAll(childNodes); // the children then get iterated and cloned in Node.clone

        __CLR4_2_11rn1rnjp2rxa0f.R.inc(2937);return clone;
    }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

    private static final class NodeList extends ChangeNotifyingArrayList<Node> {
        private final Element owner;

        NodeList(Element owner, int initialCapacity) {
            super(initialCapacity);__CLR4_2_11rn1rnjp2rxa0f.R.inc(2939);try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2938);
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2940);this.owner = owner;
        }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}

        public void onContentsChanged() {try{__CLR4_2_11rn1rnjp2rxa0f.R.inc(2941);
            __CLR4_2_11rn1rnjp2rxa0f.R.inc(2942);owner.nodelistChanged();
        }finally{__CLR4_2_11rn1rnjp2rxa0f.R.flushNeeded();}}
    }
}
