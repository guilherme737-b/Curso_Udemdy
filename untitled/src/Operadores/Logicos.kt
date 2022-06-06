fun main() {

    val executouTrabalho1 = true
    val executouTrabalho2 = true

    val comprouSorvete = executouTrabalho1 || executouTrabalho2
    val comprouTV50 = executouTrabalho1 && executouTrabalho2
    val comprouTV32 = executouTrabalho1 xor executouTrabalho2

    println(comprouSorvete)
    println(comprouTV50)
    println(comprouTV32)


    //Operador Unário

    if (!comprouSorvete)
        println("A saúde agradece.")

}