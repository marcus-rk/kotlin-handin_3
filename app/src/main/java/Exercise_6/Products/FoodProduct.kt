package Exercise_6.Products

class FoodProduct (
    productId: String,
    name: String,
    price: Double,
    _calories: Double,
    private val isVegetarian: Boolean
) : Product(productId, name, price) {
    private val calories: Double = if (_calories < 0) 0.0 else _calories

    override fun displayProductDetails() : String {
        return "FoodProduct(productId='$productId', name='$name', price=$price, calories=$calories, isVegetarian=$isVegetarian)"
    }

}