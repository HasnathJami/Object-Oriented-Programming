/////Abstract  Class

abstract class Human(){

    fun demo()
    {
        println("I am demo")
    }
    abstract fun enjoy()
}

class Jishan:Human(){

    override fun enjoy()
    {
        //super.demo()
        println("I am enjoying")
    }
}

fun main()
{
    val obj=Jishan()
    obj.enjoy()
}