package practice

class DelegateExample : A by FirstDelegate(), B by SecondDelegate() {
    override fun print1() {
        println("Delegate Override Print1")
    }

    override fun print2() {
        println("Delegate Override Print2")
    }
}

fun main() {
    val delegateExample = DelegateExample()
    delegateExample.print1()
    delegateExample.print2()
}

interface A {
    fun print1()
}

interface B {
    fun print2()
}

class FirstDelegate : A {
    override fun print1() {
        println("Print1")
    }
}

class SecondDelegate : B {
    override fun print2() {
        println("Print2")
    }
}