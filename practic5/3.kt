//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()
    val sum = (1..n).sum()
    println("Сумма от 1 до $n = $sum")
}