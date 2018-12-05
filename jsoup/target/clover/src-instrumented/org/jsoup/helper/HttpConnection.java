/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * Implementation of {@link Connection}.
 * @see org.jsoup.Jsoup#connect(String)
 */
public class HttpConnection implements Connection {public static class __CLR4_2_1bdbdjpaexqb6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543968426087L,8589935092L,1195,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String CONTENT_ENCODING = "Content-Encoding";
    /**
     * Many users would get caught by not setting a user-agent and therefore getting different responses on their desktop
     * vs in jsoup, which would otherwise default to {@code Java}. So by default, use a desktop UA.
     */
    public static final String DEFAULT_UA =
        "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
    private static final String USER_AGENT = "User-Agent";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String MULTIPART_FORM_DATA = "multipart/form-data";
    private static final String FORM_URL_ENCODED = "application/x-www-form-urlencoded";
    private static final int HTTP_TEMP_REDIR = 307; // http/1.1 temporary redirect, not in Java's set.
    private static final String DefaultUploadType = "application/octet-stream";

    public static Connection connect(String url) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(409);
        __CLR4_2_1bdbdjpaexqb6.R.inc(410);Connection con = new HttpConnection();
        __CLR4_2_1bdbdjpaexqb6.R.inc(411);con.url(url);
        __CLR4_2_1bdbdjpaexqb6.R.inc(412);return con;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public static Connection connect(URL url) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(413);
        __CLR4_2_1bdbdjpaexqb6.R.inc(414);Connection con = new HttpConnection();
        __CLR4_2_1bdbdjpaexqb6.R.inc(415);con.url(url);
        __CLR4_2_1bdbdjpaexqb6.R.inc(416);return con;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public HttpConnection() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(417);
        __CLR4_2_1bdbdjpaexqb6.R.inc(418);req = new Request();
        __CLR4_2_1bdbdjpaexqb6.R.inc(419);res = new Response();
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    /**
     * Encodes the input URL into a safe ASCII URL string
     * @param url unescaped URL
     * @return escaped URL
     */
	private static String encodeUrl(String url) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(420);
        __CLR4_2_1bdbdjpaexqb6.R.inc(421);try {
            __CLR4_2_1bdbdjpaexqb6.R.inc(422);URL u = new URL(url);
            __CLR4_2_1bdbdjpaexqb6.R.inc(423);return encodeUrl(u).toExternalForm();
        } catch (Exception e) {
            __CLR4_2_1bdbdjpaexqb6.R.inc(424);return url;
        }
	}finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    static URL encodeUrl(URL u) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(425);
        __CLR4_2_1bdbdjpaexqb6.R.inc(426);try {
            //  odd way to encode urls, but it works!
            __CLR4_2_1bdbdjpaexqb6.R.inc(427);String urlS = u.toExternalForm(); // URL external form may have spaces which is illegal in new URL() (odd asymmetry)
            __CLR4_2_1bdbdjpaexqb6.R.inc(428);urlS = urlS.replaceAll(" ", "%20");
            __CLR4_2_1bdbdjpaexqb6.R.inc(429);final URI uri = new URI(urlS);
            __CLR4_2_1bdbdjpaexqb6.R.inc(430);return new URL(uri.toASCIIString());
        } catch (Exception e) {
            __CLR4_2_1bdbdjpaexqb6.R.inc(431);return u;
        }
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    private static String encodeMimeName(String val) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(432);
        __CLR4_2_1bdbdjpaexqb6.R.inc(433);if ((((val == null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(434)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(435)==0&false)))
            {__CLR4_2_1bdbdjpaexqb6.R.inc(436);return null;
        }__CLR4_2_1bdbdjpaexqb6.R.inc(437);return val.replaceAll("\"", "%22");
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    private Connection.Request req;
    private Connection.Response res;

    public Connection url(URL url) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(438);
        __CLR4_2_1bdbdjpaexqb6.R.inc(439);req.url(url);
        __CLR4_2_1bdbdjpaexqb6.R.inc(440);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection url(String url) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(441);
        __CLR4_2_1bdbdjpaexqb6.R.inc(442);Validate.notEmpty(url, "Must supply a valid URL");
        __CLR4_2_1bdbdjpaexqb6.R.inc(443);try {
            __CLR4_2_1bdbdjpaexqb6.R.inc(444);req.url(new URL(encodeUrl(url)));
        } catch (MalformedURLException e) {
            __CLR4_2_1bdbdjpaexqb6.R.inc(445);throw new IllegalArgumentException("Malformed URL: " + url, e);
        }
        __CLR4_2_1bdbdjpaexqb6.R.inc(446);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection proxy(Proxy proxy) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(447);
        __CLR4_2_1bdbdjpaexqb6.R.inc(448);req.proxy(proxy);
        __CLR4_2_1bdbdjpaexqb6.R.inc(449);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection proxy(String host, int port) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(450);
        __CLR4_2_1bdbdjpaexqb6.R.inc(451);req.proxy(host, port);
        __CLR4_2_1bdbdjpaexqb6.R.inc(452);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection userAgent(String userAgent) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(453);
        __CLR4_2_1bdbdjpaexqb6.R.inc(454);Validate.notNull(userAgent, "User agent must not be null");
        __CLR4_2_1bdbdjpaexqb6.R.inc(455);req.header(USER_AGENT, userAgent);
        __CLR4_2_1bdbdjpaexqb6.R.inc(456);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection timeout(int millis) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(457);
        __CLR4_2_1bdbdjpaexqb6.R.inc(458);req.timeout(millis);
        __CLR4_2_1bdbdjpaexqb6.R.inc(459);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection maxBodySize(int bytes) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(460);
        __CLR4_2_1bdbdjpaexqb6.R.inc(461);req.maxBodySize(bytes);
        __CLR4_2_1bdbdjpaexqb6.R.inc(462);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection followRedirects(boolean followRedirects) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(463);
        __CLR4_2_1bdbdjpaexqb6.R.inc(464);req.followRedirects(followRedirects);
        __CLR4_2_1bdbdjpaexqb6.R.inc(465);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection referrer(String referrer) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(466);
        __CLR4_2_1bdbdjpaexqb6.R.inc(467);Validate.notNull(referrer, "Referrer must not be null");
        __CLR4_2_1bdbdjpaexqb6.R.inc(468);req.header("Referer", referrer);
        __CLR4_2_1bdbdjpaexqb6.R.inc(469);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection method(Method method) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(470);
        __CLR4_2_1bdbdjpaexqb6.R.inc(471);req.method(method);
        __CLR4_2_1bdbdjpaexqb6.R.inc(472);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection ignoreHttpErrors(boolean ignoreHttpErrors) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(473);
		__CLR4_2_1bdbdjpaexqb6.R.inc(474);req.ignoreHttpErrors(ignoreHttpErrors);
		__CLR4_2_1bdbdjpaexqb6.R.inc(475);return this;
	}finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection ignoreContentType(boolean ignoreContentType) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(476);
        __CLR4_2_1bdbdjpaexqb6.R.inc(477);req.ignoreContentType(ignoreContentType);
        __CLR4_2_1bdbdjpaexqb6.R.inc(478);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}


    public Connection data(String key, String value) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(479);
        __CLR4_2_1bdbdjpaexqb6.R.inc(480);req.data(KeyVal.create(key, value));
        __CLR4_2_1bdbdjpaexqb6.R.inc(481);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection sslSocketFactory(SSLSocketFactory sslSocketFactory) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(482);
	    __CLR4_2_1bdbdjpaexqb6.R.inc(483);req.sslSocketFactory(sslSocketFactory);
	    __CLR4_2_1bdbdjpaexqb6.R.inc(484);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection data(String key, String filename, InputStream inputStream) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(485);
        __CLR4_2_1bdbdjpaexqb6.R.inc(486);req.data(KeyVal.create(key, filename, inputStream));
        __CLR4_2_1bdbdjpaexqb6.R.inc(487);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    @Override
    public Connection data(String key, String filename, InputStream inputStream, String contentType) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(488);
        __CLR4_2_1bdbdjpaexqb6.R.inc(489);req.data(KeyVal.create(key, filename, inputStream).contentType(contentType));
        __CLR4_2_1bdbdjpaexqb6.R.inc(490);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection data(Map<String, String> data) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(491);
        __CLR4_2_1bdbdjpaexqb6.R.inc(492);Validate.notNull(data, "Data map must not be null");
        __CLR4_2_1bdbdjpaexqb6.R.inc(493);for (Map.Entry<String, String> entry : data.entrySet()) {{
            __CLR4_2_1bdbdjpaexqb6.R.inc(494);req.data(KeyVal.create(entry.getKey(), entry.getValue()));
        }
        }__CLR4_2_1bdbdjpaexqb6.R.inc(495);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection data(String... keyvals) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(496);
        __CLR4_2_1bdbdjpaexqb6.R.inc(497);Validate.notNull(keyvals, "Data key value pairs must not be null");
        __CLR4_2_1bdbdjpaexqb6.R.inc(498);Validate.isTrue(keyvals.length %2 == 0, "Must supply an even number of key value pairs");
        __CLR4_2_1bdbdjpaexqb6.R.inc(499);for (int i = 0; (((i < keyvals.length)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(500)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(501)==0&false)); i += 2) {{
            __CLR4_2_1bdbdjpaexqb6.R.inc(502);String key = keyvals[i];
            __CLR4_2_1bdbdjpaexqb6.R.inc(503);String value = keyvals[i+1];
            __CLR4_2_1bdbdjpaexqb6.R.inc(504);Validate.notEmpty(key, "Data key must not be empty");
            __CLR4_2_1bdbdjpaexqb6.R.inc(505);Validate.notNull(value, "Data value must not be null");
            __CLR4_2_1bdbdjpaexqb6.R.inc(506);req.data(KeyVal.create(key, value));
        }
        }__CLR4_2_1bdbdjpaexqb6.R.inc(507);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection data(Collection<Connection.KeyVal> data) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(508);
        __CLR4_2_1bdbdjpaexqb6.R.inc(509);Validate.notNull(data, "Data collection must not be null");
        __CLR4_2_1bdbdjpaexqb6.R.inc(510);for (Connection.KeyVal entry: data) {{
            __CLR4_2_1bdbdjpaexqb6.R.inc(511);req.data(entry);
        }
        }__CLR4_2_1bdbdjpaexqb6.R.inc(512);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection.KeyVal data(String key) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(513);
        __CLR4_2_1bdbdjpaexqb6.R.inc(514);Validate.notEmpty(key, "Data key must not be empty");
        __CLR4_2_1bdbdjpaexqb6.R.inc(515);for (Connection.KeyVal keyVal : request().data()) {{
            __CLR4_2_1bdbdjpaexqb6.R.inc(516);if ((((keyVal.key().equals(key))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(517)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(518)==0&false)))
                {__CLR4_2_1bdbdjpaexqb6.R.inc(519);return keyVal;
        }}
        }__CLR4_2_1bdbdjpaexqb6.R.inc(520);return null;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection requestBody(String body) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(521);
        __CLR4_2_1bdbdjpaexqb6.R.inc(522);req.requestBody(body);
        __CLR4_2_1bdbdjpaexqb6.R.inc(523);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection header(String name, String value) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(524);
        __CLR4_2_1bdbdjpaexqb6.R.inc(525);req.header(name, value);
        __CLR4_2_1bdbdjpaexqb6.R.inc(526);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection headers(Map<String,String> headers) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(527);
        __CLR4_2_1bdbdjpaexqb6.R.inc(528);Validate.notNull(headers, "Header map must not be null");
        __CLR4_2_1bdbdjpaexqb6.R.inc(529);for (Map.Entry<String,String> entry : headers.entrySet()) {{
            __CLR4_2_1bdbdjpaexqb6.R.inc(530);req.header(entry.getKey(),entry.getValue());
        }
        }__CLR4_2_1bdbdjpaexqb6.R.inc(531);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection cookie(String name, String value) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(532);
        __CLR4_2_1bdbdjpaexqb6.R.inc(533);req.cookie(name, value);
        __CLR4_2_1bdbdjpaexqb6.R.inc(534);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection cookies(Map<String, String> cookies) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(535);
        __CLR4_2_1bdbdjpaexqb6.R.inc(536);Validate.notNull(cookies, "Cookie map must not be null");
        __CLR4_2_1bdbdjpaexqb6.R.inc(537);for (Map.Entry<String, String> entry : cookies.entrySet()) {{
            __CLR4_2_1bdbdjpaexqb6.R.inc(538);req.cookie(entry.getKey(), entry.getValue());
        }
        }__CLR4_2_1bdbdjpaexqb6.R.inc(539);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection parser(Parser parser) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(540);
        __CLR4_2_1bdbdjpaexqb6.R.inc(541);req.parser(parser);
        __CLR4_2_1bdbdjpaexqb6.R.inc(542);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Document get() throws IOException {try{__CLR4_2_1bdbdjpaexqb6.R.inc(543);
        __CLR4_2_1bdbdjpaexqb6.R.inc(544);req.method(Method.GET);
        __CLR4_2_1bdbdjpaexqb6.R.inc(545);execute();
        __CLR4_2_1bdbdjpaexqb6.R.inc(546);return res.parse();
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Document post() throws IOException {try{__CLR4_2_1bdbdjpaexqb6.R.inc(547);
        __CLR4_2_1bdbdjpaexqb6.R.inc(548);req.method(Method.POST);
        __CLR4_2_1bdbdjpaexqb6.R.inc(549);execute();
        __CLR4_2_1bdbdjpaexqb6.R.inc(550);return res.parse();
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection.Response execute() throws IOException {try{__CLR4_2_1bdbdjpaexqb6.R.inc(551);
        __CLR4_2_1bdbdjpaexqb6.R.inc(552);res = Response.execute(req);
        __CLR4_2_1bdbdjpaexqb6.R.inc(553);return res;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection.Request request() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(554);
        __CLR4_2_1bdbdjpaexqb6.R.inc(555);return req;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection request(Connection.Request request) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(556);
        __CLR4_2_1bdbdjpaexqb6.R.inc(557);req = request;
        __CLR4_2_1bdbdjpaexqb6.R.inc(558);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection.Response response() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(559);
        __CLR4_2_1bdbdjpaexqb6.R.inc(560);return res;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection response(Connection.Response response) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(561);
        __CLR4_2_1bdbdjpaexqb6.R.inc(562);res = response;
        __CLR4_2_1bdbdjpaexqb6.R.inc(563);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public Connection postDataCharset(String charset) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(564);
        __CLR4_2_1bdbdjpaexqb6.R.inc(565);req.postDataCharset(charset);
        __CLR4_2_1bdbdjpaexqb6.R.inc(566);return this;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    @SuppressWarnings({"unchecked"})
    private static abstract class Base<T extends Connection.Base> implements Connection.Base<T> {
        URL url;
        Method method;
        Map<String, List<String>> headers;
        Map<String, String> cookies;

        private Base() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(567);
            __CLR4_2_1bdbdjpaexqb6.R.inc(568);headers = new LinkedHashMap<>();
            __CLR4_2_1bdbdjpaexqb6.R.inc(569);cookies = new LinkedHashMap<>();
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public URL url() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(570);
            __CLR4_2_1bdbdjpaexqb6.R.inc(571);return url;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public T url(URL url) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(572);
            __CLR4_2_1bdbdjpaexqb6.R.inc(573);Validate.notNull(url, "URL must not be null");
            __CLR4_2_1bdbdjpaexqb6.R.inc(574);this.url = url;
            __CLR4_2_1bdbdjpaexqb6.R.inc(575);return (T) this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Method method() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(576);
            __CLR4_2_1bdbdjpaexqb6.R.inc(577);return method;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public T method(Method method) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(578);
            __CLR4_2_1bdbdjpaexqb6.R.inc(579);Validate.notNull(method, "Method must not be null");
            __CLR4_2_1bdbdjpaexqb6.R.inc(580);this.method = method;
            __CLR4_2_1bdbdjpaexqb6.R.inc(581);return (T) this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public String header(String name) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(582);
            __CLR4_2_1bdbdjpaexqb6.R.inc(583);Validate.notNull(name, "Header name must not be null");
            __CLR4_2_1bdbdjpaexqb6.R.inc(584);List<String> vals = getHeadersCaseInsensitive(name);
            __CLR4_2_1bdbdjpaexqb6.R.inc(585);if ((((vals.size() > 0)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(586)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(587)==0&false))) {{
                // https://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2
                __CLR4_2_1bdbdjpaexqb6.R.inc(588);return StringUtil.join(vals, ", ");
            }

            }__CLR4_2_1bdbdjpaexqb6.R.inc(589);return null;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        @Override
        public T addHeader(String name, String value) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(590);
            __CLR4_2_1bdbdjpaexqb6.R.inc(591);Validate.notEmpty(name);
            __CLR4_2_1bdbdjpaexqb6.R.inc(592);value = (((value == null )&&(__CLR4_2_1bdbdjpaexqb6.R.iget(593)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(594)==0&false))? "" : value;

            __CLR4_2_1bdbdjpaexqb6.R.inc(595);List<String> values = headers(name);
            __CLR4_2_1bdbdjpaexqb6.R.inc(596);if ((((values.isEmpty())&&(__CLR4_2_1bdbdjpaexqb6.R.iget(597)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(598)==0&false))) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(599);values = new ArrayList<>();
                __CLR4_2_1bdbdjpaexqb6.R.inc(600);headers.put(name, values);
            }
            }__CLR4_2_1bdbdjpaexqb6.R.inc(601);values.add(fixHeaderEncoding(value));

            __CLR4_2_1bdbdjpaexqb6.R.inc(602);return (T) this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        @Override
        public List<String> headers(String name) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(603);
            __CLR4_2_1bdbdjpaexqb6.R.inc(604);Validate.notEmpty(name);
            __CLR4_2_1bdbdjpaexqb6.R.inc(605);return getHeadersCaseInsensitive(name);
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        private static String fixHeaderEncoding(String val) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(606);
            __CLR4_2_1bdbdjpaexqb6.R.inc(607);try {
                __CLR4_2_1bdbdjpaexqb6.R.inc(608);byte[] bytes = val.getBytes("ISO-8859-1");
                __CLR4_2_1bdbdjpaexqb6.R.inc(609);if ((((!looksLikeUtf8(bytes))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(610)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(611)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(612);return val;
                }__CLR4_2_1bdbdjpaexqb6.R.inc(613);return new String(bytes, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                // shouldn't happen as these both always exist
                __CLR4_2_1bdbdjpaexqb6.R.inc(614);return val;
            }
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        private static boolean looksLikeUtf8(byte[] input) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(615);
            __CLR4_2_1bdbdjpaexqb6.R.inc(616);int i = 0;
            // BOM:
            __CLR4_2_1bdbdjpaexqb6.R.inc(617);if ((((input.length >= 3 && (input[0] & 0xFF) == 0xEF
                && (input[1] & 0xFF) == 0xBB & (input[2] & 0xFF) == 0xBF)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(618)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(619)==0&false))) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(620);i = 3;
            }

            }__CLR4_2_1bdbdjpaexqb6.R.inc(621);int end;
            __CLR4_2_1bdbdjpaexqb6.R.inc(622);for (int j = input.length; (((i < j)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(623)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(624)==0&false)); ++i) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(625);int o = input[i];
                __CLR4_2_1bdbdjpaexqb6.R.inc(626);if (((((o & 0x80) == 0)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(627)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(628)==0&false))) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(629);continue; // ASCII
                }

                // UTF-8 leading:
                }__CLR4_2_1bdbdjpaexqb6.R.inc(630);if (((((o & 0xE0) == 0xC0)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(631)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(632)==0&false))) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(633);end = i + 1;
                } }else {__CLR4_2_1bdbdjpaexqb6.R.inc(634);if (((((o & 0xF0) == 0xE0)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(635)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(636)==0&false))) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(637);end = i + 2;
                } }else {__CLR4_2_1bdbdjpaexqb6.R.inc(638);if (((((o & 0xF8) == 0xF0)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(639)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(640)==0&false))) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(641);end = i + 3;
                } }else {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(642);return false;
                }

                }}}__CLR4_2_1bdbdjpaexqb6.R.inc(643);while ((((i < end)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(644)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(645)==0&false))) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(646);i++;
                    __CLR4_2_1bdbdjpaexqb6.R.inc(647);o = input[i];
                    __CLR4_2_1bdbdjpaexqb6.R.inc(648);if (((((o & 0xC0) != 0x80)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(649)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(650)==0&false))) {{
                        __CLR4_2_1bdbdjpaexqb6.R.inc(651);return false;
                    }
                }}
            }}
            }__CLR4_2_1bdbdjpaexqb6.R.inc(652);return true;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public T header(String name, String value) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(653);
            __CLR4_2_1bdbdjpaexqb6.R.inc(654);Validate.notEmpty(name, "Header name must not be empty");
            __CLR4_2_1bdbdjpaexqb6.R.inc(655);removeHeader(name); // ensures we don't get an "accept-encoding" and a "Accept-Encoding"
            __CLR4_2_1bdbdjpaexqb6.R.inc(656);addHeader(name, value);
            __CLR4_2_1bdbdjpaexqb6.R.inc(657);return (T) this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public boolean hasHeader(String name) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(658);
            __CLR4_2_1bdbdjpaexqb6.R.inc(659);Validate.notEmpty(name, "Header name must not be empty");
            __CLR4_2_1bdbdjpaexqb6.R.inc(660);return getHeadersCaseInsensitive(name).size() != 0;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        /**
         * Test if the request has a header with this value (case insensitive).
         */
        public boolean hasHeaderWithValue(String name, String value) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(661);
            __CLR4_2_1bdbdjpaexqb6.R.inc(662);Validate.notEmpty(name);
            __CLR4_2_1bdbdjpaexqb6.R.inc(663);Validate.notEmpty(value);
            __CLR4_2_1bdbdjpaexqb6.R.inc(664);List<String> values = headers(name);
            __CLR4_2_1bdbdjpaexqb6.R.inc(665);for (String candidate : values) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(666);if ((((value.equalsIgnoreCase(candidate))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(667)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(668)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(669);return true;
            }}
            }__CLR4_2_1bdbdjpaexqb6.R.inc(670);return false;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public T removeHeader(String name) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(671);
            __CLR4_2_1bdbdjpaexqb6.R.inc(672);Validate.notEmpty(name, "Header name must not be empty");
            __CLR4_2_1bdbdjpaexqb6.R.inc(673);Map.Entry<String, List<String>> entry = scanHeaders(name); // remove is case insensitive too
            __CLR4_2_1bdbdjpaexqb6.R.inc(674);if ((((entry != null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(675)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(676)==0&false)))
                {__CLR4_2_1bdbdjpaexqb6.R.inc(677);headers.remove(entry.getKey()); // ensures correct case
            }__CLR4_2_1bdbdjpaexqb6.R.inc(678);return (T) this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Map<String, String> headers() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(679);
            __CLR4_2_1bdbdjpaexqb6.R.inc(680);LinkedHashMap<String, String> map = new LinkedHashMap<>(headers.size());
            __CLR4_2_1bdbdjpaexqb6.R.inc(681);for (Map.Entry<String, List<String>> entry : headers.entrySet()) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(682);String header = entry.getKey();
                __CLR4_2_1bdbdjpaexqb6.R.inc(683);List<String> values = entry.getValue();
                __CLR4_2_1bdbdjpaexqb6.R.inc(684);if ((((values.size() > 0)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(685)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(686)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(687);map.put(header, values.get(0));
            }}
            }__CLR4_2_1bdbdjpaexqb6.R.inc(688);return map;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        @Override
        public Map<String, List<String>> multiHeaders() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(689);
            __CLR4_2_1bdbdjpaexqb6.R.inc(690);return headers;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        private List<String> getHeadersCaseInsensitive(String name) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(691);
            __CLR4_2_1bdbdjpaexqb6.R.inc(692);Validate.notNull(name);

            __CLR4_2_1bdbdjpaexqb6.R.inc(693);for (Map.Entry<String, List<String>> entry : headers.entrySet()) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(694);if ((((name.equalsIgnoreCase(entry.getKey()))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(695)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(696)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(697);return entry.getValue();
            }}

            }__CLR4_2_1bdbdjpaexqb6.R.inc(698);return Collections.emptyList();
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        private Map.Entry<String, List<String>> scanHeaders(String name) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(699);
            __CLR4_2_1bdbdjpaexqb6.R.inc(700);String lc = lowerCase(name);
            __CLR4_2_1bdbdjpaexqb6.R.inc(701);for (Map.Entry<String, List<String>> entry : headers.entrySet()) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(702);if ((((lowerCase(entry.getKey()).equals(lc))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(703)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(704)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(705);return entry;
            }}
            }__CLR4_2_1bdbdjpaexqb6.R.inc(706);return null;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public String cookie(String name) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(707);
            __CLR4_2_1bdbdjpaexqb6.R.inc(708);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_2_1bdbdjpaexqb6.R.inc(709);return cookies.get(name);
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public T cookie(String name, String value) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(710);
            __CLR4_2_1bdbdjpaexqb6.R.inc(711);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_2_1bdbdjpaexqb6.R.inc(712);Validate.notNull(value, "Cookie value must not be null");
            __CLR4_2_1bdbdjpaexqb6.R.inc(713);cookies.put(name, value);
            __CLR4_2_1bdbdjpaexqb6.R.inc(714);return (T) this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public boolean hasCookie(String name) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(715);
            __CLR4_2_1bdbdjpaexqb6.R.inc(716);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_2_1bdbdjpaexqb6.R.inc(717);return cookies.containsKey(name);
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public T removeCookie(String name) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(718);
            __CLR4_2_1bdbdjpaexqb6.R.inc(719);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_2_1bdbdjpaexqb6.R.inc(720);cookies.remove(name);
            __CLR4_2_1bdbdjpaexqb6.R.inc(721);return (T) this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Map<String, String> cookies() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(722);
            __CLR4_2_1bdbdjpaexqb6.R.inc(723);return cookies;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}
    }

    public static class Request extends HttpConnection.Base<Connection.Request> implements Connection.Request {
        private Proxy proxy; // nullable
        private int timeoutMilliseconds;
        private int maxBodySizeBytes;
        private boolean followRedirects;
        private Collection<Connection.KeyVal> data;
        private String body = null;
        private boolean ignoreHttpErrors = false;
        private boolean ignoreContentType = false;
        private Parser parser;
        private boolean parserDefined = false; // called parser(...) vs initialized in ctor
        private String postDataCharset = DataUtil.defaultCharset;
        private SSLSocketFactory sslSocketFactory;

        Request() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(724);
            __CLR4_2_1bdbdjpaexqb6.R.inc(725);timeoutMilliseconds = 30000; // 30 seconds
            __CLR4_2_1bdbdjpaexqb6.R.inc(726);maxBodySizeBytes = 1024 * 1024; // 1MB
            __CLR4_2_1bdbdjpaexqb6.R.inc(727);followRedirects = true;
            __CLR4_2_1bdbdjpaexqb6.R.inc(728);data = new ArrayList<>();
            __CLR4_2_1bdbdjpaexqb6.R.inc(729);method = Method.GET;
            __CLR4_2_1bdbdjpaexqb6.R.inc(730);addHeader("Accept-Encoding", "gzip");
            __CLR4_2_1bdbdjpaexqb6.R.inc(731);addHeader(USER_AGENT, DEFAULT_UA);
            __CLR4_2_1bdbdjpaexqb6.R.inc(732);parser = Parser.htmlParser();
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Proxy proxy() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(733);
            __CLR4_2_1bdbdjpaexqb6.R.inc(734);return proxy;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Request proxy(Proxy proxy) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(735);
            __CLR4_2_1bdbdjpaexqb6.R.inc(736);this.proxy = proxy;
            __CLR4_2_1bdbdjpaexqb6.R.inc(737);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Request proxy(String host, int port) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(738);
            __CLR4_2_1bdbdjpaexqb6.R.inc(739);this.proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(host, port));
            __CLR4_2_1bdbdjpaexqb6.R.inc(740);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public int timeout() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(741);
            __CLR4_2_1bdbdjpaexqb6.R.inc(742);return timeoutMilliseconds;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Request timeout(int millis) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(743);
            __CLR4_2_1bdbdjpaexqb6.R.inc(744);Validate.isTrue(millis >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            __CLR4_2_1bdbdjpaexqb6.R.inc(745);timeoutMilliseconds = millis;
            __CLR4_2_1bdbdjpaexqb6.R.inc(746);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public int maxBodySize() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(747);
            __CLR4_2_1bdbdjpaexqb6.R.inc(748);return maxBodySizeBytes;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Connection.Request maxBodySize(int bytes) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(749);
            __CLR4_2_1bdbdjpaexqb6.R.inc(750);Validate.isTrue(bytes >= 0, "maxSize must be 0 (unlimited) or larger");
            __CLR4_2_1bdbdjpaexqb6.R.inc(751);maxBodySizeBytes = bytes;
            __CLR4_2_1bdbdjpaexqb6.R.inc(752);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public boolean followRedirects() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(753);
            __CLR4_2_1bdbdjpaexqb6.R.inc(754);return followRedirects;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Connection.Request followRedirects(boolean followRedirects) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(755);
            __CLR4_2_1bdbdjpaexqb6.R.inc(756);this.followRedirects = followRedirects;
            __CLR4_2_1bdbdjpaexqb6.R.inc(757);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public boolean ignoreHttpErrors() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(758);
            __CLR4_2_1bdbdjpaexqb6.R.inc(759);return ignoreHttpErrors;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public SSLSocketFactory sslSocketFactory() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(760);
            __CLR4_2_1bdbdjpaexqb6.R.inc(761);return sslSocketFactory;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public void sslSocketFactory(SSLSocketFactory sslSocketFactory) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(762);
            __CLR4_2_1bdbdjpaexqb6.R.inc(763);this.sslSocketFactory = sslSocketFactory;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Connection.Request ignoreHttpErrors(boolean ignoreHttpErrors) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(764);
            __CLR4_2_1bdbdjpaexqb6.R.inc(765);this.ignoreHttpErrors = ignoreHttpErrors;
            __CLR4_2_1bdbdjpaexqb6.R.inc(766);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public boolean ignoreContentType() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(767);
            __CLR4_2_1bdbdjpaexqb6.R.inc(768);return ignoreContentType;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Connection.Request ignoreContentType(boolean ignoreContentType) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(769);
            __CLR4_2_1bdbdjpaexqb6.R.inc(770);this.ignoreContentType = ignoreContentType;
            __CLR4_2_1bdbdjpaexqb6.R.inc(771);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Request data(Connection.KeyVal keyval) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(772);
            __CLR4_2_1bdbdjpaexqb6.R.inc(773);Validate.notNull(keyval, "Key val must not be null");
            __CLR4_2_1bdbdjpaexqb6.R.inc(774);data.add(keyval);
            __CLR4_2_1bdbdjpaexqb6.R.inc(775);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Collection<Connection.KeyVal> data() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(776);
            __CLR4_2_1bdbdjpaexqb6.R.inc(777);return data;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Connection.Request requestBody(String body) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(778);
            __CLR4_2_1bdbdjpaexqb6.R.inc(779);this.body = body;
            __CLR4_2_1bdbdjpaexqb6.R.inc(780);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public String requestBody() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(781);
            __CLR4_2_1bdbdjpaexqb6.R.inc(782);return body;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Request parser(Parser parser) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(783);
            __CLR4_2_1bdbdjpaexqb6.R.inc(784);this.parser = parser;
            __CLR4_2_1bdbdjpaexqb6.R.inc(785);parserDefined = true;
            __CLR4_2_1bdbdjpaexqb6.R.inc(786);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Parser parser() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(787);
            __CLR4_2_1bdbdjpaexqb6.R.inc(788);return parser;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Connection.Request postDataCharset(String charset) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(789);
            __CLR4_2_1bdbdjpaexqb6.R.inc(790);Validate.notNull(charset, "Charset must not be null");
            __CLR4_2_1bdbdjpaexqb6.R.inc(791);if ((((!Charset.isSupported(charset))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(792)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(793)==0&false))) {__CLR4_2_1bdbdjpaexqb6.R.inc(794);throw new IllegalCharsetNameException(charset);
            }__CLR4_2_1bdbdjpaexqb6.R.inc(795);this.postDataCharset = charset;
            __CLR4_2_1bdbdjpaexqb6.R.inc(796);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public String postDataCharset() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(797);
            __CLR4_2_1bdbdjpaexqb6.R.inc(798);return postDataCharset;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}
    }

    public static class Response extends HttpConnection.Base<Connection.Response> implements Connection.Response {
        private static final int MAX_REDIRECTS = 20;
        private static final String LOCATION = "Location";
        private int statusCode;
        private String statusMessage;
        private ByteBuffer byteData;
        private InputStream bodyStream;
        private HttpURLConnection conn;
        private String charset;
        private String contentType;
        private boolean executed = false;
        private boolean inputStreamRead = false;
        private int numRedirects = 0;
        private Connection.Request req;

        /*
         * Matches XML content types (like text/xml, application/xhtml+xml;charset=UTF8, etc)
         */
        private static final Pattern xmlContentTypeRxp = Pattern.compile("(application|text)/\\w*\\+?xml.*");

        Response() {
            super();__CLR4_2_1bdbdjpaexqb6.R.inc(800);try{__CLR4_2_1bdbdjpaexqb6.R.inc(799);
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        private Response(Response previousResponse) throws IOException {
            super();__CLR4_2_1bdbdjpaexqb6.R.inc(802);try{__CLR4_2_1bdbdjpaexqb6.R.inc(801);
            __CLR4_2_1bdbdjpaexqb6.R.inc(803);if ((((previousResponse != null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(804)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(805)==0&false))) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(806);numRedirects = previousResponse.numRedirects + 1;
                __CLR4_2_1bdbdjpaexqb6.R.inc(807);if ((((numRedirects >= MAX_REDIRECTS)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(808)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(809)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(810);throw new IOException(String.format("Too many redirects occurred trying to load URL %s", previousResponse.url()));
            }}
        }}finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        static Response execute(Connection.Request req) throws IOException {try{__CLR4_2_1bdbdjpaexqb6.R.inc(811);
            __CLR4_2_1bdbdjpaexqb6.R.inc(812);return execute(req, null);
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        static Response execute(Connection.Request req, Response previousResponse) throws IOException {try{__CLR4_2_1bdbdjpaexqb6.R.inc(813);
            __CLR4_2_1bdbdjpaexqb6.R.inc(814);Validate.notNull(req, "Request must not be null");
            __CLR4_2_1bdbdjpaexqb6.R.inc(815);Validate.notNull(req.url(), "URL must be specified to connect");
            __CLR4_2_1bdbdjpaexqb6.R.inc(816);String protocol = req.url().getProtocol();
            __CLR4_2_1bdbdjpaexqb6.R.inc(817);if ((((!protocol.equals("http") && !protocol.equals("https"))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(818)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(819)==0&false)))
                {__CLR4_2_1bdbdjpaexqb6.R.inc(820);throw new MalformedURLException("Only http & https protocols supported");
            }__CLR4_2_1bdbdjpaexqb6.R.inc(821);final boolean methodHasBody = req.method().hasBody();
            __CLR4_2_1bdbdjpaexqb6.R.inc(822);final boolean hasRequestBody = req.requestBody() != null;
            __CLR4_2_1bdbdjpaexqb6.R.inc(823);if ((((!methodHasBody)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(824)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(825)==0&false)))
                {__CLR4_2_1bdbdjpaexqb6.R.inc(826);Validate.isFalse(hasRequestBody, "Cannot set a request body for HTTP method " + req.method());

            // set up the request for execution
            }__CLR4_2_1bdbdjpaexqb6.R.inc(827);String mimeBoundary = null;
            __CLR4_2_1bdbdjpaexqb6.R.inc(828);if ((((req.data().size() > 0 && (!methodHasBody || hasRequestBody))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(829)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(830)==0&false)))
                {__CLR4_2_1bdbdjpaexqb6.R.inc(831);serialiseRequestUrl(req);
            }else {__CLR4_2_1bdbdjpaexqb6.R.inc(832);if ((((methodHasBody)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(833)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(834)==0&false)))
                {__CLR4_2_1bdbdjpaexqb6.R.inc(835);mimeBoundary = setOutputContentType(req);

            }}__CLR4_2_1bdbdjpaexqb6.R.inc(836);long startTime = System.nanoTime();
            __CLR4_2_1bdbdjpaexqb6.R.inc(837);HttpURLConnection conn = createConnection(req);
            __CLR4_2_1bdbdjpaexqb6.R.inc(838);Response res;
            __CLR4_2_1bdbdjpaexqb6.R.inc(839);try {
                __CLR4_2_1bdbdjpaexqb6.R.inc(840);conn.connect();
                __CLR4_2_1bdbdjpaexqb6.R.inc(841);if ((((conn.getDoOutput())&&(__CLR4_2_1bdbdjpaexqb6.R.iget(842)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(843)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(844);writePost(req, conn.getOutputStream(), mimeBoundary);

                }__CLR4_2_1bdbdjpaexqb6.R.inc(845);int status = conn.getResponseCode();
                __CLR4_2_1bdbdjpaexqb6.R.inc(846);res = new Response(previousResponse);
                __CLR4_2_1bdbdjpaexqb6.R.inc(847);res.setupFromConnection(conn, previousResponse);
                __CLR4_2_1bdbdjpaexqb6.R.inc(848);res.req = req;

                // redirect if there's a location header (from 3xx, or 201 etc)
                __CLR4_2_1bdbdjpaexqb6.R.inc(849);if ((((res.hasHeader(LOCATION) && req.followRedirects())&&(__CLR4_2_1bdbdjpaexqb6.R.iget(850)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(851)==0&false))) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(852);if ((((status != HTTP_TEMP_REDIR)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(853)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(854)==0&false))) {{
                        __CLR4_2_1bdbdjpaexqb6.R.inc(855);req.method(Method.GET); // always redirect with a get. any data param from original req are dropped.
                        __CLR4_2_1bdbdjpaexqb6.R.inc(856);req.data().clear();
                        __CLR4_2_1bdbdjpaexqb6.R.inc(857);req.requestBody(null);
                        __CLR4_2_1bdbdjpaexqb6.R.inc(858);req.removeHeader(CONTENT_TYPE);
                    }

                    }__CLR4_2_1bdbdjpaexqb6.R.inc(859);String location = res.header(LOCATION);
                    __CLR4_2_1bdbdjpaexqb6.R.inc(860);if ((((location.startsWith("http:/") && location.charAt(6) != '/')&&(__CLR4_2_1bdbdjpaexqb6.R.iget(861)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(862)==0&false))) // fix broken Location: http:/temp/AAG_New/en/index.php
                        {__CLR4_2_1bdbdjpaexqb6.R.inc(863);location = location.substring(6);
                    }__CLR4_2_1bdbdjpaexqb6.R.inc(864);URL redir = StringUtil.resolve(req.url(), location);
                    __CLR4_2_1bdbdjpaexqb6.R.inc(865);req.url(encodeUrl(redir));

                    __CLR4_2_1bdbdjpaexqb6.R.inc(866);for (Map.Entry<String, String> cookie : res.cookies.entrySet()) {{ // add response cookies to request (for e.g. login posts)
                        __CLR4_2_1bdbdjpaexqb6.R.inc(867);req.cookie(cookie.getKey(), cookie.getValue());
                    }
                    }__CLR4_2_1bdbdjpaexqb6.R.inc(868);return execute(req, res);
                }
                }__CLR4_2_1bdbdjpaexqb6.R.inc(869);if (((((status < 200 || status >= 400) && !req.ignoreHttpErrors())&&(__CLR4_2_1bdbdjpaexqb6.R.iget(870)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(871)==0&false)))
                        {__CLR4_2_1bdbdjpaexqb6.R.inc(872);throw new HttpStatusException("HTTP error fetching URL", status, req.url().toString());

                // check that we can handle the returned content type; if not, abort before fetching it
                }__CLR4_2_1bdbdjpaexqb6.R.inc(873);String contentType = res.contentType();
                __CLR4_2_1bdbdjpaexqb6.R.inc(874);if ((((contentType != null
                        && !req.ignoreContentType()
                        && !contentType.startsWith("text/")
                        && !xmlContentTypeRxp.matcher(contentType).matches()
                        )&&(__CLR4_2_1bdbdjpaexqb6.R.iget(875)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(876)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(877);throw new UnsupportedMimeTypeException("Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml",
                            contentType, req.url().toString());

                // switch to the XML parser if content type is xml and not parser not explicitly set
                }__CLR4_2_1bdbdjpaexqb6.R.inc(878);if ((((contentType != null && xmlContentTypeRxp.matcher(contentType).matches())&&(__CLR4_2_1bdbdjpaexqb6.R.iget(879)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(880)==0&false))) {{
                    // only flip it if a HttpConnection.Request (i.e. don't presume other impls want it):
                    __CLR4_2_1bdbdjpaexqb6.R.inc(881);if ((((req instanceof HttpConnection.Request && !((Request) req).parserDefined)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(882)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(883)==0&false))) {{
                        __CLR4_2_1bdbdjpaexqb6.R.inc(884);req.parser(Parser.xmlParser());
                    }
                }}

                }__CLR4_2_1bdbdjpaexqb6.R.inc(885);res.charset = DataUtil.getCharsetFromContentType(res.contentType); // may be null, readInputStream deals with it
                __CLR4_2_1bdbdjpaexqb6.R.inc(886);if ((((conn.getContentLength() != 0 && req.method() != HEAD)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(887)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(888)==0&false))) {{ // -1 means unknown, chunked. sun throws an IO exception on 500 response with no content when trying to read body
                    __CLR4_2_1bdbdjpaexqb6.R.inc(889);res.bodyStream = null;
                    __CLR4_2_1bdbdjpaexqb6.R.inc(890);res.bodyStream = (((conn.getErrorStream() != null )&&(__CLR4_2_1bdbdjpaexqb6.R.iget(891)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(892)==0&false))? conn.getErrorStream() : conn.getInputStream();
                    __CLR4_2_1bdbdjpaexqb6.R.inc(893);if ((((res.hasHeaderWithValue(CONTENT_ENCODING, "gzip"))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(894)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(895)==0&false))) {{
                        __CLR4_2_1bdbdjpaexqb6.R.inc(896);res.bodyStream = new GZIPInputStream(res.bodyStream);
                    } }else {__CLR4_2_1bdbdjpaexqb6.R.inc(897);if ((((res.hasHeaderWithValue(CONTENT_ENCODING, "deflate"))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(898)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(899)==0&false))) {{
                        __CLR4_2_1bdbdjpaexqb6.R.inc(900);res.bodyStream = new InflaterInputStream(res.bodyStream, new Inflater(true));
                    }
                    }}__CLR4_2_1bdbdjpaexqb6.R.inc(901);res.bodyStream = ConstrainableInputStream
                        .wrap(res.bodyStream, DataUtil.bufferSize, req.maxBodySize())
                        .timeout(startTime, req.timeout())
                    ;
                } }else {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(902);res.byteData = DataUtil.emptyByteBuffer();
                }
            }} catch (IOException e){
                // per Java's documentation, this is not necessary, and precludes keepalives. However in practise,
                // connection errors will not be released quickly enough and can cause a too many open files error.
                __CLR4_2_1bdbdjpaexqb6.R.inc(903);conn.disconnect();
                __CLR4_2_1bdbdjpaexqb6.R.inc(904);throw e;
            }

            __CLR4_2_1bdbdjpaexqb6.R.inc(905);res.executed = true;
            __CLR4_2_1bdbdjpaexqb6.R.inc(906);return res;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public int statusCode() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(907);
            __CLR4_2_1bdbdjpaexqb6.R.inc(908);return statusCode;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public String statusMessage() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(909);
            __CLR4_2_1bdbdjpaexqb6.R.inc(910);return statusMessage;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public String charset() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(911);
            __CLR4_2_1bdbdjpaexqb6.R.inc(912);return charset;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Response charset(String charset) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(913);
            __CLR4_2_1bdbdjpaexqb6.R.inc(914);this.charset = charset;
            __CLR4_2_1bdbdjpaexqb6.R.inc(915);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public String contentType() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(916);
            __CLR4_2_1bdbdjpaexqb6.R.inc(917);return contentType;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public Document parse() throws IOException {try{__CLR4_2_1bdbdjpaexqb6.R.inc(918);
            __CLR4_2_1bdbdjpaexqb6.R.inc(919);Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            __CLR4_2_1bdbdjpaexqb6.R.inc(920);if ((((byteData != null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(921)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(922)==0&false))) {{ // bytes have been read in to the buffer, parse that
                __CLR4_2_1bdbdjpaexqb6.R.inc(923);bodyStream = new ByteArrayInputStream(byteData.array());
                __CLR4_2_1bdbdjpaexqb6.R.inc(924);inputStreamRead = false; // ok to reparse if in bytes
            }
            }__CLR4_2_1bdbdjpaexqb6.R.inc(925);Validate.isFalse(inputStreamRead, "Input stream already read and parsed, cannot re-read.");
            __CLR4_2_1bdbdjpaexqb6.R.inc(926);Document doc = DataUtil.parseInputStream(bodyStream, charset, url.toExternalForm(), req.parser());
            __CLR4_2_1bdbdjpaexqb6.R.inc(927);charset = doc.outputSettings().charset().name(); // update charset from meta-equiv, possibly
            __CLR4_2_1bdbdjpaexqb6.R.inc(928);inputStreamRead = true;
            __CLR4_2_1bdbdjpaexqb6.R.inc(929);safeClose();
            __CLR4_2_1bdbdjpaexqb6.R.inc(930);return doc;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        private void prepareByteData() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(931);
            __CLR4_2_1bdbdjpaexqb6.R.inc(932);Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            __CLR4_2_1bdbdjpaexqb6.R.inc(933);if ((((byteData == null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(934)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(935)==0&false))) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(936);Validate.isFalse(inputStreamRead, "Request has already been read (with .parse())");
                __CLR4_2_1bdbdjpaexqb6.R.inc(937);try {
                    __CLR4_2_1bdbdjpaexqb6.R.inc(938);byteData = DataUtil.readToByteBuffer(bodyStream, req.maxBodySize());
                } catch (IOException e) {
                    __CLR4_2_1bdbdjpaexqb6.R.inc(939);throw new UncheckedIOException(e);
                } finally {
                    __CLR4_2_1bdbdjpaexqb6.R.inc(940);inputStreamRead = true;
                    __CLR4_2_1bdbdjpaexqb6.R.inc(941);safeClose();
                }
            }
        }}finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public String body() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(942);
            __CLR4_2_1bdbdjpaexqb6.R.inc(943);prepareByteData();
            // charset gets set from header on execute, and from meta-equiv on parse. parse may not have happened yet
            __CLR4_2_1bdbdjpaexqb6.R.inc(944);String body;
            __CLR4_2_1bdbdjpaexqb6.R.inc(945);if ((((charset == null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(946)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(947)==0&false)))
                {__CLR4_2_1bdbdjpaexqb6.R.inc(948);body = Charset.forName(DataUtil.defaultCharset).decode(byteData).toString();
            }else
                {__CLR4_2_1bdbdjpaexqb6.R.inc(949);body = Charset.forName(charset).decode(byteData).toString();
            }__CLR4_2_1bdbdjpaexqb6.R.inc(950);((Buffer)byteData).rewind(); // cast to avoid covariant return type change in jdk9
            __CLR4_2_1bdbdjpaexqb6.R.inc(951);return body;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public byte[] bodyAsBytes() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(952);
            __CLR4_2_1bdbdjpaexqb6.R.inc(953);prepareByteData();
            __CLR4_2_1bdbdjpaexqb6.R.inc(954);return byteData.array();
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        @Override
        public Connection.Response bufferUp() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(955);
            __CLR4_2_1bdbdjpaexqb6.R.inc(956);prepareByteData();
            __CLR4_2_1bdbdjpaexqb6.R.inc(957);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        @Override
        public BufferedInputStream bodyStream() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(958);
            __CLR4_2_1bdbdjpaexqb6.R.inc(959);Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            __CLR4_2_1bdbdjpaexqb6.R.inc(960);Validate.isFalse(inputStreamRead, "Request has already been read");
            __CLR4_2_1bdbdjpaexqb6.R.inc(961);inputStreamRead = true;
            __CLR4_2_1bdbdjpaexqb6.R.inc(962);return ConstrainableInputStream.wrap(bodyStream, DataUtil.bufferSize, req.maxBodySize());
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        // set up connection defaults, and details from request
        private static HttpURLConnection createConnection(Connection.Request req) throws IOException {try{__CLR4_2_1bdbdjpaexqb6.R.inc(963);
            __CLR4_2_1bdbdjpaexqb6.R.inc(964);final HttpURLConnection conn = (HttpURLConnection) (
                (((req.proxy() == null )&&(__CLR4_2_1bdbdjpaexqb6.R.iget(965)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(966)==0&false))?
                req.url().openConnection() :
                req.url().openConnection(req.proxy())
            );

            __CLR4_2_1bdbdjpaexqb6.R.inc(967);conn.setRequestMethod(req.method().name());
            __CLR4_2_1bdbdjpaexqb6.R.inc(968);conn.setInstanceFollowRedirects(false); // don't rely on native redirection support
            __CLR4_2_1bdbdjpaexqb6.R.inc(969);conn.setConnectTimeout(req.timeout());
            __CLR4_2_1bdbdjpaexqb6.R.inc(970);conn.setReadTimeout(req.timeout() / 2); // gets reduced after connection is made and status is read

            __CLR4_2_1bdbdjpaexqb6.R.inc(971);if ((((req.sslSocketFactory() != null && conn instanceof HttpsURLConnection)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(972)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(973)==0&false)))
                {__CLR4_2_1bdbdjpaexqb6.R.inc(974);((HttpsURLConnection) conn).setSSLSocketFactory(req.sslSocketFactory());
            }__CLR4_2_1bdbdjpaexqb6.R.inc(975);if ((((req.method().hasBody())&&(__CLR4_2_1bdbdjpaexqb6.R.iget(976)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(977)==0&false)))
                {__CLR4_2_1bdbdjpaexqb6.R.inc(978);conn.setDoOutput(true);
            }__CLR4_2_1bdbdjpaexqb6.R.inc(979);if ((((req.cookies().size() > 0)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(980)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(981)==0&false)))
                {__CLR4_2_1bdbdjpaexqb6.R.inc(982);conn.addRequestProperty("Cookie", getRequestCookieString(req));
            }__CLR4_2_1bdbdjpaexqb6.R.inc(983);for (Map.Entry<String, List<String>> header : req.multiHeaders().entrySet()) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(984);for (String value : header.getValue()) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(985);conn.addRequestProperty(header.getKey(), value);
                }
            }}
            }__CLR4_2_1bdbdjpaexqb6.R.inc(986);return conn;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        /**
         * Call on completion of stream read, to close the body (or error) stream
         */
        private void safeClose() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(987);
            __CLR4_2_1bdbdjpaexqb6.R.inc(988);if ((((conn != null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(989)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(990)==0&false))) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(991);conn.disconnect();
                __CLR4_2_1bdbdjpaexqb6.R.inc(992);conn = null;
            }
            }__CLR4_2_1bdbdjpaexqb6.R.inc(993);if ((((bodyStream != null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(994)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(995)==0&false))) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(996);try {
                    __CLR4_2_1bdbdjpaexqb6.R.inc(997);bodyStream.close();
                } catch (IOException e) {
                    // no-op
                } finally {
                    __CLR4_2_1bdbdjpaexqb6.R.inc(998);bodyStream = null;
                }
            }
        }}finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        // set up url, method, header, cookies
        private void setupFromConnection(HttpURLConnection conn, HttpConnection.Response previousResponse) throws IOException {try{__CLR4_2_1bdbdjpaexqb6.R.inc(999);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1000);this.conn = conn;
            __CLR4_2_1bdbdjpaexqb6.R.inc(1001);method = Method.valueOf(conn.getRequestMethod());
            __CLR4_2_1bdbdjpaexqb6.R.inc(1002);url = conn.getURL();
            __CLR4_2_1bdbdjpaexqb6.R.inc(1003);statusCode = conn.getResponseCode();
            __CLR4_2_1bdbdjpaexqb6.R.inc(1004);statusMessage = conn.getResponseMessage();
            __CLR4_2_1bdbdjpaexqb6.R.inc(1005);contentType = conn.getContentType();

            __CLR4_2_1bdbdjpaexqb6.R.inc(1006);Map<String, List<String>> resHeaders = createHeaderMap(conn);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1007);processResponseHeaders(resHeaders);

            // if from a redirect, map previous response cookies into this response
            __CLR4_2_1bdbdjpaexqb6.R.inc(1008);if ((((previousResponse != null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1009)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1010)==0&false))) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(1011);for (Map.Entry<String, String> prevCookie : previousResponse.cookies().entrySet()) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1012);if ((((!hasCookie(prevCookie.getKey()))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1013)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1014)==0&false)))
                        {__CLR4_2_1bdbdjpaexqb6.R.inc(1015);cookie(prevCookie.getKey(), prevCookie.getValue());
                }}
                }__CLR4_2_1bdbdjpaexqb6.R.inc(1016);previousResponse.safeClose();
            }
        }}finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        private static LinkedHashMap<String, List<String>> createHeaderMap(HttpURLConnection conn) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1017);
            // the default sun impl of conn.getHeaderFields() returns header values out of order
            __CLR4_2_1bdbdjpaexqb6.R.inc(1018);final LinkedHashMap<String, List<String>> headers = new LinkedHashMap<>();
            __CLR4_2_1bdbdjpaexqb6.R.inc(1019);int i = 0;
            __CLR4_2_1bdbdjpaexqb6.R.inc(1020);while (true) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(1021);final String key = conn.getHeaderFieldKey(i);
                __CLR4_2_1bdbdjpaexqb6.R.inc(1022);final String val = conn.getHeaderField(i);
                __CLR4_2_1bdbdjpaexqb6.R.inc(1023);if ((((key == null && val == null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1024)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1025)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(1026);break;
                }__CLR4_2_1bdbdjpaexqb6.R.inc(1027);i++;
                __CLR4_2_1bdbdjpaexqb6.R.inc(1028);if ((((key == null || val == null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1029)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1030)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(1031);continue; // skip http1.1 line

                }__CLR4_2_1bdbdjpaexqb6.R.inc(1032);if ((((headers.containsKey(key))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1033)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1034)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(1035);headers.get(key).add(val);
                }else {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1036);final ArrayList<String> vals = new ArrayList<>();
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1037);vals.add(val);
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1038);headers.put(key, vals);
                }
            }}
            }__CLR4_2_1bdbdjpaexqb6.R.inc(1039);return headers;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        void processResponseHeaders(Map<String, List<String>> resHeaders) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1040);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1041);for (Map.Entry<String, List<String>> entry : resHeaders.entrySet()) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(1042);String name = entry.getKey();
                __CLR4_2_1bdbdjpaexqb6.R.inc(1043);if ((((name == null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1044)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1045)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(1046);continue; // http/1.1 line

                }__CLR4_2_1bdbdjpaexqb6.R.inc(1047);List<String> values = entry.getValue();
                __CLR4_2_1bdbdjpaexqb6.R.inc(1048);if ((((name.equalsIgnoreCase("Set-Cookie"))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1049)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1050)==0&false))) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1051);for (String value : values) {{
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1052);if ((((value == null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1053)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1054)==0&false)))
                            {__CLR4_2_1bdbdjpaexqb6.R.inc(1055);continue;
                        }__CLR4_2_1bdbdjpaexqb6.R.inc(1056);TokenQueue cd = new TokenQueue(value);
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1057);String cookieName = cd.chompTo("=").trim();
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1058);String cookieVal = cd.consumeTo(";").trim();
                        // ignores path, date, domain, validateTLSCertificates et al. req'd?
                        // name not blank, value not null
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1059);if ((((cookieName.length() > 0)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1060)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1061)==0&false)))
                            {__CLR4_2_1bdbdjpaexqb6.R.inc(1062);cookie(cookieName, cookieVal);
                    }}
                }}
                }__CLR4_2_1bdbdjpaexqb6.R.inc(1063);for (String value : values) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1064);addHeader(name, value);
                }
            }}
        }}finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        private static String setOutputContentType(final Connection.Request req) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1065);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1066);String bound = null;
            __CLR4_2_1bdbdjpaexqb6.R.inc(1067);if ((((req.hasHeader(CONTENT_TYPE))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1068)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1069)==0&false))) {{
                // no-op; don't add content type as already set (e.g. for requestBody())
                // todo - if content type already set, we could add charset or boundary if those aren't included
            }
            }else {__CLR4_2_1bdbdjpaexqb6.R.inc(1070);if ((((needsMultipart(req))&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1071)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1072)==0&false))) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(1073);bound = DataUtil.mimeBoundary();
                __CLR4_2_1bdbdjpaexqb6.R.inc(1074);req.header(CONTENT_TYPE, MULTIPART_FORM_DATA + "; boundary=" + bound);
            } }else {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(1075);req.header(CONTENT_TYPE, FORM_URL_ENCODED + "; charset=" + req.postDataCharset());
            }
            }}__CLR4_2_1bdbdjpaexqb6.R.inc(1076);return bound;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        private static void writePost(final Connection.Request req, final OutputStream outputStream, final String bound) throws IOException {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1077);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1078);final Collection<Connection.KeyVal> data = req.data();
            __CLR4_2_1bdbdjpaexqb6.R.inc(1079);final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(outputStream, req.postDataCharset()));

            __CLR4_2_1bdbdjpaexqb6.R.inc(1080);if ((((bound != null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1081)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1082)==0&false))) {{
                // boundary will be set if we're in multipart mode
                __CLR4_2_1bdbdjpaexqb6.R.inc(1083);for (Connection.KeyVal keyVal : data) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1084);w.write("--");
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1085);w.write(bound);
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1086);w.write("\r\n");
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1087);w.write("Content-Disposition: form-data; name=\"");
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1088);w.write(encodeMimeName(keyVal.key())); // encodes " to %22
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1089);w.write("\"");
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1090);if ((((keyVal.hasInputStream())&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1091)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1092)==0&false))) {{
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1093);w.write("; filename=\"");
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1094);w.write(encodeMimeName(keyVal.value()));
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1095);w.write("\"\r\nContent-Type: ");
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1096);w.write((((keyVal.contentType() != null )&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1097)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1098)==0&false))? keyVal.contentType() : DefaultUploadType);
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1099);w.write("\r\n\r\n");
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1100);w.flush(); // flush
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1101);DataUtil.crossStreams(keyVal.inputStream(), outputStream);
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1102);outputStream.flush();
                    } }else {{
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1103);w.write("\r\n\r\n");
                        __CLR4_2_1bdbdjpaexqb6.R.inc(1104);w.write(keyVal.value());
                    }
                    }__CLR4_2_1bdbdjpaexqb6.R.inc(1105);w.write("\r\n");
                }
                }__CLR4_2_1bdbdjpaexqb6.R.inc(1106);w.write("--");
                __CLR4_2_1bdbdjpaexqb6.R.inc(1107);w.write(bound);
                __CLR4_2_1bdbdjpaexqb6.R.inc(1108);w.write("--");
            } }else {__CLR4_2_1bdbdjpaexqb6.R.inc(1109);if ((((req.requestBody() != null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1110)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1111)==0&false))) {{
                // data will be in query string, we're sending a plaintext body
                __CLR4_2_1bdbdjpaexqb6.R.inc(1112);w.write(req.requestBody());
            }
            }else {{
                // regular form data (application/x-www-form-urlencoded)
                __CLR4_2_1bdbdjpaexqb6.R.inc(1113);boolean first = true;
                __CLR4_2_1bdbdjpaexqb6.R.inc(1114);for (Connection.KeyVal keyVal : data) {{
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1115);if ((((!first)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1116)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1117)==0&false)))
                        {__CLR4_2_1bdbdjpaexqb6.R.inc(1118);w.append('&');
                    }else
                        {__CLR4_2_1bdbdjpaexqb6.R.inc(1119);first = false;

                    }__CLR4_2_1bdbdjpaexqb6.R.inc(1120);w.write(URLEncoder.encode(keyVal.key(), req.postDataCharset()));
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1121);w.write('=');
                    __CLR4_2_1bdbdjpaexqb6.R.inc(1122);w.write(URLEncoder.encode(keyVal.value(), req.postDataCharset()));
                }
            }}
            }}__CLR4_2_1bdbdjpaexqb6.R.inc(1123);w.close();
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        private static String getRequestCookieString(Connection.Request req) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1124);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1125);StringBuilder sb = StringUtil.borrowBuilder();
            __CLR4_2_1bdbdjpaexqb6.R.inc(1126);boolean first = true;
            __CLR4_2_1bdbdjpaexqb6.R.inc(1127);for (Map.Entry<String, String> cookie : req.cookies().entrySet()) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(1128);if ((((!first)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1129)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1130)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(1131);sb.append("; ");
                }else
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(1132);first = false;
                }__CLR4_2_1bdbdjpaexqb6.R.inc(1133);sb.append(cookie.getKey()).append('=').append(cookie.getValue());
                // todo: spec says only ascii, no escaping / encoding defined. validate on set? or escape somehow here?
            }
            }__CLR4_2_1bdbdjpaexqb6.R.inc(1134);return StringUtil.releaseBuilder(sb);
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        // for get url reqs, serialise the data map into the url
        private static void serialiseRequestUrl(Connection.Request req) throws IOException {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1135);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1136);URL in = req.url();
            __CLR4_2_1bdbdjpaexqb6.R.inc(1137);StringBuilder url = StringUtil.borrowBuilder();
            __CLR4_2_1bdbdjpaexqb6.R.inc(1138);boolean first = true;
            // reconstitute the query, ready for appends
            __CLR4_2_1bdbdjpaexqb6.R.inc(1139);url
                .append(in.getProtocol())
                .append("://")
                .append(in.getAuthority()) // includes host, port
                .append(in.getPath())
                .append("?");
            __CLR4_2_1bdbdjpaexqb6.R.inc(1140);if ((((in.getQuery() != null)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1141)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1142)==0&false))) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(1143);url.append(in.getQuery());
                __CLR4_2_1bdbdjpaexqb6.R.inc(1144);first = false;
            }
            }__CLR4_2_1bdbdjpaexqb6.R.inc(1145);for (Connection.KeyVal keyVal : req.data()) {{
                __CLR4_2_1bdbdjpaexqb6.R.inc(1146);Validate.isFalse(keyVal.hasInputStream(), "InputStream data not supported in URL query string.");
                __CLR4_2_1bdbdjpaexqb6.R.inc(1147);if ((((!first)&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1148)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1149)==0&false)))
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(1150);url.append('&');
                }else
                    {__CLR4_2_1bdbdjpaexqb6.R.inc(1151);first = false;
                }__CLR4_2_1bdbdjpaexqb6.R.inc(1152);url
                    .append(URLEncoder.encode(keyVal.key(), DataUtil.defaultCharset))
                    .append('=')
                    .append(URLEncoder.encode(keyVal.value(), DataUtil.defaultCharset));
            }
            }__CLR4_2_1bdbdjpaexqb6.R.inc(1153);req.url(new URL(StringUtil.releaseBuilder(url)));
            __CLR4_2_1bdbdjpaexqb6.R.inc(1154);req.data().clear(); // moved into url as get params
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}
    }

    private static boolean needsMultipart(Connection.Request req) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1155);
        // multipart mode, for files. add the header if we see something with an inputstream, and return a non-null boundary
        __CLR4_2_1bdbdjpaexqb6.R.inc(1156);for (Connection.KeyVal keyVal : req.data()) {{
            __CLR4_2_1bdbdjpaexqb6.R.inc(1157);if ((((keyVal.hasInputStream())&&(__CLR4_2_1bdbdjpaexqb6.R.iget(1158)!=0|true))||(__CLR4_2_1bdbdjpaexqb6.R.iget(1159)==0&false)))
                {__CLR4_2_1bdbdjpaexqb6.R.inc(1160);return true;
        }}
        }__CLR4_2_1bdbdjpaexqb6.R.inc(1161);return false;
    }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

    public static class KeyVal implements Connection.KeyVal {
        private String key;
        private String value;
        private InputStream stream;
        private String contentType;

        public static KeyVal create(String key, String value) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1162);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1163);return new KeyVal().key(key).value(value);
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public static KeyVal create(String key, String filename, InputStream stream) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1164);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1165);return new KeyVal().key(key).value(filename).inputStream(stream);
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        private KeyVal() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1166);}finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public KeyVal key(String key) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1167);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1168);Validate.notEmpty(key, "Data key must not be empty");
            __CLR4_2_1bdbdjpaexqb6.R.inc(1169);this.key = key;
            __CLR4_2_1bdbdjpaexqb6.R.inc(1170);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public String key() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1171);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1172);return key;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public KeyVal value(String value) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1173);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1174);Validate.notNull(value, "Data value must not be null");
            __CLR4_2_1bdbdjpaexqb6.R.inc(1175);this.value = value;
            __CLR4_2_1bdbdjpaexqb6.R.inc(1176);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public String value() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1177);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1178);return value;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public KeyVal inputStream(InputStream inputStream) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1179);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1180);Validate.notNull(value, "Data input stream must not be null");
            __CLR4_2_1bdbdjpaexqb6.R.inc(1181);this.stream = inputStream;
            __CLR4_2_1bdbdjpaexqb6.R.inc(1182);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public InputStream inputStream() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1183);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1184);return stream;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        public boolean hasInputStream() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1185);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1186);return stream != null;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        @Override
        public Connection.KeyVal contentType(String contentType) {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1187);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1188);Validate.notEmpty(contentType);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1189);this.contentType = contentType;
            __CLR4_2_1bdbdjpaexqb6.R.inc(1190);return this;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        @Override
        public String contentType() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1191);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1192);return contentType;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_1bdbdjpaexqb6.R.inc(1193);
            __CLR4_2_1bdbdjpaexqb6.R.inc(1194);return key + "=" + value;
        }finally{__CLR4_2_1bdbdjpaexqb6.R.flushNeeded();}}
    }
}
