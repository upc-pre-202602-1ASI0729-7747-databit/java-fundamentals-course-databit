public class MyClass {
    public static void main(String[] args) {
        // 1. Tu nombre y tu edad
        String nombre = "Luna";
        int edad = 15;
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        // 2. Puntos de un juego: 3 monedas de 10 puntos cada una
        int monedas = 3;
        int puntos = monedas * 10;
        System.out.println("Puntos: " + puntos);

        // 3. Cada operador con tus propios números
        System.out.println(8 + 2);   // suma: 10
        System.out.println(8 - 2);   // resta: 6
        System.out.println(8 * 2);   // multiplicación: 16
        System.out.println(7 / 2);   // división entera: 3
        System.out.println(10 % 3);  // residuo: 1
    }
}
// Salida esperada:
// Nombre: Luna
// Edad: 15
// Puntos: 30
// 10
// 6
// 16
// 3
// 1
