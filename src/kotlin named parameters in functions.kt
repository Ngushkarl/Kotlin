fun main() = printUserInfo (
    name = "Ngush",
    age = 21,
    likesMovies = true,
    likesReggae = true,
    hhhhCoding = true
)

fun printUserInfo(
    name:String,
    age: Int,
    likesReggae: Boolean,
    hhhhCoding: Boolean,
    likesMovies: Boolean
){
    println(message = "$name is $age, loves Reggae muzic: $likesReggae , likes codding:$hhhhCoding also likes Movies :$likesMovies.")
}