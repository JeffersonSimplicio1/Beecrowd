import java.util.Locale;
import java.util.Scanner;

public class main1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo = scanner.nextInt();
        int numero = scanner.nextInt();
        double valor = scanner.nextDouble();
        double total1 = numero * valor;

        int codigo2 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();
        double total2 = numero2 * valor2;

        double valorGeral = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$%.2f%n", valorGeral);


    }
}
