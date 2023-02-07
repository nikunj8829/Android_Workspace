class DefaultConstructorUsingbyUser(var n1:Int,var n2:Int)
{
    fun data()
    {
        println("Enter num1 :")
        var n1= readLine()!!.toInt()

        println("Enter num2 :")
        var n2= readLine()!!.toInt()

        var n3=n1+n2
        println("Sum of num1 and num2 is : $n3")
    }
}
fun main()
{
    var a1=DefaultConstructorUsingbyUser(2,5)
    a1.data()

}