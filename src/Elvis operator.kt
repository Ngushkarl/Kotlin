fun main(){
    var lastName: String? = "Ngure"
    //      var length: Int = lastName?.length// null/6 that why we get an error because the answer may not be a null
 //to eliminate the error we can use the following methods;
    //1.0 if statement method
    var length: Int = if (lastName != null) lastName.length else 0
     // using that we can get rid of elvis operator

    // 2.0 elvis operator
    var length2: Int = lastName?.substring(0,2)?.length ?: 0


    println(length)
    println(length2)
}