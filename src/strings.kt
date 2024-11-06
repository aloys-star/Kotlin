fun main() {
    var firstname = "ALOYS"
    var lastname = "Kibet"


    println(firstname)
    println(lastname)
    //Accessing an element in a string
    println(firstname[1])

    //Modifying a string
    println(lastname.uppercase())
    println(firstname.lowercase())

    //String concatenation - joining strings
    println(firstname + lastname)
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    //String interpolation
    println("My first name is " + firstname)
    println("My last name is $lastname")

    var num1 = 25
    var num2 = 67

    println("The sum of $num1 and $num2 is " + (num1+num2))




}