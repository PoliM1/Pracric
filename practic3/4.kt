//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите первое число (большее):")
    val a = readLine()!!.toInt()
    println("Введите второе число (меньшее):")
    val b = readLine()!!.toInt()
    if (a % b == 0) {
        println("$a кратно $b")
    } else {
        val remainder = a % b
        println("$a не кратно $b. Остаток от деления: $remainder")
    }
}