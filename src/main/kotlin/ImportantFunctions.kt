fun main(args: Array<String>) {
    val nameslist = listOf<String>("Jalal", "Mohammed", "Ahmad", "khaled", "Ali", "Hussain1", "Hassan", "Fadi", "Fayez")

   //Filter the output based on the name length
    nameslist.filter{ it.length<5}
        .forEach { println("$it is a short name with less than 5 letters") }


    val namesMap = nameslist.groupBy { it }.toList().sortedBy { (key, value) -> key.length }

    println(namesMap)


    //Map the names to names length
    val size = nameslist.map { it.length }
    println(size) // output array list of integers


    //Sort based on length
    val sorted = nameslist.sortedBy { it.length }
    println(sorted)

    //maxBy -> to get maximum based on condition
    val maximumLengthName = nameslist.maxBy { it.length }
    println(maximumLengthName)

    //maxBy -> to get maximum based on condition
    val maximumLengthChar = nameslist.maxBy { it.length }.maxBy { it }
    println(maximumLengthChar)

    //minBy -> Get the minimum based on condition
    val minimumLengthName = nameslist.minBy { it.length }
    println(minimumLengthName)

    //minBy -> Get the minimum based on condition
    val minimumLengthChar = nameslist.minBy { it.length }.minBy { it }
    println(minimumLengthChar)
}