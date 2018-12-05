/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.jsoup.helper.Validate;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;

/**
 CharacterReader consumes tokens off a string. Used internally by jsoup. API subject to changes.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class CharacterReader {public static class __CLR4_2_12ue2uejpaexqip{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,4082,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static final char EOF = (char) -1;
    private static final int maxStringCacheLen = 12;
    static final int maxBufferLen = 1024 * 32; // visible for testing
    private static final int readAheadLimit = (int) (maxBufferLen * 0.75);

    private final char[] charBuf;
    private final Reader reader;
    private int bufLength;
    private int bufSplitPoint;
    private int bufPos;
    private int readerPos;
    private int bufMark;
    private final String[] stringCache = new String[512]; // holds reused strings in this doc, to lessen garbage

    public CharacterReader(Reader input, int sz) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3686);
        __CLR4_2_12ue2uejpaexqip.R.inc(3687);Validate.notNull(input);
        __CLR4_2_12ue2uejpaexqip.R.inc(3688);Validate.isTrue(input.markSupported());
        __CLR4_2_12ue2uejpaexqip.R.inc(3689);reader = input;
        __CLR4_2_12ue2uejpaexqip.R.inc(3690);charBuf = new char[(((sz > maxBufferLen )&&(__CLR4_2_12ue2uejpaexqip.R.iget(3691)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3692)==0&false))? maxBufferLen : sz];
        __CLR4_2_12ue2uejpaexqip.R.inc(3693);bufferUp();
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    public CharacterReader(Reader input) {
        this(input, maxBufferLen);__CLR4_2_12ue2uejpaexqip.R.inc(3695);try{__CLR4_2_12ue2uejpaexqip.R.inc(3694);
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    public CharacterReader(String input) {
        this(new StringReader(input), input.length());__CLR4_2_12ue2uejpaexqip.R.inc(3697);try{__CLR4_2_12ue2uejpaexqip.R.inc(3696);
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    private void bufferUp() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3698);
        __CLR4_2_12ue2uejpaexqip.R.inc(3699);final int pos = bufPos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3700);if ((((pos < bufSplitPoint)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3701)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3702)==0&false)))
            {__CLR4_2_12ue2uejpaexqip.R.inc(3703);return;

        }__CLR4_2_12ue2uejpaexqip.R.inc(3704);try {
            __CLR4_2_12ue2uejpaexqip.R.inc(3705);reader.skip(pos);
            __CLR4_2_12ue2uejpaexqip.R.inc(3706);reader.mark(maxBufferLen);
            __CLR4_2_12ue2uejpaexqip.R.inc(3707);final int read = reader.read(charBuf);
            __CLR4_2_12ue2uejpaexqip.R.inc(3708);reader.reset();
            __CLR4_2_12ue2uejpaexqip.R.inc(3709);if ((((read != -1)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3710)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3711)==0&false))) {{
                __CLR4_2_12ue2uejpaexqip.R.inc(3712);bufLength = read;
                __CLR4_2_12ue2uejpaexqip.R.inc(3713);readerPos += pos;
                __CLR4_2_12ue2uejpaexqip.R.inc(3714);bufPos = 0;
                __CLR4_2_12ue2uejpaexqip.R.inc(3715);bufMark = 0;
                __CLR4_2_12ue2uejpaexqip.R.inc(3716);bufSplitPoint = (((bufLength > readAheadLimit )&&(__CLR4_2_12ue2uejpaexqip.R.iget(3717)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3718)==0&false))? readAheadLimit : bufLength;
            }
        }} catch (IOException e) {
            __CLR4_2_12ue2uejpaexqip.R.inc(3719);throw new UncheckedIOException(e);
        }
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    /**
     * Gets the current cursor position in the content.
     * @return current position
     */
    public int pos() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3720);
        __CLR4_2_12ue2uejpaexqip.R.inc(3721);return readerPos + bufPos;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    /**
     * Tests if all the content has been read.
     * @return true if nothing left to read.
     */
    public boolean isEmpty() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3722);
        __CLR4_2_12ue2uejpaexqip.R.inc(3723);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3724);return bufPos >= bufLength;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    private boolean isEmptyNoBufferUp() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3725);
        __CLR4_2_12ue2uejpaexqip.R.inc(3726);return bufPos >= bufLength;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    /**
     * Get the char at the current position.
     * @return char
     */
    public char current() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3727);
        __CLR4_2_12ue2uejpaexqip.R.inc(3728);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3729);return (((isEmptyNoBufferUp() )&&(__CLR4_2_12ue2uejpaexqip.R.iget(3730)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3731)==0&false))? EOF : charBuf[bufPos];
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    char consume() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3732);
        __CLR4_2_12ue2uejpaexqip.R.inc(3733);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3734);char val = (((isEmptyNoBufferUp() )&&(__CLR4_2_12ue2uejpaexqip.R.iget(3735)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3736)==0&false))? EOF : charBuf[bufPos];
        __CLR4_2_12ue2uejpaexqip.R.inc(3737);bufPos++;
        __CLR4_2_12ue2uejpaexqip.R.inc(3738);return val;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    void unconsume() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3739);
        __CLR4_2_12ue2uejpaexqip.R.inc(3740);bufPos--;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    /**
     * Moves the current position by one.
     */
    public void advance() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3741);
        __CLR4_2_12ue2uejpaexqip.R.inc(3742);bufPos++;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    void mark() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3743);
        __CLR4_2_12ue2uejpaexqip.R.inc(3744);bufMark = bufPos;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    void rewindToMark() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3745);
        __CLR4_2_12ue2uejpaexqip.R.inc(3746);bufPos = bufMark;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    /**
     * Returns the number of characters between the current position and the next instance of the input char
     * @param c scan target
     * @return offset between current position and next instance of target. -1 if not found.
     */
    int nextIndexOf(char c) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3747);
        // doesn't handle scanning for surrogates
        __CLR4_2_12ue2uejpaexqip.R.inc(3748);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3749);for (int i = bufPos; (((i < bufLength)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3750)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3751)==0&false)); i++) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3752);if ((((c == charBuf[i])&&(__CLR4_2_12ue2uejpaexqip.R.iget(3753)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3754)==0&false)))
                {__CLR4_2_12ue2uejpaexqip.R.inc(3755);return i - bufPos;
        }}
        }__CLR4_2_12ue2uejpaexqip.R.inc(3756);return -1;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    /**
     * Returns the number of characters between the current position and the next instance of the input sequence
     *
     * @param seq scan target
     * @return offset between current position and next instance of target. -1 if not found.
     */
    int nextIndexOf(CharSequence seq) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3757);
        __CLR4_2_12ue2uejpaexqip.R.inc(3758);bufferUp();
        // doesn't handle scanning for surrogates
        __CLR4_2_12ue2uejpaexqip.R.inc(3759);char startChar = seq.charAt(0);
        __CLR4_2_12ue2uejpaexqip.R.inc(3760);for (int offset = bufPos; (((offset < bufLength)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3761)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3762)==0&false)); offset++) {{
            // scan to first instance of startchar:
            __CLR4_2_12ue2uejpaexqip.R.inc(3763);if ((((startChar != charBuf[offset])&&(__CLR4_2_12ue2uejpaexqip.R.iget(3764)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3765)==0&false)))
                {__CLR4_2_12ue2uejpaexqip.R.inc(3766);while((((++offset < bufLength && startChar != charBuf[offset])&&(__CLR4_2_12ue2uejpaexqip.R.iget(3767)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3768)==0&false))) {{ /* empty */ }
            }}__CLR4_2_12ue2uejpaexqip.R.inc(3769);int i = offset + 1;
            __CLR4_2_12ue2uejpaexqip.R.inc(3770);int last = i + seq.length()-1;
            __CLR4_2_12ue2uejpaexqip.R.inc(3771);if ((((offset < bufLength && last <= bufLength)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3772)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3773)==0&false))) {{
                __CLR4_2_12ue2uejpaexqip.R.inc(3774);for (int j = 1; (((i < last && seq.charAt(j) == charBuf[i])&&(__CLR4_2_12ue2uejpaexqip.R.iget(3775)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3776)==0&false)); i++, j++) {{ /* empty */ }
                }__CLR4_2_12ue2uejpaexqip.R.inc(3777);if ((((i == last)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3778)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3779)==0&false))) // found full sequence
                    {__CLR4_2_12ue2uejpaexqip.R.inc(3780);return offset - bufPos;
            }}
        }}
        }__CLR4_2_12ue2uejpaexqip.R.inc(3781);return -1;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    /**
     * Reads characters up to the specific char.
     * @param c the delimiter
     * @return the chars read
     */
    public String consumeTo(char c) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3782);
        __CLR4_2_12ue2uejpaexqip.R.inc(3783);int offset = nextIndexOf(c);
        __CLR4_2_12ue2uejpaexqip.R.inc(3784);if ((((offset != -1)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3785)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3786)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3787);String consumed = cacheString(charBuf, stringCache, bufPos, offset);
            __CLR4_2_12ue2uejpaexqip.R.inc(3788);bufPos += offset;
            __CLR4_2_12ue2uejpaexqip.R.inc(3789);return consumed;
        } }else {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3790);return consumeToEnd();
        }
    }}finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    String consumeTo(String seq) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3791);
        __CLR4_2_12ue2uejpaexqip.R.inc(3792);int offset = nextIndexOf(seq);
        __CLR4_2_12ue2uejpaexqip.R.inc(3793);if ((((offset != -1)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3794)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3795)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3796);String consumed = cacheString(charBuf, stringCache, bufPos, offset);
            __CLR4_2_12ue2uejpaexqip.R.inc(3797);bufPos += offset;
            __CLR4_2_12ue2uejpaexqip.R.inc(3798);return consumed;
        } }else {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3799);return consumeToEnd();
        }
    }}finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    /**
     * Read characters until the first of any delimiters is found.
     * @param chars delimiters to scan for
     * @return characters read up to the matched delimiter.
     */
    public String consumeToAny(final char... chars) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3800);
        __CLR4_2_12ue2uejpaexqip.R.inc(3801);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3802);int pos = bufPos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3803);final int start = pos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3804);final int remaining = bufLength;
        __CLR4_2_12ue2uejpaexqip.R.inc(3805);final char[] val = charBuf;
        __CLR4_2_12ue2uejpaexqip.R.inc(3806);final int charLen = chars.length;
        __CLR4_2_12ue2uejpaexqip.R.inc(3807);int i;

        __CLR4_2_12ue2uejpaexqip.R.inc(3808);OUTER: while ((((pos < remaining)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3809)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3810)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3811);for (i = 0; (((i < charLen)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3812)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3813)==0&false)); i++) {{
                __CLR4_2_12ue2uejpaexqip.R.inc(3814);if ((((val[pos] == chars[i])&&(__CLR4_2_12ue2uejpaexqip.R.iget(3815)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3816)==0&false)))
                    {__CLR4_2_12ue2uejpaexqip.R.inc(3817);break OUTER;
            }}
            }__CLR4_2_12ue2uejpaexqip.R.inc(3818);pos++;
        }

        }__CLR4_2_12ue2uejpaexqip.R.inc(3819);bufPos = pos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3820);return (((pos > start )&&(__CLR4_2_12ue2uejpaexqip.R.iget(3821)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3822)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    String consumeToAnySorted(final char... chars) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3823);
        __CLR4_2_12ue2uejpaexqip.R.inc(3824);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3825);int pos = bufPos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3826);final int start = pos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3827);final int remaining = bufLength;
        __CLR4_2_12ue2uejpaexqip.R.inc(3828);final char[] val = charBuf;

        __CLR4_2_12ue2uejpaexqip.R.inc(3829);while ((((pos < remaining)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3830)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3831)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3832);if ((((Arrays.binarySearch(chars, val[pos]) >= 0)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3833)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3834)==0&false)))
                {__CLR4_2_12ue2uejpaexqip.R.inc(3835);break;
            }__CLR4_2_12ue2uejpaexqip.R.inc(3836);pos++;
        }
        }__CLR4_2_12ue2uejpaexqip.R.inc(3837);bufPos = pos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3838);return (((bufPos > start )&&(__CLR4_2_12ue2uejpaexqip.R.iget(3839)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3840)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    String consumeData() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3841);
        // &, <, null
        //bufferUp(); // no need to bufferUp, just called consume()
        __CLR4_2_12ue2uejpaexqip.R.inc(3842);int pos = bufPos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3843);final int start = pos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3844);final int remaining = bufLength;
        __CLR4_2_12ue2uejpaexqip.R.inc(3845);final char[] val = charBuf;

        __CLR4_2_12ue2uejpaexqip.R.inc(3846);OUTER: while ((((pos < remaining)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3847)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3848)==0&false))) {{
            boolean __CLB4_2_1_bool0=false;__CLR4_2_12ue2uejpaexqip.R.inc(3849);switch (val[pos]) {
                case '&':if (!__CLB4_2_1_bool0) {__CLR4_2_12ue2uejpaexqip.R.inc(3850);__CLB4_2_1_bool0=true;}
                case '<':if (!__CLB4_2_1_bool0) {__CLR4_2_12ue2uejpaexqip.R.inc(3851);__CLB4_2_1_bool0=true;}
                case TokeniserState.nullChar:if (!__CLB4_2_1_bool0) {__CLR4_2_12ue2uejpaexqip.R.inc(3852);__CLB4_2_1_bool0=true;}
                    __CLR4_2_12ue2uejpaexqip.R.inc(3853);break OUTER;
                default:if (!__CLB4_2_1_bool0) {__CLR4_2_12ue2uejpaexqip.R.inc(3854);__CLB4_2_1_bool0=true;}
                    __CLR4_2_12ue2uejpaexqip.R.inc(3855);pos++;
            }
        }
        }__CLR4_2_12ue2uejpaexqip.R.inc(3856);bufPos = pos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3857);return (((pos > start )&&(__CLR4_2_12ue2uejpaexqip.R.iget(3858)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3859)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    String consumeTagName() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3860);
        // '\t', '\n', '\r', '\f', ' ', '/', '>', nullChar
        // NOTE: out of spec, added '<' to fix common author bugs
        __CLR4_2_12ue2uejpaexqip.R.inc(3861);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3862);int pos = bufPos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3863);final int start = pos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3864);final int remaining = bufLength;
        __CLR4_2_12ue2uejpaexqip.R.inc(3865);final char[] val = charBuf;

        __CLR4_2_12ue2uejpaexqip.R.inc(3866);OUTER: while ((((pos < remaining)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3867)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3868)==0&false))) {{
            boolean __CLB4_2_1_bool1=false;__CLR4_2_12ue2uejpaexqip.R.inc(3869);switch (val[pos]) {
                case '\t':if (!__CLB4_2_1_bool1) {__CLR4_2_12ue2uejpaexqip.R.inc(3870);__CLB4_2_1_bool1=true;}
                case '\n':if (!__CLB4_2_1_bool1) {__CLR4_2_12ue2uejpaexqip.R.inc(3871);__CLB4_2_1_bool1=true;}
                case '\r':if (!__CLB4_2_1_bool1) {__CLR4_2_12ue2uejpaexqip.R.inc(3872);__CLB4_2_1_bool1=true;}
                case '\f':if (!__CLB4_2_1_bool1) {__CLR4_2_12ue2uejpaexqip.R.inc(3873);__CLB4_2_1_bool1=true;}
                case ' ':if (!__CLB4_2_1_bool1) {__CLR4_2_12ue2uejpaexqip.R.inc(3874);__CLB4_2_1_bool1=true;}
                case '/':if (!__CLB4_2_1_bool1) {__CLR4_2_12ue2uejpaexqip.R.inc(3875);__CLB4_2_1_bool1=true;}
                case '>':if (!__CLB4_2_1_bool1) {__CLR4_2_12ue2uejpaexqip.R.inc(3876);__CLB4_2_1_bool1=true;}
                case '<':if (!__CLB4_2_1_bool1) {__CLR4_2_12ue2uejpaexqip.R.inc(3877);__CLB4_2_1_bool1=true;}
                case TokeniserState.nullChar:if (!__CLB4_2_1_bool1) {__CLR4_2_12ue2uejpaexqip.R.inc(3878);__CLB4_2_1_bool1=true;}
                    __CLR4_2_12ue2uejpaexqip.R.inc(3879);break OUTER;
            }
            __CLR4_2_12ue2uejpaexqip.R.inc(3880);pos++;
        }

        }__CLR4_2_12ue2uejpaexqip.R.inc(3881);bufPos = pos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3882);return (((pos > start )&&(__CLR4_2_12ue2uejpaexqip.R.iget(3883)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3884)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    String consumeToEnd() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3885);
        __CLR4_2_12ue2uejpaexqip.R.inc(3886);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3887);String data = cacheString(charBuf, stringCache, bufPos, bufLength - bufPos);
        __CLR4_2_12ue2uejpaexqip.R.inc(3888);bufPos = bufLength;
        __CLR4_2_12ue2uejpaexqip.R.inc(3889);return data;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    String consumeLetterSequence() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3890);
        __CLR4_2_12ue2uejpaexqip.R.inc(3891);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3892);int start = bufPos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3893);while ((((bufPos < bufLength)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3894)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3895)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3896);char c = charBuf[bufPos];
            __CLR4_2_12ue2uejpaexqip.R.inc(3897);if (((((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c))&&(__CLR4_2_12ue2uejpaexqip.R.iget(3898)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3899)==0&false)))
                {__CLR4_2_12ue2uejpaexqip.R.inc(3900);bufPos++;
            }else
                {__CLR4_2_12ue2uejpaexqip.R.inc(3901);break;
        }}

        }__CLR4_2_12ue2uejpaexqip.R.inc(3902);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    String consumeLetterThenDigitSequence() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3903);
        __CLR4_2_12ue2uejpaexqip.R.inc(3904);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3905);int start = bufPos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3906);while ((((bufPos < bufLength)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3907)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3908)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3909);char c = charBuf[bufPos];
            __CLR4_2_12ue2uejpaexqip.R.inc(3910);if (((((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c))&&(__CLR4_2_12ue2uejpaexqip.R.iget(3911)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3912)==0&false)))
                {__CLR4_2_12ue2uejpaexqip.R.inc(3913);bufPos++;
            }else
                {__CLR4_2_12ue2uejpaexqip.R.inc(3914);break;
        }}
        }__CLR4_2_12ue2uejpaexqip.R.inc(3915);while ((((!isEmptyNoBufferUp())&&(__CLR4_2_12ue2uejpaexqip.R.iget(3916)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3917)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3918);char c = charBuf[bufPos];
            __CLR4_2_12ue2uejpaexqip.R.inc(3919);if ((((c >= '0' && c <= '9')&&(__CLR4_2_12ue2uejpaexqip.R.iget(3920)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3921)==0&false)))
                {__CLR4_2_12ue2uejpaexqip.R.inc(3922);bufPos++;
            }else
                {__CLR4_2_12ue2uejpaexqip.R.inc(3923);break;
        }}

        }__CLR4_2_12ue2uejpaexqip.R.inc(3924);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    String consumeHexSequence() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3925);
        __CLR4_2_12ue2uejpaexqip.R.inc(3926);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3927);int start = bufPos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3928);while ((((bufPos < bufLength)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3929)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3930)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3931);char c = charBuf[bufPos];
            __CLR4_2_12ue2uejpaexqip.R.inc(3932);if (((((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f'))&&(__CLR4_2_12ue2uejpaexqip.R.iget(3933)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3934)==0&false)))
                {__CLR4_2_12ue2uejpaexqip.R.inc(3935);bufPos++;
            }else
                {__CLR4_2_12ue2uejpaexqip.R.inc(3936);break;
        }}
        }__CLR4_2_12ue2uejpaexqip.R.inc(3937);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    String consumeDigitSequence() {try{__CLR4_2_12ue2uejpaexqip.R.inc(3938);
        __CLR4_2_12ue2uejpaexqip.R.inc(3939);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3940);int start = bufPos;
        __CLR4_2_12ue2uejpaexqip.R.inc(3941);while ((((bufPos < bufLength)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3942)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3943)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3944);char c = charBuf[bufPos];
            __CLR4_2_12ue2uejpaexqip.R.inc(3945);if ((((c >= '0' && c <= '9')&&(__CLR4_2_12ue2uejpaexqip.R.iget(3946)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3947)==0&false)))
                {__CLR4_2_12ue2uejpaexqip.R.inc(3948);bufPos++;
            }else
                {__CLR4_2_12ue2uejpaexqip.R.inc(3949);break;
        }}
        }__CLR4_2_12ue2uejpaexqip.R.inc(3950);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    boolean matches(char c) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3951);
        __CLR4_2_12ue2uejpaexqip.R.inc(3952);return !isEmpty() && charBuf[bufPos] == c;

    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    boolean matches(String seq) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3953);
        __CLR4_2_12ue2uejpaexqip.R.inc(3954);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3955);int scanLength = seq.length();
        __CLR4_2_12ue2uejpaexqip.R.inc(3956);if ((((scanLength > bufLength - bufPos)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3957)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3958)==0&false)))
            {__CLR4_2_12ue2uejpaexqip.R.inc(3959);return false;

        }__CLR4_2_12ue2uejpaexqip.R.inc(3960);for (int offset = 0; (((offset < scanLength)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3961)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3962)==0&false)); offset++)
            {__CLR4_2_12ue2uejpaexqip.R.inc(3963);if ((((seq.charAt(offset) != charBuf[bufPos +offset])&&(__CLR4_2_12ue2uejpaexqip.R.iget(3964)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3965)==0&false)))
                {__CLR4_2_12ue2uejpaexqip.R.inc(3966);return false;
        }}__CLR4_2_12ue2uejpaexqip.R.inc(3967);return true;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    boolean matchesIgnoreCase(String seq) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3968);
        __CLR4_2_12ue2uejpaexqip.R.inc(3969);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3970);int scanLength = seq.length();
        __CLR4_2_12ue2uejpaexqip.R.inc(3971);if ((((scanLength > bufLength - bufPos)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3972)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3973)==0&false)))
            {__CLR4_2_12ue2uejpaexqip.R.inc(3974);return false;

        }__CLR4_2_12ue2uejpaexqip.R.inc(3975);for (int offset = 0; (((offset < scanLength)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3976)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3977)==0&false)); offset++) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3978);char upScan = Character.toUpperCase(seq.charAt(offset));
            __CLR4_2_12ue2uejpaexqip.R.inc(3979);char upTarget = Character.toUpperCase(charBuf[bufPos + offset]);
            __CLR4_2_12ue2uejpaexqip.R.inc(3980);if ((((upScan != upTarget)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3981)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3982)==0&false)))
                {__CLR4_2_12ue2uejpaexqip.R.inc(3983);return false;
        }}
        }__CLR4_2_12ue2uejpaexqip.R.inc(3984);return true;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    boolean matchesAny(char... seq) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3985);
        __CLR4_2_12ue2uejpaexqip.R.inc(3986);if ((((isEmpty())&&(__CLR4_2_12ue2uejpaexqip.R.iget(3987)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3988)==0&false)))
            {__CLR4_2_12ue2uejpaexqip.R.inc(3989);return false;

        }__CLR4_2_12ue2uejpaexqip.R.inc(3990);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(3991);char c = charBuf[bufPos];
        __CLR4_2_12ue2uejpaexqip.R.inc(3992);for (char seek : seq) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(3993);if ((((seek == c)&&(__CLR4_2_12ue2uejpaexqip.R.iget(3994)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(3995)==0&false)))
                {__CLR4_2_12ue2uejpaexqip.R.inc(3996);return true;
        }}
        }__CLR4_2_12ue2uejpaexqip.R.inc(3997);return false;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    boolean matchesAnySorted(char[] seq) {try{__CLR4_2_12ue2uejpaexqip.R.inc(3998);
        __CLR4_2_12ue2uejpaexqip.R.inc(3999);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(4000);return !isEmpty() && Arrays.binarySearch(seq, charBuf[bufPos]) >= 0;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    boolean matchesLetter() {try{__CLR4_2_12ue2uejpaexqip.R.inc(4001);
        __CLR4_2_12ue2uejpaexqip.R.inc(4002);if ((((isEmpty())&&(__CLR4_2_12ue2uejpaexqip.R.iget(4003)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4004)==0&false)))
            {__CLR4_2_12ue2uejpaexqip.R.inc(4005);return false;
        }__CLR4_2_12ue2uejpaexqip.R.inc(4006);char c = charBuf[bufPos];
        __CLR4_2_12ue2uejpaexqip.R.inc(4007);return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    boolean matchesDigit() {try{__CLR4_2_12ue2uejpaexqip.R.inc(4008);
        __CLR4_2_12ue2uejpaexqip.R.inc(4009);if ((((isEmpty())&&(__CLR4_2_12ue2uejpaexqip.R.iget(4010)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4011)==0&false)))
            {__CLR4_2_12ue2uejpaexqip.R.inc(4012);return false;
        }__CLR4_2_12ue2uejpaexqip.R.inc(4013);char c = charBuf[bufPos];
        __CLR4_2_12ue2uejpaexqip.R.inc(4014);return (c >= '0' && c <= '9');
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    boolean matchConsume(String seq) {try{__CLR4_2_12ue2uejpaexqip.R.inc(4015);
        __CLR4_2_12ue2uejpaexqip.R.inc(4016);bufferUp();
        __CLR4_2_12ue2uejpaexqip.R.inc(4017);if ((((matches(seq))&&(__CLR4_2_12ue2uejpaexqip.R.iget(4018)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4019)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(4020);bufPos += seq.length();
            __CLR4_2_12ue2uejpaexqip.R.inc(4021);return true;
        } }else {{
            __CLR4_2_12ue2uejpaexqip.R.inc(4022);return false;
        }
    }}finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    boolean matchConsumeIgnoreCase(String seq) {try{__CLR4_2_12ue2uejpaexqip.R.inc(4023);
        __CLR4_2_12ue2uejpaexqip.R.inc(4024);if ((((matchesIgnoreCase(seq))&&(__CLR4_2_12ue2uejpaexqip.R.iget(4025)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4026)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(4027);bufPos += seq.length();
            __CLR4_2_12ue2uejpaexqip.R.inc(4028);return true;
        } }else {{
            __CLR4_2_12ue2uejpaexqip.R.inc(4029);return false;
        }
    }}finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    boolean containsIgnoreCase(String seq) {try{__CLR4_2_12ue2uejpaexqip.R.inc(4030);
        // used to check presence of </title>, </style>. only finds consistent case.
        __CLR4_2_12ue2uejpaexqip.R.inc(4031);String loScan = seq.toLowerCase(Locale.ENGLISH);
        __CLR4_2_12ue2uejpaexqip.R.inc(4032);String hiScan = seq.toUpperCase(Locale.ENGLISH);
        __CLR4_2_12ue2uejpaexqip.R.inc(4033);return (nextIndexOf(loScan) > -1) || (nextIndexOf(hiScan) > -1);
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_12ue2uejpaexqip.R.inc(4034);
        __CLR4_2_12ue2uejpaexqip.R.inc(4035);return new String(charBuf, bufPos, bufLength - bufPos);
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    /**
     * Caches short strings, as a flywheel pattern, to reduce GC load. Just for this doc, to prevent leaks.
     * <p />
     * Simplistic, and on hash collisions just falls back to creating a new string, vs a full HashMap with Entry list.
     * That saves both having to create objects as hash keys, and running through the entry list, at the expense of
     * some more duplicates.
     */
    private static String cacheString(final char[] charBuf, final String[] stringCache, final int start, final int count) {try{__CLR4_2_12ue2uejpaexqip.R.inc(4036);
        // limit (no cache):
        __CLR4_2_12ue2uejpaexqip.R.inc(4037);if ((((count > maxStringCacheLen)&&(__CLR4_2_12ue2uejpaexqip.R.iget(4038)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4039)==0&false)))
            {__CLR4_2_12ue2uejpaexqip.R.inc(4040);return new String(charBuf, start, count);
        }__CLR4_2_12ue2uejpaexqip.R.inc(4041);if ((((count < 1)&&(__CLR4_2_12ue2uejpaexqip.R.iget(4042)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4043)==0&false)))
            {__CLR4_2_12ue2uejpaexqip.R.inc(4044);return "";

        // calculate hash:
        }__CLR4_2_12ue2uejpaexqip.R.inc(4045);int hash = 0;
        __CLR4_2_12ue2uejpaexqip.R.inc(4046);int offset = start;
        __CLR4_2_12ue2uejpaexqip.R.inc(4047);for (int i = 0; (((i < count)&&(__CLR4_2_12ue2uejpaexqip.R.iget(4048)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4049)==0&false)); i++) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(4050);hash = 31 * hash + charBuf[offset++];
        }

        // get from cache
        }__CLR4_2_12ue2uejpaexqip.R.inc(4051);final int index = hash & stringCache.length - 1;
        __CLR4_2_12ue2uejpaexqip.R.inc(4052);String cached = stringCache[index];

        __CLR4_2_12ue2uejpaexqip.R.inc(4053);if ((((cached == null)&&(__CLR4_2_12ue2uejpaexqip.R.iget(4054)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4055)==0&false))) {{ // miss, add
            __CLR4_2_12ue2uejpaexqip.R.inc(4056);cached = new String(charBuf, start, count);
            __CLR4_2_12ue2uejpaexqip.R.inc(4057);stringCache[index] = cached;
        } }else {{ // hashcode hit, check equality
            __CLR4_2_12ue2uejpaexqip.R.inc(4058);if ((((rangeEquals(charBuf, start, count, cached))&&(__CLR4_2_12ue2uejpaexqip.R.iget(4059)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4060)==0&false))) {{ // hit
                __CLR4_2_12ue2uejpaexqip.R.inc(4061);return cached;
            } }else {{ // hashcode conflict
                __CLR4_2_12ue2uejpaexqip.R.inc(4062);cached = new String(charBuf, start, count);
                __CLR4_2_12ue2uejpaexqip.R.inc(4063);stringCache[index] = cached; // update the cache, as recently used strings are more likely to show up again
            }
        }}
        }__CLR4_2_12ue2uejpaexqip.R.inc(4064);return cached;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    /**
     * Check if the value of the provided range equals the string.
     */
    static boolean rangeEquals(final char[] charBuf, final int start, int count, final String cached) {try{__CLR4_2_12ue2uejpaexqip.R.inc(4065);
        __CLR4_2_12ue2uejpaexqip.R.inc(4066);if ((((count == cached.length())&&(__CLR4_2_12ue2uejpaexqip.R.iget(4067)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4068)==0&false))) {{
            __CLR4_2_12ue2uejpaexqip.R.inc(4069);int i = start;
            __CLR4_2_12ue2uejpaexqip.R.inc(4070);int j = 0;
            __CLR4_2_12ue2uejpaexqip.R.inc(4071);while ((((count-- != 0)&&(__CLR4_2_12ue2uejpaexqip.R.iget(4072)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4073)==0&false))) {{
                __CLR4_2_12ue2uejpaexqip.R.inc(4074);if ((((charBuf[i++] != cached.charAt(j++))&&(__CLR4_2_12ue2uejpaexqip.R.iget(4075)!=0|true))||(__CLR4_2_12ue2uejpaexqip.R.iget(4076)==0&false)))
                    {__CLR4_2_12ue2uejpaexqip.R.inc(4077);return false;
            }}
            }__CLR4_2_12ue2uejpaexqip.R.inc(4078);return true;
        }
        }__CLR4_2_12ue2uejpaexqip.R.inc(4079);return false;
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}

    // just used for testing
    boolean rangeEquals(final int start, final int count, final String cached) {try{__CLR4_2_12ue2uejpaexqip.R.inc(4080);
        __CLR4_2_12ue2uejpaexqip.R.inc(4081);return rangeEquals(charBuf, start, count, cached);
    }finally{__CLR4_2_12ue2uejpaexqip.R.flushNeeded();}}
}
