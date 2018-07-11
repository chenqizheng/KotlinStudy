package generic

/**
 * 内联函数可以推断类型
 */
inline fun <reified T> isT(value: Any): Boolean {
    println("T is " + T::class.java)
    return value is T
}

fun main(args: Array<String>) {
    val string = "hello world";
    println("isString " + isT<String>(string))
    println("isBoolean " + isT<Boolean>(true))
}