class Reproductor {
    String cancion;
    int volumen;

    Reproductor(String cancion) {
        this.cancion = cancion;
        this.volumen = 5;
    }

    void reproducir() {
        System.out.println("Sonando: " + cancion);
    }

    void subirVolumen() {
        volumen = volumen + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        // PASO 1: Crea dos reproductores con new:
        // Reproductor a = new Reproductor("Canción 1");
        // Reproductor b = new Reproductor("Canción 2");

        // PASO 2: Llama a a.subirVolumen() y a a.reproducir().

        // PASO 3: Imprime a.volumen y b.volumen para comprobar que son independientes.
    }
}
