class Us (var FName: String="", var LName:String= " Ngure") {
    fun full():String= FName+LName


    fun fullLength(): Int{
        return full().length
    }
}