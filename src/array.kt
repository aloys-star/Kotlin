fun main() {
    var languages = arrayOf("Kotlin","python","Java")
    println(languages[1])

    //reassigning a new value
    languages[1] = "C++"

    //Adding a new element
    var all = languages.plus("PHP")

    for (lang in all){
        println(lang)
    }
    //size of an array
    println(languages.size)
}