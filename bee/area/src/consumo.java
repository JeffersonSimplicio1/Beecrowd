import java.util.Locale;
import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault (Locale.US);

        int x = scanner.nextInt();
        double y = scanner.nextDouble();
        double consumo = x/y;

        System.out.printf(" %.3f km/l %n ", consumo);

    

    
}
}
