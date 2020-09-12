fun main(){
    doWork(19, "Ngure")
    doWork(22, "Ken")
}
 fun doWork(age: Int, name: String){
     println("$name, you are $age old.")

    if (age<21){
        println("$name, you are not old enough, your are $age")
    }else{
        println("")
        println("$name, You are old enough to use the app you are $age")
    }
 }