fun main()
{

    println("Enter Year")

    var leapyear= readLine()!!.toInt()

    if (leapyear%4==0)
    {
        println(" Year Is LeapYear:$leapyear")
    }
    else
    {
        println("Year Is Not Yeapyear:$leapyear")
    }
}