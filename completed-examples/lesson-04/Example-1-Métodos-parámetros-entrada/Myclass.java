import java.util.Scanner;

public class Main {

    // Método simple sin retorno
    static void saludar() {
        System.out.println("¡Hola!");
    }

    // Método con parámetro
    static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    // Método que devuelve un valor con return
    static int doble(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        // Llamada a métodos simples y con parámetros
        saludar();
        saludar("Luna");

        // Retorno de valores
        int r = doble(5);
        System.out.println(r);

        // Lectura de datos del usuario con Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
    }
}
