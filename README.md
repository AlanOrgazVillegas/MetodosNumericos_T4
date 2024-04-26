# Métodos numéricos Tema 4: Diferenciación e integración númerica.
Problemario de la asignatura de métodos numéricos, tema 4. 5ejericicios del método de trapecio, regla de Simpson 1/3 y regla de Simpson 3/8

********************************************************************************************************************************************
## ÍNDICE
+ Método del trapecio
  - Definición.
  - Algoritmo.
  - Código en Java.
  - Ejercicios.
+ Método de Simpson 1/3
  - Definición.
  - Algoritmo.
  - Código en java.
  - Ejercicios.
+ Método de Simpson 3/8
  -Definición.
  - Algoritmo.
  - Código en java.
  - Ejercicios.
********************************************************************************************************************************************
# Método del trapecio
## Definición

El método del trapecio es una técnica de integración numérica utilizada para aproximar el valor de una integral definida. La idea detrás del método del trapecio es aproximar el área bajo una curva mediante un conjunto de trapecios cuyas bases son segmentos de la curva y cuyas alturas son la distancia entre los puntos de la partición. En esencia, se aproxima el área bajo la curva como la suma de las áreas de los trapecios.

Fórmula: ![Captura de pantalla (749)](https://github.com/AlanOrgazVillegas/MetodosNumericos_T4/assets/147757830/8de4aa6d-99a7-4d5a-a002-073596bfbe70)

## Algortimo
```
Función Trapecio(f, a, b, n):
    h = (b - a) / n
    suma = 0.5 * (f(a) + f(b)) // Sumamos el valor de f(a) y f(b) al resultado
    Para i desde 1 hasta n-1:
        xi = a + i * h // Calculamos los puntos de partición
        suma = suma + f(xi) // Sumamos el valor de f(xi) al resultado
    resultado = h * suma // Multiplicamos por el ancho de los trapecios
    Devolver resultado
```
## Código en Java

```
package metodotrapecio_ejercicio1;
import java.util.function.Function;
public class MetodoTrapecio_Ejercicio1 {
    public static double metodoTrapecio(double a, double b, int n, Function<Double, Double> f) {
        double h = (b - a) / n; 
        double suma = 0.5 * (f.apply(a) + f.apply(b)); 
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            suma += f.apply(x);
        }
        return h * suma;
    }
    public static void main(String[] args) {
        double a = 1.3; 
        double b = 1.8;
        int n = 1;
        Function<Double, Double> funcion = x ->  Math.pow(x, 3) - (6*Math.pow(x, 2)) + (11*x) - 6;
        double resultado = metodoTrapecio(a, b, n, funcion);
        System.out.println("El resultado de la integral definida es: " + resultado);
    }
}
```
### Salida

![Captura de pantalla (750)](https://github.com/AlanOrgazVillegas/MetodosNumericos_T4/assets/147757830/7068292e-5553-4b3f-9a62-197c30764488)

## 5 Ejercicios en Java

Enlace de ejercicios: 

********************************************************************************************************************************************




