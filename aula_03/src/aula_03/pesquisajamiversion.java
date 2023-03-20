package aula_03;

import java.util.Scanner;

public class pesquisajamiversion {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade;
		int sexo;
		int categoria;
		int mMaiores40mobile = 0;
		int fMenores30Fullstack = 0;
		int totalFrontend = 0;
		int totalbackEnd = 0;
		int contador = 0;

		char continua = 'S';

		while (continua == 'S') {

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.println(" Digite o sexo (1-M/ 2-f/ 3-Outros:) ");
			sexo = leia.nextInt();

			System.out.println("Digite a categoria(1-Back/2-Front/3-Mbl/4-FullS): ");
			categoria = leia.nextInt();

			while (sexo >= 1 && sexo <= 3) {

				if (categoria == 1) {
					totalbackEnd++;
				}
				if (sexo == 2 && categoria == 2) {
					totalFrontend++;
				}
				if (sexo == 1 && categoria == 3 && idade > 40) {
					mMaiores40mobile++;
				}

				if (sexo == 2 && categoria == 4 && idade < 30) {
					fMenores30Fullstack++;

				}
				
				System.out.println("Deseja continuar? ");
				continua = leia.next().toUpperCase().charAt(0);
				contador++;
				
				System.out.println("Fichas preenchidas: " + contador);
				System.out.println("Total de pessoas da categoria frontend: " + totalFrontend);
				System.out.println("Total de pessoas da categoria backtend: " + totalbackEnd);
				System.out.println("Total de homens desenvolvedores mobile maiores de 40 anos:" + mMaiores40mobile);
				System.out.println("Total de mulheres desenvolvedoras Full Stack menores de 30 anos: " + fMenores30Fullstack);


			}

		}
		
	
	}
}
