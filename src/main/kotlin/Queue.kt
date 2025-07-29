import java.util.LinkedList

fun main() {
    val queue = LinkedList<String>()
    // First In First Out

    queue.add("String")
    queue.add("Me")
    queue.add("Dung")
    println(queue)
    queue.remove()
    println(queue)
}