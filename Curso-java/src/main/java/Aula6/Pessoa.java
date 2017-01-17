package Aula6;

public class Pessoa {

	private String nome;

	public Pessoa(String n)
	{
		setNome(n);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString()
	{
		return nome;
	}
}
