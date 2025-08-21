
import java.util.Scanner;

public class SegundaQuestao {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = tec.nextInt();
        }

        System.out.println("Números pares digitados:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        tec.close();
    }
}
