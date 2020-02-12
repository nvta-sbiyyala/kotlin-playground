package playground

enum class Color {
    RED, ORANGE, YELLOW, GREEN
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.GREEN -> "Green!"
        Color.RED -> "Red!"
        Color.ORANGE -> "Orange!"
        Color.YELLOW -> TODO()
    }

fun main(args: Array<String>) {
    println(getMnemonic(Color.RED))
}
