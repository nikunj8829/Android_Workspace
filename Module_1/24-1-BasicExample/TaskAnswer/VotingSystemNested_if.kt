fun main()
{
    println("Enter Your Age :")
    var age= readLine()!!.toInt()


    if (age>18)
    {
        println("Eligable to Vote")
        if (age>60)
        {
            println("You Are Under Sineor Citizion Category")
        }
        else
        {
            println("You Are Under Yung Category")
        }
    }
    else
    {
        println("Not Eligable to Vote")
    }
}