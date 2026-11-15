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

    public void setVolumen(int v) {
        if (v >= 0 && v <= 100) {
            volumen = v;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Reproductor rep = new Reproductor("Canción 1");

        rep.setVolumen(50);
        System.out.println(rep.getVolumen()); // Imprime 50

        rep.setVolumen(500); // Se ignora por estar fuera del rango 0-100
        System.out.println(rep.getVolumen()); // Mantiene el 50
    }
}
