package kollections.mutable

// dynamic list
// supports both read and write operations
// supports all methods from list, mutableList and much more

fun main(args:Array<String>) {
    // creating an empty arraylist
    var al1:ArrayList<Any> = ArrayList<Any>();

    //creating a list of fixed length
    var celebrities = ArrayList<String>(4);

    //adding elements
    celebrities.add("Rihana")
    celebrities.add("Alan Walker")
    celebrities.add("Tailor Swift")
    celebrities.add("Justin Bieber")

    al1.addAll(1..20)
    println(al1)

    //getting and setting elements
    al1.get(0)
    al1.set(0,celebrities.get(1))
    al1.set(10,celebrities.get(3))
    al1.set(7,celebrities.get(2))
    println(al1)



    //conditional remove
    al1.removeIf({elm:Any -> elm in celebrities})
    println(al1)

    //convert to simple array
    println(al1.toArray())

    //iterator
    val iter = al1.listIterator()
    while(iter.hasNext()) {
        print(iter.next())
    }
    println()
    println(al1)

}