package Exercise_2

class Pizza (
    override val ingredients: MutableList<String>,
    private val size: Size,
    private val pricesMap: Map<Size,Double> = mapOf(Size.SMALL to 60.0, Size.MEDIUM to 70.0, Size.LARGE to 85.0)
) : FastFood {
    override fun calculatePrice(): Double {
        return pricesMap.getValue(size)
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