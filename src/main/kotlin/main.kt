const val PI = 3.1416

fun reto2() {
    val r = 1.0
    val resultado = 2 * PI * r

    println("Resultado: $resultado")
}

fun main() {
    // variable implicita
    val implicitVal = "hola mundo"
    println(implicitVal)

    // variable explicita
    val explicitVal: String

    explicitVal = "Soy pedro"
    println(explicitVal)

    // tipo de dato
    println(explicitVal.javaClass.kotlin)

    // números
    // byte
    val byte: Byte = 127
    // Integer, puede ir sin el tipo
    val integer: Int = 6
    // Long
    val long = 45L
    // decimal
    val decimal = 32.31
    // float
    val float = 32.45F

    // Char
    val unCaracter = 'A'

    // String
    val variosCaracteres = "Soy una cadena"

    // booleano
    val verdadero = true
    val falso = false

    // Salto de línea
    val saludo = "hola\nmundo"

    // Salto de línea """
    val holaSeparado = """Esto es un mensaje con 
        |salto de linea
    """.trimMargin()

    println(holaSeparado)

    val logoZelda = """
                                       /@
                       __        __   /\/
                      /==\      /  \_/\/   
                    /======\    \/\__ \__
                  /==/\  /\==\    /\_|__ \
               /==/    ||    \=\ / / / /_/
             /=/    /\ || /\   \=\/ /     
          /===/   /   \||/   \   \===\
        /===/   /_________________ \===\
     /====/   / |                /  \====\
   /====/   /   |  _________    /  \   \===\    THE LEGEND OF 
   /==/   /     | /   /  \ / / /  __________\_____      ______       ___
  |===| /       |/   /____/ / /   \   _____ |\   /      \   _ \      \  \
   \==\             /\   / / /     | |  /= \| | |        | | \ \     / _ \
   \===\__    \    /  \ / / /   /  | | /===/  | |        | |  \ \   / / \ \
     \==\ \    \\ /____/   /_\ //  | |_____/| | |        | |   | | / /___\ \
     \===\ \   \\\\\\\/   /////// /|  _____ | | |        | |   | | |  ___  |
       \==\/     \\\\/ / //////   \| |/==/ \| | |        | |   | | | /   \ |
       \==\     _ \\/ / /////    _ | |==/     | |        | |  / /  | |   | |
         \==\  / \ / / ///      /|\| |_____/| | |_____/| | |_/ /   | |   | |
         \==\ /   / / /________/ |/_________|/_________|/_____/   /___\ /___\
           \==\  /               | /==/
           \=\  /________________|/=/    
             \==\     _____     /==/ 
            / \===\   \   /   /===/
           / / /\===\  \_/  /===/
          / / /   \====\ /====/
         / / /      \===|===/
         |/_/         \===/
                        =  
"""
    println(logoZelda)

    // Concatenación
    val otroNombre = "Ramon"
    println("Mi nombre es " + otroNombre)

    // Concatenación con string template

    val nombre = "Pedro"

    println("Mi nombre es $nombre")

    reto2()

}