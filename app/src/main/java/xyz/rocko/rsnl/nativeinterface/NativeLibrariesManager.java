package xyz.rocko.rsnl.nativeinterface;

/**
 * Created by rocko on 2016/11/26.
 */

public class NativeLibrariesManager {


  // Used to load the 'native-lib' library on application startup.
  static {
    System.loadLibrary("native-lib");
  }

  public static void loadNativeLibraries() {
    // no-op
  }
}
