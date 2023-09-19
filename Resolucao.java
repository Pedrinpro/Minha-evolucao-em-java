import java.awt.Toolkit;


public class Resolucao{
    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        int altura = (int) resolucao.getScreenSize().getWidth();
        int largura = (int) resolucao.getScreenSize().getHeight();
        System.out.print("A Altura é: " + altura);
        System.out.print("E a largura é: " + largura);
    }
}