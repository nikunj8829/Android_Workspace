class LoopSquareAndCube
{
    var number=1
    var square=1
    var cube=1

    fun detail()
    {
        for (i in 5..50)
        {
            square=i*i
            cube=i*i*i

            println("square is $i is : $square")
            println("Cube is $i is :$cube")
            println("========================================")
        }
    }


}
fun main()
{
    var a1=LoopSquareAndCube()
    a1.detail()
}