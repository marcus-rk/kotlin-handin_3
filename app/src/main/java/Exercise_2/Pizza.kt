package Exercise_2

class Pizza (
    override val price: Double,
    override val quantity: Int,
    val size: Size
) : FastFood {
    override fun calculatePrice(): Double {
     return price * quantity
    }

    override fun toString(): String {
        return "Pizza(price=$price, quantity=$quantity)"
    }
}