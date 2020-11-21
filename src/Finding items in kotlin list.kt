fun main(){
    val names= listOf<String>("Alex", "Ngure", "Mary","Emmah","Felish","Naomi")
    val result = names.first { it =="Alex" }
    println(result)
    println("______________________")

    val result2= names.find{ it.toLowerCase().contains('a')}
    println(result2)

}