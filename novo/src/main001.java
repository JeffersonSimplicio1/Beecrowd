package Main;

import java.util.Locale;
import java.util.Scanner;

public class main001 {

	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
				int numero = scanner.nextInt();
				int horas = scanner.nextInt();
				double valor = scanner.nextDouble();
				double salario = horas * valor;
				
				System.out.println("NUMBER = " + numero);
				System.out.printf("SALARY = U$ %.2f%n", salario);
			
					
	}

}
