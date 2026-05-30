//Custom setter
    class Thermostat {
    var temperature: Double = 0.0
        private set

    fun setTemp(temp: Double) {
        temperature = temp
    }
}

fun main() {
    val t = Thermostat()
    t.setTemp(46.0)
    println("Temperature = ${t.temperature}")
}
