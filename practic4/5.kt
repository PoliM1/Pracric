//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите число:")
    val a = readLine()!!.toDouble()

    val b = when {
        a > 0 -> "Положительное"
        a < 0 -> "Отрицательное"
        else -> "Нулевое"
    }

    println("Число $a - $b")
}