///Class and object

class Sum{

    private val a=10

    fun square():Int{
        return a*a
    }

}

fun main()
{
    val obj=Sum()
    println(obj.square())
}