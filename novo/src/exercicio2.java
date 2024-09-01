package Main;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
//		Faça um programa que leia um nome de usuário e a sua senha e não
//		aceite a senha igual ao nome do usuário, mostrando uma mensagem
//		de erro e voltando a pedir as informações.
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome de usuario: ");
		String usuario = scanner.next();
		boolean senhaValida = false;
		
		do {
			System.out.println("Digite a senha: ");
			String senha = scanner.next();
			
			if(usuario.equalsIgnoreCase(senha)) {
				System.out.println("Senha invalida, digite novamente!");
				senhaValida = false;
				
			} else {
				System.out.println("Entrando...");
				senhaValida = true;
			}
		} while(!senhaValida);
	
		
		
		

	}

}
