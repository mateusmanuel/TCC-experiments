/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * A HTML Form Element provides ready access to the form fields/controls that are associated with it. It also allows a
 * form to easily be submitted.
 */
public class FormElement extends Element {public static class __CLR4_2_12fe2fejp2rxa1k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543506510356L,8589935092L,3210,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final Elements elements = new Elements();

    /**
     * Create a new, standalone form element.
     *
     * @param tag        tag of this element
     * @param baseUri    the base URI
     * @param attributes initial attributes
     */
    public FormElement(Tag tag, String baseUri, Attributes attributes) {
        super(tag, baseUri, attributes);__CLR4_2_12fe2fejp2rxa1k.R.inc(3147);try{__CLR4_2_12fe2fejp2rxa1k.R.inc(3146);
    }finally{__CLR4_2_12fe2fejp2rxa1k.R.flushNeeded();}}

    /**
     * Get the list of form control elements associated with this form.
     * @return form controls associated with this element.
     */
    public Elements elements() {try{__CLR4_2_12fe2fejp2rxa1k.R.inc(3148);
        __CLR4_2_12fe2fejp2rxa1k.R.inc(3149);return elements;
    }finally{__CLR4_2_12fe2fejp2rxa1k.R.flushNeeded();}}

    /**
     * Add a form control element to this form.
     * @param element form control to add
     * @return this form element, for chaining
     */
    public FormElement addElement(Element element) {try{__CLR4_2_12fe2fejp2rxa1k.R.inc(3150);
        __CLR4_2_12fe2fejp2rxa1k.R.inc(3151);elements.add(element);
        __CLR4_2_12fe2fejp2rxa1k.R.inc(3152);return this;
    }finally{__CLR4_2_12fe2fejp2rxa1k.R.flushNeeded();}}

    @Override
    protected void removeChild(Node out) {try{__CLR4_2_12fe2fejp2rxa1k.R.inc(3153);
        __CLR4_2_12fe2fejp2rxa1k.R.inc(3154);super.removeChild(out);
        __CLR4_2_12fe2fejp2rxa1k.R.inc(3155);elements.remove(out);
    }finally{__CLR4_2_12fe2fejp2rxa1k.R.flushNeeded();}}

