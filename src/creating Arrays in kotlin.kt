fun main(){
    var item = arrayOf(1,2,3,4)
    item.forEach { println(it) }

    val users= arrayOf(
        User7("Alex", " Ngure"),
        User7("Emmah", " Wairimu")
    )
    users.forEach { println(it) }
    val updateUsers= users.plus(User7("James", " Kinyajui"))
    updateUsers.forEach { println(it) }

    val items = users.get(0)
    println()
    println(items)

    users.set(0, User7("foo", " bar"))
    val ite = users.get(0)
    println(ite)

    users.forEach { println(it) }

}