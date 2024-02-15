package Exercise_2

fun main() {
    // Creating instances of Pizza, Sandwich, and Burger
    val pizzaIngredients: MutableList<String> = mutableListOf("Tomato sauce", "Cheese", "Pepperoni")
    val pizza1: FastFood = Pizza(pizzaIngredients, Size.MEDIUM)
    val pizza2: FastFood = Pizza(pizzaIngredients, Size.LARGE)

    val sandwichIngredients: MutableList<String> = mutableListOf("Mayo", "Ham", "Salat")
    val sandwich: FastFood = Sandwich(sandwichIngredients, 55.0)

    val burgerIngredients: MutableList<String> = mutableListOf("Kecthup", "Cheese", "Beef patty")
    val burger1: FastFood = Burger(burgerIngredients, 75.0,true)
    val burger2: FastFood = Burger(burgerIngredients, 75.0,false)

    // Store the instances in a list (Possible because of polymorphism -> all implement FastFood interface)
    val fastFoodList: List<FastFood> = listOf(pizza1, pizza2, sandwich, burger1, burger2)

    // Display objects from fast-food list and calculatePrice() polymorphism override
    fastFoodList.forEach { println("$it\nPrice: ${it.calculatePrice()}") }
}