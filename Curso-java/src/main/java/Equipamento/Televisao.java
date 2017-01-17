package Equipamento;

public class Televisao extends Eletronico{
private int polegadas;

	Televisao(double price, String fabricante, int inches){
		super(price,fabricante);
		setPolegadas(inches);
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	
	
}
