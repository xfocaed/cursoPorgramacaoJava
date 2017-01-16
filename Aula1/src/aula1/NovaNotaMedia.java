package aula1;

import java.util.Scanner;

public class NovaNotaMedia {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Entre com o nome do aluno:");
		String nome = leitor.nextLine();

		System.out.println("Digite a nota1:");
		float nota1 = leitor.nextFloat();

		System.out.println("Digite a nota2:");
		float nota2 = leitor.nextFloat();

		System.out.println("Digite a nota3:");
		float nota3 = leitor.nextFloat();

		float media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media >= 4) {
			System.out.println("Exame!");
		}

		else {
			System.out.println("Reprovado!");
		}

		System.out.println("Aluno " + nome + " teve media " + media);

		leitor.close();
	}
}
