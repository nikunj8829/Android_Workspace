class SquareCubeUsingFunction
{
    var num=1
    var square=1
    var cube=1

    fun detail()
    {
        println("Enter Any Number :")
        var num= readLine()!!.toInt()

        square=num*num
        cube=num*num*num

    }
    fun display()
    {
       println(square)
       println(cube)
    }
}
fun main()
{
    var a1=SquareCubeUsingFunction()
    a1.detail()
    a1.display()



    var a2=SquareCubeUsingFunction()
    a2.detail()
    a2.display()
}