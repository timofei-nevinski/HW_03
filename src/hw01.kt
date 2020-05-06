// Вывести на экран текущее название дня недели, название месяца и свое имя.
// Каждое слово должно быть в отдельной строке.
// Все календарные величины определить автоматически

import java.text.SimpleDateFormat
import java.util.Date

fun hw01(): String {

    val dayOfWeek = SimpleDateFormat("EEEE").format(Date())
    val month = SimpleDateFormat("MMMM").format(Date())
    return "$dayOfWeek\n" +
            "$month\n" +
            "Тимофей"
}
