package basics


fun main(args: Array<String>) {
    val a = 14
    var res:String = ""

    when(a) {
        1 -> res = "value is low"
        2 -> res = "value is 2"
        3,4,5 -> res = "value is greater than 2 but less than 6"
        6,7,8,9,10 -> res = "value in 6, 7, 8, 9, 10"
        in 11..20 -> res = "value > 10 < 21"
        //!in 11..20 -> res = "value > 10 < 21"
        else -> res = "unknown value"
    }

    println(res)
}