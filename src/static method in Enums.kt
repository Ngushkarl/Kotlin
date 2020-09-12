fun main(){
    var acctype = acTypes.getAccountTypeByName("Bronze")
    println(acctype)
}

enum class acTypes(){
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM;

    companion object{
        fun getAccountTypeByName(name:String)= valueOf(name.toUpperCase())
    }
}