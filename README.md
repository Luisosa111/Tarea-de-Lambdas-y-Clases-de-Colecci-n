## Universidad Autonoma de Baja california
Alumno Luis Enrique Sosa Gonzalez
Matricula:1186855
Profesora: Maria Luisa Gonzalez Ramirez
Materia POO
Tarea de lambda
Proyecto: Colecciones y Streams en Java

## Descripción
Este proyecto implementa una serie de 10 métodos estáticos en Java que utilizan estructuras de datos como ArrayList, HashSet y HashMap,lambda y Streams.
## Estructura del proyecto

Se realizaron 3 clases 
Clase numeros que trabaja con los problemas de numeros
y la clase de Cadena que trabaja con letras y la 3ra es el main para probar que funciones las demas clases.

## Métodos

1. El Multiplicador (ArrayList)
Multiplica cada número de un ArrayList<Integer> por un factor usando replaceAll y una expresión lambda, cambiando directamente la lista original.

2. El Filtro Selectivo (ArrayList)
Elimina de una lista las cadenas que comienzan con una letra específica o que tienen una longitud menor a un valor dado usando removeIf, y además incluye una función que verifica si alguna cadena contiene la palabra "Pollo".

3. Conversor de Mayúsculas (ArrayList)
Convierte todas las cadenas de una lista a mayúsculas utilizando stream y map, devolviendo un nuevo ArrayList con los resultados.

4. Cuadrados Únicos (HashSet)
Filtra los números pares de una lista, elimina duplicados, calcula su cuadrado y los guarda en un HashSet para asegurar que no haya repetidos.

5. Mapa de Longitudes (HashMap)
Crea un HashMap<String, Integer> donde cada palabra es la clave y su longitud es el valor, utilizando Collectors.toMap.

6. Modificador de Inventario (HashMap)
Recorre un HashMap de productos y precios e imprime cada elemento aplicando un descuento del 10% usando forEach con una expresión lambda.

7. Contador de Frecuencias (HashMap)
Cuenta cuántas veces aparece cada palabra en una lista y almacena los resultados en un HashMap, utilizando merge para acumular las frecuencias.

8. Clasificador de Palabras (HashMap)
Filtra las palabras de un mapa según su frecuencia usando entrySet().stream(), devolviendo un ArrayList con aquellas cuya frecuencia es menor a un valor dado.

9. Deduplicación de Palabras (HashSet)
Divide una frase en palabras, las convierte a minúsculas, filtra por longitud mínima y elimina duplicados guardando el resultado en un HashSet.

10. El Tope de Frecuencias (HashMap)
Limita los valores de un HashMap a un máximo establecido usando replaceAll, ajustando las frecuencias que superen ese límite.




## Instrucciones de compilación y ejecución

1. Abrir la terminal en la carpeta del proyecto y compilar
2. Compilar los archivos:

## Ejemplo de salida

Ejemplo de salida
Antes: [1, 2, 3, 4]
Después: [3, 6, 9, 12]

Antes filtro: [Pollo, Loro, gato, taza, amigo]
Después filtro: [Pollo, Loro, gato, amigo]
¿Contiene 'Pollo'? true

Mayúsculas: [POLLO, LORO, GATO, AMIGO]

Cuadrados únicos: [4, 16, 36]

Mapa longitudes: {Pollo=5, Loro=4, gato=4, amigo=5}

Inventario con descuento:
Platano -> $9.0
Pan -> $18.0

Frecuencias: {hola=2, hol=1}
Frecuencia < 2: [hol]

Deduplicado: [hola, mundo, java]

Antes límite: {hola=2, hol=1}
Después límite: {hola=1, hol=1}



