package Exercise_1

fun main() {
    // Create instances of Article
    val article1: Article = Article("John Doe", "The Impact of AI on Future Job Markets")
    val article2: Article = Article("Jane Smith", "Exploring the Potential of Quantum Computing")
    val article3: Article = Article("Michael Johnson", "The Rise of Remote Work in a Post-Pandemic World")
    val article4: Article = Article("Emily Wang", "Understanding Blockchain Technology and Its Applications")
    val article5: Article = Article("David Brown", "The Importance of Cybersecurity in the Digital Age")

    // Store the instances in a Article list
    val articles: List<Article> = listOf(article1, article2, article3, article4, article5)

    // Println all article instances from Article List
    articles.forEach { println(it) }
}