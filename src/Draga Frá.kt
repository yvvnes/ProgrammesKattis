fun main() {
    val rideauxInitialementFermés: Int = readln().toInt()
    val rideauxOuverts: Int = readln().toInt()
    val nbFenetresCouvertes: Int = rideauxInitialementFermés - rideauxOuverts
    println(nbFenetresCouvertes)
}