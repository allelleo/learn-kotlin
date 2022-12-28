
fun PrintUserName(user: String) : Unit {
    println(user)
}

fun main(){
    println("You username?: ")
    val user : String = readln()
    PrintUserName(user)
}
