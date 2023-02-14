class ArrayExUserInput
{

    fun detail()
    {

        var data = IntArray(5)

        for(i in 0..4)
        {
            println("Enter Your Number for Index : $i")
            var data2= readLine()!!.toInt()
            data[i]=data2

        }
        for(i in 0..4)
        {

            data[i]
            println(data[i])
        }


        /*
            data[0]=10
            data[1]=20
            data[2]=30
            data[3]=40
            data[4]=50
            //data[5]=60
        for(i in data)
        {
            println(i)
        }*/


    }
}

fun main()
{
    var a1 = ArrayExUserInput()
    a1.detail()

}
