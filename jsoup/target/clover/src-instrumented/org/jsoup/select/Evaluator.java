/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.jsoup.internal.Normalizer.normalize;


/**
 * Evaluates that an element matches the selector.
 */
public abstract class Evaluator {public static class __CLR4_2_17dz7dzjpaexqs2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,9861,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected Evaluator() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9575);
    }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    /**
     * Test if the element meets the evaluator's requirements.
     *
     * @param root    Root of the matching subtree
     * @param element tested element
     * @return Returns <tt>true</tt> if the requirements are met or
     * <tt>false</tt> otherwise
     */
    public abstract boolean matches(Element root, Element element);

    /**
     * Evaluator for tag name
     */
    public static final class Tag extends Evaluator {
        private String tagName;

        public Tag(String tagName) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9576);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9577);this.tagName = tagName;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9578);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9579);return (element.tagName().equalsIgnoreCase(tagName));
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9580);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9581);return String.format("%s", tagName);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }


    /**
     * Evaluator for tag name that ends with
     */
    public static final class TagEndsWith extends Evaluator {
        private String tagName;

        public TagEndsWith(String tagName) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9582);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9583);this.tagName = tagName;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9584);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9585);return (element.tagName().endsWith(tagName));
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9586);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9587);return String.format("%s", tagName);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    /**
     * Evaluator for element id
     */
    public static final class Id extends Evaluator {
        private String id;

        public Id(String id) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9588);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9589);this.id = id;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9590);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9591);return (id.equals(element.id()));
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9592);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9593);return String.format("#%s", id);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Evaluator for element class
     */
    public static final class Class extends Evaluator {
        private String className;

        public Class(String className) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9594);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9595);this.className = className;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9596);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9597);return (element.hasClass(className));
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9598);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9599);return String.format(".%s", className);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name matching
     */
    public static final class Attribute extends Evaluator {
        private String key;

        public Attribute(String key) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9600);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9601);this.key = key;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9602);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9603);return element.hasAttr(key);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9604);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9605);return String.format("[%s]", key);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name prefix matching
     */
    public static final class AttributeStarting extends Evaluator {
        private String keyPrefix;

        public AttributeStarting(String keyPrefix) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9606);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9607);Validate.notEmpty(keyPrefix);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9608);this.keyPrefix = lowerCase(keyPrefix);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9609);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9610);List<org.jsoup.nodes.Attribute> values = element.attributes().asList();
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9611);for (org.jsoup.nodes.Attribute attribute : values) {{
                __CLR4_2_17dz7dzjpaexqs2.R.inc(9612);if ((((lowerCase(attribute.getKey()).startsWith(keyPrefix))&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9613)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9614)==0&false)))
                    {__CLR4_2_17dz7dzjpaexqs2.R.inc(9615);return true;
            }}
            }__CLR4_2_17dz7dzjpaexqs2.R.inc(9616);return false;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9617);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9618);return String.format("[^%s]", keyPrefix);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching
     */
    public static final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String key, String value) {
            super(key, value);__CLR4_2_17dz7dzjpaexqs2.R.inc(9620);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9619);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9621);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9622);return element.hasAttr(key) && value.equalsIgnoreCase(element.attr(key).trim());
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9623);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9624);return String.format("[%s=%s]", key, value);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name != value matching
     */
    public static final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String key, String value) {
            super(key, value);__CLR4_2_17dz7dzjpaexqs2.R.inc(9626);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9625);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9627);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9628);return !value.equalsIgnoreCase(element.attr(key));
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9629);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9630);return String.format("[%s!=%s]", key, value);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value prefix)
     */
    public static final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String key, String value) {
            super(key, value);__CLR4_2_17dz7dzjpaexqs2.R.inc(9632);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9631);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9633);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9634);return element.hasAttr(key) && lowerCase(element.attr(key)).startsWith(value); // value is lower case already
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9635);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9636);return String.format("[%s^=%s]", key, value);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value ending)
     */
    public static final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String key, String value) {
            super(key, value);__CLR4_2_17dz7dzjpaexqs2.R.inc(9638);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9637);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9639);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9640);return element.hasAttr(key) && lowerCase(element.attr(key)).endsWith(value); // value is lower case
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9641);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9642);return String.format("[%s$=%s]", key, value);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value containing)
     */
    public static final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String key, String value) {
            super(key, value);__CLR4_2_17dz7dzjpaexqs2.R.inc(9644);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9643);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9645);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9646);return element.hasAttr(key) && lowerCase(element.attr(key)).contains(value); // value is lower case
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9647);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9648);return String.format("[%s*=%s]", key, value);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value regex matching)
     */
    public static final class AttributeWithValueMatching extends Evaluator {
        String key;
        Pattern pattern;

        public AttributeWithValueMatching(String key, Pattern pattern) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9649);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9650);this.key = normalize(key);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9651);this.pattern = pattern;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9652);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9653);return element.hasAttr(key) && pattern.matcher(element.attr(key)).find();
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9654);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9655);return String.format("[%s~=%s]", key, pattern.toString());
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Abstract evaluator for attribute name/value matching
     */
    public abstract static class AttributeKeyPair extends Evaluator {
        String key;
        String value;

        public AttributeKeyPair(String key, String value) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9656);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9657);Validate.notEmpty(key);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9658);Validate.notEmpty(value);

            __CLR4_2_17dz7dzjpaexqs2.R.inc(9659);this.key = normalize(key);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9660);if ((((value.startsWith("\"") && value.endsWith("\"")
                    || value.startsWith("'") && value.endsWith("'"))&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9661)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9662)==0&false))) {{
                __CLR4_2_17dz7dzjpaexqs2.R.inc(9663);value = value.substring(1, value.length()-1);
            }
            }__CLR4_2_17dz7dzjpaexqs2.R.inc(9664);this.value = normalize(value);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    /**
     * Evaluator for any / all element matching
     */
    public static final class AllElements extends Evaluator {

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9665);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9666);return true;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9667);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9668);return "*";
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching by sibling index number (e {@literal <} idx)
     */
    public static final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int index) {
            super(index);__CLR4_2_17dz7dzjpaexqs2.R.inc(9670);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9669);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9671);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9672);return root != element && element.elementSiblingIndex() < index;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9673);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9674);return String.format(":lt(%d)", index);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Evaluator for matching by sibling index number (e {@literal >} idx)
     */
    public static final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int index) {
            super(index);__CLR4_2_17dz7dzjpaexqs2.R.inc(9676);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9675);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9677);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9678);return element.elementSiblingIndex() > index;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9679);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9680);return String.format(":gt(%d)", index);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }

    /**
     * Evaluator for matching by sibling index number (e = idx)
     */
    public static final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int index) {
            super(index);__CLR4_2_17dz7dzjpaexqs2.R.inc(9682);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9681);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9683);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9684);return element.elementSiblingIndex() == index;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9685);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9686);return String.format(":eq(%d)", index);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

    }
    
    /**
     * Evaluator for matching the last sibling (css :last-child)
     */
    public static final class IsLastChild extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9687);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9688);final Element p = element.parent();
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9689);return p != null && !(p instanceof Document) && element.elementSiblingIndex() == p.children().size()-1;
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    	
		@Override
		public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9690);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9691);return ":last-child";
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }
    
    public static final class IsFirstOfType extends IsNthOfType {
		public IsFirstOfType() {
			super(0,1);__CLR4_2_17dz7dzjpaexqs2.R.inc(9693);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9692);
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
		@Override
		public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9694);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9695);return ":first-of-type";
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }
    
    public static final class IsLastOfType extends IsNthLastOfType {
		public IsLastOfType() {
			super(0,1);__CLR4_2_17dz7dzjpaexqs2.R.inc(9697);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9696);
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
		@Override
		public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9698);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9699);return ":last-of-type";
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    
    public static abstract class CssNthEvaluator extends Evaluator {
    	protected final int a, b;
    	
    	public CssNthEvaluator(int a, int b) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9700);
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9701);this.a = a;
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9702);this.b = b;
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    	public CssNthEvaluator(int b) {
    		this(0,b);__CLR4_2_17dz7dzjpaexqs2.R.inc(9704);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9703);
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    	
    	@Override
    	public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9705);
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9706);final Element p = element.parent();
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9707);if ((((p == null || (p instanceof Document))&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9708)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9709)==0&false))) {__CLR4_2_17dz7dzjpaexqs2.R.inc(9710);return false;
    		
    		}__CLR4_2_17dz7dzjpaexqs2.R.inc(9711);final int pos = calculatePosition(root, element);
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9712);if ((((a == 0)&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9713)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9714)==0&false))) {__CLR4_2_17dz7dzjpaexqs2.R.inc(9715);return pos == b;
    		
    		}__CLR4_2_17dz7dzjpaexqs2.R.inc(9716);return (pos-b)*a >= 0 && (pos-b)%a==0;
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    	
		@Override
		public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9717);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9718);if ((((a == 0)&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9719)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9720)==0&false)))
				{__CLR4_2_17dz7dzjpaexqs2.R.inc(9721);return String.format(":%s(%d)",getPseudoClass(), b);
			}__CLR4_2_17dz7dzjpaexqs2.R.inc(9722);if ((((b == 0)&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9723)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9724)==0&false)))
				{__CLR4_2_17dz7dzjpaexqs2.R.inc(9725);return String.format(":%s(%dn)",getPseudoClass(), a);
			}__CLR4_2_17dz7dzjpaexqs2.R.inc(9726);return String.format(":%s(%dn%+d)", getPseudoClass(),a, b);
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    	
		protected abstract String getPseudoClass();
		protected abstract int calculatePosition(Element root, Element element);
    }
    
    
    /**
     * css-compatible Evaluator for :eq (css :nth-child)
     * 
     * @see IndexEquals
     */
    public static final class IsNthChild extends CssNthEvaluator {

    	public IsNthChild(int a, int b) {
    		super(a,b);__CLR4_2_17dz7dzjpaexqs2.R.inc(9728);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9727);
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

		protected int calculatePosition(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9729);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9730);return element.elementSiblingIndex()+1;
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

		
		protected String getPseudoClass() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9731);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9732);return "nth-child";
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }
    
    /**
     * css pseudo class :nth-last-child)
     * 
     * @see IndexEquals
     */
    public static final class IsNthLastChild extends CssNthEvaluator {
    	public IsNthLastChild(int a, int b) {
    		super(a,b);__CLR4_2_17dz7dzjpaexqs2.R.inc(9734);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9733);
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        protected int calculatePosition(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9735);
        	__CLR4_2_17dz7dzjpaexqs2.R.inc(9736);return element.parent().children().size() - element.elementSiblingIndex();
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
        
		@Override
		protected String getPseudoClass() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9737);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9738);return "nth-last-child";
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }
    
    /**
     * css pseudo class nth-of-type
     * 
     */
    public static class IsNthOfType extends CssNthEvaluator {
    	public IsNthOfType(int a, int b) {
    		super(a,b);__CLR4_2_17dz7dzjpaexqs2.R.inc(9740);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9739);
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

		protected int calculatePosition(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9741);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9742);int pos = 0;
        	__CLR4_2_17dz7dzjpaexqs2.R.inc(9743);Elements family = element.parent().children();
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9744);for (Element el : family) {{
                __CLR4_2_17dz7dzjpaexqs2.R.inc(9745);if ((((el.tag().equals(element.tag()))&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9746)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9747)==0&false))) {__CLR4_2_17dz7dzjpaexqs2.R.inc(9748);pos++;
                }__CLR4_2_17dz7dzjpaexqs2.R.inc(9749);if ((((el == element)&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9750)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9751)==0&false))) {__CLR4_2_17dz7dzjpaexqs2.R.inc(9752);break;
            }}
			}__CLR4_2_17dz7dzjpaexqs2.R.inc(9753);return pos;
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

		@Override
		protected String getPseudoClass() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9754);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9755);return "nth-of-type";
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }
    
    public static class IsNthLastOfType extends CssNthEvaluator {

		public IsNthLastOfType(int a, int b) {
			super(a, b);__CLR4_2_17dz7dzjpaexqs2.R.inc(9757);try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9756);
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
		
		@Override
		protected int calculatePosition(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9758);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9759);int pos = 0;
        	__CLR4_2_17dz7dzjpaexqs2.R.inc(9760);Elements family = element.parent().children();
        	__CLR4_2_17dz7dzjpaexqs2.R.inc(9761);for (int i = element.elementSiblingIndex(); (((i < family.size())&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9762)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9763)==0&false)); i++) {{
        		__CLR4_2_17dz7dzjpaexqs2.R.inc(9764);if ((((family.get(i).tag().equals(element.tag()))&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9765)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9766)==0&false))) {__CLR4_2_17dz7dzjpaexqs2.R.inc(9767);pos++;
        	}}
			}__CLR4_2_17dz7dzjpaexqs2.R.inc(9768);return pos;
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

		@Override
		protected String getPseudoClass() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9769);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9770);return "nth-last-of-type";
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching the first sibling (css :first-child)
     */
    public static final class IsFirstChild extends Evaluator {
    	@Override
    	public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9771);
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9772);final Element p = element.parent();
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9773);return p != null && !(p instanceof Document) && element.elementSiblingIndex() == 0;
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    	
    	@Override
    	public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9774);
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9775);return ":first-child";
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }
    
    /**
     * css3 pseudo-class :root
     * @see <a href="http://www.w3.org/TR/selectors/#root-pseudo">:root selector</a>
     *
     */
    public static final class IsRoot extends Evaluator {
    	@Override
    	public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9776);
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9777);final Element r = (((root instanceof Document)&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9778)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9779)==0&false))?root.child(0):root;
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9780);return element == r;
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9781);
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9782);return ":root";
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    public static final class IsOnlyChild extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9783);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9784);final Element p = element.parent();
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9785);return p!=null && !(p instanceof Document) && element.siblingElements().size() == 0;
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9786);
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9787);return ":only-child";
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    public static final class IsOnlyOfType extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9788);
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9789);final Element p = element.parent();
			__CLR4_2_17dz7dzjpaexqs2.R.inc(9790);if ((((p==null || p instanceof Document)&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9791)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9792)==0&false))) {__CLR4_2_17dz7dzjpaexqs2.R.inc(9793);return false;
			
			}__CLR4_2_17dz7dzjpaexqs2.R.inc(9794);int pos = 0;
        	__CLR4_2_17dz7dzjpaexqs2.R.inc(9795);Elements family = p.children();
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9796);for (Element el : family) {{
                __CLR4_2_17dz7dzjpaexqs2.R.inc(9797);if ((((el.tag().equals(element.tag()))&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9798)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9799)==0&false))) {__CLR4_2_17dz7dzjpaexqs2.R.inc(9800);pos++;
            }}
        	}__CLR4_2_17dz7dzjpaexqs2.R.inc(9801);return pos == 1;
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9802);
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9803);return ":only-of-type";
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    public static final class IsEmpty extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9804);
        	__CLR4_2_17dz7dzjpaexqs2.R.inc(9805);List<Node> family = element.childNodes();
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9806);for (Node n : family) {{
                __CLR4_2_17dz7dzjpaexqs2.R.inc(9807);if ((((!(n instanceof Comment || n instanceof XmlDeclaration || n instanceof DocumentType))&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9808)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9809)==0&false))) {__CLR4_2_17dz7dzjpaexqs2.R.inc(9810);return false;
            }}
        	}__CLR4_2_17dz7dzjpaexqs2.R.inc(9811);return true;
		}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9812);
    		__CLR4_2_17dz7dzjpaexqs2.R.inc(9813);return ":empty";
    	}finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    /**
     * Abstract evaluator for sibling index matching
     *
     * @author ant
     */
    public abstract static class IndexEvaluator extends Evaluator {
        int index;

        public IndexEvaluator(int index) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9814);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9815);this.index = index;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element (and its descendants) text
     */
    public static final class ContainsText extends Evaluator {
        private String searchText;

        public ContainsText(String searchText) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9816);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9817);this.searchText = lowerCase(searchText);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9818);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9819);return lowerCase(element.text()).contains(searchText);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9820);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9821);return String.format(":contains(%s)", searchText);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element (and its descendants) data
     */
    public static final class ContainsData extends Evaluator {
        private String searchText;

        public ContainsData(String searchText) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9822);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9823);this.searchText = lowerCase(searchText);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9824);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9825);return lowerCase(element.data()).contains(searchText);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9826);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9827);return String.format(":containsData(%s)", searchText);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element's own text
     */
    public static final class ContainsOwnText extends Evaluator {
        private String searchText;

        public ContainsOwnText(String searchText) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9828);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9829);this.searchText = lowerCase(searchText);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9830);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9831);return lowerCase(element.ownText()).contains(searchText);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9832);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9833);return String.format(":containsOwn(%s)", searchText);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element (and its descendants) text with regex
     */
    public static final class Matches extends Evaluator {
        private Pattern pattern;

        public Matches(Pattern pattern) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9834);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9835);this.pattern = pattern;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9836);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9837);Matcher m = pattern.matcher(element.text());
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9838);return m.find();
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9839);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9840);return String.format(":matches(%s)", pattern);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element's own text with regex
     */
    public static final class MatchesOwn extends Evaluator {
        private Pattern pattern;

        public MatchesOwn(Pattern pattern) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9841);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9842);this.pattern = pattern;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9843);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9844);Matcher m = pattern.matcher(element.ownText());
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9845);return m.find();
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9846);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9847);return String.format(":matchesOwn(%s)", pattern);
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }

    public static final class MatchText extends Evaluator {

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9848);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9849);if ((((element instanceof PseudoTextElement)&&(__CLR4_2_17dz7dzjpaexqs2.R.iget(9850)!=0|true))||(__CLR4_2_17dz7dzjpaexqs2.R.iget(9851)==0&false)))
                {__CLR4_2_17dz7dzjpaexqs2.R.inc(9852);return true;

            }__CLR4_2_17dz7dzjpaexqs2.R.inc(9853);List<TextNode> textNodes = element.textNodes();
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9854);for (TextNode textNode : textNodes) {{
                __CLR4_2_17dz7dzjpaexqs2.R.inc(9855);PseudoTextElement pel = new PseudoTextElement(
                    org.jsoup.parser.Tag.valueOf(element.tagName()), element.baseUri(), element.attributes());
                __CLR4_2_17dz7dzjpaexqs2.R.inc(9856);textNode.replaceWith(pel);
                __CLR4_2_17dz7dzjpaexqs2.R.inc(9857);pel.appendChild(textNode);
            }
            }__CLR4_2_17dz7dzjpaexqs2.R.inc(9858);return false;
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_17dz7dzjpaexqs2.R.inc(9859);
            __CLR4_2_17dz7dzjpaexqs2.R.inc(9860);return ":matchText";
        }finally{__CLR4_2_17dz7dzjpaexqs2.R.flushNeeded();}}
    }
}
