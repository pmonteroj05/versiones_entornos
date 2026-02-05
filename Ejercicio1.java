import java.util.Scanner;

public class Ejercicio1 {

    static Scanner numeros = new Scanner(System.in);

    public static void main(String[] args){

        int n [] = new int [5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            n[i] = numeros.nextInt();
        }

        System.out.print("Números introducidos: ");
        for (int i = 0; i < 5; i++)
            System.out.print(n[i] + " ");
    }
}
