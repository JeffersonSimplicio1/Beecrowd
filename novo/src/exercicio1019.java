package Main;

import java.util.Scanner;

public class exercicio1019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int total = scanner.nextInt();
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		
		
		horas = (total/60)/60;
		minutos = (total/60)%60;
		segundos = total % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		

	}

}
