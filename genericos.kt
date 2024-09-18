class Caja<T>(val contenido: T) {
    fun obtenerContenido(): T {
        return contenido
    }
}

fun main() {

    fun <T> imprimirDato(elemento: T) {
        println(elemento)
    }

    fun <T : Number> sumar(a: T, b: T): Double {
        return a.toDouble() + b.toDouble()
    }


    fun <T : Number> imprimirSiesNumero(valor: T) {
        println(valor.toDouble())
    }

    val cajaInt = Caja(42)
    val cajaString = Caja("soy una cadena")
    val nombre = "Luis"
    val entero = 1234567
    val suma = sumar(10.7541, 45)

    println("****** ejemplo 1 ******")
    println(cajaInt.obtenerContenido())
    println(cajaString.obtenerContenido()) 
    println("****** fin del ejemplo 1 ******")

    println("****** ejemplo 2 ******")
    imprimirDato(nombre)
    imprimirDato(entero)
    println("****** fin del ejemplo 2 ******")

    println("****** ejemplo 3 ******")
    println("La suma es: $suma")
    println("****** fin del ejemplo 3 ******")

    println("****** ejemplo 4 ******")
    imprimirSiesNumero(suma)
    println("****** fin del ejemplo 4 ******")
}