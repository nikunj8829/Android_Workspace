class myfirstclass()
{
    fun passed(marks:Int):Boolean
    {
      return marks>30
    }
}
fun main()
{
   var m1=myfirstclass()
    println("pass status:"+m1.passed(14))
    println("Scholership status:"+m1.isscholer(60))
}
//extension function

fun myfirstclass.isscholer(marks:Int):Boolean
{
    return marks>35
}