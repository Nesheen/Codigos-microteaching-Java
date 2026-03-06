import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] notas = new double[3];
        Scanner sc = new Scanner(System.in);

        // pedir las 3 notas
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ":");
            notas[i] = Double.parseDouble(sc.nextLine());
        }

        // mostrar resultados
        System.out.println("Promedio: " + calcularPromedio(notas));
        System.out.println("Mayor: " + calcularMaximo(notas));

        sc.close();
    }

    // calcular promedio
    public static double calcularPromedio(double[] lista) {
        double suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        return suma / lista.length;
    }

    // calcular máximo
    public static double calcularMaximo(double[] lista) {
        double mayor = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
        }
        return mayor;
    }
}