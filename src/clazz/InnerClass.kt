package clazz

class Outter {
    //内部类默认是java的 static class
    // 需要显示声明inner
    inner class Inner {
        fun getOuter(): Outter {
            return this@Outter;
        }
    }
}