//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val x = true
    val y = true
    val z = false
    val a = !x && y
    println("a) !x && y = $a")
    val b = x || !y
    println("б) x || !y = $b")
    val c = x || (y && z)
    println("в) x || (y && z) = $c")
}