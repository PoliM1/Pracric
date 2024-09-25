//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите двузначное число:")
    val a = readLine()!!.toInt()

    val b = a / 10
    val c = a % 10
    if (b > c) {
        println("Первая цифра больше второй")
    } else if (b < c) {
        println("Вторая цифра больше первой")
    } else {
        println("Цифры одинаковые")
    }
}