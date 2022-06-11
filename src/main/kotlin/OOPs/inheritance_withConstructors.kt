package OOPs

fun main(args: Array<String>) {
   var d = Dog2("black", "Labrador")
}

open class Animal2(var color:String) {

}

class Dog2(color: String, var breed:String): Animal2(color) {
    init {
        println("This is a $color $breed")
    }
}

class Cow(color:String, sex:Char):Animal2(color) {
    constructor(color:String, sex:Char, weight:Double): this(color, sex) {
    }
}