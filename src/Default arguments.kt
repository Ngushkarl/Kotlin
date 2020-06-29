
//using the daefault arguments
fun main(){
    printUserInfo(firstName = "Alex", lastName ="Waweru", age = 21, isSunburned =false//, likesMovies = true  > letting the dafault values to take control
        /* , lovesPopcorn=true*/)
    printUserInfo(firstName = "James", lastName ="Waweru", age = 21, isSunburned =false, likesMovies = false// using advantage of default vales to chenge the value
        /* , lovesPopcorn=true*/)// these all is replaced by the default argument in the bellow argument down here instead of reapeating
    printUserInfo(firstName = "John"/*, lastName ="Waweru"*/, age = 21, isSunburned =false//,likesMovies = true
        /*, lovesPopcorn=true*/)
                    //default value to replace something not mentioned
}
fun printUserInfo(firstName: String, lastName: String = "Wilson", age: Int, isSunburned: Boolean, likesMovies: Boolean = true, lovesPopcorn: Boolean = true){
    println("$firstName $lastName is age of $age. Sunburned: $isSunburned, likes movies: $likesMovies, loves popcorn: $lovesPopcorn")


}


