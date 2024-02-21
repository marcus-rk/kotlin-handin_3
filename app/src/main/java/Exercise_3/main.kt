package Exercise_3

fun main() {
    val carOne: Car = Car("Citroên", "C3", 1, 0, true)
    val carTwo: Car = Car("Volkswagen", "Up", 3, 53, false)

    println("First car demo")
    carOne.applyBrakes(-1)
    carOne.speedUp(21)
    carOne.changeGear(2)

    println("\nSecond car demo")
    carTwo.speedUp(78)
    carTwo.changeGear(4)
    carTwo.applyBrakes(1)
}