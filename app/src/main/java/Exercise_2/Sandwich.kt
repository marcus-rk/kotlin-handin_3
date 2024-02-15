package Exercise_2

class Sandwich (
    override val ingredients: MutableList<String>,
    private val price: Double
) : FastFood {
    override fun calculatePrice(): Double {
        return price
    }

    override fun addIngredient(ingredient: String) {
        ingredients.add(ingredient)
    }

    override fun removeIngredient(ingredient: String) {
        ingredients.remove(ingredient)
    }

    override fun toString(): String {
        return "Sandwich(ingredients=$ingredients, price=$price)"
    }

}