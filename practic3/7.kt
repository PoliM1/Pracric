//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите первое число:")
    val a = readLine()!!.toDouble()
    println("Введите второе число:")
    val b = readLine()!!.toDouble()
    if (a > b) {
        println("$a больше, чем $b")
        println("$b меньше, чем $a")
    } else {
        println("$b больше, чем $a")
        println("$a меньше, чем $b")
    }
}