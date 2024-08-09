import java.util.Locale;
import java.util.Scanner;

public class area {
    public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);
            Locale.setDefault (Locale.US);

                double A = scanner.nextFloat();
                double B = scanner.nextFloat();
                double C = scanner.nextFloat();
                double triangulo = (A*C)/2;
                double circulo = 3.14159 * Math.pow(C, 2);
                double trapezio = ((A+B) * C)/2;
                double quadrado = Math.pow(B, 2);
                double retangulo = A*B;

            System.out.printf("TRIANGULO: %.3f%n", triangulo );
            System.out.printf("CIRCULO: %.3f%n", circulo);
            System.out.printf("TRAPEZIO: %.3f%n", trapezio);
            System.out.printf("QUADRADO: %.3f%n", quadrado);
            System.out.printf("RETANGULO: %.3f%n", retangulo);


    }
}
