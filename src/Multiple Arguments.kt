fun main(){
BookInfo( "Ham and Eggs",  "Alex Ngush", "Ngush Karl")
}
 fun BookInfo(title: String,  vararg Authors: String){ // vararg in full is variable arguments
     println("$title, Authors: ")
     Authors.forEach { println(it) } // these means that for each of the authors print each of them in a new line
 }