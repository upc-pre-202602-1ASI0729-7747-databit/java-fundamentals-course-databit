# Guion: Lección 5. Clases y objetos

**Duración**: 9 minutos  
**Proyecto**: Clase `Reproductor`  
**Editor en línea**: [JDoodle](https://www.jdoodle.com/online-java-compiler)

En esta lección se crea la clase `Reproductor` con atributos, constructor y métodos, y se crean dos objetos con `new`.

---

## Notas de producción

- Coordinar con el Integrante 3 el código de la clase `Reproductor`: la lección 6 empieza donde termina esta.
- Usar canciones inventadas (`Canción 1`, `Canción 2`); no mencionar canciones ni artistas reales.
- En JDoodle, las dos clases van en el mismo archivo y solo la clase con `main` lleva `public`. Probar el código completo antes de grabar.

---

## Parte 1: Portada (0:00 a 0:30)

**En pantalla**: Portada de la lección 5.

**Narración**:

¡Bienvenido a la lección 5! Empezamos con la programación orientada a objetos, una forma de organizar los programas que se usa en millones de aplicaciones.

Hoy vas a crear tu primera clase: un reproductor de música, que seguirá apareciendo en las próximas lecciones. ¡Vamos!

---

## Parte 2: Clase = molde, objeto = lo que creas (0:30 a 1:30)

**En pantalla**: Diapositiva del molde y los tres objetos: Celular, Parlante y Radio.

**Narración**:

Piensa en un molde de galletas. El molde es la clase, y cada galleta que sale del molde es un objeto.

Aquí nuestro molde es la clase Reproductor. Con ese molde podemos crear muchos objetos: un reproductor celular, uno parlante y uno radio. Todos se crean con el mismo molde, pero cada uno tiene sus propios datos: su canción y su volumen.

Una clase, muchos objetos.

---

## Parte 3: ¿Qué tiene y qué hace un reproductor? (1:30 a 2:20)

**En pantalla**: Diapositiva de Atributos y Métodos.

**Narración**:

Una clase describe dos cosas. Primero, los atributos: lo que el objeto tiene. Un reproductor tiene una canción y un volumen.

Segundo, los métodos: lo que el objeto hace. Un reproductor puede reproducir y subir el volumen.

Atributos: lo que tiene. Métodos: lo que hace.

---

## Parte 4: Escribir la clase Reproductor (2:20 a 4:00)

**En pantalla**: Diapositiva de código y luego JDoodle en vivo. Escribe en pasos: atributos y después constructor.

```java
class Reproductor {
  String cancion;
  int volumen;

  Reproductor(String cancion) {
    this.cancion = cancion;
    this.volumen = 5;
  }
}
```

**Narración**:

Vamos a escribirla. Empezamos con la palabra class y el nombre, Reproductor, con R mayúscula.

Dentro de las llaves, los atributos: String cancion, para la canción, e int volumen, para el volumen.

Ahora, ¿cómo se crea un reproductor? Con un constructor. El constructor se llama igual que la clase, Reproductor, y recibe entre paréntesis la canción con la que va a empezar. Dentro, guardamos ese dato en el atributo: this punto cancion igual a cancion. La palabra this significa este objeto: así distinguimos el atributo del objeto de la canción que recibimos.

Y le damos al volumen un valor inicial: 5. Con esto, cada vez que creemos un reproductor, nacerá con su canción y con volumen 5.

---

## Parte 5: Los métodos del objeto (4:00 a 5:10)

**En pantalla**: Diapositiva de código y luego JDoodle en vivo. Escribe los métodos dentro de la clase.

```java
void reproducir() {
  System.out.println("Sonando: " + cancion);
}

void subirVolumen() {
  volumen = volumen + 1;
}
```

**Narración**:

Ahora agregamos lo que el reproductor hace, con métodos dentro de la clase. El primero, reproducir, muestra el mensaje Sonando seguido de la canción del objeto. El segundo, subirVolumen, le suma 1 al volumen.

Observa que los métodos usan los atributos del propio objeto, cancion y volumen, sin necesidad de recibirlos. Así, cada reproductor usa su propia canción y su propio volumen.

---

## Parte 6: Crear objetos con new (5:10 a 6:30)

**En pantalla**: Diapositiva de código y luego JDoodle en vivo, dentro de `main`.

```java
Reproductor a = new Reproductor("Canción 1");
Reproductor b = new Reproductor("Canción 2");
a.subirVolumen();
a.reproducir();
// Opcional para mostrar que son independientes:
System.out.println(a.volumen);
System.out.println(b.volumen);
```

**Narración**:

Ya tenemos el molde. Ahora creamos objetos con new. La primera línea dice: crea un Reproductor llamado a, con new Reproductor y la Canción 1. La segunda crea otro, b, con la Canción 2. Son dos objetos distintos, cada uno con sus propios datos.

Con el punto usamos sus métodos: a punto subirVolumen sube el volumen de a, y a punto reproducir muestra Sonando: Canción 1.

Si subimos el volumen de a, el de b no cambia: cada objeto es independiente.

**Salida esperada**:

```text
Sonando: Canción 1
6
5
```

---

## Parte 7: En el editor, varias clases en un archivo (6:30 a 7:20)

**En pantalla**: Diapositiva de las dos clases y la regla.

```java
class Reproductor {
  // atributos y métodos
}

public class Main {
  public static void main(String[] args) {
    // aquí empieza todo
  }
}
```

**Narración**:

Un detalle práctico para el editor. Tenemos dos clases en el mismo archivo: Reproductor y Main, que contiene main.

La regla: solo la clase que tiene main lleva la palabra public. Las demás clases se escriben sin public, y todas van en el mismo archivo. Así lo haremos en este curso.

---

## Parte 8: ¡Tu turno! Tu clase Reproductor (7:20 a 8:15)

**En pantalla**: Diapositiva amarilla de práctica. Déjala fija unos 3 segundos.

**Pausa**: La persona pausa el video por su cuenta. Este tiempo no se cuenta en la duración.

**Narración**:

¡Tu turno! Pausa el video. Uno: crea la clase Reproductor con canción y volumen. Dos: crea dos reproductores con new. Tres: llama a subirVolumen y a reproducir.

Si aparece un error, revisa los puntos y comas, las llaves y las mayúsculas. Usa canciones inventadas, como Canción 1. ¡Dale play cuando termines!

---

## Parte 9: Resumen de la lección (8:15 a 9:00)

**En pantalla**: Diapositiva de resumen.

**Narración**:

Repasemos: la clase es el molde y el objeto es lo que se crea con él; una clase tiene atributos, un constructor y métodos; y new crea objetos que tienen sus propios datos.

En la próxima lección aprenderás a proteger esos datos y a usar listas. ¡Nos vemos!

---

## Código completo de referencia

```java
class Reproductor {
  String cancion;
  int volumen;

  Reproductor(String cancion) {
    this.cancion = cancion;
    this.volumen = 5;
  }

  void reproducir() {
    System.out.println("Sonando: " + cancion);
  }

  void subirVolumen() {
    volumen = volumen + 1;
  }
}

public class Main {
  public static void main(String[] args) {
    Reproductor a = new Reproductor("Canción 1");
    Reproductor b = new Reproductor("Canción 2");
    a.subirVolumen();
    a.reproducir();
    System.out.println(a.volumen);
    System.out.println(b.volumen);
  }
}
```

**Salida esperada**:

```text
Sonando: Canción 1
6
5
```
