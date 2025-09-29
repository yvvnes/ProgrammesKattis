fun main() {
    val fraisMonnei = readln().toInt()
    val fraisFjee = readln().toInt()
    val fraisDolladollabilljoll = readln().toInt()
    val leMoinsDeFrais: Int
    if (fraisMonnei < fraisFjee && fraisMonnei < fraisDolladollabilljoll ) {
        println("Monnei")
    }
    if (fraisFjee < fraisMonnei && fraisFjee < fraisDolladollabilljoll) {
        println("Fjee")
    }
    if (fraisDolladollabilljoll < fraisMonnei && fraisDolladollabilljoll < fraisFjee) {
        println("Dolladollabilljoll")
    }
}