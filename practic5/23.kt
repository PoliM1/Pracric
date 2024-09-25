//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите две цифры:")
    var a = readLine()!!.toInt()
    var d = readLine()!!.toInt()

    while (true) {
        println("Выберите действие (+, *, стоп):")
        val operation = readLine()!!

        if (operation == "стоп") {
            break // Выход из цикла
        }

        when (operation) {
            "+" -> println("$a + $d = ${a + d}")
            "*" -> println("$a * $d = ${a * d}")
            else -> println("Неверный оператор")
        }
    }

    println("Программа завершена.")
}