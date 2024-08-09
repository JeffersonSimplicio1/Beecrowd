import java.util.Locale;
import java.util.Scanner;

public class main1009 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       Locale.setDefault(Locale.US);


    System.out.println("Primeiro nome do vendedor");
       String nome = scanner.next();
       double salario = scanner.nextDouble();
       double vendas = scanner.nextDouble();
       double total = salario + vendas * 0.15;

    System.out.printf("TOTAL = %.2f%n", total);



    }
}
