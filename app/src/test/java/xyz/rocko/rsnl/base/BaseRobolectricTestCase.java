package xyz.rocko.rsnl.base;

import android.os.Build;
import org.robolectric.annotation.Config;
import xyz.rocko.rsnl.BuildConfig;

/**
 * Created by rocko on 2016/11/26.
 */
@Config(sdk = Build.VERSION_CODES.KITKAT, application = RobolectricApplication.class, constants = BuildConfig.class)
public class BaseRobolectricTestCase {
}
