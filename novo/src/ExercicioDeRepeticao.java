package Main;

import java.util.Scanner;

public class ExercicioDeRepeticao {

	public static void main(String[] args) {
		
//		//Faça um programa que peça uma nota, entre zero e dez. Mostre uma
//		mensagem caso o valor seja inválido e continue pedindo até que o
//		usuário informe um valor válido.
		
		Scanner scanner = new Scanner(System.in);
		boolean notaValida = false;
		do {

			System.out.println("Digite a nota: ");
			double nota = scanner.nextDouble();
			
			if(nota>=0 && nota<=10) {
				System.out.println("Você digitou a nota " + nota);
				notaValida = true;
				
				
			} else {
				System.out.println("Nota invalida, digite novamente. ");
			}
		} while(!notaValida);
		
		
		
		
	}

}
