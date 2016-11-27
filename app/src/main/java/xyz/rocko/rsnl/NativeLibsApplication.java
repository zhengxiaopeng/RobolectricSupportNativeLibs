package xyz.rocko.rsnl;

import android.app.Application;
import xyz.rocko.rsnl.nativeinterface.NativeLibrariesManager;

/**
 * Created by rocko on 2016/11/26.
 */

public class NativeLibsApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();
    loadNativeLibraries();
  }

  /**
   * 简单让子类可自己实现
   */
  protected void loadNativeLibraries() {
    NativeLibrariesManager.loadNativeLibraries();
  }
}
