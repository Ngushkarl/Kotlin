fun main() {
    val name = listOf<String>("Alex", "Montanah", "Mary", "Fellish", "Peter", "Ngure")
    val filtered = name.filter { it != "Alex" }
    println(filtered)

    println("----------------------")
    val filtered2 = name.filter { it.toLowerCase().contains('a') }
    println(filtered2)
    println("----------------------")

    val filtered3 = name.filter { it == "Mary" }
    println(filtered3)
    println("----------------------")

    val age = listOf(11, 20, 29, 18, 13, 14, 48)
    val adults = age.filter { it >= 18 }
    println(adults)
    println("----------------------")

    val children = age.filter { it < 18 }
    println(children)
    println("----------------------")

   
    }
