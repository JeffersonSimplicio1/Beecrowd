import java.util.Locale;
import java.util.Scanner;

public class distancia {

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.printf("%.4f%n",distancia);


    }

}
        
    


