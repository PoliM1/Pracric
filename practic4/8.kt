//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите тип пищи (мясо, рыба, овощи, каша):")
    val foodType = readLine()!!.lowercase()
    val cookingTime = when (foodType) {
        "мясо" -> 60
        "рыба" -> 20
        "овощи" -> 15
        "каша" -> 25
        else -> 0
    }
    if (cookingTime > 0) {
        println("Время приготовления: $cookingTime минут")
    } else {
        println("Неизвестный тип пищи")
    }
}