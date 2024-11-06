fun main() {

    var number = 2

    var result = when(number){
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        else -> "invalid number"
    }
    println("Number is $result")
}