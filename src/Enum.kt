fun main(){
var AccountTypeFromApi= "gold"
    var accountType= AccountType.valueOf(AccountTypeFromApi.toUpperCase())
    var user12 =User12("Alex", " Ngure", AccountType.PLATINUM)
println(user12)
}
enum class AccountType(){
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM
}

 class User12(var FirstName:String, var LastName:String, var accounttype:AccountType= AccountType.BRONZE){

     //var accounttype:AccountType= AccountType.BRONZE

    fun fullName(): String= FirstName+ LastName
    override fun toString(): String {
        return fullName()
    }

}