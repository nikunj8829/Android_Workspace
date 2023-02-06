fun main()
{
    println("Enter Number :")
    var num= readLine()!!.toInt()

    when(num)
    {
        1->
        {
            println("Selected Language Is Gujrati")
        }
        2->
        {
            println("Selected Language Is English")
        }
        3->
        {
            println("Selected Language Is Hindi")
        }
    }
}