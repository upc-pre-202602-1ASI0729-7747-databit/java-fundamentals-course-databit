class Reproductor {
    String cancion;
    int volumen;

    Reproductor(String cancion) {
        this.cancion = cancion;
        this.volumen = 5;
    }
}

public class Main {
    public static void main(String[] args) {
        Reproductor a = new Reproductor("Canción 1");
        System.out.println(a.cancion);
        System.out.println(a.volumen);
    }
}

// Salida esperada:
// Canción 1
// 5
