package aula1;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {

		System.out.println("Entre com o dia da semana:");
		System.out.println("1 - Segunda");
		System.out.println("2 - Terça");
		System.out.println("3 - Quarta");
		System.out.println("4 - Quinta");
		System.out.println("5 - Sexta");
		System.out.println("6 - Sabado");
		System.out.println("7 - Domingo");

		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Terca");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Dia Invalido!!!");
			break;

		}

	}

}
