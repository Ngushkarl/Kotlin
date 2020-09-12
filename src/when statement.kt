fun main(){
  var usere= userer("Alex"," Ngure")

 usere.fullName()

   /* if (usere.Firstname=="Alex"){
        println("These is Alexander")
    }else{
        println("This is not Alex")
    }*/

    when(usere.Firstname ){
        "Alex"->{
            println("this is Alexander")
        }else->{
        println("This is not Alex")
    }
    }
}
class userer (var Firstname:String, var Lastname:String){

    fun fullName(){
        println(Firstname + Lastname)
    }
}