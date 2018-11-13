[TOC]


# Behavioral Design Patterns- Visitor Pattern
El libro Gang of Four define el patr�n Visitor Pattern como:
�Represents an operation to be performed on elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.�

Nos permite separar los algoritmos de la estructura del objeto.
- Se tiene un objeto con una estructura definida (posee elementos).
- Conjunto de algoritmos aplicados a los elementos del objeto; que no modifican o afectan al objeto o sus elementos.

Veamos el diagrama de clases del patr�n:

![](https://static.dzone.com/dz1/dz-files/visitor_pattern.png)

### Cuando usar el patr�n Visitor:
- La estructura del objeto no cambia con frecuencia, pero s� podr�an las operaciones que definen su comportamiento.
- Se tiene una funcionalidad espec�fica para cada elemento de la clase y desea encapsularla.
- La operaci�n requiere datos que el objeto no conoce.
- Desea mantener el estado dentro de las operaciones en m�ltiples objetos.

### Diferencias entre el patr�n strategy pattern y visitor pattern
- El patr�n estrategia representa una relaci�n 1:many. Donde se tiene un objeto al que se quiere aplicar m�ltiples operaciones (estrategias).
Por ejemplo:
Se tiene una clase Video que encapsula un video clip, y deseo comprimirlo usando diferentes algoritmos; para ello creamos m�ltiples clases estrategia.
      MpegCompression
      AviCompression
      QuickTimeCompression
- El patr�n visitor representa una relaci�n de many:many. Que sucede si la aplicaci�n crece y ahora no solo se incluye video sino tambi�n audio. Si se desea atacar el problema con el patr�n estrategia se tendr�a que duplicar la clase de compresi�n uno para video y la otra para audio:
      MpegVideoCompression
      MpegAudioCompression
- Si uso el patron visitor, no tengo que duplicar clases; lo �nico que tengo que hacer es agregar un m�todo:
      MpegCompression::compressVideo(Video object)
      MpegCompression::compressAudio(Audio object)
