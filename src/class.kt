fun main(){
    val fName= "Alex"
    println(fName::class)

   val lName: String= "Ngure" // used when one wants to specify the thpe of variables to be used

    //Data Types
    val myByte: Byte = 8 // 8-bit signed interger
    val myShort: Short = 16 //16-bit signed integer
    val myInt: Int = 32// 32-bit signed integer
    val myLong: Long = 64 //64-bit signed integer
    //decimals
    val myFloat: Float = 32.00F// 32-bit floating point number
    val myDouble: Double = 64.00//64-bit floating point number

     println(myByte.toLong()::class)

    val biglong = 1_000_000// the underscores are for easy reading
    println(biglong)

    val newInt = myInt.plus(12)// or myInt + 12 is the the same
    println(newInt)
    val nMinus = myInt.minus(7)// or myInt - 7
    println(nMinus)
    val nDiv= myInt.div(  3)//0r myInt/3
    println(nDiv)

    var fuName = "Alexander Ngure"
    println(fuName.toUpperCase() )
    println(fuName.decapitalize())//will only decapitalize the first lettter  ie "A"
    println(fuName.length)

     val c: Char = 'x'//character  which is 16-bit unicode character
}