fun main(){
    val mine= listOf("Apples", "Grapes")
    val theirs= listOf("Oranges","Pears","Strawberries")
    val others= listOf("Kiwi","Watermelon")
    val allOfUs= listOf(mine,theirs,others)
    println(allOfUs)
    println(allOfUs.flatten())
    println()
    println()

    val mineArray = arrayListOf("Apples", "Grapes")
    val theirsArray= arrayListOf("Oranges","Pears","Strawberries")
    val othersArray= arrayListOf("Kiwi","Watermelon")
    val allOfUsArray= arrayListOf(mineArray,theirsArray,othersArray)
    println(allOfUsArray)
    println(allOfUsArray.flatten())
}