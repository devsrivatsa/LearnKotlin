package languageFeatures

/*
Kotlin functions are first-class, which means they can be stored in variables and data structures,
and can be passed as arguments to and returned from other higher-order functions.
You can perform any operations on functions that are possible for other non-function values.

A higher-order function is a function that takes functions as parameters, or returns a function.
*/

fun main(args:Array<String>) {
    val test:String = "Hello"
    val myLambda: (Int) -> Unit = { s:Int -> println(s) }
}