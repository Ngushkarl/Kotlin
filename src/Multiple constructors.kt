fun main(){
    var Use = User2(FName = "Alex", LName = "Ngure", isPlatinum = true)

    Use.userInfo()
    Use.updateName(newName = "Waweru")
    Use.userInfo()

    var Friend= User2(FName = "Naomi", LName = "Muthoni")

    Friend.userInfo()
    Friend.printFNameLenth()

    var Best= User2("Nick")

}

