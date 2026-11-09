# Guión — Lección 3: Estructuras de control: decisiones y bucles

**Duración estimada**: 8 minutos

## PORTADA

**LOCUTOR:** ¡Bienvenido a la lección 3! Hasta ahora, tu programa hace todo en orden, una instrucción tras otra. Hoy vas a aprender a que tome decisiones y a que repita tareas. ¡Vamos a darle inteligencia a tus programas!

---

## TU PROGRAMA TAMBIÉN TOMA DECISIONES

**LOCUTOR:** Tomamos decisiones todos los días. Si llueve, llevas paraguas; si no llueve, sales sin él. La pregunta ¿llueve? es una condición, y según la respuesta tomamos un camino u otro.

Los programas hacen lo mismo. En Java escribimos `if`, que significa si, seguido de una condición. Si se cumple, se ejecuta un bloque; y con `else`, que significa si no, indicamos qué hacer cuando no se cumple.

---

## IF Y ELSE

**LOCUTOR:** Veamos un ejemplo. Guardamos la edad: `int edad = 14;`. Luego escribimos `if` y, entre paréntesis, la condición: `edad >= 12`, edad mayor o igual a 12.

Si es verdadera, se ejecuta lo que está entre las llaves: mostramos `"Puedes entrar"`. Las llaves encierran lo que se ejecuta. Si no se cumple, se ejecuta el bloque del `else`: mostramos `"Aún no"`.

Ejecutamos: sale `Puedes entrar`, porque 14 es mayor que 12. Ahora cambio la edad a 10 y vuelvo a ejecutar: sale `Aún no`. ¡El mismo programa, otra decisión!

---

## COMPARAR VALORES

**LOCUTOR:** Para escribir condiciones usamos operadores de comparación: mayor que, `>`; menor que, `<`; mayor o igual, `>=`; y menor o igual, `<=`. Igual a se escribe con dos signos igual, `==`, y distinto de se escribe con un signo de exclamación y un igual, `!=`.

Ojo con esto: un solo signo igual guarda un valor en una variable; dos signos iguales comparan. Es un error muy común.

Y para comparar texto se usa otra herramienta, que veremos más adelante.

---

## EL BUCLE FOR

**LOCUTOR:** A veces necesitamos repetir algo muchas veces. Para eso existen los bucles. El primero es `for`, que repite un número conocido de veces. Tiene tres partes dentro del paréntesis: `for (int i = 1; i <= 5; i++)`.

Inicio: `int i = 1`, empezamos contando desde 1. Condición: `i <= 5`, seguimos mientras esto sea verdadero. Y paso: `i++`, que suma 1 en cada vuelta. Dentro de las llaves mostramos `i` con `System.out.println(i);`.

Ejecutamos: 1, 2, 3, 4, 5. ¡Cinco vueltas sin escribir cinco veces la misma línea!

---

## EL BUCLE WHILE

**LOCUTOR:** El segundo bucle es `while`, que significa mientras. Repite mientras la condición sea verdadera. Imagina un juego con 3 vidas: `int vidas = 3;`. Mientras `vidas > 0`, mostramos cuántas vidas quedan y le restamos una; `vidas--` resta 1.

Ejecutamos: `Vidas: 3`, `Vidas: 2`, `Vidas: 1`, y al llegar a 0 el bucle termina.

Pero cuidado: si olvidáramos restar la vida, la condición nunca cambiaría y el bucle no terminaría nunca. Eso se llama bucle infinito. Si te pasa en el editor, detén la ejecución.

---

## ¡TÚ TURNO! DECIDE Y REPITE

**LOCUTOR:** ¡Tu turno! Pausa el video. Uno: decide si una persona puede entrar a una película según su edad, con `if` y `else`. Dos: haz una cuenta regresiva de 5 a 1 con `for`; la pista es empezar en 5 y usar `i--`. Y tres: usa `while` para repetir mientras tengas vidas.

Cuidado con los bucles infinitos. ¡Dale play cuando termines!

---

## RESUMEN DE LA LECCIÓN

**LOCUTOR:** Repasemos: `if` y `else` toman decisiones; `for` repite un número de veces; y `while` repite mientras se cumpla una condición.

En la próxima lección vas a crear tus propios métodos y a leer datos que escriba el usuario. ¡Nos vemos!
