fun main() {
    val nbPartsPizza = readln().toInt()
    val nbPersonnesChezOmar = readln().toInt()
    val nbPartsRestantes : Int = nbPartsPizza % nbPersonnesChezOmar
    println(nbPartsRestantes)
}