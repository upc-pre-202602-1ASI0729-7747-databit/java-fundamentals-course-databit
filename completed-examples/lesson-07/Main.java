import java.util.Scanner;

class Reproductor {
  private String[] canciones;
  private int actual = 0;
  private int volumen = 5;

  Reproductor(String[] canciones) {
    this.canciones = canciones;
  }

  void siguiente() {
    actual = (actual + 1) % canciones.length;
  }

  String sonando() {
    return canciones[actual];
  }

  int getVolumen() {
    return volumen;
  }

  void setVolumen(int v) {
    if (v >= 0 && v <= 100) {
      volumen = v;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] lista = {"Canción 1", "Canción 2"};
    Reproductor r = new Reproductor(lista);
    int opcion = 0;
    while (opcion != 4) {
      System.out.println("=== Reproductor ===");
      System.out.println("Sonando: " + r.sonando());
      System.out.println("Volumen: " + r.getVolumen());
      System.out.println("1) Siguiente canción");
      System.out.println("2) Subir volumen");
      System.out.println("3) Bajar volumen");
      System.out.println("4) Salir");
      opcion = sc.nextInt();
      if (opcion == 1) {
        r.siguiente();
      } else if (opcion == 2) {
        r.setVolumen(r.getVolumen() + 1);
      }
    }
  }
}