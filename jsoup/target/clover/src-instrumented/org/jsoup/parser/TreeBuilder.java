/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jonathan Hedley
 */
abstract class TreeBuilder {public static class __CLR4_2_16qh6qhjpaexqq0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,8779,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected Parser parser;
    CharacterReader reader;
    Tokeniser tokeniser;
    protected Document doc; // current doc we are building into
    protected ArrayList<Element> stack; // the stack of open elements
    protected String baseUri; // current base uri, for creating new elements
    protected Token currentToken; // currentToken is used only for error tracking.
    protected ParseSettings settings;

    private Token.StartTag start = new Token.StartTag(); // start tag to process
    private Token.EndTag end  = new Token.EndTag();
    abstract ParseSettings defaultSettings();

    protected void initialiseParse(Reader input, String baseUri, Parser parser) {try{__CLR4_2_16qh6qhjpaexqq0.R.inc(8729);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8730);Validate.notNull(input, "String input must not be null");
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8731);Validate.notNull(baseUri, "BaseURI must not be null");

        __CLR4_2_16qh6qhjpaexqq0.R.inc(8732);doc = new Document(baseUri);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8733);doc.parser(parser);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8734);this.parser = parser;
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8735);settings = parser.settings();
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8736);reader = new CharacterReader(input);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8737);currentToken = null;
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8738);tokeniser = new Tokeniser(reader, parser.getErrors());
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8739);stack = new ArrayList<>(32);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8740);this.baseUri = baseUri;
    }finally{__CLR4_2_16qh6qhjpaexqq0.R.flushNeeded();}}

    Document parse(Reader input, String baseUri, Parser parser) {try{__CLR4_2_16qh6qhjpaexqq0.R.inc(8741);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8742);initialiseParse(input, baseUri, parser);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8743);runParser();
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8744);return doc;
    }finally{__CLR4_2_16qh6qhjpaexqq0.R.flushNeeded();}}

    abstract List<Node> parseFragment(String inputFragment, Element context, String baseUri, Parser parser);

    protected void runParser() {try{__CLR4_2_16qh6qhjpaexqq0.R.inc(8745);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8746);while (true) {{
            __CLR4_2_16qh6qhjpaexqq0.R.inc(8747);Token token = tokeniser.read();
            __CLR4_2_16qh6qhjpaexqq0.R.inc(8748);process(token);
            __CLR4_2_16qh6qhjpaexqq0.R.inc(8749);token.reset();

            __CLR4_2_16qh6qhjpaexqq0.R.inc(8750);if ((((token.type == Token.TokenType.EOF)&&(__CLR4_2_16qh6qhjpaexqq0.R.iget(8751)!=0|true))||(__CLR4_2_16qh6qhjpaexqq0.R.iget(8752)==0&false)))
                {__CLR4_2_16qh6qhjpaexqq0.R.inc(8753);break;
        }}
    }}finally{__CLR4_2_16qh6qhjpaexqq0.R.flushNeeded();}}

    protected abstract boolean process(Token token);

    protected boolean processStartTag(String name) {try{__CLR4_2_16qh6qhjpaexqq0.R.inc(8754);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8755);if ((((currentToken == start)&&(__CLR4_2_16qh6qhjpaexqq0.R.iget(8756)!=0|true))||(__CLR4_2_16qh6qhjpaexqq0.R.iget(8757)==0&false))) {{ // don't recycle an in-use token
            __CLR4_2_16qh6qhjpaexqq0.R.inc(8758);return process(new Token.StartTag().name(name));
        }
        }__CLR4_2_16qh6qhjpaexqq0.R.inc(8759);return process(start.reset().name(name));
    }finally{__CLR4_2_16qh6qhjpaexqq0.R.flushNeeded();}}

    public boolean processStartTag(String name, Attributes attrs) {try{__CLR4_2_16qh6qhjpaexqq0.R.inc(8760);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8761);if ((((currentToken == start)&&(__CLR4_2_16qh6qhjpaexqq0.R.iget(8762)!=0|true))||(__CLR4_2_16qh6qhjpaexqq0.R.iget(8763)==0&false))) {{ // don't recycle an in-use token
            __CLR4_2_16qh6qhjpaexqq0.R.inc(8764);return process(new Token.StartTag().nameAttr(name, attrs));
        }
        }__CLR4_2_16qh6qhjpaexqq0.R.inc(8765);start.reset();
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8766);start.nameAttr(name, attrs);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8767);return process(start);
    }finally{__CLR4_2_16qh6qhjpaexqq0.R.flushNeeded();}}

    protected boolean processEndTag(String name) {try{__CLR4_2_16qh6qhjpaexqq0.R.inc(8768);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8769);if ((((currentToken == end)&&(__CLR4_2_16qh6qhjpaexqq0.R.iget(8770)!=0|true))||(__CLR4_2_16qh6qhjpaexqq0.R.iget(8771)==0&false))) {{ // don't recycle an in-use token
            __CLR4_2_16qh6qhjpaexqq0.R.inc(8772);return process(new Token.EndTag().name(name));
        }
        }__CLR4_2_16qh6qhjpaexqq0.R.inc(8773);return process(end.reset().name(name));
    }finally{__CLR4_2_16qh6qhjpaexqq0.R.flushNeeded();}}


    protected Element currentElement() {try{__CLR4_2_16qh6qhjpaexqq0.R.inc(8774);
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8775);int size = stack.size();
        __CLR4_2_16qh6qhjpaexqq0.R.inc(8776);return (((size > 0 )&&(__CLR4_2_16qh6qhjpaexqq0.R.iget(8777)!=0|true))||(__CLR4_2_16qh6qhjpaexqq0.R.iget(8778)==0&false))? stack.get(size-1) : null;
    }finally{__CLR4_2_16qh6qhjpaexqq0.R.flushNeeded();}}
}
