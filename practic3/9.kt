//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите целое число m:")
    val m = readLine()!!.toInt()

    println("Введите целое число n:")
    val n = readLine()!!.toInt()

    if (m % n == 0) {
        println("Частное от деления: ${m / n}")
    } else {
        println("$m на $n нацело не делится")
    }
}