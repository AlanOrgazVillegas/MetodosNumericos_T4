package metodosimpson1_3_ejercicio1;

import java.util.function.Function;

/**
 *
 * @author Alan
 */
public class MetodoSimpson1_3_Ejercicio1 {
    
    // Método para calcular la aproximación de la integral definida utilizando la Regla de Simpson de 1/3
    public static double reglaSimpson(double a, double b, int n, Function<Double, Double> f) {
        double h = (b - a) / n; // Calcula el ancho de cada subintervalo
        double suma = f.apply(a) + f.apply(b); // Suma los valores en los extremos

        // Suma los valores en los puntos internos, alternando entre multiplicaciones por 4 y 2
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 2 == 0) {
                suma += 2 * f.apply(x);
            } else {
                suma += 4 * f.apply(x);
            }
        }

        return (h / 3) * suma;
    }

    public static void main(String[] args) {
        // Definir los límites de integración y el número de subintervalos
        double a = 0; // Límite inferior de integración
        double b = 0.8; // Límite superior de integración
        int n = 2; // Número de subintervalos

        // Definir la función f(x) como una expresión lambda
        Function<Double, Double> funcion = x -> 0.2 + (25*x) - (200*Math.pow(x, 2)) + (675*Math.pow(x, 3)) - (900*Math.pow(x, 4)) + (400*Math.pow(x, 5));

        // Calcular la integral definida utilizando la Regla de Simpson de 1/3
        double resultado = reglaSimpson(a, b, n, funcion);
        System.out.println("El resultado de la integral definida es: " + resultado);
    }
    
}
