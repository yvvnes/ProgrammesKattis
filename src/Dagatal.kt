fun main() {
    val nbMois: Int = readln().toInt()
    var nbJours: Int = 0
    when (nbMois) {
        1 -> nbJours = 31
        2 -> nbJours = 28
        3 -> nbJours = 31
        4 -> nbJours = 30
        5 -> nbJours = 31
        6 -> nbJours = 30
        7 -> nbJours = 31
        8 -> nbJours = 31
        9 -> nbJours = 30
        10 -> nbJours = 31
        11 -> nbJours = 30
        12 -> nbJours = 31
    }
    print(nbJours)
}