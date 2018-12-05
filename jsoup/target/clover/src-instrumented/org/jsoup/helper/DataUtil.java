/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.helper;

import org.jsoup.UncheckedIOException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Internal static utilities for handling data.
 *
 */
public final class DataUtil {public static class __CLR4_2_16e6ejpaexq9j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,409,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Pattern charsetPattern = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    static final String defaultCharset = "UTF-8"; // used if not found in header or meta charset
    private static final int firstReadBufferSize = 1024 * 5;
    static final int bufferSize = 1024 * 32;
    private static final char[] mimeBoundaryChars =
            "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static final int boundaryLength = 32;

    private DataUtil() {try{__CLR4_2_16e6ejpaexq9j.R.inc(230);}finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    /**
     * Loads a file to a Document.
     * @param in file to load
     * @param charsetName character set of input
     * @param baseUri base URI of document, to resolve relative links against
     * @return Document
     * @throws IOException on IO error
     */
    public static Document load(File in, String charsetName, String baseUri) throws IOException {try{__CLR4_2_16e6ejpaexq9j.R.inc(231);
        __CLR4_2_16e6ejpaexq9j.R.inc(232);return parseInputStream(new FileInputStream(in), charsetName, baseUri, Parser.htmlParser());
    }finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    /**
     * Parses a Document from an input steam.
     * @param in input stream to parse. You will need to close it.
     * @param charsetName character set of input
     * @param baseUri base URI of document, to resolve relative links against
     * @return Document
     * @throws IOException on IO error
     */
    public static Document load(InputStream in, String charsetName, String baseUri) throws IOException {try{__CLR4_2_16e6ejpaexq9j.R.inc(233);
        __CLR4_2_16e6ejpaexq9j.R.inc(234);return parseInputStream(in, charsetName, baseUri, Parser.htmlParser());
    }finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    /**
     * Parses a Document from an input steam, using the provided Parser.
     * @param in input stream to parse. You will need to close it.
     * @param charsetName character set of input
     * @param baseUri base URI of document, to resolve relative links against
     * @param parser alternate {@link Parser#xmlParser() parser} to use.
     * @return Document
     * @throws IOException on IO error
     */
    public static Document load(InputStream in, String charsetName, String baseUri, Parser parser) throws IOException {try{__CLR4_2_16e6ejpaexq9j.R.inc(235);
        __CLR4_2_16e6ejpaexq9j.R.inc(236);return parseInputStream(in, charsetName, baseUri, parser);
    }finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    /**
     * Writes the input stream to the output stream. Doesn't close them.
     * @param in input stream to read from
     * @param out output stream to write to
     * @throws IOException on IO error
     */
    static void crossStreams(final InputStream in, final OutputStream out) throws IOException {try{__CLR4_2_16e6ejpaexq9j.R.inc(237);
        __CLR4_2_16e6ejpaexq9j.R.inc(238);final byte[] buffer = new byte[bufferSize];
        __CLR4_2_16e6ejpaexq9j.R.inc(239);int len;
        __CLR4_2_16e6ejpaexq9j.R.inc(240);while ((len = in.read(buffer)) != -1) {{
            __CLR4_2_16e6ejpaexq9j.R.inc(243);out.write(buffer, 0, len);
        }
    }}finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    static Document parseInputStream(InputStream input, String charsetName, String baseUri, Parser parser) throws IOException  {try{__CLR4_2_16e6ejpaexq9j.R.inc(244);
        __CLR4_2_16e6ejpaexq9j.R.inc(245);if ((((input == null)&&(__CLR4_2_16e6ejpaexq9j.R.iget(246)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(247)==0&false))) // empty body
            {__CLR4_2_16e6ejpaexq9j.R.inc(248);return new Document(baseUri);
        }__CLR4_2_16e6ejpaexq9j.R.inc(249);input = ConstrainableInputStream.wrap(input, bufferSize, 0);

        __CLR4_2_16e6ejpaexq9j.R.inc(250);Document doc = null;
        __CLR4_2_16e6ejpaexq9j.R.inc(251);boolean fullyRead = false;

        // read the start of the stream and look for a BOM or meta charset
        __CLR4_2_16e6ejpaexq9j.R.inc(252);input.mark(bufferSize);
        __CLR4_2_16e6ejpaexq9j.R.inc(253);ByteBuffer firstBytes = readToByteBuffer(input, firstReadBufferSize - 1); // -1 because we read one more to see if completed. First read is < buffer size, so can't be invalid.
        __CLR4_2_16e6ejpaexq9j.R.inc(254);fullyRead = input.read() == -1;
        __CLR4_2_16e6ejpaexq9j.R.inc(255);input.reset();

        // look for BOM - overrides any other header or input
        __CLR4_2_16e6ejpaexq9j.R.inc(256);BomCharset bomCharset = detectCharsetFromBom(firstBytes);
        __CLR4_2_16e6ejpaexq9j.R.inc(257);if ((((bomCharset != null)&&(__CLR4_2_16e6ejpaexq9j.R.iget(258)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(259)==0&false)))
            {__CLR4_2_16e6ejpaexq9j.R.inc(260);charsetName = bomCharset.charset;

        }__CLR4_2_16e6ejpaexq9j.R.inc(261);if ((((charsetName == null)&&(__CLR4_2_16e6ejpaexq9j.R.iget(262)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(263)==0&false))) {{ // determine from meta. safe first parse as UTF-8
            __CLR4_2_16e6ejpaexq9j.R.inc(264);String docData = Charset.forName(defaultCharset).decode(firstBytes).toString();
            __CLR4_2_16e6ejpaexq9j.R.inc(265);doc = parser.parseInput(docData, baseUri);

            // look for <meta http-equiv="Content-Type" content="text/html;charset=gb2312"> or HTML5 <meta charset="gb2312">
            __CLR4_2_16e6ejpaexq9j.R.inc(266);Elements metaElements = doc.select("meta[http-equiv=content-type], meta[charset]");
            __CLR4_2_16e6ejpaexq9j.R.inc(267);String foundCharset = null; // if not found, will keep utf-8 as best attempt
            __CLR4_2_16e6ejpaexq9j.R.inc(268);for (Element meta : metaElements) {{
                __CLR4_2_16e6ejpaexq9j.R.inc(269);if ((((meta.hasAttr("http-equiv"))&&(__CLR4_2_16e6ejpaexq9j.R.iget(270)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(271)==0&false)))
                    {__CLR4_2_16e6ejpaexq9j.R.inc(272);foundCharset = getCharsetFromContentType(meta.attr("content"));
                }__CLR4_2_16e6ejpaexq9j.R.inc(273);if ((((foundCharset == null && meta.hasAttr("charset"))&&(__CLR4_2_16e6ejpaexq9j.R.iget(274)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(275)==0&false)))
                    {__CLR4_2_16e6ejpaexq9j.R.inc(276);foundCharset = meta.attr("charset");
                }__CLR4_2_16e6ejpaexq9j.R.inc(277);if ((((foundCharset != null)&&(__CLR4_2_16e6ejpaexq9j.R.iget(278)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(279)==0&false)))
                    {__CLR4_2_16e6ejpaexq9j.R.inc(280);break;
            }}

            // look for <?xml encoding='ISO-8859-1'?>
            }__CLR4_2_16e6ejpaexq9j.R.inc(281);if ((((foundCharset == null && doc.childNodeSize() > 0)&&(__CLR4_2_16e6ejpaexq9j.R.iget(282)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(283)==0&false))) {{
                __CLR4_2_16e6ejpaexq9j.R.inc(284);Node first = doc.childNode(0);
                __CLR4_2_16e6ejpaexq9j.R.inc(285);XmlDeclaration decl = null;
                __CLR4_2_16e6ejpaexq9j.R.inc(286);if ((((first instanceof XmlDeclaration)&&(__CLR4_2_16e6ejpaexq9j.R.iget(287)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(288)==0&false)))
                    {__CLR4_2_16e6ejpaexq9j.R.inc(289);decl = (XmlDeclaration) first;
                }else {__CLR4_2_16e6ejpaexq9j.R.inc(290);if ((((first instanceof Comment)&&(__CLR4_2_16e6ejpaexq9j.R.iget(291)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(292)==0&false))) {{
                    __CLR4_2_16e6ejpaexq9j.R.inc(293);Comment comment = (Comment) first;
                    __CLR4_2_16e6ejpaexq9j.R.inc(294);if ((((comment.isXmlDeclaration())&&(__CLR4_2_16e6ejpaexq9j.R.iget(295)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(296)==0&false)))
                        {__CLR4_2_16e6ejpaexq9j.R.inc(297);decl = comment.asXmlDeclaration();
                }}
                }}__CLR4_2_16e6ejpaexq9j.R.inc(298);if ((((decl != null)&&(__CLR4_2_16e6ejpaexq9j.R.iget(299)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(300)==0&false))) {{
                    __CLR4_2_16e6ejpaexq9j.R.inc(301);if ((((decl.name().equalsIgnoreCase("xml"))&&(__CLR4_2_16e6ejpaexq9j.R.iget(302)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(303)==0&false)))
                        {__CLR4_2_16e6ejpaexq9j.R.inc(304);foundCharset = decl.attr("encoding");
                }}
            }}
            }__CLR4_2_16e6ejpaexq9j.R.inc(305);foundCharset = validateCharset(foundCharset);
            __CLR4_2_16e6ejpaexq9j.R.inc(306);if ((((foundCharset != null && !foundCharset.equalsIgnoreCase(defaultCharset))&&(__CLR4_2_16e6ejpaexq9j.R.iget(307)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(308)==0&false))) {{ // need to re-decode. (case insensitive check here to match how validate works)
                __CLR4_2_16e6ejpaexq9j.R.inc(309);foundCharset = foundCharset.trim().replaceAll("[\"']", "");
                __CLR4_2_16e6ejpaexq9j.R.inc(310);charsetName = foundCharset;
                __CLR4_2_16e6ejpaexq9j.R.inc(311);doc = null;
            } }else {__CLR4_2_16e6ejpaexq9j.R.inc(312);if ((((!fullyRead)&&(__CLR4_2_16e6ejpaexq9j.R.iget(313)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(314)==0&false))) {{
                __CLR4_2_16e6ejpaexq9j.R.inc(315);doc = null;
            }
        }}} }else {{ // specified by content type header (or by user on file load)
            __CLR4_2_16e6ejpaexq9j.R.inc(316);Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        }__CLR4_2_16e6ejpaexq9j.R.inc(317);if ((((doc == null)&&(__CLR4_2_16e6ejpaexq9j.R.iget(318)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(319)==0&false))) {{
            __CLR4_2_16e6ejpaexq9j.R.inc(320);if ((((charsetName == null)&&(__CLR4_2_16e6ejpaexq9j.R.iget(321)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(322)==0&false)))
                {__CLR4_2_16e6ejpaexq9j.R.inc(323);charsetName = defaultCharset;
            }__CLR4_2_16e6ejpaexq9j.R.inc(324);BufferedReader reader = new BufferedReader(new InputStreamReader(input, charsetName), bufferSize);
            __CLR4_2_16e6ejpaexq9j.R.inc(325);if ((((bomCharset != null && bomCharset.offset)&&(__CLR4_2_16e6ejpaexq9j.R.iget(326)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(327)==0&false))) // creating the buffered reader ignores the input pos, so must skip here
                {__CLR4_2_16e6ejpaexq9j.R.inc(328);reader.skip(1);
            }__CLR4_2_16e6ejpaexq9j.R.inc(329);try {
                __CLR4_2_16e6ejpaexq9j.R.inc(330);doc = parser.parseInput(reader, baseUri);
            } catch (UncheckedIOException e) {
                // io exception when parsing (not seen before because reading the stream as we go)
                __CLR4_2_16e6ejpaexq9j.R.inc(331);throw e.ioException();
            }
            __CLR4_2_16e6ejpaexq9j.R.inc(332);Charset charset = Charset.forName(charsetName);
            __CLR4_2_16e6ejpaexq9j.R.inc(333);doc.outputSettings().charset(charset);
            __CLR4_2_16e6ejpaexq9j.R.inc(334);if ((((!charset.canEncode())&&(__CLR4_2_16e6ejpaexq9j.R.iget(335)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(336)==0&false))) {{
                // some charsets can read but not encode; switch to an encodable charset and update the meta el
                __CLR4_2_16e6ejpaexq9j.R.inc(337);doc.charset(Charset.forName(defaultCharset));
            }
        }}
        }__CLR4_2_16e6ejpaexq9j.R.inc(338);input.close();
        __CLR4_2_16e6ejpaexq9j.R.inc(339);return doc;
    }finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    /**
     * Read the input stream into a byte buffer. To deal with slow input streams, you may interrupt the thread this
     * method is executing on. The data read until being interrupted will be available.
     * @param inStream the input stream to read from
     * @param maxSize the maximum size in bytes to read from the stream. Set to 0 to be unlimited.
     * @return the filled byte buffer
     * @throws IOException if an exception occurs whilst reading from the input stream.
     */
    public static ByteBuffer readToByteBuffer(InputStream inStream, int maxSize) throws IOException {try{__CLR4_2_16e6ejpaexq9j.R.inc(340);
        __CLR4_2_16e6ejpaexq9j.R.inc(341);Validate.isTrue(maxSize >= 0, "maxSize must be 0 (unlimited) or larger");
        __CLR4_2_16e6ejpaexq9j.R.inc(342);final ConstrainableInputStream input = ConstrainableInputStream.wrap(inStream, bufferSize, maxSize);
        __CLR4_2_16e6ejpaexq9j.R.inc(343);return input.readToByteBuffer(maxSize);
    }finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    static ByteBuffer emptyByteBuffer() {try{__CLR4_2_16e6ejpaexq9j.R.inc(344);
        __CLR4_2_16e6ejpaexq9j.R.inc(345);return ByteBuffer.allocate(0);
    }finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    /**
     * Parse out a charset from a content type header. If the charset is not supported, returns null (so the default
     * will kick in.)
     * @param contentType e.g. "text/html; charset=EUC-JP"
     * @return "EUC-JP", or null if not found. Charset is trimmed and uppercased.
     */
    static String getCharsetFromContentType(String contentType) {try{__CLR4_2_16e6ejpaexq9j.R.inc(346);
        __CLR4_2_16e6ejpaexq9j.R.inc(347);if ((((contentType == null)&&(__CLR4_2_16e6ejpaexq9j.R.iget(348)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(349)==0&false))) {__CLR4_2_16e6ejpaexq9j.R.inc(350);return null;
        }__CLR4_2_16e6ejpaexq9j.R.inc(351);Matcher m = charsetPattern.matcher(contentType);
        __CLR4_2_16e6ejpaexq9j.R.inc(352);if ((((m.find())&&(__CLR4_2_16e6ejpaexq9j.R.iget(353)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(354)==0&false))) {{
            __CLR4_2_16e6ejpaexq9j.R.inc(355);String charset = m.group(1).trim();
            __CLR4_2_16e6ejpaexq9j.R.inc(356);charset = charset.replace("charset=", "");
            __CLR4_2_16e6ejpaexq9j.R.inc(357);return validateCharset(charset);
        }
        }__CLR4_2_16e6ejpaexq9j.R.inc(358);return null;
    }finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    private static String validateCharset(String cs) {try{__CLR4_2_16e6ejpaexq9j.R.inc(359);
        __CLR4_2_16e6ejpaexq9j.R.inc(360);if ((((cs == null || cs.length() == 0)&&(__CLR4_2_16e6ejpaexq9j.R.iget(361)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(362)==0&false))) {__CLR4_2_16e6ejpaexq9j.R.inc(363);return null;
        }__CLR4_2_16e6ejpaexq9j.R.inc(364);cs = cs.trim().replaceAll("[\"']", "");
        __CLR4_2_16e6ejpaexq9j.R.inc(365);try {
            __CLR4_2_16e6ejpaexq9j.R.inc(366);if ((((Charset.isSupported(cs))&&(__CLR4_2_16e6ejpaexq9j.R.iget(367)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(368)==0&false))) {__CLR4_2_16e6ejpaexq9j.R.inc(369);return cs;
            }__CLR4_2_16e6ejpaexq9j.R.inc(370);cs = cs.toUpperCase(Locale.ENGLISH);
            __CLR4_2_16e6ejpaexq9j.R.inc(371);if ((((Charset.isSupported(cs))&&(__CLR4_2_16e6ejpaexq9j.R.iget(372)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(373)==0&false))) {__CLR4_2_16e6ejpaexq9j.R.inc(374);return cs;
        }} catch (IllegalCharsetNameException e) {
            // if our this charset matching fails.... we just take the default
        }
        __CLR4_2_16e6ejpaexq9j.R.inc(375);return null;
    }finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    /**
     * Creates a random string, suitable for use as a mime boundary
     */
    static String mimeBoundary() {try{__CLR4_2_16e6ejpaexq9j.R.inc(376);
        __CLR4_2_16e6ejpaexq9j.R.inc(377);final StringBuilder mime = StringUtil.borrowBuilder();
        __CLR4_2_16e6ejpaexq9j.R.inc(378);final Random rand = new Random();
        __CLR4_2_16e6ejpaexq9j.R.inc(379);for (int i = 0; (((i < boundaryLength)&&(__CLR4_2_16e6ejpaexq9j.R.iget(380)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(381)==0&false)); i++) {{
            __CLR4_2_16e6ejpaexq9j.R.inc(382);mime.append(mimeBoundaryChars[rand.nextInt(mimeBoundaryChars.length)]);
        }
        }__CLR4_2_16e6ejpaexq9j.R.inc(383);return StringUtil.releaseBuilder(mime);
    }finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    private static BomCharset detectCharsetFromBom(final ByteBuffer byteData) {try{__CLR4_2_16e6ejpaexq9j.R.inc(384);
        __CLR4_2_16e6ejpaexq9j.R.inc(385);final Buffer buffer = byteData; // .mark and rewind used to return Buffer, now ByteBuffer, so cast for backward compat
        __CLR4_2_16e6ejpaexq9j.R.inc(386);buffer.mark();
        __CLR4_2_16e6ejpaexq9j.R.inc(387);byte[] bom = new byte[4];
        __CLR4_2_16e6ejpaexq9j.R.inc(388);if ((((byteData.remaining() >= bom.length)&&(__CLR4_2_16e6ejpaexq9j.R.iget(389)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(390)==0&false))) {{
            __CLR4_2_16e6ejpaexq9j.R.inc(391);byteData.get(bom);
            __CLR4_2_16e6ejpaexq9j.R.inc(392);buffer.rewind();
        }
        }__CLR4_2_16e6ejpaexq9j.R.inc(393);if ((((bom[0] == 0x00 && bom[1] == 0x00 && bom[2] == (byte) 0xFE && bom[3] == (byte) 0xFF || // BE
            bom[0] == (byte) 0xFF && bom[1] == (byte) 0xFE && bom[2] == 0x00 && bom[3] == 0x00)&&(__CLR4_2_16e6ejpaexq9j.R.iget(394)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(395)==0&false))) {{ // LE
            __CLR4_2_16e6ejpaexq9j.R.inc(396);return new BomCharset("UTF-32", false); // and I hope it's on your system
        } }else {__CLR4_2_16e6ejpaexq9j.R.inc(397);if ((((bom[0] == (byte) 0xFE && bom[1] == (byte) 0xFF || // BE
            bom[0] == (byte) 0xFF && bom[1] == (byte) 0xFE)&&(__CLR4_2_16e6ejpaexq9j.R.iget(398)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(399)==0&false))) {{
            __CLR4_2_16e6ejpaexq9j.R.inc(400);return new BomCharset("UTF-16", false); // in all Javas
        } }else {__CLR4_2_16e6ejpaexq9j.R.inc(401);if ((((bom[0] == (byte) 0xEF && bom[1] == (byte) 0xBB && bom[2] == (byte) 0xBF)&&(__CLR4_2_16e6ejpaexq9j.R.iget(402)!=0|true))||(__CLR4_2_16e6ejpaexq9j.R.iget(403)==0&false))) {{
            __CLR4_2_16e6ejpaexq9j.R.inc(404);return new BomCharset("UTF-8", true); // in all Javas
            // 16 and 32 decoders consume the BOM to determine be/le; utf-8 should be consumed here
        }
        }}}__CLR4_2_16e6ejpaexq9j.R.inc(405);return null;
    }finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}

    private static class BomCharset {
        private final String charset;
        private final boolean offset;

        public BomCharset(String charset, boolean offset) {try{__CLR4_2_16e6ejpaexq9j.R.inc(406);
            __CLR4_2_16e6ejpaexq9j.R.inc(407);this.charset = charset;
            __CLR4_2_16e6ejpaexq9j.R.inc(408);this.offset = offset;
        }finally{__CLR4_2_16e6ejpaexq9j.R.flushNeeded();}}
    }
}
