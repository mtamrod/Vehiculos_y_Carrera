
class Automovil(marca: String, modelo: String, capacidadCombustible: Float, combustibleActual: Float, kilometrosActuales: Float, esHibrido: Boolean, condicionBritanica: Boolean): Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales) {
    val esHibrido: Boolean = true
    val condicionBritanica: Boolean = true

    companion object {
        const val AHORRO_ELECTRICO: Float = 5f
    }

    override fun calcularAutonomia(): Float {
        if (esHibrido == false) {
            return super.calcularAutonomia()
        } else {
            return combustibleActual * AHORRO_ELECTRICO
        }
    }

    fun cambiarCondicionBritanica(nuevaCondicion: Boolean): Boolean {
        return false
    }

    fun realizaDerrape(): Float {
        return 0f
    }


}