import java.util.Scanner;

public class usuarioSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        System.out.println("Nome do Usuario: ");
        String usuario = scanner.next();
        System.out.println("Senha: ");
        String senha = scanner.next();

    while(cont <= 3){
        if (cont == 2) { System.out.println("Excesso de tentativas!");
        break;
        }
       
        if (usuario.equals(senha)) {System.out.println("Senha invalida");
        System.out.println("Senha: ");
        senha = scanner.next();
        cont++;} 
            
        else { System.out.println("Senha valida!!");
                System.out.println("Entrando no App..."); 
            break;
            
        }
        
        
    }

            System.out.println("Fim do Programa!");
        }
     }
    
     
    

    
