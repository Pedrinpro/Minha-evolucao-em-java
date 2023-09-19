import java.util.Scanner;

public class entrada{ // classe pública entrada
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // criar um scanner
        System.out.print("Insira seu nome: "); // pede para o usuário inrerir o nome
        String entrada = scanner.nextLine(); // faz o scanner ir para a próxima linha
        System.out.println("Olá, "+ entrada); // mostra "olá, {nome da pessoa}"
        
        if (entrada.isEmpty()){ 
            System.out.println("ERRO, nome não identificado!!!");
        }
        else{ 
            System.exit(0);
        }
            
    }
}  /*Se a entrada estiver vazia
        aparecerá "erro" 
    se não 
        fechará o programa*/