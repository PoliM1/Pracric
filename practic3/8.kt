//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите расстояние в километрах:")
    val a = readLine()!!.toDouble()
    println("Введите расстояние в футах:")
    val b = readLine()!!.toDouble()
    val c = a * 1000
    val d = b * 0.305
    if (c < d) {
        println("Расстояние в километрах меньше")
    } else if (c > d) {
        println("Расстояние в футах меньше")
    } else {
        println("Расстояния равны")
    }
}