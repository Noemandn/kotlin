// IGNORE_BACKEND: JS_IR
class T(val f : () -> Any?) {
    fun call() : Any? = f()
}
fun box(): String {
    return T({ "OK" }).call() as String
}
