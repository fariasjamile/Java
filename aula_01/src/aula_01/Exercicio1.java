
		package aula_01;

		import java.util.Scanner;

		public class Exercicio1
		{
			
			public static void main (String[] args) {
				
				Scanner leia = new Scanner (System.in);
				
				float salario, abono;
				String nome;
				
				System.out.println("Digite seu Nome");
				nome = leia.nextLine();
			    
			    System.out.println("Digite o salário: \nR$ ");
			    salario = leia.nextFloat();
			    
			    System.out.println("Digite o novo salário: \n$ ");
			    abono = leia.nextFloat();
			    
			    System.out.println("Funcionario: " + nome);
			    System.out.println("Novo salário: " + (salario + abono));
			    
			    leia.close();
			}

		}