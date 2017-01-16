package aula1;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	
	public static void main(String[] args) {
		
		int numero = new Random().nextInt(10) + 1;
		
		System.out.println("Entre com um número entre 0 e 10");
		System.out.println("Tente adivinhar qual é o numero...");
		Scanner leitor = new Scanner(System.in);
		int numInput  = leitor.nextInt();
		int i=1;
		
		while (numInput != numero)
		{  
			System.out.println("O numero nao é esse! Tente Novamente!!!");
			i++;
			numInput  = leitor.nextInt();

		}
		
		System.out.println("Você acertou em " + i + " tentativas!");
		System.out.println("O numero é " + numero);

		leitor.close();
	}

}
