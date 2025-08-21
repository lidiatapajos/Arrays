
import java.util.Scanner;

public class TerceiraQuestao {

    public static void main(String[] args) {
        try (Scanner tec = new Scanner(System.in)) {
            int[] idades = new int[10];

            for (int i = 0; i < idades.length; i++) {
                System.out.print("Digite a idade " + (i + 1) + ": ");
                idades[i] = tec.nextInt();
            }

            System.out.println("Idades maiores que 18:");
            for (int idade : idades) {
                if (idade > 18) {
                    System.out.println(idade);
                }
            }
        }
    }
}
