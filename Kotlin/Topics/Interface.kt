//Interface

//interface Human{
//
//    fun demo()
//
//    fun func()
//    {
//        println("Test")
//    }
//
//}
//
//class Jishan: Human{
//
//    override fun demo()
//    {
//        println("I am demo ")
//    }
//
//}
//
//fun main()
//{
//    val obj=Jishan()
//    obj.demo()
//    obj.func()
//}

// Multiple Interface





//interface a{
//
//    fun aa()
//
//
//}
//
//interface b{
//    fun bb()
//
//}
//
//class c:a,b{
//
//    override fun aa()
//    {
//        println("I am function a")
//    }
//
//    override fun bb()
//    {
//        println("I am function b")
//    }
//}
//
//fun main()
//{
//    var obj=c()
//
//    obj.aa()
//    obj.bb()
//}

//When multiple interfaces have same method name
//How to resolve the conflict of same method name

interface a{

    fun aa()
    {
        println("This is a")
    }


}

interface b{
    fun aa()
    {
        println("This is b")
    }

}


class C:a,b {
    override fun aa()
    {
        super<a>.aa()
        super<b>.aa()
    }
}


fun main()
{
    var obj=C()

    obj.aa()
}

