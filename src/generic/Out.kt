package generic

/**
 * 协变：如果A是B的子类型，那么Producer<A>就是Producer<B>的子类型
 *
 *
 */
open class Animal {
    fun feed() {
        println("Animal feed")
    }
}


class Herd<out T : Animal>(val list: List<T>) {

    val size: Int get() = 10
    operator fun get(i: Int): T = list[i]

}

fun feedAll(herd: Herd<Animal>) {
    for (i in 0 until herd.size) {
        herd[i].feed()
    }
}


class Cat : Animal() {
    fun clean() {
        println("Cat clean")
    }
}

fun takeCareCat(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        cats[i].clean();
    }
    //不增加out协变会报错，提示cats不是Herd<Animal>
    feedAll(cats)
}

fun main(args: Array<String>) {
    val cats = Herd(listOf(Cat(), Cat()));
    takeCareCat(cats);
}