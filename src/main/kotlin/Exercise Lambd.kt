/**
 * Create a Higher Order Function that takes a mutable collection of integers and a lambda function.
 * It then applies the lambda function to every even element of that collection.
 *Create a lambda function that when applies to an integer, it returns that integer divided by 10.
 *Call the HOF using your lambda and display the result.
 */

fun update(number:ArrayList<Int>, lbd: (Int) ->Int):ArrayList<Int>{
    for(i in 0 until number.size){
        if(number[i] % 2 ==0) number[i]=lbd(number[i])
    }
    return number
}

fun main(args: Array<String>) {
    println("Enter the integers")
    val input = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toMutableList()
    println(input)
    val newNumbers:ArrayList<Int> = update(input as ArrayList<Int>){ number -> number/10}
    println(newNumbers)
}