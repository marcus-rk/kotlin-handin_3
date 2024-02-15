package Exercise_6

import Exercise_6.Products.Product

class ProductInventory (
    private val inventory: MutableMap<Product, Int> = mutableMapOf()
) {
    fun addProduct(product: Product) {
        val currentValue = inventory.getOrDefault(product, 0)
        inventory[product] = currentValue + 1
    }

    fun removeProduct(product: Product) {
        val currentValue = inventory.getOrDefault(product, 0)
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
        var totalValue = 0.0

        inventory.forEach { (product, quantity) ->
            totalValue += product.price * quantity
        }

        return totalValue
    }

}