// "Replace with new qualified name" "true"
// WITH_RUNTIME

import static kotlin.collections.ArraysKt<caret>.component1;

class C {
    public void foo(byte[] bytes) {
        component1(bytes);
    }
}