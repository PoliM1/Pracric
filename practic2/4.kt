//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val x = true
    val y = true
    val z = false
    val A = !x && y
    println("a) !x && y = $A")
    val B = x || !y
    println("б) x || !y = $B")
    val C = x || (y && z)
    println("в) x || (y && z) = $C")
}