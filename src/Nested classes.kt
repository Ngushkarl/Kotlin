fun main(){
    var vh = Vehicle()
    vh.info()

    var sw = Vehicle.steeringWheel()
    sw.description()

    var transmission = Vehicle.steeringWheel.Transmission()
    transmission.type()
}
class Vehicle(){
    var brand= "Lorry"
    fun info(){
        println(brand)}

    class steeringWheel(){
        var type= "right handed"
        fun description()= println("The lorry is $type")

        class  Transmission(){
           var shaft= "Automatic"
            fun type()= println("the lorry is $shaft")
        }
    }
}