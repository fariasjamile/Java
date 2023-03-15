package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class aula_01 {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		int numero1, numero2;
		String nome;
		
		System.out.println("Digite o primeiro número");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo nome");
		numero2 = leia.nextInt();
		
		System.out.println("Soma:" + numero1 + numero2);
		System.out.println("Subtração:" + (numero1 - numero2));
		System.out.println("multiplicação:" + (numero1 * numero2));
		System.out.println("Divisão:" + (numero1 / numero2));
		System.out.println("potencia:" + df.format(numero1/numero2));
		System.out.println("Nome: " + nome);
		
		
		}
}
