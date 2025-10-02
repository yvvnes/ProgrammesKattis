fun main() {
    val tailleButtonDeTrump: Int = readln().toInt()
    val tailleButtonDeKimJongUn: Int = readln().toInt()
    when {
        tailleButtonDeKimJongUn > tailleButtonDeTrump -> println("FAKE NEWS!")
        tailleButtonDeTrump == tailleButtonDeKimJongUn -> println("WORLD WAR 3!")
        tailleButtonDeKimJongUn < tailleButtonDeTrump -> println("MAGA!")
    }
}