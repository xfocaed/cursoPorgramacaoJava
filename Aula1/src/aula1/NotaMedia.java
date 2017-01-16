package aula1;

import java.util.Scanner;

public class NotaMedia {
	
	
 public static void main(String[] args) {
	 Scanner leitor = new Scanner(System.in);
	 
	 System.out.println("Entre com o nome do aluno:");
	 String nome = leitor.next();
	 
	 System.out.println("Digite a nota1:");
	 float nota1 = leitor.nextFloat();

	 System.out.println("Digite a nota2:");
	 float nota2 = leitor.nextFloat();

	 System.out.println("Digite a nota3:");
	 float nota3 = leitor.nextFloat();

	 float media = (nota1+nota2+nota3)/3;
	 
	 String msg = (media >= 7.0) ? "Aluno " + nome + " foi aprovado"
			                     : "Aluno " + nome + " foi reprovado";
	 
	 System.out.println(msg + " " + media);
}

	

}
