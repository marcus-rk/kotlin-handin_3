package Exercise_2

interface FastFood {
    val ingredients: MutableList<String>
    fun calculatePrice() : Double
    fun addIngredient(ingredient: String)
    fun removeIngredient(ingredient: String)
}