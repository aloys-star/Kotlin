//Parent/Super/Base class
open class Animal{
    var gender = "Female"
    var age = 3
    var hasfeathers = true

    fun sound(){
        println("Animal is speaking")
    }

}
open class Duck:Animal(){
    fun movement(){
        println("Duck is swimming")
    }
}

class Bird:Duck(){
    var hasscales = true

    fun move(){
        println("Bird is flying")
    }
}

fun main() {

    var a = Animal()
    println(a.sound())

    var d = Duck()
    println(d.movement())

    var b = Bird()
    println(b.gender)
}


