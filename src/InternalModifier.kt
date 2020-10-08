import java.awt.Color

fun main(){
val v4= Vehicle4(Color.WHITE)
val T = Truck(Color.BLUE)
    println(v4.color)
    println(T.color)
v4.addAxle(4)
T.addAxle(10)

}
internal class Axle(numberOfWheels:Int){
    //........
}
open  class Vehicle4(val color:Color){
private lateinit var axles: Array<Axle>

fun addAxle(numberOfWheels: Int){
   addAxle(numberOfWheels)
}
}
class Truck(color: Color):Vehicle4(color){
    init {
        addAxle(2)
        addAxle(4)
    }
}