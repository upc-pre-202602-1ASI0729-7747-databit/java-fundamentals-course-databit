# Guión — Lección 2: Variables, tipos de datos y operadores

**Duración estimada**: 8 minutos

## PORTADA

**LOCUTOR:** ¡Hola de nuevo! En la lección anterior viste que un programa es una lista de instrucciones. Hoy hablaremos sobre las variables, tipos de datos y operadores; aprenderás a guardar datos en tu programa y a hacer cálculos con ellos. Son los cimientos de todo lo que vendrá después. ¡Vamos!

---

## Una variable es una caja con nombre

**LOCUTOR:** Una variable es como una caja con nombre. Aquí tenemos tres cajas: `edad` guarda el número 15, `nombre` guarda el texto Luna y `puntos` guarda 120.

Cada caja tiene un nombre que nos sirve para encontrarla, y guarda un dato que podemos usar después. Así, una variable guarda un dato para usarlo cuando lo necesitemos.

---

## DECLARAR UNA VARIABLE

**LOCUTOR:** Para crear una variable, la declaramos, y tiene tres partes. Mira esta línea: `int edad = 15;`.

Primero, el tipo, `int`, que dice qué clase de dato guarda. Segundo, el nombre, `edad`, que es cómo la llamamos. Y tercero, el valor, `15`, que es el dato que guarda. Y al final, el punto y coma.

---

## TIPOS DE DATOS BÁSICOS

**LOCUTOR:** Java tiene distintos tipos de datos. Tenemos cuatro:

* **`int`**: guarda números enteros, sin decimales, como la edad. `int edad = 15;`
* **`double`**: guarda números decimales, como la altura. `double altura = 1.65;` En Java el decimal se escribe con punto.
* **`boolean`**: guarda verdadero o falso, solo dos valores: `true` o `false`. `boolean gano = true;`
* **`String`**: guarda texto y va entre comillas dobles. `String nombre = "Luna";` Fíjate que `String` se escribe con S mayúscula.

Elegir bien el tipo es decidir qué clase de caja necesitas.

---

## VARIABLES EN ACCIÓN

**LOCUTOR:** Veamos cómo funcionan en acción. Creamos `int puntos = 10;`. Luego escribimos `puntos = puntos + 5;`: tomamos lo que había, le sumamos 5 y lo guardamos otra vez; ahora vale 15. Y con `System.out.println(puntos);` lo mostramos.

Ejecutamos y aparece 15. Las variables pueden cambiar de valor, ¡por eso se llaman variables!

---

## OPERADORES ARITMÉTICOS

**LOCUTOR:** Para hacer cálculos usamos operadores. El signo más, `+`, suma; el menos, `-`, resta; el asterisco, `*`, multiplica; y la barra, `/`, divide.

Ojo con la división: con números `int` el resultado no tiene decimales, así que `7 / 2` da 3, no 3.5.

Y por último, el signo de porcentaje, `%`, que se llama residuo: nos da lo que sobra de una división. Diez entre 3 es 3 y sobra 1, así que `10 % 3` da 1. Lo usaremos más adelante en el curso.

---

## EXPRESIONES Y TEXTO

**LOCUTOR:** Una expresión combina valores, variables y operadores. Imagina un juego: tienes 3 monedas y cada una vale 10 puntos, más un bono de 5. Escribimos `int monedas = 3;` y luego `int total = monedas * 10 + 5;`.

Java hace primero la multiplicación y después la suma, igual que en matemáticas: 30 más 5, 35. Y fíjate en la última línea: `System.out.println("Total: " + total);`. El signo más también sirve para unir texto con un valor.

Ejecutamos y el resultado es `Total: 35`.

---

## ¡TU TURNO! VARIABLES Y CÁLCULOS

**LOCUTOR:** ¡Tu turno! Pausa el video y abre el enlace. Primero, crea variables con tu nombre y tu edad y muéstralas. Segundo, calcula los puntos de un juego: 3 monedas de 10 puntos cada una. Y tercero, prueba cada operador con tus propios números.

Recuerda terminar cada línea con punto y coma. ¡Dale play cuando termines!

---

## RESUMEN DE LA LECCIÓN

**LOCUTOR:** Repasemos: una variable es una caja con nombre; los tipos básicos son `int`, `double`, `boolean` y `String`; y los operadores son más, menos, por, entre y residuo.

En la próxima lección tu programa va a tomar decisiones. ¡Hasta pronto!
