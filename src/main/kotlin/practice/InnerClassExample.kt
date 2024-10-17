package practice

class InnerClassExample(val items: Array<String>) {

    inner class InnerClass() {

        fun displayArrayItem(position: Int) {
            println("item : ${items[position]} in position : $position")
        }

    }

}