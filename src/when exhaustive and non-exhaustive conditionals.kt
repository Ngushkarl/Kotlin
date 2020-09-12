fun main(){
    var accountTypeFromAPI= accounttyPes3.valueOf("pink".toUpperCase())

    //non-exhaustive statement example
     when(accountTypeFromAPI){
        accounttyPes3.BRONZE->{
           println("Silver Access granted ")
    }else-> println("Access Denied")}

    // exhaustive statement example
   val message= when(accountTypeFromAPI){
        accounttyPes3.PLATINUM->{
            "Platinum Access Granted"
        }
       accounttyPes3.GOLD->{
           "Gold Access Granted"
       }
       accounttyPes3.SILVER->{
           "Silver Access Granted"
       }
       accounttyPes3.BRONZE->{
           "Bronze Access Granted"
       }else->"Account type doesnot exist"
    }
println(message)
}

enum class accounttyPes3{
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM,
    PINK
}