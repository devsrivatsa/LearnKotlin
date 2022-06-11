package basics
fun forLoop(lim:Int) {
    for (i in 1..lim) print("$i ")
}

fun whileLoop(lim:Int) {
    var i: Int = 0
    while(i<lim) {
        print("$i ")
        i++
    }
}

fun forLoopsBreak() {
    for (i in 1..5) {
        for (j in 1..5) {
            println("$i $j")
            if (i == j) break
        }
        println("inner loop breaks as usual")
    }
}

fun labeledForLoopsBreak() {
    //now the break does not just happen in the inner loop but also outer loop
    myforloop@ for (i in 1..5) {
        for (j in 1..5) {
            println("$i $j")
            if (j==4) break@myforloop
        }
    }
    println("Outer loop has also been broken")
}

fun labeledForLoopsContinue() {
    myookLoop@ for (i in 1..5) {
        for (j in 1..5) {
            println("$i $j")
            if ((i%2==0) && (j%2==0)) continue@myookLoop
        }
    }
}

fun main(args: Array<String>) {
    labeledForLoopsContinue()






}