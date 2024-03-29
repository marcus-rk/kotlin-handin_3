package Exercise_5

fun main() {
    val words: List<String> = arrayListOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")
    val frequencyMap: HashMap<String, Int> = hashMapOf()

    // if a key exist in map, return the current value
    // if a key does not exist, add it to map and set value to default 0
    // increment by one (no matter if key existed before or not)
    words.forEach {
        val currentValue = frequencyMap.getOrDefault(it, 0)
        frequencyMap[it] = currentValue + 1
    }

    // Print frequency map (sorted)
    frequencyMap.toSortedMap().forEach{ (word, count) -> println("$word, count: $count") }
}