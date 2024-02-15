package Exercise_2

class Burger (
    override val price: Double,
    override val quantity: Int,
    val extraTopping: MutableList<String> = mutableListOf()
) : FastFood {
    override fun calculatePrice(): Double {
        if (extraTopping.size > 0)
            return price * quantity + extraTopping.size
        return price * quantity
    }

    override fun toString(): String {
        return "Sandwich(price=$price, quantity=$quantity)"
    }
}