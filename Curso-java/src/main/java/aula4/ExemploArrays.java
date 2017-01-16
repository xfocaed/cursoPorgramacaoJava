package aula4;

import java.util.Scanner;

public class ExemploArrays {
	
	public static void main(String[] args) {
		
		double[] notas = new double[3];
		
		Scanner leitor = new Scanner(System.in);
		
		/* System.out.println("Primeira Nota:");
		notas[0] = leitor.nextDouble();
		
		System.out.println("Segunda Nota:");
		notas[1] = leitor.nextDouble();

		System.out.println("Terceira Nota:");
		notas[2] = leitor.nextDouble();
		*/
		
		double soma=0;
		
		for(int i=0; i < notas.length; i++) {
			System.out.println(" Nota " + i + " :");
			notas[i] = leitor.nextDouble();
		}
		
		for( double nota : notas) {
		   	soma += nota;
		}
		
		double media = soma/notas.length;

		System.out.println(media);
		leitor.close();

	}
	

}
