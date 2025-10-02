fun main() {
    val amisDeTomas = readln().toInt()
    val ageAmisDeTomas = IntArray(amisDeTomas)
    for(i in 0..amisDeTomas - 1) {
        ageAmisDeTomas[i] = readln().toInt()
    }
    println(ageAmisDeTomas.min())

}