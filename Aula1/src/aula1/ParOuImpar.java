package aula1;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com um numero:");
		int resultado = leitor.nextInt();
		
		String msg = (resultado%2 == 0) ? "Numero é par!"
				           : "Numero é impar!";
		System.out.println(msg);
		
	}
}
