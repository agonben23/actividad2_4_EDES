fun main(){
    val nota = readln().toIntOrNull()
    imprimirNota(nota)
}
fun imprimirNota(nota : Int?){
    when(nota){
        in 0..4 -> println("Suspenso")
        in 5..6 -> println("Aprobado")
        in 7..8 -> println("Notable")
        in 9..10 -> println("Sobresaliente")
    }
}