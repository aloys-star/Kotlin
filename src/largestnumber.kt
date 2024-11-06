import java.util.Scanner

fun main() {
     var read = Scanner(System.`in`)

    println("Enter the first number: ")
    var num1 = read.nextInt()

    println("Enter the second number: ")
    var num2 = read.nextInt()

    if (num1 > num2){
        println("$num1 is the larger number")
    }
    else{
        println("$num2 is the larger number")
    }
}