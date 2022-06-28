package OOPs

fun main(args:Array<String>) {

}

//abstract class just provides a structure for derived classes
// We cannot instantiate an abstract class, and therefore they do not have constructors
abstract class Person {
    // abstract variables cannot be instantiated
    abstract var name:String;

    //function is by default final and public in nature
    //abstract functions and classes are by default open in nature, and therefore we do not need to specify open
    abstract fun goToSchool()
    abstract fun getHeight()
    open fun goToWork() {
        println("Hey i am open to be modified")
    }
}
/*
The class that extends an abstract class must override all the abstract methods.
Note that we do not need to implement goToChurch method because it is not abstract
*/
class Indian: Person() {
    override var name = "Shankaran Pillai"
    override fun goToSchool() {
        println("Going to Indian school..");
    }

    override fun getHeight() {
        println("5 feet 6 inches")
    }
}