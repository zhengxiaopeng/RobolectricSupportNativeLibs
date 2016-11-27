# Support libraries that package native libraries

## Summary

**1. Disable load so in your app code.**


**2. Porting Dynamic Link Library.**

- If you use the Linux operating system that is the most simple, just get the `x86-64(Depending on your cpu architecture)` 's so file, and add the dependency so library(Found in the ndk-bundle, platforms folder).

- If you use the masOS operating system, you need to do a little more work. And you should have the native so library source code, and compile it under macOS system:



``` Bash

# .o

cc -c -I/System/Library/Frameworks/JavaVM.framework/Headers *.cpp

# get  xxx.dylib

g++ -dynamiclib -undefined suppress -flat_namespace *.o -o something.dylib

```

- Windows is similar.



**3. Load so library in your RobolectricApplication.**



End, run your test case, well done:

![load so test case](http://rocko-blog.qiniudn.com/2016-11-27_09-32-15_test_case_success.png)


## Detail

Sample code: [RobolectricSupportNativeLibs](https://github.com/zhengxiaopeng/RobolectricSupportNativeLibs)

blog - [http://rocko.xyz/2016/11/27/Android-Robolectric-加载运行本地-so-动态库/](http://rocko.xyz/2016/11/27/Android-Robolectric-加载运行本地-so-动态库/)