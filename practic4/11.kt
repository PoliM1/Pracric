//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите страну:")
    val a = readLine()!!.lowercase()

    val d = when (a) {
        "сша" -> "американец"
        "россия" -> "россиянин"
        "япония" -> "японец"
        else -> "Неизвестная национальность"
    }

    println("Национальность: $d")
}