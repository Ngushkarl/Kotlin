fun main(){
 var uSer = uSer.createuSer("Alex", " Ngure")
    println(uSer)
    var uSers= uSer.createuSers(5)
    //println(uSers)
    uSers.forEach{println(it)}
}

class uSer(var firstName:String, var lastName:String){
     var uSers= mutableListOf<uSer>()
    fun createuSers(count: Int): List<uSer>{
        for (i in 0..count)
            uSers.add(uSer("FirstName$i", " LastName$i"))
        return uSers
    }

    companion object{
        fun createuSer(firstName: String,lastName: String):uSer{
            return uSer(firstName, lastName)
        }
    }
    fun fullName()= firstName + lastName
    override fun toString(): String {
        return fullName()
    }
}