package base

/**
 * 扩展函数：为接受者类型增加一个扩展函数。
 */
fun String.lastChar(): Char {
    return this.get(this.length - 1)
}

/**
 * 扩展属性：为接受者类型增加一个属性
 */
val String.lastChar: Char
    get() = get(this.length - 1)

/**
 * 中缀函数：只支持一个参数
 */
infix fun String.eq(other: String): Boolean {
    return equals(other)
}

/**
 * 局部函数：like JavaScript的闭包
 */
fun outerFn(msg: String): String {
    fun innerFn() {
        println("inner FN $msg")
    }
    innerFn();
    return "outerFn"
}

fun main(args: Array<String>) {
    val helloworld = "hello world";
    println(helloworld.lastChar());
    println(helloworld.lastChar)
    println("hello world" eq "hello world")
    println(outerFn("world"))
}