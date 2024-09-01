package Main;

import java.util.Scanner;

public class exercicio1020 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int total = scanner.nextInt();
		int anos = 0;
		int meses = 0;
		int dias = 0;
		
		anos = total/365;
		meses = (total%365)/30;
		dias = (total%365)%30;
		
		System.out.println(anos + " ano (s)");
		System.out.println(meses + " mes (es)" );
		System.out.println(dias + " dia (s)" );

	}

}
