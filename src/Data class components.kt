fun main(){
val P1= Persons("Alex","Ngure", 21)
    println(P1.component1())
    println(P1.component2())
    println(P1.component3())

}
data class Persons(val firstName:String, val lastName:String, val Age:Int)