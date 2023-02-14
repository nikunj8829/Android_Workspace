class nik1 :Runnable
{
    override fun run()
    {
        for(i in 1..10)
        {
            println("Thread A: $i")
        }
    }

}
class  nikunj1 :Runnable
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
    var t1 = Thread(nik1())
    var t2 = Thread(nikunj1())

    t1.start()
    t2.start()

}
