fun additoin4()
{
    println("Enter Firest Number:")
    var a= readLine()!!.toInt()

    println("Enter Second Number:")
    var b= readLine()!!.toInt()

    var c=a+b
    println(c)
}
fun main()
{
    for (i in 1..2)
    {
    additoin4()
    }
}