open class a1
{
    fun a1()
    {
        println("A1 Executed")
    }
}

interface  b1
{
    fun b1()
    {
        println("B1 Executed")
    }
}

open class c1:a1(),b1
{
    fun c1()
    {
        println("C1 Executed")
    }
}

class d1:c1()
{
     fun d1()
     {
       println("D1 Executed")
     }
}



fun main()
{

    var e=d1()
    e.d1()
    e.c1()
    e.b1()
    e.a1()

}