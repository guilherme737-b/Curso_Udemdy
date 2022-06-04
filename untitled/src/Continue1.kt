fun main() {


    for (i in 1..10) {
        if (i == 5) {
            println(i)
            continue  // trava a minha interrupção, que no caso deste exemplo foi o 5, e depois continua execultando as proximas
        }

        println("Atual: $i")
    }

    println("FIM!")
}