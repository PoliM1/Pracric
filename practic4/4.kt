//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите время в формате HH:mm (например, 14:30):")
    val timeString = readLine()!!

    val parts = timeString.split(":")
    val hour = parts[0].toInt()
    val minute = parts[1].toInt()

    val timeOfDay = when {
        hour in 6..11 -> "Утро"
        hour in 12..17 -> "День"
        hour in 18..23 -> "Вечер"
        else -> "Ночь"
    }

    println("Время суток: $timeOfDay")
}