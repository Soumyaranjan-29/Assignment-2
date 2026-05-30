//Higher-Order Function
 fun executeTwice(action: () -> Unit) {
    action()
    action()
}

fun main() {
    executeTwice {
        println("Hello World")
    }
}
