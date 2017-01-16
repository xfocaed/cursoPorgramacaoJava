package Televisao;

public class Televisao {
private String marca;
private int dimensao;
	
	public void ligar()
	{
		System.out.println("Ligando...");
		
		ajustarVoltagem();
		ligarTela();
		regularDiodo();
	}
	
	public void desligar()
	{
		System.out.println("Desligando...");
	}
	
	public void aumentarVolume() {
		System.out.println("Aumentando volume...");
	}
	
	public void diminuirVolume() {
		System.out.println("Aumentando volume...");
	}
	
	private void ajustarVoltagem()
	{
		System.out.println("Ajustando a voltagem...");
	}
	
	public void aumentarCanal()
	{
		System.out.println("Aumentando canais...");

	}
	
	public void diminuirCanal()
	{
		System.out.println("Diminuindo canais...");
	
	}
	
	private void ligarTela()
	{
		System.out.println("Ligando tela...");
	}
	
	private void regularDiodo()
	{
		System.out.println("Regulando diodo...");
	}
}
