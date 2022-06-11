package basics
/*
infix functions can be called like this 7 isSmaller 8
infix functions can only have one argument
infix functions can be an extension function, but not all extension functions can be infix
*/


infix fun Int.isSmaller(i:Int):Boolean {
    if (this < i) return true
    else return false
}

fun main(args:Array<String>) {
    println("Is 7 smaller than 8 ? ${7 isSmaller 8}")
}