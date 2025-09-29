fun main() {
    val trajetHannesVersArnar : Int = readln().toInt()
    val trajetArnarVersCine: Int = readln().toInt()
    val debutCine : Int = readln().toInt()
    val departHanneAuPlusTard: Int = debutCine - (trajetHannesVersArnar + trajetArnarVersCine)
    println(departHanneAuPlusTard)
}