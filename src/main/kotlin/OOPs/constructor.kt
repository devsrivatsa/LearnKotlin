package OOPs

//1st way to initialize a constructor
class Constructor(name:String, age:Int) {
    var name: String
    var age: Int
    init {
        this.name = name
        this.age = age
        println("the name of this person is ${this.name}")
    }
}

// 2nd way to initialize a constructor
class Student(var name:String, var course: String) {
    init {
        println("the name of the student is ${this.name}, and he specializes in ${this.course}")
    }
}


fun main(args: Array<String>) {
    var c = Constructor("Srivatsa", 29)
    var s = Student("Srivatsa", "artificial intelligence and machine learning")
}