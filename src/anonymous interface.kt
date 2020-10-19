fun main(){
var button = Button()
    //this is anonymous implementation using inline
button.clickListner=object:onClickListner {
    override fun onClick() {
        println("this was clicked")
    }

}
    button.click()
}
/*  OR this is concrete implementation
class myListner:onClickListner{
    override fun onClick() {
        println("Button was Clicked")
    }*/


interface onClickListner{
    fun onClick()
}

open abstract class view{
 lateinit var clickListner: onClickListner
    fun click(){
        clickListner.onClick()
    }
}

class Button:view()
class Map:view()
