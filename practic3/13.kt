//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите четырехзначное число:")
    val number = readLine()!!.toInt()

    val g = number / 1000
    val b = (number % 1000) / 100
    val c = (number % 100) / 10
    val i = number % 10
    val y = g + b
    val x = c + i
    if (y == x) {
        println("Сумма первых двух цифр равна сумме последних двух цифр")
    } else {
        println("Сумма первых двух цифр не равна сумме последних двух цифр")
    }

    val sumDigits = g + b + c + i
    if (sumDigits % 3 == 0) {
        println("Сумма цифр кратна 3")
    } else {
        println("Сумма цифр не кратна 3")
    }

    val v = g * b * c * i
    if (v % 4 == 0) {
        println("Произведение цифр кратно 4")
    } else {
        println("Произведение цифр не кратно 4")
    }
    println("Введите число а:")
    val a = readLine()!!.toInt()
    if (v % a == 0) {
        println("Произведение цифр кратно $a")
    } else {
        println("Произведение цифр не кратно $a")
    }
}