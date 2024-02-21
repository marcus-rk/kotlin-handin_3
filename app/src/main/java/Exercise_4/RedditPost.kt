package Exercise_4

import android.annotation.SuppressLint
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class RedditPost (
    private val author: String,
    private val title: String,
) : Comparable<RedditPost> {
    private val date: String = getDateTime()
    private var upvotes: Int = 1
    private var downvotes: Int = 0
    public val voteBalance: Int
        get() { return upvotes - downvotes }

    fun upvote() {
        this.upvotes++
    }

    fun downvote() {
        this.downvotes++
    }

    // Override from Comparable interface
    override fun compareTo(other: RedditPost): Int {
        return this.voteBalance - other.voteBalance
    }

    @SuppressLint("NewApi") // Needed because of Android Studio
    fun getDateTime(): String {
        val dateTime = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        return dateTime.format(formatter)
    }

    override fun toString(): String {
        return "RedditPost(author='$author', title='$title', upvotes=$upvotes, downvotes=$downvotes, date=$date)"
    }

}