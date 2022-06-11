package basics

// now the i
fun Int.isGreater(i:Int):Boolean {
    if (this > i) return true
    else return false
}

fun main(args:Array<String>) {
    println("Is 7 greater than 8 ? ${7.isGreater(8)}")
}