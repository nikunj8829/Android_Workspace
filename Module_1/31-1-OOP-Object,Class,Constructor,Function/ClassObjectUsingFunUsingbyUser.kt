class ClassObjectUsingFunUsingbyUser
{

    var name=""
    var email=""


    fun getdata()
    {
        println("Enter Your Name :")
        name= readLine().toString()

        println("Enter Your Email :")
        email= readLine().toString()

    }
    fun display()
    {
        println("Your Name is : $name")
        println("Your Email is:$email")
        println("=======================================")
    }
}
fun main()
{
   var a1=ClassObjectUsingFunUsingbyUser()
    a1.getdata()

    var a2=ClassObjectUsingFunUsingbyUser()
    a2.getdata()

    var a3=ClassObjectUsingFunUsingbyUser()
    a3.getdata()

    a1.display()

    a2.display()

    a3.display()
}