package clazz

/**
 * 密封类可以使得when不需要写else
 */
sealed class Type {
    class Number : Type()

    class String : Type()
}

//
fun main(args: Array<kotlin.String>) {
    var type: Type = Type.Number();
    when (type) {
        is Type.String -> println("String")
        is Type.Number -> println("Number")
    }
}