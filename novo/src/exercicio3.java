package Main;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
//		Faça um programa que leia e valide as seguintes informações:
//			a. Nome: maior que 3 caracteres;
//			b. Idade: entre 0 e 150;
//			c. Salário: maior que zero;
//			d. Sexo: 'f' ou 'm';
//			e. Estado Civil: 's', 'c', 'v', 'd';

		Scanner scanner = new Scanner(System.in);

		boolean infoValido = false;

		do {
			System.out.println("Digite o seu nome: ");
			String nome = scanner.next();
			if (nome.length() > 3) {
				infoValido = true;
			} else {
				System.out.println("Nome invalido, digite novamente: ");
			}

		} while (!infoValido);
		
		infoValido = false;
		
		do {
			System.out.println("Digite a sua idade: ");
			int idade = scanner.nextInt();
			if (idade > 0 && idade < 150) {
				infoValido = true;
			} else {
				System.out.println("idade invalida, digite novamente: ");
			}

		} while (!infoValido);
		
		infoValido = false;
		
		do {
			System.out.println("Digite o seu Salario: ");
			double salario = scanner.nextDouble();
			if (salario >0) {
				infoValido = true;
			} else {
				System.out.println("Salario invalido, digite novamente: ");
			}

		} while (!infoValido);
		
		infoValido = false;
		
		do {
			System.out.println("Digite o seu sexo: ");
			String sexo = scanner.next();
			if (sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("masculino")) {
				infoValido = true;
			} else {
				System.out.println("Sexo invalido, digite novamente: ");
			}

		} while (!infoValido);
		
		infoValido = false;
		
		do {
			System.out.println("Digite o seu estado civil: ");
			String estadoCivil = scanner.next();
			if (estadoCivil.equalsIgnoreCase("casado")||estadoCivil.equalsIgnoreCase("solteiro") || estadoCivil.equalsIgnoreCase("divorciado")||estadoCivil.equalsIgnoreCase("viuvo")) {
				infoValido = true;
			} else {
				System.out.println("Estado Civil invalido, digite novamente: ");
			}

		} while (!infoValido);
		
		System.out.println("Programa Concluido!");
		
		
		
	}

}
