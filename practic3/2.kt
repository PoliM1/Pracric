//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите первое число:")
    val a = readLine()!!.toInt()

    println("Введите второе число:")
    val b = readLine()!!.toInt()

    println("Введите третье число:")
    val c = readLine()!!.toInt()

    if (a == b || a == c || b == c) {
        println("Ошибка: среди чисел есть равные.")
    } else {
        val g = (a + b + c) / 3.0
        println("Среднее значение: $g")
    }
}