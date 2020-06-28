import com.sun.org.apache.xpath.internal.operations.Bool

fun main(){
    printUserInfo(firstName = "Alex", lastName ="Waweru", age = 21, isSunburned =false, likesMovies = true , lovesPopcorn=true)

}
fun printUserInfo(firstName: String, lastName: String, age: Int, isSunburned: Boolean, likesMovies: Boolean, lovesPopcorn: Boolean){
    println("$firstName $lastName is age of $age. Sunburned: $isSunburned, likes movies: $likesMovies, loves popcorn: $lovesPopcorn")
    

}