public class Ejercicio3 {

    public static void main(String[] args){
        int numeros[] = new int[10];

        for (int i = 0; i < 10; i++)
            numeros[i] = (int)(Math.random() * 100) + 1;

        System.out.print("Números generados: ");
        for (int i = 0; i < 10; i++)
            System.out.print(numeros[i] + " ");
    }

}
