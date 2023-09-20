import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tutorial: Escreva a senha 1234: ");
        int fase1 = scan.nextInt();

        if (fase1 == 1234) {
            System.out.println("Correto!!!");
            aguardar(3000); // Aguarda 3 segundos

            // Limpa a tela
            limparTela();

            // Chame a próxima fase aqui
            fase2(scan);
        } else {
            System.out.println("meu deus haha!!!");
            System.exit(0);
        }

        scan.close();
    }

    public static void fase2(Scanner scan) {
        // Limpa a tela
        limparTela();

        System.out.println("Fase 2: Escreva o valor dessa equacao: 2x + 10 = 20");
        int fase2 = scan.nextInt();
        if (fase2 == 5) {
            System.out.println("Correto!!!");
            aguardar(3000); // Aguarda 3 segundos

            // Limpa a tela
            limparTela();

            // Chame a próxima fase aqui
            fase3(scan);
        } else {
            System.out.println("Errado!!!");
            System.exit(0);
        }
    }

    public static void fase3(Scanner scan) {
        // Limpa a tela
        limparTela();

        System.out.println("Fase 3: Descriptografe: são numeros: aeg");
        int fase3 = scan.nextInt();
        if (fase3 == 157) {
            System.out.println("Correto!!!");
            aguardar(3000); // Aguarda 3 segundos

            // Limpa a tela
            limparTela();

            // Chame a próxima fase aqui
            fase4(scan);
        } else {
            System.out.println("Errado!!!");
            System.exit(0);
        }
    }

    public static void fase4(Scanner scan) {
        // Limpa a tela
        limparTela();
    
        System.out.println("Fase 4: Qual o valor de pi? (2 primeiras casas incluindo o 3 e substitua a ',' por '.'): ");
        double fase4 = scan.nextDouble();
        
        // Verifica se a diferença entre o valor inserido e o valor de pi é menor que 0.01
        if (Math.abs(fase4 - 3.14) < 0.01) {
            System.out.println("Correto!!!");
            aguardar(3000); // Aguarda 3 segundos
    
            // Limpa a tela
            limparTela();
    
            // Chame a próxima fase aqui (ou implemente a fase 5)
        } else {
            System.out.println("Errado!!!");
            System.exit(0);
        }
    }

    public static void Fase5(Scanner scan) {
        System.out.println("810/2");
        int fase6 = scan.nextInt();
        if (fase6 == 405) {
            System.out.println("Correto!!!");
            aguardar(3000);
            limparTela();
        } else {
            System.out.println("Quase!!!");
            System.exit(0);
        }
    }

    public static void aguardar(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void limparTela() {
        // Imprime várias linhas em branco para "limpar" a tela
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
