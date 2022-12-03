/**
 * Exercise: Common Higher Order Functions
 * Given a collection of random integers.
 * If a number is odd, double it.
 * If a number is even, half it.
 * Print out a subset of the collection that has numbers greater than 25.
 */

fun main(args: Array<String>) {
    val numbers = listOf(23,22,55,11,220,25,1000,200,300)
    var numbersSubList = arrayListOf<Int>()
    numbers.filter { it%2 ==0 }
        .forEach { numbersSubList.add(it/2) }
    numbers.filter { it%2 !=0 }
        .forEach{numbersSubList.add(it*2)}
    println(numbersSubList.filter { it>25 }.sorted())

    //Or more clean

    var subset = numbers.map {
        if(it %2 == 0) it/2 else it*2
    } .filter { it>25 }.sorted()
    println(subset)
}