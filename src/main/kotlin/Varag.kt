/**
 * Varag is a list of arguments
 */

fun sayHello(vararg names:String){
    for(name in names) println("Hello $name")
    println(sumOfIntegers(1,5,10,100))
}

//Another example for varag

fun sumOfIntegers(vararg numbers:Int):Int{
    var sum = 0
    for(number in numbers) sum+=number
    return sum
}
fun main(args: Array<String>) {
    sayHello("Ali","Ahmed","Hadi")
}
