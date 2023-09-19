import java.util.Locale;

public class idioma{
    public static void main(String[] args) {
        Locale sistemaLocale = Locale.getDefault();
        String idiomesystem = sistemaLocale.getLanguage();
        System.out.print("O idioma do sistema é: " + idiomesystem);
    }
}