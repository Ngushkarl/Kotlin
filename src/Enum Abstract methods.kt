fun main(){
 val fromApi= "Platinum"
    var customertype = CustomersType.valueOf(fromApi.toUpperCase())
    println(customertype.calculateDiscountPercent())
}

enum class CustomersType() {
    BRONZE{
        override fun calculateDiscountPercent()= 5
           },
    SILVER {
        override fun calculateDiscountPercent()= 10
    },
    GOLD{
        override fun calculateDiscountPercent()= 15
    },
    PLATINUM{
        override fun calculateDiscountPercent()= 20
    };

    abstract fun calculateDiscountPercent():Int
}