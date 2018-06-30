package clazz

/**
 * 重写Getter和Setter实现Observer
 */
class Home(var name: String) {
    var address: String = ""
        set(value: String) {
            println("set value $value")
            field = value
        }
        get() {
            println("get value $field")
            return field
        }
}