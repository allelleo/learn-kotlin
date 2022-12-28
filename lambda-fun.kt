
fun main() {
    val HappyFun: () -> String = {
        val year = 2022
        "С новым $year годом"
    }
    print(HappyFun())
}
