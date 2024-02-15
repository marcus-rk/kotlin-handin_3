package Exercise_4

class RedditFrontPage (
    private val redditPosts: MutableList<RedditPost> = mutableListOf()
) {
    fun addPost(post: RedditPost) {
        redditPosts.add(post)
    }

    fun deletePostByIndex(postIndex: Int) {
        if (postIndex in 0 until redditPosts.size)
            redditPosts.removeAt(postIndex)
    }

    fun getIndexByRedditPost(redditPost: RedditPost) : Int {
        return redditPosts.indexOf(redditPost)
    }

    fun sortPostsByVoteBalanceDescending() {
        redditPosts.sortByDescending { it.voteBalance }
    }

    fun displayPosts () {
        redditPosts.forEach { println(it) }
    }

}