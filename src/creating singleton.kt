fun main(){
println(FavouriteFood.name)

    FavouriteFood.name="Chapati"
    println(FavouriteFood.name)

    FavouriteFood.ingredients.add("salt")
    println(FavouriteFood.ingredients.first())

    doStuff()
    println(FavouriteFood.name)

    println(FavouriteFood.numberOfIngredients())
}
fun doStuff(){
    FavouriteFood.name="ThornMelon"
}


 object FavouriteFood{

     var name= "Gatheri"
     var ingredients = mutableListOf<String>()

     fun numberOfIngredients():Int{
         return ingredients.size
     }
 }