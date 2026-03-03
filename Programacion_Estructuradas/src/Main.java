import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //pedir las 3 notas
        for (int i=0;i <3; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ":");
            double nota = Double.parseDouble(scanner.nextLine());
            notas.add(nota);
        }
        //mostrar resultados
        System.out.println("Promedio:"+calcularPromedio(notas));
        System.out.println("Mayor:"+ calcularMaximo(notas));

    }

    //calcular promedio
    public static double calcularPromedio(ArrayList<Double> lista) {
    double suma=0;
    for (int i=0;i<lista.size();i++) {
        suma +=lista.get(i);
    }
    return suma/lista.size();
    }
    public static double calcularMaximo(ArrayList<Double> lista) {
    double mayor=0;
    for (int i=1;i<lista.size();i++) {
        if(lista.get(i)>mayor){
            mayor=lista.get(i);
        }
    }
    return mayor;
    }


}