import java.util.ArrayList; // Importamos la clase ArrayList de java.util

public class ExamenJava {
    // Método principal
    public static void main(String[] args) {
        // 2. Programación modular: Llamamos al método para demostrar su uso
        imprimirSaludo();

        // 3. Métodos: Llamamos a un método que utiliza parámetros
        int resultado = sumar(5, 3);
        System.out.println("La suma de 5 y 3 es: " + resultado);

        // 4. Parámetros: Llamamos a un método que utiliza parámetros y devuelve un valor
        double area = calcularAreaCirculo(5);
        System.out.println("El área de un círculo con radio 5 es: " + area);

        // 5. ArrayList: Creamos y usamos un ArrayList
        ArrayList<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Manzana");
        listaFrutas.add("Banana");
        listaFrutas.add("Naranja");
        System.out.println("Lista de frutas: " + listaFrutas);

        // 6. java.lang.String: Usamos métodos de la clase String
        String mensaje = "Hola Mundo!";
        System.out.println("Longitud del mensaje: " + mensaje.length());
        System.out.println("Mensaje en mayúsculas: " + mensaje.toUpperCase());

        // 1. Recursividad: Calculamos el factorial de un número usando recursividad
        int numero = 5;
        int factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);

        // Smart coding: La siguiente línea es un ejemplo de código inteligente para imprimir una cadena
        System.out.println("¡Examen de Java completado con éxito!");
    }

    // Método que imprime un saludo
    public static void imprimirSaludo() {
        System.out.println("¡Hola! Este es un saludo desde un método.");
    }

    // Método que suma dos números y devuelve el resultado
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método que calcula el área de un círculo dado el radio
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Método recursivo para calcular el factorial de un número
    public static int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
