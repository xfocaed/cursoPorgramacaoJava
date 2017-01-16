package aula1;

import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade;
		
		System.out.print("Entre com a idade:");
		idade = teclado.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade!");
		}
		
		else { System.out.println("Menor de idade"); }
		
		teclado.close();
	}
}
