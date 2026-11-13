
# Guion: Lección 6. Encapsulación y estructuras de datos simples

**Duración**: 10 minutos  
**Proyecto**: Protección de datos en `Reproductor` y listas de canciones  
**Editor en línea**: [JDoodle](https://www.jdoodle.com/online-java-compiler)

En esta lección retomamos exactamente la clase `Reproductor` creada en la lección 5 para proteger sus atributos mediante encapsulación, y aprenderemos a manejar listas con arrays y métodos útiles de texto.

---

## Parte 1: Portada (0:00 a 0:30)

**En pantalla**: Portada de la lección 6.

**Narración**:

¡Hola de nuevo! En la lección anterior creaste tus primeras clases y objetos con la clase `Reproductor`. Hoy vas a aprender a proteger los datos de esa clase para que nadie pueda ponerles valores absurdos o estropearlos, y además aprenderás a guardar una lista completa de canciones. ¡Vamos!

---

## Parte 2: ¿Por qué proteger los datos? (0:30 a 1:25)

**En pantalla**: Diapositiva mostrando el problema: `rep.volumen = 500;` con un símbolo de alerta.

**Narración**:

Imagina que tienes tu objeto reproductor funcionando, y alguien en otra parte del programa escribe directamente `rep.volumen = 500;`. ¡Un volumen de 500 no tiene ningún sentido! En nuestro reproductor el volumen máximo permitido es 100 y el mínimo es 0.

Si dejamos los atributos abiertos, cualquiera puede modificarlos sin control. Para evitar este problema existe la encapsulación: consiste en proteger los datos internos de una clase y permitir que se lean o cambien únicamente bajo nuestras reglas. 

La encapsulación se construye con tres piezas clave: `private`, que oculta y protege el dato; `get`, que sirve para leerlo de forma segura; y `set`, que sirve para cambiarlo verificando reglas.

---

## Parte 3: `private`, datos protegidos (1:25 a 2:35)

**En pantalla**: Editor en línea. Se cambia los atributos a `private` y se provoca el error de acceso directo en `main`:

```java
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
        // rep.volumen = 500; // Esto marca error de compilación
    }
}
```

**Narración**:

Partimos de nuestra clase `Reproductor` de la lección anterior. Delante de `String cancion` e `int volumen` agregamos la palabra `private`.

`private` significa privado: indica que solo el código que está dentro de la propia clase `Reproductor` puede ver o tocar esos atributos. Ahora, si vamos a `main` e intentamos escribir `rep.volumen = 500;` y ejecutamos, Java detiene el programa y nos marca un error diciendo que `volumen` tiene acceso privado.

Hemos cerrado la puerta con llave. Entonces, ¿cómo leemos y cambiamos el volumen de manera controlada desde `main`? Con métodos públicos especiales: los getters y los setters.

---

## Parte 4: Getters, leer el dato (2:35 a 3:45)

**En pantalla**: Editor en línea. Se agrega el método `getVolumen()` en `Reproductor` y se imprime en `main`:

```java
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
}

public class Main {
    public static void main(String[] args) {
        Reproductor rep = new Reproductor("Canción 1");
        System.out.println(rep.getVolumen());
    }
}
```

**Narración**:

Un getter es un método cuya única misión es leer y entregar el valor de un atributo privado. Por convención se nombra con la palabra `get` seguida del nombre del atributo con mayúscula inicial: `getVolumen`.

Lo declaramos como `public` para que pueda usarse desde afuera de la clase, indicamos `int` porque devolverá el número del volumen, y adentro escribimos `return volumen;`.

Para usarlo en `main`, escribimos `System.out.println(rep.getVolumen());`. Ejecutamos y vemos en pantalla el 5 inicial. Ya podemos consultar el volumen de forma segura.

**Salida esperada**:

```text
5
```

---

## Parte 5: Setters, cambiar con reglas (3:45 a 5:15)

**En pantalla**: Editor en línea. Se añade `setVolumen(int v)` y se prueba con 50 y 500:

```java
    public void setVolumen(int v) {
        if (v >= 0 && v <= 100) {
            volumen = v;
        }
    }
```

Y dentro de `main`:

```java
        rep.setVolumen(50);
        System.out.println(rep.getVolumen());

        rep.setVolumen(500);
        System.out.println(rep.getVolumen());
```

**Narración**:

Ahora vamos con el setter, que sirve para modificar el valor, pero revisando primero que cumpla nuestras reglas. Se llama `setVolumen` y recibe entre paréntesis el nuevo valor `v`.

Aquí ponemos el filtro de seguridad: usamos un `if` que exige que `v` sea mayor o igual a 0 y, al mismo tiempo, menor o igual a 100. Esos dos símbolos `&&` se leen como "y", lo que significa que ambas condiciones deben cumplirse obligatoriamente. Solo si el número está entre 0 y 100, guardamos `v` en `volumen`.

Probemos en `main`: llamamos a `rep.setVolumen(50)` e imprimimos; sale 50. Ahora intentamos hacer trampa con `rep.setVolumen(500)` y volvemos a imprimir. ¡Sigue saliendo 50! El valor 500 fue rechazado automáticamente porque no cumplió la regla. Nuestro atributo está completamente protegido.

**Salida esperada**:

```text
50
50
```

---

## Parte 6: Arrays, una lista de valores (5:15 a 6:15)

**En pantalla**: Diapositiva visual mostrando las tres cajas de un array con sus índices `0`, `1` y `2`.

**Narración**:

Ahora pasemos a las estructuras de datos. Hasta hoy guardábamos una sola canción en una variable. ¿Qué pasa si queremos guardar una lista de canciones? Para eso usamos un array.

Un array es una estructura que guarda varios valores del mismo tipo agrupados bajo un solo nombre. Escribimos `String[] canciones = {"Canción 1", "Canción 2", "Canción 3"};`. Los corchetes después de `String` le indican a Java que esto es una lista, y entre llaves ponemos los elementos separados por comas.

Un detalle fundamental en programación: cada caja tiene una posición o índice, y **la primera posición siempre es la 0, no la 1**. Así que "Canción 1" está en la posición 0, "Canción 2" en la posición 1, y "Canción 3" en la posición 2.

---

## Parte 7: Recorrer un array con `for` (6:15 a 7:25)

**En pantalla**: Editor en línea. Se escribe el array y se recorre usando un bucle `for`:

```java
public class Main {
    public static void main(String[] args) {
        String[] canciones = {"Canción 1", "Canción 2", "Canción 3"};

        for (int i = 0; i < canciones.length; i++) {
            System.out.println(canciones[i]);
        }
    }
}
```

**Narración**:

Para mostrar o revisar todos los elementos de un array uno por uno, combinamos lo que aprendimos en la lección 3: usamos un bucle `for`.

Empezamos el contador en `int i = 0`, justamente porque la primera posición del array es 0. La condición es `i < canciones.length`: la propiedad `.length` nos dice automáticamente cuántos elementos tiene la lista (en este caso 3), así que el bucle dará vueltas para los índices 0, 1 y 2.

En cada vuelta imprimimos `canciones[i]`, que significa "dame la canción que está en la posición `i`". Ejecutamos y aparecen nuestras tres canciones en orden.

**Salida esperada**:

```text
Canción 1
Canción 2
Canción 3
```

---

## Parte 8: Cadenas de texto (`String`) (7:25 a 8:25)

**En pantalla**: Editor en línea. Se muestran `.length()` y `.equals()`:

```java
        String palabra = "Java";
        System.out.println(palabra.length());
        System.out.println(palabra.equals("Java"));
```

**Narración**:

Antes de terminar, veamos dos métodos muy útiles que tienen los textos `String`.

Creamos `String palabra = "Java";`. Si escribimos `palabra.length()` con paréntesis, nos devuelve cuántas letras tiene el texto: en este caso, 4.

Y si queremos saber si dos textos son idénticos, usamos `palabra.equals("Java")`, que devuelve `true` si son iguales o `false` si cambian en algo, incluso en una mayúscula. Recuerda siempre esta regla de oro en Java: para comparar textos usa siempre `.equals()`, nunca dos signos igual `==`.

**Salida esperada**:

```text
4
true
```

---

## Parte 9: ¡Tu turno! Protege y recorre (8:25 a 9:15)

**En pantalla**: Diapositiva amarilla de práctica.

**Pausa**: La persona pausa el video por su cuenta. Este tiempo no se cuenta en la duración.

**Narración**:

¡Tu turno! Pausa el video y ponlo en práctica.

Uno: agrega los atributos `private`, el getter `getVolumen` y el setter `setVolumen` con la validación de 0 a 100 en tu clase `Reproductor`.

Dos: crea un array con tres canciones inventadas y recórrelo con un bucle `for` para imprimirlas.

Tres: intenta llamar a `setVolumen(500)` y comprueba con `getVolumen()` que el valor no cambie.

¡Dale play cuando termines!

---

## Parte 10: Resumen de la lección (9:15 a 10:00)

**En pantalla**: Diapositiva de resumen y adelanto del proyecto final de la lección 7.

**Narración**:

¡Muy bien hecho! Repasemos los conceptos clave de hoy: `private` protege los atributos de una clase para evitar cambios indebidos; los getters permiten leer esos datos y los setters los modifican aplicando reglas; los arrays guardan listas de valores empezando en la posición 0; y `.equals()` es la forma correcta de comparar textos.

En la próxima lección llega el gran cierre práctico: vas a juntar todo lo aprendido para construir tu propio reproductor de música interactivo en la consola. ¡Nos vemos en el proyecto!
