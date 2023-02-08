open class bank
{
    fun bank()
    {
        println("Banking")
    }
}
class saving :bank()
{
  fun save()
  {
      println("Saving")
  }
}
class current:bank()
{
 fun current()
 {
     println("Current")
 }
}
fun main()
{
    var s1=saving()
    var c1=current()
    s1.save()
    c1.current()
    s1.bank()

}