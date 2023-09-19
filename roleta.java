import java.util.Random;
import java.util.Scanner;

public class roleta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número de 1-6: ");
        int numeroEscolhido = scan.nextInt(); // Leia o número inserido pelo usuário

        if (numeroEscolhido < 1 || numeroEscolhido > 6) {
            System.out.println("ERRO: Número fora do intervalo permitido.");
        } else {
            Random random = new Random();
            int numeroSorteado = random.nextInt(6) + 1; // Gera um número aleatório de 1 a 6

            if (numeroEscolhido == numeroSorteado) {
                System.out.printf("Você perdeu! O número sorteado foi %d%n", numeroSorteado);
            } else {
                System.out.printf("Você ganhou! O número sorteado foi %d%n", numeroSorteado);
            }
        }
        scan.close();
    }
}
