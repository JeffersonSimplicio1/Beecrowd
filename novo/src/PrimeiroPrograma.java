package Main;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int count = 0;
		int max = scanner.nextInt();
		
		
		while(count<=max) {
			System.out.println("While testa primeiro e executa depois " + count);
			count++;
		}
		System.out.println("Aprendi!!");
		
		//Do-while
		
		int dodo = scanner.nextInt();
		
		do {
			System.out.println("Do - While, Execulta primeiro e testa depois!!" + count);
			count++;
			
		} while(count<=dodo);
	}

}
