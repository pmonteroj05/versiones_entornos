import java.util.Scanner;

public class Ejercicio1 {

    static Scanner numeros = new Scanner(System.in);

    public static void main(String[] args){
        int n [] = new int [5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            n[i] = numeros.nextInt();
            suma += n[i];
        }

        double media = (double) suma / 5;

        System.out.print("Números introducidos: ");
        for (int i = 0; i < 5; i++)
            System.out.print(n[i] + " ");

        System.out.printf("Suma: %d  |  Media: %f", suma, media);
    }
}
