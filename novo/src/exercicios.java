package Main;

import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		double tempo = scanner.nextDouble();
		double velocidade = scanner.nextDouble();
		double distancia = velocidade * tempo;
		double gasto = distancia / 12;
		
		
		System.out.printf("%.3f%n",gasto);

	}

}
