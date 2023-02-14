import java.io.FileOutputStream
import java.io.ObjectOutputStream

class SerializeEx
{
    fun s1()
    {
        var s1 = Student8(101,"tops")
        var fout = FileOutputStream("E://nikunj.txt")
        var out= ObjectOutputStream(fout)
        out.writeObject(s1)
        println("Success")

    }

}
fun main()
{
    var s = SerializeEx()
    s.s1()

}