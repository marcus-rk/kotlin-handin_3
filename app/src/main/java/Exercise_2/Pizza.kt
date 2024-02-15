package Exercise_2

class Pizza (
    override val ingredients: MutableList<String>,
    private val size: Size
) : FastFood {
    override fun calculatePrice(): Double {
        return when (size) {
            Size.SMALL -> 60.0
            Size.MEDIUM -> 70.0
            Size.LARGE -> 85.0
        }
    }

    override fun addIngredient(ingredient: String) {
        ingredients.add(ingredient)
    }

    override fun removeIngredient(ingredient: String) {
        ingredients.remove(ingredient)
    }

    override fun toString(): String {
        return "Pizza(ingredients=$ingredients, size=$size)"
    }

}