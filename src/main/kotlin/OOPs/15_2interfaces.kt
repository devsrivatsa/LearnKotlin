package OOPs

interface If1 {
    fun method1() {}
    fun method2() {
        println("this is method 2 implemented in interface 1");
    }
}

interface If2 {
    fun method1() {
        println("This is method 1 implemented in interface 2")
    }
    fun method2() {
        println("This is method 2 implemented in interface 1");
    }
}
//class implementing both interfaces
class Helper: If1, If2 {
    override fun method1() {
        // we can only call method 1 from IF1
        super<If1>.method1()
    }

    override fun method2() {
        super<If1>.method2()
        super<If2>.method2()
    }
}