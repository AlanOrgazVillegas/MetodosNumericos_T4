package metodotrapecio_ejercicio1;

import java.util.function.Function;
/**
 * @author Alan
 */
public class MetodoTrapecio_Ejercicio5 {
    // Método para calcular la aproximación de la integral definida utilizando el método del trapecio
    public static double metodoTrapecio(double a, double b, int n, Function<Double, Double> f) {
        double h = (b - a) / n; // Calcula el ancho de cada subintervalo
        double suma = 0.5 * (f.apply(a) + f.apply(b)); // Suma los valores en los extremos
        // Suma los valores en los puntos internos
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            suma += f.apply(x);
        }
        return h * suma;
    }

    public static void main(String[] args) {
        double a = 0; // Límite inferior de integración
        double b = Math.PI/2; // Límite superior de integración
        int n = 1; // Número de subintervalos
        // Definir la función f(x) como una expresión lambda
        Function<Double, Double> funcion = x ->   Math.cos(x);
        // Calcular la integral definida utilizando el método del trapecio
        double resultado = metodoTrapecio(a, b, n, funcion);
        System.out.println("El resultado de la integral definida es: " + resultado);
    }

}
