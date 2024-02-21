package Exercise_4

class RedditFrontPage (
    val redditPosts: ArrayList<RedditPost> = arrayListOf()
) {
    fun addPost(post: RedditPost) {
        redditPosts.add(post)
    }

    fun deletePostByIndex(postIndex: Int) {
        if (postIndex in 0 until redditPosts.size)
            redditPosts.removeAt(postIndex)
    }

    fun getIndexOfRedditPost(redditPost: RedditPost) : Int {
        return redditPosts.indexOf(redditPost)
    }

    fun displayPosts () {
        redditPosts.forEach { println(it) }
    }

}