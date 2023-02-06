/*
1
12
123
1234
12345
*/
fun main()
{

    for (i in 1..5)
    {
        var  count=1

        for (j in 1..i)
        {

            print("$count")
            count = count+1
        }

        println()
    }
}

