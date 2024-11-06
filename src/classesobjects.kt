class Person{
    //properties/attributes/characteristics
    var name = "John"
    var age = 34

    //Behavior/method/function
    fun sound(){
        println("Person is speaking")
    }
}

//Creating an object
fun main() {
    var teacher = Person()
    println(teacher.age)
    println(teacher.name)
    teacher.sound()

    var student = Person()
    var accountant = Person()
}
