fun main() {

    //Predefined functions
    println("eMobilis")

    var squareroot = Math.sqrt(81.0)
    println("The square root of 81 is $squareroot")

    var round = Math.round(34.87)
    println("The result is $round")

    var myceil = Math.ceil(45.24)
    println("The output value is $myceil")

    day()
    add()
    student("Aloys",21)

}


//User-defined function
fun day(){
    println("Today is Tuesday")
}

fun add(){
    var num1 = 56
    var num2 = 100
    println(num1 + num2)
}

//parameters and argument
fun student(name: String,age:Int){
println("$name is $age years old")
}