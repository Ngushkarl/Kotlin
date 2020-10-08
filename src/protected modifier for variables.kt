fun main() {
    var p = Person2(name="Alex", Age = 21)
    p.printMyFavouriteFood()
    //p.favouriteFood= "githeri"
    /* the val p now can't be able to access the favourite food property bcoz of the
    protected modifier in the favourite food variable
     */
    val c= Chef("Ngure", 23, "Rice")

    c.printMyFavouriteFood()
    c.setMyFavouriteFood("ribs")
    c.printMyFavouriteFood()


}
/* These is so important in development when one wants to exclude some of the
users from accessing certain features maybe in a game
 */

open class  Person2(val name:String, val Age:Int){// "open" keyword is used so that the class can be extended
    protected var favouriteFood= "Unknown"

    fun printMyFavouriteFood(){
        println(favouriteFood)
    }
}

class Chef(name: String, Age: Int, favFood:String):Person2(name, Age){// these is called extending the person class coz of inheritance
    init {
        favouriteFood=favFood
}
    fun setMyFavouriteFood(food:String){
        favouriteFood= food
    }
}