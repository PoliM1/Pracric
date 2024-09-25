//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите натуральное число:")
    val a = readLine()!!.toInt()

    if (a % 2 == 0) {
        println("$a - четное число")
    } else {
        println("$a - нечетное число")
    }

    if (a % 10 == 7) {
        println("$a оканчивается цифрой 7")
    } else {
        println("$a не оканчивается цифрой 7")
    }
}