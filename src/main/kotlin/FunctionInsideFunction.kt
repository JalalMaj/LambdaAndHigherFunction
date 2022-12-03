/**
 * A function inside other function
 * The internal function only accessed localy by external function
 */

fun listAnimals(){
    fun listOneAnimal(animal:String){
        println("I have an animal $animal")
    }

    val myAnimals = arrayListOf("cat","dog","bird","horse","sheep")
    for(animal in myAnimals) listOneAnimal(animal)
}

//Another example

fun awesomeBank(users: HashMap<String,Double?>){
    fun doubleAmount(amount:Double?) =amount?.times(2)
    for(user in users.keys){
        users[user] = doubleAmount(users[user])
    }
    println(users)
}

//Another example
fun printName(){
  fun sayHello(name:String){
      println("Greeting $name !")
  }
    while(true){
        val name = readLine()?:""
        if(name=="")break
        else sayHello(name)
    }
}
fun main(args: Array<String>) {
    listAnimals()
   awesomeBank(hashMapOf("Jalal" to 13000.0 ,"Ali" to 15000.0))
    printName()
}