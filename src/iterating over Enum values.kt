fun main(){
   /* for (customertype in custTypes.values() )
        println(customertype)*/
    //or
    custTypes.values().forEach { println(it) }
}
 enum class custTypes(){
     BRONZE,
     SILVER,
     GOLD,
     PLATINUM
 }