import java.util.Collections

/**
 * two function have the same name will give error if same parameter
 * diferrent parameters with the same function will be fine
 */

fun sayHello(person:String) = println("Hello $person")
fun sayHello(people:Collection<String>){
    for(person in people){
        var result = when(person[0].toLowerCase()){
            in 'a'..'c' -> "Hello $person"
            in 'd'..'f' -> "Hello there $person"
            else -> "Hello my firend $person"
        }
        println(result)
    }
}

fun main(args: Array<String>) {
    sayHello("Jack")
    sayHello(listOf("Jalal","Ali","Ahmed"))
}