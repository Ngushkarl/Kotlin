fun main(){
  var Use = User()
    Use.FName= "Alexander"
    Use.LName= "Ngure"
    Use.userInfo()
    Use.updateName("Waweru")
    Use.userInfo()

    var Friend= User()
    Friend.LName= "Naomi"
    Friend.FName= "Muthoni"
    Friend.userInfo()
    Friend.printFNameLenth()

}
class User(){
    var FName: String= ""
     var LName: String= ""

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