package Exercise_4

fun main() {
    // Creating instances of RedditPosts
    val redditPost1: RedditPost = RedditPost("John_doe", "First Reddit Post")
    val redditPost2: RedditPost = RedditPost("Not_John_doe", "Second Reddit Post")
    val redditPost3: RedditPost = RedditPost("Maybe_John_doe", "Third Reddit Post")

    // Store the instances in a list of RedditPosts
    val redditPosts: MutableList<RedditPost> = mutableListOf(redditPost1, redditPost2, redditPost3)

    // Creating RedditFrontPage instance with list of RedditPosts
    val redditFrontPage: RedditFrontPage = RedditFrontPage(redditPosts)

    // Print the list of RedditPosts with displayPosts() before changes
    println("Posts BEFORE getting voted and sorted")
    redditFrontPage.displayPosts()

    // Upvote and downvote selected RedditPosts
    redditPost3.upvote()
    redditPost3.upvote()
    redditPost2.upvote()
    redditPost1.downvote()

    // Sort RedditPosts by vote balance using sortDescending and displays them
    println("\nPosts AFTER getting voted and sorted")
    redditFrontPage.redditPosts.sortDescending()
    redditFrontPage.displayPosts()

    // Removing redditPost2 by index
    println("\nPosts AFTER deleting redditPost2 by index")
    val indexToDelete = redditFrontPage.getIndexOfRedditPost(redditPost2)
    redditFrontPage.deletePostByIndex(indexToDelete)
    redditFrontPage.displayPosts()

    // Adding RedditPost (redditPost2) and sorting
    println("\nAFTER adding redditPost2 again")
    redditFrontPage.addPost(redditPost2)
    redditFrontPage.redditPosts.sort()
    redditFrontPage.displayPosts()
}