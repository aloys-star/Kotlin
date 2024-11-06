import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter the first value: ")
    var num1 = read.nextInt()

    println("Enter the second value: ")
    var num2 = read.nextInt()

    println("Choose an operator: ")
    println("1.Addition ")
    println("2.Subtraction ")
    println("3.Multiplication ")
    println("4.Division ")

    var operator = read.nextInt()

    var result = when(operator){
        1 -> num1 + num2
        2 -> num1 - num2
        3 -> num1 * num2
        4 -> num1 / num2
        else -> "Invalid input"
    }
    println("The value of the operation is $result")
}