interface n
{
   fun n1()
    {
     println("N1 Executed")
    }
}
interface m
    {
        fun m1()
        {
            println("m1 Executed")
        }
    }
class o:n,m
     {
         fun o1()
         {
             println("o1 Executed")
         }
     }
fun main()
{
  var y=o()
    y.n1()
    y.m1()
    y.o1()
}