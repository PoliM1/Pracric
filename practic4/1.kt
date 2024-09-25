//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите номер дня недели (от 1 до 7):")
    val a = readLine()!!.toInt()

    val d = arrayOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")

    if (a in 1..7) {
        println("День недели: ${d[a - 1]}")
    } else {
        println("Некорректный номер дня недели")
    }
}