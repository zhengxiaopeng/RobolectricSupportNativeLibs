package xyz.rocko.rsnl;

import android.util.Log;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import xyz.rocko.rsnl.base.BaseRobolectricTestCase;
import xyz.rocko.rsnl.nativeinterface.NativeSample;

import static org.junit.Assert.*;

/**
 * Robolectric load native code test
 */
@RunWith(RobolectricTestRunner.class)
public class RobolectricNativeTest extends BaseRobolectricTestCase {

  private static final String TAG = "RobolectricNativeTest";

  @Test public void addition_isCorrect() throws Exception {
    assertEquals(4, 2 + 2);
  }

  @Test public void testLoadNativeLibrariesSuccess() throws Exception {
    String nativeExcepted = "Hello from Native.";
    String result = NativeSample.stringFromJNI();
    Log.d(TAG, "result: " + result);
    assertEquals(nativeExcepted, result);
  }
}