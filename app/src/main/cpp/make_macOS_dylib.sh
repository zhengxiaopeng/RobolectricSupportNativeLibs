#!/usr/bin/env bash

OUTPUT=../../../build/intermediates/dylibs
mkdir -p ${OUTPUT}

# .o file
cc -c -I/System/Library/Frameworks/JavaVM.framework/Headers *.cpp -o ${OUTPUT}/libnative-lib.o

# .dylib file
g++ -dynamiclib -undefined suppress -flat_namespace ${OUTPUT}/*.o -o ${OUTPUT}/libnative-lib.dylib