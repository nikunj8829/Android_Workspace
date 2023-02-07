class ParameterizedConstructor
{
    constructor(n1:Int,n2:Int)
    {
        println("Your Fixed Deposite is Executed for 2 Years")
    }

    constructor(n1:Int,n2:Int,n3:Int)
    {
        println("Your Fixed Deposite is Executed for 3 Years")
    }

    constructor(n1:Int,n2:Int,n3: Int,n4:Int)
    {
        println("Your Fixed Deposite is Executed for 4 Years")
    }

    constructor(n1:Int,n2:Int,n3: Int,n4: Int,n5:Int)
    {
        println("Your Fixed Deposite is Executed for 5 Years")
    }


}
fun main()
{
    var a1=ParameterizedConstructor(2,9,8)
}