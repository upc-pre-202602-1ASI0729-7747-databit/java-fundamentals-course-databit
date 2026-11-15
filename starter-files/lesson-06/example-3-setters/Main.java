class Reproductor {
    private String cancion;
    private int volumen;

    Reproductor(String cancion) {
        this.cancion = cancion;
        this.volumen = 5;
    }

    public int getVolumen() {
        return volumen;
    }

    // PASO 1: Agrega el Setter 'setVolumen(int v)' con la condición (v >= 0 && v <= 100)
    // public void setVolumen(int v) { ... }
}

public class Main {
    public static void main(String[] args) {
        Reproductor rep = new Reproductor("Canción 1");

        // PASO 2: Asigna un volumen válido de 50 y luego intenta asignar 500
        
    }
}
