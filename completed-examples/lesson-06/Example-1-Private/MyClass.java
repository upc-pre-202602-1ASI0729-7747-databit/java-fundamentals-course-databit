class Reproductor {
    // PASO 1: Declara los atributos 'cancion' y 'volumen' como privados (private)
    String cancion;
    int volumen;

    Reproductor(String cancion) {
        this.cancion = cancion;
        this.volumen = 5;
    }

    void reproducir() {
        System.out.println("Sonando: " + cancion);
    }
}

public class Main {
    public static void main(String[] args) {
        Reproductor rep = new Reproductor("Canción 1");
        rep.reproducir();

        // PASO 2: Intenta acceder directamente a rep.volumen desde fuera de la clase y observa el error
        // rep.volumen;
    }
}
