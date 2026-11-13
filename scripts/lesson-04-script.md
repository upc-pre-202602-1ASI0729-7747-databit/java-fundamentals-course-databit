# Guion: Lección 4. Métodos, parámetros y entrada/salida

**Duración**: 10 minutos  
**Proyecto**: Programas interactivos y reutilizables  
**Editor en línea**: [JDoodle](https://www.jdoodle.com/online-java-compiler)

En esta lección aprenderás a organizar tus instrucciones dentro de métodos con nombre, a enviarles datos y recibir resultados, y a leer información directamente desde el teclado usando `Scanner`.

---

## Parte 1: Portada (0:00 a 0:30)

**En pantalla**: Portada de la lección 4 con los temas principales.

**Narración**:

¡Hola! Bienvenido a la lección 4. Hasta ahora escribiste instrucciones sueltas una debajo de la otra dentro de `main`. Hoy aprenderás a guardar esas instrucciones con un nombre para reutilizarlas cuando quieras, y también a pedirle datos al usuario. Con estas dos herramientas tus programas serán mucho más ordenados e interactivos. ¡Empecemos!

---

## Parte 2: Un método es una receta con nombre (0:30 a 1:25)

**En pantalla**: Diapositiva comparativa: a la izquierda código repetido tres veces; a la derecha un método llamado tres veces.

**Narración**:

Un método es como una receta con nombre. Fíjate en la izquierda de la pantalla: sin métodos, si queremos saludar tres veces, tenemos que repetir la misma línea tres veces. Si el programa es grande, esto se vuelve muy difícil de leer y mantener.

Ahora mira a la derecha: con un método, escribimos el saludo una sola vez, le ponemos el nombre `saludar` y simplemente lo llamamos tres veces por su nombre. 

La gran ventaja es esta: escribes el código una vez y lo usas muchas veces. Y si más adelante quieres cambiar el mensaje del saludo, lo cambias en un solo lugar y se actualiza en todos lados.

---

## Parte 3: Crear y llamar un método (1:25 a 2:55)

**En pantalla**: Editor en línea. Se escribe el método fuera de `main` y se llama dentro de `main`:

```java
public class Main {

    static void saludar() {
        System.out.println("¡Hola!");
    }

    public static void main(String[] args) {
        saludar();
    }
}
```

**Narración**:

Vamos al editor en línea para crear nuestro primer método. Es muy importante dónde lo escribimos: va dentro de la clase `Main`, pero **fuera** de las llaves de `main`.

Escribimos `static void saludar()` y abrimos llaves. Por ahora usa `static void` como plantilla base: más adelante entenderás `static`, y `void` significa vacío, es decir, que este método realiza una acción pero no devuelve ningún dato. Dentro de las llaves ponemos lo que hace: mostrar "¡Hola!".

Si ejecutamos ahora, no pasará nada, porque crear la receta no es lo mismo que cocinarla. El método no se ejecuta solo: hay que llamarlo. Dentro de `main` escribimos `saludar();` con sus paréntesis y punto y coma. Pulsamos Ejecutar y ahí está: "¡Hola!".

**Salida esperada**:

```text
¡Hola!
```

---

## Parte 4: Parámetros, datos para el método (2:55 a 4:25)

**En pantalla**: Editor en línea. Se modifica el método para recibir un `String nombre`:

```java
public class Main {

    static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void main(String[] args) {
        saludar("Luna");
        saludar("Sol");
    }
}
```

**Narración**:

¿Y si queremos saludar a personas distintas sin crear un método para cada una? Para eso usamos parámetros, que son datos que el método recibe para trabajar.

Entre los paréntesis del método escribimos `String nombre`. Este es el parámetro: funciona como una variable temporal que solo existe dentro de este método. Adentro, unimos el texto "Hola " con el contenido de `nombre`.

Al llamarlo desde `main`, le enviamos el dato real entre paréntesis: `saludar("Luna")`. Ese dato específico que enviamos se llama argumento. Ejecutamos y muestra "Hola Luna". Si debajo lo llamo otra vez con `"Sol"`, funciona exactamente igual. Un solo método, muchos saludos diferentes.

**Salida esperada**:

```text
Hola Luna
Hola Sol
```

---

## Parte 5: Devolver un valor con `return` (4:25 a 5:55)

**En pantalla**: Editor en línea. Se escribe el método `doble`:

```java
public class Main {

    static int doble(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        int r = doble(5);
        System.out.println(r);
    }
}
```

**Narración**:

Algunos métodos no solo muestran mensajes en pantalla: hacen un cálculo y nos entregan un resultado para que lo usemos después. Para eso usamos la palabra `return`.

Fíjate en un cambio clave: antes del nombre del método ya no dice `void`, sino `int`. Esto le avisa a Java que el resultado que va a devolver el método será un número entero.

Este método llamado `doble` recibe un número entero y con `return numero * 2;` devuelve el doble de ese valor. En `main`, cuando llamamos a `doble(5)`, el método hace la operación, entrega un 10 y nosotros guardamos ese resultado en la variable `r`. Luego imprimimos `r` y en pantalla sale 10.

**Salida esperada**:

```text
10
```

---

## Parte 6: Entrada de datos con `Scanner` (5:55 a 7:35)

**En pantalla**: Editor en línea. Se agrega `import` arriba y se pide el nombre por consola:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
    }
}
```

**Narración**:

Hasta este momento, todos los datos los escribíamos nosotros directamente en el código. Ahora haremos que sea el usuario quien los escriba mientras el programa corre. Para lograrlo usamos una herramienta llamada `Scanner`.

Lo primero va en la línea 1, antes de la clase: escribimos `import java.util.Scanner;`. Con esto traemos a nuestro programa la herramienta de lectura de Java.

Dentro de `main`, creamos nuestro lector escribiendo `Scanner sc = new Scanner(System.in);`, donde `System.in` representa el teclado. Luego usamos `System.out.print` (sin el `ln` al final) para mostrar el mensaje "Tu nombre: " y que el cursor se quede esperando en la misma línea.

Después, `sc.nextLine()` detiene el programa, espera a que el usuario escriba una línea de texto y presione Enter, y guarda ese texto en la variable `nombre`. Finalmente, saludamos usando esa variable.

---

## Parte 7: Entrada y salida en el editor (7:35 a 8:30)

**En pantalla**: Enfoque en la panel derecho/inferior de JDoodle mostrando la consola interactiva (Interactive Mode).

**Narración**:

Veamos con calma cómo funciona esto en nuestro editor en línea. Asegúrate de tener activada la opción Interactive en el panel derecho.

Cuando pulsamos Ejecutar, la consola muestra "Tu nombre: " y se queda esperando. La información que el programa nos muestra se llama salida. Hacemos clic en la consola, escribimos Luna, presionamos Enter —eso que escribe el usuario es la entrada— y el programa responde inmediatamente "Hola Luna". ¡Así de fácil haces que tus programas conversen con el usuario!

**Salida esperada**:

```text
Tu nombre: Luna
Hola Luna
```

---

## Parte 8: ¡Tu turno! Métodos y Scanner (8:30 a 9:20)

**En pantalla**: Diapositiva amarilla de práctica.

**Pausa**: La persona pausa el video por su cuenta. Este tiempo no se cuenta en la duración.

**Narración**:

¡Tu turno! Pausa el video y practica en el editor con el enlace de la descripción.

Uno: crea un método que reciba un nombre y muestre un saludo personalizado.

Dos: pide el nombre al usuario usando `Scanner` y pásalo a tu método para saludarlo.

Tres: prueba el método `doble` con distintos números, por ejemplo 8 o 15, e imprime los resultados. No olvides escribir el `import` en la primera línea.

¡Dale play cuando termines!

---

## Parte 9: Resumen de la lección (9:20 a 10:00)

**En pantalla**: Diapositiva de resumen con los 4 conceptos clave y adelanto de la lección 5.

**Narración**:

¡Excelente trabajo! Repasemos lo que aprendiste hoy: un método te permite reutilizar bloques de código dándoles un nombre; los parámetros son los datos que el método recibe para trabajar; `return` sirve para devolver un resultado; y `Scanner` nos permite leer los datos que escribe el usuario.

En la próxima lección darás un salto gigante: empezarás con la programación orientada a objetos creando tus propias clases y objetos. ¡Nos vemos allí!

---
---

