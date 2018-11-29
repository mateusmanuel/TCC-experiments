/* $$ This file has been instrumented by Clover 4.2.1#20171121235008561 $$ */package org.jsoup.internal;

import org.jsoup.helper.Validate;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/**
 * A jsoup internal class (so don't use it as there is no contract API) that enables constraints on an Input Stream,
 * namely a maximum read size, and the ability to Thread.interrupt() the read.
 */
public final class ConstrainableInputStream extends BufferedInputStream {public static class __CLR4_2_111d11djp2rx9vf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_1();if(20171121235008561L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.1#20171121235008561,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006d\u0061\u0074\u0065\u0075\u0073\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u006f\u0073\u002f\u0054\u0043\u0043\u002f\u006a\u0073\u006f\u0075\u0070\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1543506510356L,8589935092L,1421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int DefaultSize = 1024 * 32;

    private final boolean capped;
    private final int maxSize;
    private long startTime;
    private long timeout = 0; // optional max time of request
    private int remaining;
    private boolean interrupted;

    private ConstrainableInputStream(InputStream in, int bufferSize, int maxSize) {
        super(in, bufferSize);__CLR4_2_111d11djp2rx9vf.R.inc(1346);try{__CLR4_2_111d11djp2rx9vf.R.inc(1345);
        __CLR4_2_111d11djp2rx9vf.R.inc(1347);Validate.isTrue(maxSize >= 0);
        __CLR4_2_111d11djp2rx9vf.R.inc(1348);this.maxSize = maxSize;
        __CLR4_2_111d11djp2rx9vf.R.inc(1349);remaining = maxSize;
        __CLR4_2_111d11djp2rx9vf.R.inc(1350);capped = maxSize != 0;
        __CLR4_2_111d11djp2rx9vf.R.inc(1351);startTime = System.nanoTime();
    }finally{__CLR4_2_111d11djp2rx9vf.R.flushNeeded();}}

    /**
     * If this InputStream is not already a ConstrainableInputStream, let it be one.
     * @param in the input stream to (maybe) wrap
     * @param bufferSize the buffer size to use when reading
     * @param maxSize the maximum size to allow to be read. 0 == infinite.
     * @return a constrainable input stream
     */
    public static ConstrainableInputStream wrap(InputStream in, int bufferSize, int maxSize) {try{__CLR4_2_111d11djp2rx9vf.R.inc(1352);
        __CLR4_2_111d11djp2rx9vf.R.inc(1353);return (((in instanceof ConstrainableInputStream
            )&&(__CLR4_2_111d11djp2rx9vf.R.iget(1354)!=0|true))||(__CLR4_2_111d11djp2rx9vf.R.iget(1355)==0&false))? (ConstrainableInputStream) in
            : new ConstrainableInputStream(in, bufferSize, maxSize);
    }finally{__CLR4_2_111d11djp2rx9vf.R.flushNeeded();}}

    @Override
    public int read(byte[] b, int off, int len) throws IOException {try{__CLR4_2_111d11djp2rx9vf.R.inc(1356);
        __CLR4_2_111d11djp2rx9vf.R.inc(1357);if ((((interrupted || capped && remaining <= 0)&&(__CLR4_2_111d11djp2rx9vf.R.iget(1358)!=0|true))||(__CLR4_2_111d11djp2rx9vf.R.iget(1359)==0&false)))
            {__CLR4_2_111d11djp2rx9vf.R.inc(1360);return -1;
        }__CLR4_2_111d11djp2rx9vf.R.inc(1361);if ((((Thread.interrupted())&&(__CLR4_2_111d11djp2rx9vf.R.iget(1362)!=0|true))||(__CLR4_2_111d11djp2rx9vf.R.iget(1363)==0&false))) {{
            // interrupted latches, because parse() may call twice (and we still want the thread interupt to clear)
            __CLR4_2_111d11djp2rx9vf.R.inc(1364);interrupted = true;
            __CLR4_2_111d11djp2rx9vf.R.inc(1365);return -1;
        }
        }__CLR4_2_111d11djp2rx9vf.R.inc(1366);if ((((expired())&&(__CLR4_2_111d11djp2rx9vf.R.iget(1367)!=0|true))||(__CLR4_2_111d11djp2rx9vf.R.iget(1368)==0&false)))
            {__CLR4_2_111d11djp2rx9vf.R.inc(1369);throw new SocketTimeoutException("Read timeout");

        }__CLR4_2_111d11djp2rx9vf.R.inc(1370);if ((((capped && len > remaining)&&(__CLR4_2_111d11djp2rx9vf.R.iget(1371)!=0|true))||(__CLR4_2_111d11djp2rx9vf.R.iget(1372)==0&false)))
            {__CLR4_2_111d11djp2rx9vf.R.inc(1373);len = remaining; // don't read more than desired, even if available

        }__CLR4_2_111d11djp2rx9vf.R.inc(1374);try {
            __CLR4_2_111d11djp2rx9vf.R.inc(1375);final int read = super.read(b, off, len);
            __CLR4_2_111d11djp2rx9vf.R.inc(1376);remaining -= read;
            __CLR4_2_111d11djp2rx9vf.R.inc(1377);return read;
        } catch (SocketTimeoutException e) {
            __CLR4_2_111d11djp2rx9vf.R.inc(1378);return 0;
        }
    }finally{__CLR4_2_111d11djp2rx9vf.R.flushNeeded();}}

    /**
     * Reads this inputstream to a ByteBuffer. The supplied max may be less than the inputstream's max, to support
     * reading just the first bytes.
     */
    public ByteBuffer readToByteBuffer(int max) throws IOException {try{__CLR4_2_111d11djp2rx9vf.R.inc(1379);
        __CLR4_2_111d11djp2rx9vf.R.inc(1380);Validate.isTrue(max >= 0, "maxSize must be 0 (unlimited) or larger");
        __CLR4_2_111d11djp2rx9vf.R.inc(1381);final boolean localCapped = max > 0; // still possibly capped in total stream
        __CLR4_2_111d11djp2rx9vf.R.inc(1382);final int bufferSize = (((localCapped && max < DefaultSize )&&(__CLR4_2_111d11djp2rx9vf.R.iget(1383)!=0|true))||(__CLR4_2_111d11djp2rx9vf.R.iget(1384)==0&false))? max : DefaultSize;
        __CLR4_2_111d11djp2rx9vf.R.inc(1385);final byte[] readBuffer = new byte[bufferSize];
        __CLR4_2_111d11djp2rx9vf.R.inc(1386);final ByteArrayOutputStream outStream = new ByteArrayOutputStream(bufferSize);

        __CLR4_2_111d11djp2rx9vf.R.inc(1387);int read;
        __CLR4_2_111d11djp2rx9vf.R.inc(1388);int remaining = max;

        __CLR4_2_111d11djp2rx9vf.R.inc(1389);while (true) {{
            __CLR4_2_111d11djp2rx9vf.R.inc(1390);read = read(readBuffer);
            __CLR4_2_111d11djp2rx9vf.R.inc(1391);if ((((read == -1)&&(__CLR4_2_111d11djp2rx9vf.R.iget(1392)!=0|true))||(__CLR4_2_111d11djp2rx9vf.R.iget(1393)==0&false))) {__CLR4_2_111d11djp2rx9vf.R.inc(1394);break;
            }__CLR4_2_111d11djp2rx9vf.R.inc(1395);if ((((localCapped)&&(__CLR4_2_111d11djp2rx9vf.R.iget(1396)!=0|true))||(__CLR4_2_111d11djp2rx9vf.R.iget(1397)==0&false))) {{ // this local byteBuffer cap may be smaller than the overall maxSize (like when reading first bytes)
                __CLR4_2_111d11djp2rx9vf.R.inc(1398);if ((((read >= remaining)&&(__CLR4_2_111d11djp2rx9vf.R.iget(1399)!=0|true))||(__CLR4_2_111d11djp2rx9vf.R.iget(1400)==0&false))) {{
                    __CLR4_2_111d11djp2rx9vf.R.inc(1401);outStream.write(readBuffer, 0, remaining);
                    __CLR4_2_111d11djp2rx9vf.R.inc(1402);break;
                }
                }__CLR4_2_111d11djp2rx9vf.R.inc(1403);remaining -= read;
            }
            }__CLR4_2_111d11djp2rx9vf.R.inc(1404);outStream.write(readBuffer, 0, read);
        }
        }__CLR4_2_111d11djp2rx9vf.R.inc(1405);return ByteBuffer.wrap(outStream.toByteArray());
    }finally{__CLR4_2_111d11djp2rx9vf.R.flushNeeded();}}

    @Override
    public void reset() throws IOException {try{__CLR4_2_111d11djp2rx9vf.R.inc(1406);
        __CLR4_2_111d11djp2rx9vf.R.inc(1407);super.reset();
        __CLR4_2_111d11djp2rx9vf.R.inc(1408);remaining = maxSize - markpos;
    }finally{__CLR4_2_111d11djp2rx9vf.R.flushNeeded();}}

    public ConstrainableInputStream timeout(long startTimeNanos, long timeoutMillis) {try{__CLR4_2_111d11djp2rx9vf.R.inc(1409);
        __CLR4_2_111d11djp2rx9vf.R.inc(1410);this.startTime = startTimeNanos;
        __CLR4_2_111d11djp2rx9vf.R.inc(1411);this.timeout = timeoutMillis * 1000000;
        __CLR4_2_111d11djp2rx9vf.R.inc(1412);return this;
    }finally{__CLR4_2_111d11djp2rx9vf.R.flushNeeded();}}

    private boolean expired() {try{__CLR4_2_111d11djp2rx9vf.R.inc(1413);
        __CLR4_2_111d11djp2rx9vf.R.inc(1414);if ((((timeout == 0)&&(__CLR4_2_111d11djp2rx9vf.R.iget(1415)!=0|true))||(__CLR4_2_111d11djp2rx9vf.R.iget(1416)==0&false)))
            {__CLR4_2_111d11djp2rx9vf.R.inc(1417);return false;

        }__CLR4_2_111d11djp2rx9vf.R.inc(1418);final long now = System.nanoTime();
        __CLR4_2_111d11djp2rx9vf.R.inc(1419);final long dur = now - startTime;
        __CLR4_2_111d11djp2rx9vf.R.inc(1420);return (dur > timeout);
    }finally{__CLR4_2_111d11djp2rx9vf.R.flushNeeded();}}
}
