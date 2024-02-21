package Exercise_6

import Exercise_6.Products.Product

class ProductInventory (
    private val inventory: HashMap<Product, Int> = hashMapOf() // Could also use productID as key
) {

    fun addProduct(product: Product) {
        val currentValue: Int = inventory.getOrDefault(product, 0)
        inventory[product] = currentValue + 1
    }

    fun removeProduct(product: Product) {
        val currentValue: Int = inventory.getOrDefault(product, 1)
        inventory[product] = currentValue - 1
    }

    fun displayInventory() {
        if (inventory.isNotEmpty())
            inventory.forEach { (product, quantity) ->
                println("${product.displayProductDetails()} --> Quantity: $quantity")
            }

        println("Inventory Value: ${calculateInventoryValue()}")
    }

    private fun calculateInventoryValue() : Double {
        var totalValue: Double = 0.0

        inventory.forEach { (product, quantity) ->
            totalValue += product.price * quantity
        }

        return totalValue
    }

}