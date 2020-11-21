fun main(){
    val names= listOf<String>("Alex", "Ngure", "Mary","Emmah","Felish","Naomi")
    val result= names.filterNot {it.contains("a") }
    println(result)
    println("..........................")

    val results= names.filter { it.contains("a") }
    println(results)
}