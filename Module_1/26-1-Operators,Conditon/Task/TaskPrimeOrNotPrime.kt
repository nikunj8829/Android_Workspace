fun main()
{

    println("Enter Your Number : ")
    var number = readLine()!!.toInt()

    var result = false

    for (i in 2..number / 2)
    {
        // not prime condition

        if (number % i == 0)
        {
            result = true
        }
    }
    if (result)
    {
        println("Prime")
    }
    else
    {
        println("Not Prime")
    }
}