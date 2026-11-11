// Lección 8: Consejos, buenas prácticas y errores comunes
// El siguiente código funciona, pero tiene varios problemas de estilo y errores comunes.
// Tu tarea es identificarlos y corregirlos.


public class Lesson08_BestPractices {


    public static void main(String[] args) {


        // PROBLEMA 1: Nombres de variables poco descriptivos
        // Corrígelos con nombres que expliquen qué guardan
        int v = 3;
        String n = "Luna";
        int p = 10;
        System.out.println(n + " tiene " + v + " vidas y " + p + " puntos");


        // PROBLEMA 2: Detective de errores — este código tiene 3 errores
        // (falta un ;, una mayúscula y unas comillas). Corrígelo y quítale los //
        // int puntos = 10
        // string nombre = "Luna";
        // if (puntos > 5) {
        //     System.out.println("Ganaste);
        // }


        // PROBLEMA 3: Comparar textos con == en lugar de equals()
        // Corrígelo para comparar el texto de forma correcta
        if (n == "Luna") {
            System.out.println("Hola, Luna");
        }


        // PROBLEMA 4: Indentación incorrecta y sin espacios — corrígela
        // (Este bloque debería estar correctamente indentado)
        for(int i=1;i<=v;i++){
        System.out.println("Vida número: "+i);
}


        // PROBLEMA 5: La clase de abajo no sigue las convenciones de nombres
        // Las clases usan PascalCase y las variables camelCase
        reproductor_musica r = new reproductor_musica();
        r.Volumen_Actual = 5;
        System.out.println("Volumen: " + r.Volumen_Actual);


    }
}


class reproductor_musica {
    int Volumen_Actual;
}