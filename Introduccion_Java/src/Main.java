import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura de Nombre (String) - no requiere parseo
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Lectura de Edad (int) - parseo con Integer.parseInt()
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        // Lectura de Sueldo (double) - parseo con Double.parseDouble()
        System.out.print("Ingrese su sueldo: ");
        double sueldo = Double.parseDouble(sc.nextLine());

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Sueldo: $" + sueldo);

        sc.close();
    }
}