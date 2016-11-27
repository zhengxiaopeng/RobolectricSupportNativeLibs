package xyz.rocko.rsnl.nativeinterface;

/**
 * Created by rocko on 2016/11/26.
 */

public class NativeSample {

  /**
   * A native method that is implemented by the 'native-lib' native library,
   * which is packaged with this application.
   */
  public static native String stringFromJNI();
}
