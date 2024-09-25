//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a = true
    val b = false
    val c = false
    val A = a || !(a && b) || c
    println("a) A или не (А и В) или С: $A")
    val B = !a || (a && (b || c))
    println("б) не А или А и (В или С): $B")
    val C = (a || (b && !c)) && c
    println("в) (А или В и не С) и С: $C")
}