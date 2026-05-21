# Resumen
Este proyecto consiste en una aplicación de consola en Java diseñada para la lectura y volcado de datos textuales. El objetivo principal del ejercicio es aprender a utilizar la clase Scanner (habitualmente empleada para leer el teclado) como una herramienta de parseo secuencial de archivos físicos de texto plano (.txt).

## Características
Lectura Orientada a Tokens/Líneas: Utiliza el método .hasNextLine() como condición de parada para comprobar si quedan datos pendientes en el flujo antes de extraerlos.

Abstracción del Sistema de Archivos: Emplea la clase lógica File de Java para apuntar y vincular el recurso físico del disco duro dentro del entorno de ejecución.

Control de Excepciones Obligatorio: Gestiona de forma explícita la excepción comprobada (checked exception) FileNotFoundException, un requisito imperativo impuesto por el compilador de Java al trabajar con esta API.
