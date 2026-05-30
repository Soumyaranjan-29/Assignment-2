//Suspend
 import kotlinx.coroutines.*

suspend fun fetchWeather(): String {
    delay(1000L)
    return "Sunny"
}

fun main()= runBlocking{
    println(fetchWeather())
}
