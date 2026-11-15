class Reproductor {
    String cancion;
    int volumen;

    Reproductor(String cancion) {
        this.cancion = cancion;
        this.volumen = 5;
    }

    // PASO 1: Escribe el método void reproducir().
    // Debe imprimir "Sonando: " + cancion

    // PASO 2: Escribe el método void subirVolumen().
    // Debe hacer volumen = volumen + 1;
}

public class Main {
    public static void main(String[] args) {
        Reproductor a = new Reproductor("Canción 1");

        // PASO 3: Llama a a.reproducir() y a a.subirVolumen().
        // PASO 4: Imprime a.volumen.
    }
}
