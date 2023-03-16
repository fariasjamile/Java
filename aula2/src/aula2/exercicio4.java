package aula2;

import java.util.Scanner;

public class exercicio4{

			public static void main(String[] args) {

				Scanner leia = new Scanner(System.in);

				int codigoProduto, quantidade;
				float v1 = 10, v2 = 15, v3 = 18, v4 = 12, v5 = 8, v6 = 6, valorTotal;
				
       
				System.out.println("Codigo do Produto \t\t Produto \tPreço Unitário");
				System.out.println("\t1\t\t\t Cachorro Quente \t$10,00");
				System.out.println("\t2\t\t\t X-Salada \t\t$15,00");
				System.out.println("\t3\t\t\t X-Bacon \t\t$18,00");
				System.out.println("\t4\t\t\t Bauru \t\t\t$12,00");
				System.out.println("\t5\t\t\t Refrigerente \t\t$8,00");
				System.out.println("\t5\t\t\t Suco de Laranja \t$13,00");
				
				System.out.println("\nDigite o código do produto: ");
				codigoProduto = leia.nextInt();
				System.out.println("\nDigite a Quantidade: ");
				quantidade = leia.nextInt();
				
				switch(codigoProduto) {
	            case 1:
	                System.out.println("Produto Cachorro Quente: \nValor Total:R$ " + v1* quantidade);
	            break;
	            case 2:
	                System.out.println("Produto X-Salada: \nValor Total:R$ " + v2* quantidade);
	            break;
	            case 3:
	                System.out.println("Produto X-Bacon: \nValor Total:R$ " + v3* quantidade);
	            break;
	            case 4:
	                System.out.println("Produto Bauru: \nValor Total:R$ " + v4* quantidade);
	            break;
	            case 5:
	                System.out.println("Produto Refrigente : \nValor Total:R$ " + v5* quantidade);
	            break;
	            case 6:
	                System.out.println("Produto Suco de laranja : \nValor Total:R$ " + v6* quantidade);
	            break;

	    }
	        leia.close();
	}

				
				
			}
			