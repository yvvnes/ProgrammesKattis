fun main() {
    val anneeCongelation = 2022
    val nbAmeliorationsDepuisCongelation : Int = readln().toInt()
    val nbAmeliorationsChaqueAnnee : Int = readln().toInt()
    val anneeActuelle : Int = (nbAmeliorationsDepuisCongelation / nbAmeliorationsChaqueAnnee) + anneeCongelation
    println(anneeActuelle)
}