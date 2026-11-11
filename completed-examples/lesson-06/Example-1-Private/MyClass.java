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
}

public class Main {
    public static void main(String[] args) {
        Reproductor rep = new Reproductor("Canción 1");
        rep.reproducir();
        
        // Al estar encapsulado como private, este acceso directo genera un error de compilación:
        // rep.volumen = 500; 
    }
}
