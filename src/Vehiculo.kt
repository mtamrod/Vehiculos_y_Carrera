@Suppress("UNREACHABLE_CODE")
open class Vehiculo(marca: String, modelo: String, capacidadCombustible: Float, combustibleActual: Float, kilometrosActuales: Float) {
    protected val marca: String = ""
    protected val modelo: String = ""
    val capacidadCombustible: Float = 0f
    var combustibleActual: Float = 0f
    var kilometrosActuales: Float = 0f


    companion object {
        const val KM_POR_LITRO: Float = 10f
    }

    open fun obtenerInformacion(autonomia: Float): String {
        return "Con el combustible actual el vehículo puede recorrer $autonomia kilómetros"
    }

    open fun calcularAutonomia(): Float {
        return combustibleActual * KM_POR_LITRO
    }

    open fun realizaViaje(distancia: Float): Float {
        val distanciaRecorrida: Float = distancia - calcularAutonomia()

        actualizarCombustible(distanciaRecorrida)
        actualizarKilometros(distanciaRecorrida)

        println("Has recorrido $distanciaRecorrida kilómetros")
        return distanciaRecorrida
    }

    private fun actualizarCombustible(distanciaRecorrida: Float): Float {
        combustibleActual = distanciaRecorrida * KM_POR_LITRO
        return combustibleActual
    }

    private fun actualizarKilometros(distanciaRecorrida: Float): Float {
        kilometrosActuales += distanciaRecorrida
        return kilometrosActuales
    }

    open fun repostar(cantidad: Float = 0f): Float {

        if (cantidad <= 0) {
            println("Repostando al máximo...")
            combustibleActual = capacidadCombustible
            return combustibleActual
        } else {
            println("Repostando $cantidad litros...")
            combustibleActual += cantidad
            return cantidad
        }
    }
}