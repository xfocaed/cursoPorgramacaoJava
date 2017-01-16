package aula2;

public class Tela {
	int altura = 600;
	int largura = 800;
	
	
	public Tela(int alt, int larg)
	{
		this.altura = alt;
		this.largura = larg;
	}
	
	public void ligar()
	{
		System.out.println("Ligando tela...");
	}
	
	public void desligar()
	{
		System.out.println("Desligando tela...");
	}
}
