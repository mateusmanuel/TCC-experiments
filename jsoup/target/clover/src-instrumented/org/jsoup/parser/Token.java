/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;

import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * Parse tokens for the Tokeniser.
 */
abstract class Token {public static class __CLR4_2_1544544jp2rxa7j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543506510356L,8589935092L,6833,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    TokenType type;

    private Token() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6628);
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}
    
    String tokenType() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6629);
        __CLR4_2_1544544jp2rxa7j.R.inc(6630);return this.getClass().getSimpleName();
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    /**
     * Reset the data represent by this token, for reuse. Prevents the need to create transfer objects for every
     * piece of data, which immediately get GCed.
     */
    abstract Token reset();

    static void reset(StringBuilder sb) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6631);
        __CLR4_2_1544544jp2rxa7j.R.inc(6632);if ((((sb != null)&&(__CLR4_2_1544544jp2rxa7j.R.iget(6633)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6634)==0&false))) {{
            __CLR4_2_1544544jp2rxa7j.R.inc(6635);sb.delete(0, sb.length());
        }
    }}finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    static final class Doctype extends Token {
        final StringBuilder name = new StringBuilder();
        String pubSysKey = null;
        final StringBuilder publicIdentifier = new StringBuilder();
        final StringBuilder systemIdentifier = new StringBuilder();
        boolean forceQuirks = false;

        Doctype() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6636);
            __CLR4_2_1544544jp2rxa7j.R.inc(6637);type = TokenType.Doctype;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        @Override
        Token reset() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6638);
            __CLR4_2_1544544jp2rxa7j.R.inc(6639);reset(name);
            __CLR4_2_1544544jp2rxa7j.R.inc(6640);pubSysKey = null;
            __CLR4_2_1544544jp2rxa7j.R.inc(6641);reset(publicIdentifier);
            __CLR4_2_1544544jp2rxa7j.R.inc(6642);reset(systemIdentifier);
            __CLR4_2_1544544jp2rxa7j.R.inc(6643);forceQuirks = false;
            __CLR4_2_1544544jp2rxa7j.R.inc(6644);return this;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        String getName() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6645);
            __CLR4_2_1544544jp2rxa7j.R.inc(6646);return name.toString();
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        String getPubSysKey() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6647);
            __CLR4_2_1544544jp2rxa7j.R.inc(6648);return pubSysKey;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        String getPublicIdentifier() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6649);
            __CLR4_2_1544544jp2rxa7j.R.inc(6650);return publicIdentifier.toString();
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        public String getSystemIdentifier() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6651);
            __CLR4_2_1544544jp2rxa7j.R.inc(6652);return systemIdentifier.toString();
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        public boolean isForceQuirks() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6653);
            __CLR4_2_1544544jp2rxa7j.R.inc(6654);return forceQuirks;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}
    }

    static abstract class Tag extends Token {
        protected String tagName;
        protected String normalName; // lc version of tag name, for case insensitive tree build
        private String pendingAttributeName; // attribute names are generally caught in one hop, not accumulated
        private StringBuilder pendingAttributeValue = new StringBuilder(); // but values are accumulated, from e.g. & in hrefs
        private String pendingAttributeValueS; // try to get attr vals in one shot, vs Builder
        private boolean hasEmptyAttributeValue = false; // distinguish boolean attribute from empty string value
        private boolean hasPendingAttributeValue = false;
        boolean selfClosing = false;
        Attributes attributes; // start tags get attributes on construction. End tags get attributes on first new attribute (but only for parser convenience, not used).

        @Override
        Tag reset() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6655);
            __CLR4_2_1544544jp2rxa7j.R.inc(6656);tagName = null;
            __CLR4_2_1544544jp2rxa7j.R.inc(6657);normalName = null;
            __CLR4_2_1544544jp2rxa7j.R.inc(6658);pendingAttributeName = null;
            __CLR4_2_1544544jp2rxa7j.R.inc(6659);reset(pendingAttributeValue);
            __CLR4_2_1544544jp2rxa7j.R.inc(6660);pendingAttributeValueS = null;
            __CLR4_2_1544544jp2rxa7j.R.inc(6661);hasEmptyAttributeValue = false;
            __CLR4_2_1544544jp2rxa7j.R.inc(6662);hasPendingAttributeValue = false;
            __CLR4_2_1544544jp2rxa7j.R.inc(6663);selfClosing = false;
            __CLR4_2_1544544jp2rxa7j.R.inc(6664);attributes = null;
            __CLR4_2_1544544jp2rxa7j.R.inc(6665);return this;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final void newAttribute() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6666);
            __CLR4_2_1544544jp2rxa7j.R.inc(6667);if ((((attributes == null)&&(__CLR4_2_1544544jp2rxa7j.R.iget(6668)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6669)==0&false)))
                {__CLR4_2_1544544jp2rxa7j.R.inc(6670);attributes = new Attributes();

            }__CLR4_2_1544544jp2rxa7j.R.inc(6671);if ((((pendingAttributeName != null)&&(__CLR4_2_1544544jp2rxa7j.R.iget(6672)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6673)==0&false))) {{
                // the tokeniser has skipped whitespace control chars, but trimming could collapse to empty for other control codes, so verify here
                __CLR4_2_1544544jp2rxa7j.R.inc(6674);pendingAttributeName = pendingAttributeName.trim();
                __CLR4_2_1544544jp2rxa7j.R.inc(6675);if ((((pendingAttributeName.length() > 0)&&(__CLR4_2_1544544jp2rxa7j.R.iget(6676)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6677)==0&false))) {{
                    __CLR4_2_1544544jp2rxa7j.R.inc(6678);String value;
                    __CLR4_2_1544544jp2rxa7j.R.inc(6679);if ((((hasPendingAttributeValue)&&(__CLR4_2_1544544jp2rxa7j.R.iget(6680)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6681)==0&false)))
                        {__CLR4_2_1544544jp2rxa7j.R.inc(6682);value = (((pendingAttributeValue.length() > 0 )&&(__CLR4_2_1544544jp2rxa7j.R.iget(6683)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6684)==0&false))? pendingAttributeValue.toString() : pendingAttributeValueS;
                    }else {__CLR4_2_1544544jp2rxa7j.R.inc(6685);if ((((hasEmptyAttributeValue)&&(__CLR4_2_1544544jp2rxa7j.R.iget(6686)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6687)==0&false)))
                        {__CLR4_2_1544544jp2rxa7j.R.inc(6688);value = "";
                    }else
                        {__CLR4_2_1544544jp2rxa7j.R.inc(6689);value = null;
                    }}__CLR4_2_1544544jp2rxa7j.R.inc(6690);attributes.put(pendingAttributeName, value);
                }
            }}
            }__CLR4_2_1544544jp2rxa7j.R.inc(6691);pendingAttributeName = null;
            __CLR4_2_1544544jp2rxa7j.R.inc(6692);hasEmptyAttributeValue = false;
            __CLR4_2_1544544jp2rxa7j.R.inc(6693);hasPendingAttributeValue = false;
            __CLR4_2_1544544jp2rxa7j.R.inc(6694);reset(pendingAttributeValue);
            __CLR4_2_1544544jp2rxa7j.R.inc(6695);pendingAttributeValueS = null;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final void finaliseTag() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6696);
            // finalises for emit
            __CLR4_2_1544544jp2rxa7j.R.inc(6697);if ((((pendingAttributeName != null)&&(__CLR4_2_1544544jp2rxa7j.R.iget(6698)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6699)==0&false))) {{
                // todo: check if attribute name exists; if so, drop and error
                __CLR4_2_1544544jp2rxa7j.R.inc(6700);newAttribute();
            }
        }}finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final String name() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6701); // preserves case, for input into Tag.valueOf (which may drop case)
            __CLR4_2_1544544jp2rxa7j.R.inc(6702);Validate.isFalse(tagName == null || tagName.length() == 0);
            __CLR4_2_1544544jp2rxa7j.R.inc(6703);return tagName;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final String normalName() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6704); // loses case, used in tree building for working out where in tree it should go
            __CLR4_2_1544544jp2rxa7j.R.inc(6705);return normalName;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final Tag name(String name) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6706);
            __CLR4_2_1544544jp2rxa7j.R.inc(6707);tagName = name;
            __CLR4_2_1544544jp2rxa7j.R.inc(6708);normalName = lowerCase(name);
            __CLR4_2_1544544jp2rxa7j.R.inc(6709);return this;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final boolean isSelfClosing() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6710);
            __CLR4_2_1544544jp2rxa7j.R.inc(6711);return selfClosing;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        @SuppressWarnings({"TypeMayBeWeakened"})
        final Attributes getAttributes() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6712);
            __CLR4_2_1544544jp2rxa7j.R.inc(6713);return attributes;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        // these appenders are rarely hit in not null state-- caused by null chars.
        final void appendTagName(String append) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6714);
            __CLR4_2_1544544jp2rxa7j.R.inc(6715);tagName = (((tagName == null )&&(__CLR4_2_1544544jp2rxa7j.R.iget(6716)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6717)==0&false))? append : tagName.concat(append);
            __CLR4_2_1544544jp2rxa7j.R.inc(6718);normalName = lowerCase(tagName);
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final void appendTagName(char append) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6719);
            __CLR4_2_1544544jp2rxa7j.R.inc(6720);appendTagName(String.valueOf(append));
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final void appendAttributeName(String append) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6721);
            __CLR4_2_1544544jp2rxa7j.R.inc(6722);pendingAttributeName = (((pendingAttributeName == null )&&(__CLR4_2_1544544jp2rxa7j.R.iget(6723)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6724)==0&false))? append : pendingAttributeName.concat(append);
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final void appendAttributeName(char append) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6725);
            __CLR4_2_1544544jp2rxa7j.R.inc(6726);appendAttributeName(String.valueOf(append));
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final void appendAttributeValue(String append) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6727);
            __CLR4_2_1544544jp2rxa7j.R.inc(6728);ensureAttributeValue();
            __CLR4_2_1544544jp2rxa7j.R.inc(6729);if ((((pendingAttributeValue.length() == 0)&&(__CLR4_2_1544544jp2rxa7j.R.iget(6730)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6731)==0&false))) {{
                __CLR4_2_1544544jp2rxa7j.R.inc(6732);pendingAttributeValueS = append;
            } }else {{
                __CLR4_2_1544544jp2rxa7j.R.inc(6733);pendingAttributeValue.append(append);
            }
        }}finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final void appendAttributeValue(char append) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6734);
            __CLR4_2_1544544jp2rxa7j.R.inc(6735);ensureAttributeValue();
            __CLR4_2_1544544jp2rxa7j.R.inc(6736);pendingAttributeValue.append(append);
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final void appendAttributeValue(char[] append) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6737);
            __CLR4_2_1544544jp2rxa7j.R.inc(6738);ensureAttributeValue();
            __CLR4_2_1544544jp2rxa7j.R.inc(6739);pendingAttributeValue.append(append);
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        final void appendAttributeValue(int[] appendCodepoints) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6740);
            __CLR4_2_1544544jp2rxa7j.R.inc(6741);ensureAttributeValue();
            __CLR4_2_1544544jp2rxa7j.R.inc(6742);for (int codepoint : appendCodepoints) {{
                __CLR4_2_1544544jp2rxa7j.R.inc(6743);pendingAttributeValue.appendCodePoint(codepoint);
            }
        }}finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}
        
        final void setEmptyAttributeValue() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6744);
            __CLR4_2_1544544jp2rxa7j.R.inc(6745);hasEmptyAttributeValue = true;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        private void ensureAttributeValue() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6746);
            __CLR4_2_1544544jp2rxa7j.R.inc(6747);hasPendingAttributeValue = true;
            // if on second hit, we'll need to move to the builder
            __CLR4_2_1544544jp2rxa7j.R.inc(6748);if ((((pendingAttributeValueS != null)&&(__CLR4_2_1544544jp2rxa7j.R.iget(6749)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6750)==0&false))) {{
                __CLR4_2_1544544jp2rxa7j.R.inc(6751);pendingAttributeValue.append(pendingAttributeValueS);
                __CLR4_2_1544544jp2rxa7j.R.inc(6752);pendingAttributeValueS = null;
            }
        }}finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}
    }

    final static class StartTag extends Tag {
        StartTag() {
            super();__CLR4_2_1544544jp2rxa7j.R.inc(6754);try{__CLR4_2_1544544jp2rxa7j.R.inc(6753);
            __CLR4_2_1544544jp2rxa7j.R.inc(6755);attributes = new Attributes();
            __CLR4_2_1544544jp2rxa7j.R.inc(6756);type = TokenType.StartTag;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        @Override
        Tag reset() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6757);
            __CLR4_2_1544544jp2rxa7j.R.inc(6758);super.reset();
            __CLR4_2_1544544jp2rxa7j.R.inc(6759);attributes = new Attributes();
            // todo - would prefer these to be null, but need to check Element assertions
            __CLR4_2_1544544jp2rxa7j.R.inc(6760);return this;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        StartTag nameAttr(String name, Attributes attributes) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6761);
            __CLR4_2_1544544jp2rxa7j.R.inc(6762);this.tagName = name;
            __CLR4_2_1544544jp2rxa7j.R.inc(6763);this.attributes = attributes;
            __CLR4_2_1544544jp2rxa7j.R.inc(6764);normalName = lowerCase(tagName);
            __CLR4_2_1544544jp2rxa7j.R.inc(6765);return this;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6766);
            __CLR4_2_1544544jp2rxa7j.R.inc(6767);if ((((attributes != null && attributes.size() > 0)&&(__CLR4_2_1544544jp2rxa7j.R.iget(6768)!=0|true))||(__CLR4_2_1544544jp2rxa7j.R.iget(6769)==0&false)))
                {__CLR4_2_1544544jp2rxa7j.R.inc(6770);return "<" + name() + " " + attributes.toString() + ">";
            }else
                {__CLR4_2_1544544jp2rxa7j.R.inc(6771);return "<" + name() + ">";
        }}finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}
    }

    final static class EndTag extends Tag{
        EndTag() {
            super();__CLR4_2_1544544jp2rxa7j.R.inc(6773);try{__CLR4_2_1544544jp2rxa7j.R.inc(6772);
            __CLR4_2_1544544jp2rxa7j.R.inc(6774);type = TokenType.EndTag;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6775);
            __CLR4_2_1544544jp2rxa7j.R.inc(6776);return "</" + name() + ">";
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}
    }

    final static class Comment extends Token {
        final StringBuilder data = new StringBuilder();
        boolean bogus = false;

        @Override
        Token reset() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6777);
            __CLR4_2_1544544jp2rxa7j.R.inc(6778);reset(data);
            __CLR4_2_1544544jp2rxa7j.R.inc(6779);bogus = false;
            __CLR4_2_1544544jp2rxa7j.R.inc(6780);return this;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        Comment() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6781);
            __CLR4_2_1544544jp2rxa7j.R.inc(6782);type = TokenType.Comment;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        String getData() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6783);
            __CLR4_2_1544544jp2rxa7j.R.inc(6784);return data.toString();
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6785);
            __CLR4_2_1544544jp2rxa7j.R.inc(6786);return "<!--" + getData() + "-->";
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}
    }

    static class Character extends Token {
        private String data;

        Character() {
            super();__CLR4_2_1544544jp2rxa7j.R.inc(6788);try{__CLR4_2_1544544jp2rxa7j.R.inc(6787);
            __CLR4_2_1544544jp2rxa7j.R.inc(6789);type = TokenType.Character;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        @Override
        Token reset() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6790);
            __CLR4_2_1544544jp2rxa7j.R.inc(6791);data = null;
            __CLR4_2_1544544jp2rxa7j.R.inc(6792);return this;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        Character data(String data) {try{__CLR4_2_1544544jp2rxa7j.R.inc(6793);
            __CLR4_2_1544544jp2rxa7j.R.inc(6794);this.data = data;
            __CLR4_2_1544544jp2rxa7j.R.inc(6795);return this;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        String getData() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6796);
            __CLR4_2_1544544jp2rxa7j.R.inc(6797);return data;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6798);
            __CLR4_2_1544544jp2rxa7j.R.inc(6799);return getData();
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}
    }

    final static class CData extends Character {
        CData(String data) {
            super();__CLR4_2_1544544jp2rxa7j.R.inc(6801);try{__CLR4_2_1544544jp2rxa7j.R.inc(6800);
            __CLR4_2_1544544jp2rxa7j.R.inc(6802);this.data(data);
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6803);
            __CLR4_2_1544544jp2rxa7j.R.inc(6804);return "<![CDATA[" + getData() + "]]>";
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    }

    final static class EOF extends Token {
        EOF() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6805);
            __CLR4_2_1544544jp2rxa7j.R.inc(6806);type = Token.TokenType.EOF;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

        @Override
        Token reset() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6807);
            __CLR4_2_1544544jp2rxa7j.R.inc(6808);return this;
        }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}
    }

    final boolean isDoctype() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6809);
        __CLR4_2_1544544jp2rxa7j.R.inc(6810);return type == TokenType.Doctype;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    final Doctype asDoctype() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6811);
        __CLR4_2_1544544jp2rxa7j.R.inc(6812);return (Doctype) this;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    final boolean isStartTag() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6813);
        __CLR4_2_1544544jp2rxa7j.R.inc(6814);return type == TokenType.StartTag;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    final StartTag asStartTag() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6815);
        __CLR4_2_1544544jp2rxa7j.R.inc(6816);return (StartTag) this;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    final boolean isEndTag() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6817);
        __CLR4_2_1544544jp2rxa7j.R.inc(6818);return type == TokenType.EndTag;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    final EndTag asEndTag() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6819);
        __CLR4_2_1544544jp2rxa7j.R.inc(6820);return (EndTag) this;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    final boolean isComment() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6821);
        __CLR4_2_1544544jp2rxa7j.R.inc(6822);return type == TokenType.Comment;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    final Comment asComment() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6823);
        __CLR4_2_1544544jp2rxa7j.R.inc(6824);return (Comment) this;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    final boolean isCharacter() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6825);
        __CLR4_2_1544544jp2rxa7j.R.inc(6826);return type == TokenType.Character;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    final boolean isCData() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6827);
        __CLR4_2_1544544jp2rxa7j.R.inc(6828);return this instanceof CData;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    final Character asCharacter() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6829);
        __CLR4_2_1544544jp2rxa7j.R.inc(6830);return (Character) this;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    final boolean isEOF() {try{__CLR4_2_1544544jp2rxa7j.R.inc(6831);
        __CLR4_2_1544544jp2rxa7j.R.inc(6832);return type == TokenType.EOF;
    }finally{__CLR4_2_1544544jp2rxa7j.R.flushNeeded();}}

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character, // note no CData - treated in builder as an extension of Character
        EOF
    }
}
