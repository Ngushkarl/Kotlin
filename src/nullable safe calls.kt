fun main(){
    var firstName: String = "Ngure"// non nullable String
    val length1 = firstName.length

    println(length1)

    var lastName:String? = "Wilson"// nullable string bcoz of "?"
    val length2 = lastName?.length// ? these is a null safety call and it returns either null of the number of characters
    val  length3 = if(lastName != null) lastName.length else 0

    val length4 = lastName?.substring(0,2)?.length// .subString() is used to grab the of character eg the first to characters
   val length5 = lastName?.substring(0,5)?.drop(2)?.substring(2,3)?.length
    println(length2)
    println(length3)
    println(length4)
    println(length5)
//NB for one to be able to reasign a variable one must add the elvis operator at the end of the data type  to make it nullable i.e
    //var name:String = "Ngure" (these is nun non-nullable and cannot be reasigned)
    //var fName:String?= "Alex" (these is nullable variable and can be reasigned)

    var name:String?// elvis operator here
     = "name"
    name = null// an error appers since that we cannot reasin  a non nullabe parrametter with a null
    //so to dothat we must use an elvis operator ie
    name =null

}