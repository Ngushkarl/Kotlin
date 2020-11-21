import kotlin.math.min

fun main(){
    val mine= listOf("Apples", "Grapes")
    val theirs= listOf("Oranges","Pears","Strawberries")
    val others= listOf("Kiwi","Watermelon")

    val result= mine.plus(theirs).plus(others)
    println(result)

    println(",,,,,,,,,,,,,,,,,,,,,,,,,")
    println("''''''''''''''''''''''''''''''")
    val newresult=result.minus(theirs)
    println(newresult)
    println("/////////////////////////////////")

    val new= result.minus("Kiwi")
    println(new)
}