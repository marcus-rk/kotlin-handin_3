package Exercise_1

data class Article (
    val author: String,
    val title: String
) {

    override fun toString(): String {
        return "Article(author='$author', title='$title')"
    }

}