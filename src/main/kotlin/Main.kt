fun main() {
    val commission = 0.75
    val minCommission = 35
    val amount = 10000
    val result = if (amount * commission / 100.0 < minCommission) minCommission else amount * commission / 100.0
    println(result)
}