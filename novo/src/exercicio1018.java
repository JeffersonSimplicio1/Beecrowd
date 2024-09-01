package Main;

import java.util.Scanner;

public class exercicio1018 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor = scanner.nextInt();
		int cont100 = 0;
		int cont50 = 0;
		int cont20 = 0;
		int cont10 = 0;
		int cont5 = 0;
		int cont2 = 0;
		int cont1 = 0;
		int sobra = 0;
		
			System.out.println(valor);
			cont100 = valor/100;
			sobra = valor%100;
			System.out.println(cont100 + " nota(s) de R$ 100,00");
		
			cont50 = sobra/50;
			sobra = sobra%50;
			System.out.println(cont50 + " nota(s) de R$ 50,00");
			
			cont20 = sobra/20;
			sobra = sobra%20;
			System.out.println(cont20 + " nota(s) de R$ 20,00");
			
			cont10 = sobra/10;
			sobra = sobra%10;
			System.out.println(cont10 + " nota(s) de R$ 10,00");
			
			cont5 = sobra/5;
			sobra = sobra%5;
			System.out.println( cont5 + " nota(s) de R$ 5,00");
			
			cont2 = sobra/2;
			sobra = sobra%2;
			System.out.println(cont2 + " nota(s) de R$ 2,00");
			
			
			System.out.println(sobra + " nota(s) de R$ 1,00");
		
		
		
		
	}

}
