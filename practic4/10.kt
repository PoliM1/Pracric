//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите группу крови (A, B, AB, O):")
    val a = readLine()!!.uppercase()

    val d = when (a) {
        "A" -> listOf("A", "O")
        "B" -> listOf("B", "O")
        "AB" -> listOf("A", "B", "AB", "O")
        "O" -> listOf("O")
        else -> listOf()
    }

    if (d.isNotEmpty()) {
        println("Совместимые группы крови для переливания: ${d.joinToString(", ")}")
    } else {
        println("Неверная группа крови")
    }
}