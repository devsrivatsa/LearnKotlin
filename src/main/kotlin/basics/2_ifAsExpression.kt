package basics



fun main(args: Array<String>) {
/*
If condition
*/
    var a = 6
    var b = 8

    if (a > b) println("$a is greater than $b")
    else println("$b is greater than $a")

/*
If expression
*/

    var gt = if (a > b) {
        a
    } else {
        b
    }

    println(gt)
}