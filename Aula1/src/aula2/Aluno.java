package aula2;

public class Aluno {
	String nome;
	String ra;
	String cpf;
	
	double nota1, nota2, nota3;

	public double calcularMedia ()	
	{
		return (nota1 + nota2 + nota3)/3;
	}
	
	public void imprimirMedia()	
	{
		System.out.println("A média é " + this.calcularMedia());
	}
}
