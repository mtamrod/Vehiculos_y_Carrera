
class Motocicleta(marca: String, modelo: String, capacidadCombustible: Float, combustibleActual: Float, kilometrosActuales: Float, cilindrada: Int): Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales) {
    val cilindrada: Int = 0

    override fun calcularAutonomia(): Float {
        return super.calcularAutonomia()
    }

    override fun realizaViaje(distancia: Float): Float {
        return super.realizaViaje(distancia)
    }

    fun realizaCaballito(): Float {
        return 0f
    }
}