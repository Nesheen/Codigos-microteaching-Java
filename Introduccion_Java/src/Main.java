import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad=0;

        System.out.println("Ingrese su edad: ");

        if(scanner.hasNextInt()){
           edad = Integer.parseInt(scanner.nextLine());
        }else{
            System.out.println("Ingrese la edad en forma de entero");
            return;
        }
        if (edad >=18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
    }
}