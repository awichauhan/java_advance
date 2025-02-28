fun main() {
    smallestNum(arrayOf(1, 4, -1, 0))
}

fun smallestNum(array: Array<Int>) {
    var min: Int = 0

    for (i in 0 until array.size - 1) {
        if (array[i] < array[i + 1]) {
            min = array[i]

        }
    }
    println(min)
}

fun secondSmallest(array: Array<Int>, smallestNum:Int){
    var min: Int = 0
    for (i in 0 until array.size - 1) {
        if (array[i] < array[i + 1]) {
            min = array[i]
        }
    }
    println(min)
}