fun main()
{
    println("Enter Your Email :")
    var email= readLine()

   /*
    //equals example
    if (email!!.equals("nikunj@8829gmail.com"))
    {
        println("Already Exist")
    }
    else
    {
        println("Registaration Done")
    }*/

    //equals example
    if (email!="nikunj@8829gmail.com")
    {
        println("Registaration Done")
    }
    else
    {
        println("Already Exist")
    }
}