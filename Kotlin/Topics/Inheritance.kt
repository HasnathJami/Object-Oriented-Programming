/////////////////////INHERITANCE////////////////

//open class A(id:Int,name:String){
//
//init {
//    println("The id is $id")
//    println("The name is $name")
//}
//
//
//}
//
//class B(id:Int,name:String) : A(id,name){
//
//    //fun BB()
//    init
//    {
//        println("This is class B")
//    }
//
//
//
//}
//
//fun main()
//{
//    val obj=B(1,"jishan")
//
//}


///////////////////////////function and properties overriding/////////
open class A(){

     open var a:Int=10
     open fun AA()
     {
        println("I am class A")
    }

}

class B:A() {


    override var a:Int=100


    override fun AA()
    {

        //super.AA()
        println("I am overrided")
    }

}

fun main()
{
    val obj=B()
    //obj.a=20
    println(obj.AA())
    println(obj.a)


}

//open class A{
//
//    val n:String
//    val a:Int
//    constructor()
//    {
//        n="jishan"
//        a=25
//    }
//
//
//
//}
//class B:A{
//
//
//    val i:Int
//
//    constructor(id:Int)
//    {
//
//        i=id
//    }
//
//
//}
//
//fun main()
//{
//    val obj=B(1)
//    println(obj.a)
//    println(obj.n)
//    println(obj.i)
//}