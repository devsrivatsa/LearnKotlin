package basics

fun main(args: Array<String>) {
    val a = 14
    when(a) {
        1 -> println("value is low")
        2 -> println("value is 2")
        3,4,5 -> println("value is greater than 2 but less than 6")
        6,7,8,9,10 -> println("value in 6, 7, 8, 9, 10")
        in 11..20 -> println("value > 10 < 21")
        //!in 11..20 -> println("value > 10 < 21")
        else -> println("unknown value")
    }
}