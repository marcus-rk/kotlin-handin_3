package Exercise_6.Products

abstract class Product (
    val productId: String,
    val name: String,
    var price: Double
) {

    init {
        price = if (price < 0) 0.0 else price
    }

    abstract fun displayProductDetails() : String
}