    /**
     * Prepare to submit this form. A Connection object is created with the request set up from the form values. You
     * can then set up other options (like user-agent, timeout, cookies), then execute it.
     * @return a connection prepared from the values of this form.
     * @throws IllegalArgumentException if the form's absolute action URL cannot be determined. Make sure you pass the
     * document's base URI when parsing.
     */
    public Connection submit() {try{__CLR4_2_12fe2fejp2rxa1k.R.inc(3156);
        __CLR4_2_12fe2fejp2rxa1k.R.inc(3157);String action = (((hasAttr("action") )&&(__CLR4_2_12fe2fejp2rxa1k.R.iget(3158)!=0|true))||(__CLR4_2_12fe2fejp2rxa1k.R.iget(3159)==0&false))? absUrl("action") : baseUri();
        __CLR4_2_12fe2fejp2rxa1k.R.inc(3160);Validate.notEmpty(action, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        __CLR4_2_12fe2fejp2rxa1k.R.inc(3161);Connection.Method method = (((attr("method").toUpperCase().equals("POST") )&&(__CLR4_2_12fe2fejp2rxa1k.R.iget(3162)!=0|true))||(__CLR4_2_12fe2fejp2rxa1k.R.iget(3163)==0&false))?
                Connection.Method.POST : Connection.Method.GET;

        __CLR4_2_12fe2fejp2rxa1k.R.inc(3164);return Jsoup.connect(action)
                .data(formData())
                .method(method);
    }finally{__CLR4_2_12fe2fejp2rxa1k.R.flushNeeded();}}

    /**
     * Get the data that this form submits. The returned list is a copy of the data, and changes to the contents of the
     * list will not be reflected in the DOM.
     * @return a list of key vals
     */
    public List<Connection.KeyVal> formData() {try{__CLR4_2_12fe2fejp2rxa1k.R.inc(3165);
        __CLR4_2_12fe2fejp2rxa1k.R.inc(3166);ArrayList<Connection.KeyVal> data = new ArrayList<>();

        // iterate the form control elements and accumulate their values
        __CLR4_2_12fe2fejp2rxa1k.R.inc(3167);for (Element el: elements) {{
            __CLR4_2_12fe2fejp2rxa1k.R.inc(3168);if ((((!el.tag().isFormSubmittable())&&(__CLR4_2_12fe2fejp2rxa1k.R.iget(3169)!=0|true))||(__CLR4_2_12fe2fejp2rxa1k.R.iget(3170)==0&false))) {__CLR4_2_12fe2fejp2rxa1k.R.inc(3171);continue; // contents are form listable, superset of submitable
            }__CLR4_2_12fe2fejp2rxa1k.R.inc(3172);if ((((el.hasAttr("disabled"))&&(__CLR4_2_12fe2fejp2rxa1k.R.iget(3173)!=0|true))||(__CLR4_2_12fe2fejp2rxa1k.R.iget(3174)==0&false))) {__CLR4_2_12fe2fejp2rxa1k.R.inc(3175);continue; // skip disabled form inputs
            }__CLR4_2_12fe2fejp2rxa1k.R.inc(3176);String name = el.attr("name");
            __CLR4_2_12fe2fejp2rxa1k.R.inc(3177);if ((((name.length() == 0)&&(__CLR4_2_12fe2fejp2rxa1k.R.iget(3178)!=0|true))||(__CLR4_2_12fe2fejp2rxa1k.R.iget(3179)==0&false))) {__CLR4_2_12fe2fejp2rxa1k.R.inc(3180);continue;
            }__CLR4_2_12fe2fejp2rxa1k.R.inc(3181);String type = el.attr("type");

            __CLR4_2_12fe2fejp2rxa1k.R.inc(3182);if (((("select".equals(el.tagName()))&&(__CLR4_2_12fe2fejp2rxa1k.R.iget(3183)!=0|true))||(__CLR4_2_12fe2fejp2rxa1k.R.iget(3184)==0&false))) {{
                __CLR4_2_12fe2fejp2rxa1k.R.inc(3185);Elements options = el.select("option[selected]");
                __CLR4_2_12fe2fejp2rxa1k.R.inc(3186);boolean set = false;
                __CLR4_2_12fe2fejp2rxa1k.R.inc(3187);for (Element option: options) {{
                    __CLR4_2_12fe2fejp2rxa1k.R.inc(3188);data.add(HttpConnection.KeyVal.create(name, option.val()));
                    __CLR4_2_12fe2fejp2rxa1k.R.inc(3189);set = true;
                }
                }__CLR4_2_12fe2fejp2rxa1k.R.inc(3190);if ((((!set)&&(__CLR4_2_12fe2fejp2rxa1k.R.iget(3191)!=0|true))||(__CLR4_2_12fe2fejp2rxa1k.R.iget(3192)==0&false))) {{
                    __CLR4_2_12fe2fejp2rxa1k.R.inc(3193);Element option = el.select("option").first();
                    __CLR4_2_12fe2fejp2rxa1k.R.inc(3194);if ((((option != null)&&(__CLR4_2_12fe2fejp2rxa1k.R.iget(3195)!=0|true))||(__CLR4_2_12fe2fejp2rxa1k.R.iget(3196)==0&false)))
                        {__CLR4_2_12fe2fejp2rxa1k.R.inc(3197);data.add(HttpConnection.KeyVal.create(name, option.val()));
                }}
            }} }else {__CLR4_2_12fe2fejp2rxa1k.R.inc(3198);if (((("checkbox".equalsIgnoreCase(type) || "radio".equalsIgnoreCase(type))&&(__CLR4_2_12fe2fejp2rxa1k.R.iget(3199)!=0|true))||(__CLR4_2_12fe2fejp2rxa1k.R.iget(3200)==0&false))) {{
                // only add checkbox or radio if they have the checked attribute
                __CLR4_2_12fe2fejp2rxa1k.R.inc(3201);if ((((el.hasAttr("checked"))&&(__CLR4_2_12fe2fejp2rxa1k.R.iget(3202)!=0|true))||(__CLR4_2_12fe2fejp2rxa1k.R.iget(3203)==0&false))) {{
                    __CLR4_2_12fe2fejp2rxa1k.R.inc(3204);final String val = (((el.val().length() >  0 )&&(__CLR4_2_12fe2fejp2rxa1k.R.iget(3205)!=0|true))||(__CLR4_2_12fe2fejp2rxa1k.R.iget(3206)==0&false))? el.val() : "on";
                    __CLR4_2_12fe2fejp2rxa1k.R.inc(3207);data.add(HttpConnection.KeyVal.create(name, val));
                }
            }} }else {{
                __CLR4_2_12fe2fejp2rxa1k.R.inc(3208);data.add(HttpConnection.KeyVal.create(name, el.val()));
            }
        }}}
        }__CLR4_2_12fe2fejp2rxa1k.R.inc(3209);return data;
    }finally{__CLR4_2_12fe2fejp2rxa1k.R.flushNeeded();}}
}
