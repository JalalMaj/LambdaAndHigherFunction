/**
 * Given a set of random integers, print out a subset that consists only of double digit integers.
 */

fun main(args: Array<String>) {
    //val numberSubList = arrayListOf<Int>()
    val numbers = arrayListOf(1 ,10 ,12, 33,44,55,9,8,1000)
    numbers.filter { it in 10 .. 99 }
        .forEach { println(it) }
    //numbers.removeAll(numberSubList)
//    println(numbers)
//    println(numberSubList)
    //or
    println(numbers.filter { it.toString().length==2 })

    /**
    Sort a list of Client based on last letter for their name
     */

    val nameslist = listOf<String>("Jalal", "Mohammed", "Ahmad", "khaled", "Ali", "Hussain", "Hassan", "Fadi", "Fayez")
    println(nameslist.sortedBy { it.last() })
    // or
    println(nameslist.sortedBy { it[it.length-1] })

    /**
     * Given a list of 3 digit integers
     * Print out the integer that has the biggest middle digit.
     */

    val ints = arrayListOf(123,325,548,194,283)
    println(ints.maxBy { it.toString()[1] })
    // or
    println(ints.maxBy{it/10%10 })

}
