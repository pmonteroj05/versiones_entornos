public class Ejercicio3 {

    public static void main(String[] args){
        int numeros[] = new int[10];

        for (int i = 0; i < 10; i++)
            numeros[i] = (int)(Math.random() * 100) + 1;

        System.out.print("Números generados: ");
        for (int i = 0; i < 10; i++)
            System.out.print(numeros[i] + " ");

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        System.out.print("\nArray ordenado de mayor a menor: ");
        for (int i = 0; i < 10; i++)
            System.out.print(numeros[i] + " ");

        System.out.print("\nNúmeros pares del array: ");
        for (int i = 0; i < 10; i++)
            if (numeros[i] % 2 == 0)
                System.out.print(numeros[i] + " ");

        System.out.println();
        int suma = 0;
        for(int i : numeros)
            suma += i;

        System.out.println("Media de los números generados: " + (suma / 10));

        //Mostrar los números que estén por encima de la media

        System.out.println("Números por encima de la media: ");

        int media = suma / 10;
        for(int i : numeros)
            if(i > media)
                System.out.println(i);
    }
}
