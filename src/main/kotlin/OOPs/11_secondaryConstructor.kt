package OOPs

class secondaryConstructor(name:String) {
    var age:Int = -1
    var name:String
    init {
        this.name = name;
        println("This block always executes first, and the name btw is ${this.name}")
    }
    //cannot declare var name or var age inside secondary constructor
    constructor(name: String, age:Int): this(name) {
        this.age = age
        println("the name of the person is ${this.name} and he is ${this.age} years old")
    }
}


fun main(args: Array<String>) {
    var i = secondaryConstructor("srivatsa", 29)
    var j = secondaryConstructor("__sri__")
}