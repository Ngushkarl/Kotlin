fun main(){
    val  items = listOf(1, 2, 3, 4, 5)
    items.forEach{println(it)}

     val users = listOf(
         User7("Alex", " Ngure"),
         User7("Emmah", " Wairish")
         )
     users.forEach{ println(it)}
    val first =users.first()
    println(first)

    val name:String? = null
    val stuff = if (name==null) emptyList() else listOf(name)

   val kj= users.firstOrNull()
    println(kj)

}
