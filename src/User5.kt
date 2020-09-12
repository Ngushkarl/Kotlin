class User5 (var FName: String="", var LName:String= " Ngure") {
    //constructor and with constructor one can set default values ngure
    var FullName = FName + LName// or"$FName $LName"
    get() = "Full Name: $field" // these field is the varibale "FullName" is calling it is known as backing field
}