package kollections.immutable

//inherits from Collection
//immutable
//supports only read operations
//elements are placed in the order in which they were inserted

fun main(args:Array<String>) {
    val myList: List<Int> = listOf<Int>(5,6,7,8,9)
    for (e in myList) print("$e ")
    println()
    val varietyList = listOf(1,2,'3',"four",listOf(9,8,7))
    for (i in 0..varietyList.size-1) {
        print("$varietyList[i] ")
    }

    val list: List<Any> = listOf<Any>('E', '=', 'M', "C squared", 911, 1947.11)
    println()
    println(list.get(3))
    println(list.indexOf("C squared"))
    println(list.lastIndexOf('='))

    //contains an element or not + sublist
    println(list.contains('='))
    println(list.containsAll(list.subList(1,4)))

    //dropping elememnts returns new list
    println(list.drop(3)) //drop 3 elements from beginning
    println(list.dropLast(3)) //drop 3 elements from end

    //creating an iterator
    for (i in list.dropLast(2).listIterator()) print("$i")
    println()
    for (i in list.listIterator(4)) print("$i ")

    println()
    //is empty or not
    println(list.isEmpty())
    println(list.isNotEmpty())
}