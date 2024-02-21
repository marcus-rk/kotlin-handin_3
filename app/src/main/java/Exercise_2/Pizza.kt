package Exercise_2

class Pizza(
    override val ingredients: MutableList<String>,
    private val size: Size, // --> see Size enum
) : FastFood {

    override fun calculatePrice(): Double {
        return size.price
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