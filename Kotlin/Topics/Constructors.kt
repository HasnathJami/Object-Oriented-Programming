//Kotlin Constructors with examples

//class A(val name:String,val age:Int){
//
//
//}
//
//fun main()
//{
//    var obj=A("Jishan",25)
//
//    println("${obj.name} ${obj.age}")
//
//}

//Deafaut value with contructors

//class A(val name:String="Default",val age:Int=0){
//}
//
//fun main()
//{
//    val obj1=A();
//    val obj2=A("Jishan",25)
//    println("${obj1.name} ${obj1.age}")
//    println("${obj2.name} ${obj2.age}")
//}

//Initialize Block inside Kotlin Constructor

//class C{
//      val name:String
//      val age:Int
//
//      init{
//          name="Jishan"
//          age=25
//
//      }      }
//
//
//
//fun main()
//{
//   val obj=C()
//   println("${obj.name} ${obj.age}")
//
//}

//////Secondary Constructor

//class D{
//
//    val n:String
//    val a:Int
//
//    constructor(name:String,age:Int)
//    {
//        n=name
//        a=age
//    }
//}
//
//fun main()
//{
//     val obj=D("Jishan",25)
//     println("${obj.n} ${obj.a}")
//
//}


//Calling one constructor from another
//class D{
//
//    val n:String
//    val a:Int
//
//
//
//
//    constructor(name:String,age:Int)
//    {
//        n=name
//        a=age
//    }
//
//    constructor(): this("Sayem",35)
//    {
//
//        println("This is connstructor 2")
//    }
//
//
//}
//
//fun main()
//{
//    val obj=D("Jishan",25)
//    println("${obj.n} ${obj.a}")
//
//    val obj2=D()
//    println("${obj2.n} ${obj2.a}")
//
//}


//Kotlin Secondary Constructor example with parent and child class

open class Parent{

    var n:String?=null
    var a:Int?=null
//    constructor(name:String,age:Int)
//    {
//        n=name
//        a=age
//    }


}

class Child : Parent {

    val _childId:Int
    constructor(childId:Int)
    {
        _childId=childId
    }
}

fun main()
{
    val obj=Child(1)
    obj.n="Jishan"
    obj.a=25

    println(obj.n+" "+obj.a+" "+obj._childId)
