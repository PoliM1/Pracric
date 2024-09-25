//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите способ оплаты (наличные, кредитная карта, PayPal):")
    val a = readLine()!!.lowercase()

    when (a) {
        "наличные" -> println("Оплата наличными")
        "кредитная карта" -> println("Оплата кредитной картой")
        "paypal" -> println("Оплата через PayPal")
        else -> println("Неверный способ оплаты")
    }
}