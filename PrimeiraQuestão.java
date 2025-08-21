
import java.util.Scanner;

public class PrimeiraQuestão {

    public static void main(String[] args) {

        try (Scanner tec = new Scanner(System.in)) {
            double[] notas = new double[10];
            double maior = 0;

            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
                notas[i] = tec.nextDouble();

                if (notas[i] > maior) {
                    maior = notas[i];
                }
            }

            System.out.println("A maior nota é: " + maior);
        }
    }
}
