class MyFirstClass2
{
    fun haspassed(marks:Int):Boolean
    {
        return marks>35
    }


}
fun main()
{
    var m1 = MyFirstClass2()
    println("Pass Status :"+m1.haspassed(80))
    println("Scholarship Status: "+m1.isscholar(80))
}
//extension function
infix fun MyFirstClass2.isscholar(marks: Int):Boolean
{
    return marks>90
}