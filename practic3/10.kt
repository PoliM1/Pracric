//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите число a:")
    val a = readLine()!!.toInt()

    println("Введите число b:")
    val b = readLine()!!.toInt()

    if (b % a == 0) {
        println("$a является делителем $b")
    } else {
        println("$a не является делителем $b")
    }
}