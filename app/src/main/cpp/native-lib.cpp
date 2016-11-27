#include <jni.h>
#include <string>

extern "C"
jstring
Java_xyz_rocko_rsnl_nativeinterface_NativeSample_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    //    简单返回个字符串
    std::string hello = "Hello from Native.";
    return env->NewStringUTF(hello.c_str());
}
