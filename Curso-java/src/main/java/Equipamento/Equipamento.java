package Equipamento;

public class Equipamento {

	private double preco;
	private String fabricante;
	
	
	public Equipamento(double price, String fabricante)
	{
		this.setPreco(price);
		this.setFabricante(fabricante);
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	public double calcularPrecoFinal()
	{
		return preco;
	}
	
}
