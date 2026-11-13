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

    public int getVolumen() {
        return volumen;
    }
}

public class Main {
    public static void main(String[] args) {
        Reproductor rep = new Reproductor("Canción 1");
        rep.reproducir();

        System.out.println(rep.getVolumen());
    }
}
