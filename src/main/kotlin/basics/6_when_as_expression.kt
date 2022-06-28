package basics

fun main(args: Array<String>) {
    val a = 14
    var res:String = ""

    res = when(a) {
        1 -> "value is low"
        2 -> "value is 2"
        3,4,5 -> "value is greater than 2 but less than 6"
        6,7,8,9,10 -> "value in 6, 7, 8, 9, 10"
        in 11..20 -> "value > 10 < 21"
        //!in 11..20 -> "value > 10 < 21"
        else -> "unknown value"
    }

    println(res)
}