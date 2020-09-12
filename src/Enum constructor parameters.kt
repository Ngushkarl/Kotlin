fun main(){
println(AccountType2.PLATINUM)
    println("The member has ${AccountType2.PLATINUM} Account type with a discount percentage of" +
            " ${AccountType2.PLATINUM.discountPercentage} with ${AccountType2.PLATINUM.numberOfSubscriptions} subscriptions")
    var acc =AccountType2.valueOf("Gold".toUpperCase())
    println("The upcoming member has $acc Account type with a percentage discount of" +
            " ${AccountType2.GOLD.discountPercentage} with ${AccountType2.GOLD.numberOfSubscriptions} number of subcriptions")
}

enum class AccountType2(val discountPercentage:Int, val numberOfSubscriptions:Int){
    BRONZE(discountPercentage = 10, numberOfSubscriptions = 1),
    SILVER(discountPercentage = 15, numberOfSubscriptions = 5),
    GOLD(discountPercentage = 20, numberOfSubscriptions = 10),
    PLATINUM(discountPercentage = 25, numberOfSubscriptions = 15)

}