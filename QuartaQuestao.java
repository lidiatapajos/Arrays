
import java.util.Scanner;

public class QuartaQuestao {

    public static void main(String[] args) {
        try (Scanner tec = new Scanner(System.in)) {
            double[] notas = new double[4];
            double soma = 0;

            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                notas[i] = tec.nextDouble();
                soma += notas[i];
            }

            double media = soma / notas.length;
            System.out.println("A média das notas é: " + media);
        }
    }
}
