//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val x = false
    val y = false
    val z = true
    val A = x || (y && !z)
    println("a) X или Y и не Z: $A")
    val B = !x && !y
    println("б) не X и не Y: $B")
    val C = !(x && z) || y
    println("в) не (X и Z) или Y: $C")
    val D = x && !y || z
    println("г) X и не Y или Z: $D")
    val E = x && (!y || z)
    println("д) X и (не Y или Z): $E")
    val F = x || !(y || z)
    println("е) X или (не (Y или Z)): $F")
}