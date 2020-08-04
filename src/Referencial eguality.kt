fun main(){
    var a = person("Alex")
    var b =person("Alex")

    println(a!==b)
    // ===  referencial equality whivh is the same as ==
    //!== referencial inequality these means thta the two variables "person a nd b" do not share the same objects
}
class  person(var name: String)