fun main(){
   val usEr=usEr("Alexander", " Ngure")
    usEr.favouriteCity= "NYC"
    println(usEr.toString())

}

class usEr(var FName:String, var LName:String){
    lateinit var favouriteCity:String// these means later intilization meaning that i will intilize the favcity later but not know


    fun fullName()= FName + LName
    override fun toString(): String {
        return fullName() + "'s favourite city is $favouriteCity "
    }
}