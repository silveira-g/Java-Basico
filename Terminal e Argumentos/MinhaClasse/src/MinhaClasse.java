import java.util.Locale;
import java.util.Scanner;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Fui executado pelo terminal");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Me chamo " + nome + " e tenho " + altura + "cm");

    }
}
