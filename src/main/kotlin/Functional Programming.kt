/**
 * Again! in functional programming languages functions are values just like strings or numbers functions can be
 * assigned to variables or pass into other functions, higher-order functions,
 * but what are higher-order functions good for?… composition. The fact that
 * we can take one function and put it into another function allows us to
 * compose a lot of small functions into bigger functions.
 *That’s all a lot of theory. Let’s look at how to actually use one of these things. Probably the most basic and useful
 *  higher-order function is filter, It’s really simple. Filter is a function on the array that accepts another function
 *  as its argument which it will use to return a new filtered version of the array.
 */

data class Animals(var name: String, var species: String)
var animals = arrayOf(
    Animals("Poppy", "rabbit"),
    Animals("Caro", "dog"),
    Animals("Teddy", "dog"),
    Animals("Molly", "fish"),
    Animals("Jimmy", "cat"),
    Animals("Harold", "fish")
)

//I am going to show you how to do this using filter,
// but before I do I want to remind you how you do this with a normal for Loop.
fun main(args: Array<String>) {
    var dogs = arrayListOf<Animals>()
    for (animal in animals) {
        if (animal.species=="dog")
            dogs.add(animal)
    }
    println("The list of animals of species [dog] are:")
    for(dog in dogs)
    println("${dogs.indexOf(dog)} -  ${dog.name}")

    /*
    So this is just an ultra normal for loop it creates an ArrayList to hold the dogs.
    It iterates over the animal ArrayList and if the species of the animal is being iterated is equal
    to dog it will add that dog onto the animals ArrayList.

    Now let’s rewrite this using the filter function.
     */
    var dogsFilter = animals.filter(fun(animal): Boolean {
        return animal.species == "dog"
    })
    println(dogsFilter)

    // Or write it in split
    var isDog = fun(animal: Animals): Boolean {
        return animal.species == "dog"
    }
    var dogsFilter2 = animals.filter(isDog)
    println(dogsFilter2)

    var dogsFilter3 = animals.filterNot(isDog)
    println(dogsFilter3)
}