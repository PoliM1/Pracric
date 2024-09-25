//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    print("Введите 3 отличающихся числа друг от друга.\n Введите 1 число: ")
    val a= readLine()!!.toInt()
    print("Введите 2 число: ")
    val b= readLine()!!.toInt()
    print("Введите 3 число: ")
    val c= readLine()!!.toInt()
    val max=maxOf(a,b,c)
    println("Наибольшее число: $max")




}