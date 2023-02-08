fun addition3():Int
{
    println("Enter Firest Number: ")
    var a= readLine()!!.toInt()
    println("Enter Second Number: ")
    var b= readLine()!!.toInt()

    var c=a+b

    return c
}



fun main()
{
     println(addition3())
}