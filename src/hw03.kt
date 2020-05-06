// Пользователь вводит сторону квадрата.
// Найдите периметр и площадь квадрата.

fun hw03() : String{
    println("Введи сторону квадрата")
    var str = readLine()!!
    var side = str.toInt()
    var perimetr = side*4
    var square = side*side
    return "Периметр: $perimetr, Площадь: $square"
}