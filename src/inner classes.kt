fun main(){
    var myCar= Car()
  myCar.type= "Vitz"
    myCar.info()


  var sw=  myCar.Sterringwheel()
    sw.sl()

   var tr= myCar.Transmission()
    tr.io()

}
class  Car(){
    lateinit var type:String
    fun info()= println(type)

    inner class Sterringwheel(){
        var material = "laether"
        fun sl()= println("This is a $material sterring wheel")
    }
    inner class Transmission(){
        var tra= "automatic"
        fun io()= println("This car is $tra")
    }
   }