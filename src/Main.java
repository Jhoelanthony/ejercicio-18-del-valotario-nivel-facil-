import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de números: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Ingresa los números:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int total = 0;
        System.out.println("Búmeranes encontrados:");

        for (int i = 0; i < arr.length - 2; i++) {
            int primero = arr[i];
            int medio = arr[i + 1];
            int ultimo = arr[i + 2];

            if (primero == ultimo && primero != medio) {
                total++;
                System.out.println("[" + primero + ", " + medio + ", " + ultimo + "]");
            }
        }

        System.out.println("Total: " + total);
        sc.close();
    }
}
