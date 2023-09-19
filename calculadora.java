import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o 1° número: ");
        int n1 = scan.nextInt();
        System.out.println("Insira o 2° número: ");
        int n2 = scan.nextInt();
        System.out.println("Insira o Sinal [+|-|/|*|%|^]: ");
        scan.nextLine(); // Consuma a nova linha pendente após a entrada dos números.
        String operacao = scan.nextLine(); // Leitura da operação.

        int resultado = 0;

        // Realize a operação com base no sinal inserido.
        switch (operacao) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "%":
                resultado = n1 % n2;
                break;
            case "^":
                resultado = (int) Math.pow(n1, n2);
                break;
            default:
                System.out.println("Operação inválida.");
                return; // Saia do programa se a operação for inválida.
        }

        System.out.println("Resultado: " + resultado);
        scan.close();
    }
}
