fun main(){
  val  p3= Person3(name = "Alex", age = 32)
val c3= Person3.Chef3("Ngure", 20, "potatoes")
  c3.setMyFavouriteFood("Gatheri")


}



open class Person3(val name:String, val age:Int){
  protected var favouriteFood= "Unkown"

  protected  fun printMyFavouriteFood(){
        println(favouriteFood)
    }
 open class Chef3(name: String, age: Int, favFood:String):Person2(name,age){
      init {
          favouriteFood =favFood
      }
      fun setMyFavouriteFood(food:String){
          favouriteFood=food
          printMyFavouriteFood()
      }

  class SousChef(name: String, age: Int,favFood: String):Chef3(name, age, favFood){
      init {
          printMyFavouriteFood()
      }
  }
  }
}