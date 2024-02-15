package Exercise_2

class Sandwich (
    override val price: Double,
    override val quantity: Int,
    val isMenu: Boolean
) : FastFood {
    override fun calculatePrice(): Double {
        if (isMenu == true) {
            return price * quantity + 30
        }
        return price * quantity
    }

    override fun toString(): String {
        return "Sandwich(price=$price, quantity=$quantity)"
    }
}