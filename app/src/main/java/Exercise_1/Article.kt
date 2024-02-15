package Exercise_1

class Article (
    val author: String,
    val title: String
) {

    override fun toString(): String {
        return "Article(author='$author', title='$title')"
    }

}