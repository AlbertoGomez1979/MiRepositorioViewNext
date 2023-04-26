<!-- title: Ejercicio semana 2 -->

- [1. Ejercicio "Escuela" de la semana 2](#1-ejercicio-"Escuela"-de-la-semana-2)
  - [1.1. Instalación](#11-instalación)
  - [1.2. Descripción](#1.2-descripcion)
  - [1.3. Funcionalidades](#13-funcionalidades)
  - [1.4. Uso](#14-uso)
  - [1.5. Contribuir](#15-contribuir)
  - [1.6. Historia](#16-historia)
  - [1.7. Créditos y atribuciones](#17-créditos-y-atribuciones)
  - [1.8. License](#18-license)

# 1. Ejercicio "Escuela" de la semana 2

**Escuela**
Este es un proyecto Java que define la clase Coche, moto o barco que extiende de la clase abstracta Vehiculo. Al crear cada clase se crea una tabla usando hibernate.

## 1.1. Instalación

Si hubiese un método para instalar o ejecutar el proyecto, se indicaría aquí.

## 1.2. Descripcion
Para la descripción del proyecto voy a usar el ejemplo de la clase Coche:

La clase Coche representa un vehículo terrestre y se utiliza para instanciar objetos que contienen información sobre el color, la marca, el precio, la matrícula, el tipo de marchas y el tipo de coche. La clase también hereda los métodos para arrancar el coche y establecer la hora de inicio del viaje, entre otros.


## 1.3. Funcionalidades de las clases

La clase Coche tiene las siguientes funcionalidades:

    Constructor: Crea una instancia de Coche con un color, marca, precio, matrícula ,tipo de marchas y tipo de coche.
    setTipoMarcha(): manual o automatica.
    getTipoMarcha(): Devuelve el tipo de marcha.
    getTipoCoche(): Devuelve el tipo de coche.
    setTipoCoche(): Deportivo o familiar
    Los métodos heredados son:.
    arrancar(): Arranca el coche y establece la hora de inicio del viaje. Si el coche ya está en marcha, muestra un mensaje de aviso.
    retroceder(int metros): Retrocede el coche la cantidad de metros indicada. Si el coche no está en marcha, muestra un mensaje de aviso.
    parar(): Para el coche y muestra la hora de inicio y fin del viaje. Si el coche no está en marcha, muestra un mensaje de aviso.
    avanzar(int distancia): Avanza el coche la cantidad de metros indicada. Si el coche no está en marcha, muestra un mensaje de aviso.
    imprimirDatos(): Muestra los datos del coche.

```java
Coche coche = new Coche("Rojo", "Toyota", "20.000 €", "SADF12", "Manual");
String tipoMarcha = coche.getTipoMarchas();
coche.arrancar();
```
	

## 1.4. Uso

Cómo se debe usar el proyecto:
Al inicio del programa se pide la creación de un tipo de vehículo, el vehículo creado se guarda en base de datos usando hibernate y después se interactúa con el objeto creado, pudiendo elegir entre varias acciones.

**Uso de la clase Coche**
Para utilizar la clase Coche, primero debe instanciar un objeto pasando los argumentos adecuados al constructor. Luego, puede llamar a los métodos getTipoMarcha() y gett/setTipoCoche() según sea necesario.

## 1.5. Contribuir

1. Fork it!
2. Crea tu feature branch: `git checkout -b my-new-feature`
3. Haz Commit de tus cambios: `git commit -am 'Add some feature'`
4. Push al branch: `git push origin my-new-feature`
5. Submit un pull request

## 1.6. Historia

- Version 0.1 (2023-04-19) - lanzamiento inicial
- Version 0.2 (2023-04-20) - añadido método avanzar()
- Version 0.3 (2023-04-21) - añadido método retroceder()
- Version 0.4 (2023-04-22) - añadido método parar()
- Version 0.5 (2023-04-23) - añadido resto de métodos
- Version 0.6 (2023-04-24) - Pruebas unitarias y correcciones

## 1.7. Créditos y atribuciones

Lead Developer - Antoni (@antoni_dev)
Mentor - Carlos (@blah_blah)
Compañero - Alberto(@Compi)

## 1.8. License

The MIT License (MIT)

Copyright (c) 2015 Chris Kibble

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
