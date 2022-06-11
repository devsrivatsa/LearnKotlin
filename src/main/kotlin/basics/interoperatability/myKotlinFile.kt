@file:JvmName("MyCustomKotlinFile")
package basics.interoperatability

fun fib(num: Int): Int {
    when(num) {
        0 -> return 0
        1,2 -> return 1
        else -> return fib(num - 1) + fib(num - 2)
    }
}

@JvmOverloads //this is essential because java does not support default arguments
fun findVolume(length:Double, width:Double, height:Double = 1.0): Double {
    return length * width * height
}

fun main(args: Array<String>) {
    println(fib(5))
}