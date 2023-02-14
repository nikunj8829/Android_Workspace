class nik : Thread()

{
    override fun run()
    {


        for(i in 1..10)
        {
            println("Thread A: $i")
        }
    }
}
class nikunj : Thread()
{
    override fun run()
    {


        for(i in 1..10)
        {
            println("Thread b: $i")
        }
    }
}
fun main()
{
   var s1=nik()
    var s2=nikunj()


    s1.start()
    s2.start()
}