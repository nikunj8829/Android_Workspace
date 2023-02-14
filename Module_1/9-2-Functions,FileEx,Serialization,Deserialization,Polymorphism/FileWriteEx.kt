import java.io.FileOutputStream

fun main()
{
    var mydata = "hellow nikunj"
    var fout = FileOutputStream("E://nikunj.txt")
    fout.write(mydata.toByteArray())
    println("Success")
}