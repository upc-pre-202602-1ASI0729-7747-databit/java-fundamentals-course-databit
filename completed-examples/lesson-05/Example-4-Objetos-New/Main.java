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
        Reproductor a = new Reproductor("Canción 1");
        Reproductor b = new Reproductor("Canción 2");
        a.subirVolumen();
        a.reproducir();
        System.out.println(a.volumen);
        System.out.println(b.volumen);
    }
}

// Salida esperada:
// Sonando: Canción 1
// 6
// 5
