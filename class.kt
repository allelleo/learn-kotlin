class Car{
    var mileage: Int = 0
    fun increaseMileage(value: Int) : Unit {
        if (value > 0) mileage += value
    }
}
fun main() {
    val car = Car()
    car.increaseMileage(100)
    println(car.mileage)
}
