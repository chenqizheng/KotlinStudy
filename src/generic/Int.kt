package generic


/**
 * 逆变:如果B是A的子类型，那么Consumer<A>就是Consumer<B>的子类型
 */
interface Comparator<in T> {
    fun compare(e1: T, e2: T): Int {
        return 1;
    }
}


fun comparaDouble(d1: Double, d2: Double, comparator: Comparator<Double>) {
}

fun main(args: Array<String>) {
    var comparator = object : Comparator<Number> {};
    comparaDouble(1.0, 2.0, comparator)
}
