class ClassObjectUsingFun //class
{
    // variable- Data Member

    var name=""
    var email=""

    //function

    fun display()
    {
        println("Your Name is :$name")
        println("Your Email is :$email")
        println("==================================")

    }
}
fun main()
{
   var a1=ClassObjectUsingFun()
    a1.name="nikunj"
    a1.email="nik8829@gmail.com"

    var a2=ClassObjectUsingFun()
    a2.name="dush"
    a2.email="dush4455@gmail.com"

    var a3=ClassObjectUsingFun()
    a3.name="mihir"
    a3.email="mihir@gmail.com"

    var a4=ClassObjectUsingFun()
    a4.name="nik"
    a4.email="nik@gmail.com"

    a1.display()

    a2.display()

    a3.display()

    a4.display()
}