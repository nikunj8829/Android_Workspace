class checkdata
{
    fun detail()
    {
        //logic
        try
        {
          var num=25/0
          println(num)
        }
        //Error
        catch (e:Exception)
        {
            e.printStackTrace()
        }
        finally
        {
         println("Executed")
        }
    }
}
fun main()
{
   var a=checkdata()
    a.detail()
}