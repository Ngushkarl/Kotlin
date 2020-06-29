fun main(){
    hi()
}
fun hi(){
    println("Hello friend")

    fun greetings(){
        println("how is codding")

       // happy() -------not recognised

        fun happy(){
            println("have awesome time codding") // creating function inside of each other and calling them after declaring them AND NOT before since they could not be recognized
        }
        happy()
    }
    greetings()
}