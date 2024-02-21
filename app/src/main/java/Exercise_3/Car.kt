package Exercise_3

class Car (
    val brand: String,
    val model: String,
    var currentGear: Int = 1,
    var currentSpeed: Int = 0,
    var isBraking: Boolean
) : Vehicle {
    override fun changeGear(a: Int) {
        currentGear = a
        println("$brand $model just changed gear to $currentGear")
    }

    override fun speedUp(a: Int) {
        currentSpeed = a
        println("$brand $model just speed up to $currentSpeed!")
    }

    override fun applyBrakes(a: Int) {
        isBraking = a > 0

        if (isBraking)
            println("$brand $model is breaking!")
        else
            println("$brand $model is not breaking")
    }
}