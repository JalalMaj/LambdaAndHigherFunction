/**
*Create a function that receives the name of an animal, and returns the estimated lifespan.

cats -> 15
dogs -> 10
rabbit -> 12
everything else -> 20

Ask the user to input an animal, then print out the estimated lifespan for that animal.
*/

fun animalLifeSpan(name:String):String{
    var result = when(name){
        "cats"-> 15
        "dogs"-> 10
        "rabbits" -> 12
        else -> 20
    }
    return "$name has life span $result"
}

fun main(args: Array<String>) {
    println("Please enter the name of an animal")
    val input = readLine()!!.trim().toString()
    println(animalLifeSpan(input))
}