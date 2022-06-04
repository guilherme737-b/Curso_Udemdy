fun main() {

    var opcao = -1

    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $opcao")
    } while (opcao != -1)
    println("Até a proxima!")





}