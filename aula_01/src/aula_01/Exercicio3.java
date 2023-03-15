package aula_01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

        float salariobruto, adicionalnoturno, horasextras, descontos;
        String nome;

        System.out.println("Digite o nome e sobrenome do Aluno: ");
        nome = leia.nextLine();

        System.out.print("Digite a primeira nota: ");
        salariobruto= leia.nextFloat();

        System.out.print("Digite a segunda nota: ");
        adicionalnoturno = leia.nextFloat();

        System.out.print("Digite a terceira nota: ");
        horasextras = leia.nextFloat();

        System.out.print("Digite a quarta nota: ");
        descontos = leia.nextFloat();


        System.out.println("Salarios líquido: " + nome);
        System.out.println("Média Final: " + (salariobruto + adicionalnoturno + (horasextras * 5)- descontos ));

        leia.close();

	}

}
