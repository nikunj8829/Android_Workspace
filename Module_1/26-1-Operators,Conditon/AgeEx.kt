fun main()
{
    println("Enter Your Age : ")
    var age= readLine()!!.toInt()
    //var age =40

    if (age>=18)
    {
        println("Eligible to vote")

        if (age>=60)
        {
            println("You Are Under Senior Citizen Category")
        }
        else
        {
            println("You Are Under Young Category")
        }
    }
    else
    {
        println("Not Eligible to vote")
    }
}