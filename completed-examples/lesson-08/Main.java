// Lección 8: Consejos, buenas prácticas y errores comunes
// Ejemplo completo — así debería verse el código corregido.


public class Lesson08_BestPractices {


    public static void main(String[] args) {


        // CORRECCIÓN 1: nombres de variables descriptivos
        int vidasJugador = 3;
        String nombreJugador = "Luna";
        int puntosIniciales = 10;
        System.out.println(nombreJugador + " tiene " + vidasJugador + " vidas y " + puntosIniciales + " puntos");


        // CORRECCIÓN 2: los 3 errores del detective
        int puntos = 10;                        // faltaba el ; al final
        String nombre = "Luna";                 // String va con S mayúscula
        if (puntos > 5) {
            System.out.println(nombre + ": ¡Ganaste!");  // faltaba cerrar las comillas
        }


        // CORRECCIÓN 3: los textos se comparan con equals()
        if (nombreJugador.equals("Luna")) {
            System.out.println("Hola, " + nombreJugador);
        }


        // CORRECCIÓN 4: indentación correcta y espacios legibles
        for (int i = 1; i <= vidasJugador; i++) {
            System.out.println("Vida número: " + i);
        }


        // CORRECCIÓN 5: clase en PascalCase y variable en camelCase
        ReproductorMusica reproductor = new ReproductorMusica();
        reproductor.volumenActual = 5;
        System.out.println("Volumen: " + reproductor.volumenActual);


    }
}


// Las clases se escriben en PascalCase
class ReproductorMusica {
    int volumenActual;   // las variables se escriben en camelCase
}