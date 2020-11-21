fun main() {
    val approved = mutableListOf<String>("Coletta", "James")
    val names = listOf<String>("Alex", "Ngure", "Mary", "Emmah", "Felish", "Naomi")

        // names.filterTo(approved, { it.contains("a") })
   // println(approved)
    println()

    names.filterNotTo(approved, { it.contains("a") })
    println(approved)
}