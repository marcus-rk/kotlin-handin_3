package Exercise_2

class Burger (
    override val ingredients: MutableList<String>,
    private val price: Double,
    private val isMenu: Boolean,
    private val menuExtraCost: Double = 20.0
) : FastFood {

    override fun calculatePrice(): Double {
        return if (isMenu) price + menuExtraCost else price
    }

    override fun addIngredient(ingredient: String) {
        ingredients.add(ingredient)
    }

    override fun removeIngredient(ingredient: String) {
        ingredients.remove(ingredient)
    }

    override fun toString(): String {
        return "Burger(ingredients=$ingredients, price=$price, isMenu=$isMenu, menuExtraCost=$menuExtraCost)"
    }

}