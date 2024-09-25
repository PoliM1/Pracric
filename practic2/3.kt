//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a = true
    val b = false
    val c = false
    val A = !a && b
    println("а) не А и В: $A")
    val B = a || !b
    println("б) А или не В: $B")
    val C = a && b || c
    println("в) А и В или С: $C")
}