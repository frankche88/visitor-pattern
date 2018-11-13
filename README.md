[TOC]


# Behavioral Design Patterns- Visitor Pattern
El libro Gang of Four define el patrón Visitor Pattern como:
“Represents an operation to be performed on elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.”

Nos permite separar los algoritmos de la estructura del objeto.
- Se tiene un objeto con una estructura definida (posee elementos).
- Conjunto de algoritmos aplicados a los elementos del objeto; que no modifican o afectan al objeto o sus elementos.

Veamos el diagrama de clases del patrón:

![](https://static.dzone.com/dz1/dz-files/visitor_pattern.png)

### Cuando usar el patrón Visitor:
- La estructura del objeto no cambia con frecuencia, pero sí podrían las operaciones que definen su comportamiento.
- Se tiene una funcionalidad específica para cada elemento de la clase y desea encapsularla.
- La operación requiere datos que el objeto no conoce.
- Desea mantener el estado dentro de las operaciones en múltiples objetos.

### Diferencias entre el patrón strategy pattern y visitor pattern
- El patrón estrategia representa una relación 1:many. Donde se tiene un objeto al que se quiere aplicar múltiples operaciones (estrategias).
Por ejemplo:
Se tiene una clase Video que encapsula un video clip, y deseo comprimirlo usando diferentes algoritmos; para ello creamos múltiples clases estrategia.
      MpegCompression
      AviCompression
      QuickTimeCompression
- El patrón visitor representa una relación de many:many. Que sucede si la aplicación crece y ahora no solo se incluye video sino también audio. Si se desea atacar el problema con el patrón estrategia se tendría que duplicar la clase de compresión uno para video y la otra para audio:
      MpegVideoCompression
      MpegAudioCompression
- Si uso el patron visitor, no tengo que duplicar clases; lo único que tengo que hacer es agregar un método:
      MpegCompression::compressVideo(Video object)
      MpegCompression::compressAudio(Audio object)
