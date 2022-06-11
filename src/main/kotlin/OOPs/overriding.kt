package OOPs
/*
to make something overridable - use open
to actually override open variables/methods - use override
 */
fun main(args: Array<String>) {
    var animal = Animal()
    animal.eat()
    var cat = Cat()
    cat.eat()
    var dog = Dog()
    //this will first execute the eat method in parent class
    dog.eat()
}

open class Animal {
    open var name = "animal"
    open fun eat() {
        println("${name} - Animal is eating")
    }
}

class Cat: Animal() {
    override fun eat() {
        println("${name} - Cat is eating")
    }
}

class Dog: Animal() {
    override var name = "Fluffy"
    override fun eat() {
        super<Animal>.eat()
        //<Animal> is included so that we let the compiler know that we want the eat method from animal class.
        // this is not required in this situation because there is no other eat method.
        // But, in case this class is also inheriting from an interface which also happens to have an eat() methos, then we require this.
        println("${name} - Dog is eating")
    }
}