fun main() {
    val stack = ArrayDeque<String>()
    stack.addFirst("Banana")
    stack.addLast("Cherry")
    stack.addFirst("Minus")
    stack.addLast("Dung")

    println(stack)                  // [Minus, Banana, Cherry, Dung]

    println("First element: ${stack.firstOrNull()}")  // First element: Minus
    println("Last element: ${stack.lastOrNull()}")    // Last element: Dung

    val poppedElement = stack.removeLast()
    println(poppedElement)                          // Dung
    println(stack)                                  // [Minus, Banana, Cherry]

    println(stack.isEmpty())    // false
}