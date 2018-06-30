package clazz

/**
 *  接口可以有默认实现
 *  两个接口相同函数签名时，必须显示声明
 */
interface Clickable {
    fun click()

    fun enable(enabled: Boolean) {
        println("Clickable enable $enabled")
    }
}

interface Enable {
    fun enable(enabled: Boolean) {
        println("Enable enable $enabled")
    }
}

class Button : Clickable, Enable {
    //两个接口相同函数签名时，必须显示声明
    override fun enable(enabled: Boolean) {
        super<Enable>.enable(enabled)
    }

    override fun click() {
        println("button click")
    }

}

fun main(args: Array<String>) {
    Button().click();
    Button().enable(false)
}