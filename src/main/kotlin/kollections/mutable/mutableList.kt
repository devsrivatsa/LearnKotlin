package kollections.mutable

// mutable data structure
// supports read and write operations
// supports all methods from immutable list

fun main(args:Array<String>) {
    var mlist = mutableListOf("red", "blue", "green", "orange")
    for( elm in mlist) print("$elm ")

    println()
    //adding elements
    mlist.add("yellow")
    mlist.add("violet")
    for (i in 0..mlist.size-1) print("${mlist[i]} ")
    println()

    //declaring an empty list is only possible if the type is pre determined
    var mlist2 = mutableListOf<Any>()
    mlist2.add("breeze")
    mlist2.add("pirates of the caribbean")
    mlist2.add(0, 100)

    //various functions

    //adding another collection; modifies list in place
    mlist2.addAll(mlist)
    println(mlist2)

    //remove an element - will return true or false & modifies list in place
    print("after removing orange: ")
    mlist2.remove("orange")
    println(mlist2)

    //remove an element by index and returns that element
    mlist2.removeAt(5)
    print("after removing eml at index 5: ")
    println(mlist2)

    //remove last
    mlist2.removeLast()
    print("after removing last element: ")
    println(mlist2)


    val colors = mutableListOf<String>("red", "blue", "yellow")
    mlist2.retainAll(colors)
    print("Retaining colors only: ")
    println(mlist2)


    mlist2.clear()
    println(mlist2)
}