package aula_04.exercicios;

import java.util.Scanner;

public class Exercicio4While {

	public static void main(String[] args) {
		
	        Scanner scan = new Scanner(System.in);
	        
	        // Contadores
	        int backend = 0;
	        int mulherFrontend = 0;
	        int homemMobile = 0;
	        int naoBinarioFullstack = 0;
	        int totalPessoas = 0;
	        int somaIdades = 0;
	        
	        // Variável para controle de continuidade
	        String continuar = "S";
	        
	        // Laço para coletar dados dos colaboradores
	        while (continuar.equalsIgnoreCase("S")) {
	            // Coleta das informações do colaborador
	            System.out.print("Idade: ");
	            int idade = scan.nextInt();
	            System.out.print("Identidade de Gênero (1 – Mulher Cis, 2 – Homem Cis, 3 – Não Binário, 4 – Mulher Trans, 5 – Homem Trans, 6 – Outros): ");
	            int genero = scan.nextInt();
	            System.out.print("Pessoa Desenvolvedora (1 – Backend, 2 – Frontend, 3 – Mobile, 4 – FullStack): ");
	            int desenvolvedor = scan.nextInt();
	            
	            // Atualiza os contadores
	            totalPessoas++;
	            somaIdades += idade;
	            
	            // Contagem de desenvolvedores Backend
	            if (desenvolvedor == 1) {
	                backend++;
	            }
	            
	            // Contagem de Mulheres Cis e Trans desenvolvedoras Frontend
	            if ((genero == 1 || genero == 4) && desenvolvedor == 2) {
	                mulherFrontend++;
	            }
	            
	            // Contagem de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
	            if ((genero == 2 || genero == 5) && desenvolvedor == 3 && idade > 40) {
	                homemMobile++;
	            }
	            
	            // Contagem de Não Binários desenvolvedores FullStack menores de 30 anos
	            if (genero == 3 && desenvolvedor == 4 && idade < 30) {
	                naoBinarioFullstack++;
	            }
	            
	            // Pergunta se o usuário deseja continuar
	            System.out.print("Deseja continuar (S/N): ");
	            continuar = scan.next();
	        }
	        
	        // Exibe os resultados
	        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + backend);
	        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherFrontend);
	        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemMobile);
	        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinarioFullstack);
	        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
	        
	        // Cálculo e exibição da média de idade
	        double mediaIdade = (double) somaIdades / totalPessoas;
	        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n", mediaIdade);
	        
		

		scan.close();
	}

}
