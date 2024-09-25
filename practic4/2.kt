//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите длину первой стороны:")
    val a = readLine()!!.toDouble()

    println("Введите длину второй стороны:")
    val b = readLine()!!.toDouble()

    println("Введите длину третьей стороны:")
    val c = readLine()!!.toDouble()

    if (isValidTriangle(a, b, c)) {
        when {
            a == b && b == c -> println("Равносторонний треугольник")
            a == b || a == c || b == c -> println("Равнобедренный треугольник")
            else -> println("Разносторонний треугольник")
        }
    } else {
        println("Треугольник с такими сторонами не может существовать")
    }
}

fun isValidTriangle(a: Double, b: Double, c: Double): Boolean {
    return (a + b > c && a + c > b && b + c > a)
}
