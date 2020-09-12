class User3 (var FName: String="", var LName:String= "Ngure"){//constructor and with constructor one can set default values ngure

     constructor(FName: String): this(FName, "Ngure"){
         println("the secondary constructor")// but these will be printed the last coz the init block will be executed first
     }
     init {
      println("hello one")   // init block is called after the primary constructor is called alwys ie after"User3()"
     }
    init {
        println("hello 2")// init blocks can be many in one function and may be be best when used for intialization
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