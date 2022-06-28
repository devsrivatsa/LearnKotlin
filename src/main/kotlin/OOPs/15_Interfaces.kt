package OOPs

// interfaces are usually used as listeners
// everything in an interface is abstract by nature
// everything is therefore open in nature and therefore is not final
// We cannot instantiate an interface and therefore they do not have constructors
interface MyInterfaceListener {
    var name:String // these are abstract by default
    fun onClick() {
        println("nothing happens")
    }
    fun onTouch() // these are abstract by default
}

class Button: MyInterfaceListener {
    override var name:String = "click here"
    override fun onClick() {
        println("something happens if you click me")
    }
    override fun onTouch() {
        println("""
            Even though click and touch are same things in android, 
            this method still needs to be implemented as 
            the button class implements an interface
        """.trimIndent())
    }

}

fun main(args: Array<String>) {
    var b:Button = Button()
    b.onClick()
    b.onTouch()
}