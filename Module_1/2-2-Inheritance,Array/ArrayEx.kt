class ArrayEx
{

    fun detail()
    {
        //int marks
        var marks = arrayOf("Android","Kotlin","Java",1,2,3,'A','B',true)
        // var marks = arrayOf<Boolean>("Android","Kotlin","Java",1,2,3,'A','B',true)
        for(i in marks)
        {
            println(i)
        }

    }

}
fun main()
{

    var a1 = ArrayEx()
    a1.detail()

}