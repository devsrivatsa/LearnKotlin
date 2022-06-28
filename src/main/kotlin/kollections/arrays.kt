package kollections

fun main(args:Array<String>) {
    //
    var myArray = Array<Int>(5){0} //initialize an array with 0
    println(myArray)

    var myArray2 = arrayOf(1,2,3,true,'c',"Hello World")
    for (i in 0..myArray2.size-1) println(myArray2[i])

    var myStrArray = arrayOf<String>("Dustin","Mike","Will","11")
    for (i in myStrArray) print("$i ")

    var intarr = intArrayOf(1,2,3)
    var floatarr = floatArrayOf(1.1f, 1.2f, 1.4f)

    var boolarr = booleanArrayOf(true, true, false, false)



    //getting and setting items
    println(intarr.get(2))
    intarr.set(2, 222)
    println(intarr.get(2))

}