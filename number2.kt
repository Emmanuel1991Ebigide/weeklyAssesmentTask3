fun main() {
    var stringSupplied = "Good Food"

    var reverseMyString = reverseMyString(stringSupplied)
    println (reverseMyString)
}

fun reverseMyString (stringSupplied: String) : String {
    var reverseMyString = ""

    for (i in stringSupplied.length - 1 downTo 0){
        reverseMyString += stringSupplied [i]
    }
    return  reverseMyString
}