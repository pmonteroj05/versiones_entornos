import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner numeros = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Introduce una cantidad de números: ");
        int cant  = numeros.nextInt();

        int n [] = new int [cant];
        int suma = 0;

        for (int i = 0; i < cant; i++) {
            System.out.print("Introduce un número: ");
            n[i] = numeros.nextInt();
            suma += n[i];
        }

        double media = (double) suma / 5;

        System.out.print("Números introducidos: ");
        for (int i = 0; i < cant; i++)
            System.out.print(n[i] + " ");

        System.out.println();

        int mayor = n[0];
        int menor = n[0];
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < 5; i++) {
            if (n[i] > mayor)
                mayor = n[i];
            if (n[i] < menor)
                menor = n[i];
            if (n[i] > 0)
                pos++;
            else if (n[i] < 0)
                neg++;
        }

        System.out.printf("Suma: %d  |  Media: %f%nMayor: %d  |  Menor: %d%nCantidad de positivos: %d  | Cantidad de negativos: %d", suma, media, mayor, menor, pos, neg);

        Arrays.sort(n);

        System.out.println("Números ordenados de menor a mayor: ");
        for(int i : n){
            System.out.println(i);
        }
    }
}
