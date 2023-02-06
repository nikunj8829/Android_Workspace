class SquareCube
{
    var number=1
    var square=1
    var cube=1

    fun getdata()
    {
       println("Enter Any Number : ")
        number = readLine()!!.toInt()
        square = number*number
        cube = number*number*number
    }

    fun display()
    {
        println(square)
        println(cube)
    }


}
fun main()
{
    var s1=SquareCube()
    s1.getdata()
    s1.display()

    var s2=SquareCube()
    s2.getdata()
    s2.display()

}