class Dog(var name:String,var breed:String,var age:Int){


}

fun main() {
    var dog1 = Dog("Max","Bulldog",12)
    println(dog1.name)
    println(dog1.breed)
    println(dog1.age)

    var dog2 = Dog("Tito","Husky",9)
    println(dog2.name)
    println(dog2.breed)
    println(dog2.age)

    var dog3 = Dog("Bob","German shepherd",5)
    println(dog3.name)
    println(dog3.breed)
    println(dog3.age)


}