import kotlin.random.Random

fun main() {
    val array = crearArrayNumAlea(20,1,1000)
    imprimirPares(array)
    val arrayOrdenado = array.sortedByDescending{ it }
    println(arrayOrdenado.first())
    println(arrayOrdenado.last())
    println(sumaArray(array))
    imprimirArray(eliminarImpares(array))

}
fun crearArrayNumAlea(cantidad: Int,numInicial: Int,numFinal:Int): Array<Int>{
    val array = Array(cantidad){0}
    for (i in (1..cantidad)){
        array[i-1] = Random.nextInt(numInicial,numFinal)
    }
    return array
}
fun imprimirPares(array: Array<Int>){
    array.forEach {
        if(it%2 == 0){
            print("$it,")
        }
    }
}
fun sumaArray(array: Array<Int>): Int{
    var suma = 0
    array.forEach { suma += it }
    return suma
}
fun eliminarImpares(array: Array<Int>): Array<Int> {
    array.forEach {
        if (it % 2 != 0) {
            array[array.indexOf(it)] = 0
        }
    }
    return array
}
fun imprimirArray(array: Array<Int>){
    array.forEach { print("$it,") }
}