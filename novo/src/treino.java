package Main;

public class treino {

	public static void main(String[] args) {
		
		//criando vetores
		double [] temperaturas = new double [20];
			
		
		// adicionando elementos ao vetor
		temperaturas[0] = 30;
		temperaturas[1] = 31;
		temperaturas[2] = 32;
		temperaturas[3] = 33;
		temperaturas[4] = 34;
		temperaturas[5] = 35;
		temperaturas[6] = 36;
		
		//mostrando o valor de um elemento do vetor
		System.out.println("Temperatura 1 = " + temperaturas[0]);
		
		// mostrando o tamanho de dados que o array suporta!
		System.out.println(temperaturas.length);
		
		// local na memoria em que o array esta!
		System.out.println(temperaturas);
		
		// utilizando for para mostrar os valores contidos no array
		for(int i =0;i<temperaturas.length;i++)
		{System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
			
		}
		
		
		
		
			
	}

}
