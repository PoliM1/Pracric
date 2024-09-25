//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите год:")
    val year = readLine()!!.toInt()
    val isLeapYear = isLeap(year)
    val daysInYear = if (isLeapYear) 366 else 365
    println("Год $year ${if (isLeapYear) "высокосный" else "не высокосный"}")
    println("Количество дней в году: $daysInYear")
}
fun isLeap(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
}