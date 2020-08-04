fun main(){

  //  var message: String= "Hello\nMy name is Ngure"//instead of using the new line line break one can use tripple quotes i.e """""""
    var message: String = """
        Hello world !
        My name is Ngure
    """.replaceIndent("****")
    //.trimIndent() this function is used to trim the indention(space before each sentence)
    //.replaceIndent("****") this function replaces the indent space with the asteric in each and every line i.e ****


    println(message)

    var name = "Alex"
    var age = 21
    println("$name your age is $age and you name is ${name.length} characters long" )// this is called String interpolation
}