package Exercise_1

fun main() {
    val article1 = Article("John Doe", "The Impact of AI on Future Job Markets")
    val article2 = Article("Jane Smith", "Exploring the Potential of Quantum Computing")
    val article3 = Article("Michael Johnson", "The Rise of Remote Work in a Post-Pandemic World")
    val article4 = Article("Emily Wang", "Understanding Blockchain Technology and Its Applications")
    val article5 = Article("David Brown", "The Importance of Cybersecurity in the Digital Age")

    val articles = listOf(article1, article2, article3, article4, article5)

    articles.forEach { println(it) }
}