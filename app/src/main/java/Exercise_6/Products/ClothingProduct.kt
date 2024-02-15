package Exercise_6.Products

class ClothingProduct (
    productId: String,
    name: String,
    price: Double,
    private val clothingSize: ClothingSize,
) : Product(productId, name, price) {

    override fun displayProductDetails() : String {
        return "ClothingProducts(productId='$productId', name='$name', price=$price, size=$clothingSize)"
    }

}