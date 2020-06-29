fun main(){
    printUserInfo("Alexander")
    printUserInfo("Wilson", 45)
    printUserInfo("Jane", 34, true)
}
/*
fun printUserInfo(name: String){
println(name)
}
fun printUserInfo(name: String, age: Int){
    println("$name is $age old ")
}
fun printUserInfo(name: String, age: Int, likesFlowers: Boolean){// method averloading using function with same name but being used to perform different works
    println("$name is $age old and likes flowers $likesFlowers")
}
*/

        //these can be replaced by default argument as shown bellow

fun printUserInfo(name: String, age: Int = 0, likesFlowers: Boolean= true) {// method averloading using function with same name but being used to perform different works
    println("$name is $age old and likes flowers $likesFlowers")
}