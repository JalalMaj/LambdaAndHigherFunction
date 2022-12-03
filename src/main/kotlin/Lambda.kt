/** ====== ======= ===== LAMBDA =========== ===================
 * Anonymous function -> has no name
 * has no key word
 * A lambda function can has params and declared at the beginning of the block
 * A lambda function can be assigned to variable
 * {name:String -> pintln("Hello World")}
 * A lambda function can be assigned to a variable
 * val myLambda = {name:String -> pintln("Hello World")}
 * The variable can be accessed /passed as a parameter to a new function (Higher order function)
 */

/** ====== ======= ===== HIGHER ORDER FUNCTION =========== ===================
 * a FUNCTION CAN TAKE ANOTHER FUNCTION AS A PARAMETER
 * fun HOF(doSomething: Strint ->Unit){do Something}
 * val myLambda = {name:String -> pintln("Hello World")}
 * HOF(myLambdo)
 */

// First Example

fun sayHello(names:ArrayList<String>,doSomething: (String) -> Unit){
    for(name in names) doSomething(name)

}

fun main(args: Array<String>) {
    val names = arrayListOf("Mo","Lo","No","Bo","Ko")
    val myLambda = {name:String -> println("Hello $name")}
    sayHello(names,myLambda)
    // or
    sayHello(names,{name:String -> println("Hello $name")})
    //or
    sayHello(names){name:String -> println("Hello $name")}
}