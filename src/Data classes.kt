fun main(){
    val p1= Person("Alexander", "Ngure", 30)

    val p2= Person("Alexander", "Ngure", 30)
    val p3= Person()
    println("   $p1 \n      $p2")

    println(p1.fullName())

     p1.namelength()
    println(p3)
}
data class  Person(var Firstname:String= "First unknown", var LastName:String="last unkown", var Age:Int=0){
    fun fullName():String{
        return "$Firstname $LastName"
    }
    fun namelength(){
        println(fullName().length)
    }
}