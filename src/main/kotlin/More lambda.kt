import java.lang.Integer.sum

var circleCircumference = {radius:Double -> 2*radius*Math.PI}
var circleArea ={radius:Double -> Math.PI * Math.pow(radius,2.0)}
var lambdafunc = { x: Int, y: Int -> x + y }

fun getCircleArea(radius:Double) = circleArea(radius)
fun getCircleCircumference(radius: Double) = circleCircumference(radius)
fun printSum( sample: (Int, Int) -> Int) {

    var output = sample(10,20)
    println("The sum  is: $output")
}


fun higherfunc() : ((Int,Int)-> Int) = ::sum



fun main() {
    //Print Sum of two Integers 1st Way
    printSum(lambdafunc)

    // Second Way
    val sample = higherfunc()
    val output = sample(10,20)
    println("The sum is: $output")




    //ThirdWay
    println("Please the radius of the circle")
    var radius = readLine()!!.toDouble()
    println("The area of the circle is ${getCircleArea(radius)}")
    println("The circumference of the circle is ${getCircleCircumference(radius)}")
}