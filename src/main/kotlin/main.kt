
//комиссия составляет 0.75 %, минимум 35 рублей

fun main () {
    var amount = 100000.0

    var tax = if (amount * 0.0075 >= 35) amount * 0.0075 else 35

    println("комиссия за перевод: $tax")
}