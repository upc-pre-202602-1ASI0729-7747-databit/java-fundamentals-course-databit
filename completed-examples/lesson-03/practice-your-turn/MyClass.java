public class MyClass {
    public static void main(String[] args) {
        int edad = 14;
        int vidas = 3;

        // 1. Decidir si puede entrar a una película según su edad
        if (edad >= 12) {
            System.out.println("Puedes ver la película");
        } else {
            System.out.println("No puedes ver la película");
        }

        // 2. Cuenta regresiva de 5 a 1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        // 3. Repetir mientras tengas vidas
        while (vidas > 0) {
            System.out.println("Vidas: " + vidas);
            vidas--;
        }
    }
}
// Salida esperada:
// Puedes ver la película
// 5 4 3 2 1 (uno por línea)
// Vidas: 3
// Vidas: 2
// Vidas: 1
