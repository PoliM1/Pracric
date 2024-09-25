//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите первое число:")
    val a = readLine()!!.toInt()
    println("Введите второе число:")
    val b = readLine()!!.toInt()
    if (a % 2 != b % 2) {
        if (a % 2 == 1) {
            println("Нечетное число: $a")
        } else {
            println("Нечетное число: $b")
        }
    } else {
        println("Ошибка: числа должны иметь разную четность.")
    }
}