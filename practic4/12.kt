//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите код ошибки (100, 200, 300):")
    val a = readLine()!!.toInt()

    val d = when (a) {
        100 -> "Ошибка сети"
        200 -> "Ошибка сервера"
        300 -> "Ошибка авторизации"
        else -> "Неизвестная ошибка"
    }

    println("Сообщение об ошибке: $d")
}