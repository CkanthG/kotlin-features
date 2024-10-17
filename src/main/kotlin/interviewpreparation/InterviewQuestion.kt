package interviewpreparation

fun main() {
    // find out overlap and remove for the given input [[1,3],[2,6],[8,10],[15,18]],
    // the output will be [[1, 6], [8, 10], [15, 18]],
    println("Write a program to find out overlap")

    val intervals = arrayOf(
        intArrayOf(1,3),
        intArrayOf(2,6),
        intArrayOf(8,10),
        intArrayOf(15,18)
    )
    println(intervals)
    val mergedIntervals = mergeCells(intervals)
    println(mergedIntervals)
}

fun mergeCells(intervals: Array<IntArray>) {
    var c: Int = 0
    val list = mutableListOf<Int>()
    for (i in intervals) {
        for (j in i) {
            if (c < j) {
                c = j
            } else {
                println("$c , $j")
                list.add(c)
                list.add(j)
            }
        }
    }
    println(list)
    val mergedCells = mutableListOf<Int>();
    for (i in intervals) {
        for (j in i) {
            if (!list.contains(j)) {
                mergedCells.add(j);
            }
        }
    }
    println(mergedCells)
    val finalIntervals = Array(mergedCells.size / 2) { index ->
        intArrayOf(mergedCells[index * 2], mergedCells[index * 2 + 1])
    }

    finalIntervals.forEach { interval ->
        print(interval.joinToString(prefix = "[", postfix = "]"))
    }
}