misionerosYCanibales
====================
====================
### Tecnológico de Costa Rica
#####Escuela de Ingeniería en Computación
#####IC3002 Análisis de Algoritmos - Prof. Mauricio Rojas
#####201157035 Brayan Fajardo Alvarado - Fecha: 11 de octubre de 2014
#####TAREA: Bactraking
_____



##### Descripción
La idea es resolver un problema hipotético donde se tienen tanto misioneros como caníbales en una isla, y deben llevarse en bote hasta otra isla.
El bote puede llevar como máximo 2 personas, como mínimo 1. El bote no puede ir solo.

En cada isla no puede haber en un momento dado mas caníbales que misioneros,
porque sino los caníbales se los devoran.
La tarea consiste en realizar una implementación en Java, usando las técnicas de backtracking para resolver el problema.
En cada paso el algoritmo debe imprimir en pantalla el estado. Por ejemplo

3m2c1b ____0m0c0b este es el estado inicial.

En cada paso hay que imprimir el estado, llevar algún tipo de tabulación para poder marcar la recursión.

Por ejemplo

3m2c1b ____0m0c0b

3m0c0b ____0m2c1b


3m1c1b ____0m1c0b

1m1c1b ____2m1c1b

#####La solución de dicho algoritmo se adjunta en los archivos del repositorio misionerosYCanibales en GitHub.com
