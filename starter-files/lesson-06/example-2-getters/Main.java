class Reproductor {
    private String cancion;
    private int volumen;

    Reproductor(String cancion) {
        this.cancion = cancion;
        this.volumen = 5;
    }

    void reproducir() {
        System.out.println("Sonando: " + cancion);
    }

    // PASO 1: Crea el método Getter público 'getVolumen()' que devuelva el valor de 'volumen'
    // public int getVolumen() { ... }
}

public class Main {
    public static void main(String[] args) {
        Reproductor rep = new Reproductor("Canción 1");
        rep.reproducir();

        // PASO 2: Lee e imprime el volumen usando rep.getVolumen()
        
    }
}
