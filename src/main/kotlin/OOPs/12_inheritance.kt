package OOPs
/*
By default all classes in kotlin as public and final in nature.
therefore we cannot inherit anything.
Inorder to inherit, we have to make the class open
*/
open class Inheritance  {
    var life:Boolean = true
}

class DerivedClass: Inheritance() {
    init {
        println("is alive ? -- > ${this.life}")
    }
}

fun main(args: Array<String>) {
   var a = DerivedClass()
}