/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;

/**
 * A character queue with parsing helpers.
 *
 * @author Jonathan Hedley
 */
public class TokenQueue {public static class __CLR4_2_159t59tjpaexqmw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,7070,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String queue;
    private int pos = 0;
    
    private static final char ESC = '\\'; // escape char for chomp balanced.

    /**
     Create a new TokenQueue.
     @param data string of data to back queue.
     */
    public TokenQueue(String data) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6833);
        __CLR4_2_159t59tjpaexqmw.R.inc(6834);Validate.notNull(data);
        __CLR4_2_159t59tjpaexqmw.R.inc(6835);queue = data;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Is the queue empty?
     * @return true if no data left in queue.
     */
    public boolean isEmpty() {try{__CLR4_2_159t59tjpaexqmw.R.inc(6836);
        __CLR4_2_159t59tjpaexqmw.R.inc(6837);return remainingLength() == 0;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}
    
    private int remainingLength() {try{__CLR4_2_159t59tjpaexqmw.R.inc(6838);
        __CLR4_2_159t59tjpaexqmw.R.inc(6839);return queue.length() - pos;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Retrieves but does not remove the first character from the queue.
     * @return First character, or 0 if empty.
     */
    public char peek() {try{__CLR4_2_159t59tjpaexqmw.R.inc(6840);
        __CLR4_2_159t59tjpaexqmw.R.inc(6841);return (((isEmpty() )&&(__CLR4_2_159t59tjpaexqmw.R.iget(6842)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6843)==0&false))? 0 : queue.charAt(pos);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     Add a character to the start of the queue (will be the next character retrieved).
     @param c character to add
     */
    public void addFirst(Character c) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6844);
        __CLR4_2_159t59tjpaexqmw.R.inc(6845);addFirst(c.toString());
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     Add a string to the start of the queue.
     @param seq string to add.
     */
    public void addFirst(String seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6846);
        // not very performant, but an edge case
        __CLR4_2_159t59tjpaexqmw.R.inc(6847);queue = seq + queue.substring(pos);
        __CLR4_2_159t59tjpaexqmw.R.inc(6848);pos = 0;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Tests if the next characters on the queue match the sequence. Case insensitive.
     * @param seq String to check queue for.
     * @return true if the next characters match.
     */
    public boolean matches(String seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6849);
        __CLR4_2_159t59tjpaexqmw.R.inc(6850);return queue.regionMatches(true, pos, seq, 0, seq.length());
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Case sensitive match test.
     * @param seq string to case sensitively check for
     * @return true if matched, false if not
     */
    public boolean matchesCS(String seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6851);
        __CLR4_2_159t59tjpaexqmw.R.inc(6852);return queue.startsWith(seq, pos);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}
    

    /**
     Tests if the next characters match any of the sequences. Case insensitive.
     @param seq list of strings to case insensitively check for
     @return true of any matched, false if none did
     */
    public boolean matchesAny(String... seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6853);
        __CLR4_2_159t59tjpaexqmw.R.inc(6854);for (String s : seq) {{
            __CLR4_2_159t59tjpaexqmw.R.inc(6855);if ((((matches(s))&&(__CLR4_2_159t59tjpaexqmw.R.iget(6856)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6857)==0&false)))
                {__CLR4_2_159t59tjpaexqmw.R.inc(6858);return true;
        }}
        }__CLR4_2_159t59tjpaexqmw.R.inc(6859);return false;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    public boolean matchesAny(char... seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6860);
        __CLR4_2_159t59tjpaexqmw.R.inc(6861);if ((((isEmpty())&&(__CLR4_2_159t59tjpaexqmw.R.iget(6862)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6863)==0&false)))
            {__CLR4_2_159t59tjpaexqmw.R.inc(6864);return false;

        }__CLR4_2_159t59tjpaexqmw.R.inc(6865);for (char c: seq) {{
            __CLR4_2_159t59tjpaexqmw.R.inc(6866);if ((((queue.charAt(pos) == c)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6867)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6868)==0&false)))
                {__CLR4_2_159t59tjpaexqmw.R.inc(6869);return true;
        }}
        }__CLR4_2_159t59tjpaexqmw.R.inc(6870);return false;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    public boolean matchesStartTag() {try{__CLR4_2_159t59tjpaexqmw.R.inc(6871);
        // micro opt for matching "<x"
        __CLR4_2_159t59tjpaexqmw.R.inc(6872);return (remainingLength() >= 2 && queue.charAt(pos) == '<' && Character.isLetter(queue.charAt(pos+1)));
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Tests if the queue matches the sequence (as with match), and if they do, removes the matched string from the
     * queue.
     * @param seq String to search for, and if found, remove from queue.
     * @return true if found and removed, false if not found.
     */
    public boolean matchChomp(String seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6873);
        __CLR4_2_159t59tjpaexqmw.R.inc(6874);if ((((matches(seq))&&(__CLR4_2_159t59tjpaexqmw.R.iget(6875)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6876)==0&false))) {{
            __CLR4_2_159t59tjpaexqmw.R.inc(6877);pos += seq.length();
            __CLR4_2_159t59tjpaexqmw.R.inc(6878);return true;
        } }else {{
            __CLR4_2_159t59tjpaexqmw.R.inc(6879);return false;
        }
    }}finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     Tests if queue starts with a whitespace character.
     @return if starts with whitespace
     */
    public boolean matchesWhitespace() {try{__CLR4_2_159t59tjpaexqmw.R.inc(6880);
        __CLR4_2_159t59tjpaexqmw.R.inc(6881);return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     Test if the queue matches a word character (letter or digit).
     @return if matches a word character
     */
    public boolean matchesWord() {try{__CLR4_2_159t59tjpaexqmw.R.inc(6882);
        __CLR4_2_159t59tjpaexqmw.R.inc(6883);return !isEmpty() && Character.isLetterOrDigit(queue.charAt(pos));
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Drops the next character off the queue.
     */
    public void advance() {try{__CLR4_2_159t59tjpaexqmw.R.inc(6884);
        __CLR4_2_159t59tjpaexqmw.R.inc(6885);if ((((!isEmpty())&&(__CLR4_2_159t59tjpaexqmw.R.iget(6886)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6887)==0&false))) {__CLR4_2_159t59tjpaexqmw.R.inc(6888);pos++;
    }}finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Consume one character off queue.
     * @return first character on queue.
     */
    public char consume() {try{__CLR4_2_159t59tjpaexqmw.R.inc(6889);
        __CLR4_2_159t59tjpaexqmw.R.inc(6890);return queue.charAt(pos++);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Consumes the supplied sequence of the queue. If the queue does not start with the supplied sequence, will
     * throw an illegal state exception -- but you should be running match() against that condition.
     <p>
     Case insensitive.
     * @param seq sequence to remove from head of queue.
     */
    public void consume(String seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6891);
        __CLR4_2_159t59tjpaexqmw.R.inc(6892);if ((((!matches(seq))&&(__CLR4_2_159t59tjpaexqmw.R.iget(6893)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6894)==0&false)))
            {__CLR4_2_159t59tjpaexqmw.R.inc(6895);throw new IllegalStateException("Queue did not match expected sequence");
        }__CLR4_2_159t59tjpaexqmw.R.inc(6896);int len = seq.length();
        __CLR4_2_159t59tjpaexqmw.R.inc(6897);if ((((len > remainingLength())&&(__CLR4_2_159t59tjpaexqmw.R.iget(6898)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6899)==0&false)))
            {__CLR4_2_159t59tjpaexqmw.R.inc(6900);throw new IllegalStateException("Queue not long enough to consume sequence");
        
        }__CLR4_2_159t59tjpaexqmw.R.inc(6901);pos += len;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Pulls a string off the queue, up to but exclusive of the match sequence, or to the queue running out.
     * @param seq String to end on (and not include in return, but leave on queue). <b>Case sensitive.</b>
     * @return The matched data consumed from queue.
     */
    public String consumeTo(String seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6902);
        __CLR4_2_159t59tjpaexqmw.R.inc(6903);int offset = queue.indexOf(seq, pos);
        __CLR4_2_159t59tjpaexqmw.R.inc(6904);if ((((offset != -1)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6905)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6906)==0&false))) {{
            __CLR4_2_159t59tjpaexqmw.R.inc(6907);String consumed = queue.substring(pos, offset);
            __CLR4_2_159t59tjpaexqmw.R.inc(6908);pos += consumed.length();
            __CLR4_2_159t59tjpaexqmw.R.inc(6909);return consumed;
        } }else {{
            __CLR4_2_159t59tjpaexqmw.R.inc(6910);return remainder();
        }
    }}finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}
    
    public String consumeToIgnoreCase(String seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6911);
        __CLR4_2_159t59tjpaexqmw.R.inc(6912);int start = pos;
        __CLR4_2_159t59tjpaexqmw.R.inc(6913);String first = seq.substring(0, 1);
        __CLR4_2_159t59tjpaexqmw.R.inc(6914);boolean canScan = first.toLowerCase().equals(first.toUpperCase()); // if first is not cased, use index of
        __CLR4_2_159t59tjpaexqmw.R.inc(6915);while ((((!isEmpty())&&(__CLR4_2_159t59tjpaexqmw.R.iget(6916)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6917)==0&false))) {{
            __CLR4_2_159t59tjpaexqmw.R.inc(6918);if ((((matches(seq))&&(__CLR4_2_159t59tjpaexqmw.R.iget(6919)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6920)==0&false)))
                {__CLR4_2_159t59tjpaexqmw.R.inc(6921);break;
            
            }__CLR4_2_159t59tjpaexqmw.R.inc(6922);if ((((canScan)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6923)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6924)==0&false))) {{
                __CLR4_2_159t59tjpaexqmw.R.inc(6925);int skip = queue.indexOf(first, pos) - pos;
                __CLR4_2_159t59tjpaexqmw.R.inc(6926);if ((((skip == 0)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6927)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6928)==0&false))) // this char is the skip char, but not match, so force advance of pos
                    {__CLR4_2_159t59tjpaexqmw.R.inc(6929);pos++;
                }else {__CLR4_2_159t59tjpaexqmw.R.inc(6930);if ((((skip < 0)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6931)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6932)==0&false))) // no chance of finding, grab to end
                    {__CLR4_2_159t59tjpaexqmw.R.inc(6933);pos = queue.length();
                }else
                    {__CLR4_2_159t59tjpaexqmw.R.inc(6934);pos += skip;
            }}}
            }else
                {__CLR4_2_159t59tjpaexqmw.R.inc(6935);pos++;
        }}

        }__CLR4_2_159t59tjpaexqmw.R.inc(6936);return queue.substring(start, pos);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     Consumes to the first sequence provided, or to the end of the queue. Leaves the terminator on the queue.
     @param seq any number of terminators to consume to. <b>Case insensitive.</b>
     @return consumed string   
     */
    // todo: method name. not good that consumeTo cares for case, and consume to any doesn't. And the only use for this
    // is is a case sensitive time...
    public String consumeToAny(String... seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6937);
        __CLR4_2_159t59tjpaexqmw.R.inc(6938);int start = pos;
        __CLR4_2_159t59tjpaexqmw.R.inc(6939);while ((((!isEmpty() && !matchesAny(seq))&&(__CLR4_2_159t59tjpaexqmw.R.iget(6940)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6941)==0&false))) {{
            __CLR4_2_159t59tjpaexqmw.R.inc(6942);pos++;
        }

        }__CLR4_2_159t59tjpaexqmw.R.inc(6943);return queue.substring(start, pos);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Pulls a string off the queue (like consumeTo), and then pulls off the matched string (but does not return it).
     * <p>
     * If the queue runs out of characters before finding the seq, will return as much as it can (and queue will go
     * isEmpty() == true).
     * @param seq String to match up to, and not include in return, and to pull off queue. <b>Case sensitive.</b>
     * @return Data matched from queue.
     */
    public String chompTo(String seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6944);
        __CLR4_2_159t59tjpaexqmw.R.inc(6945);String data = consumeTo(seq);
        __CLR4_2_159t59tjpaexqmw.R.inc(6946);matchChomp(seq);
        __CLR4_2_159t59tjpaexqmw.R.inc(6947);return data;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}
    
    public String chompToIgnoreCase(String seq) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6948);
        __CLR4_2_159t59tjpaexqmw.R.inc(6949);String data = consumeToIgnoreCase(seq); // case insensitive scan
        __CLR4_2_159t59tjpaexqmw.R.inc(6950);matchChomp(seq);
        __CLR4_2_159t59tjpaexqmw.R.inc(6951);return data;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Pulls a balanced string off the queue. E.g. if queue is "(one (two) three) four", (,) will return "one (two) three",
     * and leave " four" on the queue. Unbalanced openers and closers can be quoted (with ' or ") or escaped (with \). Those escapes will be left
     * in the returned string, which is suitable for regexes (where we need to preserve the escape), but unsuitable for
     * contains text strings; use unescape for that.
     * @param open opener
     * @param close closer
     * @return data matched from the queue
     */
    public String chompBalanced(char open, char close) {try{__CLR4_2_159t59tjpaexqmw.R.inc(6952);
        __CLR4_2_159t59tjpaexqmw.R.inc(6953);int start = -1;
        __CLR4_2_159t59tjpaexqmw.R.inc(6954);int end = -1;
        __CLR4_2_159t59tjpaexqmw.R.inc(6955);int depth = 0;
        __CLR4_2_159t59tjpaexqmw.R.inc(6956);char last = 0;
        __CLR4_2_159t59tjpaexqmw.R.inc(6957);boolean inSingleQuote = false;
        __CLR4_2_159t59tjpaexqmw.R.inc(6958);boolean inDoubleQuote = false;

        __CLR4_2_159t59tjpaexqmw.R.inc(6959);do {{
            __CLR4_2_159t59tjpaexqmw.R.inc(6960);if ((((isEmpty())&&(__CLR4_2_159t59tjpaexqmw.R.iget(6961)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6962)==0&false))) {__CLR4_2_159t59tjpaexqmw.R.inc(6963);break;
            }__CLR4_2_159t59tjpaexqmw.R.inc(6964);Character c = consume();
            __CLR4_2_159t59tjpaexqmw.R.inc(6965);if ((((last == 0 || last != ESC)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6966)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6967)==0&false))) {{
                __CLR4_2_159t59tjpaexqmw.R.inc(6968);if ((((c.equals('\'') && c != open && !inDoubleQuote)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6969)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6970)==0&false)))
                    {__CLR4_2_159t59tjpaexqmw.R.inc(6971);inSingleQuote = !inSingleQuote;
                }else {__CLR4_2_159t59tjpaexqmw.R.inc(6972);if ((((c.equals('"') && c != open && !inSingleQuote)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6973)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6974)==0&false)))
                    {__CLR4_2_159t59tjpaexqmw.R.inc(6975);inDoubleQuote = !inDoubleQuote;
                }}__CLR4_2_159t59tjpaexqmw.R.inc(6976);if ((((inSingleQuote || inDoubleQuote)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6977)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6978)==0&false)))
                    {__CLR4_2_159t59tjpaexqmw.R.inc(6979);continue;

                }__CLR4_2_159t59tjpaexqmw.R.inc(6980);if ((((c.equals(open))&&(__CLR4_2_159t59tjpaexqmw.R.iget(6981)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6982)==0&false))) {{
                    __CLR4_2_159t59tjpaexqmw.R.inc(6983);depth++;
                    __CLR4_2_159t59tjpaexqmw.R.inc(6984);if ((((start == -1)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6985)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6986)==0&false)))
                        {__CLR4_2_159t59tjpaexqmw.R.inc(6987);start = pos;
                }}
                }else {__CLR4_2_159t59tjpaexqmw.R.inc(6988);if ((((c.equals(close))&&(__CLR4_2_159t59tjpaexqmw.R.iget(6989)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6990)==0&false)))
                    {__CLR4_2_159t59tjpaexqmw.R.inc(6991);depth--;
            }}}

            }__CLR4_2_159t59tjpaexqmw.R.inc(6992);if ((((depth > 0 && last != 0)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6993)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6994)==0&false)))
                {__CLR4_2_159t59tjpaexqmw.R.inc(6995);end = pos; // don't include the outer match pair in the return
            }__CLR4_2_159t59tjpaexqmw.R.inc(6996);last = c;
        } }while ((((depth > 0)&&(__CLR4_2_159t59tjpaexqmw.R.iget(6997)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(6998)==0&false)));
        __CLR4_2_159t59tjpaexqmw.R.inc(6999);final String out = ((((end >= 0) )&&(__CLR4_2_159t59tjpaexqmw.R.iget(7000)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(7001)==0&false))? queue.substring(start, end) : "";
        __CLR4_2_159t59tjpaexqmw.R.inc(7002);if ((((depth > 0)&&(__CLR4_2_159t59tjpaexqmw.R.iget(7003)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(7004)==0&false))) {{// ran out of queue before seeing enough )
            __CLR4_2_159t59tjpaexqmw.R.inc(7005);Validate.fail("Did not find balanced marker at '" + out + "'");
        }
        }__CLR4_2_159t59tjpaexqmw.R.inc(7006);return out;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}
    
    /**
     * Unescape a \ escaped string.
     * @param in backslash escaped string
     * @return unescaped string
     */
    public static String unescape(String in) {try{__CLR4_2_159t59tjpaexqmw.R.inc(7007);
        __CLR4_2_159t59tjpaexqmw.R.inc(7008);StringBuilder out = StringUtil.borrowBuilder();
        __CLR4_2_159t59tjpaexqmw.R.inc(7009);char last = 0;
        __CLR4_2_159t59tjpaexqmw.R.inc(7010);for (char c : in.toCharArray()) {{
            __CLR4_2_159t59tjpaexqmw.R.inc(7011);if ((((c == ESC)&&(__CLR4_2_159t59tjpaexqmw.R.iget(7012)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(7013)==0&false))) {{
                __CLR4_2_159t59tjpaexqmw.R.inc(7014);if ((((last != 0 && last == ESC)&&(__CLR4_2_159t59tjpaexqmw.R.iget(7015)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(7016)==0&false)))
                    {__CLR4_2_159t59tjpaexqmw.R.inc(7017);out.append(c);
            }}
            }else 
                {__CLR4_2_159t59tjpaexqmw.R.inc(7018);out.append(c);
            }__CLR4_2_159t59tjpaexqmw.R.inc(7019);last = c;
        }
        }__CLR4_2_159t59tjpaexqmw.R.inc(7020);return StringUtil.releaseBuilder(out);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Pulls the next run of whitespace characters of the queue.
     * @return Whether consuming whitespace or not
     */
    public boolean consumeWhitespace() {try{__CLR4_2_159t59tjpaexqmw.R.inc(7021);
        __CLR4_2_159t59tjpaexqmw.R.inc(7022);boolean seen = false;
        __CLR4_2_159t59tjpaexqmw.R.inc(7023);while ((((matchesWhitespace())&&(__CLR4_2_159t59tjpaexqmw.R.iget(7024)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(7025)==0&false))) {{
            __CLR4_2_159t59tjpaexqmw.R.inc(7026);pos++;
            __CLR4_2_159t59tjpaexqmw.R.inc(7027);seen = true;
        }
        }__CLR4_2_159t59tjpaexqmw.R.inc(7028);return seen;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     * Retrieves the next run of word type (letter or digit) off the queue.
     * @return String of word characters from queue, or empty string if none.
     */
    public String consumeWord() {try{__CLR4_2_159t59tjpaexqmw.R.inc(7029);
        __CLR4_2_159t59tjpaexqmw.R.inc(7030);int start = pos;
        __CLR4_2_159t59tjpaexqmw.R.inc(7031);while ((((matchesWord())&&(__CLR4_2_159t59tjpaexqmw.R.iget(7032)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(7033)==0&false)))
            {__CLR4_2_159t59tjpaexqmw.R.inc(7034);pos++;
        }__CLR4_2_159t59tjpaexqmw.R.inc(7035);return queue.substring(start, pos);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}
    
    /**
     * Consume an tag name off the queue (word or :, _, -)
     * 
     * @return tag name
     */
    public String consumeTagName() {try{__CLR4_2_159t59tjpaexqmw.R.inc(7036);
        __CLR4_2_159t59tjpaexqmw.R.inc(7037);int start = pos;
        __CLR4_2_159t59tjpaexqmw.R.inc(7038);while ((((!isEmpty() && (matchesWord() || matchesAny(':', '_', '-')))&&(__CLR4_2_159t59tjpaexqmw.R.iget(7039)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(7040)==0&false)))
            {__CLR4_2_159t59tjpaexqmw.R.inc(7041);pos++;
        
        }__CLR4_2_159t59tjpaexqmw.R.inc(7042);return queue.substring(start, pos);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}
    
    /**
     * Consume a CSS element selector (tag name, but | instead of : for namespaces (or *| for wildcard namespace), to not conflict with :pseudo selects).
     * 
     * @return tag name
     */
    public String consumeElementSelector() {try{__CLR4_2_159t59tjpaexqmw.R.inc(7043);
        __CLR4_2_159t59tjpaexqmw.R.inc(7044);int start = pos;
        __CLR4_2_159t59tjpaexqmw.R.inc(7045);while ((((!isEmpty() && (matchesWord() || matchesAny("*|","|", "_", "-")))&&(__CLR4_2_159t59tjpaexqmw.R.iget(7046)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(7047)==0&false)))
            {__CLR4_2_159t59tjpaexqmw.R.inc(7048);pos++;
        
        }__CLR4_2_159t59tjpaexqmw.R.inc(7049);return queue.substring(start, pos);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     Consume a CSS identifier (ID or class) off the queue (letter, digit, -, _)
     http://www.w3.org/TR/CSS2/syndata.html#value-def-identifier
     @return identifier
     */
    public String consumeCssIdentifier() {try{__CLR4_2_159t59tjpaexqmw.R.inc(7050);
        __CLR4_2_159t59tjpaexqmw.R.inc(7051);int start = pos;
        __CLR4_2_159t59tjpaexqmw.R.inc(7052);while ((((!isEmpty() && (matchesWord() || matchesAny('-', '_')))&&(__CLR4_2_159t59tjpaexqmw.R.iget(7053)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(7054)==0&false)))
            {__CLR4_2_159t59tjpaexqmw.R.inc(7055);pos++;

        }__CLR4_2_159t59tjpaexqmw.R.inc(7056);return queue.substring(start, pos);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     Consume an attribute key off the queue (letter, digit, -, _, :")
     @return attribute key
     */
    public String consumeAttributeKey() {try{__CLR4_2_159t59tjpaexqmw.R.inc(7057);
        __CLR4_2_159t59tjpaexqmw.R.inc(7058);int start = pos;
        __CLR4_2_159t59tjpaexqmw.R.inc(7059);while ((((!isEmpty() && (matchesWord() || matchesAny('-', '_', ':')))&&(__CLR4_2_159t59tjpaexqmw.R.iget(7060)!=0|true))||(__CLR4_2_159t59tjpaexqmw.R.iget(7061)==0&false)))
            {__CLR4_2_159t59tjpaexqmw.R.inc(7062);pos++;
        
        }__CLR4_2_159t59tjpaexqmw.R.inc(7063);return queue.substring(start, pos);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}

    /**
     Consume and return whatever is left on the queue.
     @return remained of queue.
     */
    public String remainder() {try{__CLR4_2_159t59tjpaexqmw.R.inc(7064);
        __CLR4_2_159t59tjpaexqmw.R.inc(7065);final String remainder = queue.substring(pos, queue.length());
        __CLR4_2_159t59tjpaexqmw.R.inc(7066);pos = queue.length();
        __CLR4_2_159t59tjpaexqmw.R.inc(7067);return remainder;
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}
    
    @Override
    public String toString() {try{__CLR4_2_159t59tjpaexqmw.R.inc(7068);
        __CLR4_2_159t59tjpaexqmw.R.inc(7069);return queue.substring(pos);
    }finally{__CLR4_2_159t59tjpaexqmw.R.flushNeeded();}}
}
