fun main(){
val person = Persond(FirstName = "Alex", LastName = "Ngure", Age = 21)
    println(person)
val sibling =person.copy(FirstName = "James", Age = 30)
    println(sibling)

val order = Order(100, person)
    println(order)
val order2= order.copy(Customer = sibling)
    println(order2)
}
data class Persond(val FirstName:String, val LastName:String, val Age:Int)
data class  Order(val Amount:Int, val Customer:Persond)
