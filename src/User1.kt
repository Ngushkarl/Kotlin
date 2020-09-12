class User1 (var FName: String="", var LName:String= "Ngure"){//constructor and with constructor one can set default values ngure

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