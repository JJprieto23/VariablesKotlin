val nombre = "Julian"
nombre = "David" // Esto generará un error de compilación

var edad = 17
edad = 18 // Esto es válido

//Tipos de datos

//Números
val entero: Int = 10
val doble: Double = 10.0

//Caracteres
val letra: Char = 'A'

//Booleanos
val esVerdadero: Boolean = true

//Cadenas de texto
val texto: String = "Hola, Mundo"

//Arreglos
val numeros: Array<Int> = arrayOf(1, 2, 3, 4)

//Listas de mapas y colecciones
val listaInmutable: List<Int> = listOf(1, 2, 3)
val listaMutable: MutableList<Int> = mutableListOf(1, 2, 3)
val mapa: Map<String, Int> = mapOf("uno" to 1, "dos" to 2)

//Inferencia de tipos
val nombre = "Julian" // Kotlin infiere que el tipo es String
val edad = 18 // Kotlin infiere que el tipo es Int
