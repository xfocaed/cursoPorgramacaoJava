package aula4;

import java.util.Scanner;

public class TestaAluno {

	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com o número de alunos:");
		int numAlunos = leitor.nextInt();
		leitor.nextLine();
		
		Aluno[] alunos = new Aluno[numAlunos];
		
		for(int i=0; i < numAlunos; i++)
		{
			System.out.println("Entre com o nome do aluno:");
            String nome = leitor.nextLine();
            Aluno aluno = new Aluno(nome);
            alunos[i] = aluno;
		}
		
		for(int i=0; i < numAlunos; i++)
			for(int j=0; j < 3; j++)
			{
			 System.out.println("Entre com a nota " + (j+1) + " do" + alunos[i].getNome());
		     double nota = leitor.nextDouble();
             alunos[i].notas[j] = nota;
			}
		
       for (Aluno aluno : alunos) {
    	   System.out.print("Aluno: " + aluno.getNome());
    	   for(int j=0; j < 3; j++)
    	   System.out.print("Aluno: " + aluno.getNome());

       }
	}
}
