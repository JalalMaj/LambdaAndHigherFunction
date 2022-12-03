/**
 * Create a Higher Order Function that takes a list of client names and a lambda expression that returns a String.
 * It then applies the lambda expression to every client name, creates a new collection of the results and returns the result.
 * Create a lambda expression that takes a client name String and returns a personalised message.
 * Call the HOF and print out the result.
 */

fun messageClient(names:Collection<String>, lbd: (String) -> String):ArrayList<String>{
    var result = arrayListOf<String>()
    for(client in names)
        result.add(lbd(client))

    return result
}

fun main(args: Array<String>) {
    val clientName = readLine()!!.trimEnd().split(" ").map{it.toString()}.toMutableList()
    println(clientName)
    val newMessage: ArrayList<String> = messageClient(clientName){ names -> "Hello $names"}
    //for(client in newMessage) println(client)
    println(newMessage)
    newMessage.forEach { println(it) }
}
