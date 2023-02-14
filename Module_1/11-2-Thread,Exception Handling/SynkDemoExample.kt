class Sender
{

    fun send(msg:String)
    {
        println("sending $msg")

        Thread.sleep(3000)

        println("$msg sent")
    }


}
class Threadsend(var msg:String,var sender:Sender) :Thread()
{
    override fun run()
    {
        synchronized(sender)
        {
            sender.send(msg)
        }

    }
}

fun main()
{
    var sender = Sender()
    var s1 = Threadsend("Hii", sender)
    var s2 = Threadsend("Byee",sender)

    s1.start()
    s2.start()
}