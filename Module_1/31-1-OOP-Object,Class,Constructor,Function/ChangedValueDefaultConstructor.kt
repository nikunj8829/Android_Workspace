//Default Constructor

class ChangedValueDefaultConstructor(var num1:Int,var num2:Int)
{

    fun data()
    {
        var num=num1+num2
        println(num)
    }
}
fun main()
{
    var a1=ChangedValueDefaultConstructor(2,5)
    var a2=ChangedValueDefaultConstructor(8,5)
    a1.data()
    a2.data()
}