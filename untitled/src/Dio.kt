import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck

/*const val Min_Age = 16
const val Max_Age = 68*/
fun main() {


    /*  var age = 23

    val MAX_AGE = 68
    var currentAge_2:Int?

    print(age > MAX_AGE)

    var currentAge = 90
    println("O resultado é " + currentAge)

   var day:Int? = null
    */

    /* var count = "Olá "
    var times = "mundo!"

    println(count + times)*/

/*

    val equal = -1
    val less = -5
    val more = 1

    print(equal.compareTo(less) == more)

*/


    /*  val  Lista = listOf(3,9,10,21)
    print(4 in Lista)
    print(1..34)*/


    /*  var age = (10..100).random()
    println(age)
    println(age in Min_Age..Max_Age)
    println(age >= Min_Age && age <= Max_Age)
*/

    /*  val welcome = "Olá"
    var name = "Guilherme"
    print("$welcome ${name.capitalize()}!")
*/


/*

    val s = ""
    println(s.isEmpty())
    println(s.isBlank())
*/

  /*  val a:Int? = null
    var number = a ?: 0
*/


  //  val MAxValue = if ( a > b) a else if (a < b) b else b

  /*  var a = 20
    var b = 5
    var c = 15

   *//*  if (a > b){
        print("b é o menor valor")
        b
    }
*//*

    when {
        a > b -> {print("A maior do que b")}
        a != 0 && a > c -> {print("A não é zero e é igual a C")}
        b == 0 -> {print("B e igual a zero")}


    }

*/



    val grade = (0..10).random()
    println(grade.getStudentStatus())






}

fun Int.getStudentStatus():String{
    println("nota $this")

    return when(this){
        in 0..4 -> "Reprovado"
        in 5..7 -> "mediano"
        in 8..9 -> "bom"
        10 -> "exelente"
        else -> "indefinido"
    }
}