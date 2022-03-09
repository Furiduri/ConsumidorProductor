# El problema del productor y el consumidor

Este problema puede presentar también la condición de competencia,
debido a que la variable compartida (contador) no tiene restricciones.
Podría ocurrir la siguiente situación, el almacén está vacío y el
consumidor acaba de leer el contador con un valor 0. En ese momento,
el planificador decide detener la ejecución del consumidor en forma
temporal e inicia la ejecución del productor, el cual introduce un
elemento en el almacén e incrementa el contador y observa que su valor
actual es 1, por lo que asume que el consumidor estaba dormido y lo
llama para despertarlo.

El consumidor no está dormido desde el punto de vista lógico, por lo que
la señal de despertar se pierde. En la siguiente ejecución del
consumidor, éste probará el valor del contador que ya había leído, verá
que es 0 y se ira a dormir, tarde o temprano el productor llenará el
almacén y también se dormirá.

## Caracteristicas a cubrir
 * Semáforos

 * Contadores de eventos

 * Monitores

 * Transferencia de mensajes

 