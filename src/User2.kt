
class User2 (var FName: String="", var LName:String= "Ngure" , var isPlatinum: Boolean){//constructor and with constructor one can set default values ngure

    constructor(FName: String, LName: String):this(FName = FName, LName = LName, isPlatinum = false){// the this() function is used to call the varibles in constructor
        println("isPlatinum is default False")
    }
    constructor(FName: String): this(FName, "Unknown") {
        println("i am th third constructor")

    }

    fun userInfo(){
        println("$FName $LName")
    }
    fun updateName(newName: String){
        FName = newName
    }
    fun printFNameLenth(){
        println(FName.length)
    }
}