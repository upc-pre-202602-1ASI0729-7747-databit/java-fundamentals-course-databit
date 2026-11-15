# Guion: Lección 7. Proyecto: un programa con POO

**Duración**: 10 minutos  
**Proyecto**: Tu reproductor de música en la consola  
**Editor en línea**: [JDoodle](https://www.jdoodle.com/online-java-compiler)

En esta lección la clase `Reproductor` mejora: ahora guarda una lista de canciones en un array, en lugar de una sola canción.

---

## Parte 1: Portada (0:00 a 0:29)

**En pantalla**: Portada de la lección 7 con los temas que se van a juntar.

**Narración**:

¡Llegó el gran momento: el proyecto! Hoy vas a juntar todo lo que aprendiste respecto a clases, encapsulación, arrays, Scanner y bucles para crear un reproductor de música que funciona en la consola.

Vamos paso a paso, y yo te diré cuándo pausar el video.

---

## Parte 2: Lo que vamos a construir (0:29 a 1:14)

**En pantalla**: Consola con el menú y lista de lo que usa el programa.

**Narración**:

Esto es lo que vamos a construir. Un menú en la consola: muestra la canción que suena y el volumen, y tiene cuatro opciones. Entre ellas: siguiente canción, subir volumen, bajar volumen y salir.

El usuario elige una opción escribiendo un número en pantalla, y el reproductor responde. Este programa usa clases y objetos, encapsulación y arrays, Scanner para leer la opción y un bucle while para repetir el menú.

---

## Parte 3: El plan, dos clases (1:14 a 2:00)

**En pantalla**: Diagrama de las clases `Reproductor` y `Main`.

**Narración**:

Antes de escribir código, planificamos. Necesitamos dos clases.

La clase Reproductor guarda los datos, entre ellos las canciones, cuál es la actual y el volumen. Y sabe hacer cosas, como pasar a la siguiente canción y cambiar el volumen.

La clase Main tiene el main. Este usa Scanner y muestra el menú dentro de un bucle while. Main crea y usa un Reproductor. Así dividimos el trabajo: cada clase se ocupa de lo suyo.

---

## Parte 4: Paso 1, los datos de la clase (2:00 a 3:01)

**En pantalla**: Editor en línea. Se escribe este código:

```java
class Reproductor {
  private String[] canciones;
  private int actual = 0;
  private int volumen = 5;

  Reproductor(String[] canciones) {
    this.canciones = canciones;
  }
}
```

**Narración**:

Paso 1: los datos de la clase. Nuestro reproductor mejora: ahora guarda una lista de canciones, no una sola.

Tenemos tres atributos privados, protegidos como aprendimos: canciones, un array de String con la lista; actual, un número que indica la posición de la canción que suena y empieza en 0; y volumen, que empieza en 5.

El constructor recibe la lista de canciones al crear el reproductor y la guarda con this.

Como se puede ver en el código, está estructurado de tal manera que podamos ver los elementos que están en private y el constructor Reproductor, donde se están almacenando las canciones.

---

## Parte 5: Paso 2, los métodos (3:01 a 4:33)

**En pantalla**: Editor en línea. Se escribe este código dentro de la clase `Reproductor`, debajo del constructor:

```java
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
```

**Narración**:

Paso 2: los métodos. Los vamos a escribir dentro de la clase Reproductor, debajo del constructor.

Siguiente avanza a la siguiente canción: actual igual a actual más 1 y después el signo de porcentaje, el residuo que vimos en la lección 2, entre canciones punto length. Es void porque no devuelve nada, solo cambia la canción que está sonando, y canciones punto length nos dice cuántas canciones tiene la lista.

Esto será muy útil: cuando llegamos a la última canción, el residuo vuelve a 0 y empieza otra vez desde la primera. Por ejemplo, con 3 canciones, 2 más 1 es 3, y 3 entre 3 deja residuo 0.

Recuerden que las posiciones empiezan en 0, así que con 3 canciones tenemos la 0, la 1 y la 2. Si estamos en la 0, 0 más 1 es 1, y 1 entre 3 deja residuo 1. Así que avanzamos normal. Solo en la última pasa la vuelta al inicio. Es como una playlist en repetición, y lo logramos sin escribir un if.

Sonando devuelve la canción actual, con canciones entre corchetes actual. Y luego el getter y el setter del volumen, con la regla de 0 a 100 que ya conoces. Con esto, la clase Reproductor está lista.

---

## Parte 6: Paso 3, crear el reproductor (4:33 a 5:36)

**En pantalla**: Editor en línea. Se agrega `import` al inicio y se escribe la clase principal:

```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] lista = {"Canción 1", "Canción 2"};
    Reproductor r = new Reproductor(lista);
    int opcion = 0;
  }
}
```

**Narración**:

Paso 3: la clase principal. Al inicio importamos Scanner. Dentro de main creamos el Scanner, el array con dos canciones y el reproductor r con new, pasándole la lista.

Además, creamos la variable opcion, que guardará lo que elija el usuario y empieza en 0.

Veamos algunos detalles. Scanner es la herramienta de Java que nos permite leer lo que el usuario escribe con el teclado, y por eso le pasamos System.in, que representa el teclado.

En el array, cada canción va entre comillas porque son String, y todas van entre llaves.

Cuando escribimos new Reproductor y le pasamos lista, se ejecuta el constructor que escribimos antes, así que las canciones quedan guardadas en el objeto.

Y opcion empieza en 0 porque 0 es ninguna opción del menú.

---

## Parte 7: Paso 4, el ciclo del menú (5:36 a 7:13)

**En pantalla**: Editor en línea. Se escribe el ciclo dentro de `main`, se ejecuta y se prueban las opciones 1, 2 y 4:

```java
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
```

**Narración**:

Paso 4: el ciclo del menú. Usamos while: repetimos mientras la opción sea distinta de 4, que es salir.

En cada vuelta mostramos qué canción suena, con r punto sonando, y el volumen. Luego mostramos las opciones del menú con println y leemos la opción con nextInt, que lee un número.

Después, con if y else if, decidimos qué hacer. Si la opción es 1, pasamos a la siguiente canción. Si es 2, subimos el volumen: r punto setVolumen de r punto getVolumen más 1. Fíjate que usamos el getter y el setter, así la regla de 0 a 100 siempre se cumple.

Ejecutamos y probamos. La opción 1 cambia la canción, la 2 sube el volumen y la 4 termina el programa. Y la opción 3, bajar el volumen, la completarás tú en la práctica.

Fíjate en lo que pasa en pantalla: cada vez que elegimos una opción, el menú vuelve a aparecer con los datos actualizados. Esa es una vuelta del while. Si presionamos 1 varias veces, vemos que después de la canción 2 vuelve la canción 1, gracias al residuo del paso 2. Y si presionamos 2, el volumen sube de 5 a 6, a 7, y así.

No escribimos ningún if para la opción 4.

**Salida esperada**:

```text
=== Reproductor ===
Sonando: Canción 1
Volumen: 5
1) Siguiente canción
2) Subir volumen
3) Bajar volumen
4) Salir
```

---

## Parte 8: Prueba y depura (7:13 a 8:08)

**En pantalla**: Editor en línea. Se prueba cada opción, se provoca un error escribiendo una letra y se muestra cómo imprimir un valor con `println`.

**Narración**:

Probemos el programa. Primero, prueba cada opción: pasa de canción, sube el volumen y sal del programa.

Si aparece un error, léelo: el mensaje te dice en qué línea está el problema. Y si algo no se comporta como esperas, usa println para imprimir valores y ver qué está pasando.

Un detalle: nextInt solo acepta números, así que si escribes una letra, el programa se detendrá con un error. Por ahora, escribe solo números.

Ese error se llama InputMismatchException, que significa que el dato no coincide con lo que se esperaba, en caso pongas una letra en vez de un número. No te asustes si lo ves: no es que tu código esté mal, solo que se escribió algo que no era un número.

**Salida al escribir una letra**:

```text
Exception in thread "main" java.util.InputMismatchException
  at Main.main(Main.java:45)
```

---

## Parte 9: ¡Tu turno! Tu propio reproductor (8:08 a 9:04)

**En pantalla**: Diapositiva amarilla de práctica.

**Pausa**: La persona pausa el video por su cuenta. Este tiempo no se cuenta en la duración.

**Narración**:

¡Tu turno, es el proyecto final! Pausa el video.

Uno: copia la clase Reproductor y completa el menú.

Dos: agrega la opción 3 para bajar el volumen. Es parecido a subirlo, pero restando.

Tres: cambia las canciones por las que quieras, inventadas, y guarda tu proyecto para compartir el enlace.

¡Dale play cuando termines!

Antes de compartir tu enlace, prueba todo. Pasa por todas tus canciones con la opción 1. Sube y baja el volumen, y comprueba que con la opción 3 el volumen nunca baje de 0.

Si quieres, puedes agregar más de 2 canciones al array, y el residuo se encargará de que la lista siga dando la vuelta.

¿Y si te trabas? No pasa nada. Regresa a los pasos anteriores del video y compara tu código con el de la pantalla.

---

## Parte 10: Resumen de la lección (9:04 a 10:00)

**En pantalla**: Repaso de lo aprendido y próxima lección.

**Narración**:

¡Lo lograste! Planificaste un programa con dos clases, usaste clases, encapsulación, arrays, Scanner y while, y lo probaste y depuraste. Acabas de crear un programa con programación orientada a objetos.

Antes de pasar a la siguiente lección, repasemos rápido cada pieza. La clase Reproductor guarda sus datos como private y solo se cambian a través de sus métodos. Eso es encapsulación. El setter protege la regla de 0 a 100 del volumen. El array guarda las canciones y el residuo hace que la lista dé la vuelta sin usar un if. Scanner lee lo que escribe el usuario y el while repite el menú hasta que elige salir.

Cada una de estas piezas las vas a seguir usando en programas más grandes.

En la última lección veremos errores comunes, buenas prácticas y qué puedes aprender después. ¡Nos vemos!
`````