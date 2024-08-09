        import java.util.Scanner;
        import java. util.Locale;
public class main1011 {
    

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        double pi = 3.14159;
        double r = scanner.nextDouble();
        double volume = (4.0 / 3) * pi * Math.pow(r, 3.0);

        System.out.printf("VOLUME = %.3f%n", volume);


    }
}