class User4 (var FName: String="", var LName:String= " Ngure"){//constructor and with constructor one can set default values ngure
var FullName = FName+LName// or"$FName $LName"
    init {
        println("init block")
        println("These class belongs to $FullName")
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