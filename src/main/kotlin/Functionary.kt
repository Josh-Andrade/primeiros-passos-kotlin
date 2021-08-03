abstract class Functionary(
    val name: String,
    val document: String,
    val salary: Double
) {

    abstract fun bonus(): Double
}