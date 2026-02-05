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
    }

}
