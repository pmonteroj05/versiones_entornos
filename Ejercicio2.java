import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    static Scanner numeros = new Scanner(System.in);
    public static void main(String[] args){
        int edades[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce una edad: ");
            edades[i] = numeros.nextInt();
        }

        System.out.print("Edades introducidas: ");
        for (int i = 0; i < 5; i++)
            System.out.print(edades[i] + " ");

        System.out.println();

        int minima = edades[0];
        int maxima = edades[0];
        int mayores = 0;
        int menores = 0;

        for (int i = 0; i < 5; i++) {
            if (edades[i] < minima)
                minima = edades[i];
            if (edades[i] > maxima)
                maxima = edades[i];
            if (edades[i] >= 18)
                mayores++;
            else
                menores++;
        }

        System.out.printf("Edad mínima: %d  |  Edad máxima: %d%nMayores: %d  |  Menores: %d%n", minima, maxima, mayores, menores);

        int suma = 0;
        for (int i = 0; i < 5; i++)
            suma += edades[i];

        System.out.println("Media de edades: " + (suma/5));

        Arrays.sort(edades);

        System.out.println("Edades ordenados de menor a mayor: ");
        for(int i : edades)
            System.out.println(i);
    }
}
