fun main() {
    val solution = NextLarger()
    val arr = intArrayOf(5, 3, 6, 2, 1)
    println(
        solution.secondSmaller(arr)
    )
}
class NextLarger {
    fun secondSmaller(arr: IntArray): Int {
        var min = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE
        for (i in arr.indices) {
            if (arr[i] < min) {
                min = arr[i]
            }
            if (min2 > min) {
                min2 = arr[i]
            }
        }
        return min2
    }
}