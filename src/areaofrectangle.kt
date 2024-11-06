import java.util.Scanner

fun main() {
    var test = Scanner(System.`in`)

    println("Enter the length :")
    var length = test.nextInt()

    println("Enter the width")
    var width = test.nextInt()

    var area = length * width
    println("The area of the rectangle is $area")
}