package Exercise_6

import Exercise_6.Products.*

fun main() {
    // Creating instances of ClothingProduct, FoodProduct, and ProductInventory
    val clothingProduct: Product = ClothingProduct("01XH41","Pants",499.95, ClothingSize.LARGE)
    val foodProduct: Product = FoodProduct("1239040229X", "Cheese", -1000.8,-830.5, false)
    val productInventory: ProductInventory = ProductInventory()

    // Add the Product instances to the productInventory's inventory map
    productInventory.addProduct(clothingProduct)
    productInventory.addProduct(clothingProduct)
    productInventory.addProduct(foodProduct)

    // Display the productInventory's inventory map and inventory value
    println("Product inventory BEFORE removing products")
    productInventory.displayInventory()

    // Remove the FoodProduct and one ClothingProduct instance from the productInventory's inventory map
    productInventory.removeProduct(foodProduct)
    productInventory.removeProduct(clothingProduct)

    // Display the productInventory's inventory map and inventory value
    println("\nProduct inventory AFTER removing products")
    productInventory.displayInventory()
}