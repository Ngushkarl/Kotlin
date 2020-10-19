class User7(var  FirstName:String, var LastName:String) {

    companion object {
        val User9 = mutableListOf<User7>()
        fun createUser9(count: Int): List<User7> {
            for (i in 0..count) {
                User9.add(User7("FirstName$i", " LastName$i"))
            }
            return User9
        }

        fun createUser(FirstName: String, LastName: String): User7 {
            return User7(FirstName, LastName)
        }
    }

    fun fullName(): String = FirstName + LastName
    override fun toString(): String {
        return fullName()
    }

}