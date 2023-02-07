//Constructor

class ConstructorEx(var name:String,var email:String,var city:String,var mobilenumber:Int)

{



    //function

    fun display()
    {
        println("Your Name is:$name")
        println("Your Email is:$email")
        println("Your City is:$city")
        println("Your MobileNumber is:$mobilenumber")
        println("============================================")
    }



}
fun main()
{
    // object create

    var a1=ConstructorEx("nikunj","niku@8829","junagadh",972774882)
    var a2=ConstructorEx("dush","dush@8829","jamnagar",989897879)
    var a3=ConstructorEx("mayur","mr@8829","vapi",978784587)
    a1.display()
    a2.display()
    a3.display()

}