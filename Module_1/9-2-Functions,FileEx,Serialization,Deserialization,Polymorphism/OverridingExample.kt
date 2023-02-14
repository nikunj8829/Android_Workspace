open class Bank8
{
    open fun rate():Int
    {
        return 0
    }
}
class Sbi :Bank8()
{
    override fun rate():Int
    {
        return 7
    }
}
class Icici :Bank8()
{
    override fun rate():Int
    {
        return 8
    }
}
class Axis :Bank8()
{
    override fun rate():Int
    {
        return 9
    }
}

fun main()
{

    var b = Bank8()

    b = Sbi()
    println(b.rate())
    b = Icici()
    println(b.rate())
    b=Axis()
    println(b.rate())

}
