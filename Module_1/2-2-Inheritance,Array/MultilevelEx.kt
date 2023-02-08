open class p
{
   fun p1()
   {
       println("P Executed")
   }
}

open class q:p()
{
    fun q1()
    {
        println("q Executed")
    }
}

open class r:q()
{
    fun r1()
    {
        println("r Executed")
    }
}

open class s:r()
{
    fun s1()
    {
        println("s Executed")
    }
}


fun main()
{
    var detail=s()
    detail.p1()
    detail.q1()
    detail.r1()
    detail.s1()
}