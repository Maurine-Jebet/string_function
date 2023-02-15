fun main() {
    word()
    sentence()
    distance()
    vowel()

}
fun word(){
    var school = "akiraChix"
    println(school[0])
    println(school[2])
    println(school[3])
}
fun sentence(){
    val name = "morin"
    val age = "18"
    val sentence = "Hi,my name is $name and I am $age years old"
    println(sentence)

}
fun distance(){
    var distance = "Baby shark"
    return(println("The length is "+distance.length))
}

fun vowel(){
    val name = "linet"
    if(name == "maurine"){
        println("That's me")}
    else if (name != "maurine")
        println("I don't know who that is")
}



