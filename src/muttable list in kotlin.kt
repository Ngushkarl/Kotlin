fun main(){
    val items= mutableListOf(1, 2, 3, 4, 5)
    items.forEach { println(it) }
    println()
    items.add(6)
    items.forEach { println(it) }
    println()
    items.remove(1)
    items.forEach { println(it) }
    println()

    items.removeAt(3)
    items.forEach { println(it) }
     

}