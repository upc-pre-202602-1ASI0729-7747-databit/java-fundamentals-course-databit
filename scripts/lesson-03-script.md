# Guion: Lección 3. Estructuras de control: decisiones y bucles

**Duración**: 8 minutos  
**Proyecto**: Decisiones y bucles  
**Editor en línea**: [JDoodle](https://www.jdoodle.com/online-java-compiler)

---

## Parte 1: Portada (0:00 a 0:25)

**En pantalla**: Portada de la lección 3.

**Narración**:
¡Bienvenido a la lección 3! Hasta ahora, tu programa hace todo en orden, una instrucción tras otra. Hoy vas a aprender a que tome decisiones y a que repita tareas. ¡Vamos a darle inteligencia a tus programas!

---

## Parte 2: Tu programa también toma decisiones (0:25 a 1:15)

**En pantalla**: Diapositiva del rombo "¿Llueve?" con las dos respuestas y la forma general del if y else.

**Narración**:
Tomamos decisiones todos los días. Si llueve, llevas paraguas; si no llueve, sales sin él. La pregunta ¿llueve? es una condición, y según la respuesta tomamos un camino u otro.

Los programas hacen lo mismo. En Java escribimos if, que significa si, seguido de una condición. Si se cumple, se ejecuta un bloque; y con else, que significa si no, indicamos qué hacer cuando no se cumple.

---

## Parte 3: if y else (1:15 a 2:45)

**En pantalla**: Diapositiva de código y luego JDoodle en vivo. Cambia la edad para mostrar los dos resultados.

**Narración**:
Veamos un ejemplo. Guardamos la edad, 14. Luego escribimos if y, entre paréntesis, la condición: edad mayor o igual a 12.

Si es verdadera, se ejecuta lo que está entre las llaves: mostramos Puedes entrar. Las llaves encierran lo que se ejecuta. Si no se cumple, se ejecuta el bloque del else: mostramos Aún no.

Ejecutamos: sale Puedes entrar, porque 14 es mayor que 12. Ahora cambio la edad a 10 y vuelvo a ejecutar: sale Aún no. ¡El mismo programa, otra decisión!

---

## Parte 4: Comparar valores (2:45 a 3:45)

**En pantalla**: Diapositiva con las seis tarjetas de comparación.

**Narración**:
Para escribir condiciones usamos operadores de comparación: mayor que, menor que, mayor o igual y menor o igual. Igual a se escribe con dos signos igual, y distinto de se escribe con un signo de exclamación y un igual.

Ojo con esto: un solo signo igual guarda un valor en una variable; dos signos iguales comparan. Es un error muy común.

Y para comparar texto se usa otra herramienta, que veremos más adelante.

---

## Parte 5: El bucle for (3:45 a 5:10)

**En pantalla**: Diapositiva de código y luego JDoodle en vivo.

**Narración**:
A veces necesitamos repetir algo muchas veces. Para eso existen los bucles. El primero es for, que repite un número conocido de veces. Tiene tres partes dentro del paréntesis.

Inicio: int i igual a 1, empezamos contando desde 1. Condición: i menor o igual a 5, seguimos mientras esto sea verdadero. Y paso: i más más, que suma 1 en cada vuelta. Dentro de las llaves mostramos i.

Ejecutamos: 1, 2, 3, 4, 5. ¡Cinco vueltas sin escribir cinco veces la misma línea!

---

## Parte 6: El bucle while (5:10 a 6:40)

**En pantalla**: Diapositiva de código y luego JDoodle en vivo. No ejecutes un bucle infinito en el video; muéstralo solo con la diapositiva.

**Narración**:
El segundo bucle es while, que significa mientras. Repite mientras la condición sea verdadera. Imagina un juego con 3 vidas. Mientras vidas sea mayor que 0, mostramos cuántas vidas quedan y le restamos una; vidas menos menos resta 1.

Ejecutamos: Vidas 3, Vidas 2, Vidas 1, y al llegar a 0 el bucle termina.

Pero cuidado: si olvidáramos restar la vida, la condición nunca cambiaría y el bucle no terminaría nunca. Eso se llama bucle infinito. Si te pasa en el editor, detén la ejecución.

---

## Parte 7: ¡Tu turno! Decide y repite (6:40 a 7:25)

**En pantalla**: Diapositiva amarilla de práctica. Déjala fija unos 3 segundos.

**Narración**:
¡Tu turno! Pausa el video. Uno: decide si una persona puede entrar a una película según su edad, con if y else. Dos: haz una cuenta regresiva de 5 a 1 con for; la pista es empezar en 5 y usar i menos menos. Y tres: usa while para repetir mientras tengas vidas.

Cuidado con los bucles infinitos. ¡Dale play cuando termines!

---

## Parte 8: Resumen de la lección (7:25 a 8:00)

**En pantalla**: Diapositiva de resumen con la próxima lección.

**Narración**:
Repasemos: if y else toman decisiones; for repite un número de veces; y while repite mientras se cumpla una condición.

En la próxima lección vas a crear tus propios métodos y a leer datos que escriba el usuario. ¡Nos vemos!